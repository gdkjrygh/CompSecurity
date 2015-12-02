// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;


// Referenced classes of package com.facebook.push.mqtt:
//            ar, cj

class cf
{

    static final int a[];
    static final int b[];

    static 
    {
        b = new int[ar.values().length];
        try
        {
            b[ar.ALWAYS.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            b[ar.DEVICE_USE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            b[ar.APP_USE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        a = new int[cj.values().length];
        try
        {
            a[cj.SERVICE_STARTED.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[cj.SERVICE_STOPPED.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
