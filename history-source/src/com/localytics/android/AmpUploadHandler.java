// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.localytics.android:
//            UploadHandler, LocalyticsProvider, Constants, JsonHelper, 
//            AmpHelper, AmpConstants, AmpDownloader

class AmpUploadHandler extends UploadHandler
{

    private static final String PROJECTION_AMP_RULE_RECORD[] = {
        "_id", "version"
    };
    private static final String SELECTION_UPDATE_AMP_RULE = String.format("%s = ?", new Object[] {
        "_id"
    });
    private static final String UPLOAD_WAKE_LOCK = "UPLOAD_WAKE_LOCK";
    private android.os.PowerManager.WakeLock mWakeLock;

    public AmpUploadHandler(Context context, Handler handler, String s, String s1, Looper looper)
    {
        super(context, handler, s, s1, looper);
    }

    private void bindRuleToEvents(long l, List list)
    {
        mProvider.remove("amp_ruleevent", String.format("%s = ?", new Object[] {
            "rule_id_ref"
        }), new String[] {
            Long.toString(l)
        });
        ContentValues contentvalues;
        for (list = list.iterator(); list.hasNext(); mProvider.insert("amp_ruleevent", contentvalues))
        {
            String s = (String)list.next();
            contentvalues = new ContentValues();
            contentvalues.put("event_name", s);
            contentvalues.put("rule_id_ref", Long.valueOf(l));
        }

    }

    private void enterWakeLock()
    {
        if (mContext.getPackageManager().checkPermission("android.permission.WAKE_LOCK", mContext.getPackageName()) != 0) goto _L2; else goto _L1
_L1:
        mWakeLock = ((PowerManager)mContext.getSystemService("power")).newWakeLock(1, "UPLOAD_WAKE_LOCK");
        mWakeLock.acquire();
        if (mWakeLock.isHeld()) goto _L4; else goto _L3
_L3:
        if (Constants.IS_LOGGABLE)
        {
            Log.w("Localytics", "Localytics library failed to get wake lock");
        }
_L6:
        return;
_L4:
        if (Constants.IS_LOGGABLE)
        {
            Log.v("Localytics", "Wake lock acquired.");
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (Constants.IS_LOGGABLE)
        {
            Log.v("Localytics", "android.permission.WAKE_LOCK is missing from the Manifest file.");
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void exitWakeLock()
    {
        if (mContext.getPackageManager().checkPermission("android.permission.WAKE_LOCK", mContext.getPackageName()) != 0) goto _L2; else goto _L1
_L1:
        if (!mWakeLock.isHeld() && Constants.IS_LOGGABLE)
        {
            Log.w("Localytics", "Wake lock will be released but not held when should be.");
        }
        mWakeLock.release();
        if (!mWakeLock.isHeld()) goto _L4; else goto _L3
_L3:
        if (Constants.IS_LOGGABLE)
        {
            Log.w("Localytics", "Wake lock was not released when it should have been.");
        }
_L6:
        return;
_L4:
        if (Constants.IS_LOGGABLE)
        {
            Log.v("Localytics", "Wake lock released.");
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (Constants.IS_LOGGABLE)
        {
            Log.v("Localytics", "android.permission.WAKE_LOCK is missing from the Manifest file.");
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private ContentValues parseAmpMessage(Map map)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("campaign_id", Integer.valueOf(JsonHelper.getSafeIntegerFromMap(map, "campaign_id")));
        contentvalues.put("expiration", Integer.valueOf(JsonHelper.getSafeIntegerFromMap(map, "expiration")));
        contentvalues.put("display_seconds", Integer.valueOf(JsonHelper.getSafeIntegerFromMap(map, "display_seconds")));
        contentvalues.put("display_session", Integer.valueOf(JsonHelper.getSafeIntegerFromMap(map, "display_session")));
        contentvalues.put("version", Integer.valueOf(JsonHelper.getSafeIntegerFromMap(map, "version")));
        contentvalues.put("phone_location", JsonHelper.getSafeStringFromMap(map, "phone_location"));
        Map map1 = JsonHelper.getSafeMapFromMap(map, "phone_size");
        contentvalues.put("phone_size_width", Integer.valueOf(JsonHelper.getSafeIntegerFromMap(map1, "width")));
        contentvalues.put("phone_size_height", Integer.valueOf(JsonHelper.getSafeIntegerFromMap(map1, "height")));
        map1 = JsonHelper.getSafeMapFromMap(map, "tablet_size");
        contentvalues.put("tablet_location", JsonHelper.getSafeStringFromMap(map, "tablet_location"));
        contentvalues.put("tablet_size_width", Integer.valueOf(JsonHelper.getSafeIntegerFromMap(map1, "width")));
        contentvalues.put("tablet_size_height", Integer.valueOf(JsonHelper.getSafeIntegerFromMap(map1, "height")));
        contentvalues.put("time_to_display", Integer.valueOf(1));
        contentvalues.put("internet_required", Integer.valueOf(JsonHelper.getSafeIntegerFromMap(map, "internet_required")));
        contentvalues.put("ab_test", JsonHelper.getSafeStringFromMap(map, "ab_test"));
        contentvalues.put("rule_name", JsonHelper.getSafeStringFromMap(map, "rule_name"));
        contentvalues.put("location", JsonHelper.getSafeStringFromMap(map, "location"));
        contentvalues.put("devices", JsonHelper.getSafeStringFromMap(map, "devices"));
        return contentvalues;
    }

    private void removeDeactivatedAMPMessages(List list)
    {
        ArrayList arraylist;
        Vector vector;
        arraylist = new ArrayList();
        for (list = list.iterator(); list.hasNext(); arraylist.add(Integer.valueOf(JsonHelper.getSafeIntegerFromMap((Map)list.next(), "campaign_id")))) { }
        vector = new Vector();
        list = null;
        Object obj = mProvider.query("amp_rules", null, null, null, null);
        int i = 0;
_L2:
        list = ((List) (obj));
        if (i >= ((Cursor) (obj)).getCount())
        {
            break MISSING_BLOCK_LABEL_669;
        }
        list = ((List) (obj));
        ((Cursor) (obj)).moveToPosition(i);
        list = ((List) (obj));
        if (arraylist.contains(Integer.valueOf(((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndexOrThrow("campaign_id")))))
        {
            break MISSING_BLOCK_LABEL_717;
        }
        list = ((List) (obj));
        HashMap hashmap = new HashMap();
        list = ((List) (obj));
        hashmap.put("_id", Integer.valueOf(((Cursor) (obj)).getColumnIndexOrThrow("_id")));
        list = ((List) (obj));
        hashmap.put("campaign_id", Integer.valueOf(((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndexOrThrow("campaign_id"))));
        list = ((List) (obj));
        hashmap.put("expiration", Integer.valueOf(((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndexOrThrow("expiration"))));
        list = ((List) (obj));
        hashmap.put("display_seconds", Integer.valueOf(((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndexOrThrow("display_seconds"))));
        list = ((List) (obj));
        hashmap.put("display_session", Integer.valueOf(((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndexOrThrow("display_session"))));
        list = ((List) (obj));
        hashmap.put("version", ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndexOrThrow("version")));
        list = ((List) (obj));
        hashmap.put("phone_location", ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndexOrThrow("phone_location")));
        list = ((List) (obj));
        hashmap.put("phone_size_width", Integer.valueOf(((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndexOrThrow("phone_size_width"))));
        list = ((List) (obj));
        hashmap.put("phone_size_height", Integer.valueOf(((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndexOrThrow("phone_size_height"))));
        list = ((List) (obj));
        hashmap.put("tablet_location", ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndexOrThrow("tablet_location")));
        list = ((List) (obj));
        hashmap.put("tablet_size_width", Integer.valueOf(((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndexOrThrow("tablet_size_width"))));
        list = ((List) (obj));
        hashmap.put("tablet_size_height", Integer.valueOf(((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndexOrThrow("tablet_size_height"))));
        list = ((List) (obj));
        hashmap.put("time_to_display", Integer.valueOf(((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndexOrThrow("time_to_display"))));
        list = ((List) (obj));
        hashmap.put("internet_required", Integer.valueOf(((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndexOrThrow("internet_required"))));
        list = ((List) (obj));
        hashmap.put("ab_test", ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndexOrThrow("ab_test")));
        list = ((List) (obj));
        hashmap.put("rule_name", ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndexOrThrow("rule_name")));
        list = ((List) (obj));
        hashmap.put("location", ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndexOrThrow("location")));
        list = ((List) (obj));
        hashmap.put("devices", ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndexOrThrow("devices")));
        list = ((List) (obj));
        vector.add(hashmap);
        break MISSING_BLOCK_LABEL_717;
        obj;
        if (list != null)
        {
            list.close();
        }
        throw obj;
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        Map map;
        for (list = vector.iterator(); list.hasNext(); AmpHelper.destroyLocalAmp(mProvider, map, false))
        {
            map = (Map)list.next();
        }

        return;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private int saveAMPMessage(final Map ampMessage)
    {
        if (validateAMPMessage(ampMessage)) goto _L2; else goto _L1
_L1:
        int i = 0;
_L6:
        return i;
_L2:
        Cursor cursor;
        Cursor cursor1;
        Cursor cursor2;
        Object obj;
        boolean flag;
        final int campaignId;
        campaignId = JsonHelper.getSafeIntegerFromMap(ampMessage, "campaign_id");
        flag = false;
        i = 0;
        obj = null;
        cursor2 = null;
        cursor1 = cursor2;
        cursor = obj;
        LocalyticsProvider localyticsprovider = mProvider;
        cursor1 = cursor2;
        cursor = obj;
        String s1 = String.format("%s = ?", new Object[] {
            "campaign_id"
        });
        cursor1 = cursor2;
        cursor = obj;
        String s2 = Integer.toString(campaignId);
        cursor1 = cursor2;
        cursor = obj;
        cursor2 = localyticsprovider.query("amp_displayed", new String[] {
            "displayed"
        }, s1, new String[] {
            s2
        }, null);
        cursor1 = cursor2;
        cursor = cursor2;
        if (!cursor2.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_160;
        }
        cursor1 = cursor2;
        cursor = cursor2;
        i = cursor2.getInt(cursor2.getColumnIndex("displayed"));
        int j;
        j = i;
        if (cursor2 != null)
        {
            cursor2.close();
            j = i;
        }
_L4:
        if (j != 0 && !AmpConstants.isTestModeEnabled())
        {
            return 0;
        }
        break; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        cursor = cursor1;
        exception.printStackTrace();
        j = ((flag) ? 1 : 0);
        if (cursor1 != null)
        {
            cursor1.close();
            j = ((flag) ? 1 : 0);
        }
        if (true) goto _L4; else goto _L3
        ampMessage;
        if (cursor != null)
        {
            cursor.close();
        }
        throw ampMessage;
_L3:
        int k = ((Integer)mProvider.runBatchTransaction(new Callable() {

            final AmpUploadHandler this$0;
            final Map val$ampMessage;
            final int val$campaignId;

            public Object call()
                throws Exception
            {
                Object obj1;
                int l;
                int i1;
                i1 = 0;
                l = 0;
                obj1 = null;
                Cursor cursor3 = mProvider.query("amp_rules", AmpUploadHandler.PROJECTION_AMP_RULE_RECORD, String.format("%s = ?", new Object[] {
                    "campaign_id"
                }), new String[] {
                    Integer.toString(campaignId)
                }, null);
                obj1 = cursor3;
                if (!cursor3.moveToFirst())
                {
                    break MISSING_BLOCK_LABEL_98;
                }
                obj1 = cursor3;
                i1 = cursor3.getInt(cursor3.getColumnIndexOrThrow("_id"));
                obj1 = cursor3;
                l = cursor3.getInt(cursor3.getColumnIndexOrThrow("version"));
                if (cursor3 != null)
                {
                    cursor3.close();
                }
                Exception exception1;
                if (i1 > 0)
                {
                    if (Constants.IS_LOGGABLE)
                    {
                        Log.w("Localytics", String.format("Existing AMP rule already exists for this campaign\n\t campaignID = %d\n\t ruleID = %d", new Object[] {
                            Integer.valueOf(campaignId), Integer.valueOf(i1)
                        }));
                    }
                    if (l >= JsonHelper.getSafeIntegerFromMap(ampMessage, "version"))
                    {
                        if (Constants.IS_LOGGABLE)
                        {
                            Log.w("Localytics", String.format("No update needed. Campaign version has not been updated\n\t version: %d", new Object[] {
                                Integer.valueOf(l)
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
                obj1 = parseAmpMessage(ampMessage);
                l = (int)mProvider.insert("amp_rules", ((ContentValues) (obj1)));
                  goto _L1
                exception1;
                if (obj1 != null)
                {
                    ((Cursor) (obj1)).close();
                }
                throw exception1;
                obj1 = parseAmpMessage(ampMessage);
                l = mProvider.update("amp_rules", ((ContentValues) (obj1)), AmpUploadHandler.SELECTION_UPDATE_AMP_RULE, new String[] {
                    Integer.toString(i1)
                });
_L3:
                if (l > 0)
                {
                    saveAmpConditions(l, JsonHelper.getSafeListFromMap(ampMessage, "conditions"));
                    obj1 = JsonHelper.toList((JSONArray)JsonHelper.toJSON(ampMessage.get("display_events")));
                    bindRuleToEvents(l, ((List) (obj1)));
                }
                return Integer.valueOf(l);
_L1:
                if (true) goto _L3; else goto _L2
_L2:
            }

            
            {
                this$0 = AmpUploadHandler.this;
                campaignId = i;
                ampMessage = map;
                super();
            }
        })).intValue();
        i = k;
        if (k > 0)
        {
            i = k;
            if (!AmpConstants.isTestModeEnabled())
            {
                ampMessage = AmpDownloader.getRemoteFileURL(ampMessage);
                String s = AmpDownloader.getLocalFileURL(mContext, mApiKey, k, ampMessage.endsWith(".zip"));
                i = k;
                if (!TextUtils.isEmpty(ampMessage))
                {
                    i = k;
                    if (!TextUtils.isEmpty(s))
                    {
                        AmpDownloader.downloadFile(ampMessage, s, true);
                        return k;
                    }
                }
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void saveAmpConditions(long l, List list)
    {
        if (list != null)
        {
            long al[] = AmpHelper.getConditionIdFromRuleId(mProvider, l);
            int k = al.length;
            for (int i = 0; i < k; i++)
            {
                long l1 = al[i];
                mProvider.remove("amp_condition_values", String.format("%s = ?", new Object[] {
                    "condition_id_ref"
                }), new String[] {
                    Long.toString(l1)
                });
            }

            mProvider.remove("amp_conditions", String.format("%s = ?", new Object[] {
                "rule_id_ref"
            }), new String[] {
                Long.toString(l)
            });
            list = list.iterator();
            while (list.hasNext()) 
            {
                List list1 = (List)list.next();
                ContentValues contentvalues = new ContentValues();
                contentvalues.put("attribute_name", (String)list1.get(0));
                contentvalues.put("operator", (String)list1.get(1));
                contentvalues.put("rule_id_ref", Long.valueOf(l));
                long l2 = mProvider.insert("amp_conditions", contentvalues);
                int j = 2;
                while (j < list1.size()) 
                {
                    ContentValues contentvalues1 = new ContentValues();
                    contentvalues1.put("value", JsonHelper.getSafeStringFromValue(list1.get(j)));
                    contentvalues1.put("condition_id_ref", Long.valueOf(l2));
                    mProvider.insert("amp_condition_values", contentvalues1);
                    j++;
                }
            }
        }
    }

    private boolean validateAMPMessage(Map map)
    {
        int i = JsonHelper.getSafeIntegerFromMap(map, "campaign_id");
        String s = JsonHelper.getSafeStringFromMap(map, "rule_name");
        List list = JsonHelper.getSafeListFromMap(map, "display_events");
        int j = JsonHelper.getSafeIntegerFromMap(map, "expiration");
        map = JsonHelper.getSafeStringFromMap(map, "location");
        long l = System.currentTimeMillis() / 1000L;
        return i != 0 && !TextUtils.isEmpty(s) && list != null && !TextUtils.isEmpty(map) && (long)j > l;
    }

    public void handleMessage(Message message)
    {
        enterWakeLock();
        super.handleMessage(message);
        exitWakeLock();
        return;
        message;
        exitWakeLock();
        throw message;
    }

    protected void onUploadResponded(String s)
    {
        if (Constants.IS_LOGGABLE)
        {
            Log.w("Localytics", String.format("get session upload response: \n%s", new Object[] {
                s
            }));
        }
        try
        {
            s = JsonHelper.toList((JSONArray)JsonHelper.toJSON(JsonHelper.toMap(new JSONObject(s)).get("amp")));
            removeDeactivatedAMPMessages(s);
            for (s = s.iterator(); s.hasNext(); saveAMPMessage((Map)s.next())) { }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            if (Constants.IS_LOGGABLE)
            {
                Log.w("Localytics", "JSONException", s);
            }
        }
    }






}
