// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.webhook;

import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.api.model.Story;
import com.pinterest.common.async.BackgroundTask;
import com.pinterest.network.json.PinterestJsonObject;

// Referenced classes of package com.pinterest.activity.webhook:
//            WebhookActivity

class val.response extends BackgroundTask
{

    final ERS this$1;
    final PinterestJsonObject val$response;

    public void run()
    {
        Object obj;
        obj = val$response.c("data");
        if (obj == null)
        {
            cess._mth000(this._cls1.this);
            return;
        }
        obj = Story.make(((PinterestJsonObject) (obj)));
        int i;
        if (obj == null || ((Story) (obj)).getMainObjectType() == null)
        {
            i = -1;
        } else
        {
            i = ((Story) (obj)).getMainObjectType().intValue();
        }
        i;
        JVM INSTR tableswitch 0 2: default 68
    //                   0 87
    //                   1 116
    //                   2 131;
           goto _L1 _L2 _L3 _L4
_L1:
        cess._mth000(this._cls1.this);
        return;
_L2:
        obj = new Navigation(Location.STORY_PINS, ((com.pinterest.api.model.Model) (obj)));
_L6:
        WebhookActivity.access$100("news");
        WebhookActivity.access$200(_fld0, ((Navigation) (obj)));
        return;
_L3:
        obj = new Navigation(Location.STORY_BOARDS, ((com.pinterest.api.model.Model) (obj)));
        continue; /* Loop/switch isn't completed */
_L4:
        obj = new Navigation(Location.STORY_USERS, ((com.pinterest.api.model.Model) (obj)));
        if (true) goto _L6; else goto _L5
_L5:
    }

    ()
    {
        this$1 = final_;
        val$response = PinterestJsonObject.this;
        super();
    }
}
