// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.addfriends;


// Referenced classes of package com.snapchat.android.fragments.addfriends:
//            NewUserContactBookFragment

static final class wUserContactBookPageType
{

    static final int a[];

    static 
    {
        a = new int[wUserContactBookPageType.values().length];
        try
        {
            a[wUserContactBookPageType.SNAPCHATTERS.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[wUserContactBookPageType.NON_SNAPCHATTERS.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
