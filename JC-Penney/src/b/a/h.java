// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import org.apache.http.util.CharArrayBuffer;

// Referenced classes of package b.a:
//            qe, c, i

public final class h extends qe
{

    private boolean a;

    public h(qe qe1)
    {
        super(qe1);
        a = false;
    }

    public final qe a()
    {
        if (a)
        {
            super.d.b(f());
            return super.d.b();
        } else
        {
            super.e.clear();
            return this;
        }
    }

    public final boolean a(CharArrayBuffer chararraybuffer)
    {
        boolean flag = false;
        if (chararraybuffer.substringTrimmed(0, chararraybuffer.length()).length() == 0)
        {
            flag = true;
        }
        a = flag;
        return true;
    }

    public final qe c()
    {
        super.e.clear();
        return new i(this);
    }

    protected final int d()
    {
        return 8;
    }

    protected final int e()
    {
        return 128;
    }
}
