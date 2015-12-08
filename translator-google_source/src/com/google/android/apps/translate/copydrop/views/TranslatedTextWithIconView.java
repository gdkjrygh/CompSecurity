// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.copydrop.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.translate.m;
import com.google.android.apps.translate.widget.SpeakerView;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.e.h;
import com.google.android.libraries.translate.e.j;
import com.google.android.libraries.translate.languages.Language;
import com.google.android.libraries.translate.logging.Event;
import com.google.android.libraries.translate.logging.e;

public class TranslatedTextWithIconView extends RelativeLayout
    implements android.view.View.OnClickListener, j
{

    private static final String b = com/google/android/apps/translate/copydrop/views/TranslatedTextWithIconView.getSimpleName();
    TextView a;
    private TextView c;
    private ImageView d;
    private SpeakerView e;
    private Language f;

    public TranslatedTextWithIconView(Context context)
    {
        super(context);
    }

    public TranslatedTextWithIconView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public TranslatedTextWithIconView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public final void a(int i, Bundle bundle)
    {
        (new StringBuilder(26)).append("Unknown event: ").append(i);
        if (254 == i)
        {
            a.setVisibility(8);
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        h.a(this, new int[] {
            254
        });
    }

    public void onClick(View view)
    {
        if (view == e)
        {
            e.a();
            view = f.getShortName();
            Singleton.b().a(Event.COPYDROP_INPUT_TARGET_TTS, view, null);
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        h.a(this);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        a = (TextView)findViewById(m.ptt_original_text);
        c = (TextView)findViewById(m.ptt_translated_text);
        d = (ImageView)findViewById(m.ptt_icon);
        e = (SpeakerView)findViewById(m.ptt_play_audio);
        e.setOnClickListener(this);
    }

    public void setAppIcon(Drawable drawable)
    {
        d.setImageDrawable(drawable);
    }

    public void setOriginalText(String s)
    {
        a.setText(s);
    }

    public void setTranslatedText(String s, Language language)
    {
        c.setText(s);
        f = language;
        e.setTextToPlay(s, f, "target");
    }

}
