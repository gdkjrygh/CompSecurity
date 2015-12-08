// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.support.v4.view.n;
import android.view.View;
import android.widget.AdapterView;
import java.util.List;

// Referenced classes of package android.support.v7.internal.widget:
//            ActivityChooserView, t, j, k, 
//            m

final class u
    implements android.view.View.OnClickListener, android.view.View.OnLongClickListener, android.widget.AdapterView.OnItemClickListener, android.widget.PopupWindow.OnDismissListener
{

    final ActivityChooserView a;

    u(ActivityChooserView activitychooserview)
    {
        a = activitychooserview;
        super();
    }

    public final void onClick(View view)
    {
        if (view == ActivityChooserView.e(a))
        {
            a.b();
            view = ActivityChooserView.a(a).a.b();
            int i = ActivityChooserView.a(a).a.a(view);
            view = ActivityChooserView.a(a).a.b(i);
            if (view != null)
            {
                view.addFlags(0x80000);
                a.getContext().startActivity(view);
            }
            return;
        }
        if (view == ActivityChooserView.f(a))
        {
            ActivityChooserView.a(a, false);
            ActivityChooserView.a(a, ActivityChooserView.g(a));
            return;
        } else
        {
            throw new IllegalArgumentException();
        }
    }

    public final void onDismiss()
    {
        if (ActivityChooserView.h(a) != null)
        {
            ActivityChooserView.h(a).onDismiss();
        }
        if (a.a != null)
        {
            a.a.a(false);
        }
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        ((t)adapterview.getAdapter()).getItemViewType(i);
        JVM INSTR tableswitch 0 1: default 32
    //                   0 50
    //                   1 40;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException();
_L3:
        ActivityChooserView.a(a, 0x7fffffff);
_L10:
        return;
_L2:
        a.b();
        if (!ActivityChooserView.d(a)) goto _L5; else goto _L4
_L4:
        if (i <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        view = ActivityChooserView.a(a).a;
        adapterview = ((AdapterView) (((j) (view)).a));
        adapterview;
        JVM INSTR monitorenter ;
        k k1;
        k k2;
        view.d();
        k1 = (k)((j) (view)).b.get(i);
        k2 = (k)((j) (view)).b.get(0);
        if (k2 == null) goto _L7; else goto _L6
_L6:
        float f = (k2.b - k1.b) + 5F;
_L8:
        view.a(new m(new ComponentName(k1.a.activityInfo.packageName, k1.a.activityInfo.name), System.currentTimeMillis(), f));
        adapterview;
        JVM INSTR monitorexit ;
        return;
        view;
        adapterview;
        JVM INSTR monitorexit ;
        throw view;
_L7:
        f = 1.0F;
          goto _L8
_L5:
        if (!ActivityChooserView.a(a).b)
        {
            i++;
        }
        adapterview = ActivityChooserView.a(a).a.b(i);
        if (adapterview != null)
        {
            adapterview.addFlags(0x80000);
            a.getContext().startActivity(adapterview);
            return;
        }
        if (true) goto _L10; else goto _L9
_L9:
    }

    public final boolean onLongClick(View view)
    {
        if (view == ActivityChooserView.e(a))
        {
            if (ActivityChooserView.a(a).getCount() > 0)
            {
                ActivityChooserView.a(a, true);
                ActivityChooserView.a(a, ActivityChooserView.g(a));
            }
            return true;
        } else
        {
            throw new IllegalArgumentException();
        }
    }
}
