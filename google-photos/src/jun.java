// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.cast.CastDevice;

public final class jun
{

    CastDevice a;
    juo b;
    private int c;

    public jun(CastDevice castdevice, juo juo)
    {
        b.f(castdevice, "CastDevice parameter cannot be null");
        b.f(juo, "CastListener parameter cannot be null");
        a = castdevice;
        b = juo;
        c = 0;
    }
}
