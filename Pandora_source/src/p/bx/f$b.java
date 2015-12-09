// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bx;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import p.df.a;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.auth.RequestToken;

// Referenced classes of package p.bx:
//            f

private class <init> extends AsyncTask
{

    final f a;
    private Activity b;

    protected transient String a(Object aobj[])
    {
        if (!p.bx.f.a(a))
        {
            return null;
        }
        try
        {
            b = (Activity)aobj[0];
            p.bx.f.a(a, a.f());
            f.d(a).setOAuthConsumer(f.b(a), f.c(a));
            aobj = f.d(a).getOAuthRequestToken().getAuthorizationURL();
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            p.df.a.a("TwitterConnectImpl", (new StringBuilder()).append("Failed to fetch Twitter oAuth URL: ").append(((TwitterException) (aobj)).getStatusCode()).append("; ").append(((TwitterException) (aobj)).getErrorMessage()).toString());
            ((TwitterException) (aobj)).printStackTrace();
            return null;
        }
        return ((String) (aobj));
    }

    protected void a(String s)
    {
        if (s == null)
        {
            f.e(a);
        } else
        if (b != null && !b.isFinishing())
        {
            Bundle bundle = new Bundle(2);
            bundle.putString("intent_uri", s);
            bundle.putSerializable("intent_web_view_client_class", p/bx/f$c);
            bundle.putString("intent_title", "Twitter Authentication");
            com.pandora.android.activity.a.a(b, p/bx/f$d, 0, bundle, -1, false);
            super.onPostExecute(s);
            return;
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a(aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((String)obj);
    }

    private .Object(f f1)
    {
        a = f1;
        super();
    }

    sk(f f1, sk sk)
    {
        this(f1);
    }
}
