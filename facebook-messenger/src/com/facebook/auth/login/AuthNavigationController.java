// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.login;

import android.content.Intent;
import android.support.v4.app.Fragment;
import com.facebook.base.fragment.NavigableFragmentController;

// Referenced classes of package com.facebook.auth.login:
//            AuthStateMachineConfig

public class AuthNavigationController extends NavigableFragmentController
{

    private AuthStateMachineConfig a;
    private boolean b;

    public AuthNavigationController()
    {
    }

    public AuthStateMachineConfig a()
    {
        return a;
    }

    public void a(Fragment fragment)
    {
        super.a(fragment);
        b = false;
    }

    public void a(AuthStateMachineConfig authstatemachineconfig)
    {
        a = authstatemachineconfig;
    }

    public void b(Intent intent)
    {
        b = true;
        super.b(intent);
    }

    public boolean b()
    {
        return b;
    }
}
