// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.userscope;

import android.content.Context;

// Referenced classes of package com.google.android.apps.wallet.userscope:
//            UserScopedApplication

public final class UserInjector
{

    public static Object get(Class class1, Context context)
    {
        return ((UserScopedApplication)context.getApplicationContext()).getInUserScope(class1);
    }

    public static void inject(Object obj, Context context)
    {
        ((UserScopedApplication)context.getApplicationContext()).injectInUserScope(obj);
    }
}
