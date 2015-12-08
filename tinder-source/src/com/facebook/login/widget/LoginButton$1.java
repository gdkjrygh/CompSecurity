// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login.widget;

import android.app.Activity;
import com.facebook.internal.m;

// Referenced classes of package com.facebook.login.widget:
//            LoginButton

final class a
    implements Runnable
{

    final String a;
    final LoginButton b;

    public final void run()
    {
        com.facebook.internal.n._cls1 _lcls1 = m.a(a, false);
        LoginButton.a(b).runOnUiThread(new Runnable(_lcls1) {

            final com.facebook.internal.m.b a;
            final LoginButton._cls1 b;

            public final void run()
            {
                LoginButton.a(b.b, a);
            }

            
            {
                b = LoginButton._cls1.this;
                a = b1;
                super();
            }
        });
    }

    _cls1.a(LoginButton loginbutton, String s)
    {
        b = loginbutton;
        a = s;
        super();
    }
}
