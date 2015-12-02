// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.attachments;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.h;
import com.facebook.i;
import com.facebook.k;
import com.facebook.widget.e;

// Referenced classes of package com.facebook.orca.attachments:
//            c, d

public class AudioPlayerBubbleView extends e
{

    private final ImageView a;
    private final View b;
    private final TextView c;
    private Drawable d;
    private Drawable e;
    private boolean f;
    private boolean g;

    public AudioPlayerBubbleView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        setContentView(k.orca_audio_player_bubble);
        a = (ImageView)a(i.audio_play_button);
        b = a(i.audio_wave_form);
        c = (TextView)a(i.audio_timer);
        f = false;
    }

    private void a()
    {
        Drawable drawable = a.getBackground();
        if (g && (drawable instanceof AnimationDrawable))
        {
            a.setImageDrawable(null);
            ((AnimationDrawable)drawable).start();
            return;
        }
        if (drawable instanceof AnimationDrawable)
        {
            ((AnimationDrawable)drawable).stop();
        }
        ImageView imageview = a;
        if (f)
        {
            drawable = e;
        } else
        {
            drawable = d;
        }
        imageview.setImageDrawable(drawable);
    }

    public void setIsLoading(boolean flag)
    {
        g = flag;
        a();
    }

    public void setIsPlaying(boolean flag)
    {
        f = flag;
        a();
    }

    public void setTimerText(String s)
    {
        c.setText(s);
    }

    public void setType(d d1)
    {
        c.a[d1.ordinal()];
        JVM INSTR tableswitch 1 4: default 40
    //                   1 41
    //                   2 181
    //                   3 222
    //                   4 253;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return;
_L2:
        int j;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        a.setBackgroundResource(h.orca_audio_loading_spinner_right);
        l1 = h.orca_voice_bubble_right_normal_button;
        j = h.orca_voice_pattern_right_normal;
        k1 = h.orca_voice_timerbg_right_normal;
        j1 = h.audio_player_timer_text_right_normal;
        i1 = h.orca_voice_play_right_normal;
        l = h.orca_voice_pause_right_normal;
_L7:
        setBackgroundDrawable(getResources().getDrawable(l1));
        d1 = (BitmapDrawable)getResources().getDrawable(j);
        d1.setTileModeX(android.graphics.Shader.TileMode.REPEAT);
        b.setBackgroundDrawable(d1);
        c.setBackgroundDrawable(getResources().getDrawable(k1));
        c.setTextColor(getResources().getColor(j1));
        d = getResources().getDrawable(i1);
        e = getResources().getDrawable(l);
        a();
        return;
_L3:
        a.setBackgroundResource(h.orca_audio_loading_spinner_left);
        l1 = h.orca_voice_bubble_left_normal_button;
        j = h.orca_voice_pattern_left_normal;
        k1 = h.orca_voice_timerbg_left_normal;
        j1 = h.audio_player_timer_text_left_normal;
        i1 = h.orca_voice_play_left_normal;
        l = h.orca_voice_pause_left_normal;
        continue; /* Loop/switch isn't completed */
_L4:
        l1 = h.orca_voice_bubble_right_selected_button;
        j = h.orca_voice_pattern_right_selected;
        k1 = h.orca_voice_timerbg_right_selected;
        j1 = h.audio_player_timer_text_right_selected;
        i1 = h.orca_voice_play_right_selected;
        l = h.orca_voice_pause_right_selected;
        continue; /* Loop/switch isn't completed */
_L5:
        l1 = h.orca_voice_bubble_left_selected_button;
        j = h.orca_voice_pattern_left_selected;
        k1 = h.orca_voice_timerbg_left_selected;
        j1 = h.audio_player_timer_text_left_selected;
        i1 = h.orca_voice_play_left_selected;
        l = h.orca_voice_pause_left_selected;
        if (true) goto _L7; else goto _L6
_L6:
    }
}
