// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media;


// Referenced classes of package com.skype.android.media:
//            CameraView, ScaleMode

static final class 
{

    static final int a[];

    static 
    {
        a = new int[ScaleMode.values().length];
        try
        {
            a[ScaleMode.b.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[ScaleMode.a.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
