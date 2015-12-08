// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ajx
{

    public aif a;
    private int b;

    public ajx()
    {
        b = 0;
        a = aif.a();
    }

    public ajx(int i, aif aif1)
    {
        b = i;
        a = aif1;
    }

    public final String a(String s, String s1)
    {
        s1 = (new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(s1).length())).append(s).append(" ").append(s1).toString();
        String s2;
        if (a())
        {
            s = "required";
        } else
        {
            s = "optional";
        }
        s2 = a.toString();
        return (new StringBuilder(String.valueOf(s).length() + 3 + String.valueOf(s1).length() + String.valueOf(s2).length())).append(s).append(" ").append(s1).append(": ").append(s2).toString();
    }

    public final boolean a()
    {
        return (b & 2) != 0;
    }
}
