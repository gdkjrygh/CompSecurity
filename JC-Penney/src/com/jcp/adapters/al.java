// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.jcp.activities.ar;
import com.jcp.productfilter.pojo.Values;
import java.util.List;

// Referenced classes of package com.jcp.adapters:
//            am, ak

class al
    implements android.view.View.OnClickListener
{

    final am a;
    final int b;
    final ak c;

    al(ak ak1, am am1, int i)
    {
        c = ak1;
        a = am1;
        b = i;
        super();
    }

    public void onClick(View view)
    {
        if (am.a(a).getText().equals("View all") && b == ak.a(c) - 1)
        {
            am.b(a).setVisibility(8);
            am.b(a).setImageDrawable(ak.b(c).getResources().getDrawable(0x7f02023d));
            ak.f(c).a(1, ak.c(c), ak.d(c), ak.e(c), false);
            return;
        }
        if (am.a(a).getText().equals("View less") && b == ak.a(c) - 1)
        {
            am.b(a).setVisibility(8);
            am.b(a).setImageDrawable(ak.b(c).getResources().getDrawable(0x7f02023d));
            ak.f(c).a(0, ak.c(c), ak.d(c), ak.e(c), false);
            return;
        }
        if (am.b(a).getVisibility() == 0)
        {
            ak.g(c);
            ((Values)ak.c(c).get(b)).setSelectedStatus(false);
            c.b(a);
        } else
        {
            ak.h(c);
            ((Values)ak.c(c).get(b)).setSelectedStatus(true);
            c.a(a);
        }
        ak.f(c).a(ak.i(c), ak.j(c));
        ak.f(c).a(ak.i(c), ((Values)ak.c(c).get(b)).getCount());
    }
}
