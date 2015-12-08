// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.activities;

import android.content.Intent;
import com.tinder.model.InstagramCodeError;

// Referenced classes of package com.tinder.activities:
//            WebViewActivityInstagram

final class a
    implements a
{

    final WebViewActivityInstagram a;

    public final void a(InstagramCodeError instagramcodeerror)
    {
        (new StringBuilder("Instagram access code error: ")).append(instagramcodeerror);
        Intent intent = a.getIntent();
        intent.putExtra("access_code_error", instagramcodeerror);
        a.setResult(99, intent);
        a.finish();
    }

    public final void a(String s)
    {
        Intent intent = a.getIntent();
        intent.putExtra("access_code", s);
        a.setResult(-1, intent);
        a.finish();
    }

    (WebViewActivityInstagram webviewactivityinstagram)
    {
        a = webviewactivityinstagram;
        super();
    }
}
