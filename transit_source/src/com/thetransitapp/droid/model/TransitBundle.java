// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.model;

import android.location.Location;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.thetransitapp.droid.model:
//            TransitMode, Feed, TransitServer

public class TransitBundle
    implements Serializable
{

    private static final long serialVersionUID = 0xbc9da3af46516c92L;
    private String countryCode;
    private List feeds;
    private int gtfsSize;
    private String id;
    private double latitude;
    private double longitude;
    private String name;
    private TransitServer server;
    private String shortName;
    private List transitModes;

    public TransitBundle()
    {
        feeds = new ArrayList();
        transitModes = new ArrayList();
    }

    private String getBannedFeed(TransitMode transitmode)
    {
        StringBuilder stringbuilder = new StringBuilder();
        transitmode = transitmode.getFeedIds().iterator();
        do
        {
            if (!transitmode.hasNext())
            {
                return stringbuilder.toString();
            }
            String s = (String)transitmode.next();
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append(",");
            }
            stringbuilder.append(s);
        } while (true);
    }

    private String getBannedFeedType(TransitMode transitmode)
    {
        StringBuilder stringbuilder = new StringBuilder();
        Iterator iterator = transitmode.getFeedIds().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return stringbuilder.toString();
            }
            String s = (String)iterator.next();
            Iterator iterator1 = transitmode.getRouteTypes().iterator();
            while (iterator1.hasNext()) 
            {
                Route.RouteType routetype = (Route.RouteType)iterator1.next();
                if (stringbuilder.length() > 0)
                {
                    stringbuilder.append(",");
                }
                stringbuilder.append(s);
                stringbuilder.append("_");
                stringbuilder.append(routetype.ordinal());
            }
        } while (true);
    }

    private String getBannedType(TransitMode transitmode)
    {
        StringBuilder stringbuilder = new StringBuilder();
        transitmode = transitmode.getRouteTypes().iterator();
        do
        {
            if (!transitmode.hasNext())
            {
                return stringbuilder.toString();
            }
            Route.RouteType routetype = (Route.RouteType)transitmode.next();
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append(",");
            }
            stringbuilder.append(routetype.ordinal());
        } while (true);
    }

    public boolean deserve(Location location)
    {
        Iterator iterator = feeds.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return false;
            }
        } while (!((Feed)iterator.next()).deserve(location));
        return true;
    }

    public boolean equals(Object obj)
    {
        if (obj != null && (obj instanceof TransitBundle))
        {
            if (id.equals(((TransitBundle) (obj = (TransitBundle)obj)).id) && name.equals(((TransitBundle) (obj)).name))
            {
                return true;
            }
        }
        return false;
    }

    public String getBannedTransitParameters(boolean flag)
    {
        StringBuilder stringbuilder2 = new StringBuilder();
        StringBuilder stringbuilder1 = new StringBuilder();
        StringBuilder stringbuilder = new StringBuilder();
        Object obj = transitModes.iterator();
        do
        {
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    Object obj1 = new StringBuilder();
                    if (stringbuilder2.length() > 0)
                    {
                        if (flag)
                        {
                            obj = "hidden_feed_ids=";
                        } else
                        {
                            obj = "bannedAgencies=";
                        }
                        ((StringBuilder) (obj1)).append(((String) (obj)));
                        ((StringBuilder) (obj1)).append(stringbuilder2);
                    }
                    if (stringbuilder1.length() > 0)
                    {
                        if (((StringBuilder) (obj1)).length() > 0)
                        {
                            ((StringBuilder) (obj1)).append("&");
                        }
                        if (flag)
                        {
                            obj = "hidden_route_types=";
                        } else
                        {
                            obj = "bannedRouteTypes=";
                        }
                        ((StringBuilder) (obj1)).append(((String) (obj)));
                        ((StringBuilder) (obj1)).append(stringbuilder1);
                    }
                    if (stringbuilder.length() > 0)
                    {
                        if (((StringBuilder) (obj1)).length() > 0)
                        {
                            ((StringBuilder) (obj1)).append("&");
                        }
                        if (flag)
                        {
                            obj = "hidden_feed_route_types=";
                        } else
                        {
                            obj = "bannedAgencyRouteTypes=";
                        }
                        ((StringBuilder) (obj1)).append(((String) (obj)));
                        ((StringBuilder) (obj1)).append(stringbuilder);
                    }
                    return ((StringBuilder) (obj1)).toString();
                }
                obj1 = (TransitMode)((Iterator) (obj)).next();
            } while (((TransitMode) (obj1)).isSelected());
            if (((TransitMode) (obj1)).getFeedIds().size() > 0 && ((TransitMode) (obj1)).getRouteTypes().size() > 0)
            {
                if (stringbuilder.length() > 0)
                {
                    stringbuilder.append(",");
                }
                stringbuilder.append(getBannedFeedType(((TransitMode) (obj1))));
            } else
            if (((TransitMode) (obj1)).getFeedIds().size() > 0)
            {
                if (stringbuilder2.length() > 0)
                {
                    stringbuilder2.append(",");
                }
                stringbuilder2.append(getBannedFeed(((TransitMode) (obj1))));
            } else
            if (((TransitMode) (obj1)).getRouteTypes().size() > 0)
            {
                if (stringbuilder1.length() > 0)
                {
                    stringbuilder1.append(",");
                }
                stringbuilder1.append(getBannedType(((TransitMode) (obj1))));
            }
        } while (true);
    }

    public String getCountryCode()
    {
        return countryCode;
    }

    public List getFeeds()
    {
        return feeds;
    }

    public int getGtfsSize()
    {
        return gtfsSize;
    }

    public String getId()
    {
        return id;
    }

    public double getLatitude()
    {
        return latitude;
    }

    public double getLongitude()
    {
        return longitude;
    }

    public String getName()
    {
        return name;
    }

    public TransitServer getServer()
    {
        return server;
    }

    public String getShortName()
    {
        return shortName;
    }

    public List getTransitModes()
    {
        return transitModes;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (id == null)
        {
            i = 0;
        } else
        {
            i = id.hashCode();
        }
        if (name != null)
        {
            j = name.hashCode();
        }
        return (i + 31) * 31 + j;
    }

    public void merge(TransitBundle transitbundle)
    {
        Iterator iterator = transitbundle.getFeeds().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                if (transitbundle.getServer() != null)
                {
                    server = transitbundle.getServer();
                }
                if (transitbundle.getTransitModes() != null && !transitbundle.getTransitModes().isEmpty())
                {
                    transitModes.clear();
                    transitModes.addAll(transitbundle.getTransitModes());
                }
                return;
            }
            Feed feed = (Feed)iterator.next();
            int i = feeds.indexOf(feed);
            if (i != -1)
            {
                ((Feed)feeds.get(i)).merge(feed);
            } else
            {
                feeds.add(feed);
            }
        } while (true);
    }

    public void setCountryCode(String s)
    {
        countryCode = s;
    }

    public void setFeeds(List list)
    {
        feeds = list;
    }

    public void setGtfsSize(int i)
    {
        gtfsSize = i;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setLatitude(double d)
    {
        latitude = d;
    }

    public void setLongitude(double d)
    {
        longitude = d;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setServer(TransitServer transitserver)
    {
        server = transitserver;
    }

    public void setShortName(String s)
    {
        shortName = s;
    }

    public void setTransitModes(List list)
    {
        transitModes = list;
    }

    public String toString()
    {
        return (new StringBuilder("TransitBundle(id=")).append(getId()).append(", name=").append(getName()).append(", gtfsSize=").append(getGtfsSize()).append(", latitude=").append(getLatitude()).append(", longitude=").append(getLongitude()).append(", countryCode=").append(getCountryCode()).append(", shortName=").append(getShortName()).append(", server=").append(getServer()).append(", transitModes=").append(getTransitModes()).append(", feeds=").append(getFeeds()).append(")").toString();
    }
}
