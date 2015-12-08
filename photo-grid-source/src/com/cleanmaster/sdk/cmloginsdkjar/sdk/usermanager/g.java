// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.sdk.cmloginsdkjar.sdk.usermanager;

import com.cleanmaster.sdk.cmloginsdkjar.CmLoginSdkException;
import com.cleanmaster.sdk.cmloginsdkjar.CmLoginSdkRequestError;
import com.cleanmaster.sdk.cmloginsdkjar.Response;
import com.cleanmaster.sdk.cmloginsdkjar.model.CmRawObject;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

// Referenced classes of package com.cleanmaster.sdk.cmloginsdkjar.sdk.usermanager:
//            UserManagerImpl

final class g
    implements com.cleanmaster.sdk.cmloginsdkjar.Request.CmProxyCmbTokenCallback
{

    final CmRawObject a[];
    final UserManagerImpl b;

    g(UserManagerImpl usermanagerimpl, CmRawObject acmrawobject[])
    {
        b = usermanagerimpl;
        a = acmrawobject;
        super();
    }

    public final void onCompleted(CmRawObject cmrawobject, Response response)
    {
        int i = 200;
        if (response.getConnection() != null)
        {
            try
            {
                i = response.getConnection().getResponseCode();
            }
            catch (SocketTimeoutException sockettimeoutexception)
            {
                i = 4040;
            }
            catch (UnknownHostException unknownhostexception)
            {
                i = 4041;
            }
            catch (IOException ioexception)
            {
                i = 4039;
            }
        }
        if (i > 400)
        {
            cmrawobject = new CmLoginSdkException();
            cmrawobject.setExceptionRet(i);
            throw cmrawobject;
        }
        if (response.getError() != null)
        {
            response = response.getError().getException();
            if (response != null)
            {
                throw response;
            }
        }
        a[0] = cmrawobject;
    }
}
