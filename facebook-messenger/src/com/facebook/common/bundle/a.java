// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.bundle;

import android.os.Bundle;
import com.google.common.a.ik;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class a
{

    public a()
    {
    }

    public static Bundle a(Map map)
    {
        Bundle bundle = new Bundle();
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); bundle.putInt((String)entry.getKey(), ((Integer)entry.getValue()).intValue()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

        return bundle;
    }

    public static Map a(Bundle bundle)
    {
        java.util.HashMap hashmap = ik.a(bundle.size());
        String s;
        for (Iterator iterator = bundle.keySet().iterator(); iterator.hasNext(); hashmap.put(s, Integer.valueOf(bundle.getInt(s))))
        {
            s = (String)iterator.next();
        }

        return hashmap;
    }
}
