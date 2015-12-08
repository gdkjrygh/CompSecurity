// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dm;

import p.al.f;
import p.an.k;

// Referenced classes of package p.dm:
//            m

class .Object
    implements f
{

    final String a;
    final int b;
    final m c;

    public volatile boolean a(Exception exception, Object obj, k k, boolean flag)
    {
        return a(exception, (String)obj, k, flag);
    }

    public boolean a(Exception exception, String s, k k, boolean flag)
    {
        return false;
    }

    public volatile boolean a(Object obj, Object obj1, k k, boolean flag, boolean flag1)
    {
        return a((byte[])obj, (String)obj1, k, flag, flag1);
    }

    public boolean a(byte abyte0[], String s, k k, boolean flag, boolean flag1)
    {
        c.d((new StringBuilder()).append("Returning album art for token: ").append(a).append(", with small").append(" token: ").append(b).toString());
        if (!flag)
        {
            c.d("Returning art was not in memory cache (not preloaded)...");
        }
        return false;
    }

    .String(m m1, String s, int i)
    {
        c = m1;
        a = s;
        b = i;
        super();
    }
}
