// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.consumerphotoeditor.video;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import java.util.Set;
import ott;
import p;

public class EditorVideoControllerView extends ott
{

    private ImageView f;

    public EditorVideoControllerView(Context context, AttributeSet attributeset)
    {
        boolean flag = true;
        super(context, attributeset);
        LayoutInflater.from(context).inflate(com.google.android.apps.consumerphotoeditor.R.layout.cpe_editor_video_controller_view, this, true);
        context = (TextView)findViewById(com.google.android.apps.consumerphotoeditor.R.id.cpe_video_current_time);
        attributeset = (TextView)findViewById(com.google.android.apps.consumerphotoeditor.R.id.cpe_video_total_time);
        SeekBar seekbar = (SeekBar)findViewById(com.google.android.apps.consumerphotoeditor.R.id.cpe_video_player_progress);
        if (super.c != null)
        {
            flag = false;
        }
        p.b(flag);
        super.a = (TextView)p.a(context);
        super.b = (TextView)p.a(attributeset);
        super.c = (SeekBar)p.a(seekbar);
        seekbar.setOnSeekBarChangeListener(this);
    }

    public final void a(ImageView imageview)
    {
        f = imageview;
        y_();
    }

    protected final void y_()
    {
        int i;
        if (!super.e.isEmpty())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        while (i || f == null) 
        {
            return;
        }
        int j = com.google.android.apps.consumerphotoeditor.R.drawable.play_button;
        i = com.google.android.apps.consumerphotoeditor.R.string.play_video;
        if (b())
        {
            j = com.google.android.apps.consumerphotoeditor.R.drawable.pause_button;
            i = com.google.android.apps.consumerphotoeditor.R.string.pause_video;
        }
        f.setImageResource(j);
        f.setContentDescription(getContext().getString(i));
    }
}
