// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login.widget;

import com.facebook.AccessToken;
import com.facebook.i;

// Referenced classes of package com.facebook.login.widget:
//            LoginButton

final class c extends i
{

    final LoginButton d;

    c(LoginButton loginbutton)
    {
        d = loginbutton;
        super();
    }

    protected final void a(AccessToken accesstoken)
    {
        LoginButton.b(d);
    }
}
