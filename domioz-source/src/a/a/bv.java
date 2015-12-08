// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import com.appboy.d.c;
import com.appboy.f;
import com.appboy.f.a;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package a.a:
//            bk, i, bw, dm, 
//            bx, ca

public final class bv
    implements bk, c
{

    private static final String a;
    private final Integer b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private String h;
    private final ca i;
    private final bx j;
    private final String k;

    public bv(Integer integer, String s, String s1, String s2, String s3, String s4, String s5, 
            ca ca1, bx bx1, String s6)
    {
        b = integer;
        c = s;
        d = s1;
        e = s2;
        f = s3;
        g = s4;
        h = s5;
        i = ca1;
        j = bx1;
        k = s6;
    }

    public static bv a(JSONObject jsonobject)
    {
        Object obj;
        Object obj1;
        String s;
        Object obj2;
        Object obj3;
        ca ca1;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        i ai[];
        int l;
        int i1;
        obj = null;
        obj1 = null;
        s = null;
        obj3 = null;
        obj2 = null;
        obj7 = null;
        obj6 = null;
        ca1 = null;
        obj5 = null;
        obj4 = null;
        ai = a.a.i.values();
        i1 = ai.length;
        l = 0;
_L19:
        Object obj8;
        if (l >= i1)
        {
            break MISSING_BLOCK_LABEL_783;
        }
        obj8 = ai[l];
        a.a.bw.a[((i) (obj8)).ordinal()];
        JVM INSTR tableswitch 1 11: default 124
    //                   1 198
    //                   2 198
    //                   3 223
    //                   4 291
    //                   5 335
    //                   6 414
    //                   7 565
    //                   8 619
    //                   9 659
    //                   10 699
    //                   11 739;
           goto _L1 _L2 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L11:
        break MISSING_BLOCK_LABEL_739;
_L1:
        com.appboy.f.a.d(a, String.format("Unknown key encountered in Device createFromJson %s", new Object[] {
            obj8
        }));
_L14:
        obj8 = obj2;
        Object obj14 = obj3;
        obj3 = obj;
        obj2 = obj1;
        obj1 = obj14;
        obj = obj8;
_L12:
        l++;
        obj8 = obj2;
        Object obj15 = obj3;
        obj2 = obj;
        obj3 = obj1;
        obj1 = obj8;
        obj = obj15;
        continue; /* Loop/switch isn't completed */
_L2:
        obj8 = obj1;
        Object obj16 = obj;
        obj = obj2;
        obj1 = obj3;
        obj2 = obj8;
        obj3 = obj16;
          goto _L12
_L3:
        Object obj17 = jsonobject.optJSONObject(i.g.l);
        if (obj17 == null) goto _L14; else goto _L13
_L13:
        obj8 = ((JSONObject) (obj17)).optString(a.a.i.f.l);
        obj17 = ((JSONObject) (obj17)).optString(i.e.l);
        obj2 = obj1;
        obj7 = obj;
        obj = obj17;
        obj1 = obj3;
        obj3 = obj7;
        obj7 = obj8;
          goto _L12
_L4:
        String s1 = dm.d(jsonobject.optString(i.h.l));
        obj6 = obj1;
        obj8 = obj;
        obj = obj2;
        obj1 = obj3;
        obj2 = obj6;
        obj3 = obj8;
        obj6 = s1;
          goto _L12
_L5:
        obj8 = jsonobject.optJSONObject(i.j.l);
        if (obj8 == null) goto _L14; else goto _L15
_L15:
        obj5 = dm.d(((JSONObject) (obj8)).optString("android_id"));
        bx bx1 = new bx(dm.d(((JSONObject) (obj8)).optString("serial")), ((String) (obj5)));
        obj5 = obj1;
        obj8 = obj;
        obj = obj2;
        obj1 = obj3;
        obj2 = obj5;
        obj3 = obj8;
        obj5 = bx1;
          goto _L12
_L6:
        obj8 = jsonobject.optJSONObject(i.i.l);
        if (obj8 == null) goto _L14; else goto _L16
_L16:
        int j1 = ((JSONObject) (obj8)).optInt("resolution_width", -1);
        int l1 = ((JSONObject) (obj8)).optInt("resolution_height", -1);
        float f1 = (float)((JSONObject) (obj8)).optDouble("x_dpi", -1D);
        float f2 = (float)((JSONObject) (obj8)).optDouble("y_dpi", -1D);
        int i2 = ((JSONObject) (obj8)).optInt("density_default", -1);
        Object obj18;
        if (j1 != -1 && l1 != -1 && f1 != -1F && f2 != -1F && i2 != -1)
        {
            ca1 = new ca(j1, l1, f1, f2, i2);
        } else
        {
            ca1 = null;
        }
        obj8 = obj1;
        obj18 = obj;
        obj = obj2;
        obj1 = obj3;
        obj2 = obj8;
        obj3 = obj18;
          goto _L12
_L7:
        if (!jsonobject.has(a.a.i.a.l)) goto _L14; else goto _L17
_L17:
        int k1 = jsonobject.optInt(a.a.i.a.l);
        Object obj9 = obj1;
        Integer integer = Integer.valueOf(k1);
        obj = obj2;
        obj1 = obj3;
        obj2 = obj9;
        obj3 = integer;
          goto _L12
_L8:
        Object obj10 = dm.d(jsonobject.optString(i.b.l));
        obj1 = obj3;
        obj3 = obj10;
        obj10 = obj;
        obj = obj2;
        obj2 = obj3;
        obj3 = obj10;
          goto _L12
_L9:
        s = dm.d(jsonobject.optString(a.a.i.c.l));
        Object obj11 = obj1;
        Object obj19 = obj;
        obj = obj2;
        obj1 = obj3;
        obj2 = obj11;
        obj3 = obj19;
          goto _L12
_L10:
        String s2 = dm.d(jsonobject.optString(i.d.l));
        obj3 = obj1;
        Object obj12 = obj;
        obj = obj2;
        obj1 = s2;
        obj2 = obj3;
        obj3 = obj12;
          goto _L12
        String s3 = dm.d(jsonobject.optString(i.k.l));
        obj4 = obj1;
        Object obj13 = obj;
        obj = obj2;
        obj1 = obj3;
        obj2 = obj4;
        obj3 = obj13;
        obj4 = s3;
          goto _L12
        return new bv(((Integer) (obj)), ((String) (obj1)), s, ((String) (obj3)), ((String) (obj2)), ((String) (obj7)), ((String) (obj6)), ca1, ((bx) (obj5)), ((String) (obj4)));
        if (true) goto _L19; else goto _L18
_L18:
    }

    public final Object a()
    {
        return b();
    }

    public final JSONObject b()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.putOpt(a.a.i.a.l, b);
            jsonobject.putOpt(i.b.l, c);
            jsonobject.putOpt(a.a.i.c.l, d);
            jsonobject.putOpt(i.d.l, e);
            jsonobject.putOpt(i.k.l, k);
            if (g != null && f != null)
            {
                JSONObject jsonobject1 = new JSONObject();
                jsonobject1.putOpt(i.e.l, f);
                jsonobject1.putOpt(a.a.i.f.l, g);
                jsonobject.put(i.g.l, jsonobject1);
            }
            if (!a.a.dm.c(h))
            {
                jsonobject.put(i.h.l, h);
            }
            if (i != null)
            {
                jsonobject.putOpt(i.i.l, i.b());
            }
            if (j != null)
            {
                jsonobject.putOpt(i.j.l, j.b());
            }
        }
        catch (JSONException jsonexception)
        {
            jsonexception.printStackTrace();
            return jsonobject;
        }
        return jsonobject;
    }

    public final boolean d()
    {
        return b().length() == 0;
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            f.a, a/a/bv.getName()
        });
    }
}
