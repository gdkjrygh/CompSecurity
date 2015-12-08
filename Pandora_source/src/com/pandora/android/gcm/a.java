// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.gcm;

import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import com.pandora.android.provider.b;
import com.pandora.android.util.s;
import com.pandora.radio.data.ag;
import java.io.IOException;
import p.cw.c;
import p.dd.an;

// Referenced classes of package com.pandora.android.gcm:
//            b

public class com.pandora.android.gcm.a
{
    private static class a
    {

        public static com.pandora.android.gcm.a a = new com.pandora.android.gcm.a();

    }


    com.pandora.android.gcm.a()
    {
    }

    public static com.pandora.android.gcm.a a()
    {
        return a.a;
    }

    void a(Context context, String s1)
    {
        int i = f(context);
        p.df.a.a("RegistrationManager", (new StringBuilder()).append("Saving regId on app version ").append(i).toString());
        b.a.b().k().a(s1, i);
    }

    public boolean a(Context context)
    {
        p.df.a.a("RegistrationManager", "Checking GCM registration");
        if (TextUtils.isEmpty(e(context)))
        {
            p.df.a.a("RegistrationManager", "No GCM registration id found");
            if (!d(context))
            {
                p.df.a.a("RegistrationManager", "Play services not available");
                return false;
            }
            b(context);
        } else
        {
            p.df.a.a("RegistrationManager", "GCM already registered");
        }
        return true;
    }

    void b(Context context)
    {
        (new AsyncTask(context) {

            final Context a;
            final com.pandora.android.gcm.a b;

            protected transient Boolean a(Void avoid[])
            {
                try
                {
                    avoid = GoogleCloudMessaging.getInstance(a).register(new String[] {
                        "692639182113"
                    });
                    b.a(a, avoid);
                }
                // Misplaced declaration of an exception variable
                catch (Void avoid[])
                {
                    p.df.a.b("RegistrationManager", "Cannot obtain GCM registration id", avoid);
                    return Boolean.valueOf(false);
                }
                return Boolean.valueOf(true);
            }

            protected void a(Boolean boolean1)
            {
                if (boolean1.booleanValue())
                {
                    p.df.a.a("RegistrationManager", "GCM registered");
                    b.c(a);
                }
            }

            protected Object doInBackground(Object aobj[])
            {
                return a((Void[])aobj);
            }

            protected void onPostExecute(Object obj)
            {
                a((Boolean)obj);
            }

            
            {
                b = com.pandora.android.gcm.a.this;
                a = context;
                super();
            }
        }).execute(new Void[0]);
    }

    void c(Context context)
    {
        context = e(context);
        if (!s.a(context))
        {
            (new com.pandora.android.gcm.b()).execute(new Object[] {
                context
            });
            return;
        } else
        {
            p.df.a.e("RegistrationManager", "GCM registration id is empty.");
            return;
        }
    }

    public boolean d(Context context)
    {
        int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context);
        if (i != 0)
        {
            if (!GooglePlayServicesUtil.isUserRecoverableError(i));
            return false;
        } else
        {
            return true;
        }
    }

    public String e(Context context)
    {
        String s1 = b.a.b().k().k();
        if (TextUtils.isEmpty(s1))
        {
            context = null;
        } else
        {
            int i = f(context);
            context = s1;
            if (b.a.b().k().l() != i)
            {
                return "";
            }
        }
        return context;
    }

    int f(Context context)
    {
        int i;
        try
        {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new RuntimeException((new StringBuilder()).append("Could not get package name: ").append(context).toString());
        }
        return i;
    }

    public void onSignInState(an an1)
    {
        if (an1.b == p.cx.e.a.b)
        {
            a(b.a.h());
        } else
        if (an1.b == p.cx.e.a.d)
        {
            ((NotificationManager)b.a.h().getSystemService("notification")).cancelAll();
            return;
        }
    }
}
