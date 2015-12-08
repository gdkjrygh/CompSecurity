// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class aif
{

    private static ajy e = new ajy(64);
    public final int a;
    final int b;
    public final Class c;
    private final int d;

    private aif(int i, int j, int k, Class class1)
    {
        a = i;
        b = j;
        c = class1;
        d = k;
    }

    public static aif a()
    {
        return a(0, -1, 0, null);
    }

    public static aif a(int i)
    {
        return a(i, 1, 0, null);
    }

    public static aif a(int i, int j)
    {
        return a(i, 2, j, null);
    }

    private static aif a(int i, int j, int k, Class class1)
    {
        Object obj;
        aif aif1;
        String s;
        if (class1 != null)
        {
            obj = class1.getName();
        } else
        {
            obj = "0";
        }
        obj = String.valueOf(obj);
        s = (new StringBuilder(String.valueOf(obj).length() + 36)).append(i).append(":").append(j).append(":").append(k).append(":").append(((String) (obj))).toString();
        aif1 = (aif)e.get(s);
        obj = aif1;
        if (aif1 == null)
        {
            obj = new aif(i, j, k, class1);
            e.put(s, obj);
        }
        return ((aif) (obj));
    }

    static aif a(aif aif1, aif aif2)
    {
        Object obj2 = null;
        Object obj;
        if (aif1.a == 0)
        {
            obj = aif2;
        } else
        if (aif2.a == 0)
        {
            obj = aif1;
        } else
        if (aif1.a == 1 && aif2.a == 1)
        {
            int j = Math.max(aif1.b, aif2.b);
            Class class1 = aif1.c;
            obj = aif2.c;
            Object obj1;
            boolean flag;
            if (class1 == null)
            {
                obj1 = obj;
            } else
            {
                obj1 = class1;
                if (obj != null)
                {
                    if (class1.isAssignableFrom(((Class) (obj))))
                    {
                        obj1 = obj;
                    } else
                    {
                        obj1 = class1;
                        if (!((Class) (obj)).isAssignableFrom(class1))
                        {
                            obj1 = null;
                        }
                    }
                }
            }
            if (obj1 != null || aif1.c == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj = obj2;
            if (flag)
            {
                obj = a(1, j, 0, ((Class) (obj1)));
            }
        } else
        {
            obj = obj2;
            if (aif1.b > 0)
            {
                obj = obj2;
                if (aif1.a == aif2.a)
                {
                    obj = obj2;
                    if (aif1.b == aif2.b)
                    {
                        int i = aif1.d;
                        int k = aif2.d;
                        obj = a(aif1.a, aif1.b, i | k, null);
                    }
                }
            }
        }
        if (obj == null)
        {
            aif1 = String.valueOf(aif1);
            aif2 = String.valueOf(aif2);
            throw new RuntimeException((new StringBuilder(String.valueOf(aif1).length() + 40 + String.valueOf(aif2).length())).append("Incompatible types in connection: ").append(aif1).append(" vs. ").append(aif2).append("!").toString());
        } else
        {
            return ((aif) (obj));
        }
    }

    public static aif a(Class class1)
    {
        return a(1, 0, 0, class1);
    }

    public static aif b()
    {
        return a(1, 0, 0, null);
    }

    public static aif b(int i)
    {
        return a(i, 2, 0, null);
    }

    public static aif b(Class class1)
    {
        return a(1, 1, 0, class1);
    }

    public static aif c()
    {
        return a(1, 1, 0, null);
    }

    public final int d()
    {
        byte byte0 = 4;
        switch (a)
        {
        default:
            byte0 = 0;
            // fall through

        case 102: // 'f'
        case 103: // 'g'
        case 200: 
        case 201: 
        case 301: 
            return byte0;

        case 100: // 'd'
            return 1;

        case 101: // 'e'
            return 2;
        }
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof aif)
        {
            obj = (aif)obj;
            flag = flag1;
            if (a == ((aif) (obj)).a)
            {
                flag = flag1;
                if (b == ((aif) (obj)).b)
                {
                    flag = flag1;
                    if (d == ((aif) (obj)).d)
                    {
                        flag = flag1;
                        if (c == ((aif) (obj)).c)
                        {
                            flag = true;
                        }
                    }
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return a ^ b ^ d ^ c.hashCode();
    }

    public final String toString()
    {
        Object obj;
        int i;
        i = a;
        obj = c;
        i;
        JVM INSTR lookupswitch 9: default 92
    //                   0: 364
    //                   1: 312
    //                   100: 270
    //                   101: 276
    //                   102: 282
    //                   103: 288
    //                   200: 294
    //                   201: 300
    //                   301: 306;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        obj = "?";
_L12:
        int j = b;
        Object obj1 = (new StringBuilder(String.valueOf(obj).length() + 13)).append(((String) (obj))).append("[").append(j).append("]").toString();
        obj = obj1;
        if ((d & 1) != 0)
        {
            obj = String.valueOf(obj1).concat("(rcpu)");
        }
        obj1 = obj;
        if ((d & 2) != 0)
        {
            obj1 = String.valueOf(obj).concat("(rgpu)");
        }
        obj = obj1;
        if ((d & 4) != 0)
        {
            obj = String.valueOf(obj1).concat("(ralloc)");
        }
        obj1 = obj;
        if ((d & 8) != 0)
        {
            obj1 = String.valueOf(obj).concat("(wcpu)");
        }
        obj = obj1;
        if ((d & 0x10) != 0)
        {
            obj = String.valueOf(obj1).concat("(wgpu)");
        }
        obj1 = obj;
        if ((d & 0x20) != 0)
        {
            obj1 = String.valueOf(obj).concat("(walloc)");
        }
        return ((String) (obj1));
_L4:
        obj = "int8";
        continue; /* Loop/switch isn't completed */
_L5:
        obj = "int16";
        continue; /* Loop/switch isn't completed */
_L6:
        obj = "int32";
        continue; /* Loop/switch isn't completed */
_L7:
        obj = "int64";
        continue; /* Loop/switch isn't completed */
_L8:
        obj = "float32";
        continue; /* Loop/switch isn't completed */
_L9:
        obj = "float64";
        continue; /* Loop/switch isn't completed */
_L10:
        obj = "rgba8888";
        continue; /* Loop/switch isn't completed */
_L3:
        if (obj == null)
        {
            obj = "*";
        } else
        {
            obj = ((Class) (obj)).getSimpleName();
        }
        obj = (new StringBuilder(String.valueOf(obj).length() + 2)).append("<").append(((String) (obj))).append(">").toString();
        continue; /* Loop/switch isn't completed */
_L2:
        obj = "*";
        if (true) goto _L12; else goto _L11
_L11:
    }

}
