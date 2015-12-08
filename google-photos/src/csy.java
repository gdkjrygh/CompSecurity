// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class csy extends Exception
{

    csy(String s)
    {
        super(s);
    }

    public static csy a(String s)
    {
        return new csy((new StringBuilder(String.valueOf(s).length() + 14)).append("Field ").append(s).append(" missing").toString());
    }

    public static csy a(String s, String s1)
    {
        return new csy((new StringBuilder(String.valueOf(s).length() + 25 + String.valueOf(s1).length())).append("Field ").append(s).append(" has invalid value ").append(s1).toString());
    }

    public static csy a(String s, String s1, String s2)
    {
        return new csy((new StringBuilder(String.valueOf(s).length() + 36 + String.valueOf(s2).length() + String.valueOf(s1).length())).append("Field ").append(s).append(" for track ").append(s2).append(" has invalid value ").append(s1).toString());
    }
}
