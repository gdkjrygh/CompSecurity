// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class agB
{

    public static String a(String s, String s1, String s2)
    {
        String s3 = s;
        if (s != null)
        {
            int i = s.indexOf(s1, 0);
            do
            {
                s3 = s;
                if (i < 0)
                {
                    break;
                }
                s = new StringBuffer((new StringBuilder()).append(s.substring(0, i)).append(s.substring(s1.length() + i)).toString());
                s.insert(i, s2);
                s = s.toString();
                i += s2.length();
                if (i < s.length())
                {
                    i = s.indexOf(s1, i);
                } else
                {
                    i = -1;
                }
            } while (true);
        }
        return s3;
    }
}
