// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.friends.ui;


// Referenced classes of package com.fitbit.friends.ui:
//            MessagesFragment

static class icationType
{

    static final int a[];

    static 
    {
        a = new int[com.fitbit.data.domain.cationType.values().length];
        try
        {
            a[com.fitbit.data.domain.cationType.CHEER.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[com.fitbit.data.domain.cationType.TAUNT.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[com.fitbit.data.domain.cationType.CORPORATE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
