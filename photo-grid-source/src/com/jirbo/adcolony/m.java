// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.view.View;
import android.webkit.WebView;
import android.widget.Toast;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLDecoder;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

// Referenced classes of package com.jirbo.adcolony:
//            a, ADCVideo, l, AdColonyAd, 
//            ag, AdColonyIAPEngagement, AdColonyBrowser, ab

class m
{

    WebView a;
    Activity b;
    ADCVideo c;
    Handler d;
    Runnable e;
    AdColonyAd f;
    String g;

    public m(ADCVideo adcvideo, WebView webview, Activity activity)
    {
        a = webview;
        b = activity;
        c = adcvideo;
        d = new Handler();
        e = new _cls1();
    }

    void a()
    {
        a.A = true;
        d.postDelayed(e, 1000L);
        com.jirbo.adcolony.a.a("html5_interaction", g, c.G);
        String s = (new StringBuilder()).append(Environment.getExternalStorageDirectory().toString()).append("/Pictures/AdColony_Screenshots/AdColony_Screenshot_").append(System.currentTimeMillis()).append(".jpg").toString();
        Object obj1 = a.getRootView();
        ((View) (obj1)).setDrawingCacheEnabled(true);
        Object obj = Bitmap.createBitmap(((View) (obj1)).getDrawingCache());
        ((View) (obj1)).setDrawingCacheEnabled(false);
        obj1 = new File((new StringBuilder()).append(Environment.getExternalStorageDirectory().toString()).append("/Pictures").toString());
        File file = new File((new StringBuilder()).append(Environment.getExternalStorageDirectory().toString()).append("/Pictures/AdColony_Screenshots").toString());
        try
        {
            ((File) (obj1)).mkdir();
            file.mkdir();
        }
        catch (Exception exception) { }
        obj1 = new File(s);
        try
        {
            obj1 = new FileOutputStream(((File) (obj1)));
            ((Bitmap) (obj)).compress(android.graphics.Bitmap.CompressFormat.JPEG, 90, ((OutputStream) (obj1)));
            ((OutputStream) (obj1)).flush();
            ((OutputStream) (obj1)).close();
            obj = b;
            obj1 = new _cls2();
            MediaScannerConnection.scanFile(((android.content.Context) (obj)), new String[] {
                s
            }, null, ((android.media.MediaScannerConnection.OnScanCompletedListener) (obj1)));
            return;
        }
        catch (FileNotFoundException filenotfoundexception)
        {
            Toast.makeText(b, "Error saving screenshot.", 0).show();
            l.a.a("ADC [info] FileNotFoundException in MRAIDCommandTakeScreenshot");
            return;
        }
        catch (IOException ioexception)
        {
            Toast.makeText(b, "Error saving screenshot.", 0).show();
        }
        l.a.a("ADC [info] IOException in MRAIDCommandTakeScreenshot");
    }

    void a(String s)
    {
        HashMap hashmap;
        s = s.replace("mraid://", "");
        String as[];
        int i1;
        if (s.contains("?"))
        {
            as = s.split("\\?");
            s = as[0];
        } else
        {
            as = null;
        }
        if (as != null)
        {
            as = as[1].split("&");
        } else
        {
            as = new String[0];
        }
        hashmap = new HashMap();
        i1 = as.length;
        for (int k = 0; k < i1; k++)
        {
            String s1 = as[k];
            hashmap.put(s1.split("=")[0], s1.split("=")[1]);
        }

        f = a.J;
        g = (new StringBuilder("{\"ad_slot\":")).append(f.h.k.d).append("}").toString();
        if (!s.equals("send_adc_event")) goto _L2; else goto _L1
_L1:
        b((String)hashmap.get("type"));
_L4:
        f("adc_bridge.nativeCallComplete()");
        return;
_L2:
        if (s.equals("close"))
        {
            b();
        } else
        if (s.equals("open_store") && !a.A)
        {
            c((String)hashmap.get("item"));
        } else
        if (s.equals("open") && !a.A)
        {
            d((String)hashmap.get("url"));
        } else
        if (s.equals("expand"))
        {
            e((String)hashmap.get("url"));
        } else
        if (s.equals("create_calendar_event") && !a.A)
        {
            c(hashmap);
        } else
        if (s.equals("mail") && !a.A)
        {
            d(hashmap);
        } else
        if (s.equals("sms") && !a.A)
        {
            e(hashmap);
        } else
        if (s.equals("tel") && !a.A)
        {
            f(hashmap);
        } else
        if (s.equals("custom_event"))
        {
            g(hashmap);
        } else
        if (s.equals("launch_app") && !a.A)
        {
            h(hashmap);
        } else
        if (s.equals("check_app_presence"))
        {
            i(hashmap);
        } else
        if (s.equals("auto_play"))
        {
            j(hashmap);
        } else
        if (s.equals("save_screenshot"))
        {
            a();
        } else
        if (s.equals("social_post") && !a.A)
        {
            b(hashmap);
        } else
        if (s.equals("make_in_app_purchase") && !a.A)
        {
            a(hashmap);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    void a(HashMap hashmap)
    {
        a.A = true;
        d.postDelayed(e, 1000L);
        com.jirbo.adcolony.a.a("html5_interaction", g, c.G);
        String s = g((String)hashmap.get("product"));
        Integer.parseInt(g((String)hashmap.get("quantity")));
        b.finish();
        c.G.m = s;
        c.G.u = AdColonyIAPEngagement.END_CARD;
        a.M.a(c.G);
    }

    void b()
    {
        l.a.b("ADC [info] MRAIDCommandClose called");
        b.finish();
        a.M.a(c.G);
    }

    void b(String s)
    {
        l.a.a("ADC [info] MRAIDCommandSendADCEvent called with type: ").b(s);
        com.jirbo.adcolony.a.a(s, c.G);
    }

    void b(HashMap hashmap)
    {
        a.A = true;
        d.postDelayed(e, 1000L);
        String s = g((String)hashmap.get("text"));
        hashmap = g((String)hashmap.get("url"));
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", (new StringBuilder()).append(s).append(" ").append(hashmap).toString());
        b.startActivity(Intent.createChooser(intent, "Share this post using..."));
    }

    void c(String s)
    {
        l.a.a("ADC [info] MRAIDCommandOpenStore called with item: ").b(s);
        a.A = true;
        d.postDelayed(e, 1000L);
        com.jirbo.adcolony.a.a("html5_interaction", g, c.G);
        s = g(s);
        try
        {
            s = new Intent("android.intent.action.VIEW", Uri.parse(s));
            b.startActivity(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Toast.makeText(b, "Unable to open store.", 0).show();
        }
    }

    void c(HashMap hashmap)
    {
        Object obj1;
        String s1;
        String s2;
        Object obj2;
        String s3;
        String s4;
        SimpleDateFormat simpledateformat;
        SimpleDateFormat simpledateformat1;
        String s5;
        String s6;
        l.a.a("ADC [info] MRAIDCommandCreateCalendarEvent called with parameters: ").b(hashmap);
        a.A = true;
        d.postDelayed(e, 1000L);
        com.jirbo.adcolony.a.a("html5_interaction", g, c.G);
        simpledateformat1 = new SimpleDateFormat("yyyy-MM-dd'T'hh:mmZ");
        obj2 = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ssZ");
        simpledateformat = new SimpleDateFormat("yyyy-MM-dd");
        s3 = g((String)hashmap.get("description"));
        g((String)hashmap.get("location"));
        s6 = g((String)hashmap.get("start"));
        s5 = g((String)hashmap.get("end"));
        String s = g((String)hashmap.get("summary"));
        s2 = g((String)hashmap.get("recurrence"));
        s1 = "";
        obj1 = "";
        HashMap hashmap1 = new HashMap();
        s4 = s2.replace("\"", "").replace("{", "").replace("}", "");
        if (!s4.equals(""))
        {
            obj1 = s4.split(",");
            int i1 = obj1.length;
            for (int k = 0; k < i1; k++)
            {
                s1 = obj1[k];
                hashmap1.put(s1.substring(0, s1.indexOf(":")), s1.substring(s1.indexOf(":") + 1, s1.length()));
            }

            s1 = g((String)hashmap1.get("expires"));
            obj1 = g((String)hashmap1.get("frequency")).toUpperCase();
            l.a.a("Calendar Recurrence - ").b(s4);
            l.a.a("Calendar Recurrence - frequency = ").b(obj1);
            l.a.a("Calendar Recurrence - expires =  ").b(s1);
        }
        s2 = s;
        if (s.equals(""))
        {
            s2 = g((String)hashmap.get("description"));
        }
        hashmap = simpledateformat1.parse(s6);
        Date date = simpledateformat1.parse(s5);
_L1:
        Object obj;
        obj = hashmap;
        if (hashmap != null)
        {
            break MISSING_BLOCK_LABEL_465;
        }
        obj = ((DateFormat) (obj2)).parse(s6);
        hashmap = ((HashMap) (obj));
        obj2 = ((DateFormat) (obj2)).parse(s5);
        date = ((Date) (obj2));
        break MISSING_BLOCK_LABEL_465;
        hashmap;
        hashmap = null;
_L2:
        date = null;
          goto _L1
        obj;
        obj = hashmap;
        Object obj3;
        try
        {
            hashmap = simpledateformat1.parse(s1);
        }
        // Misplaced declaration of an exception variable
        catch (HashMap hashmap)
        {
            hashmap = null;
        }
        obj3 = hashmap;
        long l1;
        long l2;
        long l3;
        if (hashmap == null)
        {
            try
            {
                obj3 = simpledateformat.parse(s1);
            }
            catch (Exception exception1)
            {
                obj3 = hashmap;
            }
        }
        if (obj == null)
        {
            Toast.makeText(b, "Unable to create Calendar Event.", 0).show();
            return;
        }
        l2 = ((Date) (obj)).getTime();
        l3 = date.getTime();
        l1 = 0L;
        if (obj3 != null)
        {
            l1 = (((Date) (obj3)).getTime() - ((Date) (obj)).getTime()) / 1000L;
        }
        Exception exception;
        if (((String) (obj1)).equals("DAILY"))
        {
            l1 = l1 / 0x15180L + 1L;
        } else
        if (((String) (obj1)).equals("WEEKLY"))
        {
            l1 = l1 / 0x93a80L + 1L;
        } else
        if (((String) (obj1)).equals("MONTHLY"))
        {
            l1 = l1 / 0x2820a8L + 1L;
        } else
        if (((String) (obj1)).equals("YEARLY"))
        {
            l1 = l1 / 0x1e187e0L + 1L;
        } else
        {
            l1 = 0L;
        }
        if (!s4.equals(""))
        {
            hashmap = (new Intent("android.intent.action.EDIT")).setType("vnd.android.cursor.item/event").putExtra("title", s2).putExtra("description", s3).putExtra("beginTime", l2).putExtra("endTime", l3).putExtra("rrule", (new StringBuilder("FREQ=")).append(((String) (obj1))).append(";COUNT=").append(l1).toString());
            l.a.a("Calendar Recurrence - count = ").b(l1);
        } else
        {
            hashmap = (new Intent("android.intent.action.EDIT")).setType("vnd.android.cursor.item/event").putExtra("title", s2).putExtra("description", s3).putExtra("beginTime", l2).putExtra("endTime", l3);
        }
        try
        {
            b.startActivity(hashmap);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (HashMap hashmap)
        {
            Toast.makeText(b, "Unable to create Calendar Event.", 0).show();
        }
        return;
        exception;
          goto _L2
    }

    void d(String s)
    {
        l.a.a("ADC [info] MRAIDCommandOpen called with url: ").b(s);
        a.A = true;
        d.postDelayed(e, 1000L);
        Object obj = g(s);
        if (((String) (obj)).startsWith("adcvideo"))
        {
            s = ((String) (obj)).replace("adcvideo", "http");
            c.a(s);
            return;
        }
        if (s.contains("youtube"))
        {
            try
            {
                obj = ((String) (obj)).substring(((String) (obj)).indexOf('v') + 2);
                obj = new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder("vnd.youtube:")).append(((String) (obj))).toString()));
                b.startActivity(((Intent) (obj)));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                obj = g(s);
            }
            s = ((String) (obj));
            if (((String) (obj)).contains("safari"))
            {
                s = ((String) (obj)).replace("safari", "http");
            }
            s = new Intent("android.intent.action.VIEW", Uri.parse(s));
            b.startActivity(s);
            return;
        }
        if (((String) (obj)).startsWith("browser"))
        {
            com.jirbo.adcolony.a.a("html5_interaction", c.G);
            s = new Intent("android.intent.action.VIEW", Uri.parse(((String) (obj)).replace("browser", "http")));
            b.startActivity(s);
            return;
        } else
        {
            com.jirbo.adcolony.a.a("html5_interaction", g, c.G);
            AdColonyBrowser.url = ((String) (obj));
            s = new Intent(b, com/jirbo/adcolony/AdColonyBrowser);
            b.startActivity(s);
            return;
        }
    }

    void d(HashMap hashmap)
    {
        l.a.a("ADC [info] MRAIDCommandMail called with parameters: ").b(hashmap);
        a.A = true;
        d.postDelayed(e, 1000L);
        String s = g((String)hashmap.get("subject"));
        String s1 = g((String)hashmap.get("body"));
        hashmap = g((String)hashmap.get("to"));
        com.jirbo.adcolony.a.a("html5_interaction", g, c.G);
        try
        {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("plain/text");
            intent.putExtra("android.intent.extra.SUBJECT", s).putExtra("android.intent.extra.TEXT", s1).putExtra("android.intent.extra.EMAIL", new String[] {
                hashmap
            });
            b.startActivity(intent);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (HashMap hashmap)
        {
            hashmap.printStackTrace();
        }
        Toast.makeText(b, "Unable to launch email client.", 0).show();
    }

    void e(String s)
    {
        l.a.a("ADC [info] MRAIDCommandExpand called with url: ").b(s);
        f("adc_bridge.fireChangeEvent({state:'expanded'});");
    }

    void e(HashMap hashmap)
    {
        l.a.a("ADC [info] MRAIDCommandSMS called with parameters: ").b(hashmap);
        a.A = true;
        d.postDelayed(e, 1000L);
        String s = g((String)hashmap.get("to"));
        hashmap = g((String)hashmap.get("body"));
        com.jirbo.adcolony.a.a("html5_interaction", g, c.G);
        try
        {
            hashmap = (new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder("sms:")).append(s).toString()))).putExtra("sms_body", hashmap);
            b.startActivity(hashmap);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (HashMap hashmap)
        {
            hashmap.printStackTrace();
        }
        Toast.makeText(b, "Failed to create sms.", 0).show();
    }

    void f(String s)
    {
        a.loadUrl((new StringBuilder("javascript:")).append(s).toString());
    }

    void f(HashMap hashmap)
    {
        l.a.a("ADC [info] MRAIDCommandTel called with parameters: ").b(hashmap);
        a.A = true;
        d.postDelayed(e, 1000L);
        hashmap = g((String)hashmap.get("number"));
        com.jirbo.adcolony.a.a("html5_interaction", g, c.G);
        try
        {
            hashmap = (new Intent("android.intent.action.DIAL")).setData(Uri.parse((new StringBuilder("tel:")).append(hashmap).toString()));
            b.startActivity(hashmap);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (HashMap hashmap)
        {
            Toast.makeText(b, "Failed to dial number.", 0).show();
        }
    }

    String g(String s)
    {
        if (s == null)
        {
            return "";
        } else
        {
            return URLDecoder.decode(s);
        }
    }

    void g(HashMap hashmap)
    {
        l.a.a("ADC [info] MRAIDCommandSendCustomADCEvent called with parameters: ").b(hashmap);
        hashmap = g((String)hashmap.get("event_type"));
        com.jirbo.adcolony.a.a("custom_event", (new StringBuilder("{\"event_type\":\"")).append(hashmap).append("\",\"ad_slot\":").append(f.h.k.d).append("}").toString(), c.G);
    }

    void h(HashMap hashmap)
    {
        l.a.a("ADC [info] MRAIDCommandLaunchApp called with parameters: ").b(hashmap);
        a.A = true;
        d.postDelayed(e, 1000L);
        hashmap = g((String)hashmap.get("handle"));
        com.jirbo.adcolony.a.a("html5_interaction", g, c.G);
        try
        {
            hashmap = b.getPackageManager().getLaunchIntentForPackage(hashmap);
            b.startActivity(hashmap);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (HashMap hashmap)
        {
            Toast.makeText(b, "Failed to launch external application.", 0).show();
        }
    }

    void i(HashMap hashmap)
    {
        l.a.a("ADC [info] MRAIDCommandCheckAppPresence called with parameters: ").b(hashmap);
        hashmap = g((String)hashmap.get("handle"));
        boolean flag = ab.a(hashmap);
        f((new StringBuilder("adc_bridge.fireAppPresenceEvent('")).append(hashmap).append("',").append(flag).append(")").toString());
    }

    void j(HashMap hashmap)
    {
        l.a.a("ADC [info] MRAIDCommandCheckAutoPlay called with parameters: ").b(hashmap);
    }

    private class _cls1
        implements Runnable
    {

        final m a;

        public void run()
        {
            a.A = false;
        }

        _cls1()
        {
            a = m.this;
            super();
        }
    }


    private class _cls2
        implements android.media.MediaScannerConnection.OnScanCompletedListener
    {

        final m a;

        public void onScanCompleted(String s, Uri uri)
        {
            Toast.makeText(a.b, "Screenshot saved to Gallery!", 0).show();
        }

        _cls2()
        {
            a = m.this;
            super();
        }
    }

}
