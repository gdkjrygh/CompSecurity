// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;

public class jnd
{

    public final Uri a;
    public final jmr b;
    public final jkh c;
    public final jmo d;
    public final int e;
    public final jkk f = new jkk();
    public volatile boolean g;
    public boolean h;

    public jnd(Uri uri, jmr jmr1, jkh jkh1, jmo jmo1, int i, long l)
    {
        a = (Uri)c.a(uri);
        b = (jmr)c.a(jmr1);
        c = (jkh)c.a(jkh1);
        d = (jmo)c.a(jmo1);
        e = i;
        f.a = l;
        h = true;
    }

    public void a()
    {
        g = true;
    }

    public boolean b()
    {
        return g;
    }

    public void c()
    {
        int i = 0;
_L4:
        if (i != 0 || g)
        {
            break; /* Loop/switch isn't completed */
        }
        long l1;
        long l2;
        l2 = f.a;
        l1 = b.a(new jms(a, l2, -1L, null));
        long l;
        l = l1;
        if (l1 != -1L)
        {
            l = l1 + l2;
        }
        Object obj = new jkc(b, l2, l);
        Object obj1;
        obj1 = c.a(((jke) (obj)));
        if (h)
        {
            ((jkd) (obj1)).b();
            h = false;
        }
_L2:
        if (i != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        int j;
        if (g)
        {
            break; /* Loop/switch isn't completed */
        }
        d.b(e);
        j = ((jkd) (obj1)).a(((jke) (obj)), f);
        i = j;
        if (true) goto _L2; else goto _L1
_L1:
        if (i == 1)
        {
            i = 0;
        } else
        {
            f.a = ((jke) (obj)).b();
        }
        b.a();
        if (true) goto _L4; else goto _L3
        obj;
        obj1 = null;
_L6:
        if (i != 1 && obj1 != null)
        {
            f.a = ((jke) (obj1)).b();
        }
        b.a();
        throw obj;
_L3:
        return;
        Exception exception;
        exception;
        Object obj2 = obj;
        obj = exception;
        exception = ((Exception) (obj2));
        continue; /* Loop/switch isn't completed */
        Exception exception1;
        exception1;
        exception = ((Exception) (obj));
        obj = exception1;
        if (true) goto _L6; else goto _L5
_L5:
    }
}
