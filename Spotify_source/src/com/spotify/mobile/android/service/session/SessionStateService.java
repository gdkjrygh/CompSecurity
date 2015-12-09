// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service.session;

import an;
import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import da;
import dzs;
import ecy;
import ecz;
import eda;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

// Referenced classes of package com.spotify.mobile.android.service.session:
//            SessionState

public class SessionStateService extends Service
    implements an
{

    public Set a;
    public SessionState b;
    private final IBinder c = new ecz(this);
    private dzs d;

    public SessionStateService()
    {
        d = new dzs();
        a = new LinkedHashSet();
    }

    public final da a(Bundle bundle)
    {
        return new ecy(this);
    }

    public final void a()
    {
    }

    public final void a(Object obj)
    {
        obj = (SessionState)obj;
        if (obj != null)
        {
            boolean flag;
            if (!((SessionState) (obj)).equals(b))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            b = ((SessionState) (obj));
            if (flag)
            {
                for (obj = a.iterator(); ((Iterator) (obj)).hasNext(); ((eda)((Iterator) (obj)).next()).a(b)) { }
            }
        }
    }

    public IBinder onBind(Intent intent)
    {
        return c;
    }

    public void onCreate()
    {
        super.onCreate();
        d.a(this);
    }

    public void onDestroy()
    {
        d.a();
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        return 1;
    }

    public void onTaskRemoved(Intent intent)
    {
        super.onTaskRemoved(intent);
        stopSelf();
    }

    public boolean onUnbind(Intent intent)
    {
        a.clear();
        return true;
    }
}
