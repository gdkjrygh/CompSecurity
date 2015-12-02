// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.a;

import android.os.Bundle;
import java.util.List;

// Referenced classes of package android.support.v4.view.a:
//            i, k, h, a

public class g
{

    private static final h a;
    private final Object b;

    public g()
    {
        b = a.a(this);
    }

    public g(Object obj)
    {
        b = obj;
    }

    public a a(int j)
    {
        return null;
    }

    public Object a()
    {
        return b;
    }

    public List a(String s, int j)
    {
        return null;
    }

    public boolean a(int j, int l, Bundle bundle)
    {
        return false;
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            a = new i();
        } else
        {
            a = new k();
        }
    }
}
