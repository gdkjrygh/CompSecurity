// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class coc
{

    public final String a;

    public coc(String s)
    {
        a = (String)b.a(s, "name", null);
    }

    public final boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof coc))
        {
            return false;
        } else
        {
            return ((coc)obj).a.equals(a);
        }
    }

    public final int hashCode()
    {
        return a.hashCode();
    }
}
