// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.nccp;


// Referenced classes of package com.netflix.mediaclient.nccp:
//            NccpTransaction, NccpResponse

public interface NccpResponseHandler
{

    public abstract void handle(NccpTransaction nccptransaction, NccpResponse nccpresponse);
}
