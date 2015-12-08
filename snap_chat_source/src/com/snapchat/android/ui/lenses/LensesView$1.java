// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.lenses;

import Gt;
import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.snapchat.android.ui.lenses:
//            LensesView

final class a
    implements android.widget.nItemClickListener
{

    private a a;
    private LensesView b;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = ((Gt)b.getAdapter()).a(i);
        LensesView.a(b, null);
        LensesView.a(b, true);
        a.a(adapterview, i);
    }

    er(LensesView lensesview, er er)
    {
        b = lensesview;
        a = er;
        super();
    }
}
