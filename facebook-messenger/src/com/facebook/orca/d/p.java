// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.d;


// Referenced classes of package com.facebook.orca.d:
//            k

class p
{

    static final int a[];

    static 
    {
        a = new int[k.values().length];
        try
        {
            a[k.PLAYBACK_COMPLETED.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[k.PLAYBACK_STOPPED.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[k.PLAYBACK_ERROR.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
