// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.ListPopupWindow;

public final class aan
    implements Runnable
{

    private ListPopupWindow a;

    private aan(ListPopupWindow listpopupwindow)
    {
        a = listpopupwindow;
        super();
    }

    public aan(ListPopupWindow listpopupwindow, byte byte0)
    {
        this(listpopupwindow);
    }

    public final void run()
    {
        a.e();
    }
}
