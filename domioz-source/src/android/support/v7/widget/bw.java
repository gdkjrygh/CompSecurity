// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.os.Bundle;
import android.support.v4.view.a;
import android.support.v4.view.a.f;
import android.support.v4.view.a.o;
import android.support.v4.view.bp;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v7.widget:
//            bx, RecyclerView, bj

public final class bw extends a
{

    final RecyclerView b;
    final a c = new bx(this);

    public bw(RecyclerView recyclerview)
    {
        b = recyclerview;
    }

    public final void a(View view, f f1)
    {
        super.a(view, f1);
        f1.a(android/support/v7/widget/RecyclerView.getName());
        if (!b.g() && b.b() != null)
        {
            view = b.b();
            bm bm = ((bj) (view)).i.a;
            bs bs = ((bj) (view)).i.e;
            if (bp.b(((bj) (view)).i, -1) || bp.a(((bj) (view)).i, -1))
            {
                f1.a(8192);
                f1.c();
            }
            if (bp.b(((bj) (view)).i, 1) || bp.a(((bj) (view)).i, 1))
            {
                f1.a(4096);
                f1.c();
            }
            f1.a(o.a(view.b(bm, bs), view.c(bm, bs)));
        }
    }

    public final boolean a(View view, int i, Bundle bundle)
    {
        boolean flag1 = false;
        if (!super.a(view, i, bundle)) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (b.g()) goto _L4; else goto _L3
_L3:
        flag = flag1;
        if (b.b() == null) goto _L4; else goto _L5
_L5:
        view = b.b();
        bundle = ((bj) (view)).i.a;
        bundle = ((bj) (view)).i.e;
        flag = flag1;
        if (((bj) (view)).i == null) goto _L4; else goto _L6
_L6:
        i;
        JVM INSTR lookupswitch 2: default 108
    //                   4096: 205
    //                   8192: 138;
           goto _L7 _L8 _L9
_L7:
        int j;
        i = 0;
        j = 0;
_L13:
        if (j != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (i == 0) goto _L4; else goto _L10
_L10:
        ((bj) (view)).i.scrollBy(i, j);
        return true;
_L9:
        int k;
        int l;
        int i1;
        if (bp.b(((bj) (view)).i, -1))
        {
            i = -(view.l() - view.n() - view.p());
        } else
        {
            i = 0;
        }
        j = i;
        if (!bp.a(((bj) (view)).i, -1)) goto _L12; else goto _L11
_L11:
        k = -(view.k() - view.m() - view.o());
        j = i;
        i = k;
          goto _L13
_L8:
        if (bp.b(((bj) (view)).i, 1))
        {
            i = view.l() - view.n() - view.p();
        } else
        {
            i = 0;
        }
        j = i;
        if (!bp.a(((bj) (view)).i, 1)) goto _L12; else goto _L14
_L14:
        k = view.k();
        l = view.m();
        i1 = view.o();
        j = i;
        i = k - l - i1;
          goto _L13
_L12:
        i = 0;
          goto _L13
    }

    public final void d(View view, AccessibilityEvent accessibilityevent)
    {
        super.d(view, accessibilityevent);
        accessibilityevent.setClassName(android/support/v7/widget/RecyclerView.getName());
        if ((view instanceof RecyclerView) && !b.g())
        {
            view = (RecyclerView)view;
            if (view.b() != null)
            {
                view.b().a(accessibilityevent);
            }
        }
    }
}
