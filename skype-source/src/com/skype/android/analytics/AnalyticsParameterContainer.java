// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.analytics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

// Referenced classes of package com.skype.android.analytics:
//            AnalyticsParameter

public class AnalyticsParameterContainer extends LinkedHashMap
{

    public AnalyticsParameterContainer()
    {
    }

    public final Object a(AnalyticsParameter analyticsparameter, Object obj)
    {
        Object obj1;
        if (obj == null)
        {
            obj1 = "[NULL]";
        } else
        {
            obj1 = obj;
            if (!analyticsparameter.a().isInstance(obj))
            {
                throw new IllegalArgumentException((new StringBuilder()).append(obj.getClass().getName()).append(" is not an instance of ").append(analyticsparameter.a().getName()).toString());
            }
        }
        return super.put(analyticsparameter, obj1);
    }

    public final void a(HashMap hashmap)
    {
        java.util.Map.Entry entry;
        for (Iterator iterator = entrySet().iterator(); iterator.hasNext(); hashmap.put(((AnalyticsParameter)entry.getKey()).name(), entry.getValue().toString()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

    }

    public Object put(Object obj, Object obj1)
    {
        return a((AnalyticsParameter)obj, obj1);
    }
}
