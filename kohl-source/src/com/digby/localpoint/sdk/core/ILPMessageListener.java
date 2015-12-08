// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.localpoint.sdk.core;


// Referenced classes of package com.digby.localpoint.sdk.core:
//            ILPMessage, ILPID

public interface ILPMessageListener
{

    public abstract void onAdd(ILPMessage ilpmessage);

    public abstract void onDelete(ILPID ilpid);

    public abstract void onModify(ILPMessage ilpmessage);
}
