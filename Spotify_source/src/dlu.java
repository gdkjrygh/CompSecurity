// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.cast.CastDevice;

final class dlu
    implements boo
{

    private dls a;

    private dlu(dls dls1)
    {
        a = dls1;
        super();
    }

    dlu(dls dls1, byte byte0)
    {
        this(dls1);
    }

    public final void a(CastDevice castdevice, String s)
    {
        dls dls1 = a;
        castdevice = castdevice.a();
        dls1.c.a(castdevice, s);
    }
}
