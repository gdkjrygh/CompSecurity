// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import com.facebook.orca.d.k;

// Referenced classes of package com.facebook.orca.threadview:
//            bh

class bg
{

    static final int a[];
    static final int b[];

    static 
    {
        b = new int[bh.values().length];
        try
        {
            b[bh.DOWNLOADED.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            b[bh.ERROR.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        a = new int[k.values().length];
        try
        {
            a[k.PLAYBACK_STARTED.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            a[k.PLAYBACK_POSITION_UPDATED.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[k.PLAYBACK_COMPLETED.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[k.PLAYBACK_ERROR.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[k.PLAYBACK_STOPPED.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
