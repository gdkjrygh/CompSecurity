// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            hn, gl, nk, ha, 
//            no, nj

public final class gz extends hn
{

    final nk a;

    public gz(no no, nk nk1)
    {
        super(no);
        if (nk1 == null)
        {
            throw new NullPointerException("locals == null");
        } else
        {
            a = nk1;
            return;
        }
    }

    public final gl a(nj nj)
    {
        return new gz(super.e, a);
    }

    protected final String a()
    {
        return a.toString();
    }

    protected final String a(boolean flag)
    {
        int i = a.b();
        int k = a.a();
        StringBuffer stringbuffer = new StringBuffer(i * 40 + 100);
        stringbuffer.append("local-snapshot");
        for (int j = 0; j < k; j++)
        {
            nh nh = a.a(j);
            if (nh != null)
            {
                stringbuffer.append("\n  ");
                stringbuffer.append(ha.a(nh));
            }
        }

        return stringbuffer.toString();
    }

    public final gl c(int i)
    {
        return new gz(super.e, a.b(i));
    }
}
