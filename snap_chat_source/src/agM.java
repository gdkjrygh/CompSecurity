// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;

public final class agM
{

    public static String a(String s, char c1)
    {
        s = s.trim();
        if (s.charAt(0) == c1)
        {
            s = s.substring(1, s.length());
            if (s.charAt(s.length() - 1) == c1)
            {
                return s.substring(0, s.length() - 1);
            } else
            {
                throw new agK("Value does not end with a quote.");
            }
        } else
        {
            throw new agK("Value does not start with a quote.");
        }
    }

    public static ArrayList a(String s)
    {
        ArrayList arraylist = new ArrayList();
        try
        {
            for (s = new agy(s); s.a(); arraylist.add(new Double(s.b().trim()))) { }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new agK("Invalid values in string.", s);
        }
        return arraylist;
    }

    public static ArrayList b(String s)
    {
        ArrayList arraylist = new ArrayList();
        try
        {
            for (s = new agy(s); s.a(); arraylist.add(s.b())) { }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new agK("Invalid values in string.", s);
        }
        return arraylist;
    }

    public static ArrayList c(String s)
    {
        ArrayList arraylist;
        int i;
        arraylist = new ArrayList();
        try
        {
            s = new agy(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new agK("Invalid values in string.", s);
        }
        i = 0;
_L2:
        if (!s.a())
        {
            break MISSING_BLOCK_LABEL_101;
        }
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        arraylist.add(s.b());
        break MISSING_BLOCK_LABEL_103;
        if (i != 1)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        arraylist.add(new Integer((new Double(s.b().trim())).intValue()));
        break MISSING_BLOCK_LABEL_103;
        throw new agK("Invalid values in string.");
        return arraylist;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static ArrayList d(String s)
    {
        ArrayList arraylist;
        int i;
        arraylist = new ArrayList();
        try
        {
            s = new agy(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new agK("Invalid values in string.", s);
        }
        i = 0;
_L2:
        if (!s.a())
        {
            break MISSING_BLOCK_LABEL_106;
        }
        if (i != 0 && i != 1)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        arraylist.add(s.b());
        break MISSING_BLOCK_LABEL_108;
        if (i != 2)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        arraylist.add(new Integer((new Double(s.b().trim())).intValue()));
        break MISSING_BLOCK_LABEL_108;
        throw new agK("Invalid values in string.");
        return arraylist;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static ArrayList e(String s)
    {
        ArrayList arraylist;
        int i;
        arraylist = new ArrayList();
        try
        {
            s = new agy(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new agK("Invalid values in string.", s);
        }
        i = 0;
_L6:
        if (!s.a()) goto _L2; else goto _L1
_L1:
        if (i != 0) goto _L4; else goto _L3
_L3:
        arraylist.add(s.b().trim());
          goto _L5
_L7:
        arraylist.add(new Integer((new Double(s.b().trim())).intValue()));
          goto _L5
_L8:
        throw new agK("Invalid values in string.");
_L2:
        return arraylist;
_L5:
        i++;
          goto _L6
_L4:
        if (i != 1 && i != 2) goto _L8; else goto _L7
    }
}
