// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;


// Referenced classes of package a.a:
//            eq, fb, fk, es

final class fl extends eq
{

    final fb b;
    final fk c;

    fl(fk fk, fb fb1)
    {
        c = fk;
        b = fb1;
        super();
    }

    final es c()
    {
        return c;
    }

    public final Object get(int i)
    {
        return ((java.util.Map.Entry)b.get(i)).getValue();
    }
}
