// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            be, xm

public final class vo
{

    public final Object a;
    public final be b;
    public final xm c;
    public boolean d;

    private vo(xm xm)
    {
        d = false;
        a = null;
        b = null;
        c = xm;
    }

    private vo(Object obj, be be)
    {
        d = false;
        a = obj;
        b = be;
        c = null;
    }

    public static vo a(xm xm)
    {
        return new vo(xm);
    }

    public static vo a(Object obj, be be)
    {
        return new vo(obj, be);
    }
}
