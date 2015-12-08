// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;

import android.view.View;

// Referenced classes of package com.facebook.login:
//            b

final class 
    implements nClient.a
{

    final View a;
    final b b;

    public final void a()
    {
        a.findViewById(com.facebook.com_facebook_login_activity_progress_bar).setVisibility(0);
    }

    public final void b()
    {
        a.findViewById(com.facebook.com_facebook_login_activity_progress_bar).setVisibility(8);
    }

    nClient.a(b b1, View view)
    {
        b = b1;
        a = view;
        super();
    }
}
