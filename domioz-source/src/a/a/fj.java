// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;


// Referenced classes of package a.a:
//            eq, fb, fi, es

final class fj extends eq
{

    final fb b;
    final fi c;

    fj(fi fi, fb fb1)
    {
        c = fi;
        b = fb1;
        super();
    }

    final es c()
    {
        return c;
    }

    public final Object get(int i)
    {
        return ((java.util.Map.Entry)b.get(i)).getKey();
    }
}
