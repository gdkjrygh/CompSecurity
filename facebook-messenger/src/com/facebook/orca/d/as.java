// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.d;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.facebook.common.time.a;
import com.facebook.common.w.m;
import com.facebook.h;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.o;
import com.facebook.p;
import com.facebook.widget.f;

// Referenced classes of package com.facebook.orca.d:
//            at, av, au

public class as extends f
{

    private final a a;
    private final Handler b;
    private final TextView c;
    private final View d;
    private final View e;
    private long f;
    private av g;
    private final Runnable h;

    public as(Context context)
    {
        this(context, null);
    }

    public as(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public as(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        h = new at(this);
        a = (a)getInjector().a(com/facebook/common/time/a);
        b = new Handler();
        setContentView(k.orca_audio_recorder_tooltip);
        c = (TextView)getView(i.audio_tooltip_text);
        d = getView(i.audio_tooltip_left_bg);
        e = getView(i.audio_tooltip_right_bg);
        c.bringToFront();
    }

    static a a(as as1)
    {
        return as1.a;
    }

    static void a(as as1, long l)
    {
        as1.setTimerText(l);
    }

    static long b(as as1)
    {
        return as1.f;
    }

    static Runnable c(as as1)
    {
        return as1.h;
    }

    static Handler d(as as1)
    {
        return as1.b;
    }

    private void setTimerText(long l)
    {
        c.setText(m.a("%d.%d", new Object[] {
            Long.valueOf(l / 1000L), Long.valueOf((l % 1000L) / 100L)
        }));
    }

    public void a()
    {
        setStyle(av.TOOLTIP);
        d();
        c.setText(o.audio_record_tooltip_hint);
    }

    public void a(int j)
    {
        d();
        setTimerText(j);
    }

    public void b()
    {
        setStyle(av.NUX);
        c.setText(o.audio_record_nux);
    }

    public void c()
    {
        setStyle(av.TOOLTIP);
        f = a.a();
        b.post(h);
    }

    public void d()
    {
        b.removeCallbacks(h);
    }

    public av getViewStyle()
    {
        return g;
    }

    public void setStyle(av av1)
    {
        g = av1;
        switch (com.facebook.orca.d.au.a[g.ordinal()])
        {
        default:
            throw new IllegalArgumentException("ViewStyle in Tooltip doesn't have a layout defined");

        case 1: // '\001'
            d.setBackgroundDrawable(getResources().getDrawable(h.orca_recorder_popup_white_left));
            e.setBackgroundDrawable(getResources().getDrawable(h.orca_recorder_popup_white_right));
            c.setTextAppearance(getContext(), p.OrcaVoiceClipsTooltipNuxText);
            return;

        case 2: // '\002'
            d.setBackgroundDrawable(getResources().getDrawable(h.orca_recorder_popup_red_left));
            e.setBackgroundDrawable(getResources().getDrawable(h.orca_recorder_popup_red_right));
            c.setTextAppearance(getContext(), p.OrcaVoiceClipsTooltipText);
            return;

        case 3: // '\003'
            d.setBackgroundDrawable(getResources().getDrawable(h.orca_recorder_popup_white_left));
            break;
        }
        e.setBackgroundDrawable(getResources().getDrawable(h.orca_recorder_popup_white_right));
        c.setTextAppearance(getContext(), p.OrcaVoiceClipsTooltipTextHoverOff);
    }
}
