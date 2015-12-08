// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;

// Referenced classes of package com.snapchat.android.ui:
//            LinkFriendlyTextView

static class  extends URLSpan
{

    public void updateDrawState(TextPaint textpaint)
    {
        super.updateDrawState(textpaint);
        textpaint.setUnderlineText(false);
    }

    public (String s)
    {
        super(s);
    }
}
