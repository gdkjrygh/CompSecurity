// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.android.agoo.net.mtop;

import android.content.Context;
import org.android.agoo.net.async.RequestParams;

// Referenced classes of package org.android.agoo.net.mtop:
//            MtopRequest, Result

public interface IMtopSynClient
{

    public abstract org.android.agoo.net.async.SyncHttpClient.SyncResult get(Context context, String s, RequestParams requestparams)
        throws Throwable;

    public abstract Result getV3(Context context, MtopRequest mtoprequest);

    public abstract void setBaseUrl(String s);

    public abstract void setDefaultAppSecret(String s);

    public abstract void setDefaultAppkey(String s);
}
