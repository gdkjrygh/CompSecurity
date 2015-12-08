// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cm;

import android.content.OperationApplicationException;
import android.os.RemoteException;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.provider.b;
import org.json.JSONException;
import p.cw.c;
import p.cx.d;
import p.cx.n;
import p.cx.q;
import p.cx.x;
import p.cx.y;
import p.dd.au;

public class j extends d
{

    public j()
    {
    }

    public void a(PandoraIntent pandoraintent)
    {
        if (pandoraintent != null)
        {
            b.a.C().a(pandoraintent);
        }
    }

    public Object b(Object aobj[])
        throws JSONException, q, y, n, RemoteException, OperationApplicationException
    {
        return c(aobj);
    }

    public transient PandoraIntent c(Object aobj[])
        throws JSONException, q, y, n, RemoteException
    {
        c c1 = (c)aobj[0];
        String s = (String)aobj[1];
        String s1 = (String)aobj[2];
        aobj = (String)aobj[3];
        aobj = b.a.b().e().b(s, ((String) (aobj)));
        PandoraIntent pandoraintent = new PandoraIntent("delete_music_seed_success");
        pandoraintent.putExtra("intent_station_token", s);
        pandoraintent.putExtra("intent_music_display_string", s1);
        c1.a(new au(((com.pandora.radio.data.y) (aobj)), p.dd.au.a.f));
        return pandoraintent;
    }

    public void onPostExecute(Object obj)
    {
        a((PandoraIntent)obj);
    }
}
