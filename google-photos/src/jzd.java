// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public final class jzd
    implements kae
{

    private final jzu a;

    public jzd(jzu jzu1)
    {
        a = jzu1;
    }

    private void a(kad kad1)
    {
        a.a(kad1);
        jyl jyl1 = a.a(kad1.e());
        if (!jyl1.j() && a.n.containsKey(kad1.e()))
        {
            kad1.c(new Status(17));
            return;
        } else
        {
            kad1.b(jyl1);
            return;
        }
    }

    public final jzb a(jzb jzb)
    {
        return b(jzb);
    }

    public final void a()
    {
        while (!a.f.isEmpty()) 
        {
            try
            {
                a((kad)a.f.remove());
            }
            catch (DeadObjectException deadobjectexception)
            {
                Log.w("GoogleApiClientConnected", "Service died while flushing queue", deadobjectexception);
            }
        }
    }

    public final void a(int i)
    {
        if (i == 1)
        {
            jzu jzu1 = a;
            if (!jzu1.g)
            {
                jzu1.g = true;
                if (jzu1.l == null)
                {
                    jzu1.l = new kab(jzu1);
                    IntentFilter intentfilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                    intentfilter.addDataScheme("package");
                    jzu1.d.getApplicationContext().registerReceiver(jzu1.l, intentfilter);
                }
                jzu1.j.sendMessageDelayed(jzu1.j.obtainMessage(1), jzu1.h);
                jzu1.j.sendMessageDelayed(jzu1.j.obtainMessage(2), jzu1.i);
            }
        }
        for (Iterator iterator = a.t.iterator(); iterator.hasNext(); ((kad)iterator.next()).b(new Status(8, "The connection to Google Play services was lost"))) { }
        a.a(null);
        a.c.a(i);
        a.c.a();
        if (i == 2)
        {
            a.b();
        }
    }

    public final void a(Bundle bundle)
    {
    }

    public final void a(ConnectionResult connectionresult, jyh jyh, int i)
    {
    }

    public final jzb b(jzb jzb)
    {
        try
        {
            a(jzb);
        }
        catch (DeadObjectException deadobjectexception)
        {
            a.a(new jze(this, this));
            return jzb;
        }
        return jzb;
    }

    public final void b()
    {
        a.n.clear();
        a.g();
        a.a(null);
        a.c.a();
    }

    public final void c()
    {
    }

    public final String d()
    {
        return "CONNECTED";
    }
}
