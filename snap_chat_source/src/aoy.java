// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class aoy
{

    public final List a;

    aoy(List list)
    {
        a = Collections.unmodifiableList(list);
    }

    static aoy a(Bundle bundle, String s)
    {
        bundle = bundle.getStringArrayList("DETAILS_LIST");
        ArrayList arraylist;
        if (bundle == null)
        {
            bundle = Collections.emptyList();
        }
        arraylist = new ArrayList(bundle.size());
        for (bundle = bundle.iterator(); bundle.hasNext();)
        {
            Object obj = (String)bundle.next();
            try
            {
                obj = new JSONObject(((String) (obj)));
                String s1 = ((JSONObject) (obj)).getString("productId");
                String s2 = ((JSONObject) (obj)).getString("price");
                aox.a a1 = aox.a.a(((JSONObject) (obj)));
                ((JSONObject) (obj)).getString("title");
                ((JSONObject) (obj)).optString("description");
                arraylist.add(new aox(s, s1, s2, a1));
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw new aop(bundle);
            }
        }

        return new aoy(arraylist);
    }
}
