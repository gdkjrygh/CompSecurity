// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;

import com.facebook.mqtt.messages.k;

// Referenced classes of package com.facebook.push.mqtt:
//            ag

class z
{

    static final int a[];
    static final int b[];

    static 
    {
        b = new int[k.values().length];
        try
        {
            b[k.PUBACK.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            b[k.SUBACK.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            b[k.UNSUBACK.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            b[k.PINGRESP.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        a = new int[ag.values().length];
        try
        {
            a[ag.CONNECT_FAILED.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[ag.CONNECTION_LOST.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[ag.BY_REQUEST.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
