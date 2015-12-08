// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

final class dcs
    implements dcr
{

    View a;
    private TextView b;
    private FrameLayout c;
    private View d;

    public dcs(View view)
    {
        a = view;
        b = (TextView)view.findViewById(0x7f1103e8);
        c = (FrameLayout)view.findViewById(0x7f1103ea);
    }

    public final View a()
    {
        return a;
    }

    public final void a(float f)
    {
        b.setAlpha(f);
    }

    public final void a(View view)
    {
        d = view;
        c.removeAllViews();
        if (view != null)
        {
            c.addView(view, new android.widget.FrameLayout.LayoutParams(-1, -1));
            a(true);
            return;
        } else
        {
            a(false);
            return;
        }
    }

    public final void a(CharSequence charsequence)
    {
        b.setText(charsequence);
    }

    public final void a(boolean flag)
    {
        if (flag)
        {
            c.setVisibility(0);
            b.setVisibility(8);
            return;
        } else
        {
            c.setVisibility(8);
            b.setVisibility(0);
            return;
        }
    }

    public final View b()
    {
        return d;
    }
}
