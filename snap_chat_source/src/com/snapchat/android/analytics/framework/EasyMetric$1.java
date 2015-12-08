// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics.framework;


// Referenced classes of package com.snapchat.android.analytics.framework:
//            EasyMetric

class a
    implements Runnable
{

    private boolean a;
    private EasyMetric b;

    public void run()
    {
        EasyMetric.a(b, a);
    }

    (EasyMetric easymetric, boolean flag)
    {
        b = easymetric;
        a = flag;
        super();
    }
}
