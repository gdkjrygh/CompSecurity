// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine.a;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

public class com.qihoo.security.engine.a.a
{
    public static class a extends b
    {

        public final String a[];
        public final String b[];
        public final String c;
        public final int d;
        public final int e;

        static a a(JSONObject jsonobject)
        {
            String s = jsonobject.optString("n");
            String s1 = jsonobject.optString("c");
            int i = jsonobject.optInt("st");
            int j = jsonobject.optInt("s");
            if (TextUtils.isEmpty(s1))
            {
                return null;
            } else
            {
                return new a(s, i, s1, j);
            }
        }

        a(String s, int i, String s1, int j)
        {
            ArrayList arraylist;
            ArrayList arraylist1;
            arraylist = new ArrayList(8);
            arraylist1 = new ArrayList(8);
            c = new String(s);
            d = i;
            e = j;
            i = s1.indexOf("#1a");
_L5:
            if (i != -1) goto _L2; else goto _L1
_L1:
            b = (String[])arraylist1.toArray(new String[arraylist1.size()]);
            a = (String[])arraylist.toArray(new String[arraylist.size()]);
            Arrays.sort(a);
            return;
_L2:
            i += 3;
            if (s1.charAt(i) != '#')
            {
                continue; /* Loop/switch isn't completed */
            }
            j = i + 1;
            i = s1.indexOf("#1a", j);
            if (i != -1)
            {
                arraylist1.add(s1.substring(j, i));
            } else
            {
                arraylist1.add(s1.substring(j));
            }
            continue; /* Loop/switch isn't completed */
            if (s1.charAt(i) != '1' || s1.charAt(i + 1) != '#') goto _L1; else goto _L3
_L3:
            j = i + 2;
            i = s1.indexOf("#1a", j);
            if (i != -1)
            {
                arraylist.add(s1.substring(j, i));
            } else
            {
                arraylist.add(s1.substring(j));
            }
            if (true) goto _L5; else goto _L4
_L4:
        }
    }

    static class b
    {

        b()
        {
        }
    }


    public a a[];

    public com.qihoo.security.engine.a.a()
    {
    }

    public static com.qihoo.security.engine.a.a a(JSONArray jsonarray)
    {
        int j = jsonarray.length();
        if (j != 0) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return ((com.qihoo.security.engine.a.a) (obj));
_L2:
        com.qihoo.security.engine.a.a a1;
        int i;
        a1 = new com.qihoo.security.engine.a.a();
        a1.a = new a[j];
        i = 0;
_L7:
        obj = a1;
        if (i >= j) goto _L4; else goto _L3
_L3:
        obj = jsonarray.optJSONObject(i);
        if (obj != null) goto _L6; else goto _L5
_L5:
        int k;
        i++;
          goto _L7
_L6:
        if ((k = ((JSONObject) (obj)).optInt("t", -1)) == -1) goto _L5; else goto _L8
_L8:
        switch (k)
        {
        case 1: // '\001'
            obj = a.a(((JSONObject) (obj)));
            if (obj != null)
            {
                a1.a[i] = ((a) (obj));
            }
            break;
        }
        if (true) goto _L5; else goto _L9
_L9:
    }
}
