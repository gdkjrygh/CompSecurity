// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cm;

import android.content.Context;
import android.content.OperationApplicationException;
import android.os.RemoteException;
import android.support.v4.content.j;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.provider.b;
import com.pandora.android.util.s;
import com.pandora.radio.data.ag;
import com.pandora.radio.data.ai;
import java.util.Hashtable;
import org.json.JSONException;
import org.json.JSONObject;
import p.cw.c;
import p.cx.n;
import p.cx.q;
import p.cx.x;
import p.cx.y;
import p.df.a;

public class h extends p.cx.h
{

    private PandoraIntent a;
    private ai c;
    private ai d;
    private boolean e;

    protected h()
    {
    }

    public h(ai ai1, ai ai2, boolean flag)
    {
        c = ai1;
        d = ai2;
        e = flag;
    }

    protected ai a()
    {
        return d;
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

    public p.cx.h b()
    {
        return d();
    }

    protected ai c()
    {
        return c;
    }

    public transient Void c(Object aobj[])
        throws JSONException, q, y, n, RemoteException, OperationApplicationException
    {
        Object obj;
        Object obj2;
        boolean flag1;
        boolean flag2 = true;
        if (d.a(c))
        {
            p.df.a.a("ChangeSettingsAsyncTask", "no userSettingsData changes detected, skip PublicApi call");
            return null;
        }
        p.df.a.a("ChangeSettingsAsyncTask", (new StringBuilder()).append("ChangeSettingsAsyncTask : sending settings data to server --> ").append(d.toString()).toString());
        aobj = d.a(c, null, null);
        c c1 = b.a.b();
        boolean flag;
        if (d.n() != c.n())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = c1.s().getString(0x7f080235);
        obj2 = new Hashtable();
        aobj = c1.e().a(((Hashtable) (aobj)));
        flag1 = true;
_L1:
        Object obj1 = c1.k();
        if (flag1)
        {
            try
            {
                d = new ai(((JSONObject) (aobj)));
            }
            // Misplaced declaration of an exception variable
            catch (Object aobj[])
            {
                p.df.a.c("ChangeSettingsAsyncTask", "ChangeSettingsAsyncTask", ((Throwable) (aobj)));
            }
            p.df.a.a("ChangeSettingsAsyncTask", (new StringBuilder()).append("ChangeSettingsAsyncTask : user.changeSettings SUCCESS. Updating settings data with values from server --> ").append(d.toString()).toString());
            ((ag) (obj1)).a(d);
            if (flag)
            {
                c1.d().X();
            }
        } else
        {
            p.df.a.a("ChangeSettingsAsyncTask", (new StringBuilder()).append("ChangeSettingsAsyncTask : user.changeSettings FAILED. Restoring old settings data --> ").append(c.toString()).toString());
            ((ag) (obj1)).a(c);
        }
        a = new PandoraIntent("cmd_change_settings_result");
        a.putExtra("intent_success", flag1);
        if (flag1)
        {
            a.putExtra("intent_user_settings", d);
            if (d.p() != c.p())
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
            a.putExtra("facebook_auto_share_setting_changed", flag1);
            a.putExtra("show_toast", e);
            p.df.a.a("ChangeSettingsAsyncTask", (new StringBuilder()).append("ChangeSettingsAsyncTask : INTENT_SHOW_TOAST = ").append(e).toString());
            return null;
        } else
        {
            a.putExtra("intent_user_settings", c);
            a.putExtra("intent_message", ((String) (obj)));
            a.putExtra("intent_errors_map", ((java.io.Serializable) (obj2)));
            a.putExtra("intent_facebook_settings_changed", c.b(d));
            return null;
        }
        aobj;
        aobj = ((y) (aobj)).b();
        if (aobj == null)
        {
            break MISSING_BLOCK_LABEL_401;
        }
        obj1 = ((JSONObject) (aobj)).optString("message");
        aobj = ((JSONObject) (aobj)).optJSONObject("result");
        obj = obj1;
        if (aobj == null)
        {
            break MISSING_BLOCK_LABEL_401;
        }
        aobj = ((JSONObject) (aobj)).optJSONObject("fieldErrors");
        aobj = s.a(((JSONObject) (aobj)));
        obj2 = ((Object) (aobj));
        flag1 = false;
        aobj = null;
        obj = obj1;
          goto _L1
        aobj;
        p.df.a.c("ChangeSettingsAsyncTask", "ChangeSettingsAsyncTask error", ((Throwable) (aobj)));
        obj = obj1;
        aobj = null;
        flag1 = false;
          goto _L1
    }

    public h d()
    {
        return new h(c, d, e);
    }

    public void onPostExecute(Object obj)
    {
        a((Void)obj);
    }
}
