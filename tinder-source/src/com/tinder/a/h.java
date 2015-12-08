// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.a;

import com.android.volley.AuthFailureError;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.tinder.f.ak;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.ae;
import com.tinder.managers.i;
import com.tinder.parse.e;
import com.tinder.utils.DateUtils;
import com.tinder.utils.v;
import de.greenrobot.event.c;
import java.io.IOException;
import java.text.DateFormat;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.tinder.a:
//            e

public final class h extends com.tinder.a.e
{

    private static final Pattern q = Pattern.compile("^.*matches\\[\\d\\]$");
    i n;
    ae o;
    c p;

    public h(String s, String s1, com.android.volley.i.b b1, com.android.volley.i.a a1)
    {
        super(s, s1, b1, a1);
        ManagerApp.h().a(this);
    }

    private static com.tinder.managers.i.d b(JsonReader jsonreader)
        throws Exception
    {
        com.tinder.managers.i.d d = new com.tinder.managers.i.d();
        jsonreader.beginObject();
_L7:
        if (!jsonreader.hasNext()) goto _L2; else goto _L1
_L1:
        Object obj = jsonreader.nextName();
        byte byte0 = -1;
        ((String) (obj)).hashCode();
        JVM INSTR lookupswitch 3: default 300
    //                   -1386164858: 97
    //                   492793077: 111
    //                   840862003: 83;
           goto _L3 _L4 _L5 _L6
_L14:
        jsonreader.skipValue();
          goto _L7
_L6:
        if (((String) (obj)).equals("matches"))
        {
            byte0 = 0;
        }
          goto _L3
_L4:
        if (((String) (obj)).equals("blocks"))
        {
            byte0 = 1;
        }
          goto _L3
_L5:
        if (((String) (obj)).equals("last_activity_date"))
        {
            byte0 = 2;
        }
          goto _L3
_L15:
        jsonreader.beginArray();
_L10:
        boolean flag = jsonreader.hasNext();
        if (!flag) goto _L9; else goto _L8
_L8:
        obj = e.a(jsonreader);
        d.a.add(obj);
          goto _L10
        Exception exception;
        exception;
        try
        {
            v.a("Failed to parse match", exception);
            exception = jsonreader.getPath();
        }
        // Misplaced declaration of an exception variable
        catch (JsonReader jsonreader)
        {
            System.gc();
            v.a("Failed to parse match response, out of memory.", jsonreader);
            return d;
        }
        // Misplaced declaration of an exception variable
        catch (JsonReader jsonreader)
        {
            v.a("Failed to parse match response.", jsonreader);
            return d;
        }
        // Misplaced declaration of an exception variable
        catch (JsonReader jsonreader)
        {
            v.a("Failed to parse match response, random error.", jsonreader);
            return d;
        }
_L13:
        if (exception == null) goto _L10; else goto _L11
_L11:
        if (q.matcher(exception).matches()) goto _L10; else goto _L12
_L12:
        jsonreader.skipValue();
        if (jsonreader.peek() == JsonToken.END_OBJECT)
        {
            jsonreader.endObject();
        }
        exception = jsonreader.getPath();
          goto _L13
_L9:
        jsonreader.endArray();
          goto _L7
_L16:
        jsonreader.beginArray();
        String s;
        for (; jsonreader.hasNext(); d.b.add(s))
        {
            s = jsonreader.nextString();
        }

        jsonreader.endArray();
          goto _L7
_L17:
        String s1 = jsonreader.nextString();
        com.tinder.managers.i.b(DateUtils.a().parse(s1));
          goto _L7
_L2:
        jsonreader.endObject();
        return d;
_L3:
        byte0;
        JVM INSTR tableswitch 0 2: default 328
    //                   0 125
    //                   1 230
    //                   2 276;
           goto _L14 _L15 _L16 _L17
    }

    public final Object a(JsonReader jsonreader)
        throws Exception
    {
        return b(jsonreader);
    }

    public final String g()
    {
        return "application/json";
    }

    public final byte[] h()
        throws AuthFailureError
    {
        JSONObject jsonobject = new JSONObject();
        java.util.Date date;
        boolean flag;
        boolean flag1;
        date = ae.o();
        flag = n.a();
        flag1 = com.tinder.managers.i.l();
        if (date != null && !flag1 && flag)
        {
            try
            {
                jsonobject.put("last_activity_date", DateUtils.b().format(date));
            }
            catch (JSONException jsonexception)
            {
                v.a("Failed to load last activity date", jsonexception);
            }
        }
        return jsonobject.toString().getBytes();
    }

    public final com.android.volley.Request.Priority i()
    {
        return com.android.volley.Request.Priority.c;
    }

}
