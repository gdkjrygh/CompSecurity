// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import org.apache.http.util.CharArrayBuffer;

// Referenced classes of package crittercism.android:
//            af, al, as, ai

public final class ah extends af
{

    private ai d;
    private int e;
    private int f;

    public ah(ai ai1, int i)
    {
        super(ai1);
        f = 0;
        d = ai1;
        e = i;
    }

    public final boolean a(int i)
    {
        if (f < e + 2)
        {
            if (i == -1)
            {
                super.a.b(a());
                super.a.a(as.d);
                return true;
            }
            c = c + 1;
            i = (char)i;
            f = f + 1;
            if (f > e)
            {
                if (i == 10)
                {
                    d.b(a());
                    super.a.a(d);
                    return true;
                }
                if (f == e + 2 && i != 10)
                {
                    super.a.a(as.d);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean a(CharArrayBuffer chararraybuffer)
    {
        return true;
    }

    public final af b()
    {
        return d;
    }

    public final af c()
    {
        return null;
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
