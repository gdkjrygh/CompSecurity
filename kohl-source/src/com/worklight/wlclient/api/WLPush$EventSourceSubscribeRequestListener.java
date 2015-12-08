// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.api;

import com.worklight.common.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.worklight.wlclient.api:
//            WLPush, WLResponse

class alias extends alias
{

    private String alias;
    final WLPush this$0;

    private void deletePendingNotifications(String s)
    {
        Iterator iterator = WLPush.access$1100(WLPush.this).iterator();
_L7:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        Object obj = (JSONObject)iterator.next();
        if (!((JSONObject) (obj)).isNull("alias")) goto _L4; else goto _L3
_L3:
        obj = null;
_L5:
        if (obj != null)
        {
            try
            {
                if (((String) (obj)).equals(s))
                {
                    iterator.remove();
                }
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                WLPush.access$200().error((new StringBuilder()).append("Failed deleting pending push events.").append(((JSONException) (obj)).getMessage()).toString());
            }
        }
        continue; /* Loop/switch isn't completed */
_L4:
        obj = (String)((JSONObject) (obj)).get("alias");
        if (true) goto _L5; else goto _L2
_L2:
        return;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void onSuccess(WLResponse wlresponse)
    {
        WLPush.access$900(WLPush.this, alias);
        if (!WLPush.access$1000(WLPush.this).contains(alias))
        {
            WLPush.access$1000(WLPush.this).add(alias);
            deletePendingNotifications(alias);
        }
        super.alias(wlresponse);
    }

    public (String s)
    {
        this$0 = WLPush.this;
        super(WLPush.this);
        alias = s;
    }
}
