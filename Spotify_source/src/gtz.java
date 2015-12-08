// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gtz
{

    public static int a(String s, int i)
    {
        do
        {
            if (i >= s.length())
            {
                break;
            }
            char c = s.charAt(i);
            if (c != ' ' && c != '\t')
            {
                break;
            }
            i++;
        } while (true);
        return i;
    }

    public static int a(String s, int i, String s1)
    {
        for (; i < s.length() && s1.indexOf(s.charAt(i)) == -1; i++) { }
        return i;
    }

    public static int b(String s, int i)
    {
        long l;
        try
        {
            l = Long.parseLong(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return i;
        }
        if (l > 0x7fffffffL)
        {
            return 0x7fffffff;
        }
        if (l < 0L)
        {
            return 0;
        } else
        {
            return (int)l;
        }
    }
}
