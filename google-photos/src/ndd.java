// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ndd
    implements Comparable
{

    public final nds a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public ndd(nds nds1, int i, int j, int k, int l)
    {
        a = nds1;
        b = i;
        c = j;
        d = k;
        e = l;
    }

    public final int compareTo(Object obj)
    {
        obj = (ndd)obj;
        return a.a(((ndd) (obj)).a);
    }

    public final boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (!(obj instanceof ndd))
        {
            return false;
        }
        obj = (ndd)obj;
        if (a != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((ndd) (obj)).a == null) goto _L1; else goto _L3
_L3:
        return false;
        if (a.equals(((ndd) (obj)).a)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public final int hashCode()
    {
        return a.hashCode();
    }

    public final String toString()
    {
        return a.toString();
    }
}
