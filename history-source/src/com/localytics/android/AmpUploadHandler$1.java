// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;

import android.database.Cursor;
import android.util.Log;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONArray;

// Referenced classes of package com.localytics.android:
//            AmpUploadHandler, LocalyticsProvider, Constants, JsonHelper

class val.ampMessage
    implements Callable
{

    final AmpUploadHandler this$0;
    final Map val$ampMessage;
    final int val$campaignId;

    public Object call()
        throws Exception
    {
        Object obj;
        int i;
        int j;
        j = 0;
        i = 0;
        obj = null;
        Cursor cursor = mProvider.query("amp_rules", AmpUploadHandler.access$000(), String.format("%s = ?", new Object[] {
            "campaign_id"
        }), new String[] {
            Integer.toString(val$campaignId)
        }, null);
        obj = cursor;
        if (!cursor.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_98;
        }
        obj = cursor;
        j = cursor.getInt(cursor.getColumnIndexOrThrow("_id"));
        obj = cursor;
        i = cursor.getInt(cursor.getColumnIndexOrThrow("version"));
        if (cursor != null)
        {
            cursor.close();
        }
        Exception exception;
        if (j > 0)
        {
            if (Constants.IS_LOGGABLE)
            {
                Log.w("Localytics", String.format("Existing AMP rule already exists for this campaign\n\t campaignID = %d\n\t ruleID = %d", new Object[] {
                    Integer.valueOf(val$campaignId), Integer.valueOf(j)
                }));
            }
            if (i >= JsonHelper.getSafeIntegerFromMap(val$ampMessage, "version"))
            {
                if (Constants.IS_LOGGABLE)
                {
                    Log.w("Localytics", String.format("No update needed. Campaign version has not been updated\n\t version: %d", new Object[] {
                        Integer.valueOf(i)
                    }));
                }
                return Integer.valueOf(0);
            }
            break MISSING_BLOCK_LABEL_211;
        }
        if (Constants.IS_LOGGABLE)
        {
            Log.w("Localytics", "AMP campaign not found. Creating a new one.");
        }
        obj = AmpUploadHandler.access$100(AmpUploadHandler.this, val$ampMessage);
        i = (int)mProvider.insert("amp_rules", ((android.content.ContentValues) (obj)));
          goto _L1
        exception;
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw exception;
        obj = AmpUploadHandler.access$100(AmpUploadHandler.this, val$ampMessage);
        i = mProvider.update("amp_rules", ((android.content.ContentValues) (obj)), AmpUploadHandler.access$200(), new String[] {
            Integer.toString(j)
        });
_L3:
        if (i > 0)
        {
            AmpUploadHandler.access$300(AmpUploadHandler.this, i, JsonHelper.getSafeListFromMap(val$ampMessage, "conditions"));
            obj = JsonHelper.toList((JSONArray)JsonHelper.toJSON(val$ampMessage.get("display_events")));
            AmpUploadHandler.access$400(AmpUploadHandler.this, i, ((java.util.List) (obj)));
        }
        return Integer.valueOf(i);
_L1:
        if (true) goto _L3; else goto _L2
_L2:
    }

    ()
    {
        this$0 = final_ampuploadhandler;
        val$campaignId = i;
        val$ampMessage = Map.this;
        super();
    }
}
