// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.b;

import com.google.android.gms.common.internal.zzx;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.b:
//            ah

public final class g extends ah
{

    public final Map a = new HashMap();

    public g()
    {
    }

    public static String a(String s)
    {
        zzx.zzcs(s);
        String s1 = s;
        if (s != null)
        {
            s1 = s;
            if (s.startsWith("&"))
            {
                s1 = s.substring(1);
            }
        }
        zzx.zzh(s1, "Name can not be empty or \"&\"");
        return s1;
    }

    public final void a(ah ah1)
    {
        ah1 = (g)ah1;
        zzx.zzv(ah1);
        ((g) (ah1)).a.putAll(a);
    }

    public final String toString()
    {
        return ah.a(a, 0);
    }
}
