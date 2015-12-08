// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a;

import android.util.Log;

// Referenced classes of package b.a.a.a:
//            o

public final class c
    implements o
{

    private int a;

    public c()
    {
        a = 3;
    }

    public c(byte byte0)
    {
        a = 4;
    }

    public final void a(int i, String s, String s1)
    {
        a(i, s, s1, false);
    }

    public final void a(int i, String s, String s1, boolean flag)
    {
        if (flag || a(i))
        {
            Log.println(i, s, s1);
        }
    }

    public final boolean a(int i)
    {
        return a <= i;
    }
}
