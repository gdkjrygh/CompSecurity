// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient;

import com.worklight.nativeandroid.common.WLUtils;
import com.worklight.wlclient.api.WLFailResponse;
import com.worklight.wlclient.api.WLResponse;
import com.worklight.wlclient.api.WLResponseListener;
import java.util.TreeMap;
import org.apache.http.Header;
import org.json.JSONException;

// Referenced classes of package com.worklight.wlclient:
//            WLAuthorizationManagerInternal

class this._cls1
    implements WLResponseListener
{

    final onFailure this$1;

    public void onFailure(WLFailResponse wlfailresponse)
    {
        WLAuthorizationManagerInternal.access$700(_fld0, scope, wlfailresponse);
    }

    public void onSuccess(WLResponse wlresponse)
    {
        try
        {
            WLAuthorizationManagerInternal.access$800(_fld0, wlresponse);
            return;
        }
        catch (JSONException jsonexception)
        {
            onFailure(new WLFailResponse(wlresponse));
        }
    }

    l.scope()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/worklight/wlclient/WLAuthorizationManagerInternal$5

/* anonymous class */
    class WLAuthorizationManagerInternal._cls5
        implements WLResponseListener
    {

        final WLAuthorizationManagerInternal this$0;
        final String val$scope;

        public void onFailure(WLFailResponse wlfailresponse)
        {
            WLAuthorizationManagerInternal.access$700(WLAuthorizationManagerInternal.this, scope, wlfailresponse);
        }

        public void onSuccess(WLResponse wlresponse)
        {
            Object obj = wlresponse.getHeader("location");
            if (obj == null)
            {
                WLAuthorizationManagerInternal.access$700(WLAuthorizationManagerInternal.this, scope, new WLFailResponse(wlresponse));
                return;
            }
            obj = (String)WLUtils.extractParametersFromURL(((Header) (obj)).getValue()).get("code");
            if (obj == null)
            {
                WLAuthorizationManagerInternal.access$700(WLAuthorizationManagerInternal.this, scope, new WLFailResponse(wlresponse));
                return;
            } else
            {
                WLAuthorizationManagerInternal.access$900(WLAuthorizationManagerInternal.this, ((String) (obj)), new WLAuthorizationManagerInternal._cls5._cls1());
                return;
            }
        }

            
            {
                this$0 = final_wlauthorizationmanagerinternal;
                scope = String.this;
                super();
            }
    }

}
