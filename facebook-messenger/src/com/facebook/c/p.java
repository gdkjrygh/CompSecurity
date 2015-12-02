// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.c;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;

public class p
{

    public p()
    {
    }

    public static final void a()
    {
        throw new SecurityException("Component access not allowed.");
    }

    public static boolean a(Context context)
    {
        int i = Binder.getCallingUid();
        int j = context.getApplicationInfo().uid;
        return i == j || context.getPackageManager().checkSignatures(j, i) == 0;
    }
}
