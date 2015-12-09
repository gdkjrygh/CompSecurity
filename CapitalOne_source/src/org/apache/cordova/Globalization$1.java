// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import java.util.Comparator;
import java.util.Map;

// Referenced classes of package org.apache.cordova:
//            Globalization

class val.namesMap
    implements Comparator
{

    final Globalization this$0;
    final Map val$namesMap;

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((String)obj, (String)obj1);
    }

    public int compare(String s, String s1)
    {
        return ((Integer)val$namesMap.get(s)).compareTo((Integer)val$namesMap.get(s1));
    }

    ()
    {
        this$0 = final_globalization;
        val$namesMap = Map.this;
        super();
    }
}
