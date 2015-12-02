// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.upload;

import com.facebook.contacts.server.af;
import com.facebook.contacts.server.ag;

// Referenced classes of package com.facebook.contacts.upload:
//            h

class g
{

    static final int a[];
    static final int b[];
    static final int c[];

    static 
    {
        c = new int[af.values().length];
        try
        {
            c[af.HIGH.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            c[af.MEDIUM.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        b = new int[h.values().length];
        try
        {
            b[h.LOCAL_CONTACT_IDS.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            b[h.REMOTE_CONTACT_IDS.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        a = new int[ag.values().length];
        try
        {
            a[ag.ADD.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[ag.NONE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[ag.MODIFY.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[ag.REMOVE.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
