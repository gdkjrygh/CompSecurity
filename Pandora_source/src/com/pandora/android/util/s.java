// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.Application;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug;
import android.os.Environment;
import android.os.StatFs;
import android.support.v4.content.j;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import android.widget.Toast;
import com.pandora.android.Main;
import com.pandora.android.activity.AndroidLinkActivity;
import com.pandora.android.activity.HomeTabsActivity;
import com.pandora.android.activity.ListeningTimeoutActivity;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.data.d;
import com.pandora.android.data.e;
import com.pandora.android.provider.b;
import com.pandora.android.tablet.TabletHome;
import com.pandora.radio.data.aa;
import com.pandora.radio.data.ag;
import com.pandora.radio.data.f;
import com.pandora.radio.data.y;
import com.pandora.radio.util.m;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Locale;
import java.util.Vector;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p.ce.a;
import p.cr.k;
import p.cx.ab;
import p.cx.p;
import p.dd.c;

// Referenced classes of package com.pandora.android.util:
//            r, p

public class s
{

    public static final Pattern a = Pattern.compile("[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}\\@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25})+");
    private static Boolean b;
    private static Boolean c;
    private static boolean d;
    private static boolean e;
    private static String f[] = {
        "", "K", "m", "b", "t"
    };

    public static float a(long l1)
    {
        return (float)TimeUnit.MILLISECONDS.toSeconds(l1);
    }

    public static int a(float f1)
    {
        return Math.round(t().density * f1);
    }

    public static AlertDialog a(Context context, String s1, Intent intent)
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(context);
        builder.setMessage(s1).setCancelable(true).setNeutralButton(context.getString(0x7f0801f5), new android.content.DialogInterface.OnClickListener(intent) {

            final Intent a;

            public void onClick(DialogInterface dialoginterface, int i1)
            {
                b.a.C().a(a);
                dialoginterface.cancel();
            }

            
            {
                a = intent;
                super();
            }
        });
        context = builder.create();
        context.show();
        return context;
    }

    public static AlertDialog a(Context context, String s1, boolean flag)
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(context);
        builder.setMessage(s1).setCancelable(flag).setNeutralButton(context.getString(0x7f0801f5), new android.content.DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialoginterface, int i1)
            {
                dialoginterface.cancel();
                b.a.C().a(new PandoraIntent("user_acknowledged_error"));
            }

        });
        context = builder.create();
        context.show();
        return context;
    }

    public static String a(Context context, long l1)
    {
        l1 = (long)Math.floor(l1 / 1000L);
        if (l1 > 0x1e13380L)
        {
            return context.getString(0x7f080145, new Object[] {
                Long.valueOf(l1 / 0x1e13380L)
            });
        }
        if (l1 > 0x278d00L)
        {
            return context.getString(0x7f080143, new Object[] {
                Long.valueOf(l1 / 0x278d00L)
            });
        }
        if (l1 > 0x93a80L)
        {
            return context.getString(0x7f080144, new Object[] {
                Long.valueOf(l1 / 0x93a80L)
            });
        }
        if (l1 > 0x15180L)
        {
            return context.getString(0x7f080140, new Object[] {
                Long.valueOf(l1 / 0x15180L)
            });
        }
        if (l1 > 3600L)
        {
            return context.getString(0x7f080141, new Object[] {
                Long.valueOf(l1 / 3600L)
            });
        } else
        {
            return context.getString(0x7f080142, new Object[] {
                Long.valueOf(l1 / 60L)
            });
        }
    }

    public static String a(CharSequence charsequence)
    {
        if (charsequence == null)
        {
            return null;
        } else
        {
            return charsequence.toString();
        }
    }

    public static transient String a(String s1, long al[])
    {
        StringBuilder stringbuilder = new StringBuilder();
        int j1 = al.length;
        boolean flag = true;
        for (int i1 = 0; i1 < j1;)
        {
            long l1 = al[i1];
            if (!flag)
            {
                stringbuilder.append(s1);
            }
            stringbuilder.append(l1);
            i1++;
            flag = false;
        }

        return stringbuilder.toString();
    }

    public static Hashtable a(JSONObject jsonobject)
        throws JSONException
    {
        Hashtable hashtable = new Hashtable();
        for (Iterator iterator = jsonobject.keys(); iterator.hasNext();)
        {
            String s1 = (String)iterator.next();
            Object obj = jsonobject.get(s1);
            if (obj instanceof JSONObject)
            {
                hashtable.put(s1, a((JSONObject)obj));
            } else
            if (obj instanceof JSONArray)
            {
                obj = (JSONArray)obj;
                Vector vector = new Vector(((JSONArray) (obj)).length());
                int i1 = 0;
                while (i1 < ((JSONArray) (obj)).length()) 
                {
                    Object obj1 = ((JSONArray) (obj)).get(i1);
                    if (obj1 instanceof JSONObject)
                    {
                        vector.add(a((JSONObject)obj1));
                    } else
                    {
                        vector.add(obj1);
                    }
                    i1++;
                }
                hashtable.put(s1, vector);
            } else
            {
                hashtable.put(s1, obj);
            }
        }

        return hashtable;
    }

    public static void a()
    {
        b b1;
label0:
        {
            b1 = b.a;
            if (b1.o())
            {
                if (b1.q() != 1039)
                {
                    break label0;
                }
                b.a.b().a(new c(1039));
            }
            return;
        }
        if (b1.r())
        {
            a(b1.p(), ((Intent) (new PandoraIntent("cmd_shutdown"))));
            return;
        } else
        {
            f(b1.p());
            return;
        }
    }

    public static void a(int i1)
    {
        h(b.a.h().getString(i1));
    }

    public static void a(Activity activity, Intent intent)
    {
        View view = LayoutInflater.from(activity).inflate(0x7f04004f, null);
        ((TextView)view.findViewById(0x7f100159)).setText(d.a);
        ((TextView)view.findViewById(0x7f10015a)).setText(d.b);
        ((TextView)view.findViewById(0x7f10015b)).setText(d.c);
        ((TextView)view.findViewById(0x7f10015c)).setText(d.d);
        ((TextView)view.findViewById(0x7f10015d)).setText(d.e);
        ((TextView)view.findViewById(0x7f10015e)).setText(d.f);
        ((TextView)view.findViewById(0x7f10015f)).setText(d.g);
        ((TextView)view.findViewById(0x7f100160)).setText(d.i);
        ((TextView)view.findViewById(0x7f100161)).setText(d.h);
        ((TextView)view.findViewById(0x7f100162)).setText(d.k);
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(activity);
        builder.setCancelable(true).setNeutralButton(activity.getString(0x7f0801f5), new android.content.DialogInterface.OnClickListener(intent) {

            final Intent a;

            public void onClick(DialogInterface dialoginterface, int i1)
            {
                dialoginterface.cancel();
                b.a.C().a(a);
            }

            
            {
                a = intent;
                super();
            }
        }).setView(view);
        builder.create().show();
    }

    public static void a(Activity activity, String s1, Class class1, int i1, Bundle bundle)
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(activity);
        builder.setMessage(s1).setCancelable(true).setNeutralButton(activity.getString(0x7f0801f5), new android.content.DialogInterface.OnClickListener(activity, class1, i1, bundle) {

            final Activity a;
            final Class b;
            final int c;
            final Bundle d;

            public void onClick(DialogInterface dialoginterface, int j1)
            {
                com.pandora.android.activity.c.a().a(a, b, c, d);
                dialoginterface.cancel();
            }

            
            {
                a = activity;
                b = class1;
                c = i1;
                d = bundle;
                super();
            }
        });
        builder.create().show();
    }

    public static void a(Context context)
    {
        ag ag1 = b.a.b().k();
        if (!ag1.M())
        {
            String s1 = context.getString(0x7f0801c2);
            (new android.app.AlertDialog.Builder(context)).setMessage(s1).setCancelable(false).setNegativeButton(0x7f0801ed, null).setPositiveButton(0x7f080097, new android.content.DialogInterface.OnClickListener(ag1) {

                final ag a;

                public void onClick(DialogInterface dialoginterface, int i1)
                {
                    a.i(true);
                    ab.a().a(p.ce.a.a());
                }

            
            {
                a = ag1;
                super();
            }
            }).create().show();
            ag1.h(true);
        } else
        if (!ag1.O() && ag1.N())
        {
            context = p.ce.a.a();
            if (!context.c())
            {
                ab.a().a(context);
                return;
            }
        }
    }

    public static void a(Context context, int i1)
    {
        a(context, context.getString(i1));
    }

    private static void a(Context context, int i1, int j1, boolean flag, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(context);
        builder.setMessage(context.getResources().getString(i1)).setCancelable(flag).setNeutralButton(context.getString(j1), new android.content.DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialoginterface, int k1)
            {
                dialoginterface.cancel();
            }

        });
        builder.setOnCancelListener(oncancellistener);
        builder.create().show();
    }

    public static void a(Context context, int i1, boolean flag)
    {
        a(context, context.getString(i1), flag);
    }

    public static void a(Context context, Intent intent)
    {
        String s1;
        if (p.df.a.a())
        {
            s1 = "off";
        } else
        {
            s1 = "on";
        }
        s1 = String.format("%s\nModel: %s. \n\nTurn %s diagnostic logging?", new Object[] {
            String.format("version: %s %s", new Object[] {
                b.a.i(), b.a.k()
            }), b.a.b().l().c(), s1
        });
        context = (new android.app.AlertDialog.Builder(context)).setMessage(s1).setCancelable(true).setNegativeButton(0x7f0800c3, null).setPositiveButton(0x7f0801f5, new android.content.DialogInterface.OnClickListener(context) {

            final Context a;

            public void onClick(DialogInterface dialoginterface, int i1)
            {
                s.h(a);
            }

            
            {
                a = context;
                super();
            }
        }).create();
        context.setOnDismissListener(new android.content.DialogInterface.OnDismissListener(intent) {

            final Intent a;

            public void onDismiss(DialogInterface dialoginterface)
            {
                if (a != null)
                {
                    b.a.C().a(a);
                }
            }

            
            {
                a = intent;
                super();
            }
        });
        context.show();
    }

    public static void a(Context context, View view)
    {
        ((InputMethodManager)context.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static void a(Context context, String s1)
    {
        Toast.makeText(context, s1, 1).show();
    }

    public static void a(Context context, String s1, String s2, Intent intent)
    {
        intent = new android.content.DialogInterface.OnClickListener(context, intent) {

            final Context a;
            final Intent b;

            public void onClick(DialogInterface dialoginterface, int i1)
            {
                switch (i1)
                {
                default:
                    return;

                case -1: 
                    a.startActivity(b);
                    break;
                }
            }

            
            {
                a = context;
                b = intent;
                super();
            }
        };
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(context);
        builder.setTitle(s1);
        builder.setMessage(s2);
        builder.setPositiveButton(context.getString(0x7f080295), intent).setNegativeButton(context.getString(0x7f0801e6), intent);
        builder.create().show();
    }

    public static void a(View view, float f1)
    {
        view.setAlpha(f1);
    }

    public static void a(View view, boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = 2;
        } else
        {
            byte0 = 1;
        }
        view.setLayerType(byte0, null);
    }

    public static void a(String s1, Intent intent)
    {
        PandoraIntent pandoraintent = new PandoraIntent("api_error");
        pandoraintent.putExtra("intent_message", s1);
        if (intent != null)
        {
            pandoraintent.putExtra("intent_followon_intent", intent);
        }
        b.a.C().a(pandoraintent);
    }

    public static void a(String s1, String s2)
    {
        Object obj = null;
        Application application = b.a.h();
        m m1 = new m(b.a.i());
        String s3;
        String s4;
        ag ag1;
        if (d)
        {
            s3 = s1;
        } else
        {
            s3 = s2;
        }
        p.df.a.c("PandoraUtil", (new StringBuilder()).append("saving amazon, google update versions =>").append(s1).append(", ").append(s2).toString());
        ag1 = b.a.b().k();
        s4 = s1;
        if (a(s1))
        {
            s4 = null;
        }
        ag1.a(s4);
        if (a(s2))
        {
            s1 = obj;
        } else
        {
            s1 = s2;
        }
        ag1.b(s1);
        if (s3 != null)
        {
            if (m1.a(new m(s3)) < 0)
            {
                p.df.a.c("PandoraUtil", "update prompt is enabled");
                ag1.a(true);
                if (!ag1.b())
                {
                    s1 = (NotificationManager)application.getSystemService("notification");
                    s2 = PendingIntent.getActivity(application, 0, c(application), 0);
                    s3 = application.getString(0x7f08009e);
                    String s5 = application.getString(0x7f080284);
                    Notification notification = new Notification(0x7f02022b, s3, System.currentTimeMillis());
                    notification.flags = notification.flags | 0x10;
                    notification.setLatestEventInfo(application, s3, s5, s2);
                    s1.notify(211, notification);
                    ag1.b(true);
                }
                return;
            } else
            {
                j(application);
                return;
            }
        } else
        {
            j(application);
            return;
        }
    }

    public static boolean a(Activity activity)
    {
        boolean flag = false;
        if ((activity instanceof HomeTabsActivity) ? !(((HomeTabsActivity)activity).ai() instanceof p.ca.ab) : !(activity instanceof TabletHome))
        {
            flag = true;
        }
        if (m())
        {
            p.df.a.c("PandoraUtil", (new StringBuilder()).append("AmazonInAppPurchasing needRestoreDialog: ").append(flag).toString());
            return flag;
        } else
        {
            p.df.a.c("GoogleInApp", (new StringBuilder()).append("needRestoreDialog: ").append(flag).toString());
            return flag;
        }
    }

    public static boolean a(String s1)
    {
        return TextUtils.isEmpty(s1) || s1.trim().length() == 0;
    }

    public static boolean a(String s1, long l1, String s2)
    {
        boolean flag = false;
        if (!a(s1))
        {
            boolean flag1 = p.cr.k.a(Uri.parse(s1));
            flag = flag1;
            if (!flag1)
            {
                PandoraIntent pandoraintent = new PandoraIntent("launch_pandora_browser");
                pandoraintent.putExtra("intent_uri", s1);
                if (!a(s2))
                {
                    pandoraintent.putExtra("intent_title", s2);
                }
                if (l1 > 0L)
                {
                    pandoraintent.putExtra("intent_artist_msg_id", l1);
                }
                b.a.C().a(pandoraintent);
                return true;
            }
        }
        return flag;
    }

    public static String[] a(Context context, aa aa1, String s1, String s2, String s3)
    {
        Object obj;
        if (aa1.M())
        {
            aa1 = s1;
            if (a(s1))
            {
                aa1 = context.getString(0x7f08007d);
            }
            s1 = s2;
            if (a(s2))
            {
                s1 = context.getString(0x7f08028d);
            }
            s2 = aa1;
            obj = s1;
            context = s3;
            if (a(s3))
            {
                context = "";
                obj = s1;
                s2 = aa1;
            }
        } else
        {
            obj = context.getString(0x7f08027f);
            context = s1;
            if (a(s1))
            {
                context = ((Context) (obj));
            }
            aa1 = s2;
            if (a(s2))
            {
                aa1 = ((aa) (obj));
            }
            if (!a(s3))
            {
                obj = s3;
            }
            s1 = ((String) (obj));
            s2 = context;
            obj = aa1;
            context = s1;
        }
        return (new String[] {
            s2, obj, context
        });
    }

    public static int b(int i1)
    {
        return Math.round((float)i1 / t().density);
    }

    public static AlertDialog b(Context context, String s1)
    {
        return (new android.app.AlertDialog.Builder(context)).setTitle(0x7f0800b3).setCancelable(false).setMessage(String.format(context.getResources().getString(0x7f0800b1), new Object[] {
            s1
        })).setPositiveButton(0x7f0800b2, new android.content.DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialoginterface, int i1)
            {
                dialoginterface = b.a;
                dialoginterface.b().d().a(p.cw.b.c.a);
                dialoginterface.b().o().e("resume");
            }

        }).setNegativeButton(0x7f0800b0, new android.content.DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialoginterface, int i1)
            {
                dialoginterface = b.a;
                dialoginterface.b().G().c();
                dialoginterface.b().o().e("cancel");
            }

        }).create();
    }

    public static Intent b(Context context)
    {
        if (b.a.b().C())
        {
            return new Intent(context, com/pandora/android/activity/AndroidLinkActivity);
        } else
        {
            context = context.getPackageManager().getLaunchIntentForPackage("com.pandora.android");
            context.addCategory("android.intent.category.LAUNCHER");
            context.setAction("android.intent.action.MAIN");
            return context;
        }
    }

    public static CharSequence b(CharSequence charsequence)
    {
        if (charsequence == null)
        {
            return "";
        }
        int i1;
        for (i1 = charsequence.length() - 1; i1 >= 0 && Character.isWhitespace(charsequence.charAt(i1)); i1--) { }
        return charsequence.subSequence(0, i1 + 1);
    }

    public static String b(Context context, int i1)
    {
        BufferedReader bufferedreader;
        InputStream inputstream;
        String s1;
        try
        {
            inputstream = context.getResources().openRawResource(i1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            p.df.a.c("PandoraUtil", (new StringBuilder()).append("loadRawResourceAsString error ").append(context).toString());
            return null;
        }
        if (inputstream != null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        p.df.a.c("PandoraUtil", "loadRawResourceAsString - could not find res/raw resourceId");
        return null;
        context = new StringBuffer(inputstream.available());
        bufferedreader = new BufferedReader(new InputStreamReader(inputstream));
_L3:
        s1 = bufferedreader.readLine();
        if (s1 == null) goto _L2; else goto _L1
_L1:
        context.append(s1);
        context.append(" \n");
          goto _L3
        context;
_L5:
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        inputstream.close();
        if (bufferedreader == null)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        bufferedreader.close();
        throw context;
_L2:
        context = context.toString();
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_142;
        }
        inputstream.close();
        if (bufferedreader == null)
        {
            break MISSING_BLOCK_LABEL_150;
        }
        bufferedreader.close();
        return context;
        context;
        bufferedreader = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static String b(String s1)
    {
        String s2;
        try
        {
            s2 = URLEncoder.encode(s1, "utf-8");
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            p.df.a.c("PandoraUtil", "Exception during url encode", unsupportedencodingexception);
            return s1;
        }
        return s2;
    }

    public static void b()
    {
        ((NotificationManager)b.a.h().getSystemService("notification")).cancel(212);
    }

    public static Intent c(Context context)
    {
        context = context.getPackageName();
        if (d)
        {
            return new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder()).append("http://www.amazon.com/gp/mas/dl/android?p=").append(context).toString()));
        } else
        {
            return new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder()).append("http://market.android.com/details?id=").append(context).toString()));
        }
    }

    public static String c(int i1)
    {
        if (i1 <= 999)
        {
            return Integer.toString(i1);
        }
        double d1 = i1;
        int j1;
        for (j1 = 1; (double)i1 / Math.pow(1000D, j1) > 999D; j1++) { }
        int k1 = (int)((double)i1 / Math.pow(1000D, j1));
        i1 = (int)(((double)i1 - (double)k1 * Math.pow(1000D, j1)) / Math.pow(100D, j1));
        if (i1 > 0)
        {
            return String.format("%s.%1d%s", new Object[] {
                Integer.valueOf(k1), Integer.valueOf(i1), f[j1]
            });
        } else
        {
            return String.format("%s%s", new Object[] {
                Integer.valueOf(k1), f[j1]
            });
        }
    }

    public static String c(String s1)
    {
        String s2 = s1;
        if (s1 != null)
        {
            try
            {
                s2 = URLDecoder.decode(s1, "utf-8");
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                p.df.a.c("PandoraUtil", (new StringBuilder()).append("Exception during url decode of: ").append(s1).toString(), illegalargumentexception);
                return s1;
            }
            catch (UnsupportedEncodingException unsupportedencodingexception)
            {
                p.df.a.c("PandoraUtil", (new StringBuilder()).append("Exception during url decode of: ").append(s1).toString(), unsupportedencodingexception);
                return s1;
            }
        }
        return s2;
    }

    public static void c()
    {
        if (b.a.b().z().b())
        {
            w();
            return;
        } else
        {
            d();
            return;
        }
    }

    public static String d(int i1)
    {
        return b.a.h().getString(i1);
    }

    public static String d(String s1)
    {
        String s2 = s1;
        if (s1 == null)
        {
            s2 = "";
        }
        return s2;
    }

    public static void d()
    {
        ((NotificationManager)b.a.h().getSystemService("notification")).cancel(1);
    }

    public static void d(Context context)
    {
        a(context, 0x7f0801ea, 0x7f0801f5, true, y());
    }

    private static String e(int i1)
    {
        PandoraIntent pandoraintent = new PandoraIntent("show_waiting");
        String s1 = b.a.h().getResources().getString(i1);
        pandoraintent.putExtra("intent_waiting_msg", s1);
        b.a.C().a(pandoraintent);
        return s1;
    }

    public static void e()
    {
        Application application = b.a.h();
        NotificationManager notificationmanager = (NotificationManager)application.getSystemService("notification");
        Notification notification = new Notification();
        notification.when = System.currentTimeMillis();
        notification.flags = notification.flags | 2;
        notification.icon = 0x7f02022b;
        Object obj = b(application);
        ((Intent) (obj)).setFlags(0x20000000);
        PendingIntent pendingintent = PendingIntent.getActivity(application, 0, ((Intent) (obj)), 0);
        obj = b.a.b().d().t();
        if (obj == null)
        {
            obj = application.getString(0x7f0800b5);
        } else
        {
            obj = ((y) (obj)).d();
            obj = String.format(application.getString(0x7f0800b4), new Object[] {
                obj
            });
        }
        notification.setLatestEventInfo(application, ((CharSequence) (obj)), application.getString(0x7f0800b6), pendingintent);
        notificationmanager.notify(300, notification);
    }

    public static void e(Context context)
    {
        a(context, 0x7f08026b, 0x7f0801f5, true, y());
    }

    public static void e(String s1)
    {
        PandoraIntent pandoraintent = new PandoraIntent("show_ok_dialog");
        pandoraintent.putExtra("intent_message", s1);
        b.a.C().a(pandoraintent);
    }

    public static void f()
    {
        ((NotificationManager)b.a.h().getSystemService("notification")).cancel(300);
    }

    public static void f(Context context)
    {
        a(context, 0x7f0801f8, 0x7f0801f5, true, y());
    }

    public static void f(String s1)
    {
        a(s1, ((Intent) (null)));
    }

    public static String g()
    {
        return e(0x7f08024e);
    }

    public static String g(String s1)
    {
        b b1 = b.a;
        String s2;
        if (q())
        {
            s2 = "beta";
        } else
        {
            s2 = "prod";
        }
        return String.format("Pandora App Version: %s (%s, %s)%scode = %d%slocale = %s%sbrand = %s%smodel = %s%sproduct = %s%smanufacturer = %s%sname = %s%sbuildType = %s", new Object[] {
            b1.i(), s2, "6.3RC4-0-gf147bcb", s1, Integer.valueOf(b1.j()), s1, com.pandora.android.util.r.c(), s1, Build.BRAND, s1, 
            b1.b().l().c(), s1, Build.PRODUCT, s1, Build.MANUFACTURER, s1, Build.MODEL, s1, d.k
        });
    }

    public static void g(Context context)
    {
        p.df.a.a("PandoraUtil", "Attempting to auto-start Pandora mobile application");
        Intent intent = new Intent(context, com/pandora/android/Main);
        intent.setAction("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.addFlags(0x10000000);
        context.startActivity(intent);
    }

    public static String h()
    {
        return e(0x7f0801c0);
    }

    static void h(Context context)
    {
        i(context);
    }

    public static void h(String s1)
    {
        PandoraIntent pandoraintent = new PandoraIntent("send_toast");
        pandoraintent.putExtra("intent_toast_message", s1);
        b.a.C().a(pandoraintent);
    }

    public static String i()
    {
        return e(0x7f080288);
    }

    private static void i(Context context)
    {
        Object obj = new e(b.a.h());
        com.pandora.radio.provider.f f1 = b.a.b().x();
        if (p.df.a.a())
        {
            f1.a("DEBUG_LOGGING", Boolean.valueOf(false));
            p.df.a.a(false);
            ((e) (obj)).b(false);
            obj = "Diagnostic logging disabled";
        } else
        {
            p.df.a.a(true);
            ((e) (obj)).b(true);
            f1.a("DEBUG_LOGGING", Boolean.valueOf(true));
            obj = "Diagnostic logging enabled";
        }
        (new android.app.AlertDialog.Builder(context)).setMessage(((CharSequence) (obj))).setCancelable(false).setNeutralButton(0x7f0801f5, new android.content.DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialoginterface, int i1)
            {
                dialoginterface.cancel();
            }

        }).create().show();
    }

    public static void i(String s1)
    {
        Application application = b.a.h();
        Intent intent = (new Intent(application, com/pandora/android/activity/HomeTabsActivity)).putExtra("intent_page_name", p.t).setFlags(0x24000000);
        Notification notification = new Notification();
        notification.when = 0L;
        notification.flags = notification.flags | 0x10;
        notification.icon = 0x7f0200ea;
        notification.setLatestEventInfo(application, application.getString(0x7f08021b), s1, PendingIntent.getActivity(application, 0, intent, 0));
        ((NotificationManager)application.getSystemService("notification")).notify(212, notification);
    }

    public static String j()
    {
        return e(0x7f080133);
    }

    private static void j(Context context)
    {
        p.df.a.c("PandoraUtil", "update prompt is disabled");
        ag ag1 = b.a.b().k();
        ag1.a(false);
        ag1.b(false);
        ((NotificationManager)context.getSystemService("notification")).cancel(211);
    }

    public static boolean j(String s1)
    {
        return a.matcher(s1).matches();
    }

    public static void k()
    {
        b.a.C().a(new PandoraIntent("hide_waiting"));
    }

    public static void k(String s1)
    {
        Object obj = new android.os.Debug.MemoryInfo();
        Debug.getMemoryInfo(((android.os.Debug.MemoryInfo) (obj)));
        Object obj1 = Double.valueOf(1048576D);
        Object obj2 = Double.valueOf(1024D);
        double d1 = (double)((android.os.Debug.MemoryInfo) (obj)).getTotalPss() / ((Double) (obj2)).doubleValue();
        double d2 = (double)((android.os.Debug.MemoryInfo) (obj)).getTotalSharedDirty() / ((Double) (obj2)).doubleValue();
        double d3 = (double)((android.os.Debug.MemoryInfo) (obj)).getTotalSharedDirty() / ((Double) (obj2)).doubleValue();
        int i1 = ((ActivityManager)b.a.h().getSystemService("activity")).getMemoryClass();
        double d4 = (double)Debug.getNativeHeapAllocatedSize() / ((Double) (obj1)).doubleValue();
        double d5 = (double)Debug.getNativeHeapSize() / ((Double) (obj1)).doubleValue();
        double d6 = (double)Debug.getNativeHeapFreeSize() / ((Double) (obj1)).doubleValue();
        double d7 = (double)Runtime.getRuntime().totalMemory() / ((Double) (obj1)).doubleValue();
        double d8 = (double)Runtime.getRuntime().maxMemory() / ((Double) (obj1)).doubleValue();
        double d9 = (double)Runtime.getRuntime().freeMemory() / ((Double) (obj1)).doubleValue();
        obj2 = new DecimalFormat();
        ((DecimalFormat) (obj2)).setMaximumFractionDigits(2);
        ((DecimalFormat) (obj2)).setMinimumFractionDigits(2);
        obj = String.format((new StringBuilder()).append("pss = ").append(((DecimalFormat) (obj2)).format(Double.valueOf(d1))).append(" MB, tpd = ").append(((DecimalFormat) (obj2)).format(Double.valueOf(d2))).append(" s = ").append(((DecimalFormat) (obj2)).format(Double.valueOf(d3))).append(" MB. mc= ").append(i1).append(" MB").toString(), new Object[0]);
        obj1 = String.format((new StringBuilder()).append("NH: alloc = ").append(((DecimalFormat) (obj2)).format(Double.valueOf(d4))).append(" MB, avail = ").append(((DecimalFormat) (obj2)).format(Double.valueOf(d5))).append(" MB, free = ").append(((DecimalFormat) (obj2)).format(Double.valueOf(d6))).append(" MB").toString(), new Object[0]);
        obj2 = String.format((new StringBuilder()).append("RT: alloc = ").append(((DecimalFormat) (obj2)).format(Double.valueOf(d7))).append(" MB, avail = ").append(((DecimalFormat) (obj2)).format(Double.valueOf(d8))).append(" MB, free = ").append(((DecimalFormat) (obj2)).format(Double.valueOf(d9))).append(" MB").toString(), new Object[0]);
        p.df.a.c("PandoraUtil", "debugMemory ---");
        p.df.a.c("PandoraUtil", (new StringBuilder()).append("").append(s1).append(" debugMemory ").append(((String) (obj))).toString());
        p.df.a.c("PandoraUtil", (new StringBuilder()).append("").append(s1).append(" debugMemory ").append(((String) (obj1))).toString());
        p.df.a.c("PandoraUtil", (new StringBuilder()).append("").append(s1).append(" debugMemory ").append(((String) (obj2))).toString());
        p.df.a.c("PandoraUtil", (new StringBuilder()).append("").append(s1).append(" debugMemory ").append("Internal Storage = ").append(x()).toString());
        p.df.a.c("PandoraUtil", "debugMemory ---");
    }

    public static boolean l()
    {
        return !com.pandora.android.provider.b.a() || b.a.d() == null || !b.a.g();
    }

    public static boolean l(String s1)
    {
        boolean flag = false;
        if (!a(s1))
        {
            boolean flag1 = p.cr.k.a(Uri.parse(s1));
            flag = flag1;
            if (!flag1)
            {
                PandoraIntent pandoraintent = new PandoraIntent("launch_pandora_browser");
                pandoraintent.putExtra("intent_uri", s1);
                b.a.C().a(pandoraintent);
                return true;
            }
        }
        return flag;
    }

    public static boolean m()
    {
        return d;
    }

    public static boolean n()
    {
        return e;
    }

    public static String o()
    {
        String s1;
        try
        {
            s1 = (new URL(d.a)).getHost();
            s1 = s1.substring(0, s1.indexOf(".")).toUpperCase(Locale.US);
        }
        catch (MalformedURLException malformedurlexception)
        {
            malformedurlexception.printStackTrace();
            return "";
        }
        return s1;
    }

    public static boolean p()
    {
        if (b == null)
        {
            b = Boolean.valueOf(d.a.contains("tuner.pandora.com"));
        }
        return b.booleanValue();
    }

    public static boolean q()
    {
        if (c == null)
        {
            c = Boolean.valueOf(d.a.contains("beta"));
        }
        return c.booleanValue();
    }

    public static Intent r()
    {
        Intent intent = b.a.b(new Intent());
        Object obj = intent;
        if (intent == null)
        {
            obj = new PandoraIntent("show_no_station_selected");
        }
        return ((Intent) (obj));
    }

    public static void s()
    {
        b.a.C().a(r());
    }

    public static DisplayMetrics t()
    {
        return b.a.h().getResources().getDisplayMetrics();
    }

    public static boolean u()
    {
        return b.a.h().getResources().getBoolean(0x7f0a0003);
    }

    public static boolean v()
    {
        return !u();
    }

    private static void w()
    {
        Application application = b.a.h();
        NotificationManager notificationmanager = (NotificationManager)application.getSystemService("notification");
        Notification notification = new Notification();
        notification.when = System.currentTimeMillis();
        notification.flags = notification.flags | 2;
        notification.icon = 0x7f02022b;
        Object obj = new Intent(application, com/pandora/android/activity/ListeningTimeoutActivity);
        ((Intent) (obj)).setFlags(0x20000000);
        obj = PendingIntent.getActivity(application, 0, ((Intent) (obj)), 0);
        notification.setLatestEventInfo(application, application.getString(0x7f0801bc), application.getString(0x7f0801bd), ((PendingIntent) (obj)));
        notificationmanager.notify(300, notification);
    }

    private static String x()
    {
        Application application = b.a.h();
        StatFs statfs = new StatFs(Environment.getDataDirectory().getPath());
        long l1 = statfs.getBlockSize();
        return Formatter.formatFileSize(application, (long)statfs.getAvailableBlocks() * l1);
    }

    private static android.content.DialogInterface.OnCancelListener y()
    {
        return new android.content.DialogInterface.OnCancelListener() {

            public void onCancel(DialogInterface dialoginterface)
            {
                if (s.n())
                {
                    com.pandora.android.iap.d.d.a().d().a(false);
                }
                b.a.C().a(new PandoraIntent("iap_complete"));
            }

        };
    }

    static 
    {
        d = "amazon".equalsIgnoreCase(d.k);
        e = "pandora".equalsIgnoreCase(d.k);
    }
}
