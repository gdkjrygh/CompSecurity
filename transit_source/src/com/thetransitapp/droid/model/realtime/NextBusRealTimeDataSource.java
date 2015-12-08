// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.model.realtime;

import RaptureXML.RXMLElement;
import com.thetransitapp.droid.model.viewmodel.MergedItinerary;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.thetransitapp.droid.model.realtime:
//            XMLRealTimeDataSource, Prediction

public class NextBusRealTimeDataSource extends XMLRealTimeDataSource
{

    private static final long serialVersionUID = 1L;
    private String agencyTag;

    public NextBusRealTimeDataSource()
    {
    }

    public String getAgencyTag()
    {
        return agencyTag;
    }

    protected List processScheduleResponse(Object obj, MergedItinerary mergeditinerary)
    {
        Object obj1;
        RXMLElement rxmlelement = (RXMLElement)obj;
        obj = new ArrayList();
        obj1 = rxmlelement.children("predictions");
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        ArrayList arraylist;
        arraylist = new ArrayList();
        obj1 = ((ArrayList) (obj1)).iterator();
_L6:
        if (((Iterator) (obj1)).hasNext()) goto _L4; else goto _L3
_L3:
        if (mergeditinerary.getCurrentHeadsign() == null) goto _L2; else goto _L5
_L5:
        mergeditinerary = arraylist.iterator();
_L7:
        if (mergeditinerary.hasNext())
        {
            break MISSING_BLOCK_LABEL_97;
        }
_L2:
        return ((List) (obj));
_L4:
        arraylist.addAll(((RXMLElement)((Iterator) (obj1)).next()).children("direction"));
          goto _L6
        RXMLElement rxmlelement1 = (RXMLElement)mergeditinerary.next();
        rxmlelement1.iterate("prediction", new RaptureXML.RXMLElement.Block() {

            final NextBusRealTimeDataSource this$0;
            private final String val$directionTitle;
            private final ArrayList val$predictions;

            public void block(RXMLElement rxmlelement2)
            {
                String s = rxmlelement2.attribute("branch");
                long l = (long)rxmlelement2.attributeAsDouble("epochTime");
                Prediction prediction = new Prediction();
                prediction.setScheduleBased(Boolean.parseBoolean(rxmlelement2.attribute("isScheduleBased")));
                prediction.setStopTime(new Date(l));
                prediction.setTripHeadsign(directionTitle);
                prediction.setBranch(s);
                prediction.setDirectionTag(rxmlelement2.attribute("dirTag"));
                predictions.add(prediction);
            }

            
            {
                this$0 = NextBusRealTimeDataSource.this;
                directionTitle = s;
                predictions = arraylist;
                super();
            }
        });
          goto _L7
    }

    public void setAgencyTag(String s)
    {
        agencyTag = s;
    }
}
