// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            ju

public abstract class jt extends ju
{

    int e;

    public jt()
    {
        e = -1;
    }

    public final void a(int i)
    {
        if (e != -1)
        {
            throw new RuntimeException("index already set");
        } else
        {
            e = i;
            return;
        }
    }

    public final int d()
    {
        if (e < 0)
        {
            throw new RuntimeException("index not yet set");
        } else
        {
            return e;
        }
    }

    public final String e()
    {
        return (new StringBuilder("[")).append(Integer.toHexString(e)).append(']').toString();
    }
}
