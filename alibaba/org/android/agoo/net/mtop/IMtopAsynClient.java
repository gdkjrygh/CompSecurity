// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.android.agoo.net.mtop;

import android.content.Context;

// Referenced classes of package org.android.agoo.net.mtop:
//            MtopRequest, MtopResponseHandler

public interface IMtopAsynClient
{

    public abstract void getV3(Context context, MtopRequest mtoprequest, MtopResponseHandler mtopresponsehandler);

    public abstract void setBaseUrl(String s);

    public abstract void setDefaultAppSecret(String s);

    public abstract void setDefaultAppkey(String s);
}
