// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.common.ui.titlebar;

import com.facebook.push.mqtt.bu;

// Referenced classes of package com.facebook.orca.common.ui.titlebar:
//            w

class v
{

    static final int a[];
    static final int b[];

    static 
    {
        b = new int[w.values().length];
        try
        {
            b[w.FACEBOOK.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            b[w.SMS_ONLY.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        a = new int[bu.values().length];
        try
        {
            a[bu.DISCONNECTED.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[bu.CONNECTING.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[bu.CONNECTED.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
