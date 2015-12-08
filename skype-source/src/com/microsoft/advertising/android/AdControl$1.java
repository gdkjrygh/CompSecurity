// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;


// Referenced classes of package com.microsoft.advertising.android:
//            AdControl

final class a
    implements Runnable
{

    final AdControl a;

    public final void run()
    {
        boolean flag1 = false;
        AdControl adcontrol;
        int i;
        boolean flag;
        if (a.e() && !a.j())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (AdControl.a(a) == 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (flag)
        {
            i = 0;
        }
        if (!a.a(a) && flag)
        {
            AdControl.a(a, a);
            a.requestLayout();
        } else
        if (a.a(a) && !flag)
        {
            AdControl.a(a, b);
            a.requestLayout();
        }
        adcontrol = a;
        if (i != 0)
        {
            i = ((flag1) ? 1 : 0);
        } else
        {
            i = 4;
        }
        AdControl.a(adcontrol, i);
    }

    (AdControl adcontrol)
    {
        a = adcontrol;
        super();
    }
}
