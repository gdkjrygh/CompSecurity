// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            pq, ol, iu

public final class jz
    implements pq, Comparable
{

    final ol a;
    iu b;

    public final int compareTo(Object obj)
    {
        obj = (jz)obj;
        return a.a(((jz) (obj)).a);
    }

    public final boolean equals(Object obj)
    {
        if (!(obj instanceof jz))
        {
            return false;
        } else
        {
            return a.equals(((jz)obj).a);
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
