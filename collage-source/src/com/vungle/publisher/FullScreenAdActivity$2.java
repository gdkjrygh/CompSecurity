// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher;


// Referenced classes of package com.vungle.publisher:
//            FullScreenAdActivity, Orientation

static final class 
{

    static final int a[];

    static 
    {
        a = new int[Orientation.values().length];
        try
        {
            a[Orientation.autoRotate.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[Orientation.matchVideo.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
