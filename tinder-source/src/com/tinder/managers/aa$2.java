// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import android.text.TextUtils;
import com.a.a.a.a.g;
import com.tinder.e.am;
import com.tinder.enums.StatusCode;
import com.tinder.model.TinderPurchase;
import com.tinder.parse.f;
import com.tinder.utils.v;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.tinder.managers:
//            aa, ae

final class b
    implements com.android.volley.
{

    final g a;
    final am b;
    final aa c;

    public final void a(Object obj)
    {
        Object obj2 = (JSONObject)obj;
        Object obj1;
        obj1 = a;
        obj = b;
        (new StringBuilder("purchase onResponse: ")).append(obj2);
        int i;
        try
        {
            i = ((JSONObject) (obj2)).getInt("status");
        }
        catch (JSONException jsonexception)
        {
            try
            {
                v.a("Failed to parse status code from purchase response.", jsonexception);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                v.a("Failed to deliver purchase details from Tinder API", ((Throwable) (obj)));
                b.a(a.a, "Exception");
                return;
            }
            i = 0;
        }
        if (i != StatusCode.OK.getCode())
        {
            break MISSING_BLOCK_LABEL_228;
        }
        obj2 = f.a(((JSONObject) (obj2)));
        if (!TextUtils.isEmpty(((com.tinder.parse.) (obj2)).) || ((com.tinder.parse.) (obj2)). != null && ((com.tinder.parse.) (obj2))..isEmpty())
        {
            v.b("ManagerPurchases handlePurchaseResponse : either has error or empty TinderPurchases list");
            ((am) (obj)).a(((g) (obj1)).a, (new StringBuilder("status: ")).append(i).toString());
            return;
        }
        obj1 = ((com.tinder.parse.r.toString) (obj2))..iterator();
_L1:
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break MISSING_BLOCK_LABEL_255;
            }
            obj2 = (TinderPurchase)((Iterator) (obj1)).next();
            if (!aa.a(((TinderPurchase) (obj2))))
            {
                break MISSING_BLOCK_LABEL_206;
            }
            ae.c(true);
            ((am) (obj)).a(((TinderPurchase) (obj2)));
        } while (true);
        v.b((new StringBuilder("Restored a purchase, but not a tinder plus subscription? ")).append(obj2).toString());
          goto _L1
        ((am) (obj)).a(((g) (obj1)).a, (new StringBuilder("status: ")).append(i).toString());
    }

    rchase(aa aa1, g g1, am am1)
    {
        c = aa1;
        a = g1;
        b = am1;
        super();
    }
}
