// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.widget.PopupWindow;

// Referenced classes of package android.support.v7.widget:
//            j

private final class <init>
    implements Runnable
{

    final j a;

    public final void run()
    {
        if (j.a(a) != null && j.a(a).getCount() > j.a(a).getChildCount() && j.a(a).getChildCount() <= a.b)
        {
            j.b(a).setInputMethodMode(2);
            a.c();
        }
    }

    private (j j1)
    {
        a = j1;
        super();
    }

    a(j j1, byte byte0)
    {
        this(j1);
    }
}
