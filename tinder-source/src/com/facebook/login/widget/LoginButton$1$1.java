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

    final com.facebook.internal._cls1._cls1.a a;
    final a b;

    public final void run()
    {
        LoginButton.a(b.b, a);
    }

    ( , com.facebook.internal._cls1 _pcls1)
    {
        b = ;
        a = _pcls1;
        super();
    }

    // Unreferenced inner class com/facebook/login/widget/LoginButton$1

/* anonymous class */
    final class LoginButton._cls1
        implements Runnable
    {

        final String a;
        final LoginButton b;

        public final void run()
        {
            com.facebook.internal.m.b b1 = m.a(a, false);
            LoginButton.a(b).runOnUiThread(new LoginButton._cls1._cls1(this, b1));
        }

            
            {
                b = loginbutton;
                a = s;
                super();
            }
    }

}
