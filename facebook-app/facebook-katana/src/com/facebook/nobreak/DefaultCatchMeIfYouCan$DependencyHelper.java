// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nobreak;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.facebook.content.DefaultSecureContextHelper;
import com.facebook.content.SecureContextHelper;
import com.facebook.inject.FbInjector;

class <init>
{

    public static void a(Context context)
    {
        SecureContextHelper securecontexthelper = (SecureContextHelper)DefaultSecureContextHelper.a(FbInjector.a(context));
        ComponentName componentname = new ComponentName(context.getPackageName(), "com.facebook.katana.LogoutActivity");
        securecontexthelper.a((new Intent()).setComponent(componentname).addFlags(0x4000000).addFlags(0x10000000), context);
    }

    private ()
    {
    }

    (byte byte0)
    {
        this();
    }
}
