// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.List;
import org.json.JSONObject;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            fp, fz, ct, du, 
//            ch, cj, fd

public class fr extends fp
{

    JSONObject a;
    String b;
    String c;
    int d;
    boolean e;
    int f;
    String g;

    public fr(fp.a a1, String s, String s1)
    {
        super(a1);
        f = 1000;
        e = false;
        b = s1;
        a = null;
        g = s;
    }

    private void i()
    {
        j();
        if (d != 1)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        if ((new fz(c, g, false, true)).d().isEmpty())
        {
            a(fp.b.c);
            return;
        }
        try
        {
            a(fp.b.b);
            return;
        }
        catch (Exception exception)
        {
            ct.a(exception);
        }
        a(fp.b.d);
        return;
        ct.d((new StringBuilder()).append("Request returned: ").append(d).toString());
        a(fp.b.c);
        return;
    }

    private void j()
    {
        if (a == null)
        {
            Context context = ct.u();
            a = cj.a(new du(context), ct.s(), (new ch(context.getFilesDir().getAbsoluteFile())).e(), TremorVideo.a.a, g);
        }
        d = 0;
        String s = ct.v();
        ct.d((new StringBuilder()).append("User Agent: ").append(s).toString());
        ct.d((new StringBuilder()).append("CCH: ").append(g).toString());
        Object obj = a.toString();
        obj = fd.a(b, s, ((String) (obj)));
        ((fd) (obj)).a();
        c = ((fd) (obj)).b();
        if (c == "") goto _L2; else goto _L1
_L1:
        String as[];
        int l;
        as = (new JSONObject(c)).toString(2).split("\n");
        l = as.length;
        int k = 0;
_L3:
        String s1;
        if (k >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = as[k];
        ct.a(ct.a.c, s1);
        k++;
        if (true) goto _L3; else goto _L2
_L2:
        Exception exception;
        Exception exception1;
        boolean flag;
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            catch (IOException ioexception)
            {
                flag = true;
            }
        } else
        {
            flag = true;
        }
        if (!flag)
        {
            d = 500;
            f = Math.min(0x1d4c0, f * 2);
            return;
        }
          goto _L4
        exception;
        ct.a("Error Downloading Request: ", exception);
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            catch (IOException ioexception1)
            {
                flag = false;
            }
        } else
        {
            flag = false;
        }
        if (true) goto _L5; else goto _L4
_L5:
        break MISSING_BLOCK_LABEL_211;
        exception1;
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            catch (IOException ioexception2) { }
        }
        throw exception1;
_L4:
        if (c.length() == 0)
        {
            d = 204;
            f = Math.min(0x1d4c0, f * 2);
            return;
        } else
        {
            d = 1;
            return;
        }
    }

    protected void e()
    {
        i();
    }

    protected void f()
    {
    }

    protected void g()
    {
        i();
    }

    public fz h()
    {
        fz fz1;
        try
        {
            fz1 = new fz(c, g, false, true);
        }
        catch (Exception exception)
        {
            ct.a(exception);
            return null;
        }
        return fz1;
    }

    public String toString()
    {
        return "Download Request";
    }
}
