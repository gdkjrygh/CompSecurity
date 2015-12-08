// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import org.apache.http.util.CharArrayBuffer;

// Referenced classes of package b.a:
//            qe, h, qg, j, 
//            c

public final class qh extends qe
{

    private int a;

    public qh(qe qe1)
    {
        super(qe1);
        a = -1;
    }

    public final qe a()
    {
        int i = a;
        if (a == 0)
        {
            return new h(this);
        } else
        {
            super.e.clear();
            return new qg(this, a);
        }
    }

    public final boolean a(CharArrayBuffer chararraybuffer)
    {
        int i = chararraybuffer.indexOf(59);
        int k = chararraybuffer.length();
        if (i <= 0)
        {
            i = k;
        }
        try
        {
            a = Integer.parseInt(chararraybuffer.substringTrimmed(0, i), 16);
        }
        // Misplaced declaration of an exception variable
        catch (CharArrayBuffer chararraybuffer)
        {
            return false;
        }
        return true;
    }

    public final qe c()
    {
        return j.a;
    }

    protected final int d()
    {
        return 16;
    }

    protected final int e()
    {
        return 256;
    }

    public final void g()
    {
        super.d.b(f());
        super.d.a(j.a);
    }
}
