// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cm;

import android.content.Context;
import android.content.OperationApplicationException;
import android.os.RemoteException;
import android.support.v4.content.j;
import android.util.Pair;
import android.widget.Toast;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.provider.b;
import com.pandora.radio.data.y;
import com.pandora.radio.provider.i;
import org.json.JSONArray;
import org.json.JSONException;
import p.cw.c;
import p.cx.d;
import p.cx.n;
import p.cx.q;
import p.cx.x;
import p.df.a;

public class ak extends d
{

    private Context a;
    private String c;
    private JSONArray d;

    public ak()
    {
    }

    public void a(Pair pair)
    {
        if (((Boolean)pair.first).booleanValue())
        {
            Toast.makeText(a, a.getString(0x7f08023f), 0).show();
            pair = (y)pair.second;
            if (b.a.b().d().a(pair))
            {
                pair = new PandoraIntent("shuffle_options_changed");
                b.a.C().a(pair);
            }
            return;
        } else
        {
            Toast.makeText(a, a.getString(0x7f08023e), 0).show();
            return;
        }
    }

    public Object b(Object aobj[])
        throws JSONException, q, p.cx.y, n, RemoteException, OperationApplicationException
    {
        return c(aobj);
    }

    public transient Pair c(Object aobj[])
        throws JSONException, q, p.cx.y, n, RemoteException
    {
        boolean flag = true;
        a = (Context)aobj[0];
        c = (String)aobj[1];
        d = (JSONArray)aobj[3];
        c c1 = b.a.b();
        try
        {
            c1.e().a(d);
            aobj = c1.y().a(a, c);
            ((y) (aobj)).a(y.a(d));
            c1.y().a(((y) (aobj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            p.df.a.b("SetQuickMixAsyncTask", (new StringBuilder()).append("problem calling user.setQuickMix api call ").append(((Exception) (aobj)).getMessage()).toString());
            aobj = null;
            flag = false;
        }
        return new Pair(Boolean.valueOf(flag), ((Object) (aobj)));
    }

    public void onPostExecute(Object obj)
    {
        a((Pair)obj);
    }
}
