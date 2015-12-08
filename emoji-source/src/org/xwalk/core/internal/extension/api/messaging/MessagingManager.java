// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal.extension.api.messaging;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package org.xwalk.core.internal.extension.api.messaging:
//            Messaging, MessagingHelpers

public class MessagingManager
{

    private static final String TAG = "MessagingManager";
    private final Activity mMainActivity;
    private final Messaging mMessagingHandler;

    MessagingManager(Activity activity, Messaging messaging)
    {
        mMainActivity = activity;
        mMessagingHandler = messaging;
    }

    private Uri getUri(String s)
    {
        if (s.equals("mms"))
        {
            return Uri.parse("content://mms");
        } else
        {
            return Uri.parse("content://sms");
        }
    }

    private void operation(int i, JSONObject jsonobject)
    {
        boolean flag = false;
        JSONObject jsonobject1;
        Object obj1;
        obj1 = jsonobject.getString("asyncCallId");
        jsonobject1 = jsonobject.getJSONObject("data");
        if (!jsonobject1.has("messageID")) goto _L2; else goto _L1
_L1:
        String s = jsonobject1.getString("messageID");
_L7:
        Object obj;
        String s2;
        s2 = jsonobject.getString("cmd");
        if (jsonobject1.has("value"))
        {
            flag = jsonobject1.getBoolean("value");
        }
        obj = jsonobject1.getString("type");
        String as[];
        ContentResolver contentresolver;
        Uri uri;
        if (jsonobject1.has("messageID"))
        {
            jsonobject = String.format("%s = ?", new Object[] {
                "_id"
            });
        } else
        {
            jsonobject = String.format("%s = ?", new Object[] {
                "thread_id"
            });
        }
        as = new String[1];
        as[0] = s;
        contentresolver = mMainActivity.getContentResolver();
        uri = getUri(((String) (obj)));
        if (s2.equals("msg_deleteMessage") || s2.equals("msg_deleteConversation"))
        {
            contentresolver.delete(uri, jsonobject, as);
        } else
        if (s2.equals("msg_markMessageRead") || s2.equals("msg_markConversationRead"))
        {
            ContentValues contentvalues = new ContentValues();
            String s1;
            if (flag)
            {
                s1 = "1";
            } else
            {
                s1 = "0";
            }
            contentvalues.put("read", s1);
            contentresolver.update(uri, contentvalues, jsonobject, as);
        }
        jsonobject = new JSONObject();
        jsonobject.put("asyncCallId", obj1);
        obj = new JSONObject();
        jsonobject.put("data", obj);
        ((JSONObject) (obj)).put("error", false);
        obj1 = new JSONObject();
        ((JSONObject) (obj)).put("body", obj1);
        if (!jsonobject1.has("messageID"))
        {
            break MISSING_BLOCK_LABEL_384;
        }
        ((JSONObject) (obj1)).put("messageID", s);
_L3:
        jsonobject.put("cmd", (new StringBuilder()).append(s2).append("_ret").toString());
        mMessagingHandler.postMessage(i, jsonobject.toString());
        return;
_L2:
        try
        {
            s = jsonobject1.getString("conversationID");
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            jsonobject.printStackTrace();
            return;
        }
        continue; /* Loop/switch isn't completed */
        ((JSONObject) (obj1)).put("conversationID", s);
          goto _L3
        jsonobject;
_L5:
        jsonobject.printStackTrace();
        return;
        jsonobject;
        if (true) goto _L5; else goto _L4
_L4:
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void queryMessage(int i, JSONObject jsonobject)
    {
        Object obj;
        JSONObject jsonobject1;
        Object obj1;
        Object obj3;
        String s;
        obj = null;
        obj1 = null;
        jsonobject1 = null;
        try
        {
            obj3 = jsonobject.getString("asyncCallId");
            s = jsonobject.getString("cmd");
            jsonobject = jsonobject.getJSONObject("data");
            if (jsonobject.has("messageID"))
            {
                obj = jsonobject.getString("messageID");
            }
            if (jsonobject.has("filter"))
            {
                obj1 = jsonobject.getJSONObject("filter");
            }
            if (jsonobject.has("options"))
            {
                jsonobject1 = jsonobject.getJSONObject("options");
            }
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            jsonobject.printStackTrace();
            return;
        }
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        jsonobject = ((JSONObject) (obj1)).getString("type");
_L4:
        if (!jsonobject.equals("sms") && !jsonobject.equals("mms"))
        {
            Log.e("MessagingManager", (new StringBuilder()).append("Invalidate message type: ").append(jsonobject).toString());
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        jsonobject = jsonobject.getString("type");
        if (true) goto _L4; else goto _L3
_L3:
        ContentResolver contentresolver = mMainActivity.getContentResolver();
        Uri uri = getUri(jsonobject);
        Object obj2 = null;
        String as[];
        boolean flag;
        if (s.equals("msg_findMessages"))
        {
            Object aobj[] = MessagingHelpers.buildSqlFilterString(((JSONObject) (obj1)));
            obj = (String)aobj[0];
            obj2 = (String[])(String[])aobj[1];
            aobj = MessagingHelpers.buildSqlFilterOptionString(jsonobject1);
            as = ((String []) (obj2));
        } else
        {
            aobj = String.format("%s = ?", new Object[] {
                "_id"
            });
            as = new String[1];
            as[0] = obj;
            obj = ((Object) (aobj));
            aobj = ((Object []) (obj2));
        }
        obj = contentresolver.query(uri, null, ((String) (obj)), as, ((String) (aobj)));
        as = new JSONObject();
        aobj = new JSONArray();
        as.put("asyncCallId", obj3);
        as.put("cmd", (new StringBuilder()).append(s).append("_ret").toString());
        obj2 = new JSONObject();
        as.put("data", obj2);
        ((JSONObject) (obj2)).put("error", false);
        obj3 = new JSONObject();
        ((JSONObject) (obj2)).put("body", obj3);
        ((JSONObject) (obj3)).put("results", ((Object) (aobj)));
        flag = jsonobject.equals("mms");
        if (!flag) goto _L6; else goto _L5
_L5:
        ((Cursor) (obj)).close();
        mMessagingHandler.postMessage(i, as.toString());
        return;
        jsonobject;
_L10:
        jsonobject.printStackTrace();
        return;
_L6:
        if (((Cursor) (obj)).getCount() <= 0) goto _L5; else goto _L7
_L7:
        if (!((Cursor) (obj)).moveToNext()) goto _L5; else goto _L8
_L8:
        jsonobject = MessagingHelpers.SmsMessageCursor2Json(((Cursor) (obj)));
        if (jsonobject == null) goto _L7; else goto _L9
_L9:
        ((JSONArray) (aobj)).put(jsonobject);
          goto _L7
          goto _L5
        jsonobject;
        ((Cursor) (obj)).close();
        throw jsonobject;
        jsonobject;
          goto _L10
        jsonobject;
          goto _L10
    }

    public void onMsgDeleteConversation(int i, JSONObject jsonobject)
    {
        operation(i, jsonobject);
    }

    public void onMsgDeleteMessage(int i, JSONObject jsonobject)
    {
        operation(i, jsonobject);
    }

    public void onMsgFindMessages(int i, JSONObject jsonobject)
    {
        queryMessage(i, jsonobject);
    }

    public void onMsgGetMessage(int i, JSONObject jsonobject)
    {
        queryMessage(i, jsonobject);
    }

    public void onMsgMarkConversationRead(int i, JSONObject jsonobject)
    {
        operation(i, jsonobject);
    }

    public void onMsgMarkMessageRead(int i, JSONObject jsonobject)
    {
        operation(i, jsonobject);
    }
}
