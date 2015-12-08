// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.cardinalblue.android.b.i;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            j

static class g extends android.support.v7.widget.clerView.ViewHolder
{

    final ImageView a;
    final ImageView b;
    final View c;
    final ImageView d;
    final TextView e;
    final ImageView f;
    final TextView g;

    private void a(int k)
    {
        a(k, d, e);
    }

    private void a(int k, ImageView imageview, TextView textview)
    {
        boolean flag1 = false;
        boolean flag;
        if (k > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (imageview != null)
        {
            int l;
            if (flag)
            {
                l = 0;
            } else
            {
                l = 8;
            }
            imageview.setVisibility(l);
        }
        if (textview != null)
        {
            textview.setText(i.a(k));
            if (flag)
            {
                k = ((flag1) ? 1 : 0);
            } else
            {
                k = 8;
            }
            textview.setVisibility(k);
        }
    }

    static void a(e e1, int k)
    {
        e1.a(k);
    }

    private void b(int k)
    {
        a(k, f, g);
    }

    static void b(g g1, int k)
    {
        g1.b(k);
    }

    public (View view)
    {
        super(view);
        a = (ImageView)view.findViewById(0x7f100180);
        b = (ImageView)view.findViewById(0x7f10016d);
        c = view.findViewById(0x7f1000ea);
        d = (ImageView)view.findViewById(0x7f10017e);
        e = (TextView)view.findViewById(0x7f1000ee);
        f = (ImageView)view.findViewById(0x7f10017f);
        g = (TextView)view.findViewById(0x7f1000f0);
    }
}
