// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.Constants;
import com.appboy.models.IPutIntoJson;
import com.appboy.support.AppboyLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//            cp, ai, db, ev, 
//            dc, de, di

public final class da
    implements cp, IPutIntoJson
{

    private static final String a;
    private final Integer b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private String h;
    private final de i;
    private final dc j;
    private final String k;
    private final List l;

    public da(Integer integer, String s, String s1, String s2, String s3, String s4, String s5, 
            de de1, dc dc1, String s6, List list)
    {
        b = integer;
        c = s;
        d = s1;
        e = s2;
        f = s3;
        g = s4;
        h = s5;
        i = de1;
        j = dc1;
        k = s6;
        l = list;
    }

    public static da a(JSONObject jsonobject)
    {
        String s;
        ArrayList arraylist;
        dc dc1;
        de de1;
        String s1;
        String s2;
        String s3;
        String s4;
        String s5;
        String s6;
        Integer integer;
        ai aai[];
        int i1;
        int k1;
        integer = null;
        s6 = null;
        s5 = null;
        s3 = null;
        s4 = null;
        s2 = null;
        s1 = null;
        de1 = null;
        dc1 = null;
        s = null;
        arraylist = null;
        aai = ai.values();
        k1 = aai.length;
        i1 = 0;
_L14:
        Integer integer1;
        String s7;
        String s8;
        String s9;
        String s10;
        String s11;
        String s12;
        de de2;
        dc dc2;
        String s13;
        ArrayList arraylist1;
        Object obj;
        if (i1 >= k1)
        {
            break MISSING_BLOCK_LABEL_1196;
        }
        obj = aai[i1];
        integer1 = integer;
        s7 = s6;
        s8 = s5;
        s9 = s3;
        s10 = s4;
        s11 = s2;
        s12 = s1;
        de2 = de1;
        dc2 = dc1;
        s13 = s;
        arraylist1 = arraylist;
        db.a[((ai) (obj)).ordinal()];
        JVM INSTR tableswitch 1 12: default 168
    //                   1 230
    //                   2 230
    //                   3 280
    //                   4 400
    //                   5 455
    //                   6 561
    //                   7 666
    //                   8 775
    //                   9 830
    //                   10 885
    //                   11 940
    //                   12 996;
           goto _L1 _L2 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L3:
        break; /* Loop/switch isn't completed */
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        AppboyLogger.e(a, String.format("Unknown key encountered in Device createFromJson %s", new Object[] {
            obj
        }));
        arraylist1 = arraylist;
        s13 = s;
        dc2 = dc1;
        de2 = de1;
        s12 = s1;
        s11 = s2;
        s10 = s4;
        s9 = s3;
        s8 = s5;
        s7 = s6;
        integer1 = integer;
_L15:
        i1++;
        integer = integer1;
        s6 = s7;
        s5 = s8;
        s3 = s9;
        s4 = s10;
        s2 = s11;
        s1 = s12;
        de1 = de2;
        dc1 = dc2;
        s = s13;
        arraylist = arraylist1;
        if (true) goto _L14; else goto _L13
_L13:
        obj = jsonobject.optJSONObject(ai.g.m);
        integer1 = integer;
        s7 = s6;
        s8 = s5;
        s9 = s3;
        s10 = s4;
        s11 = s2;
        s12 = s1;
        de2 = de1;
        dc2 = dc1;
        s13 = s;
        arraylist1 = arraylist;
        if (obj != null)
        {
            s11 = ((JSONObject) (obj)).optString(ai.f.m);
            s10 = ((JSONObject) (obj)).optString(ai.e.m);
            integer1 = integer;
            s7 = s6;
            s8 = s5;
            s9 = s3;
            s12 = s1;
            de2 = de1;
            dc2 = dc1;
            s13 = s;
            arraylist1 = arraylist;
        }
          goto _L15
_L4:
        s12 = ev.d(jsonobject.optString(ai.h.m));
        integer1 = integer;
        s7 = s6;
        s8 = s5;
        s9 = s3;
        s10 = s4;
        s11 = s2;
        de2 = de1;
        dc2 = dc1;
        s13 = s;
        arraylist1 = arraylist;
          goto _L15
_L5:
        obj = jsonobject.optJSONObject(ai.j.m);
        integer1 = integer;
        s7 = s6;
        s8 = s5;
        s9 = s3;
        s10 = s4;
        s11 = s2;
        s12 = s1;
        de2 = de1;
        dc2 = dc1;
        s13 = s;
        arraylist1 = arraylist;
        if (obj != null)
        {
            dc2 = dc.a(((JSONObject) (obj)));
            integer1 = integer;
            s7 = s6;
            s8 = s5;
            s9 = s3;
            s10 = s4;
            s11 = s2;
            s12 = s1;
            de2 = de1;
            s13 = s;
            arraylist1 = arraylist;
        }
          goto _L15
_L6:
        obj = jsonobject.optJSONObject(ai.i.m);
        integer1 = integer;
        s7 = s6;
        s8 = s5;
        s9 = s3;
        s10 = s4;
        s11 = s2;
        s12 = s1;
        de2 = de1;
        dc2 = dc1;
        s13 = s;
        arraylist1 = arraylist;
        if (obj != null)
        {
            de2 = de.a(((JSONObject) (obj)));
            integer1 = integer;
            s7 = s6;
            s8 = s5;
            s9 = s3;
            s10 = s4;
            s11 = s2;
            s12 = s1;
            dc2 = dc1;
            s13 = s;
            arraylist1 = arraylist;
        }
          goto _L15
_L7:
        integer1 = integer;
        s7 = s6;
        s8 = s5;
        s9 = s3;
        s10 = s4;
        s11 = s2;
        s12 = s1;
        de2 = de1;
        dc2 = dc1;
        s13 = s;
        arraylist1 = arraylist;
        if (jsonobject.has(ai.a.m))
        {
            integer1 = Integer.valueOf(jsonobject.optInt(ai.a.m));
            s7 = s6;
            s8 = s5;
            s9 = s3;
            s10 = s4;
            s11 = s2;
            s12 = s1;
            de2 = de1;
            dc2 = dc1;
            s13 = s;
            arraylist1 = arraylist;
        }
          goto _L15
_L8:
        s7 = ev.d(jsonobject.optString(ai.b.m));
        integer1 = integer;
        s8 = s5;
        s9 = s3;
        s10 = s4;
        s11 = s2;
        s12 = s1;
        de2 = de1;
        dc2 = dc1;
        s13 = s;
        arraylist1 = arraylist;
          goto _L15
_L9:
        s8 = ev.d(jsonobject.optString(ai.c.m));
        integer1 = integer;
        s7 = s6;
        s9 = s3;
        s10 = s4;
        s11 = s2;
        s12 = s1;
        de2 = de1;
        dc2 = dc1;
        s13 = s;
        arraylist1 = arraylist;
          goto _L15
_L10:
        s9 = ev.d(jsonobject.optString(ai.d.m));
        integer1 = integer;
        s7 = s6;
        s8 = s5;
        s10 = s4;
        s11 = s2;
        s12 = s1;
        de2 = de1;
        dc2 = dc1;
        s13 = s;
        arraylist1 = arraylist;
          goto _L15
_L11:
        s13 = ev.d(jsonobject.optString(ai.k.m));
        integer1 = integer;
        s7 = s6;
        s8 = s5;
        s9 = s3;
        s10 = s4;
        s11 = s2;
        s12 = s1;
        de2 = de1;
        dc2 = dc1;
        arraylist1 = arraylist;
          goto _L15
_L12:
        arraylist = new ArrayList();
        integer1 = integer;
        s7 = s6;
        s8 = s5;
        s9 = s3;
        s10 = s4;
        s11 = s2;
        s12 = s1;
        de2 = de1;
        dc2 = dc1;
        s13 = s;
        arraylist1 = arraylist;
        if (!jsonobject.has(ai.l.m)) goto _L15; else goto _L16
_L16:
        obj = jsonobject.optJSONArray(ai.l.m);
        integer1 = integer;
        s7 = s6;
        s8 = s5;
        s9 = s3;
        s10 = s4;
        s11 = s2;
        s12 = s1;
        de2 = de1;
        dc2 = dc1;
        s13 = s;
        arraylist1 = arraylist;
        if (obj == null) goto _L15; else goto _L17
_L17:
        int j1 = 0;
_L19:
        integer1 = integer;
        s7 = s6;
        s8 = s5;
        s9 = s3;
        s10 = s4;
        s11 = s2;
        s12 = s1;
        de2 = de1;
        dc2 = dc1;
        s13 = s;
        arraylist1 = arraylist;
        if (j1 >= ((JSONArray) (obj)).length()) goto _L15; else goto _L18
_L18:
        arraylist.add(di.a(((JSONArray) (obj)).getJSONObject(j1)));
        j1++;
          goto _L19
          goto _L15
        return new da(integer, s6, s5, s3, s4, s2, s1, de1, dc1, s, arraylist);
    }

    public final JSONObject a()
    {
        JSONObject jsonobject;
        Object obj;
label0:
        {
            jsonobject = new JSONObject();
            try
            {
                jsonobject.putOpt(ai.a.m, b);
                jsonobject.putOpt(ai.b.m, c);
                jsonobject.putOpt(ai.c.m, d);
                jsonobject.putOpt(ai.d.m, e);
                jsonobject.putOpt(ai.k.m, k);
                if (g != null && f != null)
                {
                    JSONObject jsonobject1 = new JSONObject();
                    jsonobject1.putOpt(ai.e.m, f);
                    jsonobject1.putOpt(ai.f.m, g);
                    jsonobject.put(ai.g.m, jsonobject1);
                }
                if (!ev.c(h))
                {
                    jsonobject.put(ai.h.m, h);
                }
                if (i != null)
                {
                    jsonobject.putOpt(ai.i.m, i.a());
                }
                if (j != null)
                {
                    jsonobject.putOpt(ai.j.m, j.a());
                }
                if (l != null && !l.isEmpty())
                {
                    obj = new JSONArray();
                    for (Iterator iterator = l.iterator(); iterator.hasNext(); ((JSONArray) (obj)).put(((di)iterator.next()).a())) { }
                    break label0;
                }
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                AppboyLogger.e(a, "Caught exception creating device Json.", ((Throwable) (obj)));
            }
            return jsonobject;
        }
        jsonobject.put(ai.l.m, obj);
        return jsonobject;
    }

    public final boolean c()
    {
        return a().length() == 0;
    }

    public final Object forJsonPut()
    {
        return a();
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, bo/app/da.getName()
        });
    }
}
