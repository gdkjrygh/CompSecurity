// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.content.res.Resources;
import android.location.Address;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.jcp.adapters.cw;
import com.jcp.b.b;
import com.jcp.c.n;
import com.jcp.util.aj;
import com.jcp.util.ap;
import com.jcp.util.au;
import com.jcp.util.bg;
import com.jcp.util.bs;
import com.jcp.views.PagingListView;
import java.util.List;

// Referenced classes of package com.jcp.fragments:
//            gh, gr

class gi
    implements android.widget.TextView.OnEditorActionListener
{

    final gh a;

    gi(gh gh1)
    {
        a = gh1;
        super();
    }

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (i != 3) goto _L2; else goto _L1
_L1:
        a.O();
        if (!b.a(a.i()))
        {
            break MISSING_BLOCK_LABEL_533;
        }
        gh.a(a, textview.getText().toString().trim());
        gh.a(a, aj.a(a.i(), gh.a(a)));
        if (com.jcp.fragments.gh.b(a) == null)
        {
            Toast.makeText(a.i(), a.j().getString(0x7f07005d), 0).show();
        }
        flag = flag1;
        if (TextUtils.isEmpty(gh.a(a))) goto _L2; else goto _L3
_L3:
        if (!bg.a(gh.a(a)) || bs.a(a.i(), gh.a(a))) goto _L5; else goto _L4
_L4:
        flag = true;
_L2:
        return flag;
_L5:
        ap.a(a.i(), gh.a(a));
        gh.c(a).setVisibility(0);
        gh.d(a).setVisibility(4);
        gh.e(a).setVisibility(8);
        gh.a(a, 0);
        gh.f(a).clear();
        if (gh.g(a) != null)
        {
            gh.g(a).a();
            gh.a(a, null);
        }
        gh.h(a).clear();
        if (gh.i(a))
        {
            gh.h(a).add("Distance");
        }
        if (gh.j(a) != null)
        {
            for (i = 0; i < gh.k(a).size(); i++)
            {
                gh.j(a).removeHeaderView((View)gh.k(a).get(i));
            }

        }
        flag = flag1;
        if (com.jcp.fragments.gh.b(a) == null) goto _L2; else goto _L6
_L6:
        if (gh.i(a))
        {
            gh.m(a).a(gr.a(gh.l(a)), Double.valueOf(com.jcp.fragments.gh.b(a).getLatitude()), Double.valueOf(com.jcp.fragments.gh.b(a).getLongitude()));
            return false;
        }
        if (com.jcp.fragments.gh.n(a))
        {
            gh.m(a).a(Double.valueOf(com.jcp.fragments.gh.b(a).getLatitude()), Double.valueOf(com.jcp.fragments.gh.b(a).getLongitude()), Integer.valueOf(50));
            return false;
        } else
        {
            gh.m(a).a(Double.valueOf(com.jcp.fragments.gh.b(a).getLatitude()), Double.valueOf(com.jcp.fragments.gh.b(a).getLongitude()));
            return false;
        }
        au.a(a.i());
        return false;
    }
}
