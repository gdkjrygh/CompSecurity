// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class moc
{

    final onf a = new onf();
    final mnn b;

    moc(mnn mnn1)
    {
        b = mnn1;
        super();
    }

    void a(String s, Map map, String s1, String s2)
    {
        onf onf1 = a;
        s1 = String.valueOf(s1);
        String s3 = String.valueOf(s2);
        if (s3.length() != 0)
        {
            s1 = s1.concat(s3);
        } else
        {
            s1 = new String(s1);
        }
        map = String.valueOf(map.get(s1));
        onf1.println((new StringBuilder(String.valueOf(s).length() + 3 + String.valueOf(s2).length() + String.valueOf(map).length())).append(s).append(s2).append(" = ").append(map).toString());
    }

    void a(Map map)
    {
        Object obj = new ArrayList();
        map = map.keySet().iterator();
        do
        {
            if (!map.hasNext())
            {
                break;
            }
            String s = (String)map.next();
            if (s.startsWith("key."))
            {
                ((ArrayList) (obj)).add(s.substring(4));
            }
        } while (true);
        Collections.sort(((java.util.List) (obj)));
        obj = ((ArrayList) (obj)).iterator();
        while (((Iterator) (obj)).hasNext()) 
        {
            String s1 = (String)((Iterator) (obj)).next();
            int i = b.c(s1);
            if (i == -1)
            {
                map = "<INVALID_ID>";
            } else
            {
                try
                {
                    Object obj1 = b.a(i);
                    map = String.valueOf(((mmx) (obj1)).b("account_name"));
                    obj1 = String.valueOf(((mmx) (obj1)).b("effective_gaia_id"));
                    map = (new StringBuilder(String.valueOf(map).length() + 4 + String.valueOf(obj1).length())).append("(").append(map).append(", ").append(((String) (obj1))).append(")").toString();
                }
                // Misplaced declaration of an exception variable
                catch (Map map)
                {
                    map = "<ACCOUNT NOT FOUND>";
                }
            }
            a.println((new StringBuilder(String.valueOf(s1).length() + 29 + String.valueOf(map).length())).append("Account key '").append(s1).append("' = ").append(i).append(" ").append(map).toString());
        }
    }

    transient void a(Map map, ArrayList arraylist, String s, String as[])
    {
        int i = 0;
        while (i < 9) 
        {
            String s2 = as[i];
            a("  ", map, s, s2);
            String s1 = String.valueOf(s);
            s2 = String.valueOf(s2);
            if (s2.length() != 0)
            {
                s1 = s1.concat(s2);
            } else
            {
                s1 = new String(s1);
            }
            arraylist.remove(s1);
            i++;
        }
    }
}
