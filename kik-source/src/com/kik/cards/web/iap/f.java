// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.iap;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.android.a.a.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;
import kik.a.d.i;
import kik.a.e.v;
import kik.android.util.bf;
import kik.android.util.bx;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.kik.cards.web.iap:
//            b, InAppPurchasePlugin

final class f extends bf
{

    final b a;

    f(b b1)
    {
        a = b1;
        super();
    }

    private transient Void a()
    {
        Object obj1;
        if (b.f(a) == null || b.b(a) == null)
        {
            break MISSING_BLOCK_LABEL_214;
        }
        ArrayList arraylist = new ArrayList(Arrays.asList(com.kik.cards.web.iap.InAppPurchasePlugin.a));
        if (arraylist.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_214;
        }
        obj1 = new Bundle();
        ((Bundle) (obj1)).putStringArrayList("ITEM_ID_LIST", arraylist);
        Bundle bundle = b.f(a).a(3, b.b(a).getPackageName(), "inapp", ((Bundle) (obj1)));
        new ArrayList();
        if (bundle.getInt("RESPONSE_CODE") != 0)
        {
            break MISSING_BLOCK_LABEL_214;
        }
        obj1 = bundle.getStringArrayList("DETAILS_LIST");
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_214;
        }
        Vector vector;
        vector = new Vector();
        JSONObject jsonobject;
        for (obj1 = ((ArrayList) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); vector.add(new i(jsonobject.getString("productId"), jsonobject.getString("price"))))
        {
            jsonobject = new JSONObject((String)((Iterator) (obj1)).next());
        }

        if (vector.size() > 0)
        {
            b.c(a).a(vector);
        }
        break MISSING_BLOCK_LABEL_214;
        Object obj;
        obj;
_L2:
        bx.c(((Throwable) (obj)));
        break MISSING_BLOCK_LABEL_214;
        obj;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        return null;
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a();
    }

    protected final void onPostExecute(Object obj)
    {
        b.d(a);
    }
}
