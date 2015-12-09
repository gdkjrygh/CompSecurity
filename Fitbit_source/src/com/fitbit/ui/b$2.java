// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui;


// Referenced classes of package com.fitbit.ui:
//            b

static class eldError
{

    static final int a[];

    static 
    {
        a = new int[com.fitbit.savedstate.aStoreUtilsSavedState.ConfirmationScope.values().length];
        try
        {
            a[com.fitbit.savedstate.aStoreUtilsSavedState.ConfirmationScope.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[com.fitbit.savedstate.aStoreUtilsSavedState.ConfirmationScope.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[com.fitbit.savedstate.aStoreUtilsSavedState.ConfirmationScope.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
