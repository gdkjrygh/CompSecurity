// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;

// Referenced classes of package com.snapchat.android.ui:
//            LinkTextViewUtils

public static class a extends URLSpan
{

    private final a a;

    public void onClick(View view)
    {
        a.a();
    }

    public void updateDrawState(TextPaint textpaint)
    {
        super.updateDrawState(textpaint);
        textpaint.setUnderlineText(false);
    }

    public (String s,  )
    {
        super(s);
        a = ;
    }
}
