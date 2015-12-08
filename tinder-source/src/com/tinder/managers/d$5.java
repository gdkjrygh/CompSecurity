// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import android.text.TextUtils;
import com.tinder.d.a;
import com.tinder.e.i;
import com.tinder.model.InstagramAuthError;
import com.tinder.model.InstagramDataSet;
import com.tinder.model.SparksEvent;
import com.tinder.model.UserMeta;
import com.tinder.parse.d;
import com.tinder.utils.v;
import org.json.JSONObject;

// Referenced classes of package com.tinder.managers:
//            d, a, ae

final class b
    implements com.android.volley.
{

    final i a;
    final JSONObject b;
    final com.tinder.managers.d c;

    public final void a(Object obj)
    {
        obj = (JSONObject)obj;
        (new StringBuilder("response=")).append(obj);
        InstagramDataSet instagramdataset = d.a(((JSONObject) (obj)));
        String s = instagramdataset.username;
        if (!TextUtils.isEmpty(s))
        {
            d.b(c).f();
            obj = new SparksEvent("Account.InstagramLoginSuccess");
            ((SparksEvent) (obj)).put("instagramName", s);
            com.tinder.managers.a.a(((SparksEvent) (obj)));
            if (TextUtils.equals("null", instagramdataset.lastFetchTime))
            {
                obj = "";
            } else
            {
                obj = instagramdataset.lastFetchTime;
            }
            if (TextUtils.isEmpty(((CharSequence) (obj))))
            {
                com.tinder.managers.d.a(c, 0);
            }
            d.c(c);
            com.tinder.managers.ae.a(s);
            d.c(c);
            ae.w();
            if (d.h() != null)
            {
                d.h().instagramDataSet = instagramdataset;
            }
            a.a(instagramdataset);
            return;
        } else
        {
            v.b("authInstagram failure: no username");
            obj = b;
            obj = new InstagramAuthError(((JSONObject) (obj)).optInt("status"), ((JSONObject) (obj)).optString("error"));
            a.a(((InstagramAuthError) (obj)));
            return;
        }
    }

    amAuthError(com.tinder.managers.d d1, i j, JSONObject jsonobject)
    {
        c = d1;
        a = j;
        b = jsonobject;
        super();
    }
}
