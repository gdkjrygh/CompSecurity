// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tealium.library;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONObject;

// Referenced classes of package com.tealium.library:
//            RemoteCommand, u, Tealium

final class K extends RemoteCommand
{

    private final Context a;
    private final Object b;
    private final Method c;
    private final SharedPreferences d;
    private final ConcurrentLinkedQueue e = new ConcurrentLinkedQueue();

    private K(Context context, Object obj, Method method, SharedPreferences sharedpreferences)
    {
        super("_push", "Register this device to receive Push events.");
        a = context.getApplicationContext();
        b = obj;
        c = method;
        d = sharedpreferences;
    }

    static K a(Context context, SharedPreferences sharedpreferences)
    {
        Class class1 = Class.forName("com.google.android.gms.common.e");
        Method method = class1.getMethod("isGooglePlayServicesAvailable", new Class[] {
            android/content/Context
        });
        Class class3 = Class.forName("com.google.android.gms.common.ConnectionResult");
        Field field = class3.getField("SUCCESS");
        int i = ((Integer)method.invoke(class1, new Object[] {
            context
        })).intValue();
        if (i == field.getInt(class3))
        {
            break MISSING_BLOCK_LABEL_96;
        }
        u.b(String.format(Locale.ROOT, "Unable to initialze Push capabilities, Google Play Services are unavailable. (%d)", new Object[] {
            Integer.valueOf(i)
        }));
        return null;
        if (context.checkCallingOrSelfPermission("android.permission.GET_ACCOUNTS") == 0 || android.os.Build.VERSION.SDK_INT >= 16)
        {
            break MISSING_BLOCK_LABEL_135;
        }
        u.e(String.format(Locale.ROOT, "Unable to create _push, missing %s", new Object[] {
            "android.permission.GET_ACCOUNTS"
        }));
        return null;
        String s = String.format(Locale.ROOT, "%s.permission.C2D_MESSAGE", new Object[] {
            context.getPackageName()
        });
        if (context.checkCallingOrSelfPermission(s) == 0)
        {
            break MISSING_BLOCK_LABEL_184;
        }
        u.e(String.format(Locale.ROOT, "Unable to create _push, missing %s", new Object[] {
            s
        }));
        return null;
        try
        {
            Class class2 = Class.forName("com.google.android.gms.gcm.GoogleCloudMessaging");
            context = new K(context, class2.getMethod("getInstance", new Class[] {
                android/content/Context
            }).invoke(class2, new Object[] {
                context
            }), class2.getMethod("register", new Class[] {
                [Ljava/lang/String;
            }), sharedpreferences);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            u.c("Unable to initialize Push capabilites, the Google Play Services Library is either not present, or an incompatible version.");
            return null;
        }
        return context;
    }

    static ConcurrentLinkedQueue a(K k)
    {
        return k.e;
    }

    static Object b(K k)
    {
        return k.b;
    }

    static Method c(K k)
    {
        return k.c;
    }

    static SharedPreferences d(K k)
    {
        return k.d;
    }

    protected final void onInvoke(RemoteCommand.Response response)
    {
        String s = response.getRequestPayload().optString("project_number", null);
        if (s == null)
        {
            u.d("Missing required argument \"project_number\" for Push Remote Command");
            response.setStatus(400).send();
        } else
        if (!e.contains(s))
        {
            String s2 = w.a.a(a);
            String s1 = String.format(Locale.ROOT, "push_token_%s_%s", new Object[] {
                s, s2
            });
            if (Tealium.getGlobalCustomData().getString("app_version", "").equals(s2))
            {
                String s3 = d.getString(s1, null);
                if (s3 != null)
                {
                    if (!s3.equals(Tealium.getGlobalCustomData().getString("device_push_token", null)))
                    {
                        Tealium.getGlobalCustomData().edit().putString("device_push_token", s3).commit();
                    }
                    response.setStatus(200).setBody(s3).send();
                    return;
                }
            }
            response = new _cls1(s, s1, response);
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                response.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
                return;
            } else
            {
                response.execute(new Void[0]);
                return;
            }
        }
    }

    private class _cls1 extends AsyncTask
    {

        private String a;
        private String b;
        private RemoteCommand.Response c;
        private K d;

        private transient Void a()
        {
            try
            {
                String s = a;
                s = (String)K.c(d).invoke(K.b(d), new Object[] {
                    new String[] {
                        s
                    }
                });
                K.d(d).edit().putString(b, s).commit();
                Tealium.getGlobalCustomData().edit().putString("device_push_token", s).commit();
                c.setStatus(200).setBody(s).send();
            }
            catch (Throwable throwable)
            {
                c.setStatus(555).setBody(G.a(throwable)).send();
                u.b(throwable);
            }
            return null;
        }

        protected final Object doInBackground(Object aobj[])
        {
            return a();
        }

        protected final void onPostExecute(Object obj)
        {
            super.onPostExecute((Void)obj);
            K.a(d).remove(a);
        }

        protected final void onPreExecute()
        {
            K.a(d).add(a);
            super.onPreExecute();
        }

        _cls1(String s, String s1, RemoteCommand.Response response)
        {
            d = K.this;
            a = s;
            b = s1;
            c = response;
            super();
        }
    }

}
