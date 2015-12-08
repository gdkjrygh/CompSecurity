// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.tasks;


// Referenced classes of package com.fitbit.galileo.tasks:
//            GalileoCompoundTask

static class bTaskQueueAction
{

    static final int a[];

    static 
    {
        a = new int[bTaskQueueAction.values().length];
        try
        {
            a[bTaskQueueAction.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[bTaskQueueAction.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[bTaskQueueAction.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
