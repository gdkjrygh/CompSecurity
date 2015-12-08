// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b;


// Referenced classes of package com.google.b:
//            p

public final class h extends p
{

    private static final h b = new h();

    private h()
    {
    }

    private h(Throwable throwable)
    {
        super(throwable);
    }

    public static h a()
    {
        if (a)
        {
            return new h();
        } else
        {
            return b;
        }
    }

    public static h a(Throwable throwable)
    {
        if (a)
        {
            return new h(throwable);
        } else
        {
            return b;
        }
    }

}
