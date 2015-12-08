// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.facebook;

import android.util.Log;
import com.facebook.Response;
import com.facebook.model.GraphObject;
import com.facebook.model.GraphUser;
import org.apache.cordova.CallbackContext;
import org.json.JSONObject;

// Referenced classes of package org.apache.cordova.facebook:
//            ConnectPlugin

class this._cls0
    implements com.facebook.Callback
{

    final ConnectPlugin this$0;

    public void onCompleted(GraphUser graphuser, Response response)
    {
        if (ConnectPlugin.access$1000(ConnectPlugin.this) != null)
        {
            if (response.getError() != null)
            {
                ConnectPlugin.access$1000(ConnectPlugin.this).error(getFacebookRequestErrorResponse(response.getError()));
                return;
            } else
            {
                response = response.getGraphObject();
                Log.d("ConnectPlugin", (new StringBuilder()).append("returning login object ").append(response.getInnerJSONObject().toString()).toString());
                ConnectPlugin.access$402(ConnectPlugin.this, graphuser.getId());
                ConnectPlugin.access$1000(ConnectPlugin.this).success(getResponse());
                ConnectPlugin.access$1002(ConnectPlugin.this, null);
                return;
            }
        } else
        {
            ConnectPlugin.access$402(ConnectPlugin.this, graphuser.getId());
            return;
        }
    }

    ()
    {
        this$0 = ConnectPlugin.this;
        super();
    }
}
