// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.hockeyapp.android.d.c;
import net.hockeyapp.android.d.g;
import net.hockeyapp.android.d.j;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

// Referenced classes of package net.hockeyapp.android:
//            a, c, l, d

public class b
{

    private static String a = null;
    private static String b = null;
    private static boolean c = false;
    private static final String d = "always_send_crash_reports";

    public b()
    {
    }

    public static int a(WeakReference weakreference)
    {
        Object obj;
        String as[];
        int i;
        i = 0;
        as = b();
        obj = null;
        if (as == null || as.length <= 0) goto _L2; else goto _L1
_L1:
        if (weakreference == null) goto _L4; else goto _L3
_L3:
        weakreference = (Context)weakreference.get();
        if (weakreference == null) goto _L4; else goto _L5
_L5:
        try
        {
            weakreference = Arrays.asList(weakreference.getSharedPreferences("HockeySDK", 0).getString("ConfirmedFilenames", "").split("\\|"));
        }
        // Misplaced declaration of an exception variable
        catch (WeakReference weakreference)
        {
            weakreference = obj;
        }
_L6:
        if (weakreference != null)
        {
            byte byte1 = 2;
            int k = as.length;
            do
            {
label0:
                {
                    byte byte0 = byte1;
                    if (i < k)
                    {
                        if (weakreference.contains(as[i]))
                        {
                            break label0;
                        }
                        byte0 = 1;
                    }
                    return byte0;
                }
                i++;
            } while (true);
        } else
        {
            return 1;
        }
_L4:
        weakreference = null;
        if (true) goto _L6; else goto _L2
_L2:
        return 0;
    }

    private static String a()
    {
        return (new StringBuilder()).append(b).append("api/2/apps/").append(a).append("/crashes/").toString();
    }

    private static String a(String as[], String s)
    {
        StringBuffer stringbuffer = new StringBuffer();
        for (int i = 0; i < as.length; i++)
        {
            stringbuffer.append(as[i]);
            if (i < as.length - 1)
            {
                stringbuffer.append(s);
            }
        }

        return stringbuffer.toString();
    }

    public static void a(Context context, String s)
    {
        a(context, "https://sdk.hockeyapp.net/", s, null);
    }

    public static void a(Context context, String s, String s1, net.hockeyapp.android.c c1)
    {
        a(context, s, s1, c1, false);
        a(context, c1);
    }

    private static void a(Context context, String s, String s1, net.hockeyapp.android.c c1, boolean flag)
    {
        if (context != null)
        {
            b = s;
            a = j.c(s1);
            net.hockeyapp.android.a.a(context);
            if (a == null)
            {
                a = a.d;
            }
            if (flag)
            {
                if (c1 != null && c1.b())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                e(new WeakReference(context), c1, Boolean.valueOf(flag).booleanValue());
            }
        }
    }

    public static void a(Context context, String s, net.hockeyapp.android.c c1)
    {
        a(context, "https://sdk.hockeyapp.net/", s, c1);
    }

    public static void a(Context context, net.hockeyapp.android.c c1)
    {
        Boolean boolean2;
        WeakReference weakreference;
        int i;
        boolean flag;
        if (c1 != null && c1.b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        boolean2 = Boolean.valueOf(flag);
        weakreference = new WeakReference(context);
        i = a(weakreference);
        if (i == 1)
        {
            context = PreferenceManager.getDefaultSharedPreferences(context);
            Boolean boolean1 = Boolean.valueOf(Boolean.valueOf(false).booleanValue() | context.getBoolean("always_send_crash_reports", false));
            context = boolean1;
            if (c1 != null)
            {
                context = Boolean.valueOf(Boolean.valueOf(boolean1.booleanValue() | c1.h()).booleanValue() | c1.g());
                c1.i();
            }
            if (!context.booleanValue())
            {
                c(weakreference, c1, boolean2.booleanValue());
                return;
            } else
            {
                d(weakreference, c1, boolean2.booleanValue());
                return;
            }
        }
        if (i == 2)
        {
            if (c1 != null)
            {
                c1.j();
            }
            d(weakreference, c1, boolean2.booleanValue());
            return;
        } else
        {
            e(weakreference, c1, boolean2.booleanValue());
            return;
        }
    }

    private static void a(WeakReference weakreference, String s)
    {
        if (weakreference != null)
        {
            weakreference = (Context)weakreference.get();
            if (weakreference != null)
            {
                weakreference.deleteFile(s);
                weakreference.deleteFile(s.replace(".stacktrace", ".user"));
                weakreference.deleteFile(s.replace(".stacktrace", ".contact"));
                weakreference.deleteFile(s.replace(".stacktrace", ".description"));
            }
        }
    }

    public static void a(WeakReference weakreference, net.hockeyapp.android.c c1)
    {
        String as[] = b();
        if (as == null || as.length <= 0) goto _L2; else goto _L1
_L1:
        Object obj;
        int i;
        Log.d("HockeyApp", (new StringBuilder()).append("Found ").append(as.length).append(" stacktrace(s).").toString());
        obj = Boolean.valueOf(false);
        i = 0;
_L3:
        Object obj3;
        if (i >= as.length)
        {
            break; /* Loop/switch isn't completed */
        }
        obj3 = as[i];
        String s = b(weakreference, ((String) (obj3)));
        Object obj1 = obj;
        if (s.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_328;
        }
        Log.d("HockeyApp", (new StringBuilder()).append("Transmitting crash data: \n").append(s).toString());
        obj1 = (DefaultHttpClient)net.hockeyapp.android.d.c.a().b();
        HttpPost httppost = new HttpPost(a());
        ArrayList arraylist = new ArrayList();
        arraylist.add(new BasicNameValuePair("raw", s));
        arraylist.add(new BasicNameValuePair("userID", b(weakreference, ((String) (obj3)).replace(".stacktrace", ".user"))));
        arraylist.add(new BasicNameValuePair("contact", b(weakreference, ((String) (obj3)).replace(".stacktrace", ".contact"))));
        arraylist.add(new BasicNameValuePair("description", b(weakreference, ((String) (obj3)).replace(".stacktrace", ".description"))));
        arraylist.add(new BasicNameValuePair("sdk", "HockeySDK"));
        arraylist.add(new BasicNameValuePair("sdk_version", "3.5.0"));
        httppost.setEntity(new UrlEncodedFormEntity(arraylist, "UTF-8"));
        ((DefaultHttpClient) (obj1)).execute(httppost);
        obj1 = Boolean.valueOf(true);
        if (((Boolean) (obj1)).booleanValue())
        {
            Log.d("HockeyApp", "Transmission succeeded");
            a(weakreference, as[i]);
            obj3 = obj1;
            if (c1 != null)
            {
                c1.k();
                obj3 = obj1;
            }
        } else
        {
            Log.d("HockeyApp", "Transmission failed, will retry on next register() call");
            obj3 = obj1;
            if (c1 != null)
            {
                c1.l();
                obj3 = obj1;
            }
        }
_L4:
        i++;
        obj = obj3;
        if (true) goto _L3; else goto _L2
        Object obj2;
        obj2;
        ((Exception) (obj2)).printStackTrace();
        if (((Boolean) (obj)).booleanValue())
        {
            Log.d("HockeyApp", "Transmission succeeded");
            a(weakreference, as[i]);
            obj3 = obj;
            if (c1 != null)
            {
                c1.k();
                obj3 = obj;
            }
        } else
        {
            Log.d("HockeyApp", "Transmission failed, will retry on next register() call");
            obj3 = obj;
            if (c1 != null)
            {
                c1.l();
                obj3 = obj;
            }
        }
          goto _L4
        obj2;
        if (!((Boolean) (obj)).booleanValue()) goto _L6; else goto _L5
_L5:
        Log.d("HockeyApp", "Transmission succeeded");
        a(weakreference, as[i]);
        if (c1 != null)
        {
            c1.k();
        }
_L7:
        throw obj2;
_L6:
        Log.d("HockeyApp", "Transmission failed, will retry on next register() call");
        if (c1 != null)
        {
            c1.l();
        }
        if (true) goto _L7; else goto _L2
_L2:
    }

    static void a(WeakReference weakreference, net.hockeyapp.android.c c1, boolean flag)
    {
        e(weakreference, c1, flag);
    }

    static boolean a(boolean flag)
    {
        c = flag;
        return flag;
    }

    private static String b(WeakReference weakreference, String s)
    {
        Object obj = null;
        if (weakreference == null) goto _L2; else goto _L1
_L1:
        weakreference = (Context)weakreference.get();
        if (weakreference == null) goto _L2; else goto _L3
_L3:
        StringBuilder stringbuilder = new StringBuilder();
        weakreference = new BufferedReader(new InputStreamReader(weakreference.openFileInput(s)));
_L7:
        s = weakreference;
        obj = weakreference.readLine();
        if (obj == null) goto _L5; else goto _L4
_L4:
        s = weakreference;
        stringbuilder.append(((String) (obj)));
        s = weakreference;
        stringbuilder.append(System.getProperty("line.separator"));
        if (true) goto _L7; else goto _L6
_L6:
        s;
_L13:
        if (weakreference != null)
        {
            try
            {
                weakreference.close();
            }
            // Misplaced declaration of an exception variable
            catch (WeakReference weakreference) { }
        }
_L8:
        return stringbuilder.toString();
_L5:
        if (weakreference != null)
        {
            try
            {
                weakreference.close();
            }
            // Misplaced declaration of an exception variable
            catch (WeakReference weakreference) { }
        }
          goto _L8
        obj;
        weakreference = null;
_L11:
        s = weakreference;
        ((IOException) (obj)).printStackTrace();
        if (weakreference != null)
        {
            try
            {
                weakreference.close();
            }
            // Misplaced declaration of an exception variable
            catch (WeakReference weakreference) { }
        }
          goto _L8
        weakreference;
        s = null;
_L10:
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        throw weakreference;
_L2:
        return null;
        weakreference;
        if (true) goto _L10; else goto _L9
_L9:
        obj;
          goto _L11
        weakreference;
        weakreference = ((WeakReference) (obj));
        if (true) goto _L13; else goto _L12
_L12:
    }

    public static void b(Context context, String s, String s1, net.hockeyapp.android.c c1)
    {
        a(context, s, s1, c1, true);
    }

    public static void b(Context context, String s, net.hockeyapp.android.c c1)
    {
        a(context, "https://sdk.hockeyapp.net/", s, c1, true);
    }

    public static void b(WeakReference weakreference)
    {
        String as[];
        int i;
        as = b();
        if (as == null || as.length <= 0)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        Log.d("HockeyApp", (new StringBuilder()).append("Found ").append(as.length).append(" stacktrace(s).").toString());
        i = 0;
_L3:
        if (i >= as.length) goto _L2; else goto _L1
_L1:
        if (weakreference == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        Context context;
        Log.d("HockeyApp", (new StringBuilder()).append("Delete stacktrace ").append(as[i]).append(".").toString());
        a(weakreference, as[i]);
        context = (Context)weakreference.get();
        if (context != null)
        {
            try
            {
                context.deleteFile(as[i]);
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
            }
        }
        i++;
          goto _L3
_L2:
    }

    static void b(WeakReference weakreference, net.hockeyapp.android.c c1, boolean flag)
    {
        d(weakreference, c1, flag);
    }

    private static String[] b()
    {
        if (a.a != null)
        {
            Log.d("HockeyApp", (new StringBuilder()).append("Looking for exceptions in: ").append(a.a).toString());
            File file = new File((new StringBuilder()).append(a.a).append("/").toString());
            if (!file.mkdir() && !file.exists())
            {
                return new String[0];
            } else
            {
                return file.list(new FilenameFilter() {

                    public boolean accept(File file1, String s)
                    {
                        return s.endsWith(".stacktrace");
                    }

                });
            }
        } else
        {
            Log.d("HockeyApp", "Can't search for exception as file path is null.");
            return null;
        }
    }

    private static void c(WeakReference weakreference)
    {
        Object obj;
        if (weakreference == null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        obj = (Context)weakreference.get();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        weakreference = b();
        obj = ((Context) (obj)).getSharedPreferences("HockeySDK", 0).edit();
        ((android.content.SharedPreferences.Editor) (obj)).putString("ConfirmedFilenames", a(weakreference, "|"));
        g.a(((android.content.SharedPreferences.Editor) (obj)));
        return;
        weakreference;
    }

    private static void c(WeakReference weakreference, net.hockeyapp.android.c c1, boolean flag)
    {
        Object obj = null;
        if (weakreference != null)
        {
            obj = (Context)weakreference.get();
        }
        if (obj == null)
        {
            return;
        } else
        {
            obj = new android.app.AlertDialog.Builder(((Context) (obj)));
            ((android.app.AlertDialog.Builder) (obj)).setTitle(l.a(c1, 0));
            ((android.app.AlertDialog.Builder) (obj)).setMessage(l.a(c1, 1));
            ((android.app.AlertDialog.Builder) (obj)).setNegativeButton(l.a(c1, 2), new android.content.DialogInterface.OnClickListener(c1, weakreference, flag) {

                final net.hockeyapp.android.c a;
                final WeakReference b;
                final boolean c;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    if (a != null)
                    {
                        a.m();
                    }
                    b.b(b);
                    b.a(b, a, c);
                }

            
            {
                a = c1;
                b = weakreference;
                c = flag;
                super();
            }
            });
            ((android.app.AlertDialog.Builder) (obj)).setNeutralButton(l.a(c1, 3), new android.content.DialogInterface.OnClickListener(weakreference, c1, flag) {

                final WeakReference a;
                final net.hockeyapp.android.c b;
                final boolean c;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    dialoginterface = null;
                    if (a != null)
                    {
                        dialoginterface = (Context)a.get();
                    }
                    if (dialoginterface == null)
                    {
                        return;
                    } else
                    {
                        PreferenceManager.getDefaultSharedPreferences(dialoginterface).edit().putBoolean("always_send_crash_reports", true).commit();
                        b.b(a, b, c);
                        return;
                    }
                }

            
            {
                a = weakreference;
                b = c1;
                c = flag;
                super();
            }
            });
            ((android.app.AlertDialog.Builder) (obj)).setPositiveButton(l.a(c1, 4), new android.content.DialogInterface.OnClickListener(weakreference, c1, flag) {

                final WeakReference a;
                final net.hockeyapp.android.c b;
                final boolean c;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    b.b(a, b, c);
                }

            
            {
                a = weakreference;
                b = c1;
                c = flag;
                super();
            }
            });
            ((android.app.AlertDialog.Builder) (obj)).create().show();
            return;
        }
    }

    private static void d(WeakReference weakreference, net.hockeyapp.android.c c1, boolean flag)
    {
        c(weakreference);
        e(weakreference, c1, flag);
        if (!c)
        {
            c = true;
            (new Thread(weakreference, c1) {

                final WeakReference a;
                final net.hockeyapp.android.c b;

                public void run()
                {
                    b.a(a, b);
                    b.a(false);
                }

            
            {
                a = weakreference;
                b = c1;
                super();
            }
            }).start();
        }
    }

    private static void e(WeakReference weakreference, net.hockeyapp.android.c c1, boolean flag)
    {
        if (a.b != null && a.d != null)
        {
            weakreference = Thread.getDefaultUncaughtExceptionHandler();
            if (weakreference != null)
            {
                Log.d("HockeyApp", (new StringBuilder()).append("Current handler class = ").append(weakreference.getClass().getName()).toString());
            }
            if (weakreference instanceof d)
            {
                ((d)weakreference).a(c1);
                return;
            } else
            {
                Thread.setDefaultUncaughtExceptionHandler(new d(weakreference, c1, flag));
                return;
            }
        } else
        {
            Log.d("HockeyApp", "Exception handler not set because version or package is null.");
            return;
        }
    }

    static 
    {
        c = false;
    }
}
