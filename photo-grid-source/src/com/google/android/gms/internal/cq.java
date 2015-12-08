// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.zzp;

// Referenced classes of package com.google.android.gms.internal:
//            cv, cs, ct, cr, 
//            cu

public abstract class cq
{

    private final String a;
    private final Object b;

    private cq(String s, Object obj)
    {
        a = s;
        b = obj;
        zzp.zzbD().a(this);
    }

    cq(String s, Object obj, byte byte0)
    {
        this(s, obj);
    }

    public static cq a(String s)
    {
        s = a(s, ((String) (null)));
        zzp.zzbD().b(s);
        return s;
    }

    public static cq a(String s, int i)
    {
        return new cs(s, Integer.valueOf(i));
    }

    public static cq a(String s, long l)
    {
        return new ct(s, Long.valueOf(l));
    }

    public static cq a(String s, Boolean boolean1)
    {
        return new cr(s, boolean1);
    }

    public static cq a(String s, String s1)
    {
        return new cu(s, s1);
    }

    public static cq b(String s)
    {
        s = a(s, ((String) (null)));
        zzp.zzbD().c(s);
        return s;
    }

    protected abstract Object a(SharedPreferences sharedpreferences);

    public final String a()
    {
        return a;
    }

    public final Object b()
    {
        return b;
    }
}
