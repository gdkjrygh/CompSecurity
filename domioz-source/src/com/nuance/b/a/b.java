// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.a;

import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.nuance.b.a:
//            d, e, ae, a, 
//            i, c

public final class b
{

    final int a;
    String b;
    String c;
    b d;
    b e;

    private b(int j)
    {
        if (j == 0)
        {
            throw new IllegalArgumentException("ActivationExpression: null operator prohibited");
        } else
        {
            a = j;
            return;
        }
    }

    private b(int j, b b1, b b2)
    {
        this(j);
        if (b1 == null || b2 == null)
        {
            throw new IllegalArgumentException("ActivationExpression: null expression prohibited");
        } else
        {
            d = b1;
            e = b2;
            return;
        }
    }

    b(int j, d d1, String s)
    {
        this(j);
        if (s == null)
        {
            throw new IllegalArgumentException("ActivationExpression: null string compare prohibited");
        }
        if (d1 == null || d1.toString().length() == 0)
        {
            throw new IllegalArgumentException("ActivationExpression: invalid agentName");
        } else
        {
            c = d1.toString();
            b = s;
            return;
        }
    }

    b(int j, String s)
    {
        this(j);
        if (s == null)
        {
            throw new IllegalArgumentException("ActivationExpression: null string compare prohibited");
        } else
        {
            b = s;
            return;
        }
    }

    public static b a(d d1, String s)
    {
        return new b(e.g, d1, s);
    }

    public static boolean a(ae ae1)
    {
label0:
        {
            if (ae1 == null)
            {
                throw new IllegalArgumentException("ActivationExpression.validate: null dm not allowed");
            }
            if (ae1.i != null)
            {
                break label0;
            }
            HashSet hashset = new HashSet();
            Object obj = new HashSet();
            Object obj1 = ae1.b().keySet().iterator();
            do
            {
                if (!((Iterator) (obj1)).hasNext())
                {
                    break;
                }
                String s = (String)((Iterator) (obj1)).next();
                a a1 = (a)ae1.b().get(s);
                if (a1 instanceof i)
                {
                    hashset.add(s);
                }
                if (a1.c() != null)
                {
                    ((Set) (obj)).addAll(a1.c().b());
                }
            } while (true);
            ae1.i = new Boolean(true);
            obj = ((Set) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break label0;
                }
                obj1 = (String)((Iterator) (obj)).next();
            } while (hashset.contains(obj1));
            Log.e("ActivationExpression", String.format("unrecognized agentName[%s]", new Object[] {
                obj1
            }));
            ae1.i = new Boolean(false);
        }
        return ae1.i.booleanValue();
    }

    private Set b()
    {
        HashSet hashset = new HashSet();
        if (c != null)
        {
            hashset.add(c);
        }
        if (d != null)
        {
            hashset.addAll(d.b());
        }
        if (e != null)
        {
            hashset.addAll(e.b());
        }
        return hashset;
    }

    public final b a(b b1)
    {
        return new b(e.b, this, b1);
    }

    public final String a()
    {
        switch (c.a[a - 1])
        {
        default:
            return "";

        case 1: // '\001'
            return b;

        case 2: // '\002'
            return String.format("%s && %s", new Object[] {
                d.a(), e.a()
            });

        case 3: // '\003'
            return String.format("%s || %s", new Object[] {
                d.a(), e.a()
            });

        case 4: // '\004'
            return String.format("%s.hasCollectedValues == 'TRUE'", new Object[] {
                c
            });

        case 5: // '\005'
            return String.format("%s.hasCollectedValues == 'FALSE'", new Object[] {
                c
            });

        case 6: // '\006'
            return String.format("%s == '%s'", new Object[] {
                c, b
            });

        case 7: // '\007'
            return String.format("%s != '%s'", new Object[] {
                c, b
            });
        }
    }
}
