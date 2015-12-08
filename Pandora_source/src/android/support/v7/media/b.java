// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.os.Bundle;

// Referenced classes of package android.support.v7.media:
//            f

public final class b
{

    private final Bundle a;
    private f b;

    private b(Bundle bundle)
    {
        a = bundle;
    }

    public b(f f1, boolean flag)
    {
        if (f1 == null)
        {
            throw new IllegalArgumentException("selector must not be null");
        } else
        {
            a = new Bundle();
            b = f1;
            a.putBundle("selector", f1.d());
            a.putBoolean("activeScan", flag);
            return;
        }
    }

    public static b a(Bundle bundle)
    {
        if (bundle != null)
        {
            return new b(bundle);
        } else
        {
            return null;
        }
    }

    private void e()
    {
        if (b == null)
        {
            b = f.a(a.getBundle("selector"));
            if (b == null)
            {
                b = f.a;
            }
        }
    }

    public f a()
    {
        e();
        return b;
    }

    public boolean b()
    {
        return a.getBoolean("activeScan");
    }

    public boolean c()
    {
        e();
        return b.c();
    }

    public Bundle d()
    {
        return a;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof b)
        {
            obj = (b)obj;
            flag = flag1;
            if (a().equals(((b) (obj)).a()))
            {
                flag = flag1;
                if (b() == ((b) (obj)).b())
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        int i = a().hashCode();
        boolean flag;
        if (b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag ^ i;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("DiscoveryRequest{ selector=").append(a());
        stringbuilder.append(", activeScan=").append(b());
        stringbuilder.append(", isValid=").append(c());
        stringbuilder.append(" }");
        return stringbuilder.toString();
    }
}
