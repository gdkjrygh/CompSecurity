// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.a;

import android.view.animation.AnimationUtils;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.roidapp.imagelib.c;
import com.roidapp.imagelib.filter.filterinfo.IFilterInfo;
import com.roidapp.imagelib.filter.groupinfo.IGroupInfo;
import com.roidapp.imagelib.filter.l;

// Referenced classes of package com.roidapp.imagelib.a:
//            i, h, a

final class t
    implements l
{

    final i a;

    t(i j)
    {
        a = j;
        super();
    }

    public final void a(int j, String s)
    {
        if (j != 0) goto _L2; else goto _L1
_L1:
        i.f(a).setVisibility(8);
_L4:
        i.g(a).setVisibility(8);
_L5:
        i.g(a).setProgress(h.h);
        Object obj = i.i(a);
        boolean flag;
        if (j > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((CheckedTextView) (obj)).setChecked(flag);
        if (!i.d(a).isShown())
        {
            i.d(a).setVisibility(0);
        }
        obj = AnimationUtils.loadAnimation(i.d(a).getContext(), c.b);
        i.d(a).setText(s);
        i.d(a).clearAnimation();
        i.d(a).removeCallbacks(i.j(a));
        i.d(a).postDelayed(i.j(a), 1500L);
        i.d(a).startAnimation(((android.view.animation.Animation) (obj)));
        return;
_L2:
        if (!i.h(a).isShown()) goto _L4; else goto _L3
_L3:
        i.g(a).setVisibility(0);
          goto _L5
    }

    public final void a(IGroupInfo igroupinfo, IFilterInfo ifilterinfo)
    {
        h.d = ifilterinfo.a();
        h.h = 100;
        h.j = igroupinfo;
        h.k = ifilterinfo;
        i.a(a).a(ifilterinfo);
        i.a(a).c(h.h);
    }

    public final void a(boolean flag)
    {
        if (flag)
        {
            i.g(a).setVisibility(8);
            return;
        } else
        {
            i.g(a).setVisibility(0);
            return;
        }
    }
}
