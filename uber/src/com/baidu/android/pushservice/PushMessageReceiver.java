// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.baidu.android.pushservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.baidu.android.pushservice.util.f;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class PushMessageReceiver extends BroadcastReceiver
{

    private static String ACTION_LAPP_MESSAGE = "com.baidu.android.pushservice.action.LAPP_MESSAGE";
    private static String ACTION_LAPP_RECEIVE = "com.baidu.android.pushservice.action.lapp.RECEIVE";
    public static final String TAG = com/baidu/android/pushservice/PushMessageReceiver.getSimpleName();

    public PushMessageReceiver()
    {
    }

    public abstract void onBind(Context context, int i, String s, String s1, String s2, String s3);

    public void onCheckBindState(Context context, int i, String s, boolean flag)
    {
    }

    public abstract void onDelTags(Context context, int i, List list, List list1, String s);

    public abstract void onListTags(Context context, int i, List list, String s);

    public abstract void onMessage(Context context, String s, String s1);

    public abstract void onNotificationArrived(Context context, String s, String s1, String s2);

    public abstract void onNotificationClicked(Context context, String s, String s1, String s2);

    public final void onReceive(Context context, Intent intent)
    {
        int i = 0;
        if (intent.getAction() != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!intent.getAction().equals("com.baidu.android.pushservice.action.MESSAGE") && !intent.getAction().equals("com.baidu.android.pushservice.action.LAPP_MESSAGE"))
        {
            break; /* Loop/switch isn't completed */
        }
        if (intent.getExtras() != null)
        {
            onMessage(context, intent.getExtras().getString("message_string"), intent.getStringExtra("extra_extra_custom_content"));
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        Object obj;
        Object obj1;
        int j;
        if (!intent.getAction().equals("com.baidu.android.pushservice.action.RECEIVE") && !intent.getAction().equals(ACTION_LAPP_RECEIVE))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj1 = intent.getStringExtra("method");
        if (obj1 == null || ((String) (obj1)).equals(""))
        {
            continue; /* Loop/switch isn't completed */
        }
        j = intent.getIntExtra("error_msg", 0);
        obj = "";
        if (intent.getByteArrayExtra("content") != null)
        {
            obj = new String(intent.getByteArrayExtra("content"));
        }
        if (((String) (obj1)).equals("com.baidu.android.pushservice.action.notification.ARRIVED"))
        {
            obj = intent.getStringExtra("notification_title");
            obj1 = intent.getStringExtra("notification_content");
            onNotificationArrived(context, ((String) (obj)), intent.getStringExtra("extra_extra_custom_content"), ((String) (obj1)));
            return;
        }
        if (!((String) (obj1)).equals("method_bind") && !((String) (obj1)).equals("method_deal_lapp_bind_intent"))
        {
            break; /* Loop/switch isn't completed */
        }
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            try
            {
                obj1 = context.getSharedPreferences("bindcache", 0).edit();
                Object obj2 = new JSONObject(((String) (obj)));
                obj = ((JSONObject) (obj2)).getString("request_id");
                Object obj3 = ((JSONObject) (obj2)).getJSONObject("response_params");
                obj2 = ((JSONObject) (obj3)).getString("appid");
                String s = ((JSONObject) (obj3)).getString("channel_id");
                obj3 = ((JSONObject) (obj3)).getString("user_id");
                long l = System.currentTimeMillis();
                if (intent.hasExtra("real_bind"))
                {
                    String s3 = intent.getStringExtra("access_token");
                    intent = intent.getStringExtra("secret_key");
                    ((android.content.SharedPreferences.Editor) (obj1)).putString("access_token", s3);
                    ((android.content.SharedPreferences.Editor) (obj1)).putString("secret_key", intent);
                }
                ((android.content.SharedPreferences.Editor) (obj1)).putString("appid", ((String) (obj2)));
                ((android.content.SharedPreferences.Editor) (obj1)).putString("channel_id", s);
                ((android.content.SharedPreferences.Editor) (obj1)).putString("request_id", ((String) (obj)));
                ((android.content.SharedPreferences.Editor) (obj1)).putString("user_id", ((String) (obj3)));
                ((android.content.SharedPreferences.Editor) (obj1)).putBoolean("bind_status", true);
                ((android.content.SharedPreferences.Editor) (obj1)).putLong("currbindtime", Long.valueOf(l).longValue());
                ((android.content.SharedPreferences.Editor) (obj1)).putLong("version_code", f.e(context, context.getPackageName()));
                ((android.content.SharedPreferences.Editor) (obj1)).commit();
                onBind(context, j, ((String) (obj2)), ((String) (obj3)), s, ((String) (obj)));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                onBind(context, j, null, null, null, null);
            }
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
        if (((String) (obj1)).equals("method_unbind") || ((String) (obj1)).equals("method_lapp_unbind"))
        {
            intent = context.getSharedPreferences("bindcache", 0).edit();
            try
            {
                onUnbind(context, j, (new JSONObject(((String) (obj)))).getString("request_id"));
                intent.putBoolean("bind_status", false);
                intent.commit();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                onUnbind(context, j, null);
            }
            intent.putBoolean("bind_status", false);
            intent.commit();
            return;
        }
        if (((String) (obj1)).equals("method_get_lapp_bind_state"))
        {
            onCheckBindState(context, j, intent.getStringExtra("secret_key"), intent.getBooleanExtra("lapp_bind_state", false));
            return;
        }
        if (!((String) (obj1)).equals("method_set_tags") && !((String) (obj1)).equals("method_set_lapp_tags")) goto _L6; else goto _L5
_L5:
        try
        {
            obj = new JSONObject(((String) (obj)));
            intent = ((JSONObject) (obj)).getString("request_id");
            if (!TextUtils.isEmpty(((JSONObject) (obj)).optString("error_msg")))
            {
                onSetTags(context, j, new ArrayList(), new ArrayList(), intent);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            onSetTags(context, j, null, null, null);
            return;
        }
        ArrayList arraylist;
        obj = ((JSONObject) (obj)).optJSONObject("response_params").getJSONArray("details");
        obj1 = new ArrayList();
        arraylist = new ArrayList();
_L14:
        if (i >= ((JSONArray) (obj)).length()) goto _L8; else goto _L7
_L7:
        JSONObject jsonobject;
        String s1;
        jsonobject = ((JSONArray) (obj)).getJSONObject(i);
        s1 = jsonobject.getString("tag");
        if (jsonobject.getInt("result") != 0) goto _L10; else goto _L9
_L9:
        ((List) (obj1)).add(s1);
          goto _L11
_L10:
        arraylist.add(s1);
          goto _L11
_L8:
        onSetTags(context, j, ((List) (obj1)), arraylist, intent);
        return;
_L6:
        if (!((String) (obj1)).equals("method_del_tags") && !((String) (obj1)).equals("method_del_lapp_tags"))
        {
            continue; /* Loop/switch isn't completed */
        }
        JSONObject jsonobject1;
        String s2;
        try
        {
            obj = new JSONObject(((String) (obj)));
            intent = ((JSONObject) (obj)).getString("request_id");
            obj = ((JSONObject) (obj)).getJSONObject("response_params").getJSONArray("details");
            obj1 = new ArrayList();
            arraylist = new ArrayList();
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            onDelTags(context, j, null, null, null);
            return;
        }
        i = 0;
_L15:
        if (i >= ((JSONArray) (obj)).length())
        {
            break MISSING_BLOCK_LABEL_930;
        }
        jsonobject1 = ((JSONArray) (obj)).getJSONObject(i);
        s2 = jsonobject1.getString("tag");
        if (jsonobject1.getInt("result") == 0)
        {
            ((List) (obj1)).add(s2);
            break MISSING_BLOCK_LABEL_1052;
        }
        arraylist.add(s2);
        break MISSING_BLOCK_LABEL_1052;
        onDelTags(context, j, ((List) (obj1)), arraylist, intent);
        return;
        if (!((String) (obj1)).equals("method_listtags") && !((String) (obj1)).equals("method_list_lapp_tags")) goto _L1; else goto _L12
_L12:
        try
        {
            obj = (new JSONObject(((String) (obj)))).getString("request_id");
            onListTags(context, j, intent.getStringArrayListExtra("tags_list"), ((String) (obj)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            onListTags(context, j, null, null);
        }
        return;
        if (!intent.getAction().equals("com.baidu.android.pushservice.action.notification.CLICK")) goto _L1; else goto _L13
_L13:
        onNotificationClicked(context, intent.getStringExtra("notification_title"), intent.getStringExtra("notification_content"), intent.getStringExtra("extra_extra_custom_content"));
        return;
_L11:
        i++;
          goto _L14
        i++;
          goto _L15
    }

    public abstract void onSetTags(Context context, int i, List list, List list1, String s);

    public abstract void onUnbind(Context context, int i, String s);

}
