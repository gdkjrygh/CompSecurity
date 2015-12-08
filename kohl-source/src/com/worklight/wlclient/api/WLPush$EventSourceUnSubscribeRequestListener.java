// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.api;

import com.worklight.common.Logger;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.worklight.wlclient.api:
//            WLPush, WLResponse, WLFailResponse

class alias extends alias
{

    private String alias;
    final WLPush this$0;

    public void onSuccess(WLResponse wlresponse)
    {
        JSONObject jsonobject;
        boolean flag;
        WLPush.access$900(WLPush.this, alias);
        if (WLPush.access$1000(WLPush.this).contains(alias))
        {
            WLPush.access$1000(WLPush.this).remove(alias);
        }
        jsonobject = wlresponse.getResponseJSON();
        if (jsonobject != null)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        flag = true;
_L1:
        if (!flag)
        {
            try
            {
                super.alias(new WLFailResponse(wlresponse));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (WLResponse wlresponse)
            {
                WLPush.access$200().error((new StringBuilder()).append("Failed to unsubscribe from tag.").append(wlresponse.getMessage()).toString());
            }
            break MISSING_BLOCK_LABEL_116;
        }
        break MISSING_BLOCK_LABEL_81;
        flag = jsonobject.getBoolean("isSuccessful");
          goto _L1
        super.alias(wlresponse);
        return;
    }

    public (String s)
    {
        this$0 = WLPush.this;
        super(WLPush.this);
        alias = s;
    }
}
