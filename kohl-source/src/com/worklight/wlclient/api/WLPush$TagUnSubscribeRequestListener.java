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

class tagName extends tagName
{

    private String tagName;
    final WLPush this$0;

    public void onSuccess(WLResponse wlresponse)
    {
        JSONObject jsonobject;
        boolean flag;
        if (WLPush.access$1200(WLPush.this).contains(tagName))
        {
            WLPush.access$1200(WLPush.this).remove(tagName);
        }
        jsonobject = wlresponse.getResponseJSON();
        if (jsonobject != null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        flag = true;
_L1:
        if (!flag)
        {
            try
            {
                super.ailure(new WLFailResponse(wlresponse));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (WLResponse wlresponse)
            {
                WLPush.access$200().error((new StringBuilder()).append("Failed to unsubscribe from tag.").append(wlresponse.getMessage()).toString());
            }
            break MISSING_BLOCK_LABEL_105;
        }
        break MISSING_BLOCK_LABEL_70;
        flag = jsonobject.getBoolean("isSuccessful");
          goto _L1
        super.uccess(wlresponse);
        return;
    }

    public (String s)
    {
        this$0 = WLPush.this;
        super(WLPush.this);
        tagName = s;
    }
}
