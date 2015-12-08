// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.conversation;

import android.os.Handler;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.kit.log.PLog;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.pinterest.activity.conversation:
//            ConversationFragment

class this._cls0 extends BaseApiResponseHandler
{

    final ConversationFragment this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.onFailure(throwable, apiresponse);
        ConversationFragment.access$1900(ConversationFragment.this).set(false);
        ConversationFragment.access$1800(ConversationFragment.this).postDelayed(ConversationFragment.access$1700(ConversationFragment.this), 1000L);
    }

    public void onSuccess(ApiResponse apiresponse)
    {
        PinterestJsonObject pinterestjsonobject = (PinterestJsonObject)apiresponse.getData();
        if (pinterestjsonobject == null) goto _L2; else goto _L1
_L1:
        pinterestjsonobject = (PinterestJsonObject)pinterestjsonobject.b().get(ConversationFragment.access$600(ConversationFragment.this));
        if (pinterestjsonobject == null) goto _L2; else goto _L3
_L3:
        int i;
        boolean flag = pinterestjsonobject.a("fetch", Boolean.valueOf(false)).booleanValue();
        int j = Math.max(pinterestjsonobject.a("wait", 1) * 1000, 1000);
        PLog.log("ConversationFragment", "shouldFetch: %b wait %d", new Object[] {
            Boolean.valueOf(flag), Integer.valueOf(j)
        });
        i = j;
        if (flag)
        {
            ConversationFragment.access$1500(ConversationFragment.this);
            i = j;
        }
_L5:
        ConversationFragment.access$1602(ConversationFragment.this, apiresponse.getBookmark());
        ConversationFragment.access$1800(ConversationFragment.this).postDelayed(ConversationFragment.access$1700(ConversationFragment.this), i);
        ConversationFragment.access$1900(ConversationFragment.this).set(false);
        return;
_L2:
        i = 1000;
        if (true) goto _L5; else goto _L4
_L4:
    }

    A()
    {
        this$0 = ConversationFragment.this;
        super();
    }
}
