// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class aon
{

    public final String a;
    public final List b;
    public final String c;

    aon(String s, List list, String s1)
    {
        a = s;
        b = Collections.unmodifiableList(list);
        c = s1;
    }

    public static aoi a(List list, String s, aoi.a a1)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            aoi aoi1 = (aoi)list.next();
            if (aoi1.a.equals(s) && aoi1.d == a1)
            {
                return aoi1;
            }
        }

        return null;
    }

    static boolean a(List list, aoi aoi1)
    {
        boolean flag;
        if (aoi1.d == aoi.a.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        anR.b(flag, "Must not be PURCHASED");
        for (int i = 1; i < list.size(); i++)
        {
            if (((aoi)list.get(i)).a.equals(aoi1.a))
            {
                return true;
            }
        }

        return false;
    }

    static boolean b(List list, aoi aoi1)
    {
        boolean flag;
        if (aoi1.d == aoi.a.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        anR.a(flag, "Must be PURCHASED");
        for (int i = 1; i < list.size(); i++)
        {
            aoi aoi2 = (aoi)list.get(i);
            if (aoi2.a.equals(aoi1.a))
            {
                static final class _cls1
                {

                    static final int a[];

                    static 
                    {
                        a = new int[aoi.a.values().length];
                        try
                        {
                            a[aoi.a.a.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror3) { }
                        try
                        {
                            a[aoi.a.b.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror2) { }
                        try
                        {
                            a[aoi.a.c.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            a[aoi.a.d.ordinal()] = 4;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                switch (_cls1.a[aoi2.d.ordinal()])
                {
                default:
                    return true;

                case 1: // '\001'
                    (new StringBuilder("Two purchases with same SKU found: ")).append(aoi1).append(" and ").append(aoi2);
                    return true;

                case 2: // '\002'
                case 3: // '\003'
                case 4: // '\004'
                    list.remove(i);
                    break;
                }
                return true;
            }
        }

        return false;
    }
}
