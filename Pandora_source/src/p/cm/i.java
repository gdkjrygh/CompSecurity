// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cm;

import android.content.OperationApplicationException;
import android.os.RemoteException;
import android.support.v4.content.j;
import android.util.Pair;
import android.util.SparseArray;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.provider.b;
import com.pandora.radio.data.ac;
import com.pandora.radio.data.ai;
import com.pandora.radio.data.y;
import java.util.Hashtable;
import java.util.Vector;
import org.json.JSONException;
import p.cw.c;
import p.cx.h;
import p.cx.n;
import p.cx.q;
import p.cx.x;
import p.df.a;

// Referenced classes of package p.cm:
//            h

public class i extends p.cm.h
{

    private boolean a;
    private PandoraIntent c;
    private SparseArray d;

    public i(ai ai1, SparseArray sparsearray)
    {
        super(new ai(ai1), ai1, false);
        d = sparsearray;
        a = false;
    }

    public i(ai ai1, ai ai2)
    {
        super(ai1, ai2, false);
        a = true;
    }

    public i(ai ai1, y y1)
    {
        super(new ai(ai1), ai1, false);
        d = new SparseArray(1);
        d.put(0, new Pair(y1.c(), Boolean.valueOf(y1.J())));
        a = false;
    }

    private void a(Vector vector, String s, Boolean boolean1)
    {
        Hashtable hashtable = new Hashtable();
        hashtable.put("stationToken", s);
        hashtable.put("enableArtistAudioMessages", boolean1);
        vector.add(hashtable);
    }

    public void a(Void void1)
    {
        super.a(void1);
        if (c != null)
        {
            b.a.C().a(c);
        }
    }

    public Object b(Object aobj[])
        throws JSONException, q, p.cx.y, n, RemoteException, OperationApplicationException
    {
        return c(aobj);
    }

    public h b()
    {
        return e();
    }

    public transient Void c(Object aobj[])
        throws JSONException, q, p.cx.y, n, RemoteException, OperationApplicationException
    {
        Object obj = super.a().v();
        p.df.a.a("ChangeStationSettingsAsyncTask", "executing api task: globalArtistAudioMessageEnabledState=%s, stations=%s", new Object[] {
            obj, d
        });
        c c1 = b.a.b();
        if (obj == com.pandora.radio.data.ai.a.a)
        {
            throw new IllegalStateException("if artist audio messages are DISABLED, should not be triggering async task");
        }
        if (b.a.d() == null)
        {
            throw new IllegalStateException("User required, to check user artist message settings");
        }
        boolean flag;
        if (d != null && d.size() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (a)
        {
            super.c(aobj);
            boolean flag1;
            if (obj == com.pandora.radio.data.ai.a.c)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            p.df.a.c("ChangeStationSettingsAsyncTask", "Bulk Update stations - setArtistAudioMessagesEnabled to %s", new Object[] {
                Boolean.valueOf(flag1)
            });
            c1.y().a(flag1);
            return null;
        }
        if (obj == com.pandora.radio.data.ai.a.b && flag)
        {
            a().a(com.pandora.radio.data.ai.a.c);
            p.df.a.c("ChangeStationSettingsAsyncTask", "Updating global setting - setArtistAudioMessagesEnabled from ENABLED to TRUE");
        }
        super.c(aobj);
        aobj = c1.d().t();
        int k;
        if (aobj == null)
        {
            aobj = null;
        } else
        {
            aobj = ((y) (aobj)).c();
        }
        obj = new Vector();
        k = 0;
        flag = false;
        while (k < d.size()) 
        {
            Pair pair = (Pair)d.valueAt(k);
            if (((String)pair.first).equals(((Object) (aobj))) && !((Boolean)pair.second).booleanValue())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a(((Vector) (obj)), (String)pair.first, (Boolean)pair.second);
            k++;
        }
        c1.e().a(((Vector) (obj)));
        p.df.a.c("ChangeStationSettingsAsyncTask", "Updating in StationProvider.STATION_URI : enableArtistMessage perStation ");
        c1.y().a(d);
        if (flag)
        {
            c1.d().b(ac.c);
        }
        c = new PandoraIntent("cmd_change_per_station_settings_result");
        c.putExtra("intent_success", true);
        return null;
    }

    public p.cm.h d()
    {
        return e();
    }

    public i e()
    {
        Object obj = super.d();
        obj = new i(((p.cm.h) (obj)).c(), ((p.cm.h) (obj)).a());
        obj.a = a;
        obj.d = d;
        return ((i) (obj));
    }

    public void onPostExecute(Object obj)
    {
        a((Void)obj);
    }
}
