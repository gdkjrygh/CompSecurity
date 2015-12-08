// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cm;

import android.content.OperationApplicationException;
import android.os.RemoteException;
import android.support.v4.content.j;
import com.pandora.android.activity.PandoraIntent;
import org.json.JSONException;
import p.cw.c;
import p.cx.d;
import p.cx.n;
import p.cx.q;
import p.cx.x;
import p.cx.y;

public class b extends d
{

    public b()
    {
    }

    public void a(PandoraIntent pandoraintent)
    {
        if (pandoraintent != null)
        {
            com.pandora.android.provider.b.a.C().a(pandoraintent);
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
        String s = (String)aobj[0];
        String s1 = (String)aobj[1];
        aobj = (String)aobj[2];
        com.pandora.android.provider.b.a.b().e().a(s, ((String) (aobj)));
        PandoraIntent pandoraintent = new PandoraIntent("add_music_seed_success");
        pandoraintent.putExtra("intent_station_token", s);
        pandoraintent.putExtra("intent_music_display_string", s1);
        pandoraintent.putExtra("intent_music_token", ((String) (aobj)));
        return pandoraintent;
    }

    public void onPostExecute(Object obj)
    {
        a((PandoraIntent)obj);
    }
}
