// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            kp

public final class iw
{
    public static interface a
    {

        public abstract void a(kp kp);
    }

    public static interface b
    {

        public abstract void a(Object obj);
    }


    public final Object a;
    public final z.a b;
    public final kp c;
    public boolean d;

    private iw(kp kp)
    {
        d = false;
        a = null;
        b = null;
        c = kp;
    }

    private iw(Object obj, z.a a1)
    {
        d = false;
        a = obj;
        b = a1;
        c = null;
    }

    public static iw a(kp kp)
    {
        return new iw(kp);
    }

    public static iw a(Object obj, z.a a1)
    {
        return new iw(obj, a1);
    }
}
