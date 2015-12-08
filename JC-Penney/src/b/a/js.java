// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            jt, ji, kq, op

public abstract class js extends jt
{

    final op a;

    public js(op op)
    {
        if (op == null)
        {
            throw new NullPointerException("type == null");
        } else
        {
            a = op;
            return;
        }
    }

    public void a(ji ji1)
    {
        ji1.g.a(a);
    }
}
