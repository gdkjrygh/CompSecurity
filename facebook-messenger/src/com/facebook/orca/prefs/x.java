// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.prefs;

import com.facebook.contacts.upload.k;

// Referenced classes of package com.facebook.orca.prefs:
//            y

class x
{

    static final int a[];
    static final int b[];

    static 
    {
        b = new int[k.values().length];
        try
        {
            b[k.NOT_STARTED.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            b[k.STARTED.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            b[k.RUNNING.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            b[k.SUCCEEDED.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            b[k.FAILED.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        a = new int[y.values().length];
        try
        {
            a[y.NOT_STARTED.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[y.IN_PROGRESS.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[y.FINISHED_SUCCESS.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[y.FINISHED_ERROR.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
