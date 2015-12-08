// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login.widget;

import android.app.Activity;
import com.facebook.internal.U;

// Referenced classes of package com.facebook.login.widget:
//            LoginButton, b

final class a
    implements Runnable
{

    final String a;
    final LoginButton b;

    a(LoginButton loginbutton, String s)
    {
        b = loginbutton;
        a = s;
        super();
    }

    public final void run()
    {
        com.facebook.internal.U.b b1 = U.a(a, false);
        LoginButton.a(b).runOnUiThread(new b(this, b1));
    }
}
