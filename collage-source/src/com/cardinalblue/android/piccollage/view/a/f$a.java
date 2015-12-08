// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.cardinalblue.android.b.i;

// Referenced classes of package com.cardinalblue.android.piccollage.view.a:
//            f

public static class d extends android.support.v7.widget.clerView.ViewHolder
{

    ImageView a;
    ImageView b;
    ImageView c;
    TextView d;

    private void a(int j)
    {
        boolean flag1 = false;
        boolean flag;
        if (j > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (c != null)
        {
            Object obj = c;
            int k;
            if (flag)
            {
                k = 0;
            } else
            {
                k = 8;
            }
            ((ImageView) (obj)).setVisibility(k);
        }
        if (d != null)
        {
            d.setText(i.a(j));
            obj = d;
            if (flag)
            {
                j = ((flag1) ? 1 : 0);
            } else
            {
                j = 8;
            }
            ((TextView) (obj)).setVisibility(j);
        }
    }

    static void a(d d1, int j)
    {
        d1.a(j);
    }

    public er(View view)
    {
        this(view, false);
    }

    public <init>(View view, boolean flag)
    {
        super(view);
        if (flag)
        {
            return;
        } else
        {
            a = (ImageView)view.findViewById(0x7f100180);
            b = (ImageView)view.findViewById(0x7f10016d);
            c = (ImageView)view.findViewById(0x7f10017e);
            d = (TextView)view.findViewById(0x7f1000ee);
            return;
        }
    }
}
