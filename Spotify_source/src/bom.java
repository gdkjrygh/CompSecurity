// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.cast.CastDevice;

public final class bom
{

    CastDevice a;
    bon b;

    public bom(CastDevice castdevice, bon bon)
    {
        btl.a(castdevice, "CastDevice parameter cannot be null");
        btl.a(bon, "CastListener parameter cannot be null");
        a = castdevice;
        b = bon;
    }

    public final bol a()
    {
        return new bol(this, (byte)0);
    }
}
