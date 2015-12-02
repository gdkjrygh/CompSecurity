// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms.e;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

// Referenced classes of package android_src.mms.e:
//            s

public class j
{

    private Vector a;
    private Map b;
    private Map c;
    private Map d;
    private Map e;

    public j()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        a = new Vector();
        b = new HashMap();
        c = new HashMap();
        d = new HashMap();
        e = new HashMap();
    }

    private void b(s s1)
    {
        byte abyte0[] = s1.c();
        if (abyte0 != null)
        {
            b.put(new String(abyte0), s1);
        }
        abyte0 = s1.e();
        if (abyte0 != null)
        {
            String s2 = new String(abyte0);
            c.put(s2, s1);
        }
        s2 = s1.i();
        if (s2 != null)
        {
            String s3 = new String(s2);
            d.put(s3, s1);
        }
        s3 = s1.j();
        if (s3 != null)
        {
            String s4 = new String(s3);
            e.put(s4, s1);
        }
    }

    public s a(int i)
    {
        return (s)a.get(i);
    }

    public void a()
    {
        a.clear();
    }

    public void a(int i, s s1)
    {
        if (s1 == null)
        {
            throw new NullPointerException();
        } else
        {
            b(s1);
            a.add(i, s1);
            return;
        }
    }

    public boolean a(s s1)
    {
        if (s1 == null)
        {
            throw new NullPointerException();
        } else
        {
            b(s1);
            return a.add(s1);
        }
    }

    public int b()
    {
        return a.size();
    }
}
