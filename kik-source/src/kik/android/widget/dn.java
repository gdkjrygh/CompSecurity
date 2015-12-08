// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package kik.android.widget:
//            dl

final class dn
    implements android.widget.AdapterView.OnItemClickListener
{

    final dl a;

    dn(dl dl1)
    {
        a = dl1;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        dl.a(a, view, false);
    }
}
