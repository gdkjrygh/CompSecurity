// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.tinder.model.User;
import com.tinder.utils.v;
import com.tinder.views.InterestsView;
import java.util.List;

// Referenced classes of package com.tinder.fragments:
//            bm

final class a
    implements Runnable
{

    final bm a;

    public final void run()
    {
        bm bm1;
label0:
        {
            if (a.isVisible())
            {
                bm1 = a;
                if (bm1.g != null && bm1.getView() != null)
                {
                    break label0;
                }
                v.b("Attempted to set interests with either a null user or a null view");
            }
            return;
        }
        int i = bm1.g.getCommonInterests().size();
        i = bm1.g.getUncommonInterests().size() + i;
        TextView textview = (TextView)bm1.getView().findViewById(0x7f0e02d2);
        if (i == 0)
        {
            textview.setVisibility(8);
            bm1.e.setVisibility(8);
            bm1.getView().findViewById(0x7f0e02d2).setVisibility(8);
            bm1.getView().findViewById(0x7f0e02d3).setVisibility(8);
            bm1.getView().findViewById(0x7f0e02d1).setVisibility(8);
            return;
        } else
        {
            textview.setText(bm1.getResources().getQuantityString(0x7f080006, i, new Object[] {
                Integer.valueOf(i)
            }));
            bm1.e.setUser(bm1.g);
            bm1.e.setVisibility(0);
            textview.setVisibility(0);
            bm1.getView().findViewById(0x7f0e02d2).setVisibility(0);
            bm1.getView().findViewById(0x7f0e02d3).setVisibility(0);
            bm1.getView().findViewById(0x7f0e02d1).setVisibility(0);
            return;
        }
    }

    es(bm bm1)
    {
        a = bm1;
        super();
    }
}
