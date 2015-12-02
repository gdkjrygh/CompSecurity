// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class bre
{

    private String a;
    private String b;

    private bre()
    {
    }

    protected bre(String s)
    {
        this();
        a = s;
        b = null;
    }

    protected bre(String s, String s1)
    {
        this();
        a = s;
        b = s1;
    }

    public final String a()
    {
        return a;
    }

    public String toString()
    {
        return (new StringBuilder("ErrorBase[errorCode=")).append(a).append(" errorMsgShort=").append(b).append("]").toString();
    }
}
