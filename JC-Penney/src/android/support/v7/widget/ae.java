// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            ac

class ae
    implements Runnable
{

    final ac a;

    ae(ac ac1)
    {
        a = ac1;
        super();
    }

    public void run()
    {
        View view = a.e();
        if (view != null && view.getWindowToken() != null)
        {
            a.c();
        }
    }
}
