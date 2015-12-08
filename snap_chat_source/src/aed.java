// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class aed extends aec
{

    final adF a;

    public final String ag_()
    {
        return a.toString();
    }

    protected final int b(aec aec1)
    {
        return a.a(((aed)aec1).a);
    }

    public final String e()
    {
        return "annotation";
    }

    public final boolean equals(Object obj)
    {
        if (!(obj instanceof aed))
        {
            return false;
        } else
        {
            return a.equals(((aed)obj).a);
        }
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
