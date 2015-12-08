// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.controller;


// Referenced classes of package com.snapchat.android.controller:
//            MediaOpenOrigin

static final class 
{

    static final int a[];

    static 
    {
        a = new int[MediaOpenOrigin.values().length];
        try
        {
            a[MediaOpenOrigin.STORIES.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            a[MediaOpenOrigin.EXPLORER.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            a[MediaOpenOrigin.CHAT.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            a[MediaOpenOrigin.EXTERNAL.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            a[MediaOpenOrigin.PROFILE_ROLL_QR_SCAN.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[MediaOpenOrigin.CAMERA_QR_SCAN.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[MediaOpenOrigin.PREVIEW_QR_SCAN.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[MediaOpenOrigin.DISCOVER.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
