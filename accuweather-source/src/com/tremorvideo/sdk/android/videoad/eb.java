// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Vibrator;
import android.view.Window;
import com.tremorvideo.sdk.android.googleAdapter.GoogleAdapterCalls;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            ct, ea, ec, co, 
//            ep, eq, dc, er, 
//            es, et, eu, ev, 
//            ew, di, ej, Playvideo, 
//            aq, av, fw, en, 
//            gj, az, cj, ek, 
//            bc, el, em, gd

public class eb
{
    public static interface a
    {

        public abstract void a(ea.b b1, int i1, int j1, int k1);
    }

    public static interface b
    {

        public abstract void a(ea ea1);

        public abstract void a_();
    }

    public static interface c
    {

        public abstract void a(int i1);
    }


    a.a a;
    Activity b;
    boolean c;
    gd d;
    boolean e;
    int f;
    int g;
    int h;
    int i;
    ArrayList j;
    ArrayList k;
    b l;
    private int m;

    public eb(Activity activity, a.a a1, gd gd)
    {
        m = -1;
        c = false;
        e = false;
        j = new ArrayList();
        k = new ArrayList();
        d = gd;
        b = activity;
        a = a1;
        activity = (GregorianCalendar)GregorianCalendar.getInstance();
        f = activity.get(1);
        g = activity.get(2);
        h = activity.get(5);
    }

    static void a(eb eb1, String s)
        throws ActivityNotFoundException
    {
        eb1.d(s);
    }

    static void a(eb eb1, boolean flag)
    {
        eb1.a(flag);
    }

    private void a(boolean flag)
    {
        c = false;
        if (flag)
        {
            g();
        }
    }

    private void b(String s)
        throws Exception
    {
        Object obj = null;
        String s1;
        Intent intent;
        Object obj1;
        Iterator iterator;
        if (s.startsWith("http://www.youtube.com/watch?v="))
        {
            s1 = s.replace("http://www.youtube.com/watch?v=", "");
        } else
        if (s.startsWith("http://www.youtube.com/v/"))
        {
            s1 = s.replace("http://www.youtube.com/v/", "");
        } else
        {
            s1 = null;
        }
        if (s1 != null) goto _L2; else goto _L1
_L1:
        s = new Intent("android.intent.action.VIEW", Uri.parse(s));
_L4:
        b.startActivityForResult(s, 11);
        GoogleAdapterCalls.onLeaveApp();
        e = true;
        return;
_L2:
        intent = new Intent("android.intent.action.VIEW", Uri.parse(s));
        iterator = b.getPackageManager().queryIntentActivities(intent, 0x10000).iterator();
        s = null;
        while (iterator.hasNext()) 
        {
            obj1 = (ResolveInfo)iterator.next();
            if (((ResolveInfo) (obj1)).activityInfo.packageName.toLowerCase().contains("browser"))
            {
                s = ((String) (obj));
                obj = obj1;
            } else
            if (((ResolveInfo) (obj1)).activityInfo.packageName.toLowerCase().contains("youtube"))
            {
                obj = s;
                s = ((String) (obj1));
            } else
            {
                obj1 = s;
                s = ((String) (obj));
                obj = obj1;
            }
            obj1 = obj;
            obj = s;
            s = ((String) (obj1));
        }
        if (ct.p() >= 11)
        {
            if (obj != null)
            {
                intent.setClassName(((ResolveInfo) (obj)).activityInfo.packageName, ((ResolveInfo) (obj)).activityInfo.name);
                s = intent;
                continue; /* Loop/switch isn't completed */
            }
            if (s != null)
            {
                intent.setClassName(((ResolveInfo) (s)).activityInfo.packageName, ((ResolveInfo) (s)).activityInfo.name);
                s = intent;
                continue; /* Loop/switch isn't completed */
            }
        } else
        {
            if (s != null)
            {
                obj = new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder()).append("http://www.youtube.com/watch?v=").append(s1).toString()));
                ((Intent) (obj)).setClassName(((ResolveInfo) (s)).activityInfo.packageName, ((ResolveInfo) (s)).activityInfo.name);
                s = ((String) (obj));
                continue; /* Loop/switch isn't completed */
            }
            if (obj != null)
            {
                intent.setClassName(((ResolveInfo) (obj)).activityInfo.packageName, ((ResolveInfo) (obj)).activityInfo.name);
            }
        }
        s = intent;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void c(ea ea1)
        throws Exception
    {
        ea1 = ea1.g();
        if (ea1.get("subject") == null && ea1.get("message") == null)
        {
            throw new Exception("Error launching share, no data supplied");
        }
        Intent intent = new Intent("android.intent.action.SEND");
        if (ea1.get("subject") != null)
        {
            intent.putExtra("android.intent.extra.SUBJECT", (String)ea1.get("subject"));
        }
        if (ea1.get("message") != null)
        {
            intent.putExtra("android.intent.extra.TEXT", (String)ea1.get("message"));
        }
        intent.setType("text/plain");
        b.startActivityForResult(Intent.createChooser(intent, "Share"), 11);
    }

    private void c(String s)
        throws Exception
    {
        s = new Intent("android.intent.action.DIAL", Uri.parse(s));
        b.startActivityForResult(s, 11);
        e = true;
        Thread.sleep(500L);
    }

    private void d(ea ea1)
    {
        ec ec1 = new ec(this);
        j();
        ea1 = new co(b, d, co.a.b, new ep(this, ea1, ec1));
        ea1.setTitle("Facebook");
        ea1.a("Would you like to share this on your Facebook page?");
        ea1.a("Yes", "No");
        ea1.show();
    }

    private void d(String s)
        throws ActivityNotFoundException
    {
        e = true;
        s = new Intent("android.intent.action.VIEW", Uri.parse(s));
        b.startActivityForResult(s, 11);
        GoogleAdapterCalls.onLeaveApp();
    }

    private void e(ea ea1)
    {
        if (ea1 == null)
        {
            ea1 = ea.b.F;
        } else
        {
            ea1 = ea1.a();
        }
        ea1 = dc.a(b, new eq(this, ea1), f, g, h);
        ea1.setOnCancelListener(new er(this));
        ea1.setOnDismissListener(new es(this));
        ea1.setTitle("Please select a date.");
        j();
        ea1.show();
    }

    private void f(ea ea1)
    {
        ea1 = dc.a(b, new et(this, ea1), f, g, h);
        ea1.setOnCancelListener(new eu(this));
        ea1.setOnDismissListener(new ev(this));
        ea1.setTitle("Please enter your birthday.");
        j();
        ea1.show();
    }

    private void g(ea ea1)
    {
        ea1 = di.a(b, new ew(this), i, "Please enter a zip code", d);
        ea1.setOnDismissListener(new ej(this));
        j();
        ea1.show();
    }

    private void h(ea ea1)
        throws Exception
    {
        Intent intent = new Intent(b, com/tremorvideo/sdk/android/videoad/Playvideo);
        intent.putExtra("tremorVideoType", "webview");
        intent.putExtra("tremorVideoURL", ea1.l());
        b.startActivityForResult(intent, 3232);
    }

    private void i()
        throws Exception
    {
        aq.a = a.a();
        aq.b = a;
        try
        {
            Intent intent = new Intent(b, com/tremorvideo/sdk/android/videoad/Playvideo);
            intent.putExtra("tremorVideoType", "buyitnow");
            b.startActivityForResult(intent, 3232);
            return;
        }
        catch (Exception exception)
        {
            aq.a = null;
            aq.b = null;
            throw exception;
        }
    }

    private void i(ea ea1)
        throws Exception
    {
        av.a = a.a();
        av.b = a;
        try
        {
            ea1 = new Intent(b, com/tremorvideo/sdk/android/videoad/Playvideo);
            ea1.putExtra("tremorVideoType", "coupon");
            b.startActivityForResult(ea1, 3232);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ea ea1)
        {
            av.a = null;
        }
        av.b = null;
        throw ea1;
    }

    private void j()
    {
        c = true;
    }

    private void j(ea ea1)
        throws Exception
    {
        double d1;
        double d2;
        String s;
        int j1;
        ea1 = ea1.g();
        j1 = Integer.parseInt((String)ea1.get("map-type"));
        d1 = 0.0D;
        int i1 = 0;
        s = (String)ea1.get("zoom");
        ArrayList arraylist;
        if ("0".equalsIgnoreCase(s))
        {
            i1 = 20;
        } else
        if ("1".equalsIgnoreCase(s))
        {
            i1 = 15;
        } else
        if ("2".equalsIgnoreCase(s))
        {
            i1 = 10;
        } else
        if ("3".equalsIgnoreCase(s))
        {
            i1 = 5;
        }
        if (j1 != 1) goto _L2; else goto _L1
_L1:
        ea1 = (String)ea1.get("query");
        d2 = 0.0D;
        d1 = 0.0D;
_L4:
        if (d2 == 0.0D && d1 == 0.0D)
        {
            s = "geo:0,0";
        } else
        {
            s = (new StringBuilder()).append("geo:").append(d2).append(",").append(d1).toString();
        }
        arraylist = new ArrayList();
        if (i1 > 0)
        {
            arraylist.add((new StringBuilder()).append("z=").append(i1).toString());
        }
        if (ea1 != null && ea1 != "")
        {
            arraylist.add((new StringBuilder()).append("q=").append(ea1).toString());
        }
        i1 = 0;
        while (i1 < arraylist.size()) 
        {
            if (i1 == 0)
            {
                ea1 = (new StringBuilder()).append(s).append("?").toString();
            } else
            {
                ea1 = (new StringBuilder()).append(s).append("&").toString();
            }
            s = (new StringBuilder()).append(ea1).append((String)arraylist.get(i1)).toString();
            i1++;
        }
        e = true;
        ea1 = Uri.parse(s);
        ct.a(ct.a.b, (new StringBuilder()).append("Map URL: ").append(ea1.toString()).toString());
        ea1 = new Intent("android.intent.action.VIEW", ea1);
        b.startActivityForResult(ea1, 11);
        GoogleAdapterCalls.onLeaveApp();
        return;
_L2:
        if (j1 == 2)
        {
            double d3 = fw.a;
            d2 = fw.b;
            if (d3 == 0.0D && d2 == 0.0D)
            {
                if (ea1.get("latitude") != null)
                {
                    d1 = Double.parseDouble((String)ea1.get("latitude"));
                } else
                {
                    d1 = d3;
                }
                if (ea1.get("longitude") != null)
                {
                    d3 = Double.parseDouble((String)ea1.get("longitude"));
                    d2 = d1;
                    d1 = d3;
                } else
                {
                    d3 = d1;
                    d1 = d2;
                    d2 = d3;
                }
            } else
            {
                d1 = d2;
                d2 = d3;
            }
            ea1 = (String)ea1.get("query");
            continue; /* Loop/switch isn't completed */
        }
        d2 = d1;
        if (j1 == 3)
        {
            if (ea1.get("latitude") != null)
            {
                d1 = Double.parseDouble((String)ea1.get("latitude"));
            }
            d2 = d1;
            if (ea1.get("longitude") != null)
            {
                d3 = Double.parseDouble((String)ea1.get("longitude"));
                d2 = d1;
                ea1 = null;
                d1 = d3;
                continue; /* Loop/switch isn't completed */
            }
        }
        ea1 = null;
        d1 = 0.0D;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void k(ea ea1)
        throws Exception
    {
        j();
        gj.a(b, ea1, new en(this));
    }

    private void l(ea ea1)
    {
        int i1;
        boolean flag;
        boolean flag1;
        try
        {
            AudioManager audiomanager = (AudioManager)a.b().getSystemService("audio");
            flag = audiomanager.shouldVibrate(1);
            flag1 = audiomanager.shouldVibrate(0);
        }
        // Misplaced declaration of an exception variable
        catch (ea ea1)
        {
            ct.a(ea1);
            return;
        }
        if (!flag || !flag1)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        i1 = Math.min(30, Integer.parseInt((String)ea1.g().get("duration")));
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        ((Vibrator)b.getSystemService("vibrator")).vibrate(i1 * 1000);
    }

    public void a()
    {
        j = new ArrayList();
        k = new ArrayList();
    }

    public void a(int i1)
    {
        i = i1;
    }

    public void a(ea.b b1)
    {
        ea ea1;
        ea1 = null;
        if (c)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        ea ea2;
        if (b1 != ea.b.I)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        ea2 = a.a().a(b1);
        ea1 = ea2;
        if (ea2 != null)
        {
            try
            {
                a(ea2);
            }
            // Misplaced declaration of an exception variable
            catch (ea.b b1)
            {
                g();
                return;
            }
            ea1 = ea2;
        }
        if (l != null)
        {
            l.a(ea1);
        }
        m = 0x7fffffff;
        if (b1 == ea.b.F)
        {
            e(null);
            return;
        }
        if (b1 == ea.b.G)
        {
            g(null);
            return;
        }
        if (b1 != ea.b.I)
        {
            throw new Exception();
        }
    }

    public void a(ea ea1)
    {
        a(ea1, -1);
    }

    public void a(ea ea1, int i1)
    {
        if (ea1.k() != null)
        {
            String as[] = ea1.k();
            int k1 = as.length;
            for (int j1 = 0; j1 < k1; j1++)
            {
                cj.a(as[j1]);
            }

        }
        m = a.a(ea1, i1);
    }

    public void a(a a1)
    {
        j.add(a1);
    }

    public void a(b b1)
    {
        l = b1;
    }

    public void a(c c1)
    {
        k.add(c1);
    }

    public void a(String s)
    {
        Intent intent = new Intent(b, com/tremorvideo/sdk/android/videoad/Playvideo);
        intent.putExtra("tremorVideoType", "webview");
        intent.putExtra("tremorVideoURL", s);
        b.startActivityForResult(intent, 3232);
    }

    public void b(ea ea1)
    {
        b(ea1, -1);
    }

    public void b(ea ea1, int i1)
    {
        if (ea1 != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (ea1.a() == ea.b.x)
        {
            a(ea1, i1);
            m = -1;
            l(ea1);
            return;
        }
        if (ea1.a() == ea.b.V)
        {
            a(ea1, i1);
            m = -1;
            return;
        }
        if (c) goto _L1; else goto _L3
_L3:
        a(ea1, i1);
        if (ea1.a() == ea.b.j)
        {
            m = -1;
            return;
        }
        try
        {
            if (l != null)
            {
                l.a(ea1);
            }
            if (ea1.a() == ea.b.p)
            {
                k(ea1);
                return;
            }
        }
        catch (Exception exception)
        {
            Throwable throwable = exception.getCause();
            if (throwable != null)
            {
                ct.d((new StringBuilder()).append("Unable to launch URL: ").append(ea1.l()).append(". ").append(exception.getMessage()).append(" ").append(throwable.getMessage()).toString());
            } else
            {
                ct.d((new StringBuilder()).append("Unable to launch URL: ").append(ea1.l()).append(". ").append(exception.getMessage()).toString());
            }
            g();
            return;
        }
        if (ea1.a() == ea.b.r)
        {
            c(ea1);
            return;
        }
        if (ea1.a() == ea.b.q)
        {
            j(ea1);
            return;
        }
        if (ea1.a() == ea.b.u)
        {
            d(ea1);
            return;
        }
        if (ea1.a() == ea.b.B)
        {
            i(ea1);
            return;
        }
        if (ea1.a() == ea.b.b)
        {
            h(ea1);
            return;
        }
        if (ea1.a() == ea.b.h)
        {
            h(ea1);
            return;
        }
        if (ea1.a() == ea.b.g)
        {
            h(ea1);
            return;
        }
        if (ea1.a() == ea.b.e)
        {
            h(ea1);
            return;
        }
        if (ea1.a() == ea.b.d)
        {
            h(ea1);
            return;
        }
        if (ea1.a() == ea.b.i)
        {
            b(ea1.l());
            return;
        }
        if (ea1.a() == ea.b.c)
        {
            c(ea1.l());
            return;
        }
        if (ea1.a() == ea.b.F)
        {
            e(ea1);
            return;
        }
        if (ea1.a() == ea.b.H)
        {
            h();
            return;
        }
        if (ea1.a() == ea.b.J)
        {
            f(ea1);
            return;
        }
        if (ea1.a() == ea.b.Q)
        {
            i();
            return;
        }
        if (ea1.a() == ea.b.V) goto _L1; else goto _L4
_L4:
        d(ea1.l());
        return;
    }

    public boolean b()
    {
        return e;
    }

    public int c()
    {
        return m;
    }

    public boolean d()
    {
        return c;
    }

    public void e()
    {
        e = false;
    }

    public boolean f()
    {
        return c;
    }

    public void g()
    {
        if (m != -1)
        {
            if (l != null)
            {
                l.a_();
            }
            if (m != 0x7fffffff)
            {
                a.a(m);
            }
            m = -1;
        }
    }

    public void h()
    {
        Dialog dialog = bc.a(b, new ek(this), d);
        dialog.setOnCancelListener(new el(this));
        dialog.setOnDismissListener(new em(this));
        j();
        android.view.WindowManager.LayoutParams layoutparams = new android.view.WindowManager.LayoutParams();
        layoutparams.copyFrom(dialog.getWindow().getAttributes());
        layoutparams.width = -1;
        layoutparams.height = -1;
        dialog.show();
        dialog.getWindow().setAttributes(layoutparams);
    }
}
