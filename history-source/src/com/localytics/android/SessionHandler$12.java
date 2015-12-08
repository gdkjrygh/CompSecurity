// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;

import android.content.ContentValues;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.localytics.android:
//            SessionHandler, LocalyticsProvider

class val.action
    implements Runnable
{

    final SessionHandler this$0;
    final int val$action;
    final JSONObject val$attributeJSON;

    public void run()
    {
        String s = (String)mProvider.getUserIdAndType().get("id");
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("attribute", val$attributeJSON.toString());
        contentvalues.put("action", Integer.valueOf(val$action));
        contentvalues.put("customer_id", s);
        mProvider.insert("profile", contentvalues);
    }

    ()
    {
        this$0 = final_sessionhandler;
        val$attributeJSON = jsonobject;
        val$action = I.this;
        super();
    }
}
