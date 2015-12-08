// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cm;

import android.content.OperationApplicationException;
import android.os.RemoteException;
import android.support.v4.content.j;
import com.pandora.android.PandoraApp;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.data.l;
import com.pandora.android.provider.b;
import com.pandora.android.util.s;
import com.pandora.radio.provider.f;
import com.pandora.radio.util.a;
import org.json.JSONException;
import p.cw.c;
import p.cx.d;
import p.cx.n;
import p.cx.q;
import p.cx.y;

public class u extends d
{

    private PandoraIntent a;
    private long c;

    public u()
    {
    }

    protected com.pandora.radio.data.a a(String s1, com.pandora.radio.util.a.a a1)
    {
        return com.pandora.android.ads.d.a(s1, a1);
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
        throws JSONException, q, y, n, RemoteException
    {
        c = System.currentTimeMillis();
        aobj = b.a.b().x();
        com.pandora.radio.util.a.a a1 = ((PandoraApp)b.a.h()).b().a();
        aobj = a(((f) (aobj)).b("KEY_SPLASH_SCREEN_URL"), a1);
        if (aobj != null && !s.a(((com.pandora.radio.data.a) (aobj)).O()))
        {
            a = new PandoraIntent("show_interstitial_ad");
            aobj = new l(null, ((com.pandora.radio.data.a) (aobj)).O(), 0, com.pandora.android.data.l.a.a, null, Long.valueOf(System.currentTimeMillis() - c), ((com.pandora.radio.data.a) (aobj)).c(), null);
            a.putExtra("LANDING_PAGE_DATA", ((java.io.Serializable) (aobj)));
        }
        return null;
    }

    public void onPostExecute(Object obj)
    {
        a((Void)obj);
    }
}
