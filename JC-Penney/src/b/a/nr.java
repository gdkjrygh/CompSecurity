// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            pq

public abstract class nr
    implements pq, Comparable
{

    public nr()
    {
    }

    public final int a(nr nr1)
    {
        Class class1 = getClass();
        Class class2 = nr1.getClass();
        if (class1 != class2)
        {
            return class1.getName().compareTo(class2.getName());
        } else
        {
            return b(nr1);
        }
    }

    protected abstract int b(nr nr1);

    public final int compareTo(Object obj)
    {
        return a((nr)obj);
    }

    public abstract String e();
}
