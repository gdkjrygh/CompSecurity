// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android;


// Referenced classes of package com.skype.android:
//            SkyLibSetup

static final class .Scope
{

    static final int a[];

    static 
    {
        a = new int[com.skype.android.skylib.values().length];
        try
        {
            a[com.skype.android.skylib.b.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[com.skype.android.skylib.a.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
