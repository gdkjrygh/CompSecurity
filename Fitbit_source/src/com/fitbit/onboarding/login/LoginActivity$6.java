// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.onboarding.login;

import android.text.style.ClickableSpan;
import android.view.View;
import com.fitbit.ui.WebViewActivity;

// Referenced classes of package com.fitbit.onboarding.login:
//            LoginActivity

class a extends ClickableSpan
{

    final LoginActivity a;

    public void onClick(View view)
    {
        view = String.format("file:///android_asset/%s", new Object[] {
            a.getString(0x7f08005d)
        });
        WebViewActivity.a(a, null, view, true);
    }

    (LoginActivity loginactivity)
    {
        a = loginactivity;
        super();
    }
}
