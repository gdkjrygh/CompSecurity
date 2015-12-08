// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.app;

import com.facebook.config.application.IntendedAudience;

class 
{

    static final int a[];

    static 
    {
        a = new int[IntendedAudience.values().length];
        try
        {
            a[IntendedAudience.DEVELOPMENT.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[IntendedAudience.PUBLIC.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[IntendedAudience.FACEBOOK.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
