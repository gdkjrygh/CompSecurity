// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere;

import com.aetn.history.android.historyhere.model.Configuration;
import com.aetn.history.android.historyhere.utils.Utils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

// Referenced classes of package com.aetn.history.android.historyhere:
//            HistoryHereApplication

class this._cls0
    implements com.android.volley.HereApplication._cls2
{

    final HistoryHereApplication this$0;

    public void onResponse(Object obj)
    {
        Utils.logger(HistoryHereApplication.access$100(), (new StringBuilder()).append("loadConfig(): we have the response:").append(obj.toString()).toString());
        Gson gson = new Gson();
        try
        {
            Configuration _tmp = HistoryHereApplication.access$302((Configuration)gson.fromJson(obj.toString(), com/aetn/history/android/historyhere/model/Configuration));
            Utils.logger(HistoryHereApplication.access$100(), (new StringBuilder()).append("loadConfig():the class is parsed:version: ").append(HistoryHereApplication.access$300().version).toString());
            HistoryHereApplication.access$400(HistoryHereApplication.this).onConfigLoaded();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((JsonSyntaxException) (obj)).printStackTrace();
        }
        Utils.logger(HistoryHereApplication.access$100(), "loadConfig():Parse error ");
    }

    ConfigLoadedListener()
    {
        this$0 = HistoryHereApplication.this;
        super();
    }
}
