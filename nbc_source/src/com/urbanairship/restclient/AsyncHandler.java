// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.restclient;

import com.urbanairship.Logger;
import java.io.OutputStream;

// Referenced classes of package com.urbanairship.restclient:
//            Response

public abstract class AsyncHandler
{

    public AsyncHandler()
    {
    }

    public abstract void onComplete(Response response);

    public void onData(OutputStream outputstream)
    {
    }

    public void onError(Exception exception)
    {
        Logger.error("Request threw exception:", exception);
    }

    public void onProgress(int i)
    {
    }
}
