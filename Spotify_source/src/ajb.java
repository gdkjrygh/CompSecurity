// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.comscore.applications.EventType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class ajb extends ajd
{

    protected ajb(aif aif, EventType eventtype, String s)
    {
        super(aif, eventtype, s);
    }

    public static Boolean a(String s)
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

    public static String a(String s, String s1)
    {
        s1 = new StringBuilder(s1);
        for (s = c(s).iterator(); s.hasNext();)
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

    private static Boolean b(String s)
    {
        for (int i = 0; i < s.length(); i++)
        {
            if (!"0123456789".contains((new StringBuilder()).append(s.charAt(i)).toString()))
            {
                return Boolean.valueOf(false);
            }
        }

        return Boolean.valueOf(true);
    }

    private static List c(String s)
    {
        s = s.split(",");
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < s.length; i++)
        {
            arraylist.add(s[i]);
        }

        return arraylist;
    }

    public final List a()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = a.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ajf ajf1 = (ajf)iterator.next();
            if (ajf1.c.booleanValue())
            {
                arraylist.add(ajf1);
            }
        } while (true);
        return arraylist;
    }

    public final void a(List list)
    {
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            Object obj = (ajf)list.next();
            Object obj1 = (ajf)a.get(((ajf) (obj)).a);
            if (obj1 == null)
            {
                if (a(((ajf) (obj)).b).booleanValue())
                {
                    obj1 = a(((ajf) (obj)).b, "");
                    a(((ajf) (obj)).a, ((String) (obj1)), Boolean.valueOf(true));
                } else
                {
                    a(((ajf) (obj)));
                }
            } else
            if (b(((ajf) (obj1)).b).booleanValue() && b(((ajf) (obj)).b).booleanValue())
            {
                int i = Integer.valueOf(((ajf) (obj1)).b).intValue();
                int j = Integer.valueOf(((ajf) (obj)).b).intValue();
                a(((ajf) (obj1)).a, Integer.valueOf(j + i).toString(), Boolean.valueOf(true));
            } else
            if (a(((ajf) (obj)).b).booleanValue())
            {
                obj1 = a(((ajf) (obj)).b, ((ajf) (obj1)).b);
                a(((ajf) (obj)).a, ((String) (obj1)), Boolean.valueOf(true));
            } else
            if (!Boolean.valueOf(((ajf) (obj1)).b.contains(((ajf) (obj)).b)).booleanValue())
            {
                obj = (new StringBuilder()).append(((ajf) (obj1)).b).append(",").append(((ajf) (obj)).b).toString();
                a(((ajf) (obj1)).a, ((String) (obj)), Boolean.valueOf(true));
            }
        } while (true);
    }
}
