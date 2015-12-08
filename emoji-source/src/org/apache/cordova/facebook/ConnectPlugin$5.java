// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.facebook;

import com.facebook.Response;
import com.facebook.model.GraphUser;
import org.apache.cordova.CallbackContext;

// Referenced classes of package org.apache.cordova.facebook:
//            ConnectPlugin

class val._callbackContext
    implements com.facebook.rCallback
{

    final ConnectPlugin this$0;
    final CallbackContext val$_callbackContext;

    public void onCompleted(GraphUser graphuser, Response response)
    {
        if (response.getError() != null)
        {
            val$_callbackContext.error(getFacebookRequestErrorResponse(response.getError()));
            return;
        } else
        {
            ConnectPlugin.access$402(ConnectPlugin.this, graphuser.getId());
            val$_callbackContext.success(getResponse());
            return;
        }
    }

    ()
    {
        this$0 = final_connectplugin;
        val$_callbackContext = CallbackContext.this;
        super();
    }
}
