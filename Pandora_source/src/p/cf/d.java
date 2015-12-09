// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cf;

import android.os.AsyncTask;
import com.pandora.android.provider.b;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;
import p.cw.c;
import p.cx.t;
import p.df.a;

// Referenced classes of package p.cf:
//            b

public class d extends AsyncTask
{

    private String a;

    public d(String s)
    {
        a = s;
    }

    protected transient Boolean a(Void avoid[])
    {
        p.df.a.a("RevokeAccessTokenTask", "Revoking Google Now access token.");
        avoid = new ArrayList();
        avoid.add(new BasicNameValuePair("token", a));
        try
        {
            b.a.b().p().a("https://accounts.google.com/o/oauth2/revoke", avoid, p.cx.t.a.b);
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            p.df.a.b("RevokeAccessTokenTask", "There was an error revoking the token.", avoid);
            return Boolean.valueOf(false);
        }
        return Boolean.valueOf(true);
    }

    protected void a(Boolean boolean1)
    {
        super.onPostExecute(boolean1);
        if (boolean1 != null && boolean1.booleanValue())
        {
            p.df.a.a("RevokeAccessTokenTask", "Token revoked successfully. Getting new auth code...");
            p.cf.b.a().d();
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
