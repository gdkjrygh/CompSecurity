// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.login;

import android.content.Context;
import android.content.Intent;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.roidapp.cloudlib.al;

// Referenced classes of package com.roidapp.cloudlib.sns.login:
//            LoginTipsTextView

final class l extends ClickableSpan
{

    final LoginTipsTextView a;

    l(LoginTipsTextView logintipstextview)
    {
        a = logintipstextview;
        super();
    }

    public final void onClick(View view)
    {
        a.getContext().startActivity(new Intent(a.getContext(), al.g().b()));
    }

    public final void updateDrawState(TextPaint textpaint)
    {
        super.updateDrawState(textpaint);
        textpaint.setUnderlineText(false);
        textpaint.setColor(a.getCurrentHintTextColor());
    }
}
