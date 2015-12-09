// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.jcp.activities.ar;
import com.jcp.productfilter.pojo.Values;
import java.util.List;

// Referenced classes of package com.jcp.adapters:
//            aj, ah

class ai
    implements android.view.View.OnClickListener
{

    final aj a;
    final int b;
    final ah c;

    ai(ah ah1, aj aj1, int i)
    {
        c = ah1;
        a = aj1;
        b = i;
        super();
    }

    public void onClick(View view)
    {
        if (aj.a(a).getText().equals("View all") && b == ah.a(c) - 1)
        {
            ah.f(c).a(1, ah.b(c), ah.c(c), ah.d(c), false, ah.e(c));
            return;
        }
        if (aj.a(a).getText().equals("View less") && b == ah.a(c) - 1)
        {
            ah.f(c).a(0, ah.b(c), ah.c(c), ah.d(c), false, ah.e(c));
            return;
        }
        if (((Values)ah.b(c).get(b)).isSelectedStatus())
        {
            ah.g(c);
            aj.b(a).setBackgroundColor(ah.h(c).getResources().getColor(0x7f0d0061));
            ((Values)ah.b(c).get(b)).setSelectedStatus(false);
            aj.b(a).setSelected(false);
        } else
        {
            ah.i(c);
            aj.b(a).setBackgroundResource(0x7f020127);
            ((Values)ah.b(c).get(b)).setSelectedStatus(true);
            aj.b(a).setSelected(true);
        }
        ah.f(c).a(ah.j(c), ah.k(c));
    }
}
