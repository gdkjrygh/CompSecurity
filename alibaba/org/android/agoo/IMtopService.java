// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.android.agoo;

import android.content.Context;
import org.android.agoo.client.MtopProxyRequest;
import org.android.agoo.client.MtopProxyResponseHandler;
import org.android.agoo.client.MtopSyncResult;

public interface IMtopService
{

    public abstract MtopSyncResult getV3(Context context, MtopProxyRequest mtopproxyrequest);

    public abstract void sendMtop(Context context, MtopProxyRequest mtopproxyrequest);

    public abstract void sendMtop(Context context, MtopProxyRequest mtopproxyrequest, MtopProxyResponseHandler mtopproxyresponsehandler);
}
