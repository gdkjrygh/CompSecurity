// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public abstract class cbh
{

    public static final cbh a = new cbh() {

        public final String a(String s, String s1)
        {
            return s1;
        }

    };
    public static final cbh b = new cbh() {

        public final String a(String s, String s1)
        {
            if (s != null)
            {
                return s;
            } else
            {
                return s1;
            }
        }

    };
    public static final cbh c = new cbh() {

        private static String a(String s)
        {
            if (!TextUtils.isEmpty(s))
            {
                int i = 0;
                int k = s.length();
                int j;
                do
                {
                    j = k;
                    if (i >= s.length())
                    {
                        break;
                    }
                    j = k;
                    if (s.charAt(i) != ',')
                    {
                        break;
                    }
                    i++;
                } while (true);
                for (; j > 0 && s.charAt(j - 1) == ','; j--) { }
                if (i != 0 || j != s.length())
                {
                    return s.substring(i, j);
                }
            }
            return s;
        }

        public final String a(String s, String s1)
        {
            s = a(s);
            s1 = a(s1);
            if (TextUtils.isEmpty(s))
            {
                return s1;
            }
            if (TextUtils.isEmpty(s1))
            {
                return s;
            } else
            {
                return (new StringBuilder()).append(s).append(",").append(s1).toString();
            }
        }

    };

    public cbh()
    {
    }

    public abstract String a(String s, String s1);

}
