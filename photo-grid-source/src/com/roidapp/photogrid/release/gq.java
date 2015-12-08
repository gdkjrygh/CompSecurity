// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.AlertDialog;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.roidapp.baselib.c.an;
import java.lang.ref.WeakReference;

// Referenced classes of package com.roidapp.photogrid.release:
//            ge

final class gq
    implements android.widget.AdapterView.OnItemClickListener
{

    final ge a;

    gq(ge ge1)
    {
        a = ge1;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (ge.c(a) == null) goto _L2; else goto _L1
_L1:
        if (ge.c(a).getLastVisiblePosition() != i && ge.c(a).getLastVisiblePosition() != i + 1 || ge.c(a).getCount() <= i + 1) goto _L4; else goto _L3
_L3:
        ge.c(a).smoothScrollToPosition(i + 1);
_L2:
        if (!ge.a(a, ge.i(a)[i].substring(0, ge.i(a)[i].indexOf(".")))) goto _L6; else goto _L5
_L5:
        an.a(new WeakReference(ge.f(a)), a.getString(0x7f070187));
_L8:
        return;
_L4:
        if ((ge.c(a).getFirstVisiblePosition() == i || ge.c(a).getFirstVisiblePosition() == i - 1) && i - 1 >= 0)
        {
            ge.c(a).smoothScrollToPosition(i - 1);
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (ge.j(a) != null && ge.j(a).isShowing()) goto _L8; else goto _L7
_L7:
        ge.a(a, ge.i(a)[i], "http://dl.pg.ksmobile.com/fonts/");
        return;
        if (true) goto _L2; else goto _L9
_L9:
    }
}
