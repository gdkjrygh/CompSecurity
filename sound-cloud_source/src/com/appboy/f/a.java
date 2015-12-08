// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.f;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class a
{

    public static Bundle a(Map map)
    {
        Bundle bundle = new Bundle();
        if (map != null)
        {
            java.util.Map.Entry entry;
            for (map = map.entrySet().iterator(); map.hasNext(); bundle.putString((String)entry.getKey(), (String)entry.getValue()))
            {
                entry = (java.util.Map.Entry)map.next();
            }

        }
        return bundle;
    }
}
