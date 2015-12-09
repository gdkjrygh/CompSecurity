// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.n;
import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package android.support.v7.internal.widget:
//            ActivityChooserView, s, m

final class t
    implements android.view.View.OnClickListener, android.view.View.OnLongClickListener, android.widget.AdapterView.OnItemClickListener, android.widget.PopupWindow.OnDismissListener
{

    final ActivityChooserView a;

    public final void onClick(View view)
    {
        if (view == ActivityChooserView.c(a))
        {
            a.a();
            view = ActivityChooserView.a(a).b();
            int i = ActivityChooserView.a(a).d().a(view);
            view = ActivityChooserView.a(a).d().b(i);
            if (view != null)
            {
                view.addFlags(0x80000);
                a.getContext().startActivity(view);
            }
            return;
        }
        if (view == ActivityChooserView.d(a))
        {
            ActivityChooserView.a(a, false);
            ActivityChooserView.a(a, ActivityChooserView.e(a));
            return;
        } else
        {
            throw new IllegalArgumentException();
        }
    }

    public final void onDismiss()
    {
        if (ActivityChooserView.f(a) != null)
        {
            ActivityChooserView.f(a).onDismiss();
        }
        if (a.a != null)
        {
            a.a.a(false);
        }
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        ((s)adapterview.getAdapter()).getItemViewType(i);
        JVM INSTR tableswitch 0 1: default 32
    //                   0 50
    //                   1 40;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException();
_L3:
        ActivityChooserView.a(a, 0x7fffffff);
_L5:
        return;
_L2:
        a.a();
        if (!ActivityChooserView.b(a))
        {
            break; /* Loop/switch isn't completed */
        }
        if (i > 0)
        {
            ActivityChooserView.a(a).d().c(i);
            return;
        }
        if (true) goto _L5; else goto _L4
_L4:
        if (!ActivityChooserView.a(a).e())
        {
            i++;
        }
        adapterview = ActivityChooserView.a(a).d().b(i);
        if (adapterview != null)
        {
            adapterview.addFlags(0x80000);
            a.getContext().startActivity(adapterview);
            return;
        }
        if (true) goto _L5; else goto _L6
_L6:
    }

    public final boolean onLongClick(View view)
    {
        if (view == ActivityChooserView.c(a))
        {
            if (ActivityChooserView.a(a).getCount() > 0)
            {
                ActivityChooserView.a(a, true);
                ActivityChooserView.a(a, ActivityChooserView.e(a));
            }
            return true;
        } else
        {
            throw new IllegalArgumentException();
        }
    }
}
