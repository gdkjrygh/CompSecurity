// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.widget.rewards;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.jcp.views.HtmlTypefaceTextView;

// Referenced classes of package com.jcp.widget.rewards:
//            a, b

public class AgreeToTermsAndConditions extends LinearLayout
{

    protected CheckBox cbAgree;
    protected HtmlTypefaceTextView tvTermsAndConditions;

    public AgreeToTermsAndConditions(Context context)
    {
        super(context);
        a(context);
    }

    public AgreeToTermsAndConditions(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a(context);
    }

    public AgreeToTermsAndConditions(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a(context);
    }

    private void a(Context context)
    {
        inflate(context, 0x7f0300d1, this);
        ButterKnife.inject(this);
        String s = getResources().getString(0x7f070199);
        SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder(s);
        String s1 = getResources().getString(0x7f07038c);
        int i = s.indexOf(s1);
        if (i >= 0)
        {
            spannablestringbuilder.setSpan(new a(this, context), i, s1.length() + i, 0);
        }
        s1 = getResources().getString(0x7f070389);
        i = s.indexOf(s1);
        if (i >= 0)
        {
            spannablestringbuilder.setSpan(new b(this, context), i, s1.length() + i, 0);
        }
        tvTermsAndConditions.setMovementMethod(LinkMovementMethod.getInstance());
        tvTermsAndConditions.setText(spannablestringbuilder, android.widget.TextView.BufferType.SPANNABLE);
    }

    public boolean a()
    {
        return cbAgree.isChecked();
    }
}
