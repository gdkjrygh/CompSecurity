// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class alB extends IllegalArgumentException
{

    public String a;

    public alB(alu alu1, Number number, Number number1, Number number2)
    {
        super(a(alu1.a, number, number1, number2, null));
        alu1 = alu1.a;
        a = super.getMessage();
    }

    public alB(alu alu1, Number number, String s)
    {
        super(a(alu1.a, number, null, null, s));
        alu1 = alu1.a;
        a = super.getMessage();
    }

    public alB(alu alu1, String s)
    {
        String s1 = alu1.a;
        StringBuffer stringbuffer = new StringBuffer("Value ");
        if (s == null)
        {
            stringbuffer.append("null");
        } else
        {
            stringbuffer.append('"');
            stringbuffer.append(s);
            stringbuffer.append('"');
        }
        stringbuffer.append(" for ").append(s1).append(' ').append("is not supported");
        super(stringbuffer.toString());
        alu1 = alu1.a;
        a = super.getMessage();
    }

    private static String a(String s, Number number, Number number1, Number number2, String s1)
    {
        s = (new StringBuilder("Value ")).append(number).append(" for ").append(s).append(' ');
        if (number1 == null)
        {
            if (number2 == null)
            {
                s.append("is not supported");
            } else
            {
                s.append("must not be larger than ").append(number2);
            }
        } else
        if (number2 == null)
        {
            s.append("must not be smaller than ").append(number1);
        } else
        {
            s.append("must be in the range [").append(number1).append(',').append(number2).append(']');
        }
        if (s1 != null)
        {
            s.append(": ").append(s1);
        }
        return s.toString();
    }

    public final String getMessage()
    {
        return a;
    }
}
