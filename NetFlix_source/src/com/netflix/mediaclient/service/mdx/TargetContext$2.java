// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx;

import com.netflix.mediaclient.javabridge.ui.mdxcontroller.MdxController;
import com.netflix.mediaclient.javabridge.ui.mdxcontroller.SessionController;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.service.mdx:
//            TargetContext

class val.msgObj
    implements Runnable
{

    final TargetContext this$0;
    final String val$messageName;
    final JSONObject val$msgObj;

    public void run()
    {
        TargetContext.access$700(TargetContext.this).getSession().sendMessage(TargetContext.access$1100(TargetContext.this), val$messageName, val$msgObj);
    }

    SessionController()
    {
        this$0 = final_targetcontext;
        val$messageName = s;
        val$msgObj = JSONObject.this;
        super();
    }
}
