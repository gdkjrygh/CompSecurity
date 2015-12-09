// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ce;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package p.ce:
//            e

public static class .String
{

    private static Pattern a = Pattern.compile("\\@");
    private static Pattern b = Pattern.compile("[\\/\\-\\_\\+\\*\\&]");
    private static Pattern c = Pattern.compile("\\$");
    private static Pattern d = Pattern.compile("\\%");
    private static Pattern e = Pattern.compile("\\s+");
    private static Pattern f = Pattern.compile("\\.");
    private static Pattern g = Pattern.compile("[^1234567890abcdefghijklmnopqrstuvwxyz ]");
    private static Pattern h = Pattern.compile("[^1234567890abcdefghijklmnopqrstuvwxyz\\(\\)\\. ]");
    private static Pattern i[];
    private static String j[] = {
        "\\sthe\\s", "\\sa\\s", "\\san\\s", "\\sand\\s"
    };
    private static Pattern k[];
    private static String l[][];

    public static String a(String s)
    {
        return b((new StringBuilder()).append("Artist").append(c(s)).toString());
    }

    public static String a(String s, String s1)
    {
        return b((new StringBuilder()).append("Album").append(c(s)).append(c(s1)).toString());
    }

    public static String a(String s, boolean flag)
    {
        return a(s, flag, false);
    }

    public static String a(String s, boolean flag, boolean flag1)
    {
        boolean flag2 = false;
        if (s != null) goto _L2; else goto _L1
_L1:
        String s1 = null;
_L4:
        return s1;
_L2:
        s = s.trim().toLowerCase();
        s = a.matcher(s).replaceAll(" at ");
        s = c.matcher(s).replaceAll("s");
        s = d.matcher(s).replaceAll(" percent ");
        s = b.matcher(s).replaceAll(" ");
        if (flag1)
        {
            s = h.matcher(s).replaceAll("");
            s = f.matcher(s).replaceAll(" ");
        } else
        {
            s = g.matcher(s).replaceAll("");
        }
        s = e.matcher(s).replaceAll("  ");
        s1 = (new StringBuilder()).append("  ").append(s.trim()).append("  ").toString();
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        s = new String(s1);
        for (int i1 = 0; i1 < i.length; i1++)
        {
            s = i[i1].matcher(s).replaceAll(" ");
        }

        s = s.trim();
        if (s.length() <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        s = (new StringBuilder()).append("  ").append(s).append("  ").toString();
_L5:
        int j1;
        for (j1 = ((flag2) ? 1 : 0); j1 < l.length; j1++)
        {
            s = k[j1].matcher(s).replaceAll(l[j1][1]);
        }

        if (flag1)
        {
            s = e.matcher(s).replaceAll("").trim();
        } else
        {
            s = e.matcher(s).replaceAll(" ").trim();
        }
        s1 = s;
        if (!flag1)
        {
            return (new StringBuilder()).append("  ").append(s).append("  ").toString();
        }
        if (true) goto _L4; else goto _L3
_L3:
        s = s1;
        j1 = ((flag2) ? 1 : 0);
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    public static String b(String s)
    {
        Object obj;
        String s1;
        int i1;
        try
        {
            obj = MessageDigest.getInstance("MD5");
            ((MessageDigest) (obj)).reset();
            ((MessageDigest) (obj)).update(s.getBytes());
            s = ((MessageDigest) (obj)).digest();
            obj = new StringBuffer();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException("MD5 algorithm unavailable for identity creation!", s);
        }
        i1 = 0;
        if (i1 >= s.length)
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = Integer.toHexString(s[i1] & 0xff);
        if (s1.length() == 1)
        {
            ((StringBuffer) (obj)).append('0');
        }
        ((StringBuffer) (obj)).append(s1);
        i1++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_34;
_L1:
        s = ((StringBuffer) (obj)).toString();
        return s;
    }

    public static String b(String s, String s1)
    {
        return b((new StringBuilder()).append("Song").append(c(s)).append(c(s1)).toString());
    }

    public static String c(String s)
    {
        return a(s, true);
    }

    static 
    {
        boolean flag = false;
        String as[] = {
            "\\sone\\s", " 1 "
        };
        String as1[] = {
            "\\sfour\\s", " 4 "
        };
        String as2[] = {
            "\\sfive\\s", " 5 "
        };
        String as3[] = {
            "\\snine\\s", " 9 "
        };
        String as4[] = {
            "\\sten\\s", " 10 "
        };
        String as5[] = {
            "\\stwelve\\s", " 12 "
        };
        String as6[] = {
            "\\sthirteen\\s", " 13 "
        };
        String as7[] = {
            "\\ssixteen\\s", " 16 "
        };
        String as8[] = {
            "\\sseventeen\\s", " 17 "
        };
        String as9[] = {
            "\\seighteen\\s", " 18 "
        };
        String as10[] = {
            "\\sfifty\\s", " 50 "
        };
        String as11[] = {
            "\\ssixty\\s", " 60 "
        };
        String as12[] = {
            "\\sseventy\\s", " 70 "
        };
        String as13[] = {
            "\\sfourth\\s", " 4th "
        };
        String as14[] = {
            "\\ssixth\\s", " 6th "
        };
        String as15[] = {
            "\\stwelveth\\s", " 12th "
        };
        String as16[] = {
            "\\svi\\s", " 6 "
        };
        l = (new String[][] {
            new String[] {
                "\\szero\\s", " 0 "
            }, as, new String[] {
                "\\stwo\\s", " 2 "
            }, new String[] {
                "\\sthree\\s", " 3 "
            }, as1, as2, new String[] {
                "\\ssix\\s", " 6 "
            }, new String[] {
                "\\sseven\\s", " 7 "
            }, new String[] {
                "\\seight\\s", " 8 "
            }, as3, as4, new String[] {
                "\\seleven\\s", " 11 "
            }, as5, as6, new String[] {
                "\\sforteen\\s", " 14 "
            }, new String[] {
                "\\sfifteen\\s", " 15 "
            }, as7, as8, as9, new String[] {
                "\\snineteen\\s", " 19 "
            }, new String[] {
                "\\stwenty\\s", " 20 "
            }, new String[] {
                "\\sthirty\\s", " 30 "
            }, new String[] {
                "\\sforty\\s", " 40 "
            }, as10, as11, as12, new String[] {
                "\\seighty\\s", " 80 "
            }, new String[] {
                "\\sninety\\s", " 90 "
            }, new String[] {
                "\\sfirst\\s", " 1st "
            }, new String[] {
                "\\ssecond\\s", " 2nd "
            }, new String[] {
                "\\sthird\\s", " 3rd "
            }, as13, new String[] {
                "\\sfifth\\s", " 5th "
            }, as14, new String[] {
                "\\sseventh\\s", " 7th "
            }, new String[] {
                "\\seighth\\s", " 8th "
            }, new String[] {
                "\\snineth\\s", " 9th "
            }, new String[] {
                "\\stenth\\s", " 10th "
            }, new String[] {
                "\\seleventh\\s", " 11th "
            }, as15, new String[] {
                "\\sii\\s", " 2 "
            }, new String[] {
                "\\siii\\s", " 3 "
            }, new String[] {
                "\\siv\\s", " 4 "
            }, new String[] {
                "\\sv\\s", " 5 "
            }, as16, new String[] {
                "\\svii\\s", " 7 "
            }, new String[] {
                "\\sviii\\s", " 8 "
            }, new String[] {
                "\\smister\\s", " mr "
            }, new String[] {
                "\\sjunior\\s", " jr "
            }, new String[] {
                "\\sdoctor\\s", " dr "
            }
        });
        k = new Pattern[l.length];
        for (int i1 = 0; i1 < l.length; i1++)
        {
            k[i1] = Pattern.compile(l[i1][0]);
        }

        i = new Pattern[j.length];
        for (int j1 = ((flag) ? 1 : 0); j1 < j.length; j1++)
        {
            i[j1] = Pattern.compile(j[j1]);
        }

    }
}
