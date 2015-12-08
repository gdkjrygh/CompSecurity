// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.text;

import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import com.pinterest.base.Colors;

// Referenced classes of package com.pinterest.ui.text:
//            NoUnderlineClickSpan

public class BlackClickSpan extends NoUnderlineClickSpan
{

    private static final int DEFAULT_COLOR;
    private final int _color;

    public BlackClickSpan()
    {
        _color = DEFAULT_COLOR;
    }

    public BlackClickSpan(int i)
    {
        _color = i;
    }

    public static Spanned getSpannable(Spanned spanned)
    {
        return getSpannable(spanned, DEFAULT_COLOR);
    }

    public static Spanned getSpannable(Spanned spanned, int i)
    {
        if (spanned instanceof Spannable)
        {
            spanned = (Spannable)spanned;
        } else
        {
            spanned = new SpannableString(spanned);
        }
        spanned.setSpan(new BlackClickSpan(i), 0, spanned.length(), 33);
        return spanned;
    }

    public static Spanned getSpannable(String s)
    {
        return getSpannable(s, DEFAULT_COLOR);
    }

    public static Spanned getSpannable(String s, int i)
    {
        return getSpannable(Html.fromHtml(s), i);
    }

    public void updateDrawState(TextPaint textpaint)
    {
        super.updateDrawState(textpaint);
        textpaint.setColor(_color);
    }

    static 
    {
        DEFAULT_COLOR = Colors.TEXT_DARK;
    }
}
