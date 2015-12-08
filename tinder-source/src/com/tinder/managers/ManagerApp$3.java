// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import android.app.NotificationManager;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.iid.a;
import com.google.android.gms.iid.e;
import com.tinder.a.d;
import com.tinder.a.f;
import com.tinder.b.l;
import com.tinder.enums.Environment;
import com.tinder.events.EventLoggedOut;
import com.tinder.f.ak;
import com.tinder.utils.m;
import com.tinder.utils.n;
import com.tinder.utils.v;
import de.greenrobot.event.c;
import java.io.File;
import java.io.IOException;
import java.util.Set;

// Referenced classes of package com.tinder.managers:
//            ManagerApp, d, ad, i, 
//            ae, ManagerNotifications, g

final class a extends AsyncTask
{

    final ManagerApp a;

    private transient Void a()
    {
        String s1;
        a a1;
        try
        {
            a1 = com.google.android.gms.iid.a.b(ManagerApp.o());
            Object obj = a1.a("465293127427", "GCM");
            n n1 = a.h;
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                obj = new d(3, (new StringBuilder()).append(n1.a.m).append('/').append(((String) (obj))).toString(), null, new com.tinder.utils.ng(n1), new com.tinder.utils.ng(n1), d.b());
                ManagerApp.b().a(((com.android.volley.Request) (obj)));
            }
        }
        catch (Exception exception)
        {
            v.a("delete instanceID failed ", exception);
            return null;
        }
        s1 = "*";
        if (Looper.getMainLooper() == Looper.myLooper())
        {
            throw new IOException("MAIN_THREAD");
        }
        Bundle bundle;
        a.c.b(a1.f, "*", "*");
        bundle = new Bundle();
        bundle.putString("sender", "*");
        bundle.putString("scope", "*");
        bundle.putString("subscription", "*");
        bundle.putString("delete", "1");
        bundle.putString("X-delete", "1");
        if (!"".equals(a1.f)) goto _L2; else goto _L1
_L1:
        String s = "*";
_L3:
        bundle.putString("subtype", s);
        if (!"".equals(a1.f))
        {
            break MISSING_BLOCK_LABEL_270;
        }
        s = s1;
_L4:
        bundle.putString("X-subtype", s);
        e.a(a.d.a(bundle, a1.a()));
        a1.b();
        return null;
_L2:
        s = a1.f;
          goto _L3
        s = a1.f;
          goto _L4
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a();
    }

    protected final void onPostExecute(Object obj)
    {
        int j = 0;
        a.l.b(false);
        obj = a.k;
        ((i) (obj)).m();
        ((i) (obj)).a.clear();
        ae.b.remove("LAST_ACTIVITY_DATE").commit();
        i.b(true);
        ManagerApp.p().o().b.cancelAll();
        obj = a.e;
        com.tinder.managers.d.a(null);
        obj = com.tinder.managers.ae.a.getString("ENVIRONMENT", Environment.PROD.name());
        String s = com.tinder.managers.ae.a.getString("KEY_SANDBOX", "");
        ae.b.clear();
        ae.b.putString("ENVIRONMENT", ((String) (obj)));
        ae.b.putString("KEY_SANDBOX", s);
        ae.b.commit();
        com.tinder.b.f.a();
        l.a().a.close();
        ManagerApp.p().j();
        (new StringBuilder("location after clear, lat: ")).append(ae.k()).append(" lon:").append(com.tinder.managers.ae.l());
        ManagerApp.p().l().f();
        obj = new File(a.getCacheDir().getParent());
        if (((File) (obj)).exists())
        {
            String as[] = ((File) (obj)).list();
            for (int k = as.length; j < k; j++)
            {
                String s1 = as[j];
                if (!s1.equals("lib") && !s1.equals(".Fabric") && !s1.equals("databases") && m.a(new File(((File) (obj)), s1)))
                {
                    (new StringBuilder("**************** File ")).append(obj).append('/').append(s1).append(" DELETED *******************");
                }
            }

        }
        l.a().b();
        com.tinder.managers.ManagerApp.a(a);
        ManagerApp.b(a);
        ManagerApp.h().c().c(new EventLoggedOut());
    }

    abase(ManagerApp managerapp)
    {
        a = managerapp;
        super();
    }
}
