// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.iap;

import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.android.a.a.a;
import com.kik.cards.web.bf;
import com.kik.g.r;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.kik.cards.web.iap:
//            h, InAppPurchasePlugin

final class i extends r
{

    final String a;
    final String b;
    final JSONObject c;
    final String d;
    final h e;

    i(h h1, String s, String s1, JSONObject jsonobject, String s2)
    {
        e = h1;
        a = s;
        b = s1;
        c = jsonobject;
        d = s2;
        super();
    }

    public final void a(Object obj)
    {
        Object obj1 = (Intent)obj;
        if (obj1 == null)
        {
            InAppPurchasePlugin.f(e.c);
            return;
        }
        if (!((Intent) (obj1)).getBooleanExtra("retry", false))
        {
            obj = ((Intent) (obj1)).getStringExtra("INAPP_PURCHASE_DATA");
            String s = ((Intent) (obj1)).getStringExtra("INAPP_DATA_SIGNATURE");
            if (obj == null || s == null)
            {
                InAppPurchasePlugin.g(e.c);
                return;
            }
            obj1 = new JSONObject();
            obj = com.kik.cards.web.iap.InAppPurchasePlugin.a(e.d, s, ((String) (obj)), a, e.b, b, c);
            if (obj == null)
            {
                InAppPurchasePlugin.h(e.c);
                return;
            }
            try
            {
                ((JSONObject) (obj1)).put("transaction", obj);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                InAppPurchasePlugin.i(e.c);
                return;
            }
            com.kik.cards.web.iap.InAppPurchasePlugin.a(com.kik.d.b.a.k.z);
            com.kik.cards.web.iap.InAppPurchasePlugin.a(e.c, ((JSONObject) (obj1)));
            return;
        }
        obj1 = bf.j(e.b);
        Object obj3;
        try
        {
            obj3 = InAppPurchasePlugin.b(e.d).a(3, com.kik.cards.web.iap.InAppPurchasePlugin.a(e.d), "inapp", null);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            InAppPurchasePlugin.j(e.c);
            return;
        }
        if (obj3 == null)
        {
            InAppPurchasePlugin.k(e.c);
            return;
        }
        obj = ((Bundle) (obj3)).getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        obj3 = ((Bundle) (obj3)).getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        int j = 0;
        do
        {
            try
            {
                if (j >= ((ArrayList) (obj)).size())
                {
                    break;
                }
                JSONObject jsonobject1 = new JSONObject((String)((ArrayList) (obj)).get(j));
                if (jsonobject1.optString("productId").equals(d))
                {
                    JSONObject jsonobject2 = new JSONObject(jsonobject1.optString("developerPayload"));
                    JSONObject jsonobject = jsonobject2.optJSONObject("data");
                    String s1 = jsonobject2.optString("username");
                    if (jsonobject2.optString("host").equals(obj1))
                    {
                        Object obj2 = com.kik.cards.web.iap.InAppPurchasePlugin.a(e.d, jsonobject1.optString("productId"));
                        obj = com.kik.cards.web.iap.InAppPurchasePlugin.a(e.d, (String)((ArrayList) (obj3)).get(j), (String)((ArrayList) (obj)).get(j), s1, e.b, ((String) (obj2)), jsonobject);
                        obj2 = new JSONObject();
                        ((JSONObject) (obj2)).put("transaction", obj);
                        com.kik.cards.web.iap.InAppPurchasePlugin.a(com.kik.d.b.a.k.z);
                        InAppPurchasePlugin.b(e.c, ((JSONObject) (obj2)));
                        return;
                    }
                }
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                InAppPurchasePlugin.l(e.c);
                return;
            }
            j++;
        } while (true);
        com.kik.cards.web.iap.InAppPurchasePlugin.a(com.kik.d.b.a.k.A);
        obj = new JSONObject();
        InAppPurchasePlugin.c(e.c, ((JSONObject) (obj)));
        return;
    }

    public final void b()
    {
        com.kik.cards.web.iap.InAppPurchasePlugin.a(com.kik.d.b.a.k.A);
        InAppPurchasePlugin.n(e.c);
        super.b();
    }

    public final void b(Throwable throwable)
    {
        com.kik.cards.web.iap.InAppPurchasePlugin.a(com.kik.d.b.a.k.B);
        InAppPurchasePlugin.m(e.c);
        super.b(throwable);
    }
}
