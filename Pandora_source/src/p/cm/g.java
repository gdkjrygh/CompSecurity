// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cm;

import android.content.OperationApplicationException;
import android.os.RemoteException;
import android.support.v4.content.j;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.provider.b;
import com.pandora.android.util.s;
import com.pandora.radio.data.af;
import com.pandora.radio.data.ag;
import com.pandora.radio.data.ai;
import com.pandora.radio.util.i;
import java.util.Calendar;
import java.util.Hashtable;
import org.json.JSONException;
import p.cw.c;
import p.cx.d;
import p.cx.n;
import p.cx.q;
import p.cx.x;
import p.cx.y;
import p.df.a;

public class g extends d
{

    private PandoraIntent a;

    public g()
    {
    }

    private boolean a(ai ai1, ai ai2)
    {
        return !s.a(ai1.l()) && i.a(ai1.l(), ai2.l()) != 0;
    }

    public void a(Void void1)
    {
        b(void1);
    }

    public Object b(Object aobj[])
        throws JSONException, q, y, n, RemoteException, OperationApplicationException
    {
        return c(aobj);
    }

    public void b(Void void1)
    {
        if (a != null)
        {
            b.a.C().a(a);
        }
    }

    public transient Void c(Object aobj[])
        throws JSONException, q, y, n, RemoteException
    {
        boolean flag = false;
        Object obj1 = (ai)aobj[0];
        Object obj = (ai)aobj[1];
        Object obj2 = (String)aobj[2];
        aobj = (String)aobj[3];
        a = new PandoraIntent("cmd_change_settings_result");
        c c1 = b.a.b();
        if (a(((ai) (obj)), ((ai) (obj1))))
        {
            p.cx.x.f f = c1.e().a(((ai) (obj)).l());
            if (!f.a)
            {
                throw new y(1011, null, null, null);
            }
            if (!f.b)
            {
                throw new y(1013, null, null, null);
            }
        }
        if (isCancelled())
        {
            a.putExtra("intent_success", false);
            return null;
        }
        if (((ai) (obj)).n() != ((ai) (obj1)).n())
        {
            flag = true;
        }
        aobj = ((ai) (obj)).a(((ai) (obj1)), ((String) (obj2)), ((String) (aobj)));
        obj2 = b.a.d();
        obj1 = obj;
        if (((Hashtable) (aobj)).size() > 0)
        {
            aobj = c1.e().a(((Hashtable) (aobj)));
            obj1 = ((ai) (obj)).l();
            int k;
            try
            {
                aobj = new ai(((org.json.JSONObject) (aobj)));
            }
            // Misplaced declaration of an exception variable
            catch (Object aobj[])
            {
                p.df.a.b("ChangeAccountSettingsAsyncTask", "ChangeAccountSettingsAsyncTask", ((Throwable) (aobj)));
                aobj = ((Object []) (obj));
            }
            if (!s.a(((String) (obj1))))
            {
                ((ai) (aobj)).c(((String) (obj1)));
                ((af) (obj2)).b(((String) (obj1)));
            }
            k = ((ai) (aobj)).c();
            if (k > 0)
            {
                ((af) (obj2)).a(Calendar.getInstance().get(1) - k);
            }
            obj = ((ai) (aobj)).d();
            if (!s.a(((String) (obj))))
            {
                ((af) (obj2)).e(((String) (obj)));
            }
            obj = ((ai) (aobj)).b();
            if (!s.a(((String) (obj))))
            {
                ((af) (obj2)).d(((String) (obj)));
            }
            c1.k().a(((ai) (aobj)));
            obj1 = ((Object) (aobj));
            if (flag)
            {
                c1.d().X();
                obj1 = ((Object) (aobj));
            }
        }
        a.putExtra("show_toast", true);
        a.putExtra("intent_success", true);
        a.putExtra("intent_user_settings", ((java.io.Serializable) (obj1)));
        return null;
    }

    public void onCancelled(Object obj)
    {
        a((Void)obj);
    }

    public void onPostExecute(Object obj)
    {
        b((Void)obj);
    }
}
