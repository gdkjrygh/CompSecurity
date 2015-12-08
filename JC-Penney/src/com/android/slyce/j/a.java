// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.j;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.android.slyce.a.a.e;
import com.android.slyce.a.aj;
import com.android.slyce.a.am;
import com.android.slyce.a.c.bs;
import com.android.slyce.a.c.bu;
import com.android.slyce.e.b;
import com.android.slyce.h.c;
import com.android.slyce.j;
import com.android.slyce.k.h;
import com.android.slyce.k.i;
import com.android.slyce.report.mpmetrics.af;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.android.slyce.j:
//            b, c, d, e, 
//            j, k, f, h, 
//            i, p, l, n, 
//            m, o

public class a
    implements com.android.slyce.a.a.a, e, bu
{

    private JSONObject A;
    public com.android.slyce.h.a a;
    private final String b = com/android/slyce/j/a.getSimpleName();
    private Context c;
    private bs d;
    private b e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private String o;
    private String p;
    private String q;
    private p r;
    private n s;
    private af t;
    private long u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    public a(Context context, String s1, boolean flag, boolean flag1, com.android.slyce.f.c c1, JSONObject jsonobject)
    {
        u = 0L;
        v = false;
        y = false;
        z = false;
        c = context;
        t = af.a(context, "712a9f5c14895edaa8b27dc59ec2af9f");
        e = new b(c1);
        f = a(s1, com.android.slyce.k.i.c(context));
        x = flag;
        w = flag1;
        A = jsonobject;
        q = s1;
    }

    static bs a(a a1, bs bs1)
    {
        a1.d = bs1;
        return bs1;
    }

    static b a(a a1)
    {
        return a1.e;
    }

    private String a(String s1, String s2)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("wss://foundation.slyceapp.com/api/v1/stream?").append("clientID").append("=").append(s1).append("&").append("installID").append("=").append(s2);
        return stringbuilder.toString();
    }

    private void a(c c1)
    {
        com.android.slyce.a.c.a.a().a(f, null, new com.android.slyce.j.b(this, c1));
    }

    static void a(a a1, String s1)
    {
        a1.b(s1);
    }

    static void a(a a1, String s1, String s2, String s3)
    {
        a1.a(s1, s2, s3);
    }

    static void a(a a1, String s1, Map map)
    {
        a1.a(s1, map);
    }

    private void a(String s1, Bitmap bitmap, o o1)
    {
        (new Thread(new com.android.slyce.j.c(this, s1, bitmap, o1))).start();
    }

    private void a(String s1, c c1)
    {
        e.a(com.android.slyce.d.b.a);
        switch (d.a[c1.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            com.android.slyce.c.a.a(c).a(a.g(), new com.android.slyce.j.e(this, s1));
            return;

        case 2: // '\002'
            b(s1);
            break;
        }
    }

    private void a(String s1, String s2, String s3)
    {
        if (!s3.isEmpty())
        {
            s1 = new HashMap();
            s1.put("detectionType", "2D");
            s1.put("error", s3);
            a("Search.Error", ((Map) (s1)));
        } else
        {
            if (!s1.isEmpty())
            {
                s3 = com.android.slyce.k.i.a(s1);
                String s4 = com.android.slyce.k.i.a("p", s3);
                HashMap hashmap = new HashMap();
                hashmap.put("imageURL", s2);
                hashmap.put("detectionType", "2D");
                hashmap.put("irID", s1);
                hashmap.put("Promotion", s4);
                a("Image.Detected", ((Map) (hashmap)));
                e.a(s3);
                com.android.slyce.c.a.a(c).b(s1, new com.android.slyce.j.j(this), new k(this));
                return;
            }
            y = true;
            if (z)
            {
                s1 = new HashMap();
                s1.put("detectionType", "2D");
                a("Search.Not.Found", ((Map) (s1)));
                return;
            }
        }
    }

    private void a(String s1, Map map)
    {
        JSONObject jsonobject;
        try
        {
            jsonobject = new JSONObject();
            java.util.Map.Entry entry;
            for (map = map.entrySet().iterator(); map.hasNext(); jsonobject.put((String)entry.getKey(), entry.getValue()))
            {
                entry = (java.util.Map.Entry)map.next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return;
        }
        t.a(s1, jsonobject);
        return;
    }

    private void b(c c1)
    {
        switch (d.a[c1.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            (new Thread(new f(this))).start();
            return;

        case 2: // '\002'
            c1 = a.f();
            break;
        }
        com.android.slyce.c.a.a(c).a(c, c1, new com.android.slyce.j.h(this, c1));
    }

    static void b(a a1)
    {
        a1.d();
    }

    static void b(a a1, String s1)
    {
        a1.c(s1);
    }

    private void b(String s1)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("imageURL", a.f());
        a("Image.Sent", hashmap);
        com.android.slyce.c.a.a(c).a(s1, a, new com.android.slyce.j.i(this));
    }

    private void c(String s1)
    {
        Object obj;
        Object obj1;
        byte byte0;
        String s2;
        try
        {
            obj = new HashMap();
            s1 = new JSONObject(s1);
            obj1 = s1.optString("event");
            s1 = s1.optJSONObject("data");
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s1.printStackTrace();
            return;
        }
        byte0 = -1;
        ((String) (obj1)).hashCode();
        JVM INSTR lookupswitch 6: default 1387
    //                   -1001078227: 132
    //                   468608572: 100
    //                   505122345: 116
    //                   1097546742: 148
    //                   1117782587: 164
    //                   1285619240: 180;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L3:
        if (((String) (obj1)).equals("ticketCreated"))
        {
            byte0 = 0;
        }
          goto _L1
_L4:
        if (((String) (obj1)).equals("highlightSetup"))
        {
            byte0 = 1;
        }
          goto _L1
_L2:
        if (((String) (obj1)).equals("progress"))
        {
            byte0 = 2;
        }
          goto _L1
_L5:
        if (((String) (obj1)).equals("results"))
        {
            byte0 = 3;
        }
          goto _L1
_L6:
        if (((String) (obj1)).equals("workflowEnded"))
        {
            byte0 = 4;
        }
          goto _L1
_L7:
        if (((String) (obj1)).equals("ticketCreationFailed"))
        {
            byte0 = 5;
        }
          goto _L1
_L20:
        h = s1.optString("token");
        r.b(h);
        e.a(com.android.slyce.d.b.b);
        obj1 = new JSONObject();
        ((JSONObject) (obj1)).put("foundationToken", h);
        t.a(((JSONObject) (obj1)));
        obj1 = com.android.slyce.g.b.a("imageUploaded", "token", h, null);
        s2 = s1.optString("uploadURL");
        g = s1.optString("imageURL");
        ((Map) (obj)).clear();
        ((Map) (obj)).put("imageURL", g);
        a("Image.Sent", ((Map) (obj)));
        s1 = a.c();
        obj = a.d();
        com.android.slyce.j.d.b[s1.ordinal()];
        JVM INSTR tableswitch 1 4: default 1429
    //                   1 372
    //                   2 372
    //                   3 449
    //                   4 449;
           goto _L8 _L9 _L9 _L10 _L10
_L9:
        if (obj == c.a)
        {
            a(s2, a.g(), new l(this, ((String) (obj1))));
            return;
        }
        if (obj == c.b)
        {
            d.a(((String) (obj1)));
            d.a(new byte[10]);
            e.a(com.android.slyce.d.b.c);
            return;
        }
          goto _L11
_L10:
        e.a(com.android.slyce.d.b.c);
        return;
_L21:
        s1 = s1.optJSONArray("highlightCodes");
        if (s1 == null) goto _L11; else goto _L12
_L12:
        e.a(com.android.slyce.d.b.d);
        s.a(s1.length());
        com.android.slyce.k.h.a(b, s1.toString());
        return;
_L22:
        JSONObject jsonobject;
        obj1 = s1.optString("message");
        jsonobject = s1.optJSONObject("details");
        if (jsonobject == null) goto _L14; else goto _L13
_L13:
        i = jsonobject.optString("searchKeywords");
        j = jsonobject.optString("categoryLabel");
        k = jsonobject.optString("colorName");
        l = jsonobject.optString("genderName");
        m = jsonobject.optString("brandName");
        n = jsonobject.optString("patternName");
        o = jsonobject.optString("categoryID");
        p = jsonobject.optString("keywords");
_L14:
        long l1 = s1.optLong("progress");
        if (l1 == -1L) goto _L16; else goto _L15
_L15:
        ((Map) (obj)).clear();
        ((Map) (obj)).put("progressMessageContent", obj1);
        ((Map) (obj)).put("progressValue", String.valueOf(l1));
        a("Search.Progress", ((Map) (obj)));
        e.a(l1, ((String) (obj1)), h);
        if (d != null)
        {
            s1 = com.android.slyce.g.b.a("results", "token", h, null);
            d.a(s1);
            d.a(new byte[10]);
            return;
        }
          goto _L11
_L16:
        l1 = System.currentTimeMillis();
        long l2 = u;
        l1 = TimeUnit.MILLISECONDS.toSeconds(l1 - l2);
        z = true;
        if (y || !w)
        {
            ((Map) (obj)).clear();
            ((Map) (obj)).put("detectionType", "3D");
            ((Map) (obj)).put("totalDetectionTime", String.valueOf(l1));
            a("Search.Not.Found", ((Map) (obj)));
        }
        e();
        return;
_L23:
        obj1 = s1.optJSONObject("barcode");
        String s3 = s1.optString("errorReason");
        l1 = System.currentTimeMillis();
        long l3 = u;
        l1 = TimeUnit.MILLISECONDS.toSeconds(l1 - l3);
        if (!TextUtils.isEmpty(s3))
        {
            z = true;
            if (y || !w)
            {
                ((Map) (obj)).clear();
                ((Map) (obj)).put("detectionType", "3D");
                ((Map) (obj)).put("error", s3);
                a("Search.Not.Found", ((Map) (obj)));
            }
            e.b(s3);
            return;
        }
        if (obj1 == null) goto _L18; else goto _L17
_L17:
        s1 = ((JSONObject) (obj1)).optString("barcodeFormat");
        obj1 = ((JSONObject) (obj1)).optString("parsedResult");
        s1 = com.android.slyce.k.a.a(s1, com.android.slyce.k.b.c, ((String) (obj1)));
        e.a(s1);
        if (x)
        {
            com.android.slyce.c.a.a(c).a(s1.b(), q, new m(this));
        }
        ((Map) (obj)).clear();
        ((Map) (obj)).put("barcodeFormat", s1.a().a());
        ((Map) (obj)).put("data", s1.b());
        a("Barcode.Detected", ((Map) (obj)));
        return;
_L18:
        if (s1 == null) goto _L11; else goto _L19
_L19:
        obj = new JSONObject();
        ((JSONObject) (obj)).put("imageURL", g);
        ((JSONObject) (obj)).put("detectionType", "3D");
        if (!TextUtils.isEmpty(i))
        {
            ((JSONObject) (obj)).put("searchKeywords", i);
        }
        if (!TextUtils.isEmpty(j))
        {
            ((JSONObject) (obj)).put("category", j);
        }
        if (!TextUtils.isEmpty(k))
        {
            ((JSONObject) (obj)).put("color", k);
        }
        if (!TextUtils.isEmpty(l))
        {
            ((JSONObject) (obj)).put("gender", l);
        }
        if (!TextUtils.isEmpty(m))
        {
            ((JSONObject) (obj)).put("brand", m);
        }
        if (!TextUtils.isEmpty(n))
        {
            ((JSONObject) (obj)).put("pattern", n);
        }
        if (!TextUtils.isEmpty(o))
        {
            ((JSONObject) (obj)).put("categoryID", o);
        }
        if (!TextUtils.isEmpty(p))
        {
            ((JSONObject) (obj)).put("keywords", p);
        }
        ((JSONObject) (obj)).put("totalDetectionTime", l1);
        t.a("Image.Detected", ((JSONObject) (obj)));
        if (a.c() == com.android.slyce.h.b.a)
        {
            e.b(s1);
            return;
        }
        obj = s1.optJSONArray("products");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_1342;
        }
        if (((JSONArray) (obj)).length() > 0)
        {
            e.a(s1);
            return;
        }
        e();
        return;
_L24:
        if (d != null)
        {
            d.d();
        }
        e.a();
        return;
_L25:
        s1 = s1.optString("error");
        e.b(s1);
        return;
_L1:
        byte0;
        JVM INSTR tableswitch 0 5: default 1428
    //                   0 196
    //                   1 460
    //                   2 507
    //                   3 832
    //                   4 1347
    //                   5 1371;
           goto _L11 _L20 _L21 _L22 _L23 _L24 _L25
_L11:
        return;
_L8:
    }

    static boolean c(a a1)
    {
        return a1.v;
    }

    static bs d(a a1)
    {
        return a1.d;
    }

    private void d()
    {
        d.a(this);
        d.a(this);
        d.b(this);
        d.a(this);
    }

    static Context e(a a1)
    {
        return a1.c;
    }

    private void e()
    {
        switch (com.android.slyce.j.d.b[a.c().ordinal()])
        {
        case 2: // '\002'
        default:
            return;

        case 1: // '\001'
            e.b("3D No Products Found");
            return;

        case 4: // '\004'
            e.b("No Public Products Found");
            return;

        case 3: // '\003'
            e.b("No Public Keywords Found");
            return;
        }
    }

    static af f(a a1)
    {
        return a1.t;
    }

    public void a()
    {
        String s1 = com.android.slyce.g.b.a("createTicket", "imageURL", a.f(), A);
        d.a(s1);
        u = System.currentTimeMillis();
    }

    public void a(am am, aj aj)
    {
        com.android.slyce.k.h.a(b, "onDataAvailable");
    }

    public void a(com.android.slyce.h.a a1)
    {
        a = a1;
        c c1 = a1.d();
        switch (com.android.slyce.j.d.b[a1.c().ordinal()])
        {
        default:
            return;

        case 3: // '\003'
            a("/search/public_keywords?imageURL=", c1);
            return;

        case 4: // '\004'
            a("/search/public_products?imageURL=", c1);
            return;

        case 1: // '\001'
            a(c1);
            return;

        case 2: // '\002'
            b(c1);
            a(c1);
            return;
        }
    }

    public void a(n n1)
    {
        s = n1;
    }

    public void a(p p1)
    {
        r = p1;
    }

    public void a(Exception exception)
    {
        com.android.slyce.k.h.a(b, "onCompleted");
        if (exception != null)
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("Message: ").append(exception.getMessage()).append(" Cause: ").append(exception.getCause());
            exception = new HashMap();
            exception.put("detectionType", "3D");
            a("Search.Error", ((Map) (exception)));
            e.b(stringbuilder.toString());
        }
    }

    public void a(String s1)
    {
        com.android.slyce.k.h.a(b, "onStringAvailable");
        c(s1);
    }

    public void b()
    {
        String s1 = com.android.slyce.g.b.a("createTicket", "ticketType", "productSearch", A);
        d.a(s1);
        u = System.currentTimeMillis();
    }

    public void c()
    {
        if (d != null)
        {
            d.d();
            return;
        } else
        {
            v = true;
            return;
        }
    }
}
