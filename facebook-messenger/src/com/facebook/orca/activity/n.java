// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.activity;

import android.content.Context;
import android.content.Intent;
import com.facebook.auth.login.LogoutFragment;
import com.facebook.c.s;
import com.facebook.orca.auth.StartScreenActivity;
import com.facebook.orca.auth.c;

public class n
    implements c
{

    private final Context a;
    private final s b;

    public n(Context context, s s1)
    {
        a = context;
        b = s1;
    }

    private Intent c()
    {
        Intent intent = new Intent(a, com/facebook/orca/auth/StartScreenActivity);
        intent.putExtra("orca:loginparam:LoginFragmentState", com/facebook/auth/login/LogoutFragment.getName());
        return intent;
    }

    private Intent d()
    {
        Intent intent = c();
        intent.putExtra(LogoutFragment.a, true);
        return intent;
    }

    public void a()
    {
        b.a(c(), a);
    }

    public void b()
    {
        b.a(d(), a);
    }
}
