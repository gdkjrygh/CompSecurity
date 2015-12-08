// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.PopupWindow;

final class aeb
    implements Runnable
{

    private adq a;

    aeb(adq adq1)
    {
        a = adq1;
        super();
    }

    public final void run()
    {
        if (adq.a(a) != null && adq.a(a).getCount() > adq.a(a).getChildCount() && adq.a(a).getChildCount() <= a.j)
        {
            adq.b(a).setInputMethodMode(2);
            a.b();
        }
    }
}
