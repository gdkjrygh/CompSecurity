// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;


// Referenced classes of package com.skype.android.app.media:
//            UrlPreviewMediaAgent

public static class result
{

    private eviewFuture future;
    private lt result;

    public eviewFuture getFuture()
    {
        return future;
    }

    public lt getResult()
    {
        return result;
    }

    public lt(eviewFuture eviewfuture, lt lt)
    {
        future = eviewfuture;
        result = lt;
    }
}
