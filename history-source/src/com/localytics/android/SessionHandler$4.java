// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;

import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package com.localytics.android:
//            SessionHandler

class val.clv
    implements Runnable
{

    final SessionHandler this$0;
    final Map val$attributes;
    final Long val$clv;
    final String val$event;

    public void run()
    {
        if (SessionHandler.getOpenSessionId(mProvider) != null)
        {
            tagEvent(val$event, val$attributes, val$clv);
            return;
        }
        if (val$attributes != null) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        open(false, ((Map) (obj)));
        tagEvent(val$event, val$attributes, val$clv);
        close(((Map) (obj)));
        return;
_L2:
        if (val$attributes.containsKey(r.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_1) || val$attributes.containsKey(r.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_2) || val$attributes.containsKey(r.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_3) || val$attributes.containsKey(r.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_4) || val$attributes.containsKey(r.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_5) || val$attributes.containsKey(r.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_6) || val$attributes.containsKey(r.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_7) || val$attributes.containsKey(r.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_8) || val$attributes.containsKey(r.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_9) || val$attributes.containsKey(r.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_10))
        {
            TreeMap treemap = new TreeMap();
            if (val$attributes.containsKey(r.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_1))
            {
                treemap.put(r.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_1, val$attributes.get(r.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_1));
            }
            if (val$attributes.containsKey(r.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_2))
            {
                treemap.put(r.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_2, val$attributes.get(r.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_2));
            }
            if (val$attributes.containsKey(r.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_3))
            {
                treemap.put(r.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_3, val$attributes.get(r.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_3));
            }
            if (val$attributes.containsKey(r.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_4))
            {
                treemap.put(r.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_4, val$attributes.get(r.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_4));
            }
            if (val$attributes.containsKey(r.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_5))
            {
                treemap.put(r.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_5, val$attributes.get(r.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_5));
            }
            if (val$attributes.containsKey(r.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_6))
            {
                treemap.put(r.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_6, val$attributes.get(r.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_6));
            }
            if (val$attributes.containsKey(r.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_7))
            {
                treemap.put(r.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_7, val$attributes.get(r.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_7));
            }
            if (val$attributes.containsKey(r.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_8))
            {
                treemap.put(r.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_8, val$attributes.get(r.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_8));
            }
            if (val$attributes.containsKey(r.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_9))
            {
                treemap.put(r.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_9, val$attributes.get(r.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_9));
            }
            obj = treemap;
            if (val$attributes.containsKey(r.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_10))
            {
                treemap.put(r.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_10, val$attributes.get(r.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_10));
                obj = treemap;
            }
        } else
        {
            obj = null;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    r.AttributesDbColumns()
    {
        this$0 = final_sessionhandler;
        val$event = s;
        val$attributes = map;
        val$clv = Long.this;
        super();
    }
}
