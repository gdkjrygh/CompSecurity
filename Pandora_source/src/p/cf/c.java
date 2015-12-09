// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cf;

import android.content.Context;
import android.os.AsyncTask;
import com.pandora.android.util.s;
import java.io.IOException;
import p.df.a;

// Referenced classes of package p.cf:
//            b

public class c extends AsyncTask
{

    private Context a;
    private String b;
    private String c;
    private String d;

    public c(Context context, String s1)
    {
        a = context;
        b = s1;
    }

    protected String a()
        throws IOException, p.bs.d, p.bs.c, p.bs.b, p.bs.a
    {
        p.df.a.a("RequestAuthCodeTask", "Requesting Google Now authorization code.");
        String s1 = p.bs.c.a(a, b);
        p.df.a.a("RequestAuthCodeTask", "Got authorization code.");
        return s1;
    }

    protected transient Void a(Void avoid[])
    {
        try
        {
            c = a();
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            p.df.a.a("RequestAuthCodeTask", avoid);
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            p.df.a.a("RequestAuthCodeTask", avoid);
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            p.df.a.a("RequestAuthCodeTask", avoid);
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            p.df.a.a("RequestAuthCodeTask", avoid);
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            d = avoid.a();
        }
        return null;
    }

    protected void a(Void void1)
    {
        super.onPostExecute(void1);
        if (!s.a(c))
        {
            p.cf.b.a().a(c);
            return;
        }
        if (!s.a(d))
        {
            p.df.a.a("RequestAuthCodeTask", "Already have existing token. Revoking existing access token.");
            p.cf.b.a().b(d);
            return;
        } else
        {
            p.df.a.b("RequestAuthCodeTask", "Unexpected error occurred while getting the auth code.");
            return;
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Void)obj);
    }
}
