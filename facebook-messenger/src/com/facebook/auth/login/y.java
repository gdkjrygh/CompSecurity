// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.login;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.facebook.c.s;

// Referenced classes of package com.facebook.auth.login:
//            al, LogoutFragment, FirstPartySsoFragment

public class y
    implements al
{

    private final s a;
    private final Class b;

    public y(s s1, Class class1)
    {
        a = s1;
        b = class1;
    }

    public Intent a(Context context)
    {
        context = new Intent(context, b);
        context.putExtra("orca:loginparam:LoginFragmentState", com/facebook/auth/login/LogoutFragment.getName());
        return context;
    }

    public void a(Activity activity)
    {
        a.a(a(((Context) (activity))), activity);
    }

    public Intent b(Context context)
    {
        context = new Intent(context, b);
        context.putExtra("orca:loginparam:LoginFragmentState", com/facebook/auth/login/FirstPartySsoFragment.getName());
        return context;
    }

    public void b(Activity activity)
    {
        a.a(b(((Context) (activity))), activity);
    }
}
