// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class alr
{

    private static boolean a[];
    private static boolean b[];

    public static boolean a(String s)
    {
        boolean flag1 = true;
        if (s.length() <= 0) goto _L2; else goto _L1
_L1:
        boolean flag;
        char c = s.charAt(0);
        if (c > '\377' || a[c])
        {
            c = '\001';
        } else
        {
            c = '\0';
        }
        if (c && s.charAt(0) != ':') goto _L2; else goto _L3
_L3:
        flag = false;
_L5:
        return flag;
_L2:
        int i = 1;
        do
        {
            flag = flag1;
            if (i >= s.length())
            {
                continue;
            }
            char c1 = s.charAt(i);
            if (c1 > '\377' || b[c1])
            {
                c1 = '\001';
            } else
            {
                c1 = '\0';
            }
            if (!c1 || s.charAt(i) == ':')
            {
                return false;
            }
            i++;
        } while (true);
        if (true) goto _L5; else goto _L4
_L4:
    }

    static 
    {
        b = new boolean[256];
        a = new boolean[256];
        char c = '\0';
        while (c < b.length) 
        {
            boolean aflag[] = a;
            boolean flag;
            if (97 <= c && c <= 122 || 65 <= c && c <= 90 || c == 58 || c == 95 || 192 <= c && c <= 214 || 216 <= c && c <= 246)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            aflag[c] = flag;
            aflag = b;
            if (97 <= c && c <= 122 || 65 <= c && c <= 90 || 48 <= c && c <= 57 || c == 58 || c == 95 || c == 45 || c == 46 || c == 183 || 192 <= c && c <= 214 || 216 <= c && c <= 246)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            aflag[c] = flag;
            c++;
        }
    }
}
