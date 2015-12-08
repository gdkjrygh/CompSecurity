// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.support.v4.view.af;
import android.support.v4.view.ak;
import android.support.v4.view.x;
import android.support.v7.internal.widget.ActionBarContextView;
import android.view.View;
import android.widget.PopupWindow;

// Referenced classes of package android.support.v7.app:
//            AppCompatDelegateImplV7

final class a extends ak
{

    final View.getParent a;

    public final void b(View view)
    {
        a.a.n.setVisibility(8);
        if (a.a.o == null) goto _L2; else goto _L1
_L1:
        a.a.o.dismiss();
_L4:
        a.a.n.removeAllViews();
        a.a.q.a(null);
        a.a.q = null;
        return;
_L2:
        if (a.a.n.getParent() instanceof View)
        {
            x.w((View)a.a.n.getParent());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    View(View view)
    {
        a = view;
        super();
    }
}
