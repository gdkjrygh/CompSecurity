// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class apw
    implements Appendable
{

    private final Appendable a;
    private boolean b;

    apw(Appendable appendable)
    {
        b = true;
        a = appendable;
    }

    private static CharSequence a(CharSequence charsequence)
    {
        Object obj = charsequence;
        if (charsequence == null)
        {
            obj = "";
        }
        return ((CharSequence) (obj));
    }

    public final Appendable append(char c)
    {
        boolean flag = false;
        if (b)
        {
            b = false;
            a.append("  ");
        }
        if (c == '\n')
        {
            flag = true;
        }
        b = flag;
        a.append(c);
        return this;
    }

    public final Appendable append(CharSequence charsequence)
    {
        charsequence = a(charsequence);
        return append(charsequence, 0, charsequence.length());
    }

    public final Appendable append(CharSequence charsequence, int i, int j)
    {
        boolean flag1 = false;
        charsequence = a(charsequence);
        if (b)
        {
            b = false;
            a.append("  ");
        }
        boolean flag = flag1;
        if (charsequence.length() > 0)
        {
            flag = flag1;
            if (charsequence.charAt(j - 1) == '\n')
            {
                flag = true;
            }
        }
        b = flag;
        a.append(charsequence, i, j);
        return this;
    }
}
