// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.accounts;

import com.facebook.internal.m;
import com.facebook.j;
import com.facebook.login.o;

public class AuthenticationModule
{

    public AuthenticationModule()
    {
    }

    public j providesCallbackManager()
    {
        return new m();
    }

    public o providesFacebookLoginManager()
    {
        return o.a();
    }
}
