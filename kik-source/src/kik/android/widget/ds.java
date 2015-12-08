// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.view.View;
import kik.android.util.cv;

// Referenced classes of package kik.android.widget:
//            dl

final class ds
    implements android.view.View.OnLongClickListener
{

    final View a;
    final dl b;

    ds(dl dl1, View view)
    {
        b = dl1;
        a = view;
        super();
    }

    public final boolean onLongClick(View view)
    {
        cv.a(a);
        dl.a(b, view);
        return true;
    }
}
