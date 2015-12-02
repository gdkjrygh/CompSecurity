// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.antivirus.update;

import android.os.Build;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import org.apache.http.client.HttpClient;

// Referenced classes of package com.qihoo.antivirus.update:
//            ag, h, u, s, 
//            d, ah, ae, NetQuery, 
//            af, x, UpdateService, e, 
//            j

public class n extends ag
{

    private d d;

    public n(d d1, int i)
    {
        super(d1, i);
        d = null;
        d = d1;
    }

    private int a(h h1)
    {
        Object obj = h1.a();
        if (obj == null || ((ArrayList) (obj)).size() <= 0) goto _L2; else goto _L1
_L1:
        obj = ((ArrayList) (obj)).iterator();
_L6:
        if (((Iterator) (obj)).hasNext()) goto _L3; else goto _L2
_L2:
        h1 = h1.b();
        if (h1 == null || h1.size() <= 0) goto _L5; else goto _L4
_L4:
        h1 = h1.iterator();
_L7:
        if (h1.hasNext())
        {
            break MISSING_BLOCK_LABEL_142;
        }
_L5:
        return 0;
_L3:
        u u1 = (u)((Iterator) (obj)).next();
        if (u1.g() == null)
        {
            return -1;
        }
        if (!a(u1.d(), u1.e(), u1.f()))
        {
            return -1;
        }
        String s2 = u1.a();
        if (!a(s2, u1.b(), u1.c()))
        {
            return -1;
        }
        if (s2 != null && u1.k() == -1)
        {
            return -1;
        }
          goto _L6
        Object obj1 = (s)h1.next();
        if (((s) (obj1)).b() == null)
        {
            return -1;
        }
        if (!a(((s) (obj1)).f(), ((s) (obj1)).g(), ((s) (obj1)).h()))
        {
            return -1;
        }
        String s1 = ((s) (obj1)).c();
        if (!a(s1, ((s) (obj1)).d(), ((s) (obj1)).e()))
        {
            return -1;
        }
        if (s1 != null)
        {
            if (((s) (obj1)).i() == -1)
            {
                return -1;
            }
            obj1 = ((s) (obj1)).a;
            if (obj1 == null)
            {
                return -1;
            }
            int i = 0;
            while (i < ((String) (obj1)).length()) 
            {
                char c = ((String) (obj1)).charAt(i);
                if (c < '0' || c > '9')
                {
                    return -1;
                }
                i++;
            }
        }
          goto _L7
    }

    private u a(ArrayList arraylist)
    {
        Object obj;
        int i;
        arraylist.size();
        obj = arraylist.iterator();
        i = 0;
_L4:
        if (((Iterator) (obj)).hasNext()) goto _L2; else goto _L1
_L1:
        u u1 = null;
_L3:
        obj = u1;
        if (u1 == null)
        {
            obj = (u)arraylist.get(0);
        }
        return ((u) (obj));
_L2:
        u1 = (u)((Iterator) (obj)).next();
        i++;
        if (u1.a() == null) goto _L4; else goto _L3
    }

    private void a(ArrayList arraylist, ArrayList arraylist1)
    {
        if (arraylist != null && arraylist.size() > 0)
        {
            d.a(arraylist);
        }
        if (arraylist1 != null && arraylist1.size() > 0)
        {
            d.b(arraylist1);
            d.f();
        }
    }

    private boolean a(String s1, String s2, long l)
    {
        while (s1 != null && s2 != null && l != 0L || s1 == null && s2 == null && l == 0L) 
        {
            return true;
        }
        return false;
    }

    private void b(ArrayList arraylist)
    {
        if (arraylist != null && arraylist.size() > 0)
        {
            u u1 = a(arraylist);
            d.a(u1);
            String s2 = u1.a();
            String s3 = u1.b();
            long l = u1.c();
            String s4 = u1.d();
            String s5 = u1.e();
            long l1 = u1.f();
            arraylist = u1.g();
            String s6 = u1.h();
            String s7 = u1.i();
            int i = u1.j();
            d.a("Update", "url", s4);
            d.a("Update", "size", String.valueOf(l1));
            d.a("Update", "md5", s5);
            d.a("Update", "patchurl", s2);
            d.a("Update", "patchsize", String.valueOf(l));
            d.a("Update", "patchmd5", s3);
            d.a("Update", "version", arraylist);
            d.a("Update", "versioncode", s6);
            d.a("Update", "force", String.valueOf(i));
            if (!TextUtils.isEmpty(s7))
            {
                String s1 = s7.replaceAll("\\\\n", "\n");
                d.a("Update", "description", s1);
            }
            if (!TextUtils.isEmpty(arraylist))
            {
                d.j();
            }
        }
    }

    private String e()
    {
        StringBuilder stringbuilder = new StringBuilder();
        Object obj = new BufferedReader(new InputStreamReader(new FileInputStream(ah.b)));
_L1:
        String s1 = ((BufferedReader) (obj)).readLine();
        Exception exception1;
label0:
        {
            {
                if (s1 != null)
                {
                    break label0;
                }
                Exception exception2;
                if (obj != null)
                {
                    try
                    {
                        ((BufferedReader) (obj)).close();
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj) { }
                }
            }
            obj = stringbuilder.toString();
            if (TextUtils.isEmpty(((CharSequence) (obj))))
            {
                return null;
            } else
            {
                return ((String) (obj));
            }
        }
        stringbuilder.append(s1);
        stringbuilder.append("\n");
          goto _L1
        exception2;
_L5:
        if (obj != null)
        {
            try
            {
                ((BufferedReader) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        break MISSING_BLOCK_LABEL_50;
        exception1;
        obj = null;
_L3:
        if (obj != null)
        {
            try
            {
                ((BufferedReader) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        throw exception1;
        exception1;
        if (true) goto _L3; else goto _L2
_L2:
        Exception exception;
        exception;
        exception = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected int a(HttpClient httpclient, String s1)
    {
        if (!ae.b(d.e(), "update-1.0.0"))
        {
            a(24, "load so failed.");
            return -99;
        }
        ah.a(d.e());
        httpclient = new NetQuery(d.e());
        httpclient.a("1", af.d(d.e()));
        httpclient.a("5", Build.MANUFACTURER);
        httpclient.a("6", Build.MODEL);
        httpclient.a("7", Integer.valueOf(android.os.Build.VERSION.SDK_INT));
        httpclient.a("8", android.os.Build.VERSION.RELEASE);
        httpclient.a("10", Locale.getDefault().toString());
        if (ah.a == null) goto _L2; else goto _L1
_L1:
        httpclient.a("200", ah.a);
_L4:
        int k;
        s1 = new String[1];
        k = x.c(d.e());
        char c = '\u7530';
        if (k == 1 || k >= 3)
        {
            c = '\u3A98';
        }
        k = httpclient.a(d.a(k), c, s1);
        httpclient.a();
        if (UpdateService.f)
        {
            return 1;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (UpdateService.d != null)
        {
            httpclient.a("200", UpdateService.d);
        }
        if (true) goto _L4; else goto _L3
_L3:
        int i = k;
        if (ah.c)
        {
            i = k;
            if (ah.b != null)
            {
                s1[0] = e();
                int l;
                if (s1[0] == null)
                {
                    i = -8;
                } else
                {
                    i = 0;
                }
            }
        }
        if (i == 0)
        {
            if (s1[0] == null)
            {
                a(--8, "info null.");
                return -99;
            }
        } else
        {
            if (i == -8)
            {
                com.qihoo.antivirus.update.e.a(d.e(), "version", "0");
                return 1;
            }
            l = i;
            if (i != -3)
            {
                l = 25;
            }
            i = l;
            if (l < 0)
            {
                i = -l;
            }
            a(i, "v5 error.");
            return -99;
        }
        httpclient = (new j()).a(d.e(), s1[0]);
        if (httpclient == null)
        {
            a(25, "ini config error #1.");
            return -99;
        }
        if (a(((h) (httpclient))) < 0)
        {
            a(26, "ini config error #2.");
            return -99;
        } else
        {
            b(httpclient.a());
            a(d.c(httpclient.b()), httpclient.c());
            return 1;
        }
    }

    public void a(long l, long l1)
        throws InterruptedException
    {
    }
}
