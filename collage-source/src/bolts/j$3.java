// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;


// Referenced classes of package bolts:
//            i, j, f

class Object
    implements i
{

    final f a;
    final i b;
    final j c;

    public j a(j j1)
    {
        if (a != null && a.a())
        {
            return j.h();
        }
        if (j1.d())
        {
            return j.a(j1.f());
        }
        if (j1.c())
        {
            return j.h();
        } else
        {
            return j1.b(b);
        }
    }

    public Object then(j j1)
        throws Exception
    {
        return a(j1);
    }

    Exception(j j1, f f1, i k)
    {
        c = j1;
        a = f1;
        b = k;
        super();
    }
}
