// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.connect.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.mobile.android.spotlets.connect.Tech;
import dft;
import erj;
import erq;
import java.util.EnumSet;

public class ConnectView extends LinearLayout
{

    public boolean a;
    private TextView b;
    private ImageView c;
    private erj d;

    public ConnectView(Context context)
    {
        super(context);
    }

    public ConnectView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public ConnectView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public final void a()
    {
        setActivated(false);
        c.setVisibility(0);
        d.a();
        b.setText(getContext().getString(0x7f0803e3));
    }

    public final void a(Tech tech)
    {
        setActivated(false);
        final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[Tech.values().length];
                try
                {
                    a[Tech.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[Tech.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[tech.ordinal()];
        JVM INSTR tableswitch 1 2: default 36
    //                   1 60
    //                   2 92;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder("Unknown tech: ")).append(tech).toString());
_L2:
        c.setVisibility(0);
        d.a();
_L5:
        b.setText(getContext().getString(0x7f0803e2));
        return;
_L3:
        c.setVisibility(8);
        tech = d;
        ((erj) (tech)).a.setVisibility(0);
        if (!((erj) (tech)).c)
        {
            ((erj) (tech)).a.setImageDrawable(((erj) (tech)).b.a(((erj) (tech)).a));
            tech.c = true;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void a(Tech tech, String s)
    {
        setActivated(true);
        b.setText(s);
        switch (_cls1.a[tech.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unknown tech: ")).append(tech).toString());

        case 1: // '\001'
            c.setVisibility(0);
            d.a();
            return;

        case 2: // '\002'
            c.setVisibility(8);
            break;
        }
        tech = d;
        ((erj) (tech)).a.setVisibility(0);
        ((erj) (tech)).a.setImageDrawable(((erj) (tech)).b.c());
        tech.c = false;
    }

    public final void a(EnumSet enumset)
    {
        byte byte0 = 8;
        setActivated(false);
        Object obj = c;
        int i;
        boolean flag;
        if (enumset.contains(Tech.a))
        {
            i = 0;
        } else
        {
            i = 8;
        }
        ((ImageView) (obj)).setVisibility(i);
        obj = d;
        flag = enumset.contains(Tech.b);
        enumset = ((erj) (obj)).a;
        i = byte0;
        if (flag)
        {
            i = 0;
        }
        enumset.setVisibility(i);
        ((erj) (obj)).a.setImageDrawable(((erj) (obj)).b.b());
        obj.c = false;
        b.setText(getContext().getString(0x7f0803e4));
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        b = (TextView)findViewById(0x7f11032b);
        c = (ImageView)findViewById(0x7f110329);
        Object obj = new erq(getContext(), dft.b(16F, getResources()), 0x7f0f0155);
        d = new erj((ImageView)findViewById(0x7f11032a), ((erq) (obj)));
        obj = ((erq) (obj)).a();
        c.setImageDrawable(((android.graphics.drawable.Drawable) (obj)));
        obj = d;
        android.graphics.drawable.Drawable drawable = ((erj) (obj)).b.b();
        ((erj) (obj)).a.setImageDrawable(drawable);
        obj.c = false;
    }

    public void setPressed(boolean flag)
    {
        if (a)
        {
            super.setPressed(flag);
        }
    }
}
