// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.content.Intent;
import android.location.Location;
import com.google.android.gms.internal.zzpk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class h
{

    private final int a;
    private final int b;
    private final List c;
    private final Location d;

    private h(int i, int j, List list, Location location)
    {
        a = i;
        b = j;
        c = list;
        d = location;
    }

    public static h a(Intent intent)
    {
        Object obj;
        Object obj1;
        int i;
        int k;
label0:
        {
            obj = null;
            byte byte0 = -1;
            if (intent == null)
            {
                return null;
            }
            k = intent.getIntExtra("gms_error_code", -1);
            int j = intent.getIntExtra("com.google.android.location.intent.extra.transition", -1);
            i = byte0;
            if (j == -1)
            {
                break label0;
            }
            if (j != 1 && j != 2)
            {
                i = byte0;
                if (j != 4)
                {
                    break label0;
                }
            }
            i = j;
        }
        obj1 = (ArrayList)intent.getSerializableExtra("com.google.android.location.intent.extra.geofence_list");
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        return new h(k, i, ((List) (obj)), (Location)intent.getParcelableExtra("com.google.android.location.intent.extra.triggering_location"));
_L2:
        ArrayList arraylist = new ArrayList(((ArrayList) (obj1)).size());
        obj1 = ((ArrayList) (obj1)).iterator();
        do
        {
            obj = arraylist;
            if (!((Iterator) (obj1)).hasNext())
            {
                continue;
            }
            arraylist.add(zzpk.a((byte[])((Iterator) (obj1)).next()));
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
    }

    public final int a()
    {
        return b;
    }

    public final Location b()
    {
        return d;
    }
}
