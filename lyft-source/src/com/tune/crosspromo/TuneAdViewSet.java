// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tune.crosspromo;


// Referenced classes of package com.tune.crosspromo:
//            TuneAdView

public class TuneAdViewSet
{

    public String a;
    public TuneAdView b;
    public TuneAdView c;
    public boolean d;

    public TuneAdViewSet(String s, TuneAdView tuneadview, TuneAdView tuneadview1)
    {
        a = s;
        b = tuneadview;
        c = tuneadview1;
        d = true;
    }

    protected void a()
    {
        boolean flag;
        if (!d)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
    }

    protected TuneAdView b()
    {
        if (d)
        {
            return b;
        } else
        {
            return c;
        }
    }

    protected TuneAdView c()
    {
        if (d)
        {
            return c;
        } else
        {
            return b;
        }
    }
}
