// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;


// Referenced classes of package com.fitbit.data.bl:
//            EntityMerger

static class tyStatus
{

    static final int a[];

    static 
    {
        a = new int[com.fitbit.data.domain.atus.values().length];
        try
        {
            a[com.fitbit.data.domain.atus.PENDING_DELETE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[com.fitbit.data.domain.atus.PENDING_OPERATION.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
