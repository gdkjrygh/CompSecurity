// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.images;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.OperationType;
import com.facebook.fbservice.service.ad;
import com.facebook.fbservice.service.e;
import com.facebook.http.b.ap;
import com.facebook.http.protocol.aw;
import com.facebook.http.protocol.s;
import com.facebook.orca.server.aq;
import java.util.Iterator;
import java.util.Set;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.json.JSONObject;
import org.json.JSONTokener;

public class h
    implements e
{

    private final ap a;
    private final s b;

    public h(ap ap1, s s)
    {
        a = ap1;
        b = s;
    }

    private Bundle a(HttpResponse httpresponse, String s)
    {
        return com.facebook.common.w.e.a(new JSONObject(new JSONTokener(s)));
    }

    private OperationResult a(Bundle bundle)
    {
        Object obj = Uri.parse("http://api.search.live.net/json.aspx").buildUpon();
        String s;
        for (Iterator iterator = bundle.keySet().iterator(); iterator.hasNext(); ((android.net.Uri.Builder) (obj)).appendQueryParameter(s, bundle.getString(s)))
        {
            s = (String)iterator.next();
        }

        bundle = new aw(b);
        obj = new HttpGet(((android.net.Uri.Builder) (obj)).build().toString());
        obj = (String)a.a("imageSearch", ((org.apache.http.client.methods.HttpUriRequest) (obj)), bundle);
        return OperationResult.a(a(bundle.a(), ((String) (obj))));
    }

    public OperationResult a(ad ad1)
    {
        OperationType operationtype = ad1.a();
        ad1 = ad1.b();
        if (aq.B.equals(operationtype))
        {
            return a(((Bundle) (ad1)));
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown operation type: ").append(operationtype).toString());
        }
    }
}
