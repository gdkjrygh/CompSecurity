// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.d;
import com.appboy.d.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//            cj, ad, cv, eq, 
//            cw, cy, dc

public final class cu
    implements cj, e
{

    private static final String a;
    private final Integer b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private String h;
    private final cy i;
    private final cw j;
    private final String k;
    private final List l;

    public cu(Integer integer, String s, String s1, String s2, String s3, String s4, String s5, 
            cy cy1, cw cw1, String s6, List list)
    {
        b = integer;
        c = s;
        d = s1;
        e = s2;
        f = s3;
        g = s4;
        h = s5;
        i = cy1;
        j = cw1;
        k = s6;
        l = list;
    }

    public static cu a(JSONObject jsonobject)
    {
        String s;
        ArrayList arraylist;
        cw cw1;
        cy cy1;
        String s1;
        String s2;
        String s3;
        String s4;
        String s5;
        String s6;
        Integer integer;
        ad aad[];
        int i1;
        int k1;
        integer = null;
        s6 = null;
        s5 = null;
        s3 = null;
        s4 = null;
        s2 = null;
        s1 = null;
        cy1 = null;
        cw1 = null;
        s = null;
        arraylist = null;
        aad = ad.values();
        k1 = aad.length;
        i1 = 0;
_L14:
        Integer integer1;
        String s7;
        String s8;
        String s9;
        String s10;
        String s11;
        String s12;
        cy cy2;
        cw cw2;
        String s13;
        ArrayList arraylist1;
        Object obj;
        if (i1 >= k1)
        {
            break MISSING_BLOCK_LABEL_1190;
        }
        obj = aad[i1];
        integer1 = integer;
        s7 = s6;
        s8 = s5;
        s9 = s3;
        s10 = s4;
        s11 = s2;
        s12 = s1;
        cy2 = cy1;
        cw2 = cw1;
        s13 = s;
        arraylist1 = arraylist;
        cv.a[((ad) (obj)).ordinal()];
        JVM INSTR tableswitch 1 12: default 168
    //                   1 224
    //                   2 224
    //                   3 274
    //                   4 394
    //                   5 449
    //                   6 555
    //                   7 660
    //                   8 769
    //                   9 824
    //                   10 879
    //                   11 934
    //                   12 990;
           goto _L1 _L2 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L3:
        break; /* Loop/switch isn't completed */
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        String.format("Unknown key encountered in Device createFromJson %s", new Object[] {
            obj
        });
        arraylist1 = arraylist;
        s13 = s;
        cw2 = cw1;
        cy2 = cy1;
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
        cy1 = cy2;
        cw1 = cw2;
        s = s13;
        arraylist = arraylist1;
        if (true) goto _L14; else goto _L13
_L13:
        obj = jsonobject.optJSONObject(ad.g.m);
        integer1 = integer;
        s7 = s6;
        s8 = s5;
        s9 = s3;
        s10 = s4;
        s11 = s2;
        s12 = s1;
        cy2 = cy1;
        cw2 = cw1;
        s13 = s;
        arraylist1 = arraylist;
        if (obj != null)
        {
            s11 = ((JSONObject) (obj)).optString(ad.f.m);
            s10 = ((JSONObject) (obj)).optString(bo.app.ad.e.m);
            integer1 = integer;
            s7 = s6;
            s8 = s5;
            s9 = s3;
            s12 = s1;
            cy2 = cy1;
            cw2 = cw1;
            s13 = s;
            arraylist1 = arraylist;
        }
          goto _L15
_L4:
        s12 = bo.app.eq.d(jsonobject.optString(ad.h.m));
        integer1 = integer;
        s7 = s6;
        s8 = s5;
        s9 = s3;
        s10 = s4;
        s11 = s2;
        cy2 = cy1;
        cw2 = cw1;
        s13 = s;
        arraylist1 = arraylist;
          goto _L15
_L5:
        obj = jsonobject.optJSONObject(ad.j.m);
        integer1 = integer;
        s7 = s6;
        s8 = s5;
        s9 = s3;
        s10 = s4;
        s11 = s2;
        s12 = s1;
        cy2 = cy1;
        cw2 = cw1;
        s13 = s;
        arraylist1 = arraylist;
        if (obj != null)
        {
            cw2 = cw.a(((JSONObject) (obj)));
            integer1 = integer;
            s7 = s6;
            s8 = s5;
            s9 = s3;
            s10 = s4;
            s11 = s2;
            s12 = s1;
            cy2 = cy1;
            s13 = s;
            arraylist1 = arraylist;
        }
          goto _L15
_L6:
        obj = jsonobject.optJSONObject(ad.i.m);
        integer1 = integer;
        s7 = s6;
        s8 = s5;
        s9 = s3;
        s10 = s4;
        s11 = s2;
        s12 = s1;
        cy2 = cy1;
        cw2 = cw1;
        s13 = s;
        arraylist1 = arraylist;
        if (obj != null)
        {
            cy2 = cy.a(((JSONObject) (obj)));
            integer1 = integer;
            s7 = s6;
            s8 = s5;
            s9 = s3;
            s10 = s4;
            s11 = s2;
            s12 = s1;
            cw2 = cw1;
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
        cy2 = cy1;
        cw2 = cw1;
        s13 = s;
        arraylist1 = arraylist;
        if (jsonobject.has(ad.a.m))
        {
            integer1 = Integer.valueOf(jsonobject.optInt(ad.a.m));
            s7 = s6;
            s8 = s5;
            s9 = s3;
            s10 = s4;
            s11 = s2;
            s12 = s1;
            cy2 = cy1;
            cw2 = cw1;
            s13 = s;
            arraylist1 = arraylist;
        }
          goto _L15
_L8:
        s7 = bo.app.eq.d(jsonobject.optString(ad.b.m));
        integer1 = integer;
        s8 = s5;
        s9 = s3;
        s10 = s4;
        s11 = s2;
        s12 = s1;
        cy2 = cy1;
        cw2 = cw1;
        s13 = s;
        arraylist1 = arraylist;
          goto _L15
_L9:
        s8 = bo.app.eq.d(jsonobject.optString(ad.c.m));
        integer1 = integer;
        s7 = s6;
        s9 = s3;
        s10 = s4;
        s11 = s2;
        s12 = s1;
        cy2 = cy1;
        cw2 = cw1;
        s13 = s;
        arraylist1 = arraylist;
          goto _L15
_L10:
        s9 = bo.app.eq.d(jsonobject.optString(bo.app.ad.d.m));
        integer1 = integer;
        s7 = s6;
        s8 = s5;
        s10 = s4;
        s11 = s2;
        s12 = s1;
        cy2 = cy1;
        cw2 = cw1;
        s13 = s;
        arraylist1 = arraylist;
          goto _L15
_L11:
        s13 = bo.app.eq.d(jsonobject.optString(ad.k.m));
        integer1 = integer;
        s7 = s6;
        s8 = s5;
        s9 = s3;
        s10 = s4;
        s11 = s2;
        s12 = s1;
        cy2 = cy1;
        cw2 = cw1;
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
        cy2 = cy1;
        cw2 = cw1;
        s13 = s;
        arraylist1 = arraylist;
        if (!jsonobject.has(ad.l.m)) goto _L15; else goto _L16
_L16:
        obj = jsonobject.optJSONArray(ad.l.m);
        integer1 = integer;
        s7 = s6;
        s8 = s5;
        s9 = s3;
        s10 = s4;
        s11 = s2;
        s12 = s1;
        cy2 = cy1;
        cw2 = cw1;
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
        cy2 = cy1;
        cw2 = cw1;
        s13 = s;
        arraylist1 = arraylist;
        if (j1 >= ((JSONArray) (obj)).length()) goto _L15; else goto _L18
_L18:
        arraylist.add(dc.a(((JSONArray) (obj)).getJSONObject(j1)));
        j1++;
          goto _L19
          goto _L15
        return new cu(integer, s6, s5, s3, s4, s2, s1, cy1, cw1, s, arraylist);
    }

    public final JSONObject a()
    {
        JSONObject jsonobject = new JSONObject();
        JSONArray jsonarray;
        jsonobject.putOpt(ad.a.m, b);
        jsonobject.putOpt(ad.b.m, c);
        jsonobject.putOpt(ad.c.m, d);
        jsonobject.putOpt(bo.app.ad.d.m, e);
        jsonobject.putOpt(ad.k.m, k);
        if (g != null && f != null)
        {
            JSONObject jsonobject1 = new JSONObject();
            jsonobject1.putOpt(bo.app.ad.e.m, f);
            jsonobject1.putOpt(ad.f.m, g);
            jsonobject.put(ad.g.m, jsonobject1);
        }
        if (!eq.c(h))
        {
            jsonobject.put(ad.h.m, h);
        }
        if (i != null)
        {
            jsonobject.putOpt(ad.i.m, i.a());
        }
        if (j != null)
        {
            jsonobject.putOpt(ad.j.m, j.a());
        }
        if (l == null || l.isEmpty())
        {
            break MISSING_BLOCK_LABEL_303;
        }
        jsonarray = new JSONArray();
        for (Iterator iterator = l.iterator(); iterator.hasNext(); jsonarray.put(((dc)iterator.next()).a())) { }
        jsonobject.put(ad.l.m, jsonarray);
        return jsonobject;
        JSONException jsonexception;
        jsonexception;
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
            d.a, bo/app/cu.getName()
        });
    }
}
