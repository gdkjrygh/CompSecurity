// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.res;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.style.URLSpan;
import android.view.View;
import com.skype.android.app.main.SplashActivity;

// Referenced classes of package com.skype.android.res:
//            ChatText

private class a extends URLSpan
{

    final ChatText a;

    public void onClick(View view)
    {
        if (getURL().startsWith("skype:"))
        {
            view = new Intent("android.intent.action.VIEW");
            view.setData(Uri.parse(getURL()));
            view.setComponent(new ComponentName(ChatText.b(a), com/skype/android/app/main/SplashActivity));
            ChatText.b(a).startActivity(view);
            return;
        } else
        {
            super.onClick(view);
            return;
        }
    }

    public (ChatText chattext, String s)
    {
        a = chattext;
        super(s);
    }
}
