// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.iap;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.android.a.a.a;
import com.kik.cards.util.UserDataParcelable;
import com.kik.cards.web.bf;
import com.kik.g.p;
import com.kik.g.r;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.kik.cards.web.iap:
//            InAppPurchasePlugin, k, i

final class h extends r
{

    final JSONObject a;
    final String b;
    final com.kik.cards.web.plugin.a c;
    final InAppPurchasePlugin d;

    h(InAppPurchasePlugin inapppurchaseplugin, JSONObject jsonobject, String s, com.kik.cards.web.plugin.a a1)
    {
        d = inapppurchaseplugin;
        a = jsonobject;
        b = s;
        c = a1;
        super();
    }

    public final void a(Object obj)
    {
        JSONObject jsonobject;
        String s;
        String s1;
        String s2;
        JSONObject jsonobject1;
        String s3;
        obj = (UserDataParcelable)obj;
        super.a(obj);
        s = ((UserDataParcelable) (obj)).a;
        s1 = a.optString("sku");
        s2 = com.kik.cards.web.iap.InAppPurchasePlugin.a(d, s1);
        obj = bf.i(b);
        s3 = bf.j(b);
        if (!com.kik.cards.web.iap.InAppPurchasePlugin.a(((String) (obj)), s1))
        {
            com.kik.cards.web.iap.InAppPurchasePlugin.a(com.kik.d.b.a.k.B);
            com.kik.cards.web.iap.InAppPurchasePlugin.a(c);
            return;
        }
        jsonobject = a.optJSONObject("data");
        if (s2.equals(""))
        {
            com.kik.cards.web.iap.InAppPurchasePlugin.a(com.kik.d.b.a.k.B);
            InAppPurchasePlugin.b(c);
            return;
        }
        jsonobject1 = new JSONObject();
        if (jsonobject != null)
        {
            break MISSING_BLOCK_LABEL_216;
        }
        obj = new JSONObject();
_L1:
        jsonobject1.put("data", obj);
        jsonobject1.put("username", s);
        jsonobject1.put("host", s3);
        obj = InAppPurchasePlugin.b(d).a(3, com.kik.cards.web.iap.InAppPurchasePlugin.a(d), s1, "inapp", jsonobject1.toString());
        int j = ((Bundle) (obj)).getInt("RESPONSE_CODE");
        if (j != 0)
        {
            com.kik.cards.web.iap.InAppPurchasePlugin.a(c, com.kik.cards.web.iap.InAppPurchasePlugin.a(j));
            return;
        }
        break MISSING_BLOCK_LABEL_251;
        obj = jsonobject;
          goto _L1
        obj;
        com.kik.cards.web.iap.InAppPurchasePlugin.a(com.kik.d.b.a.k.B);
        InAppPurchasePlugin.c(c);
        return;
        obj;
        com.kik.cards.web.iap.InAppPurchasePlugin.a(com.kik.d.b.a.k.B);
        InAppPurchasePlugin.d(c);
        return;
        obj = (PendingIntent)((Bundle) (obj)).getParcelable("BUY_INTENT");
        if (obj == null)
        {
            com.kik.cards.web.iap.InAppPurchasePlugin.a(com.kik.d.b.a.k.B);
            InAppPurchasePlugin.e(c);
            return;
        } else
        {
            Intent intent = new Intent();
            intent.putExtra("sku", s1);
            intent.putExtra("payload", jsonobject1.toString());
            InAppPurchasePlugin.c(d).a(((PendingIntent) (obj)).getIntentSender()).a(new i(this, s, s2, jsonobject, s1));
            return;
        }
    }

    public final void b()
    {
        com.kik.cards.web.iap.InAppPurchasePlugin.a(com.kik.d.b.a.k.A);
        InAppPurchasePlugin.o(c);
        super.b();
    }

    public final void b(Throwable throwable)
    {
        com.kik.cards.web.iap.InAppPurchasePlugin.a(com.kik.d.b.a.k.B);
        com.kik.cards.web.iap.InAppPurchasePlugin.p(c);
        super.b(throwable);
    }
}
