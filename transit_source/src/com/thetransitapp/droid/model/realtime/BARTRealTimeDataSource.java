// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.model.realtime;

import RaptureXML.RXMLElement;
import com.thetransitapp.droid.model.viewmodel.MergedItinerary;
import com.thetransitapp.droid.util.DateFormatter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.thetransitapp.droid.model.realtime:
//            XMLRealTimeDataSource, Prediction

public class BARTRealTimeDataSource extends XMLRealTimeDataSource
    implements Serializable
{

    private static final long serialVersionUID = 1L;

    public BARTRealTimeDataSource()
    {
    }

    protected List processScheduleResponse(final Object directionTitle, final MergedItinerary itinerary)
    {
        directionTitle = (RXMLElement)directionTitle;
        final ArrayList predictions = new ArrayList();
        final DateFormatter formatter = getTimestampFormat();
        ArrayList arraylist = ((RXMLElement) (directionTitle)).child("station").children("etd");
        Iterator iterator = arraylist.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return predictions;
            }
            RXMLElement rxmlelement = (RXMLElement)iterator.next();
            if (arraylist.size() == 1)
            {
                directionTitle = null;
            } else
            {
                directionTitle = rxmlelement.child("destination").text();
            }
            rxmlelement.iterate("estimate", new RaptureXML.RXMLElement.Block() {

                final BARTRealTimeDataSource this$0;
                private final String val$directionTitle;
                private final DateFormatter val$formatter;
                private final MergedItinerary val$itinerary;
                private final ArrayList val$predictions;

                public void block(RXMLElement rxmlelement1)
                {
                    if (rxmlelement1.child("color").text().equals(itinerary.getRealTimeRouteId()))
                    {
                        Prediction prediction = new Prediction();
                        prediction.setStopTime(formatter.format(rxmlelement1.child("minutes").text()));
                        prediction.setTripHeadsign(directionTitle);
                        predictions.add(prediction);
                    }
                }

            
            {
                this$0 = BARTRealTimeDataSource.this;
                itinerary = mergeditinerary;
                formatter = dateformatter;
                directionTitle = s;
                predictions = arraylist;
                super();
            }
            });
        } while (true);
    }
}
