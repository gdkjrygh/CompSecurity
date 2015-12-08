// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import org.apache.http.util.CharArrayBuffer;

// Referenced classes of package crittercism.android:
//            af, as, al

public final class ag extends af
{

    private int d;
    private int e;

    public ag(af af1, int i)
    {
        super(af1);
        e = 0;
        d = i;
    }

    public final boolean a(int i)
    {
        if (i == -1)
        {
            super.a.a(as.d);
            return true;
        }
        e = e + 1;
        c = c + 1;
        if (e == d)
        {
            super.a.b(a());
            af af1 = super.a.b();
            super.a.a(af1);
            return true;
        } else
        {
            return false;
        }
    }

    public final boolean a(CharArrayBuffer chararraybuffer)
    {
        return true;
    }

    public final int b(byte abyte0[], int i, int j)
    {
        if (j == -1)
        {
            super.a.a(as.d);
            return -1;
        }
        if (e + j < d)
        {
            e = e + j;
            c = c + j;
            return j;
        } else
        {
            i = d - e;
            c = c + i;
            super.a.b(a());
            super.a.a(super.a.b());
            return i;
        }
    }

    public final af b()
    {
        return as.d;
    }

    public final af c()
    {
        return as.d;
    }

    protected final int d()
    {
        return 0;
    }

    protected final int e()
    {
        return 0;
    }

    public final void f()
    {
        super.a.b(a());
        super.a.a(as.d);
    }
}
