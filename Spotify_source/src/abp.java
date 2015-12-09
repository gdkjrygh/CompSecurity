// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

public final class abp extends hv
{

    final RecyclerView b;
    final hv c = new hv() {

        private abp b;

        public final void a(View view, nb nb1)
        {
            super.a(view, nb1);
            if (!b.a() && b.b.f != null)
            {
                b.b.f.a(view, nb1);
            }
        }

        public final boolean a(View view, int i, Bundle bundle)
        {
            boolean flag1 = false;
            boolean flag;
            if (super.a(view, i, bundle))
            {
                flag = true;
            } else
            {
                flag = flag1;
                if (!b.a())
                {
                    flag = flag1;
                    if (b.b.f != null)
                    {
                        view = b.b.f;
                        bundle = ((abd) (view)).k.a;
                        view = ((abd) (view)).k.q;
                        return false;
                    }
                }
            }
            return flag;
        }

            
            {
                b = abp.this;
                super();
            }
    };

    public abp(RecyclerView recyclerview)
    {
        b = recyclerview;
    }

    public final void a(View view, nb nb1)
    {
        super.a(view, nb1);
        nb1.b(android/support/v7/widget/RecyclerView.getName());
        if (!a() && b.f != null)
        {
            view = b.f;
            abh abh = ((abd) (view)).k.a;
            abm abm = ((abd) (view)).k.q;
            if (km.b(((abd) (view)).k, -1) || km.a(((abd) (view)).k, -1))
            {
                nb1.a(8192);
                nb1.i(true);
            }
            if (km.b(((abd) (view)).k, 1) || km.a(((abd) (view)).k, 1))
            {
                nb1.a(4096);
                nb1.i(true);
            }
            int i = view.a(abh, abm);
            int j = view.b(abh, abm);
            view = new nm(nb.n().a(i, j));
            nb.a.b(nb1.b, ((nm)view).a);
        }
    }

    final boolean a()
    {
        RecyclerView recyclerview = b;
        return !recyclerview.h || recyclerview.i || recyclerview.b.d();
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
        if (a()) goto _L4; else goto _L3
_L3:
        flag = flag1;
        if (b.f == null) goto _L4; else goto _L5
_L5:
        view = b.f;
        bundle = ((abd) (view)).k.a;
        bundle = ((abd) (view)).k.q;
        flag = flag1;
        if (((abd) (view)).k == null) goto _L4; else goto _L6
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
        ((abd) (view)).k.scrollBy(i, j);
        return true;
_L9:
        int k;
        int l;
        int i1;
        if (km.b(((abd) (view)).k, -1))
        {
            i = -(view.r() - view.t() - view.v());
        } else
        {
            i = 0;
        }
        j = i;
        if (!km.a(((abd) (view)).k, -1)) goto _L12; else goto _L11
_L11:
        k = -(view.q() - view.s() - view.u());
        j = i;
        i = k;
          goto _L13
_L8:
        if (km.b(((abd) (view)).k, 1))
        {
            i = view.r() - view.t() - view.v();
        } else
        {
            i = 0;
        }
        j = i;
        if (!km.a(((abd) (view)).k, 1)) goto _L12; else goto _L14
_L14:
        k = view.q();
        l = view.s();
        i1 = view.u();
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
        if ((view instanceof RecyclerView) && !a())
        {
            view = (RecyclerView)view;
            if (((RecyclerView) (view)).f != null)
            {
                ((RecyclerView) (view)).f.a(accessibilityevent);
            }
        }
    }
}
