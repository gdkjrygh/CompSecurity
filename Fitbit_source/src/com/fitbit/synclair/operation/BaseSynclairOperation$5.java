// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.synclair.operation;


// Referenced classes of package com.fitbit.synclair.operation:
//            BaseSynclairOperation

static class fo.SynclairOperationResult
{

    static final int a[];

    static 
    {
        a = new int[com.fitbit.synclair.operation.info.nclairOperationResult.values().length];
        try
        {
            a[com.fitbit.synclair.operation.info.nclairOperationResult.c.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[com.fitbit.synclair.operation.info.nclairOperationResult.a.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[com.fitbit.synclair.operation.info.nclairOperationResult.b.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
