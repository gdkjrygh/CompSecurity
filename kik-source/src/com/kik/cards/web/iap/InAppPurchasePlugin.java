// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.iap;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.kik.cards.web.bf;
import com.kik.cards.web.plugin.d;
import com.kik.cards.web.userdata.a;
import com.kik.cards.web.userdata.e;
import com.kik.d.f;
import com.kik.g.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kik.a.d.i;
import kik.a.e.m;
import kik.a.h.j;
import kik.android.a.b;
import kik.android.chat.KikApplication;
import kik.android.util.DeviceUtils;
import org.c.c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.kik.cards.web.iap:
//            g, l, j, h, 
//            k

public class InAppPurchasePlugin extends d
{

    public static final String a[] = {
        "com.kik.cards.wtf.10000coins", "com.kik.cards.wtf.4500coins", "com.kik.cards.wtf.2000coins", "com.kik.cards.wtf.750coins", "com.kik.cards.wtf.350coins", "com.kik.cards.wtf.adremove", "com.kik.cards.runbun.large", "com.kik.cards.runbun.medium", "com.kik.cards.runbun.small", "com.kik.card.sticker.adventuretime", 
        "com.kik.card.sticker.southpark", "com.kik.card.hamster.premium", "com.kik.card.hamster.basic"
    };
    public static final Map b = new g();
    private static final org.c.b e = org.c.c.a("PurchasePlugin");
    private Context d;
    private final l f;
    private final e g;
    private final m h;
    private String i;
    private k j;
    private com.android.a.a.a k;

    public InAppPurchasePlugin(Context context, String s, k k1, l l1, com.android.a.a.a a1, a a2, m m1)
    {
        super("IAP");
        d = context;
        f = l1;
        i = s;
        j = k1;
        k = a1;
        g = a2.a();
        h = m1;
    }

    static int a(int i1)
    {
        return b(i1);
    }

    static String a(InAppPurchasePlugin inapppurchaseplugin)
    {
        return inapppurchaseplugin.i;
    }

    static String a(InAppPurchasePlugin inapppurchaseplugin, String s)
    {
        return inapppurchaseplugin.b(s);
    }

    static JSONObject a(InAppPurchasePlugin inapppurchaseplugin, String s, String s1, String s2, String s3, String s4, JSONObject jsonobject)
    {
        return inapppurchaseplugin.a(s, s1, s2, s3, s4, jsonobject);
    }

    private JSONObject a(String s, String s1, String s2, String s3, String s4, JSONObject jsonobject)
    {
        String s5 = bf.j(s3);
        JSONObject jsonobject1;
        String s6;
        JSONObject jsonobject4;
        JSONObject jsonobject2 = new JSONObject(s1);
        jsonobject1 = new JSONObject();
        JSONObject jsonobject3 = new JSONObject();
        jsonobject4 = new JSONObject();
        jsonobject1.put("transactionId", jsonobject2.optString("orderId"));
        s6 = jsonobject2.optString("productId");
        jsonobject3.put("sku", s6);
        jsonobject3.put("formattedPrice", s4);
        jsonobject4.put("transactionId", jsonobject2.optString("orderId"));
        jsonobject4.put("platform", "android");
        jsonobject4.put("platformSignature", s);
        jsonobject4.put("platformReceipt", s1);
        jsonobject4.put("item", jsonobject3);
        jsonobject4.put("data", jsonobject);
        try
        {
            s = f.a(jsonobject4, s2, s3);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            try
            {
                com.a.a.a.a("IAPGenerateSignedRequestException", s.getLocalizedMessage());
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return null;
            }
            return null;
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_238;
        }
        if (s.equals(""))
        {
            break MISSING_BLOCK_LABEL_238;
        }
        jsonobject1.put("sku", s6);
        jsonobject1.put("content", s);
        jsonobject1.put("host", s5);
        jsonobject1.put("username", s2);
        return jsonobject1;
        return null;
    }

    static void a(com.kik.cards.web.plugin.a a1)
    {
        a(a1, 403, null);
    }

    static void a(com.kik.cards.web.plugin.a a1, int i1)
    {
        a(a1, i1, null);
    }

    static void a(com.kik.cards.web.plugin.a a1, JSONObject jsonobject)
    {
        a(a1, 200, jsonobject);
    }

    static void a(com.kik.d.b.a.k k1)
    {
        b(k1);
    }

    public static boolean a(String s, String s1)
    {
        if (DeviceUtils.c())
        {
            return true;
        }
        String s2 = s;
        if (s.equals("cards-sticker-dev.herokuapp.com"))
        {
            s2 = "stickers.kik.com";
        }
        for (s = b.entrySet().iterator(); s.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)s.next();
            if (((String)entry.getKey()).equals(s2) && s1.startsWith((String)entry.getValue()))
            {
                return true;
            }
        }

        s = s2.split("\\.");
        s1 = s1.split("\\.");
        int j1 = s1.length - 1;
        if (s.length < j1)
        {
            return false;
        }
        for (int i1 = 0; i1 < j1; i1++)
        {
            if (!s1[j1 - 1 - i1].equals(s[i1]))
            {
                return false;
            }
        }

        return true;
    }

    private static int b(int i1)
    {
        i1;
        JVM INSTR tableswitch 0 8: default 52
    //                   0 121
    //                   1 102
    //                   2 52
    //                   3 56
    //                   4 93
    //                   5 66
    //                   6 112
    //                   7 75
    //                   8 84;
           goto _L1 _L2 _L3 _L1 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        return 500;
_L4:
        b(com.kik.d.b.a.k.B);
        return 513;
_L6:
        b(com.kik.d.b.a.k.B);
        continue; /* Loop/switch isn't completed */
_L8:
        b(com.kik.d.b.a.k.B);
        continue; /* Loop/switch isn't completed */
_L9:
        b(com.kik.d.b.a.k.B);
        continue; /* Loop/switch isn't completed */
_L5:
        b(com.kik.d.b.a.k.B);
        continue; /* Loop/switch isn't completed */
_L3:
        b(com.kik.d.b.a.k.A);
        return 200;
_L7:
        b(com.kik.d.b.a.k.B);
        if (true) goto _L1; else goto _L2
_L2:
        return 202;
    }

    static com.android.a.a.a b(InAppPurchasePlugin inapppurchaseplugin)
    {
        return inapppurchaseplugin.k;
    }

    private String b(String s)
    {
        Object obj = h.a(s);
        if (obj == null || ((i) (obj)).b() == null) goto _L2; else goto _L1
_L1:
        obj = ((i) (obj)).b();
_L4:
        return ((String) (obj));
_L2:
        int i1;
        obj = new ArrayList();
        ((ArrayList) (obj)).add(s);
        Object obj1 = new Bundle();
        ((Bundle) (obj1)).putStringArrayList("ITEM_ID_LIST", ((ArrayList) (obj)));
        try
        {
            obj = k.a(3, d.getPackageName(), "inapp", ((Bundle) (obj1)));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return "";
        }
        i1 = ((Bundle) (obj)).getInt("RESPONSE_CODE");
        if (i1 != 0)
        {
            break MISSING_BLOCK_LABEL_175;
        }
        obj = ((Bundle) (obj)).getStringArrayList("DETAILS_LIST");
        if (((ArrayList) (obj)).size() == 0)
        {
            return "";
        }
        try
        {
            obj1 = (new JSONObject((String)((ArrayList) (obj)).get(0))).optString("price");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return "";
        }
        obj = obj1;
        if (((String) (obj1)).equals("")) goto _L4; else goto _L3
_L3:
        h.a(new i(s, ((String) (obj1))));
        return ((String) (obj1));
        b(i1);
        return "";
    }

    static void b(com.kik.cards.web.plugin.a a1)
    {
        a(a1, 500, null);
    }

    static void b(com.kik.cards.web.plugin.a a1, JSONObject jsonobject)
    {
        a(a1, 200, jsonobject);
    }

    private static void b(com.kik.d.b.a.k k1)
    {
        b b1 = KikApplication.i();
        if (b1 != null)
        {
            b1.c().a(k1, kik.a.h.j.b());
        }
    }

    static k c(InAppPurchasePlugin inapppurchaseplugin)
    {
        return inapppurchaseplugin.j;
    }

    static void c(com.kik.cards.web.plugin.a a1)
    {
        a(a1, 500, null);
    }

    static void c(com.kik.cards.web.plugin.a a1, JSONObject jsonobject)
    {
        a(a1, 200, jsonobject);
    }

    private boolean c()
    {
        boolean flag = false;
        int i1;
        try
        {
            i1 = k.a(3, i, "inapp");
        }
        catch (RemoteException remoteexception)
        {
            return false;
        }
        if (i1 == 0)
        {
            flag = true;
        }
        return flag;
    }

    static void d(com.kik.cards.web.plugin.a a1)
    {
        a(a1, 500, null);
    }

    static void e(com.kik.cards.web.plugin.a a1)
    {
        a(a1, 500, null);
    }

    static void f(com.kik.cards.web.plugin.a a1)
    {
        a(a1, 500, null);
    }

    static void g(com.kik.cards.web.plugin.a a1)
    {
        a(a1, 500, null);
    }

    static void h(com.kik.cards.web.plugin.a a1)
    {
        a(a1, 500, null);
    }

    static void i(com.kik.cards.web.plugin.a a1)
    {
        a(a1, 500, null);
    }

    static void j(com.kik.cards.web.plugin.a a1)
    {
        a(a1, 500, null);
    }

    static void k(com.kik.cards.web.plugin.a a1)
    {
        a(a1, 500, null);
    }

    static void l(com.kik.cards.web.plugin.a a1)
    {
        a(a1, 500, null);
    }

    static void m(com.kik.cards.web.plugin.a a1)
    {
        a(a1, 500, null);
    }

    static void n(com.kik.cards.web.plugin.a a1)
    {
        a(a1, 200, null);
    }

    static void o(com.kik.cards.web.plugin.a a1)
    {
        a(a1, 405, null);
    }

    static void p(com.kik.cards.web.plugin.a a1)
    {
        a(a1, 500, null);
    }

    public final boolean a(String s)
    {
        return s != null && (bf.a(s) || DeviceUtils.d(d)) && c();
    }

    public com.kik.cards.web.plugin.j getAvailableItems(JSONObject jsonobject, String s)
    {
        int i1;
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        try
        {
            if (k == null)
            {
                return new com.kik.cards.web.plugin.j(513);
            }
            obj = jsonobject.optJSONArray("skus");
            obj2 = bf.i(s);
            jsonobject = new JSONObject();
            s = new JSONArray();
            obj1 = new ArrayList();
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return new com.kik.cards.web.plugin.j(500);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return new com.kik.cards.web.plugin.j(500);
        }
        i1 = 0;
_L2:
        if (i1 >= ((JSONArray) (obj)).length())
        {
            break MISSING_BLOCK_LABEL_173;
        }
        obj4 = ((JSONArray) (obj)).getString(i1);
        if (!a(((String) (obj2)), ((String) (obj4))))
        {
            break MISSING_BLOCK_LABEL_386;
        }
        obj3 = h.a(((String) (obj4)));
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_150;
        }
        obj4 = new JSONObject();
        ((JSONObject) (obj4)).put("sku", ((i) (obj3)).a());
        ((JSONObject) (obj4)).put("formattedPrice", ((i) (obj3)).b());
        s.put(obj4);
        break MISSING_BLOCK_LABEL_386;
        ((ArrayList) (obj1)).add(obj4);
        break MISSING_BLOCK_LABEL_386;
        if (((ArrayList) (obj1)).isEmpty())
        {
            break MISSING_BLOCK_LABEL_366;
        }
        obj = new Bundle();
        ((Bundle) (obj)).putStringArrayList("ITEM_ID_LIST", ((ArrayList) (obj1)));
        obj = k.a(3, i, "inapp", ((Bundle) (obj)));
        i1 = ((Bundle) (obj)).getInt("RESPONSE_CODE");
        if (i1 != 0)
        {
            break MISSING_BLOCK_LABEL_360;
        }
        for (obj = ((Bundle) (obj)).getStringArrayList("DETAILS_LIST").iterator(); ((Iterator) (obj)).hasNext(); h.a(new i(((String) (obj1)), ((String) (obj2)))))
        {
            obj2 = new JSONObject((String)((Iterator) (obj)).next());
            obj1 = ((JSONObject) (obj2)).getString("productId");
            obj2 = ((JSONObject) (obj2)).getString("price");
            obj3 = new JSONObject();
            ((JSONObject) (obj3)).put("sku", obj1);
            ((JSONObject) (obj3)).put("formattedPrice", obj2);
            s.put(obj3);
        }

        break MISSING_BLOCK_LABEL_366;
        b(i1);
        jsonobject.put("items", s);
        jsonobject = new com.kik.cards.web.plugin.j(jsonobject);
        return jsonobject;
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public com.kik.cards.web.plugin.j getAvailableItemsAsynchronously(com.kik.cards.web.plugin.a a1, JSONObject jsonobject, String s)
    {
        (new Thread(new com.kik.cards.web.iap.j(this, a1, jsonobject, s))).start();
        return new com.kik.cards.web.plugin.j(202);
    }

    public com.kik.cards.web.plugin.j getTransactionList(JSONObject jsonobject, String s)
    {
        Object obj;
        JSONObject jsonobject1;
        int i1;
        jsonobject = bf.i(s);
        ArrayList arraylist;
        ArrayList arraylist1;
        String s1;
        Object obj1;
        Object obj2;
        try
        {
            obj = k.a(3, i, "inapp", null);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return new com.kik.cards.web.plugin.j(500);
        }
        arraylist = ((Bundle) (obj)).getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        arraylist1 = ((Bundle) (obj)).getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        obj = new JSONArray();
        i1 = 0;
_L3:
        if (i1 >= arraylist.size()) goto _L2; else goto _L1
_L1:
        obj1 = new JSONObject((String)arraylist.get(i1));
        obj2 = new JSONObject(((JSONObject) (obj1)).optString("developerPayload"));
        jsonobject1 = ((JSONObject) (obj2)).optJSONObject("data");
        s1 = ((JSONObject) (obj2)).optString("username");
        obj2 = ((JSONObject) (obj2)).optString("host");
        if (!DeviceUtils.d(d) && !((String) (obj2)).equals(jsonobject))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj1 = b(((JSONObject) (obj1)).optString("productId"));
        jsonobject1 = a((String)arraylist1.get(i1), (String)arraylist.get(i1), s1, s, ((String) (obj1)), jsonobject1);
        if (jsonobject1 == null)
        {
            try
            {
                jsonobject = new com.kik.cards.web.plugin.j(500);
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                return new com.kik.cards.web.plugin.j(500);
            }
            return jsonobject;
        }
        ((JSONArray) (obj)).put(jsonobject1);
        i1++;
          goto _L3
_L2:
        jsonobject = new JSONObject();
        try
        {
            jsonobject.put("transactions", obj);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return new com.kik.cards.web.plugin.j(500);
        }
        return new com.kik.cards.web.plugin.j(jsonobject);
    }

    public com.kik.cards.web.plugin.j markTransactionStored(JSONObject jsonobject)
    {
        jsonobject = jsonobject.optString("transactionId");
        if (jsonobject.equals("") || jsonobject == null)
        {
            return new com.kik.cards.web.plugin.j(400);
        }
        Object obj;
        Object obj1;
        RemoteException remoteexception;
        try
        {
            obj = k.a(3, i, "inapp", null);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return new com.kik.cards.web.plugin.j(500);
        }
        obj = ((Bundle) (obj)).getStringArrayList("INAPP_PURCHASE_DATA_LIST").iterator();
_L2:
        if (!((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_159;
        }
        obj1 = (String)((Iterator) (obj)).next();
        if (!(new JSONObject(((String) (obj1)))).optString("orderId").equals(jsonobject))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj1 = (new JSONObject(((String) (obj1)))).getString("purchaseToken");
        obj1 = new com.kik.cards.web.plugin.j(b(k.b(3, i, ((String) (obj1)))));
        return ((com.kik.cards.web.plugin.j) (obj1));
        remoteexception;
        continue; /* Loop/switch isn't completed */
        return new com.kik.cards.web.plugin.j(500);
        JSONException jsonexception;
        jsonexception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public com.kik.cards.web.plugin.j purchase(com.kik.cards.web.plugin.a a1, JSONObject jsonobject, String s)
    {
        if (k == null)
        {
            return new com.kik.cards.web.plugin.j(513);
        }
        boolean flag = jsonobject.optBoolean("skipPrompt", false);
        if (g.a(flag, s))
        {
            return new com.kik.cards.web.plugin.j(420);
        } else
        {
            g.a(true, flag, s).a(new h(this, jsonobject, s, a1));
            return new com.kik.cards.web.plugin.j(202);
        }
    }

}
