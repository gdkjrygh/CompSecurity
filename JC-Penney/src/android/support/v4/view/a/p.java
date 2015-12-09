// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.a;

import android.os.Bundle;
import java.util.List;

// Referenced classes of package android.support.v4.view.a:
//            t, r, v, q, 
//            a

public class p
{

    private static final q a;
    private final Object b;

    public p()
    {
        b = a.a(this);
    }

    public p(Object obj)
    {
        b = obj;
    }

    public a a(int i)
    {
        return null;
    }

    public Object a()
    {
        return b;
    }

    public List a(String s, int i)
    {
        return null;
    }

    public boolean a(int i, int j, Bundle bundle)
    {
        return false;
    }

    public a b(int i)
    {
        return null;
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            a = new t();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            a = new r();
        } else
        {
            a = new v();
        }
    }
}
