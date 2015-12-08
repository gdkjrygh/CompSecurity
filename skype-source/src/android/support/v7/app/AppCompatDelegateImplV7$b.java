// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.support.v4.view.af;
import android.support.v4.view.ak;
import android.support.v4.view.x;
import android.support.v7.internal.widget.ActionBarContextView;
import android.support.v7.view.a;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.PopupWindow;

// Referenced classes of package android.support.v7.app:
//            AppCompatDelegateImplV7, d

final class b
    implements android.support.v7.view.
{

    final AppCompatDelegateImplV7 a;
    private android.support.v7.view. b;

    public final void a(a a1)
    {
        b.(a1);
        if (a.o != null)
        {
            a.b.getDecorView().removeCallbacks(a.p);
        }
        if (a.n != null)
        {
            AppCompatDelegateImplV7.d(a);
            a.q = x.s(a.n).a(0.0F);
            a.q.a(new ak() {

                final AppCompatDelegateImplV7.b a;

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

            
            {
                a = AppCompatDelegateImplV7.b.this;
                super();
            }
            });
        }
        if (a.e != null)
        {
            a.e.onSupportActionModeFinished(a.m);
        }
        a.m = null;
    }

    public final boolean a(a a1, Menu menu)
    {
        return b.(a1, menu);
    }

    public final boolean a(a a1, MenuItem menuitem)
    {
        return b.(a1, menuitem);
    }

    public final boolean b(a a1, Menu menu)
    {
        return b.(a1, menu);
    }

    public _cls1.a(AppCompatDelegateImplV7 appcompatdelegateimplv7, android.support.v7.view..a a1)
    {
        a = appcompatdelegateimplv7;
        super();
        b = a1;
    }
}
