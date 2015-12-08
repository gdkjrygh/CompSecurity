// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.response;

import com.auditude.ads.exception.AssetException;
import com.auditude.ads.loader.AdRequest;

// Referenced classes of package com.auditude.ads.response:
//            AdResponse

public interface IResponseParser
{
    public static interface ResponseParserListener
    {

        public abstract void onRequestComplete(AssetException assetexception);

        public abstract void onRequestFailed(Throwable throwable);
    }


    public abstract void cancel();

    public abstract void loadAdRequest(AdResponse adresponse, AdRequest adrequest, int i);

    public abstract void setResponseParserListener(ResponseParserListener responseparserlistener);
}
