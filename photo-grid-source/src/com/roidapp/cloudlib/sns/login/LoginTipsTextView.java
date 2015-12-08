// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.login;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import com.roidapp.cloudlib.at;

// Referenced classes of package com.roidapp.cloudlib.sns.login:
//            k, l, m

public class LoginTipsTextView extends TextView
{

    public LoginTipsTextView(Context context)
    {
        super(context);
        a();
    }

    public LoginTipsTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a();
    }

    public LoginTipsTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a();
    }

    private void a()
    {
        setGravity(17);
        setText(getContext().getString(at.bu));
        SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder(" EULA");
        spannablestringbuilder.setSpan(new k(this), 0, spannablestringbuilder.length(), 33);
        append(spannablestringbuilder);
        append(" and ");
        spannablestringbuilder = new SpannableStringBuilder("Privacy Policy.");
        spannablestringbuilder.setSpan(new l(this), 0, spannablestringbuilder.length() - 1, 33);
        append(spannablestringbuilder);
        setMovementMethod(LinkMovementMethod.getInstance());
        setHighlightColor(getResources().getColor(0x106000d));
        setOnLongClickListener(new m(this));
    }
}
