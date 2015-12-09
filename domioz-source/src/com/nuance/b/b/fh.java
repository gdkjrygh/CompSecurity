// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import android.content.ContentResolver;
import android.content.Context;

final class fh
{

    private final boolean a;
    private final ContentResolver b;
    private final String c;

    public fh(Context context, String s)
    {
        if (context == null)
        {
            throw new IllegalArgumentException("Context must not be null");
        }
        boolean flag;
        if (context.checkCallingOrSelfPermission("android.permission.WRITE_SETTINGS") == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
        b = context.getContentResolver();
        c = (new StringBuilder()).append(context.getPackageName()).append(s).toString();
    }

    public final boolean a()
    {
        return a;
    }

    public final boolean a(String s)
    {
        if (a)
        {
            return android.provider.Settings.System.putString(b, c, s);
        } else
        {
            return false;
        }
    }

    public final String b()
    {
        if (a)
        {
            return android.provider.Settings.System.getString(b, c);
        } else
        {
            return null;
        }
    }
}
