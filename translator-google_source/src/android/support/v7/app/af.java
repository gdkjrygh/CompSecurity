// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.support.v4.view.bt;
import android.support.v4.view.dq;
import android.support.v4.view.eh;
import android.support.v7.internal.widget.ActionBarContextView;
import android.view.View;
import android.widget.PopupWindow;

// Referenced classes of package android.support.v7.app:
//            ae, AppCompatDelegateImplV7

final class af extends eh
{

    final ae a;

    af(ae ae1)
    {
        a = ae1;
        super();
    }

    public final void b(View view)
    {
        a.a.q.setVisibility(8);
        if (a.a.r == null) goto _L2; else goto _L1
_L1:
        a.a.r.dismiss();
_L4:
        a.a.q.removeAllViews();
        a.a.t.a(null);
        a.a.t = null;
        return;
_L2:
        if (a.a.q.getParent() instanceof View)
        {
            bt.p((View)a.a.q.getParent());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
