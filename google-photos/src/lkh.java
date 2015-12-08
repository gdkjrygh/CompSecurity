// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.nearby.messages.Strategy;

public final class lkh
{

    public int a;
    public int b;
    private int c;
    private int d;

    public lkh()
    {
        c = 3;
        a = 300;
        d = 0;
        b = 1;
    }

    public final Strategy a()
    {
        if (b == 2 && c != 3)
        {
            throw new IllegalStateException("Discovery mode must be DISCOVERY_MODE_DEFAULT.");
        } else
        {
            return new Strategy(2, 0, a, 0, false, b, c);
        }
    }
}
