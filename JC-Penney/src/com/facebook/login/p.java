// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;

import android.view.View;
import com.facebook.ba;

// Referenced classes of package com.facebook.login:
//            i, n

class p
    implements i
{

    final View a;
    final n b;

    p(n n, View view)
    {
        b = n;
        a = view;
        super();
    }

    public void a()
    {
        a.findViewById(ba.com_facebook_login_activity_progress_bar).setVisibility(0);
    }

    public void b()
    {
        a.findViewById(ba.com_facebook_login_activity_progress_bar).setVisibility(8);
    }
}
