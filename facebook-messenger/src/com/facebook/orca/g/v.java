// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.g;

import com.facebook.fbservice.service.s;

class v
{

    static final int a[];

    static 
    {
        a = new int[s.values().length];
        try
        {
            a[s.STALE_DATA_OKAY.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[s.DO_NOT_CHECK_SERVER.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[s.PREFER_CACHE_IF_UP_TO_DATE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[s.CHECK_SERVER_FOR_NEW_DATA.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
