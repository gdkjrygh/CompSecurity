// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.model.realtime;

import android.content.Context;
import android.util.Log;
import com.thetransitapp.droid.model.ScheduleItem;
import com.thetransitapp.droid.model.viewmodel.MergedItinerary;
import com.thetransitapp.droid.model.viewmodel.NearbyRouteViewModel;
import com.thetransitapp.droid.util.DateFormatter;
import com.thetransitapp.droid.util.LevenshteinDistance;
import java.io.InputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.client.methods.HttpGet;

// Referenced classes of package com.thetransitapp.droid.model.realtime:
//            Prediction, RealTimeFetchTask

public abstract class BaseRealTimeDataSource
    implements Serializable
{
    public static interface RealTimeCallback
    {

        public abstract void didAssignRealTime();
    }


    private static final String LEVENSHTEIN_MATCH_TYPE = "levenshtein";
    private static final String STRICT_MATCH_TYPE = "strict";
    private static final long serialVersionUID = 1L;
    private String cancelledKeyPath;
    private Pattern cancelledRegex;
    private String dateKeyPath;
    private String destinationFilteringKeyPath;
    private String directionMatchType;
    private String predictionsKeyPath;
    private String routeFilteringKeyPath;
    private ArrayList routeTypes;
    private String scheduleBasedKeyPath;
    private Pattern scheduleBasedRegex;
    private String stopFilteringKeyPath;
    private DateFormatter timestampFormat;
    private String timestampKeyPath;
    private String tripURL;
    private String vehicleDestinationKeyPath;
    private String vehicleIdKeyPath;
    private String vehicleLatitudeKeyPath;
    private String vehicleLocationsURL;
    private String vehicleLongitudeKeyPath;
    private DateFormatter vehicleTimestampFormat;
    private String vehicleTimestampKeyPath;
    private String vehiclesKeyPath;
    private String vehiculeURL;

    public BaseRealTimeDataSource()
    {
    }

    public boolean arePredictionsEnabled()
    {
        return tripURL != null;
    }

    public boolean areVehicleLocationsEnabled()
    {
        return vehiculeURL != null;
    }

    protected void assignFilteredPredictionsToItems(ArrayList arraylist, ArrayList arraylist1)
    {
        if (arraylist.size() != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        Object obj1;
        Iterator iterator;
        int i;
        int j;
        long l;
        j = 0;
        obj1 = (Prediction)arraylist.get(0);
        obj = (Prediction)arraylist.get(arraylist.size() - 1);
        obj1 = ((Prediction) (obj1)).getStopTime();
        l = 0x7fffffffffffffffL;
        i = 0;
        iterator = arraylist1.iterator();
_L9:
        if (iterator.hasNext()) goto _L4; else goto _L3
_L3:
        obj1 = arraylist1.subList(0, j);
        i = j + arraylist.size();
_L11:
        if (arraylist1.size() > i && ((Prediction) (obj)).getStopTime().getTime() - ((ScheduleItem)arraylist1.get(i)).getScheduledStopTime().getTime() > 0L) goto _L6; else goto _L5
_L5:
        obj = ((List) (obj1)).iterator();
_L12:
        if (((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_326;
        }
        arraylist1 = arraylist1.subList(j, arraylist1.size() - j);
        i = 0;
        arraylist = arraylist.iterator();
        while (arraylist.hasNext()) 
        {
            obj = (Prediction)arraylist.next();
            if (i < arraylist1.size())
            {
                obj1 = (ScheduleItem)arraylist1.get(i);
                int k;
                long l1;
                long l2;
                if (((Prediction) (obj)).isCancelled())
                {
                    ((ScheduleItem) (obj1)).setCancelled(true);
                } else
                if (!((Prediction) (obj)).isScheduleBased())
                {
                    ((ScheduleItem) (obj1)).setRealStopTime(((Prediction) (obj)).getStopTime());
                    ((ScheduleItem) (obj1)).setRealTimeDirectionId(((Prediction) (obj)).getDirectionTag());
                    ((ScheduleItem) (obj1)).setCancelled(false);
                } else
                {
                    ((ScheduleItem) (obj1)).setCancelled(false);
                }
            }
            i++;
        }
          goto _L1
_L4:
        l2 = Math.abs(((ScheduleItem)iterator.next()).getScheduledStopTime().getTime() - ((Date) (obj1)).getTime());
        if (l2 >= l) goto _L8; else goto _L7
_L7:
        k = i;
        l1 = l2;
_L10:
        i++;
        j = k;
        l = l1;
          goto _L9
_L8:
        k = j;
        l1 = l;
        if (l2 < l) goto _L10; else goto _L3
_L6:
        ((ScheduleItem)arraylist1.get(i)).setCancelled(true);
        i++;
          goto _L11
        obj1 = (ScheduleItem)((Iterator) (obj)).next();
        if (!((ScheduleItem) (obj1)).isPastItem())
        {
            ((ScheduleItem) (obj1)).setCancelled(true);
        }
          goto _L12
    }

    protected void assignPredictionsWithScheduleItems(List list, MergedItinerary mergeditinerary)
    {
        boolean flag = false;
        Iterator iterator = list.iterator();
        do
        {
            do
            {
                if (!iterator.hasNext())
                {
                    if (flag)
                    {
                        assignPredictionsWithTripIDs(list, mergeditinerary);
                    } else
                    {
                        assignRegularPredictions(list, mergeditinerary);
                    }
                    mergeditinerary.resortScheduleItems();
                    return;
                }
            } while (((Prediction)iterator.next()).getTripID() == null);
            flag = true;
        } while (true);
    }

    protected void assignPredictionsWithTripIDs(List list, MergedItinerary mergeditinerary)
    {
        Iterator iterator = list.iterator();
_L3:
        Object obj;
        Iterator iterator1;
        if (!iterator.hasNext())
        {
            return;
        }
        obj = (Prediction)iterator.next();
        list = null;
        iterator1 = mergeditinerary.getOngoingScheduleItems().iterator();
_L5:
        if (iterator1.hasNext()) goto _L2; else goto _L1
_L1:
        if (((Prediction) (obj)).getStopTime() == null)
        {
            ((Prediction) (obj)).setStopTime(new Date(list.getScheduledStopTime().getTime() + (long)(((Prediction) (obj)).getDelay() * 1000D)));
        }
        if (list != null && obj != null)
        {
            ArrayList arraylist = new ArrayList();
            arraylist.add(obj);
            obj = new ArrayList();
            ((ArrayList) (obj)).add(list);
            assignFilteredPredictionsToItems(arraylist, ((ArrayList) (obj)));
        }
          goto _L3
_L2:
        ScheduleItem scheduleitem = (ScheduleItem)iterator1.next();
        if (!scheduleitem.getTripId().equals(((Prediction) (obj)).getTripID())) goto _L5; else goto _L4
_L4:
        list = scheduleitem;
          goto _L1
    }

    protected void assignRegularPredictions(List list, MergedItinerary mergeditinerary)
    {
        Object obj;
        Object obj1;
        ArrayList arraylist;
        arraylist = new ArrayList();
        obj = new ArrayList();
        obj1 = list.iterator();
_L6:
        if (((Iterator) (obj1)).hasNext()) goto _L2; else goto _L1
_L1:
        Object obj2;
        if (arraylist.size() == 0)
        {
            arraylist.add("");
        }
        if (((ArrayList) (obj)).size() == 0)
        {
            ((ArrayList) (obj)).add("");
        }
        obj2 = new ArrayList();
        obj1 = mergeditinerary.getOngoingScheduleItems().iterator();
_L7:
        if (((Iterator) (obj1)).hasNext()) goto _L4; else goto _L3
_L3:
        Object obj3;
        boolean flag;
        boolean flag1;
        if (arraylist.size() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (((ArrayList) (obj)).size() == 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        obj3 = ((ArrayList) (obj)).iterator();
_L9:
        String s;
        Iterator iterator;
        if (!((Iterator) (obj3)).hasNext())
        {
            return;
        }
        s = (String)((Iterator) (obj3)).next();
        iterator = arraylist.iterator();
          goto _L5
_L2:
        obj2 = (Prediction)((Iterator) (obj1)).next();
        if (((Prediction) (obj2)).getBranch() != null && !arraylist.contains(((Prediction) (obj2)).getBranch()))
        {
            arraylist.add(((Prediction) (obj2)).getBranch());
        }
        if (((Prediction) (obj2)).getTripHeadsign() != null && !((ArrayList) (obj)).contains(((Prediction) (obj2)).getTripHeadsign()))
        {
            ((ArrayList) (obj)).add(((Prediction) (obj2)).getTripHeadsign());
        }
          goto _L6
_L4:
        obj3 = (ScheduleItem)((Iterator) (obj1)).next();
        if (!((ArrayList) (obj2)).contains(((ScheduleItem) (obj3)).getHeadsign()))
        {
            ((ArrayList) (obj2)).add(((ScheduleItem) (obj3)).getHeadsign());
        }
          goto _L7
_L5:
        if (!iterator.hasNext()) goto _L9; else goto _L8
_L8:
        String s1;
        ArrayList arraylist1;
        Iterator iterator1;
        s1 = (String)iterator.next();
        arraylist1 = new ArrayList();
        iterator1 = mergeditinerary.getOngoingScheduleItems().iterator();
_L12:
        if (iterator1.hasNext()) goto _L11; else goto _L10
_L10:
        obj = new ArrayList();
        obj1 = list.iterator();
_L13:
        if (((Iterator) (obj1)).hasNext())
        {
            break MISSING_BLOCK_LABEL_510;
        }
        Collections.sort(((List) (obj)), new Comparator() {

            final BaseRealTimeDataSource this$0;

            public int compare(Prediction prediction1, Prediction prediction2)
            {
                return prediction1.getStopTime().compareTo(prediction2.getStopTime());
            }

            public volatile int compare(Object obj4, Object obj5)
            {
                return compare((Prediction)obj4, (Prediction)obj5);
            }

            
            {
                this$0 = BaseRealTimeDataSource.this;
                super();
            }
        });
        assignFilteredPredictionsToItems(((ArrayList) (obj)), arraylist1);
          goto _L5
_L11:
        ScheduleItem scheduleitem = (ScheduleItem)iterator1.next();
        boolean flag6 = true;
        boolean flag5 = true;
        boolean flag4 = flag6;
        if (!flag)
        {
            flag4 = flag6;
            if (!s1.equals(""))
            {
                obj1 = mergeditinerary.getRoute().getShortName();
                obj = obj1;
                if (mergeditinerary.getBranch() != null)
                {
                    obj = ((String) (obj1)).concat(mergeditinerary.getBranch());
                }
                flag4 = ((String) (obj)).equals(s1);
            }
        }
        if (!s.equals(""))
        {
            flag5 = directionTitleMatchItineraryNameOnAllPossibility(s, scheduleitem.getHeadsign(), ((ArrayList) (obj2)), mergeditinerary.getRoute());
        }
        if (flag4 && flag5)
        {
            arraylist1.add(scheduleitem);
        }
          goto _L12
        Prediction prediction = (Prediction)((Iterator) (obj1)).next();
        if (flag && flag1)
        {
            ((ArrayList) (obj)).add(prediction);
        } else
        {
            boolean flag2;
            boolean flag3;
            if (!s1.equals(prediction.getBranch()) && (!s1.equals("") || prediction.getBranch() != null))
            {
                flag2 = false;
            } else
            {
                flag2 = true;
            }
            if (!s.equals(prediction.getTripHeadsign()) && (!s.equals("") || prediction.getTripHeadsign() != null))
            {
                flag3 = false;
            } else
            {
                flag3 = true;
            }
            if (flag2 && flag3)
            {
                ((ArrayList) (obj)).add(prediction);
            }
        }
          goto _L13
    }

    public boolean canEqual(Object obj)
    {
        return obj instanceof BaseRealTimeDataSource;
    }

    String cleanedDirectionOnRoute(String s, NearbyRouteViewModel nearbyrouteviewmodel)
    {
        return s.replace(" - ", " ").replace("-", " ").replace(" / ", " ").replace("/", " ").replace(" (", " ").replace("(", " ").replace(") ", " ").replace(")", " ").replace("`", " ").replace("'", " ").replace("  ", " ").replace("   ", " ").replace("    ", " ").replace("     ", " ").replaceAll((new StringBuilder("(?i)\\b(West to|South to|East to|North to|Outbound to|Inbound to|to|towards|")).append(nearbyrouteviewmodel.getShortName()).append("|").append(nearbyrouteviewmodel.getLongName()).append(")\\b").toString(), "").replace("Sta", "Station").replace("Stn", "Station").replace("dntn", "Downtown");
    }

    protected boolean directionTitleMatchItineraryNameOnAllPossibility(String s, String s1, ArrayList arraylist, NearbyRouteViewModel nearbyrouteviewmodel)
    {
        if (getDirectionMatchType() != null && getDirectionMatchType().equals("levenshtein"))
        {
            int i = LevenshteinDistance.computeDistance(s1, s);
            if (i > 0)
            {
                return false;
            }
            s = arraylist.iterator();
            do
            {
                if (!s.hasNext())
                {
                    return true;
                }
                arraylist = (String)s.next();
            } while (s1.equals(arraylist) || LevenshteinDistance.computeDistance(s1, arraylist) >= i);
            return false;
        }
        s = cleanedDirectionOnRoute(s, nearbyrouteviewmodel);
        s1 = cleanedDirectionOnRoute(s1, nearbyrouteviewmodel);
        if (getDirectionMatchType() != null && getDirectionMatchType().equals("strict"))
        {
            return s.equalsIgnoreCase(s1);
        } else
        {
            return Pattern.compile(Pattern.quote(s1), 2).matcher(s).find();
        }
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof BaseRealTimeDataSource))
        {
            return false;
        }
        obj = (BaseRealTimeDataSource)obj;
        if (!((BaseRealTimeDataSource) (obj)).canEqual(this))
        {
            return false;
        }
        Object obj1 = getRouteTypes();
        Object obj2 = ((BaseRealTimeDataSource) (obj)).getRouteTypes();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getDirectionMatchType();
        obj2 = ((BaseRealTimeDataSource) (obj)).getDirectionMatchType();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getTripURL();
        obj2 = ((BaseRealTimeDataSource) (obj)).getTripURL();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getPredictionsKeyPath();
        obj2 = ((BaseRealTimeDataSource) (obj)).getPredictionsKeyPath();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getDateKeyPath();
        obj2 = ((BaseRealTimeDataSource) (obj)).getDateKeyPath();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getDestinationFilteringKeyPath();
        obj2 = ((BaseRealTimeDataSource) (obj)).getDestinationFilteringKeyPath();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getRouteFilteringKeyPath();
        obj2 = ((BaseRealTimeDataSource) (obj)).getRouteFilteringKeyPath();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getScheduleBasedRegex();
        obj2 = ((BaseRealTimeDataSource) (obj)).getScheduleBasedRegex();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getScheduleBasedKeyPath();
        obj2 = ((BaseRealTimeDataSource) (obj)).getScheduleBasedKeyPath();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getCancelledRegex();
        obj2 = ((BaseRealTimeDataSource) (obj)).getCancelledRegex();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getCancelledKeyPath();
        obj2 = ((BaseRealTimeDataSource) (obj)).getCancelledKeyPath();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getStopFilteringKeyPath();
        obj2 = ((BaseRealTimeDataSource) (obj)).getStopFilteringKeyPath();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getTimestampFormat();
        obj2 = ((BaseRealTimeDataSource) (obj)).getTimestampFormat();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getTimestampKeyPath();
        obj2 = ((BaseRealTimeDataSource) (obj)).getTimestampKeyPath();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getVehiculeURL();
        obj2 = ((BaseRealTimeDataSource) (obj)).getVehiculeURL();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getVehicleDestinationKeyPath();
        obj2 = ((BaseRealTimeDataSource) (obj)).getVehicleDestinationKeyPath();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getVehicleIdKeyPath();
        obj2 = ((BaseRealTimeDataSource) (obj)).getVehicleIdKeyPath();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getVehiclesKeyPath();
        obj2 = ((BaseRealTimeDataSource) (obj)).getVehiclesKeyPath();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getVehicleLatitudeKeyPath();
        obj2 = ((BaseRealTimeDataSource) (obj)).getVehicleLatitudeKeyPath();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getVehicleLongitudeKeyPath();
        obj2 = ((BaseRealTimeDataSource) (obj)).getVehicleLongitudeKeyPath();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getVehicleLocationsURL();
        obj2 = ((BaseRealTimeDataSource) (obj)).getVehicleLocationsURL();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getVehicleTimestampFormat();
        obj2 = ((BaseRealTimeDataSource) (obj)).getVehicleTimestampFormat();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getVehicleTimestampKeyPath();
        obj = ((BaseRealTimeDataSource) (obj)).getVehicleTimestampKeyPath();
        return obj1 != null ? !obj1.equals(obj) : obj != null;
    }

    protected void fetchPredictionForURL(Context context, String s, MergedItinerary mergeditinerary, RealTimeCallback realtimecallback)
    {
        mergeditinerary.setPredictionsFetchDate(new Date());
        (new RealTimeFetchTask(context, new HttpGet(s), this, mergeditinerary, realtimecallback)).execute();
    }

    public String getCancelledKeyPath()
    {
        return cancelledKeyPath;
    }

    public Pattern getCancelledRegex()
    {
        return cancelledRegex;
    }

    public String getDateKeyPath()
    {
        return dateKeyPath;
    }

    public String getDestinationFilteringKeyPath()
    {
        return destinationFilteringKeyPath;
    }

    public String getDirectionMatchType()
    {
        return directionMatchType;
    }

    public void getPredictionForItinerary(Context context, MergedItinerary mergeditinerary, RealTimeCallback realtimecallback)
    {
        String s = replaceVariablesInURLFromItinerary(tripURL, mergeditinerary);
        if (s != null && shouldFetchPredictionsForItinerary(mergeditinerary))
        {
            fetchPredictionForURL(context, s, mergeditinerary, realtimecallback);
        }
    }

    public String getPredictionsKeyPath()
    {
        return predictionsKeyPath;
    }

    public String getRouteFilteringKeyPath()
    {
        return routeFilteringKeyPath;
    }

    public ArrayList getRouteTypes()
    {
        return routeTypes;
    }

    public String getScheduleBasedKeyPath()
    {
        return scheduleBasedKeyPath;
    }

    public Pattern getScheduleBasedRegex()
    {
        return scheduleBasedRegex;
    }

    public String getStopFilteringKeyPath()
    {
        return stopFilteringKeyPath;
    }

    public DateFormatter getTimestampFormat()
    {
        return timestampFormat;
    }

    public String getTimestampKeyPath()
    {
        return timestampKeyPath;
    }

    public String getTripURL()
    {
        return tripURL;
    }

    public String getVehicleDestinationKeyPath()
    {
        return vehicleDestinationKeyPath;
    }

    public String getVehicleIdKeyPath()
    {
        return vehicleIdKeyPath;
    }

    public String getVehicleLatitudeKeyPath()
    {
        return vehicleLatitudeKeyPath;
    }

    public String getVehicleLocationsURL()
    {
        return vehicleLocationsURL;
    }

    public String getVehicleLongitudeKeyPath()
    {
        return vehicleLongitudeKeyPath;
    }

    public DateFormatter getVehicleTimestampFormat()
    {
        return vehicleTimestampFormat;
    }

    public String getVehicleTimestampKeyPath()
    {
        return vehicleTimestampKeyPath;
    }

    public String getVehiclesKeyPath()
    {
        return vehiclesKeyPath;
    }

    public String getVehiculeURL()
    {
        return vehiculeURL;
    }

    public int hashCode()
    {
        Object obj = getRouteTypes();
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int j3;
        int k3;
        int l3;
        int i4;
        int j4;
        int k4;
        int l4;
        int i5;
        int j5;
        int k5;
        if (obj == null)
        {
            i = 0;
        } else
        {
            i = obj.hashCode();
        }
        obj = getDirectionMatchType();
        if (obj == null)
        {
            j = 0;
        } else
        {
            j = obj.hashCode();
        }
        obj = getTripURL();
        if (obj == null)
        {
            k = 0;
        } else
        {
            k = obj.hashCode();
        }
        obj = getPredictionsKeyPath();
        if (obj == null)
        {
            l = 0;
        } else
        {
            l = obj.hashCode();
        }
        obj = getDateKeyPath();
        if (obj == null)
        {
            i1 = 0;
        } else
        {
            i1 = obj.hashCode();
        }
        obj = getDestinationFilteringKeyPath();
        if (obj == null)
        {
            j1 = 0;
        } else
        {
            j1 = obj.hashCode();
        }
        obj = getRouteFilteringKeyPath();
        if (obj == null)
        {
            k1 = 0;
        } else
        {
            k1 = obj.hashCode();
        }
        obj = getScheduleBasedRegex();
        if (obj == null)
        {
            l1 = 0;
        } else
        {
            l1 = obj.hashCode();
        }
        obj = getScheduleBasedKeyPath();
        if (obj == null)
        {
            i2 = 0;
        } else
        {
            i2 = obj.hashCode();
        }
        obj = getCancelledRegex();
        if (obj == null)
        {
            j2 = 0;
        } else
        {
            j2 = obj.hashCode();
        }
        obj = getCancelledKeyPath();
        if (obj == null)
        {
            k2 = 0;
        } else
        {
            k2 = obj.hashCode();
        }
        obj = getStopFilteringKeyPath();
        if (obj == null)
        {
            l2 = 0;
        } else
        {
            l2 = obj.hashCode();
        }
        obj = getTimestampFormat();
        if (obj == null)
        {
            i3 = 0;
        } else
        {
            i3 = obj.hashCode();
        }
        obj = getTimestampKeyPath();
        if (obj == null)
        {
            j3 = 0;
        } else
        {
            j3 = obj.hashCode();
        }
        obj = getVehiculeURL();
        if (obj == null)
        {
            k3 = 0;
        } else
        {
            k3 = obj.hashCode();
        }
        obj = getVehicleDestinationKeyPath();
        if (obj == null)
        {
            l3 = 0;
        } else
        {
            l3 = obj.hashCode();
        }
        obj = getVehicleIdKeyPath();
        if (obj == null)
        {
            i4 = 0;
        } else
        {
            i4 = obj.hashCode();
        }
        obj = getVehiclesKeyPath();
        if (obj == null)
        {
            j4 = 0;
        } else
        {
            j4 = obj.hashCode();
        }
        obj = getVehicleLatitudeKeyPath();
        if (obj == null)
        {
            k4 = 0;
        } else
        {
            k4 = obj.hashCode();
        }
        obj = getVehicleLongitudeKeyPath();
        if (obj == null)
        {
            l4 = 0;
        } else
        {
            l4 = obj.hashCode();
        }
        obj = getVehicleLocationsURL();
        if (obj == null)
        {
            i5 = 0;
        } else
        {
            i5 = obj.hashCode();
        }
        obj = getVehicleTimestampFormat();
        if (obj == null)
        {
            j5 = 0;
        } else
        {
            j5 = obj.hashCode();
        }
        obj = getVehicleTimestampKeyPath();
        if (obj == null)
        {
            k5 = 0;
        } else
        {
            k5 = obj.hashCode();
        }
        return ((((((((((((((((((((((i + 31) * 31 + j) * 31 + k) * 31 + l) * 31 + i1) * 31 + j1) * 31 + k1) * 31 + l1) * 31 + i2) * 31 + j2) * 31 + k2) * 31 + l2) * 31 + i3) * 31 + j3) * 31 + k3) * 31 + l3) * 31 + i4) * 31 + j4) * 31 + k4) * 31 + l4) * 31 + i5) * 31 + j5) * 31 + k5;
    }

    protected abstract Object parseStream(InputStream inputstream);

    protected abstract List processScheduleResponse(Object obj, MergedItinerary mergeditinerary);

    protected String replaceVariablesInURLFromItinerary(String s, MergedItinerary mergeditinerary)
    {
        String s1;
        String s2;
        s1 = s;
        s2 = s;
        if (mergeditinerary.getRealTimeRouteId() == null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        s2 = s;
        s1 = s.replaceAll("(?i)__realTimeRouteID__", URLEncoder.encode(mergeditinerary.getRealTimeRouteId(), "UTF-8"));
        s = s1;
        s2 = s1;
        if (mergeditinerary.getRealTimeStopId() != null)
        {
            s2 = s1;
            try
            {
                s = s1.replaceAll("(?i)__realTimeStopID__", URLEncoder.encode(mergeditinerary.getRealTimeStopId(), "UTF-8"));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.e("BaseRealTimeDataSource", "Missing encoding UTF-8", s);
                s = s2;
            }
        }
        mergeditinerary = s;
        if (s.contains("__"))
        {
            mergeditinerary = null;
        }
        return mergeditinerary;
    }

    public void setCancelledKeyPath(String s)
    {
        cancelledKeyPath = s;
    }

    public void setCancelledRegex(Pattern pattern)
    {
        cancelledRegex = pattern;
    }

    public void setDateKeyPath(String s)
    {
        dateKeyPath = s;
    }

    public void setDestinationFilteringKeyPath(String s)
    {
        destinationFilteringKeyPath = s;
    }

    public void setDirectionMatchType(String s)
    {
        directionMatchType = s;
    }

    public void setPredictionsKeyPath(String s)
    {
        predictionsKeyPath = s;
    }

    public void setRouteFilteringKeyPath(String s)
    {
        routeFilteringKeyPath = s;
    }

    public void setRouteTypes(ArrayList arraylist)
    {
        routeTypes = arraylist;
    }

    public void setScheduleBasedKeyPath(String s)
    {
        scheduleBasedKeyPath = s;
    }

    public void setScheduleBasedRegex(Pattern pattern)
    {
        scheduleBasedRegex = pattern;
    }

    public void setStopFilteringKeyPath(String s)
    {
        stopFilteringKeyPath = s;
    }

    public void setTimestampFormat(DateFormatter dateformatter)
    {
        timestampFormat = dateformatter;
    }

    public void setTimestampKeyPath(String s)
    {
        timestampKeyPath = s;
    }

    public void setTripURL(String s)
    {
        tripURL = s;
    }

    public void setVehicleDestinationKeyPath(String s)
    {
        vehicleDestinationKeyPath = s;
    }

    public void setVehicleIdKeyPath(String s)
    {
        vehicleIdKeyPath = s;
    }

    public void setVehicleLatitudeKeyPath(String s)
    {
        vehicleLatitudeKeyPath = s;
    }

    public void setVehicleLocationsURL(String s)
    {
        vehicleLocationsURL = s;
    }

    public void setVehicleLongitudeKeyPath(String s)
    {
        vehicleLongitudeKeyPath = s;
    }

    public void setVehicleTimestampFormat(DateFormatter dateformatter)
    {
        vehicleTimestampFormat = dateformatter;
    }

    public void setVehicleTimestampKeyPath(String s)
    {
        vehicleTimestampKeyPath = s;
    }

    public void setVehiclesKeyPath(String s)
    {
        vehiclesKeyPath = s;
    }

    public void setVehiculeURL(String s)
    {
        vehiculeURL = s;
    }

    public boolean shouldFetchPredictionsForItinerary(MergedItinerary mergeditinerary)
    {
        mergeditinerary = mergeditinerary.getPredictionsFetchDate();
        if (mergeditinerary == null)
        {
            return arePredictionsEnabled();
        }
        long l = mergeditinerary.getTime();
        long l1 = (new Date()).getTime();
        return arePredictionsEnabled() && l - l1 < -20000L;
    }

    public String toString()
    {
        return (new StringBuilder("BaseRealTimeDataSource(routeTypes=")).append(getRouteTypes()).append(", directionMatchType=").append(getDirectionMatchType()).append(", tripURL=").append(getTripURL()).append(", predictionsKeyPath=").append(getPredictionsKeyPath()).append(", dateKeyPath=").append(getDateKeyPath()).append(", destinationFilteringKeyPath=").append(getDestinationFilteringKeyPath()).append(", routeFilteringKeyPath=").append(getRouteFilteringKeyPath()).append(", scheduleBasedRegex=").append(getScheduleBasedRegex()).append(", scheduleBasedKeyPath=").append(getScheduleBasedKeyPath()).append(", cancelledRegex=").append(getCancelledRegex()).append(", cancelledKeyPath=").append(getCancelledKeyPath()).append(", stopFilteringKeyPath=").append(getStopFilteringKeyPath()).append(", timestampFormat=").append(getTimestampFormat()).append(", timestampKeyPath=").append(getTimestampKeyPath()).append(", vehiculeURL=").append(getVehiculeURL()).append(", vehicleDestinationKeyPath=").append(getVehicleDestinationKeyPath()).append(", vehicleIdKeyPath=").append(getVehicleIdKeyPath()).append(", vehiclesKeyPath=").append(getVehiclesKeyPath()).append(", vehicleLatitudeKeyPath=").append(getVehicleLatitudeKeyPath()).append(", vehicleLongitudeKeyPath=").append(getVehicleLongitudeKeyPath()).append(", vehicleLocationsURL=").append(getVehicleLocationsURL()).append(", vehicleTimestampFormat=").append(getVehicleTimestampFormat()).append(", vehicleTimestampKeyPath=").append(getVehicleTimestampKeyPath()).append(")").toString();
    }

    protected boolean valueMatchCancelled(Object obj)
    {
        return valueMatchRegex(obj, getCancelledRegex());
    }

    protected boolean valueMatchRegex(Object obj, Pattern pattern)
    {
        Object obj1 = obj;
        if (obj instanceof Integer)
        {
            obj1 = obj.toString();
        }
        return pattern.matcher((CharSequence)obj1).matches();
    }

    protected boolean valueMatchScheduleBased(Object obj)
    {
        return valueMatchRegex(obj, getScheduleBasedRegex());
    }
}
