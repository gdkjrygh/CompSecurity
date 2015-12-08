// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.model.realtime;

import RaptureXML.RXMLElement;
import com.thetransitapp.droid.model.viewmodel.MergedItinerary;
import com.thetransitapp.droid.util.DateFormatter;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.thetransitapp.droid.model.realtime:
//            XMLRealTimeDataSource, Prediction

public class OBARealTimeDataSource extends XMLRealTimeDataSource
{

    private static final long serialVersionUID = 1L;

    public OBARealTimeDataSource()
    {
    }

    protected List processScheduleResponse(Object obj, final MergedItinerary itinerary)
    {
        obj = (RXMLElement)obj;
        final ArrayList predictions = new ArrayList();
        final String routeFilteringKeyPath = getRouteFilteringKeyPath();
        final String stopFilteringKeyPath = getStopFilteringKeyPath();
        final DateFormatter formatter = getTimestampFormat();
        ((RXMLElement) (obj)).iterate(getPredictionsKeyPath(), new RaptureXML.RXMLElement.Block() {

            final OBARealTimeDataSource this$0;
            private final DateFormatter val$formatter;
            private final MergedItinerary val$itinerary;
            private final ArrayList val$predictions;
            private final String val$routeFilteringKeyPath;
            private final String val$stopFilteringKeyPath;

            public void block(RXMLElement rxmlelement)
            {
                String s = objectAtKeyPath(rxmlelement, routeFilteringKeyPath);
                String s2 = objectAtKeyPath(rxmlelement, stopFilteringKeyPath);
                if (s == null || s.equals(itinerary.getRealTimeRouteId()) && (s2 == null || s2.equals(itinerary.getRealTimeStopId())))
                {
                    String s1 = rxmlelement.child("predictedDepartureTime").text();
                    rxmlelement = rxmlelement.child("scheduledDepartureTime").text();
                    Prediction prediction = new Prediction();
                    if (Long.parseLong(s1) != 0L)
                    {
                        prediction.setStopTime(formatter.format(s1));
                    } else
                    {
                        prediction.setStopTime(formatter.format(rxmlelement));
                        prediction.setScheduleBased(true);
                    }
                    predictions.add(prediction);
                }
            }

            
            {
                this$0 = OBARealTimeDataSource.this;
                routeFilteringKeyPath = s;
                stopFilteringKeyPath = s1;
                itinerary = mergeditinerary;
                formatter = dateformatter;
                predictions = arraylist;
                super();
            }
        });
        return predictions;
    }
}
