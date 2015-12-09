// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui;


// Referenced classes of package com.fitbit.ui:
//            StateSupportFragment

static class Status
{

    static final int a[];

    static 
    {
        a = new int[com.fitbit.savedstate.alues().length];
        try
        {
            a[com.fitbit.savedstate..rdinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[com.fitbit.savedstate..rdinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[com.fitbit.savedstate..rdinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
