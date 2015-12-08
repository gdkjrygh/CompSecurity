// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.operation.identity;


// Referenced classes of package com.snapchat.android.operation.identity:
//            UpdateVerifiedDeviceOperation

static final class tion
{

    static final int a[];

    static 
    {
        a = new int[tion.values().length];
        try
        {
            a[tion.SAVE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[tion.DELETE_ALL.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[tion.DELETE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
