// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.spotify.mobile.android.ui.view.DraggableSeekBar;

public final class erf
{

    Context a;
    View b;
    View c;
    View d;
    View e;
    TextView f;
    ImageView g;
    TextView h;
    ListView i;
    DraggableSeekBar j;
    LinearLayout k;
    final ImageButton l;
    boolean m;

    public erf(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        a = viewgroup.getContext();
        b = layoutinflater.inflate(0x7f03007f, viewgroup, false);
        ((TextView)b.findViewById(0x7f11026e)).setText(0x7f0801e6);
        i = (ListView)b.findViewById(0x7f110369);
        layoutinflater = layoutinflater.inflate(0x7f0300c0, null);
        i.addHeaderView(layoutinflater, null, false);
        d = layoutinflater.findViewById(0x7f1103ec);
        e = layoutinflater.findViewById(0x7f1103ed);
        f = (TextView)layoutinflater.findViewById(0x7f1103ee);
        g = (ImageView)layoutinflater.findViewById(0x7f1103ef);
        h = (TextView)layoutinflater.findViewById(0x7f1103f0);
        h.setText(0x7f0801e3);
        j = (DraggableSeekBar)b.findViewById(0x7f110367);
        l = (ImageButton)b.findViewById(0x7f1102b9);
        l.setImageDrawable(fyd.e(viewgroup.getContext()));
        k = (LinearLayout)b.findViewById(0x7f110366);
        a(false);
    }

    final void a(boolean flag)
    {
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)k.getLayoutParams();
        int i1 = a.getResources().getDimensionPixelSize(0x7f0c00c9);
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = -i1;
        }
        marginlayoutparams.bottomMargin = i1;
        k.requestLayout();
    }
}
