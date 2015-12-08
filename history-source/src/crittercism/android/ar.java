// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import org.apache.http.util.CharArrayBuffer;

// Referenced classes of package crittercism.android:
//            af, as, al

public final class ar extends af
{

    private af d;

    public ar(af af1)
    {
        super(af1);
        d = af1;
    }

    public final boolean a(int i)
    {
        if (i == -1)
        {
            super.a.a(as.d);
            return true;
        }
        c = c + 1;
        if ((char)i == '\n')
        {
            d.b(a());
            super.a.a(d);
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

    public final af b()
    {
        return this;
    }

    public final af c()
    {
        return this;
    }

    protected final int d()
    {
        return 0;
    }

    protected final int e()
    {
        return 0;
    }
}
