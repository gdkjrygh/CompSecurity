// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class atf
    implements atc
{

    private final String a;

    public atf(String s)
    {
        a = s;
    }

    public final String a()
    {
        return a;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof atf)
        {
            obj = (atf)obj;
            return a.equals(((atf) (obj)).a);
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        return a.hashCode();
    }

    public final String toString()
    {
        String s = String.valueOf("StringHeaderFactory{value='");
        String s1 = a;
        return (new StringBuilder(String.valueOf(s).length() + 2 + String.valueOf(s1).length())).append(s).append(s1).append("'}").toString();
    }
}
