// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.support.v4.view.bt;
import android.support.v4.view.dq;
import android.widget.PopupWindow;

// Referenced classes of package android.support.v7.app:
//            AppCompatDelegateImplV7, ab

final class aa
    implements Runnable
{

    final AppCompatDelegateImplV7 a;

    aa(AppCompatDelegateImplV7 appcompatdelegateimplv7)
    {
        a = appcompatdelegateimplv7;
        super();
    }

    public final void run()
    {
        a.r.showAtLocation(a.q, 55, 0, 0);
        a.l();
        bt.b(a.q, 0.0F);
        a.t = bt.l(a.q).a(1.0F);
        a.t.a(new ab(this));
    }
}
