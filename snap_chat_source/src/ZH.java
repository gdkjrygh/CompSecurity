// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.apache.http.util.CharArrayBuffer;

public final class ZH extends afi
{

    private boolean a;

    public ZH(afi afi1)
    {
        super(afi1);
        a = false;
    }

    public final afi a()
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

    public final afi c()
    {
        super.e.clear();
        return new ZI(this);
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
