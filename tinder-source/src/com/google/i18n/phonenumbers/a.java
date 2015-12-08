// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.i18n.phonenumbers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.i18n.phonenumbers:
//            b, c

public final class a
{

    private static final Pattern A = Pattern.compile("\u2008");
    private static final Phonemetadata.PhoneMetadata v = (new Phonemetadata.PhoneMetadata()).a("NA");
    private static final Pattern w = Pattern.compile("\\[([^\\[\\]])*\\]");
    private static final Pattern x = Pattern.compile("\\d(?=[^,}][^,}])");
    private static final Pattern y = Pattern.compile("[-x\u2010-\u2015\u2212\u30FC\uFF0D-\uFF0F \240\255\u200B\u2060\u3000()\uFF08\uFF09\uFF3B\uFF3D.\\[\\]/~\u2053\u223C\uFF5E]*(\\$\\d[-x\u2010-\u2015\u2212\u30FC\uFF0D-\uFF0F \240\255\u200B\u2060\u3000()\uFF08\uFF09\uFF3B\uFF3D.\\[\\]/~\u2053\u223C\uFF5E]*)+");
    private static final Pattern z = Pattern.compile("[- ]");
    private c B;
    public String a;
    public StringBuilder b;
    public String c;
    public StringBuilder d;
    public StringBuilder e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public String j;
    public Phonemetadata.PhoneMetadata k;
    public Phonemetadata.PhoneMetadata l;
    public int m;
    public int n;
    public int o;
    public StringBuilder p;
    public boolean q;
    public String r;
    public StringBuilder s;
    public List t;
    private final b u = com.google.i18n.phonenumbers.b.a();

    a(String s1)
    {
        a = "";
        b = new StringBuilder();
        c = "";
        d = new StringBuilder();
        e = new StringBuilder();
        f = true;
        g = false;
        h = false;
        i = false;
        m = 0;
        n = 0;
        o = 0;
        p = new StringBuilder();
        q = false;
        r = "";
        s = new StringBuilder();
        t = new ArrayList();
        B = new c(64);
        j = s1;
        l = a(j);
        k = l;
    }

    private boolean a()
    {
        Iterator iterator = t.iterator();
_L8:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        String s1;
        Phonemetadata.NumberFormat numberformat;
        String s2;
        numberformat = (Phonemetadata.NumberFormat)iterator.next();
        s2 = numberformat.a;
        if (c.equals(s2))
        {
            return false;
        }
        s1 = numberformat.a;
        if (s1.indexOf('|') != -1) goto _L4; else goto _L3
_L3:
        boolean flag;
        s1 = w.matcher(s1).replaceAll("\\\\d");
        s1 = x.matcher(s1).replaceAll("\\\\d");
        b.setLength(0);
        String s3 = numberformat.b;
        Object obj = B.a(s1).matcher("999999999999999");
        ((Matcher) (obj)).find();
        obj = ((Matcher) (obj)).group();
        if (((String) (obj)).length() < s.length())
        {
            s1 = "";
        } else
        {
            s1 = ((String) (obj)).replaceAll(s1, s3).replaceAll("9", "\u2008");
        }
        if (s1.length() <= 0) goto _L4; else goto _L5
_L5:
        b.append(s1);
        flag = true;
_L7:
        if (flag)
        {
            c = s2;
            q = z.matcher(numberformat.d).find();
            m = 0;
            return true;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        flag = false;
        if (true) goto _L7; else goto _L6
_L6:
        iterator.remove();
          goto _L8
_L2:
        f = false;
        return false;
    }

    private String b()
    {
        f = true;
        i = false;
        t.clear();
        return d();
    }

    private String b(char c1)
    {
        Matcher matcher = A.matcher(b);
        if (matcher.find(m))
        {
            String s1 = matcher.replaceFirst(Character.toString(c1));
            b.replace(0, s1.length(), s1);
            m = matcher.start();
            return b.substring(0, m + 1);
        }
        if (t.size() == 1)
        {
            f = false;
        }
        c = "";
        return d.toString();
    }

    private void b(String s1)
    {
        int i1 = s1.length() - 3;
        Iterator iterator = t.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Phonemetadata.NumberFormat numberformat = (Phonemetadata.NumberFormat)iterator.next();
            if (numberformat.a() > i1 && !B.a((String)numberformat.c.get(i1)).matcher(s1).lookingAt())
            {
                iterator.remove();
            }
        } while (true);
    }

    private String c()
    {
        for (Iterator iterator = t.iterator(); iterator.hasNext();)
        {
            Phonemetadata.NumberFormat numberformat = (Phonemetadata.NumberFormat)iterator.next();
            Matcher matcher = B.a(numberformat.a).matcher(s);
            if (matcher.matches())
            {
                q = z.matcher(numberformat.d).find();
                return c(matcher.replaceAll(numberformat.b));
            }
        }

        return "";
    }

    private String c(String s1)
    {
        int i1 = p.length();
        if (q && i1 > 0 && p.charAt(i1 - 1) != ' ')
        {
            return (new StringBuilder()).append(new String(p)).append(' ').append(s1).toString();
        } else
        {
            return (new StringBuilder()).append(p).append(s1).toString();
        }
    }

    private String d()
    {
        if (s.length() >= 3)
        {
            String s1 = s.substring(0, 3);
            Object obj;
            boolean flag;
            if (h && l.a() > 0)
            {
                obj = l.g;
            } else
            {
                obj = l.f;
            }
            flag = l.c;
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                Phonemetadata.NumberFormat numberformat = (Phonemetadata.NumberFormat)((Iterator) (obj)).next();
                if (!flag || h || numberformat.e || com.google.i18n.phonenumbers.b.a(numberformat.d))
                {
                    String s2 = numberformat.b;
                    if (y.matcher(s2).matches())
                    {
                        t.add(numberformat);
                    }
                }
            } while (true);
            b(s1);
            obj = c();
            if (((String) (obj)).length() > 0)
            {
                return ((String) (obj));
            }
            if (a())
            {
                return e();
            } else
            {
                return d.toString();
            }
        } else
        {
            return c(s.toString());
        }
    }

    private String e()
    {
        int j1 = s.length();
        if (j1 > 0)
        {
            String s1 = "";
            for (int i1 = 0; i1 < j1; i1++)
            {
                s1 = b(s.charAt(i1));
            }

            if (f)
            {
                return c(s1);
            } else
            {
                return d.toString();
            }
        } else
        {
            return p.toString();
        }
    }

    private String f()
    {
        int i1;
        boolean flag = true;
        String s1;
        if (l.a == 1 && s.charAt(0) == '1' && s.charAt(1) != '0' && s.charAt(1) != '1')
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 == 0) goto _L2; else goto _L1
_L1:
        p.append('1').append(' ');
        h = true;
        i1 = ((flag) ? 1 : 0);
_L4:
        s1 = s.substring(0, i1);
        s.delete(0, i1);
        return s1;
_L2:
        if (l.d)
        {
            Matcher matcher = B.a(l.e).matcher(s);
            if (matcher.lookingAt() && matcher.end() > 0)
            {
                h = true;
                i1 = matcher.end();
                p.append(s.substring(0, i1));
                continue; /* Loop/switch isn't completed */
            }
        }
        i1 = 0;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private boolean g()
    {
        Matcher matcher = B.a((new StringBuilder("\\+|")).append(l.b).toString()).matcher(e);
        if (matcher.lookingAt())
        {
            h = true;
            int i1 = matcher.end();
            s.setLength(0);
            s.append(e.substring(i1));
            p.setLength(0);
            p.append(e.substring(0, i1));
            if (e.charAt(0) != '+')
            {
                p.append(' ');
            }
            return true;
        } else
        {
            return false;
        }
    }

    private boolean h()
    {
        if (s.length() != 0) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Object obj;
        int i1;
        obj = new StringBuilder();
        i1 = u.a(s, ((StringBuilder) (obj)));
        if (i1 == 0) goto _L1; else goto _L3
_L3:
        s.setLength(0);
        s.append(((CharSequence) (obj)));
        obj = u.b(i1);
        if (!"001".equals(obj)) goto _L5; else goto _L4
_L4:
        l = u.a(i1);
_L7:
        obj = Integer.toString(i1);
        p.append(((String) (obj))).append(' ');
        return true;
_L5:
        if (!((String) (obj)).equals(j))
        {
            l = a(((String) (obj)));
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final Phonemetadata.PhoneMetadata a(String s1)
    {
        Object obj = u;
        int i1;
        if (!((b) (obj)).b(s1))
        {
            Logger logger = b.a;
            Level level = Level.WARNING;
            StringBuilder stringbuilder = new StringBuilder("Invalid or missing region code (");
            obj = s1;
            if (s1 == null)
            {
                obj = "null";
            }
            logger.log(level, stringbuilder.append(((String) (obj))).append(") provided.").toString());
            i1 = 0;
        } else
        {
            obj = ((b) (obj)).c(s1);
            if (obj == null)
            {
                throw new IllegalArgumentException((new StringBuilder("Invalid region code: ")).append(s1).toString());
            }
            i1 = ((Phonemetadata.PhoneMetadata) (obj)).a;
        }
        s1 = u.b(i1);
        s1 = u.c(s1);
        if (s1 != null)
        {
            return s1;
        } else
        {
            return v;
        }
    }

    public final String a(char c1)
    {
        String s1;
        boolean flag2;
        flag2 = true;
        d.append(c1);
        boolean flag;
        if (Character.isDigit(c1) || d.length() == 1 && b.b.matcher(Character.toString(c1)).matches())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            f = false;
            g = true;
        } else
        if (c1 == '+')
        {
            e.append(c1);
        } else
        {
            c1 = Character.forDigit(Character.digit(c1, 10), 10);
            e.append(c1);
            s.append(c1);
        }
        if (f) goto _L2; else goto _L1
_L1:
        if (!g) goto _L4; else goto _L3
_L3:
        s1 = d.toString();
_L13:
        a = s1;
        return a;
_L4:
        if (g())
        {
            if (h())
            {
                s1 = b();
                continue; /* Loop/switch isn't completed */
            }
        } else
        {
            if (r.length() > 0)
            {
                s.insert(0, r);
                int i1 = p.lastIndexOf(r);
                p.setLength(i1);
            }
            boolean flag1;
            if (!r.equals(f()))
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
            if (flag1)
            {
                p.append(' ');
                s1 = b();
                continue; /* Loop/switch isn't completed */
            }
        }
        s1 = d.toString();
        continue; /* Loop/switch isn't completed */
_L2:
        e.length();
        JVM INSTR tableswitch 0 3: default 316
    //                   0 366
    //                   1 366
    //                   2 366
    //                   3 377;
           goto _L5 _L6 _L6 _L6 _L7
_L5:
        if (i)
        {
            if (h())
            {
                i = false;
            }
            s1 = (new StringBuilder()).append(p).append(s.toString()).toString();
            break; /* Loop/switch isn't completed */
        }
          goto _L8
_L6:
        s1 = d.toString();
        break; /* Loop/switch isn't completed */
_L7:
        if (!g())
        {
            break; /* Loop/switch isn't completed */
        }
        i = true;
        if (true) goto _L5; else goto _L9
_L9:
        r = f();
_L11:
        s1 = d();
        break; /* Loop/switch isn't completed */
_L8:
        if (t.size() <= 0) goto _L11; else goto _L10
_L10:
        String s3 = b(c1);
        String s2 = c();
        s1 = s2;
        if (s2.length() <= 0)
        {
            b(s.toString());
            if (a())
            {
                s1 = e();
            } else
            if (f)
            {
                s1 = c(s3);
            } else
            {
                s1 = d.toString();
            }
        }
        if (true) goto _L13; else goto _L12
_L12:
    }

}
