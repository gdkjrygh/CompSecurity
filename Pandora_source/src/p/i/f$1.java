// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.i;


// Referenced classes of package p.i:
//            e, f

class g.Exception
    implements e
{

    public f a(f f1)
        throws Exception
    {
        if (f1.c())
        {
            return f.g();
        }
        if (f1.d())
        {
            return f.a(f1.f());
        } else
        {
            return f.a(null);
        }
    }

    public Object then(f f1)
        throws Exception
    {
        return a(f1);
    }
}
