// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cm;

import android.content.Intent;
import android.content.OperationApplicationException;
import android.os.RemoteException;
import android.support.v4.content.j;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.ads.VideoAdManager;
import com.pandora.android.ads.l;
import com.pandora.android.data.g;
import com.pandora.android.data.m;
import com.pandora.android.provider.b;
import com.pandora.android.util.s;
import com.pandora.radio.data.af;
import org.json.JSONException;
import p.cw.c;
import p.cx.d;
import p.cx.n;
import p.cx.q;
import p.cx.x;
import p.cx.y;
import p.df.a;

public class al extends d
{

    private Intent a;

    public al()
    {
    }

    private Intent b(String s1)
        throws q, n, JSONException, y, RemoteException, OperationApplicationException
    {
        af af1;
        com.pandora.radio.data.x x1;
        String s2;
        try
        {
            x1 = b.a.b().e().p(s1);
            b.a.b().e().d();
            PandoraIntent pandoraintent = new PandoraIntent("hide_banner_ad");
            b.a.C().a(pandoraintent);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s.k();
            throw s1;
        }
        af1 = b.a.d();
        af1.a(false);
        af1.c(true);
        s2 = x1.a();
        af1 = null;
        if (s.a(s2)) goto _L2; else goto _L1
_L1:
        s2 = com.pandora.android.provider.c.a(new m(a(s2)));
        com.pandora.android.ads.VideoAdManager.c.a().a(s2, false);
_L6:
        s1 = af1;
        if (true)
        {
            s1 = new PandoraIntent("show_after_p1_trial_started_dialog");
        }
_L4:
        b.a.C().a(s1);
        s1 = new PandoraIntent("complimentary_p1_trial_started");
        s1.putExtra("intent_sponsorship_data", x1);
        return s1;
_L2:
        s.k();
        continue; /* Loop/switch isn't completed */
        Object obj;
        obj;
        s.k();
        p.df.a.b("StartComplimentaryP1TrialAsyncTask", (new StringBuilder()).append("Error showing  preroll video ad for sponsor ").append(s1).toString(), ((Throwable) (obj)));
        s1 = af1;
        if (true)
        {
            s1 = new PandoraIntent("show_after_p1_trial_started_dialog");
        }
        continue; /* Loop/switch isn't completed */
        obj;
        s.k();
        p.df.a.b("StartComplimentaryP1TrialAsyncTask", (new StringBuilder()).append("Error showing  preroll video ad for sponsor ").append(s1).toString(), ((Throwable) (obj)));
        s1 = af1;
        if (true)
        {
            s1 = new PandoraIntent("show_after_p1_trial_started_dialog");
        }
        if (true) goto _L4; else goto _L3
_L3:
        s1;
        if (true)
        {
            new PandoraIntent("show_after_p1_trial_started_dialog");
        }
        throw s1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected g a(String s1)
        throws Exception
    {
        return VideoAdManager.b(s1);
    }

    public void a(Void void1)
    {
        if (a != null)
        {
            b.a.C().a(a);
        }
    }

    public Object b(Object aobj[])
        throws JSONException, q, y, n, RemoteException, OperationApplicationException
    {
        return c(aobj);
    }

    public transient Void c(Object aobj[])
        throws JSONException, q, y, n, RemoteException, OperationApplicationException
    {
        aobj = (String)aobj[0];
        if (b.a.d().w())
        {
            p.df.a.a("StartComplimentaryP1TrialAsyncTask", "Skipping StartComplimentaryP1Trial: already within a trial");
            s.k();
            aobj = new com.pandora.radio.data.x(null, ((String) (aobj)));
            a = new PandoraIntent("complimentary_p1_trial_exist");
            a.putExtra("intent_sponsorship_data", ((java.io.Serializable) (aobj)));
            return null;
        } else
        {
            a = b(((String) (aobj)));
            return null;
        }
    }

    public void onPostExecute(Object obj)
    {
        a((Void)obj);
    }
}
