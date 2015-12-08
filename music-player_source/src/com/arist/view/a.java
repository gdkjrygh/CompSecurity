// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.view;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.arist.activity.MyApplication;
import com.arist.b.c;
import com.arist.model.skin.ColorImageView;
import java.util.ArrayList;

// Referenced classes of package com.arist.view:
//            b

public final class a extends RelativeLayout
{

    private View a;
    private View b;
    private View c;
    private View d;
    private TextView e;
    private TextView f;
    private TextView g;
    private TextView h;
    private LinearLayout i;
    private View j;
    private android.view.View.OnClickListener k;

    public a(Context context, android.view.View.OnClickListener onclicklistener)
    {
        super(context);
        k = onclicklistener;
        inflate(context, 0x7f03002b, this);
        a = findViewById(0x7f0600a1);
        b = findViewById(0x7f0600a5);
        c = findViewById(0x7f060099);
        d = findViewById(0x7f06009d);
        e = (TextView)findViewById(0x7f0600a4);
        f = (TextView)findViewById(0x7f0600a8);
        g = (TextView)findViewById(0x7f06009c);
        h = (TextView)findViewById(0x7f0600a0);
        i = (LinearLayout)findViewById(0x7f0600a9);
        j = inflate(getContext(), 0x7f030028, null);
        j.setOnClickListener(new b(this));
        a.setOnClickListener(k);
        b.setOnClickListener(k);
        c.setOnClickListener(k);
        d.setOnClickListener(k);
        c();
    }

    public final void a()
    {
        b();
    }

    public final void b()
    {
        android.widget.LinearLayout.LayoutParams layoutparams;
        Object obj;
        String s;
        int i1;
        int j1;
        i.removeAllViews();
        obj = new ArrayList();
        ((ArrayList) (obj)).add((c)MyApplication.p.get(1));
        ((ArrayList) (obj)).addAll(MyApplication.l);
        s = getResources().getString(0x7f090087);
        layoutparams = new android.widget.LinearLayout.LayoutParams(-1, (int)getResources().getDimension(0x7f070019));
        j1 = getResources().getColor(0x7f0b0023);
        i1 = 0;
_L2:
        View view;
        ColorImageView colorimageview;
        int l;
        if (i1 >= ((ArrayList) (obj)).size())
        {
            i.addView(j);
            obj = new View(getContext());
            ((View) (obj)).setBackgroundColor(j1);
            ((View) (obj)).setLayoutParams(layoutparams);
            i.addView(((View) (obj)));
            return;
        }
        view = inflate(getContext(), 0x7f030028, null);
        view.setTag(Integer.valueOf(i1));
        colorimageview = (ColorImageView)view.findViewById(0x7f060095);
        if (i1 != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        l = 0x7f02009e;
_L3:
        colorimageview.setImageResource(l);
        ((TextView)view.findViewById(0x7f060097)).setText(((c)((ArrayList) (obj)).get(i1)).b());
        ((TextView)view.findViewById(0x7f060096)).setText((new StringBuilder(String.valueOf(((c)((ArrayList) (obj)).get(i1)).f().size()))).append(" ").append(s).toString());
        view.setOnClickListener(k);
        i.addView(view);
        view = new View(getContext());
        view.setBackgroundColor(j1);
        view.setLayoutParams(layoutparams);
        i.addView(view);
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        if (((c)((ArrayList) (obj)).get(i1)).d() == 1)
        {
            l = 0x7f02008d;
            colorimageview.a(false);
        } else
        {
            l = 0x7f020090;
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    public final void c()
    {
        e.setText(getResources().getString(0x7f0900fe, new Object[] {
            Integer.valueOf(MyApplication.m.size())
        }));
        f.setText(getResources().getString(0x7f0900fe, new Object[] {
            Integer.valueOf(MyApplication.n.size())
        }));
        g.setText(getResources().getString(0x7f0900fe, new Object[] {
            Integer.valueOf(((c)MyApplication.p.get(0)).f().size())
        }));
        h.setText(getResources().getString(0x7f0900fe, new Object[] {
            Integer.valueOf(MyApplication.o.size())
        }));
        b();
    }
}
