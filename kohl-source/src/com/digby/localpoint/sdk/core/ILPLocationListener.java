// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.localpoint.sdk.core;


// Referenced classes of package com.digby.localpoint.sdk.core:
//            ILPLocation, ILPError, ILPID

public interface ILPLocationListener
{

    public abstract void onAdd(ILPLocation ilplocation);

    public abstract void onCheckInFailure(ILPLocation ilplocation, ILPError ilperror);

    public abstract void onCheckInSuccess(ILPLocation ilplocation);

    public abstract void onDelete(ILPID ilpid);

    public abstract void onEntry(ILPLocation ilplocation);

    public abstract void onExit(ILPLocation ilplocation);

    public abstract void onModify(ILPLocation ilplocation);
}
