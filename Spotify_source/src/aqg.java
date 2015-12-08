// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.net.URI;

public final class aqg
{

    Context a;
    URI b;
    aqi c;
    boolean d;
    Object e;

    private aqg(aqh aqh1)
    {
        a = aqh1.a;
        b = aqh1.b;
        c = aqh1.c;
        d = aqh1.d;
        if (aqh1.e == null)
        {
            aqh1 = ((aqh) (new Object()));
        } else
        {
            aqh1 = ((aqh) (aqh1.e));
        }
        e = aqh1;
    }

    public aqg(aqh aqh1, byte byte0)
    {
        this(aqh1);
    }
}
