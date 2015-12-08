// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.view.View;

// Referenced classes of package kik.android.widget:
//            dl

final class dr
    implements android.widget.PopupWindow.OnDismissListener
{

    final View a;
    final dl b;

    dr(dl dl1, View view)
    {
        b = dl1;
        a = view;
        super();
    }

    public final void onDismiss()
    {
        dl.b(b, a);
    }
}
