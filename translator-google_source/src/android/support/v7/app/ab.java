// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.support.v4.view.bt;
import android.support.v4.view.dq;
import android.support.v4.view.eh;
import android.support.v7.internal.widget.ActionBarContextView;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//            aa, AppCompatDelegateImplV7

final class ab extends eh
{

    final aa a;

    ab(aa aa1)
    {
        a = aa1;
        super();
    }

    public final void a(View view)
    {
        a.a.q.setVisibility(0);
    }

    public final void b(View view)
    {
        bt.b(a.a.q, 1.0F);
        a.a.t.a(null);
        a.a.t = null;
    }
}
