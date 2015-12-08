// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.res;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import com.skype.android.app.NavigationUrl;

// Referenced classes of package com.skype.android.res:
//            ChatText

private class a extends URLSpan
{

    final ChatText a;

    public void onClick(View view)
    {
        ChatText.a(a).openUrlInExternalBrowser((Activity)view.getContext(), getURL());
    }

    public void updateDrawState(TextPaint textpaint)
    {
        super.updateDrawState(textpaint);
        textpaint.setUnderlineText(false);
        textpaint.setColor(ChatText.b(a).getResources().getColor(0x7f0f0115));
    }

    public (ChatText chattext, String s)
    {
        a = chattext;
        super(s);
    }
}
