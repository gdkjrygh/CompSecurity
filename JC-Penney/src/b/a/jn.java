// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            pq, ob, iu

public final class jn
    implements pq, Comparable
{

    final ob a;
    iu b;

    public final int compareTo(Object obj)
    {
        obj = (jn)obj;
        return a.a(((jn) (obj)).a);
    }

    public final boolean equals(Object obj)
    {
        if (!(obj instanceof jn))
        {
            return false;
        } else
        {
            return a.equals(((jn)obj).a);
        }
    }

    public final String h_()
    {
        return (new StringBuilder()).append(a.h_()).append(": ").append(b).toString();
    }

    public final int hashCode()
    {
        return a.hashCode();
    }
}
