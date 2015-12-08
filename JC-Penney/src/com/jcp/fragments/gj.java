// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.jcp.adapters.cw;
import com.jcp.helper.aa;
import com.jcp.util.ap;
import com.jcp.util.bg;
import com.jcp.util.bs;
import com.jcp.views.PagingListView;
import java.util.List;

// Referenced classes of package com.jcp.fragments:
//            gh

class gj
    implements aa
{

    final gh a;

    gj(gh gh1)
    {
        a = gh1;
        super();
    }

    public void a(String s)
    {
        gh.d(a).setVisibility(4);
        gh.o(a).setVisibility(0);
        if (s != null)
        {
            Toast.makeText(a.i(), s, 0).show();
        }
    }

    public void b(String s)
    {
        gh.d(a).setVisibility(4);
        gh.o(a).setVisibility(0);
        if (TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        gh.a(a, s);
        gh.p(a).setText(gh.a(a));
        if (!TextUtils.isEmpty(gh.a(a)) && a.i() != null && (!bg.a(gh.a(a)) || bs.a(a.i(), gh.a(a)))) goto _L3; else goto _L2
_L2:
        return;
_L3:
        ap.a(a.i(), s);
        gh.c(a).setVisibility(0);
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
            int i = 0;
            while (i < gh.k(a).size()) 
            {
                gh.j(a).removeHeaderView((View)gh.k(a).get(i));
                i++;
            }
        }
        if (true) goto _L2; else goto _L4
_L4:
    }
}
