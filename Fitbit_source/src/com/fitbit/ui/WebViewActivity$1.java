// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui;


// Referenced classes of package com.fitbit.ui:
//            WebViewActivity

class a
    implements Runnable
{

    final WebViewActivity a;

    public void run()
    {
        if (!a.g)
        {
            return;
        }
        if (!a.f)
        {
            a.f();
            return;
        }
        try
        {
            a.g();
            return;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }

    (WebViewActivity webviewactivity)
    {
        a = webviewactivity;
        super();
    }
}
