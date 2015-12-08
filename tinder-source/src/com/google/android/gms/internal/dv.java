// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzr

public final class dv
{
    public static interface a
    {

        public abstract void a(zzr zzr);
    }

    public static interface b
    {

        public abstract void a(Object obj);
    }


    public final Object a;
    public final g.a b;
    public final zzr c;
    public boolean d;

    dv(zzr zzr)
    {
        d = false;
        a = null;
        b = null;
        c = zzr;
    }

    dv(Object obj, g.a a1)
    {
        d = false;
        a = obj;
        b = a1;
        c = null;
    }
}
