// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.player;

import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Property;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.spotify.mobile.android.spotlets.connect.view.ConnectView;
import com.spotify.mobile.android.ui.view.CancellableSeekBar;
import com.spotify.mobile.android.ui.view.SuppressLayoutTextView;
import dgg;
import dgo;
import eqh;
import fac;
import fad;
import gbe;
import java.util.Locale;

public class NewPlayerViews extends FrameLayout
{

    private static float g;
    public CancellableSeekBar a;
    public ConnectView b;
    public TextView c;
    public gbe d;
    public eqh e;
    public fad f;
    private SuppressLayoutTextView h;
    private final Property i;
    private float j;

    public NewPlayerViews(Context context)
    {
        super(context);
        i = new Property(java/lang/Integer, "track_position") {

            private NewPlayerViews a;

            public final Object get(Object obj)
            {
                return Integer.valueOf(((CancellableSeekBar)obj).getProgress());
            }

            public final void set(Object obj, Object obj1)
            {
                obj = (CancellableSeekBar)obj;
                obj1 = (Integer)obj1;
                NewPlayerViews.a(a, ((Integer) (obj1)).intValue() / 1000);
                ((CancellableSeekBar) (obj)).setProgress(((Integer) (obj1)).intValue());
            }

            
            {
                a = NewPlayerViews.this;
                super(class1, s);
            }
        };
    }

    public NewPlayerViews(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        i = new _cls1(java/lang/Integer, "track_position");
    }

    public NewPlayerViews(Context context, AttributeSet attributeset, int k)
    {
        super(context, attributeset, k);
        i = new _cls1(java/lang/Integer, "track_position");
    }

    static float a(NewPlayerViews newplayerviews)
    {
        return newplayerviews.j;
    }

    public static CharSequence a(int k)
    {
        int l = k / 60;
        return String.format(Locale.getDefault(), "%d:%02d", new Object[] {
            Integer.valueOf(l), Integer.valueOf(k % 60)
        });
    }

    static void a(NewPlayerViews newplayerviews, int k)
    {
        int l = Math.max(1, (int)Math.ceil(Math.log10(k / 60)));
        CharSequence charsequence = a(k);
        if (!charsequence.equals(newplayerviews.h.getText()))
        {
            k = dgg.a(newplayerviews.h.getPaint(), l);
            Object obj = newplayerviews.h.getPaint();
            if (g == 0.0F)
            {
                float af[] = new float[1];
                ((TextPaint) (obj)).getTextWidths(":", af);
                g = af[0];
            }
            k = k + (int)(g + 0.5F) + dgg.a(newplayerviews.h.getPaint(), 2);
            obj = newplayerviews.h.getLayoutParams();
            if (((android.view.ViewGroup.LayoutParams) (obj)).width != k)
            {
                obj.width = k;
                newplayerviews.h.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            }
            newplayerviews = newplayerviews.h;
            newplayerviews.a = true;
            newplayerviews.setText(charsequence);
            newplayerviews.a = false;
        }
    }

    public final void a(long l, long l1, float f1)
    {
        j = f1;
        e.a(l, l1, f1);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        f = (new fac(getContext())).a();
        dgo.a(this, f);
        a = (CancellableSeekBar)findViewById(0x7f1103d3);
        e = new eqh(a, i);
        d = new gbe(e) {

            private NewPlayerViews b;

            protected final void a(int k)
            {
                NewPlayerViews.a(b, k);
            }

            protected final void a(long l, long l1)
            {
                b.a(l, l1, NewPlayerViews.a(b));
            }

            
            {
                b = NewPlayerViews.this;
                super(eqh1);
            }
        };
        a.a(d);
        h = (SuppressLayoutTextView)findViewById(0x7f1103d2);
        c = (TextView)findViewById(0x7f1103d4);
        b = (ConnectView)findViewById(0x7f110328);
    }
}
