// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.ui;

import android.app.ActionBar;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.view.View;

// Referenced classes of package com.microsoft.onlineid.internal.ui:
//            e, d

public final class com.microsoft.onlineid.internal.ui.a
{
    private static final class a extends MetricAffectingSpan
    {

        private Typeface a;

        public final void updateDrawState(TextPaint textpaint)
        {
            textpaint.setTypeface(a);
            textpaint.setFlags(textpaint.getFlags() | 0x80);
        }

        public final void updateMeasureState(TextPaint textpaint)
        {
            textpaint.setTypeface(a);
            textpaint.setFlags(textpaint.getFlags() | 0x80);
        }

        public a(Typeface typeface)
        {
            a = typeface;
        }
    }


    public static final int a = Color.rgb(88, 88, 88);

    public static void a(Activity activity, CharSequence charsequence)
    {
        ActionBar actionbar = activity.getActionBar();
        if (actionbar == null)
        {
            return;
        } else
        {
            charsequence = charsequence.toString();
            SpannableString spannablestring = new SpannableString(charsequence);
            spannablestring.setSpan(new a(e.c.a(activity.getApplicationContext())), 0, charsequence.length(), 18);
            actionbar.setTitle(spannablestring);
            charsequence = activity.findViewById(0x102002c);
            charsequence.setPadding(0, 0, 0, 0);
            int i = d.a(32F, activity.getResources().getDisplayMetrics());
            activity = charsequence.getLayoutParams();
            activity.height = i;
            activity.width = i;
            return;
        }
    }

}
