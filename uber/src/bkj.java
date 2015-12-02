// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.math.BigInteger;

public final class bkj extends bkd
{

    private static final Class a[];
    private Object b;

    public bkj(Boolean boolean1)
    {
        a(boolean1);
    }

    public bkj(Number number)
    {
        a(number);
    }

    bkj(Object obj)
    {
        a(obj);
    }

    public bkj(String s)
    {
        a(s);
    }

    private void a(Object obj)
    {
        if (obj instanceof Character)
        {
            b = String.valueOf(((Character)obj).charValue());
            return;
        }
        boolean flag;
        if ((obj instanceof Number) || b(obj))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bkx.a(flag);
        b = obj;
    }

    private static boolean a(bkj bkj1)
    {
        if (bkj1.b instanceof Number)
        {
            bkj1 = (Number)bkj1.b;
            return (bkj1 instanceof BigInteger) || (bkj1 instanceof Long) || (bkj1 instanceof Integer) || (bkj1 instanceof Short) || (bkj1 instanceof Byte);
        } else
        {
            return false;
        }
    }

    private static boolean b(Object obj)
    {
        if (!(obj instanceof String)) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        obj = obj.getClass();
        Class aclass[] = a;
        int j = aclass.length;
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= j)
                {
                    break label1;
                }
                if (aclass[i].isAssignableFrom(((Class) (obj))))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return false;
    }

    public final Number a()
    {
        if (b instanceof String)
        {
            return new blf((String)b);
        } else
        {
            return (Number)b;
        }
    }

    public final String b()
    {
        if (p())
        {
            return a().toString();
        }
        if (o())
        {
            return n().toString();
        } else
        {
            return (String)b;
        }
    }

    public final double c()
    {
        if (p())
        {
            return a().doubleValue();
        } else
        {
            return Double.parseDouble(b());
        }
    }

    public final long d()
    {
        if (p())
        {
            return a().longValue();
        } else
        {
            return Long.parseLong(b());
        }
    }

    public final int e()
    {
        if (p())
        {
            return a().intValue();
        } else
        {
            return Integer.parseInt(b());
        }
    }

    public final boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        }
        obj = (bkj)obj;
        if (b != null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (((bkj) (obj)).b != null)
        {
            return false;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (!a(this) || !a(((bkj) (obj))))
        {
            break; /* Loop/switch isn't completed */
        }
        if (a().longValue() != ((bkj) (obj)).a().longValue())
        {
            return false;
        }
        if (true) goto _L1; else goto _L4
_L4:
        if ((b instanceof Number) && (((bkj) (obj)).b instanceof Number))
        {
            double d1 = a().doubleValue();
            double d2 = ((bkj) (obj)).a().doubleValue();
            if (d1 != d2 && (!Double.isNaN(d1) || !Double.isNaN(d2)))
            {
                return false;
            }
        } else
        {
            return b.equals(((bkj) (obj)).b);
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    public final boolean f()
    {
        if (o())
        {
            return n().booleanValue();
        } else
        {
            return Boolean.parseBoolean(b());
        }
    }

    public final int hashCode()
    {
        if (b == null)
        {
            return 31;
        }
        if (a(this))
        {
            long l = a().longValue();
            return (int)(l ^ l >>> 32);
        }
        if (b instanceof Number)
        {
            long l1 = Double.doubleToLongBits(a().doubleValue());
            return (int)(l1 ^ l1 >>> 32);
        } else
        {
            return b.hashCode();
        }
    }

    final Boolean n()
    {
        return (Boolean)b;
    }

    public final boolean o()
    {
        return b instanceof Boolean;
    }

    public final boolean p()
    {
        return b instanceof Number;
    }

    public final boolean q()
    {
        return b instanceof String;
    }

    static 
    {
        a = (new Class[] {
            Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, java/lang/Integer, java/lang/Long, 
            java/lang/Short, java/lang/Float, java/lang/Double, java/lang/Byte, java/lang/Boolean, java/lang/Character
        });
    }
}
