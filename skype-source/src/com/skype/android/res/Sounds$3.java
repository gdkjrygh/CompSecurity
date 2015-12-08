// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.res;

import com.skype.android.audio.AudioRoute;

// Referenced classes of package com.skype.android.res:
//            Sounds

static final class ute
{

    static final int a[];

    static 
    {
        a = new int[AudioRoute.values().length];
        try
        {
            a[AudioRoute.b.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror) { }
    }
}
