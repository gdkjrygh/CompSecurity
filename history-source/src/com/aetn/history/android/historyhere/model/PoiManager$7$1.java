// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.model;

import com.aetn.history.android.historyhere.HistoryHereApplication;
import com.aetn.history.android.historyhere.utils.Utils;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

// Referenced classes of package com.aetn.history.android.historyhere.model:
//            POI, PoiManager, PoiResponse, Configuration, 
//            POIDetail

class this._cls1
    implements Comparator
{

    final compare this$1;

    public int compare(POI poi, POI poi1)
    {
        return poi.getCity().compareTo(poi1.getCity());
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((POI)obj, (POI)obj1);
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/aetn/history/android/historyhere/model/PoiManager$7

/* anonymous class */
    class PoiManager._cls7
        implements com.android.volley.Response.Listener
    {

        final PoiManager this$0;

        public volatile void onResponse(Object obj)
        {
            onResponse((String)obj);
        }

        public void onResponse(String s)
        {
            if (s.indexOf("OK") < 0)
            {
                Utils.logger(PoiManager.access$200(PoiManager.this), "loadAllToursList: not loaded properly");
                PoiManager.access$900(PoiManager.this);
                return;
            }
            s = (PoiResponse)(new Gson()).fromJson(s, com/aetn/history/android/historyhere/model/PoiResponse);
            PoiManager.access$1002(PoiManager.this, ((PoiResponse) (s)).results);
            s = new ArrayList();
            Iterator iterator = HistoryHereApplication.getConfiguration().tourSponsorData.iterator();
label0:
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Configuration.TourSponsorData toursponsordata = (Configuration.TourSponsorData)iterator.next();
                Iterator iterator1 = PoiManager.access$1000(PoiManager.this).iterator();
                POIDetail poidetail;
                do
                {
                    if (!iterator1.hasNext())
                    {
                        continue label0;
                    }
                    poidetail = (POIDetail)iterator1.next();
                } while (!toursponsordata.id.equalsIgnoreCase(poidetail.getId()));
                s.add(poidetail);
                PoiManager.access$1000(PoiManager.this).remove(poidetail);
            } while (true);
            Collections.sort(PoiManager.access$1000(PoiManager.this), new PoiManager._cls7._cls1());
            Collections.sort(s, new PoiManager._cls7._cls2());
            s.addAll(PoiManager.access$1000(PoiManager.this));
            PoiManager.access$1002(PoiManager.this, s);
            PoiManager.access$1100(PoiManager.this);
        }

            
            {
                this$0 = PoiManager.this;
                super();
            }

        // Unreferenced inner class com/aetn/history/android/historyhere/model/PoiManager$7$2

/* anonymous class */
        class PoiManager._cls7._cls2
            implements Comparator
        {

            final PoiManager._cls7 this$1;

            public int compare(POI poi, POI poi1)
            {
                return poi.getCity().compareTo(poi1.getCity());
            }

            public volatile int compare(Object obj, Object obj1)
            {
                return compare((POI)obj, (POI)obj1);
            }

                    
                    {
                        this$1 = PoiManager._cls7.this;
                        super();
                    }
        }

    }

}
