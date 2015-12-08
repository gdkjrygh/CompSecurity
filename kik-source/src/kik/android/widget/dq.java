// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.view.View;

// Referenced classes of package kik.android.widget:
//            dl

final class dq
    implements android.view.View.OnClickListener
{

    final dl a;

    dq(dl dl1)
    {
        a = dl1;
        super();
    }

    public final void onClick(View view)
    {
        dl.a(a, view, true);
    }
}
