// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.text.TextUtils;
import com.microsoft.advertising.android.a.e;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.microsoft.advertising.android:
//            ai, bp, bm, l, 
//            av

final class bn
{
    private static final class a
    {

        public static int a = 0;
        public static int b = -1;
        private final int c;
        private final String d;

        public static a a(JSONObject jsonobject)
        {
            String s;
            int j;
            j = b;
            s = "Failed to parse error code";
            if (jsonobject == null) goto _L2; else goto _L1
_L1:
            int i = j;
            if (!jsonobject.has("err"))
            {
                return null;
            }
            i = j;
            jsonobject = jsonobject.getJSONObject("err");
            if (jsonobject == null) goto _L2; else goto _L3
_L3:
            i = j;
            j = jsonobject.getInt("c");
            i = j;
            jsonobject = jsonobject.getString("m");
            i = j;
_L4:
            return new a(i, jsonobject);
            jsonobject;
            av.c("PolymorphicAdBuilder", jsonobject.toString());
            jsonobject = s;
            if (true) goto _L4; else goto _L2
_L2:
            return null;
        }

        public final int a()
        {
            return c;
        }

        public final String toString()
        {
            return String.format(Locale.ENGLISH, "Code=%d message=%s", new Object[] {
                Integer.valueOf(c), d
            });
        }


        private a(int i, String s)
        {
            c = i;
            d = s;
        }
    }


    protected String a;
    protected final List b = new LinkedList();
    protected String c;
    private final ai d;

    bn(ai ai1)
    {
        a = null;
        c = null;
        d = ai1;
    }

    private void a(String s, e e1)
    {
        if (d != null)
        {
            d.c(s, e1);
        }
    }

    private void a(JSONArray jsonarray)
        throws JSONException
    {
        int i = 0;
        do
        {
            if (i >= jsonarray.length())
            {
                return;
            }
            String s = jsonarray.getJSONObject(i).getString("c");
            String s1 = jsonarray.getJSONObject(i).getString("u");
            String s2 = jsonarray.getJSONObject(i).optString("min_sw");
            int j = 0;
            if (s2.toLowerCase(Locale.ENGLISH).endsWith("dp"))
            {
                j = Integer.parseInt(s2.substring(0, s2.length() - 2));
            }
            if (!TextUtils.isEmpty(s1))
            {
                b.add(bp.a(s, s1, j));
            }
            i++;
        } while (true);
    }

    public final bm a(JSONObject jsonobject, l l)
        throws i.a
    {
        Object obj = null;
        a a1 = a.a(jsonobject);
        if (a1 == null) goto _L2; else goto _L1
_L1:
        if (a1.a() == a.a) goto _L2; else goto _L3
_L3:
        if (a1.a() == 2000)
        {
            throw new i.a();
        }
          goto _L4
_L6:
        return jsonobject;
_L4:
        a((new StringBuilder("Ad server error : ")).append(a1.toString()).toString(), e.e);
        return null;
_L2:
        JSONObject jsonobject1;
        JSONArray jsonarray = jsonobject.getJSONArray("rdr");
        jsonobject1 = jsonobject.getJSONObject("ad");
        jsonobject = jsonobject.getJSONObject("prm");
        a(jsonarray);
        if (b.size() > 0)
        {
            break MISSING_BLOCK_LABEL_152;
        }
        a("Parsing error : Missing or empty rdr element", e.f);
        return null;
        c = jsonobject1.toString();
        a = jsonobject.toString();
        if (!TextUtils.isEmpty(a) && !TextUtils.isEmpty(c))
        {
            break MISSING_BLOCK_LABEL_200;
        }
        a("Parsing error : Missing the ad or prm elements", e.f);
        return null;
        try
        {
            jsonobject = new bm(this, l);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            a((new StringBuilder("Error parsing Ad JSON : ")).append(jsonobject).toString(), e.f);
            jsonobject = obj;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}
