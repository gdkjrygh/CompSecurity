// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.response;

import com.auditude.ads.exception.AssetException;

// Referenced classes of package com.auditude.ads.response:
//            IResponseParser

public static interface 
{

    public abstract void onRequestComplete(AssetException assetexception);

    public abstract void onRequestFailed(Throwable throwable);
}
