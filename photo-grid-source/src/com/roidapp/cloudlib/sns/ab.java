// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.roidapp.cloudlib.ar;
import com.roidapp.cloudlib.as;

// Referenced classes of package com.roidapp.cloudlib.sns:
//            ac, ad, af, ae

public final class ab extends RelativeLayout
{

    private View a;
    private View b;
    private View c;
    private TextView d;
    private EditText e;
    private View f;
    private ImageView g;
    private ae h;

    public ab(Context context)
    {
        super(context);
        LayoutInflater.from(context).inflate(as.ac, this);
        a = findViewById(ar.b);
        b = findViewById(ar.ca);
        c = findViewById(ar.bt);
        d = (TextView)findViewById(ar.bE);
        g = (ImageView)findViewById(ar.m);
        e = (EditText)findViewById(ar.bW);
        f = findViewById(ar.cb);
        e.setOnEditorActionListener(new ac(this));
        g.setOnClickListener(new ad(this));
    }

    static ae a(ab ab1)
    {
        return ab1.h;
    }

    private void a(CharSequence charsequence, boolean flag)
    {
        if (d != null)
        {
            if (d.getVisibility() != 0)
            {
                d.setVisibility(0);
            }
            if (flag)
            {
                d.setTypeface(Typeface.defaultFromStyle(1));
            }
            d.setText(charsequence);
        }
    }

    public final void a()
    {
        if (e != null && e.getVisibility() != 0)
        {
            e.setVisibility(0);
            f.setVisibility(0);
        }
    }

    public final void a(int i)
    {
        a(getResources().getText(i), false);
    }

    public final void a(TextWatcher textwatcher)
    {
        if (e != null)
        {
            e.addTextChangedListener(textwatcher);
        }
    }

    public final void a(android.view.View.OnClickListener onclicklistener)
    {
        a(onclicklistener, true);
    }

    public final void a(android.view.View.OnClickListener onclicklistener, boolean flag)
    {
        if (a == null) goto _L2; else goto _L1
_L1:
        if (!flag) goto _L4; else goto _L3
_L3:
        if (a.getVisibility() != 0)
        {
            a.setVisibility(0);
        }
        if (c != null && c.getVisibility() != 0)
        {
            c.setVisibility(0);
        }
_L6:
        a.setOnClickListener(onclicklistener);
_L2:
        return;
_L4:
        if (a.getVisibility() != 8)
        {
            a.setVisibility(8);
        }
        if (c != null && c.getVisibility() != 8)
        {
            c.setVisibility(8);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void a(ae ae)
    {
        h = ae;
    }

    public final void a(CharSequence charsequence)
    {
        a(charsequence, false);
    }

    public final void a(String s)
    {
        if (e != null)
        {
            if (e.getVisibility() != 0)
            {
                e.setVisibility(0);
                f.setVisibility(0);
            }
            e.setText(s);
            if (!TextUtils.isEmpty(s))
            {
                e.setSelection(s.length());
            }
        }
    }

    public final String b()
    {
        if (e != null)
        {
            return e.getText().toString();
        } else
        {
            return null;
        }
    }

    public final void b(int i)
    {
        if (g != null && g.getVisibility() != i)
        {
            g.setVisibility(i);
        }
    }

    public final boolean c()
    {
        return af.a(e);
    }

    public final void d()
    {
        a(getResources().getText(0x7f07003c), true);
    }

    public final void e()
    {
        if (b != null && b.getVisibility() != 0)
        {
            b.setVisibility(0);
        }
        if (a != null && a.getVisibility() != 4)
        {
            a.setVisibility(4);
        }
        if (c != null && c.getVisibility() != 8)
        {
            c.setVisibility(8);
        }
    }
}
