// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.antivirus.update;

import android.content.Context;

// Referenced classes of package com.qihoo.antivirus.update:
//            p, z

public class NetQuery
{

    final Context a;
    private z b;
    private final int c = nt1();

    public NetQuery(Context context)
    {
        b = null;
        a = context;
    }

    private native int nt1();

    private native int nt2(int i);

    private native int nt3(int i, String s, Object obj);

    private native int nt6(int i, String s, int j, String as[]);

    public byte[] RequestCallback(String s, String s1, byte abyte0[], int i)
    {
        if (b == null)
        {
            b = new p(a);
        }
        return b.a(s, s1, abyte0, i);
    }

    public int a(String s, int i, String as[])
    {
        if (c == 0)
        {
            return -2;
        } else
        {
            return nt6(c, s, i, as);
        }
    }

    public boolean a()
    {
        while (c == 0 || nt2(c) != 0) 
        {
            return false;
        }
        return true;
    }

    public boolean a(String s, Object obj)
    {
        while (c == 0 || nt3(c, s, obj) != 0) 
        {
            return false;
        }
        return true;
    }
}
