// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

public final class ca extends cg
{

    private final String a;
    private final CharSequence b;
    private final CharSequence c[];
    private final boolean d;
    private final Bundle e;

    public final String a()
    {
        return a;
    }

    public final CharSequence b()
    {
        return b;
    }

    public final CharSequence[] c()
    {
        return c;
    }

    public final boolean d()
    {
        return d;
    }

    public final Bundle e()
    {
        return e;
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 20)
        {
            new cb();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            new cd();
        } else
        {
            new cc();
        }
        new Object() {

        };
    }
}
