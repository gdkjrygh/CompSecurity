// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jmy extends jmx
{

    public jmy(String s, jms jms)
    {
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s = "Invalid content type: ".concat(s);
        } else
        {
            s = new String("Invalid content type: ");
        }
        super(s, jms);
    }
}
