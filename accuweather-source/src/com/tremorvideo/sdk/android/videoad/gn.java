// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.net.Uri;
import android.os.AsyncTask;
import com.tremorvideo.sdk.android.b.a;
import java.util.HashMap;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            gl, ea, ct, dm

class gn extends AsyncTask
{

    String a;
    final Uri b;
    final gl c;

    gn(gl gl1, Uri uri)
    {
        c = gl1;
        b = uri;
        super();
        a = "";
    }

    protected transient Boolean a(Void avoid[])
    {
        boolean flag;
        try
        {
            avoid = b.getQueryParameter("oauth_verifier");
            Object obj = new a("zSB18SDCMETDn2BH50xg", "Khb9CLQxkT62an9PUUpvBtRyh1Jluvwi7FGAiJkuJY&", c.f, "POST", "http://api.twitter.com/oauth/access_token");
            ((a) (obj)).a("oauth_verifier", avoid);
            ((a) (obj)).a();
            obj = ((a) (obj)).b();
            avoid = (String)((HashMap) (obj)).get("oauth_token");
            obj = (String)((HashMap) (obj)).get("oauth_token_secret");
            avoid = new a("zSB18SDCMETDn2BH50xg", (new StringBuilder()).append("Khb9CLQxkT62an9PUUpvBtRyh1Jluvwi7FGAiJkuJY&").append(((String) (obj))).toString(), avoid, "POST", "http://api.twitter.com/1/statuses/update.json");
            avoid.a("status", c.g.a("message", "Tweet"));
            flag = avoid.a();
            ct.d(avoid.c());
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            com.tremorvideo.sdk.android.videoad.ct.a(avoid);
            return Boolean.valueOf(false);
        }
        return Boolean.valueOf(flag);
    }

    protected void a(Boolean boolean1)
    {
        c.c.dismiss();
        if (boolean1.booleanValue())
        {
            c.e.a(1, "");
            return;
        } else
        {
            c.e.a(0, a);
            return;
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Boolean)obj);
    }
}
