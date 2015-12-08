// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.android.glue.molecules.card.glue;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.android.glue.molecules.card.CardAppearance;
import com.spotify.android.paste.widget.internal.PasteLinearLayout;
import dfe;

public class CardView extends PasteLinearLayout
{

    public final ImageView a;
    public final TextView b;
    private final TextView c;

    public CardView(Context context)
    {
        this(context, null);
    }

    public CardView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public CardView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        setOrientation(1);
        LayoutInflater.from(getContext()).inflate(0x7f0300a5, this);
        a = (ImageView)findViewById(0x1020006);
        c = (TextView)findViewById(0x7f11026e);
        b = (TextView)findViewById(0x7f1102ef);
        b.setVisibility(8);
        dfe.a(c);
        dfe.a(b);
        dfe.a(this);
        setClickable(true);
    }

    public final void a(String s)
    {
        c.setText(s);
    }

    public final void b(String s)
    {
        b.setText(s);
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        int ai[] = getDrawableState();
        int j = ai.length;
        int i = 0;
        boolean flag = false;
        boolean flag1 = false;
        while (i < j) 
        {
            int k = ai[i];
            boolean flag2;
            if (k == 0x10100a7)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            flag2 = flag1 | flag2;
            if (k == 0xfefeff62)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            flag |= flag1;
            i++;
            flag1 = flag2;
        }
        if (flag)
        {
            setAlpha(0.4F);
            return;
        }
        if (flag1)
        {
            setAlpha(0.7F);
            return;
        } else
        {
            setAlpha(1.0F);
            return;
        }
    }

    // Unreferenced inner class com/spotify/android/glue/molecules/card/glue/CardView$1

/* anonymous class */
    public final class _cls1
    {

        public static final int a[];

        static 
        {
            a = new int[CardAppearance.values().length];
            try
            {
                a[CardAppearance.a.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                a[CardAppearance.b.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[CardAppearance.c.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
