// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.util;

import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;

public final class PolylineUtility
{

    private PolylineUtility()
    {
    }

    public static List decodePoly(String s)
    {
        ArrayList arraylist;
        int i;
        int j;
        int k;
        int k1;
        arraylist = new ArrayList();
        i = 0;
        k1 = s.length();
        k = 0;
        j = 0;
_L1:
        int l;
        int i1;
        int j1;
        if (i >= k1)
        {
            return arraylist;
        }
        l = 0;
        i1 = 0;
        j1 = i;
_L3:
        i = j1 + 1;
        j1 = s.charAt(j1) - 63;
        i1 |= (j1 & 0x1f) << l;
        l += 5;
        if (j1 >= 32)
        {
            break MISSING_BLOCK_LABEL_231;
        }
        if ((i1 & 1) != 0)
        {
            l = ~(i1 >> 1);
        } else
        {
            l = i1 >> 1;
        }
        j1 = k + l;
        k = 0;
        l = 0;
        i1 = i;
_L2:
label0:
        {
            i = i1 + 1;
            i1 = s.charAt(i1) - 63;
            l |= (i1 & 0x1f) << k;
            k += 5;
            if (i1 >= 32)
            {
                break label0;
            }
            if ((l & 1) != 0)
            {
                k = ~(l >> 1);
            } else
            {
                k = l >> 1;
            }
            j += k;
            arraylist.add(new LatLng((double)j1 / 100000D, (double)j / 100000D));
            k = j1;
        }
          goto _L1
        i1 = i;
          goto _L2
        j1 = i;
          goto _L3
    }
}
