// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.diagnostics;

import android.view.View;
import java.util.LinkedList;

// Referenced classes of package com.snapchat.android.ui.diagnostics:
//            DiagnosticsView

final class a
    implements android.view.er
{

    private notifyDataSetChanged a;

    public final void onClick(View view)
    {
        view = a;
        ((a) (view)).a.clear();
        view.notifyDataSetChanged();
    }

    ( )
    {
        a = ;
        super();
    }
}
