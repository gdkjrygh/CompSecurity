// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.as;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p.aq.b;

// Referenced classes of package p.as:
//            c, d

public class a extends c
{

    protected a(b b1, d d1, String s)
    {
        super(b1, d1, s);
    }

    private Boolean b(String s, String s1)
    {
        return Boolean.valueOf(s.contains(s1));
    }

    private Boolean c(String s)
    {
        for (int i = 0; i < s.length(); i++)
        {
            if (!"0123456789".contains((new StringBuilder()).append("").append(s.charAt(i)).toString()))
            {
                return Boolean.valueOf(false);
            }
        }

        return Boolean.valueOf(true);
    }

    private String c(String s, String s1)
    {
        s1 = new StringBuilder(s1);
        for (s = e(s).iterator(); s.hasNext();)
        {
            String s2 = (String)s.next();
            if (!s1.toString().contains(s2))
            {
                if (s1.toString().equals(""))
                {
                    s1.append(s2).append(":1");
                } else
                {
                    s1.append(";").append(s2).append(":1");
                }
            } else
            {
                String as[] = s1.toString().split(";");
                int i = 0;
                while (i < as.length) 
                {
                    if (as[i].contains(s2))
                    {
                        String as1[] = as[i].split(":");
                        int j = Integer.valueOf(as1[1]).intValue();
                        String s3 = (new StringBuilder()).append(as1[0]).append(":").append(Integer.valueOf(j + 1)).toString();
                        s1.replace(s1.indexOf(as[i]), s1.indexOf(as[i]) + as[i].length(), s3);
                    }
                    i++;
                }
            }
        }

        return s1.toString();
    }

    private Boolean d(String s)
    {
        if (s == null)
        {
            return Boolean.valueOf(false);
        }
        if (!s.contains(","))
        {
            return Boolean.valueOf(false);
        }
        if (!s.contains(" "))
        {
            return Boolean.valueOf(true);
        } else
        {
            return Boolean.valueOf(false);
        }
    }

    private List e(String s)
    {
        s = s.split(",");
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < s.length; i++)
        {
            arraylist.add(s[i]);
        }

        return arraylist;
    }

    public List a()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = a.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            p.at.a a1 = (p.at.a)iterator.next();
            if (a1.c.booleanValue())
            {
                arraylist.add(a1);
            }
        } while (true);
        return arraylist;
    }

    public void a(List list)
    {
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            Object obj = (p.at.a)list.next();
            Object obj1 = (p.at.a)a.get(((p.at.a) (obj)).a);
            if (obj1 == null)
            {
                if (d(((p.at.a) (obj)).b).booleanValue())
                {
                    obj1 = c(((p.at.a) (obj)).b, "");
                    a(((p.at.a) (obj)).a, ((String) (obj1)), Boolean.valueOf(true));
                } else
                {
                    b(((p.at.a) (obj)));
                }
            } else
            if (c(((p.at.a) (obj1)).b).booleanValue() && c(((p.at.a) (obj)).b).booleanValue())
            {
                int i = Integer.valueOf(((p.at.a) (obj1)).b).intValue();
                int j = Integer.valueOf(((p.at.a) (obj)).b).intValue();
                a(((p.at.a) (obj1)).a, Integer.valueOf(j + i).toString(), Boolean.valueOf(true));
            } else
            if (d(((p.at.a) (obj)).b).booleanValue())
            {
                obj1 = c(((p.at.a) (obj)).b, ((p.at.a) (obj1)).b);
                a(((p.at.a) (obj)).a, ((String) (obj1)), Boolean.valueOf(true));
            } else
            if (!b(((p.at.a) (obj1)).b, ((p.at.a) (obj)).b).booleanValue())
            {
                obj = (new StringBuilder()).append(((p.at.a) (obj1)).b).append(",").append(((p.at.a) (obj)).b).toString();
                a(((p.at.a) (obj1)).a, ((String) (obj)), Boolean.valueOf(true));
            }
        } while (true);
    }

    public void b()
    {
        Object obj = new ArrayList();
        Iterator iterator = a.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            p.at.a a2 = (p.at.a)iterator.next();
            if (d(a2.b).booleanValue())
            {
                ((ArrayList) (obj)).add(a2);
            }
        } while (true);
        p.at.a a1;
        for (obj = ((ArrayList) (obj)).iterator(); ((Iterator) (obj)).hasNext(); a(a1.a, c(a1.b, ""), Boolean.valueOf(true)))
        {
            a1 = (p.at.a)((Iterator) (obj)).next();
        }

    }
}
