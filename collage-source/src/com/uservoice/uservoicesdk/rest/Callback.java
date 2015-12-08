// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.rest;


// Referenced classes of package com.uservoice.uservoicesdk.rest:
//            RestResult

public abstract class Callback
{

    public Callback()
    {
    }

    public abstract void onError(RestResult restresult);

    public abstract void onModel(Object obj);
}
