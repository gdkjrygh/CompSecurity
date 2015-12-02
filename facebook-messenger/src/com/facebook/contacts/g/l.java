// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.g;

import com.facebook.contacts.server.ad;
import com.facebook.contacts.server.c;

class l
{

    static final int a[];
    static final int b[];

    static 
    {
        b = new int[c.values().length];
        try
        {
            b[c.SMS_SENT.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            b[c.SMS_RECEIVED.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            b[c.MMS_SENT.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            b[c.MMS_RECEIVED.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            b[c.CALL_SENT.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            b[c.CALL_RECEIVED.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        a = new int[ad.values().length];
        try
        {
            a[ad.ADD.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[ad.MODIFY.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[ad.DELETE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
