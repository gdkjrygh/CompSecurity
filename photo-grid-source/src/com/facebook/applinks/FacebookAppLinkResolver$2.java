// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.applinks;

import android.net.Uri;
import bolts.c;
import bolts.q;
import com.facebook.FacebookRequestError;
import com.facebook.GraphResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.applinks:
//            FacebookAppLinkResolver

class val.urisToRequest
    implements com.facebook.solver._cls2
{

    final FacebookAppLinkResolver this$0;
    final Map val$appLinkResults;
    final q val$taskCompletionSource;
    final HashSet val$urisToRequest;

    public void onCompleted(GraphResponse graphresponse)
    {
        Object obj;
        obj = graphresponse.getError();
        if (obj != null)
        {
            val$taskCompletionSource.a(((FacebookRequestError) (obj)).getException());
            return;
        }
        graphresponse = graphresponse.getJSONObject();
        if (graphresponse == null)
        {
            val$taskCompletionSource.a(val$appLinkResults);
            return;
        }
        obj = val$urisToRequest.iterator();
_L2:
        Uri uri;
        if (!((Iterator) (obj)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        uri = (Uri)((Iterator) (obj)).next();
        if (!graphresponse.has(uri.toString()))
        {
            continue; /* Loop/switch isn't completed */
        }
        JSONObject jsonobject;
        Object obj1;
        ArrayList arraylist;
        int j;
        jsonobject = graphresponse.getJSONObject(uri.toString()).getJSONObject("app_links");
        obj1 = jsonobject.getJSONArray("android");
        j = ((JSONArray) (obj1)).length();
        arraylist = new ArrayList(j);
        JSONException jsonexception;
        bolts.d d;
        for (int i = 0; i >= j; i++)
        {
            break MISSING_BLOCK_LABEL_162;
        }

        d = FacebookAppLinkResolver.access$000(((JSONArray) (obj1)).getJSONObject(i));
        if (d == null)
        {
            break MISSING_BLOCK_LABEL_247;
        }
        arraylist.add(d);
        break MISSING_BLOCK_LABEL_247;
        obj1 = new c(uri, arraylist, FacebookAppLinkResolver.access$100(uri, jsonobject));
        val$appLinkResults.put(uri, obj1);
        synchronized (FacebookAppLinkResolver.access$200(FacebookAppLinkResolver.this))
        {
            FacebookAppLinkResolver.access$200(FacebookAppLinkResolver.this).put(uri, obj1);
        }
        continue; /* Loop/switch isn't completed */
        exception;
        hashmap;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        // Misplaced declaration of an exception variable
        catch (JSONException jsonexception) { }
        if (true) goto _L2; else goto _L1
_L1:
        val$taskCompletionSource.a(val$appLinkResults);
        return;
    }

    ()
    {
        this$0 = final_facebookapplinkresolver;
        val$taskCompletionSource = q1;
        val$appLinkResults = map;
        val$urisToRequest = HashSet.this;
        super();
    }
}
