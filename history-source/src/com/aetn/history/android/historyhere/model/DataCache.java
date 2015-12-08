// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.model;

import com.aetn.history.android.historyhere.utils.Utils;
import java.util.HashMap;

// Referenced classes of package com.aetn.history.android.historyhere.model:
//            POIDetail

public class DataCache
{

    private static final String TAG = "DataCache";
    private static HashMap detailMap;

    public DataCache()
    {
        if (detailMap == null)
        {
            Utils.logger("DataCache", "detailMap is null");
            detailMap = new HashMap();
            return;
        } else
        {
            Utils.logger("DataCache", "detailMap is NOT null");
            return;
        }
    }

    public POIDetail getPOIDetail(String s)
    {
        POIDetail poidetail = null;
        if (detailMap.containsKey(s))
        {
            Utils.logger("DataCache", "we have the item");
            poidetail = (POIDetail)detailMap.get(s);
        }
        return poidetail;
    }

    public void putPOIDetail(POIDetail poidetail)
    {
        Utils.logger("DataCache", "add this item to the cache");
        if (!detailMap.containsKey(poidetail.getId()))
        {
            detailMap.put(poidetail.getId(), poidetail);
            Utils.logger("DataCache", (new StringBuilder()).append("the detailMap is now this large: ").append(detailMap.size()).toString());
        }
    }
}
