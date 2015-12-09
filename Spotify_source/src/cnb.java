// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.internal.zzr;

public final class cnb
{

    public final Object a;
    public final bzy b;
    public final zzr c;
    public boolean d;

    cnb(zzr zzr)
    {
        d = false;
        a = null;
        b = null;
        c = zzr;
    }

    private cnb(Object obj, bzy bzy)
    {
        d = false;
        a = obj;
        b = bzy;
        c = null;
    }

    public static cnb a(Object obj, bzy bzy)
    {
        return new cnb(obj, bzy);
    }
}
