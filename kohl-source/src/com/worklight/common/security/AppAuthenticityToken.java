// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.common.security;

import android.content.Context;

public class AppAuthenticityToken
{

    public AppAuthenticityToken()
    {
        System.loadLibrary("authjni");
    }

    public native String a1(Context context, String s);
}
