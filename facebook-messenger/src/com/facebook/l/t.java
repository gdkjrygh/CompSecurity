// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.l;

import com.facebook.push.mqtt.cj;

class t
{

    static final int a[];

    static 
    {
        a = new int[cj.values().length];
        try
        {
            a[cj.CHANNEL_DISCONNECTED.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror) { }
    }
}
