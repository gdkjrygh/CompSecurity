// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal.extension.api.messaging;

import android.database.Cursor;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package org.xwalk.core.internal.extension.api.messaging:
//            MessagingSmsConstMaps

public class MessagingHelpers
{

    public MessagingHelpers()
    {
    }

    public static JSONObject SmsMessageCursor2Json(Cursor cursor)
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("messageID", cursor.getString(cursor.getColumnIndex("_id")));
        jsonobject.put("conversationID", cursor.getString(cursor.getColumnIndex("thread_id")));
        jsonobject.put("type", "sms");
        jsonobject.put("serviceID", "");
        jsonobject.put("from", cursor.getString(cursor.getColumnIndex("address")));
        jsonobject.put("timestamp", convertDateLong2String(cursor.getLong(cursor.getColumnIndex("date"))));
        jsonobject.put("read", cursor.getString(cursor.getColumnIndex("read")));
        jsonobject.put("to", "");
        jsonobject.put("body", cursor.getString(cursor.getColumnIndex("body")));
        jsonobject.put("state", MessagingSmsConstMaps.smsStateDictI2S.get(Integer.valueOf(cursor.getInt(cursor.getColumnIndex("type")))));
        jsonobject.put("deliveryStatus", MessagingSmsConstMaps.smsDiliveryStatusDictI2S.get(Integer.valueOf(cursor.getInt(cursor.getColumnIndex("status")))));
        jsonobject.put("deliveryTimestamp", "");
        jsonobject.put("messageClass", "");
        return jsonobject;
        cursor;
_L2:
        cursor.printStackTrace();
        return null;
        cursor;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static String buildSqlClause(boolean flag, String s, String s1)
    {
        String s2;
        if (flag)
        {
            s2 = " AND ";
        } else
        {
            s2 = "";
        }
        return (new StringBuilder()).append(s2).append(String.format(s, new Object[] {
            s1
        })).toString();
    }

    public static String buildSqlFilterOptionString(JSONObject jsonobject)
    {
        String s1 = "";
        String s;
        try
        {
            if (jsonobject.has("sortBy"))
            {
                s1 = (new StringBuilder()).append("").append(" ").append((String)MessagingSmsConstMaps.smsTableColumnDict.get(jsonobject.getString("sortBy"))).toString();
            }
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            jsonobject.printStackTrace();
            return "";
        }
        s = s1;
        if (jsonobject.has("sortOrder"))
        {
            s = (new StringBuilder()).append(s1).append(" ").append((String)MessagingSmsConstMaps.sortOrderDict.get(jsonobject.getString("sortOrder"))).toString();
        }
        s1 = s;
        if (jsonobject.has("limit"))
        {
            s1 = (new StringBuilder()).append(s).append(" LIMIT ").append(jsonobject.getString("limit")).toString();
        }
        return s1;
    }

    public static Object[] buildSqlFilterString(JSONObject jsonobject)
    {
        String s;
        ArrayList arraylist;
        boolean flag2;
        s = "";
        arraylist = new ArrayList();
        flag2 = false;
        if (!jsonobject.has("startDate"))
        {
            break MISSING_BLOCK_LABEL_69;
        }
        s = (new StringBuilder()).append("").append(buildSqlClause(false, "%s >= ?", "date")).toString();
        arraylist.add(convertJsDateString2Long(jsonobject.getString("startDate")));
        flag2 = true;
        String s1;
        boolean flag;
        s1 = s;
        flag = flag2;
        if (!jsonobject.has("endDate"))
        {
            break MISSING_BLOCK_LABEL_129;
        }
        s1 = (new StringBuilder()).append(s).append(buildSqlClause(flag2, "%s <= ?", "date")).toString();
        arraylist.add(convertJsDateString2Long(jsonobject.getString("endDate")));
        flag = true;
        s = s1;
        flag2 = flag;
        if (!jsonobject.has("from"))
        {
            break MISSING_BLOCK_LABEL_186;
        }
        s = (new StringBuilder()).append(s1).append(buildSqlClause(flag, "%s = ?", "address")).toString();
        arraylist.add(jsonobject.getString("from"));
        flag2 = true;
        String s3 = "sms";
        String s2;
        boolean flag1;
        try
        {
            if (jsonobject.has("type"))
            {
                s3 = jsonobject.getString("type");
            }
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            jsonobject.printStackTrace();
            return null;
        }
        s2 = s;
        flag1 = flag2;
        if (!jsonobject.has("state"))
        {
            break MISSING_BLOCK_LABEL_289;
        }
        s2 = s;
        flag1 = flag2;
        if (!s3.equals("sms"))
        {
            break MISSING_BLOCK_LABEL_289;
        }
        s2 = (new StringBuilder()).append(s).append(buildSqlClause(flag2, "%s = ?", "type")).toString();
        arraylist.add(String.valueOf((Integer)MessagingSmsConstMaps.smsStateDictS2I.get(jsonobject.getString("state"))));
        flag1 = true;
        s = s2;
        if (!jsonobject.has("read"))
        {
            break MISSING_BLOCK_LABEL_346;
        }
        s = (new StringBuilder()).append(s2).append(buildSqlClause(flag1, "%s = ?", "read")).toString();
        if (jsonobject.getBoolean("read"))
        {
            jsonobject = "1";
        } else
        {
            jsonobject = "0";
        }
        arraylist.add(jsonobject);
        return (new Object[] {
            s, arraylist.toArray(new String[arraylist.size()])
        });
    }

    public static String convertDateLong2String(long l)
    {
        if (l <= 0L)
        {
            return "";
        } else
        {
            return (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(new Date(l));
        }
    }

    public static String convertJsDateString2Long(String s)
    {
        long l;
        s = s.replace('T', ' ').replace('Z', ' ');
        l = 0L;
        long l1 = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).parse(s).getTime();
        l = l1;
_L2:
        return String.valueOf(l);
        s;
        s.printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
    }
}
