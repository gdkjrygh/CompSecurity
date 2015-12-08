// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.richmedia;

import android.graphics.Bitmap;
import com.tremorvideo.sdk.android.videoad.ct;
import com.tremorvideo.sdk.android.videoad.eb;
import com.tremorvideo.sdk.android.videoad.gd;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.zip.ZipFile;

// Referenced classes of package com.tremorvideo.sdk.android.richmedia:
//            c, e, j, z, 
//            ai, am

public class a
{

    private c a;
    private List b;
    private List c;
    private ai d;
    private int e;
    private int f;
    private boolean g;
    private int h;
    private int i;
    private String j;
    private int k;
    private Bitmap l;
    private am m[];
    private GregorianCalendar n;
    private String o;
    private eb p;
    private boolean q;
    private boolean r;

    public a()
    {
        a = new c();
        q = false;
        r = true;
    }

    public eb a()
    {
        return p;
    }

    public String a(int i1)
    {
        return (String)c.get(i1);
    }

    public void a(eb eb)
    {
        p = eb;
    }

    public void a(String s)
    {
        o = s;
    }

    public void a(GregorianCalendar gregoriancalendar)
    {
        n = gregoriancalendar;
    }

    public void a(ZipFile zipfile, j j1)
        throws Exception
    {
        boolean flag = true;
        Object obj = zipfile.getEntry("data");
        java.util.zip.ZipEntry zipentry = zipfile.getEntry("code-android.js");
        if (zipfile.getEntry("compatibility") != null)
        {
            r = false;
        }
        if (zipentry == null)
        {
            j = "";
        } else
        {
            j = ct.a(zipfile.getInputStream(zipentry));
        }
        obj = new e(zipfile.getInputStream(((java.util.zip.ZipEntry) (obj))));
        k = ((e) (obj)).a();
        if (k != 1 && k != 2)
        {
            throw new Exception("Incompatible Version.");
        }
        if (((e) (obj)).b() == 0)
        {
            flag = false;
        }
        g = flag;
        ((e) (obj)).b();
        h = ((e) (obj)).b();
        i = ((e) (obj)).b();
        e = ((e) (obj)).a();
        f = ((e) (obj)).a();
        int i2 = ((e) (obj)).b();
        c = new ArrayList(i2);
        for (int i1 = 0; i1 < i2; i1++)
        {
            c.add(((e) (obj)).c());
        }

        int k1 = j1.a(e, f);
        a.a(zipfile, j1, k1, ((e) (obj)));
        i2 = ((e) (obj)).b();
        b = new ArrayList(i2);
        for (int l1 = 0; l1 < i2; l1++)
        {
            zipfile = new z(this);
            zipfile.a(((e) (obj)));
            b.add(zipfile);
        }

        d = new ai((z)b.get(0));
        l = gd.a(com.tremorvideo.sdk.android.c.a.a);
    }

    public void a(am aam[])
    {
        m = aam;
    }

    public Bitmap b()
    {
        return l;
    }

    public z b(int i1)
    {
        return (z)b.get(i1);
    }

    public boolean c()
    {
        return r;
    }

    public void d()
    {
        a.b();
    }

    public int e()
    {
        return k;
    }

    public String f()
    {
        return j;
    }

    public boolean g()
    {
        return g;
    }

    public z h()
    {
        if (h == 255)
        {
            return null;
        } else
        {
            return (z)b.get(h);
        }
    }

    public z i()
    {
        if (i == 255)
        {
            return null;
        } else
        {
            return (z)b.get(i);
        }
    }

    public int j()
    {
        return e;
    }

    public int k()
    {
        return f;
    }

    public ai l()
    {
        return d;
    }

    public am[] m()
    {
        return m;
    }

    public String n()
    {
        return o;
    }

    public GregorianCalendar o()
    {
        return n;
    }

    public c p()
    {
        return a;
    }

    public void q()
    {
        q = true;
    }

    public boolean r()
    {
        return q;
    }
}
