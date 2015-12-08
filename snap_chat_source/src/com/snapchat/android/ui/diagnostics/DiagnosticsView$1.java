// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.diagnostics;

import android.view.View;
import android.widget.ListView;

// Referenced classes of package com.snapchat.android.ui.diagnostics:
//            DiagnosticsView

final class a
    implements android.view.er
{

    private ListView a;

    public final void onClick(View view)
    {
        if (a.getVisibility() == 0)
        {
            a.setVisibility(8);
            return;
        } else
        {
            a.setVisibility(0);
            return;
        }
    }

    (ListView listview)
    {
        a = listview;
        super();
    }
}
