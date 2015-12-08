// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class zzia
{

    public static void zza(StringBuilder stringbuilder, HashMap hashmap)
    {
        stringbuilder.append("{");
        Iterator iterator = hashmap.keySet().iterator();
        boolean flag = true;
        while (iterator.hasNext()) 
        {
            String s = (String)iterator.next();
            String s1;
            if (!flag)
            {
                stringbuilder.append(",");
            } else
            {
                flag = false;
            }
            s1 = (String)hashmap.get(s);
            stringbuilder.append("\"").append(s).append("\":");
            if (s1 == null)
            {
                stringbuilder.append("null");
            } else
            {
                stringbuilder.append("\"").append(s1).append("\"");
            }
        }
        stringbuilder.append("}");
    }
}
