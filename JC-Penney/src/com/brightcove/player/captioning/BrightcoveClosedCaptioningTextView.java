// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.captioning;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

// Referenced classes of package com.brightcove.player.captioning:
//            BrightcoveCaptionStyle

public class BrightcoveClosedCaptioningTextView extends TextView
{

    public static final String TAG = com/brightcove/player/captioning/BrightcoveClosedCaptioningTextView.getSimpleName();
    private int a;
    private int b;
    private float c;

    public BrightcoveClosedCaptioningTextView(Context context)
    {
        super(context);
        a = 0;
        b = 0xff000000;
        c = 2.0F;
        a();
    }

    public BrightcoveClosedCaptioningTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = 0;
        b = 0xff000000;
        c = 2.0F;
        a();
    }

    public BrightcoveClosedCaptioningTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = 0;
        b = 0xff000000;
        c = 2.0F;
        a();
    }

    private int a(int i, int j)
    {
        return Color.argb(Color.alpha(j), Color.red(i), Color.green(i), Color.blue(i));
    }

    protected void a()
    {
        setSingleLine(false);
        setPadding(3, 3, 3, 3);
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        if (a == 1)
        {
            for (int i = 0; i < 5; i++)
            {
                super.draw(canvas);
            }

        }
    }

    public void setStyle(BrightcoveCaptionStyle brightcovecaptionstyle)
    {
        b = brightcovecaptionstyle.edgeColor();
        a = brightcovecaptionstyle.edgeType();
        setTypeface(Typeface.create(brightcovecaptionstyle.typeface(), 0));
        if (a != 0) goto _L2; else goto _L1
_L1:
        setShadowLayer(0.0F, 0.0F, 0.0F, 0);
_L4:
        if (getText().equals(""))
        {
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (a == 3)
        {
            setShadowLayer(0.01F, c, 0.0F, b);
        } else
        if (a == 4)
        {
            setShadowLayer(0.01F, -c, 0.0F, b);
        } else
        if (a == 1)
        {
            setShadowLayer(3F, 0.0F, 0.0F, b);
        } else
        if (a == 2)
        {
            setShadowLayer(0.01F, c, c, b);
        }
        if (true) goto _L4; else goto _L3
_L3:
        Object obj = getParent();
        if (obj != null && ((ViewGroup)obj).getId() == com.brightcove.player.R.id.caption_block)
        {
            ((LinearLayout)obj).setBackgroundColor(a(brightcovecaptionstyle.windowColor(), brightcovecaptionstyle.windowOpacity()));
        }
        obj = new SpannableStringBuilder();
        SpannableString spannablestring = new SpannableString(getText());
        int i = getText().length();
        spannablestring.setSpan(new ForegroundColorSpan(a(brightcovecaptionstyle.foregroundColor(), brightcovecaptionstyle.foregroundOpacity())), 0, i, 33);
        spannablestring.setSpan(new BackgroundColorSpan(a(brightcovecaptionstyle.backgroundColor(), brightcovecaptionstyle.backgroundOpacity())), 0, i, 33);
        Float float1 = Float.valueOf(24F);
        brightcovecaptionstyle = Float.valueOf(Float.parseFloat(brightcovecaptionstyle.fontSize()));
        if (brightcovecaptionstyle.floatValue() > 0.0F && float1.floatValue() > 0.0F)
        {
            float f = brightcovecaptionstyle.floatValue();
            setTextSize(float1.floatValue() * f);
        }
        ((SpannableStringBuilder) (obj)).append(spannablestring);
        setText(((CharSequence) (obj)));
        return;
    }

}
