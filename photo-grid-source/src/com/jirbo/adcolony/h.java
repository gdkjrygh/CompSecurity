// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import java.util.ArrayList;

// Referenced classes of package com.jirbo.adcolony:
//            a, AdColony, ADCImage, AdColonyV4VCAd, 
//            AdColonyInterstitialAd

class h extends View
{

    static double p;
    static String q = "";
    static String r = "";
    static boolean s = true;
    static Paint t = new Paint(1);
    static float u[] = new float[80];
    int A;
    int B;
    int C;
    int D;
    int E;
    String F;
    AdColonyV4VCAd G;
    ADCImage a;
    ADCImage b;
    ADCImage c;
    ADCImage d;
    ADCImage e;
    ADCImage f;
    ADCImage g;
    ADCImage h;
    double i;
    double j;
    double k;
    double l;
    double m;
    boolean n;
    ArrayList o;
    AdColonyInterstitialAd v;
    long w;
    int x;
    int y;
    int z;

    h()
    {
        super(com.jirbo.adcolony.a.b());
        i = 2.7999999999999998D;
        j = 2.0499999999999998D;
        k = 1.3D;
        l = 2.5D;
        m = 1.5D;
        o = new ArrayList();
        w = System.currentTimeMillis();
    }

    public h(String s1, int i1, AdColonyInterstitialAd adcolonyinterstitialad)
    {
        super(AdColony.activity());
        i = 2.7999999999999998D;
        j = 2.0499999999999998D;
        k = 1.3D;
        l = 2.5D;
        m = 1.5D;
        o = new ArrayList();
        w = System.currentTimeMillis();
        F = s1;
        E = i1;
        v = adcolonyinterstitialad;
        if (!a())
        {
            return;
        } else
        {
            AdColony.activity().addContentView(this, new android.widget.FrameLayout.LayoutParams(-1, -1, 17));
            return;
        }
    }

    int a(String s1)
    {
        t.getTextWidths(s1, u);
        float f1 = 0.0F;
        int j1 = s1.length();
        for (int i1 = 0; i1 < j1; i1++)
        {
            f1 += u[i1];
        }

        return (int)f1;
    }

    void a(String s1, int i1, int j1, Canvas canvas)
    {
        i1 -= a(s1) / 2;
        t.setColor(0xfff0f0f0);
        canvas.drawText(s1, i1 + 1, j1 + 1, t);
        t.setColor(0xff808080);
        canvas.drawText(s1, i1, j1, t);
    }

    void a(String s1, String s2)
    {
        int i1 = a(s1);
        q = "";
        r = "";
        if (i1 > a.f - a("WW") - a(s2))
        {
            s = false;
            int l1 = 0;
            String s3 = "";
            for (int j1 = 0; j1 < a.f - a("WW") - a(s2); j1 = a(s3))
            {
                s3 = (new StringBuilder()).append(s3).append(s1.charAt(l1)).toString();
                l1++;
            }

            int k1 = 0;
            int i2 = 0;
            while (k1 < l1) 
            {
                if (s3.charAt(k1) == ' ' && k1 >= 5)
                {
                    s2 = s1.substring(0, k1);
                    i2 = k1;
                } else
                if (i2 < 5)
                {
                    s2 = s1.substring(0, l1);
                } else
                {
                    s2 = q;
                }
                q = s2;
                k1++;
            }
            if (i2 < 5)
            {
                s1 = s1.substring(l1);
            } else
            {
                s1 = s1.substring(i2);
            }
            r = s1;
            return;
        } else
        {
            s = true;
            q = s1;
            r = "";
            return;
        }
    }

    public boolean a()
    {
        double d3 = 2.5D;
        double d2 = 0.80000000000000004D;
        if (a != null)
        {
            return true;
        }
        a = new ADCImage(com.jirbo.adcolony.a.j("pre_popup_bg"));
        b = new ADCImage(com.jirbo.adcolony.a.j("v4vc_logo"));
        c = new ADCImage(com.jirbo.adcolony.a.j("yes_button_normal"));
        d = new ADCImage(com.jirbo.adcolony.a.j("yes_button_down"));
        e = new ADCImage(com.jirbo.adcolony.a.j("no_button_normal"));
        f = new ADCImage(com.jirbo.adcolony.a.j("no_button_down"));
        h = new ADCImage(com.jirbo.adcolony.a.j("done_button_normal"));
        g = new ADCImage(com.jirbo.adcolony.a.j("done_button_down"));
        o.add(a);
        o.add(b);
        o.add(c);
        o.add(d);
        o.add(e);
        o.add(f);
        o.add(h);
        o.add(g);
        Display display = com.jirbo.adcolony.a.b().getWindowManager().getDefaultDisplay();
        int i1 = display.getWidth();
        int j1 = display.getHeight();
        double d1;
        if (j1 > i1)
        {
            d1 = (double)(j1 - i1) / 360D;
        } else
        {
            d1 = (double)(i1 - j1) / 360D;
        }
        if (d1 < 0.80000000000000004D && !a.m)
        {
            n = true;
        }
        if (d1 > 2.5D)
        {
            d1 = d3;
        }
        if (d1 < 0.80000000000000004D)
        {
            if (a.m)
            {
                d1 = d2;
            } else
            {
                d1 = 1.7D;
            }
        }
        p = d1;
        if (n)
        {
            i = 2.6000000000000001D;
            j = 1.8D;
            k = 1.0D;
            l = 2.2000000000000002D;
            m = 1.2D;
        }
        a.a(d1 / 1.8D);
        b.a(d1 / 1.8D);
        d.a(d1 / 1.8D);
        f.a(d1 / 1.8D);
        c.a(d1 / 1.8D);
        e.a(d1 / 1.8D);
        g.a(d1 / 1.8D);
        h.a(d1 / 1.8D);
        t.setTextSize((float)(18D * d1));
        if (n)
        {
            t.setTextSize((float)(d1 * 9D));
        }
        t.setFakeBoldText(true);
        return true;
    }

    boolean a(int i1, int j1, int k1, int l1)
    {
        while (i1 < k1 || j1 < l1 || i1 >= c.f + k1 || j1 >= c.g + l1) 
        {
            return false;
        }
        return true;
    }

    int b()
    {
        return (int)t.getTextSize();
    }

    void b(String s1, int i1, int j1, Canvas canvas)
    {
        i1 -= a(s1) / 2;
        t.setColor(0xff808080);
        canvas.drawText(s1, i1 + 2, j1 + 2, t);
        t.setColor(-1);
        canvas.drawText(s1, i1, j1, t);
    }

    void c()
    {
        double d1;
        double d2;
        double d3;
        Display display;
        int i1;
        int j1;
        if (n)
        {
            d1 = 12D;
        } else
        {
            d1 = 16D;
        }
        display = com.jirbo.adcolony.a.b().getWindowManager().getDefaultDisplay();
        i1 = display.getWidth();
        j1 = display.getHeight();
        x = (i1 - a.f) / 2;
        y = (j1 - a.g) / 2 - 80;
        z = x + a.f / 2;
        A = y + a.g / 2;
        D = y + (int)((double)a.g - ((double)c.g + p * d1));
        B = x + (int)(p * d1);
        i1 = x;
        d2 = a.f;
        d3 = c.f;
        C = (int)(d2 - (d1 * p + d3)) + i1;
    }

    void c(String s1, int i1, int j1, Canvas canvas)
    {
        b(s1, c.f / 2 + i1, c.g / 2 + j1 + (b() * 4) / 10, canvas);
    }

}
