// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.graphics.Typeface;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.HashMap;

// Referenced classes of package com.roidapp.photogrid.release:
//            ge, PhotoGridActivity, PhotoView, ra, 
//            rc

final class go
    implements android.widget.AdapterView.OnItemClickListener
{

    final ge a;

    go(ge ge1)
    {
        a = ge1;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (ge.f(a).O() != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if ((adapterview = ge.f(a).O().g()) == null || !(adapterview instanceof ra))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (ge.b(a) == null) goto _L4; else goto _L3
_L3:
        if (ge.b(a).getLastVisiblePosition() != i && ge.b(a).getLastVisiblePosition() != i + 1 || ge.b(a).getCount() <= i + 1) goto _L6; else goto _L5
_L5:
        ge.b(a).smoothScrollToPosition(i + 1);
_L4:
        ge.a(a, rc.a(ge.f(a)).a());
        adapterview = (ra)adapterview;
        ge.a(a, i);
        if (ge.g(a).get(Integer.valueOf(i)) == null || adapterview == null)
        {
            break MISSING_BLOCK_LABEL_185;
        }
        adapterview.b((Typeface)ge.g(a).get(Integer.valueOf(i)));
        ge.f(a).O().invalidate();
        ge.h(a);
        return;
_L6:
        if ((ge.b(a).getFirstVisiblePosition() == i || ge.b(a).getFirstVisiblePosition() == i - 1) && i - 1 >= 0)
        {
            ge.b(a).smoothScrollToPosition(i - 1);
        }
        if (true) goto _L4; else goto _L7
_L7:
        view;
        view.printStackTrace();
        adapterview.f = true;
        adapterview.ak = true;
        adapterview.al = true;
        adapterview.am = true;
        if (!adapterview.B())
        {
            ge.f(a).L();
            return;
        }
        if (true) goto _L1; else goto _L8
_L8:
    }
}
