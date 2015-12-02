// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.mqtt.a;

import com.facebook.mqtt.messages.k;

class i
{

    static final int a[];

    static 
    {
        a = new int[k.values().length];
        try
        {
            a[k.CONNECT.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        try
        {
            a[k.CONNACK.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            a[k.SUBSCRIBE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            a[k.SUBACK.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            a[k.UNSUBSCRIBE.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            a[k.PUBLISH.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            a[k.DISCONNECT.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            a[k.PINGREQ.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[k.PINGRESP.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[k.PUBACK.ordinal()] = 10;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[k.UNSUBACK.ordinal()] = 11;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
