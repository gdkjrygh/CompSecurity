// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.billing;


// Referenced classes of package com.snapchat.android.billing:
//            InAppBillingManager

static final class uType
{

    static final int a[];

    static 
    {
        a = new int[uType.values().length];
        try
        {
            a[uType.REPLAY.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[uType.LENS.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
