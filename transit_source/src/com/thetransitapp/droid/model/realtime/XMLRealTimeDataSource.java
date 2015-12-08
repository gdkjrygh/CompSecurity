// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.model.realtime;

import RaptureXML.RXMLElement;
import com.thetransitapp.droid.model.viewmodel.MergedItinerary;
import com.thetransitapp.droid.util.DateFormatter;
import com.thetransitapp.droid.util.ServiceUtility;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.thetransitapp.droid.model.realtime:
//            BaseRealTimeDataSource, Prediction

public class XMLRealTimeDataSource extends BaseRealTimeDataSource
{

    private static final long serialVersionUID = 1L;

    public XMLRealTimeDataSource()
    {
    }

    protected String objectAtKeyPath(RXMLElement rxmlelement, String s)
    {
        if (s != null)
        {
            if (s.startsWith("..") || s.startsWith("//"))
            {
                if ((rxmlelement = rxmlelement.childrenWithRootXPath(s)) != null && !rxmlelement.isEmpty())
                {
                    return ((RXMLElement)rxmlelement.get(0)).text();
                }
            } else
            {
                return rxmlelement.child(s).text();
            }
        }
        return null;
    }

    public Object parseStream(InputStream inputstream)
    {
        return new RXMLElement(ServiceUtility.convertStreamToString(inputstream));
    }

    protected List processScheduleResponse(Object obj, final MergedItinerary itinerary)
    {
        obj = (RXMLElement)obj;
        ArrayList arraylist = new ArrayList();
        final String routeFilteringKeyPath = getRouteFilteringKeyPath();
        final String stopFilteringKeyPath = getStopFilteringKeyPath();
        final String timestampKeyPath = getTimestampKeyPath();
        final String dateKeyPath = getDateKeyPath();
        String s = getScheduleBasedKeyPath();
        String s1 = getCancelledKeyPath();
        String s2 = getDestinationFilteringKeyPath();
        itinerary = new RaptureXML.RXMLElement.Block() {

            final XMLRealTimeDataSource this$0;
            private final String val$cancelledKeyPath;
            private final BaseRealTimeDataSource val$dataSource;
            private final String val$dateKeyPath;
            private final String val$destinationKeyPath;
            private final DateFormatter val$formatter;
            private final MergedItinerary val$itinerary;
            private final ArrayList val$predictions;
            private final String val$routeFilteringKeyPath;
            private final String val$scheduleBasedKeyPath;
            private final String val$stopFilteringKeyPath;
            private final String val$timestampKeyPath;

            public void block(RXMLElement rxmlelement)
            {
                String s3 = objectAtKeyPath(rxmlelement, routeFilteringKeyPath);
                String s4 = objectAtKeyPath(rxmlelement, stopFilteringKeyPath);
                if (s3 == null || s3.equals(itinerary.getRealTimeRouteId()) && (s4 == null || s4.equals(itinerary.getRealTimeStopId())))
                {
                    Object obj1;
                    Object obj2;
                    if (timestampKeyPath != null)
                    {
                        obj1 = objectAtKeyPath(rxmlelement, timestampKeyPath);
                    } else
                    {
                        obj1 = rxmlelement.text();
                    }
                    obj2 = obj1;
                    if (dateKeyPath != null)
                    {
                        obj2 = obj1;
                        if (obj1 != null)
                        {
                            obj2 = (new StringBuilder(String.valueOf(obj1))).append(" ").append(objectAtKeyPath(rxmlelement, dateKeyPath)).toString();
                        }
                    }
                    if (obj2 != null)
                    {
                        obj2 = formatter.format(((String) (obj2)));
                        if (obj2 != null)
                        {
                            obj1 = new Prediction();
                            ((Prediction) (obj1)).setStopTime(((java.util.Date) (obj2)));
                            if (scheduleBasedKeyPath != null)
                            {
                                String s5 = objectAtKeyPath(rxmlelement, scheduleBasedKeyPath);
                                ((Prediction) (obj1)).setScheduleBased(dataSource.valueMatchScheduleBased(s5));
                            }
                            if (cancelledKeyPath != null)
                            {
                                String s6 = objectAtKeyPath(rxmlelement, cancelledKeyPath);
                                ((Prediction) (obj1)).setCancelled(dataSource.valueMatchCancelled(s6));
                            }
                            if (destinationKeyPath != null)
                            {
                                ((Prediction) (obj1)).setTripHeadsign(objectAtKeyPath(rxmlelement, destinationKeyPath));
                            }
                            predictions.add(obj1);
                        }
                    }
                }
            }

            
            {
                this$0 = XMLRealTimeDataSource.this;
                routeFilteringKeyPath = s;
                stopFilteringKeyPath = s1;
                itinerary = mergeditinerary;
                timestampKeyPath = s2;
                dateKeyPath = s3;
                formatter = dateformatter;
                scheduleBasedKeyPath = s4;
                dataSource = baserealtimedatasource;
                cancelledKeyPath = s5;
                destinationKeyPath = s6;
                predictions = arraylist;
                super();
            }
        };
        if (getPredictionsKeyPath().startsWith("//"))
        {
            ((RXMLElement) (obj)).iterateWithRootXPath(getPredictionsKeyPath(), itinerary);
            return arraylist;
        } else
        {
            ((RXMLElement) (obj)).iterate(getPredictionsKeyPath(), itinerary);
            return arraylist;
        }
    }
}
