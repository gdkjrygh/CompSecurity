// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.filter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.roidapp.imagelib.b.b;
import com.roidapp.imagelib.d;
import com.roidapp.imagelib.f;
import com.roidapp.imagelib.g;
import com.roidapp.imagelib.h;

// Referenced classes of package com.roidapp.imagelib.filter:
//            bk, ai, af, ae, 
//            ag, ah, bn

public class ImageColorView extends LinearLayout
    implements android.view.View.OnClickListener
{

    private ImageButton a;
    private ImageButton b;
    private ImageButton c;
    private ImageButton d;
    private int e;
    private int f;
    private int g;
    private int h;
    private bk i;
    private TextView j;
    private ag k;
    private Context l;
    private ah m;

    public ImageColorView(Context context)
    {
        super(context);
        l = context;
        context = ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(h.d, this, true);
        a();
        a = (ImageButton)findViewById(g.J);
        a.setOnClickListener(this);
        b = (ImageButton)findViewById(g.F);
        b.setOnClickListener(this);
        c = (ImageButton)findViewById(g.L);
        c.setOnClickListener(this);
        d = (ImageButton)findViewById(g.H);
        d.setOnClickListener(this);
        ((ImageButton)findViewById(g.K)).setOnClickListener(this);
        j = (TextView)findViewById(g.aM);
        i = new bk(Integer.valueOf(-100), Integer.valueOf(100), l);
        ((ViewGroup)context.findViewById(g.aO)).addView(i);
        a(ai.a);
    }

    public ImageColorView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    static int a(ImageColorView imagecolorview, int i1)
    {
        imagecolorview.e = i1;
        return i1;
    }

    static ag a(ImageColorView imagecolorview)
    {
        return imagecolorview.k;
    }

    private void a()
    {
        e = 150;
        f = 100;
        g = 100;
        h = 180;
    }

    private void a(ai ai1)
    {
        int i1;
        i.setTag(ai1);
        a.setBackgroundResource(f.m);
        b.setBackgroundResource(f.m);
        c.setBackgroundResource(f.m);
        d.setBackgroundResource(f.m);
        i.a(null);
        i1 = 0;
        af.a[ai1.ordinal()];
        JVM INSTR tableswitch 1 4: default 96
    //                   1 119
    //                   2 160
    //                   3 198
    //                   4 236;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        i.a(Integer.valueOf(i1));
        i.a(b());
        return;
_L2:
        a.setBackgroundResource(d.j);
        i1 = e - 150;
        i.a(Integer.valueOf(-150), Integer.valueOf(150));
        continue; /* Loop/switch isn't completed */
_L3:
        b.setBackgroundResource(d.j);
        i1 = f - 100;
        i.a(Integer.valueOf(-100), Integer.valueOf(100));
        continue; /* Loop/switch isn't completed */
_L4:
        c.setBackgroundResource(d.j);
        i1 = g - 100;
        i.a(Integer.valueOf(-100), Integer.valueOf(100));
        continue; /* Loop/switch isn't completed */
_L5:
        d.setBackgroundResource(d.j);
        i1 = h - 180;
        i.a(Integer.valueOf(-180), Integer.valueOf(180));
        if (true) goto _L1; else goto _L6
_L6:
    }

    static int b(ImageColorView imagecolorview, int i1)
    {
        imagecolorview.f = i1;
        return i1;
    }

    static TextView b(ImageColorView imagecolorview)
    {
        return imagecolorview.j;
    }

    private bn b()
    {
        return new ae(this);
    }

    static int c(ImageColorView imagecolorview, int i1)
    {
        imagecolorview.g = i1;
        return i1;
    }

    static ah c(ImageColorView imagecolorview)
    {
        return imagecolorview.m;
    }

    static int d(ImageColorView imagecolorview, int i1)
    {
        imagecolorview.h = i1;
        return i1;
    }

    public final void a(Fragment fragment)
    {
        if (fragment instanceof ag)
        {
            k = (ag)fragment;
            return;
        } else
        {
            throw new ClassCastException((new StringBuilder()).append(fragment.toString()).append(" must implemenet ImageFilterColorFragment.OnFilterColorListener").toString());
        }
    }

    public final void a(b b1, int i1)
    {
        if (b1 != null)
        {
            e = b1.c();
            f = b1.b + 100;
            g = b1.c + 100;
            h = b1.d();
            a(ai.a(i1));
        }
    }

    public final void a(ah ah)
    {
        m = ah;
    }

    public void onClick(View view)
    {
        int i1 = view.getId();
        if (!k.c()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (i1 == g.J)
        {
            i.a(null);
            a(ai.a);
            i.a(b());
            k.a(ai.a);
            return;
        }
        if (i1 == g.F)
        {
            i.a(null);
            a(com.roidapp.imagelib.filter.ai.b);
            i.a(b());
            k.a(com.roidapp.imagelib.filter.ai.b);
            return;
        }
        if (i1 == g.L)
        {
            i.a(null);
            a(ai.c);
            i.a(b());
            k.a(ai.c);
            return;
        }
        if (i1 == g.H)
        {
            i.a(null);
            a(com.roidapp.imagelib.filter.ai.d);
            i.a(b());
            k.a(com.roidapp.imagelib.filter.ai.d);
            return;
        }
        if (i1 != g.K) goto _L1; else goto _L3
_L3:
        i.a(null);
        view = (ai)i.getTag();
        a();
        af.a[view.ordinal()];
        JVM INSTR tableswitch 1 4: default 272
    //                   1 293
    //                   2 314
    //                   3 334
    //                   4 354;
           goto _L4 _L5 _L6 _L7 _L8
_L4:
        k.d();
        i.a(b());
        return;
_L5:
        i.a(Integer.valueOf(e - 150));
        continue; /* Loop/switch isn't completed */
_L6:
        i.a(Integer.valueOf(f - 100));
        continue; /* Loop/switch isn't completed */
_L7:
        i.a(Integer.valueOf(g - 100));
        continue; /* Loop/switch isn't completed */
_L8:
        i.a(Integer.valueOf(h - 180));
        if (true) goto _L4; else goto _L9
_L9:
    }
}
