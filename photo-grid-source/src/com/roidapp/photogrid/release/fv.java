// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

// Referenced classes of package com.roidapp.photogrid.release:
//            fr

final class fv
    implements android.view.View.OnClickListener
{

    final ImageView a;
    final ImageView b;
    final RelativeLayout c;
    final RelativeLayout d;
    final RelativeLayout e;
    final TextView f;
    final TextView g;
    final TextView h;
    final LayoutInflater i;
    final ViewGroup j;
    final fr k;

    fv(fr fr1, ImageView imageview, ImageView imageview1, RelativeLayout relativelayout, RelativeLayout relativelayout1, RelativeLayout relativelayout2, TextView textview, 
            TextView textview1, TextView textview2, LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        k = fr1;
        a = imageview;
        b = imageview1;
        c = relativelayout;
        d = relativelayout1;
        e = relativelayout2;
        f = textview;
        g = textview1;
        h = textview2;
        i = layoutinflater;
        j = viewgroup;
        super();
    }

    public final void onClick(View view)
    {
        a.setVisibility(8);
        b.setVisibility(0);
        c.setVisibility(8);
        d.setVisibility(8);
        e.setVisibility(0);
        f.setBackgroundResource(0);
        g.setBackgroundResource(0);
        h.setBackgroundResource(0x7f020074);
        fr.a(k, 2);
        fr.a(k, i, j);
    }
}
