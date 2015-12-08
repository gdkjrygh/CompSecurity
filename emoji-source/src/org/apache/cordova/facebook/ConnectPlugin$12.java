// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.facebook;

import com.facebook.Response;
import com.facebook.model.GraphObject;
import org.apache.cordova.CallbackContext;

// Referenced classes of package org.apache.cordova.facebook:
//            ConnectPlugin

class this._cls0
    implements com.facebook.nnectPlugin._cls12
{

    final ConnectPlugin this$0;

    public void onCompleted(Response response)
    {
        if (ConnectPlugin.access$800(ConnectPlugin.this) != null)
        {
            if (response.getError() != null)
            {
                ConnectPlugin.access$800(ConnectPlugin.this).error(getFacebookRequestErrorResponse(response.getError()));
            } else
            {
                response = response.getGraphObject();
                ConnectPlugin.access$800(ConnectPlugin.this).success(response.getInnerJSONObject());
            }
            ConnectPlugin.access$902(ConnectPlugin.this, null);
            ConnectPlugin.access$802(ConnectPlugin.this, null);
        }
    }

    ()
    {
        this$0 = ConnectPlugin.this;
        super();
    }
}
