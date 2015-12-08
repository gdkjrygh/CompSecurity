// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.chat;

import Vx;

// Referenced classes of package com.snapchat.android.fragments.chat:
//            ChatFragment

static final class tus
{

    static final int a[];
    static final int b[];

    static 
    {
        b = new int[Vx.a().length];
        try
        {
            b[0] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            b[1] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        a = new int[com.snapchat.android.ui..ResourceStatus.values().length];
        try
        {
            a[com.snapchat.android.ui..ResourceStatus.LOADED.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[com.snapchat.android.ui..ResourceStatus.NOT_LOADED.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[com.snapchat.android.ui..ResourceStatus.LOADING.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[com.snapchat.android.ui..ResourceStatus.LOADING_FAILED.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
