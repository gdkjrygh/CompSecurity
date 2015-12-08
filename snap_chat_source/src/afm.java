// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.apache.http.util.CharArrayBuffer;

public final class afm extends afi
{

    public afm(afi afi1)
    {
        super(afi1);
    }

    public final int a(byte abyte0[], int i, int j)
    {
        if (j == -1)
        {
            super.d.b(f());
            super.d.a(ZJ.a);
            return -1;
        } else
        {
            f = f + j;
            return j;
        }
    }

    public final afi a()
    {
        return ZJ.a;
    }

    public final boolean a(int i)
    {
        if (i == -1)
        {
            super.d.b(f());
            super.d.a(ZJ.a);
            return true;
        } else
        {
            f = f + 1;
            return false;
        }
    }

    public final boolean a(CharArrayBuffer chararraybuffer)
    {
        return true;
    }

    public final afi c()
    {
        return ZJ.a;
    }

    protected final int d()
    {
        return 0;
    }

    protected final int e()
    {
        return 0x7fffffff;
    }

    public final void g()
    {
        super.d.b(f());
        super.d.a(ZJ.a);
    }
}
