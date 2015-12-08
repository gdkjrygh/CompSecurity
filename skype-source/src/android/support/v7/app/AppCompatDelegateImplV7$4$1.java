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

    final a a;

    public final void a(View view)
    {
        a.a.n.setVisibility(0);
    }

    public final void b(View view)
    {
        x.c(a.a.n, 1.0F);
        a.a.q.a(null);
        a.a.q = null;
    }

    View(View view)
    {
        a = view;
        super();
    }

    // Unreferenced inner class android/support/v7/app/AppCompatDelegateImplV7$4

/* anonymous class */
    final class AppCompatDelegateImplV7._cls4
        implements Runnable
    {

        final AppCompatDelegateImplV7 a;

        public final void run()
        {
            a.o.showAtLocation(a.n, 55, 0, 0);
            AppCompatDelegateImplV7.d(a);
            x.c(a.n, 0.0F);
            a.q = x.s(a.n).a(1.0F);
            a.q.a(new AppCompatDelegateImplV7._cls4._cls1(this));
        }

            
            {
                a = appcompatdelegateimplv7;
                super();
            }
    }

}
