// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.formats.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            rk, mv

final class mz
    implements rk
{

    final String a;
    final Integer b;
    final Integer c;
    final int d;
    final int e;
    final int f;
    final mv g;

    mz(mv mv1, String s, Integer integer, Integer integer1, int i, int j, int k)
    {
        g = mv1;
        a = s;
        b = integer;
        c = integer1;
        d = i;
        e = j;
        f = k;
        super();
    }

    private zza a(List list)
    {
        if (list == null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        String s;
        List list1;
        Integer integer;
        Integer integer1;
        try
        {
            if (list.isEmpty())
            {
                break MISSING_BLOCK_LABEL_93;
            }
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            zzb.zzb("Could not get attribution icon", list);
            return null;
        }
        s = a;
        list1 = mv.a(list);
        integer = b;
        integer1 = c;
        if (d <= 0)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        list = Integer.valueOf(d);
_L1:
        list = new zza(s, list1, integer, integer1, list, e + f);
        return list;
        list = null;
          goto _L1
        return null;
    }

    public final Object a(Object obj)
    {
        return a((List)obj);
    }
}
