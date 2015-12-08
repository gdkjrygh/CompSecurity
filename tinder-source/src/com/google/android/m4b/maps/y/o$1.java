// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.y;

import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.m4b.maps.y:
//            o

static final class 
{

    static final int a[];

    static 
    {
        a = new int[TimeUnit.values().length];
        try
        {
            a[TimeUnit.NANOSECONDS.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[TimeUnit.MICROSECONDS.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[TimeUnit.MILLISECONDS.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[TimeUnit.SECONDS.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
