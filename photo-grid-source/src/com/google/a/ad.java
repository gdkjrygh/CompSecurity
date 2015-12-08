// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a;

import com.google.a.b.a;
import com.google.a.b.r;
import java.math.BigInteger;

// Referenced classes of package com.google.a:
//            x

public final class ad extends x
{

    private static final Class a[];
    private Object b;

    public ad(Boolean boolean1)
    {
        a(boolean1);
    }

    public ad(Number number)
    {
        a(number);
    }

    public ad(String s)
    {
        a(s);
    }

    private void a(Object obj)
    {
        boolean flag;
        flag = false;
        if (obj instanceof Character)
        {
            b = String.valueOf(((Character)obj).charValue());
            return;
        }
        if (obj instanceof Number) goto _L2; else goto _L1
_L1:
        if (!(obj instanceof String)) goto _L4; else goto _L3
_L3:
        int i = 1;
_L7:
        if (i == 0) goto _L5; else goto _L2
_L2:
        flag = true;
_L5:
        com.google.a.b.a.a(flag);
        b = obj;
        return;
_L4:
        Class class1 = obj.getClass();
        Class aclass[] = a;
        int j = aclass.length;
        i = 0;
        do
        {
            if (i >= j)
            {
                break;
            }
            if (aclass[i].isAssignableFrom(class1))
            {
                i = 1;
                continue; /* Loop/switch isn't completed */
            }
            i++;
        } while (true);
        i = 0;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private static boolean a(ad ad1)
    {
        if (ad1.b instanceof Number)
        {
            ad1 = (Number)ad1.b;
            return (ad1 instanceof BigInteger) || (ad1 instanceof Long) || (ad1 instanceof Integer) || (ad1 instanceof Short) || (ad1 instanceof Byte);
        } else
        {
            return false;
        }
    }

    public final boolean a()
    {
        return b instanceof Boolean;
    }

    public final Number b()
    {
        if (b instanceof String)
        {
            return new r((String)b);
        } else
        {
            return (Number)b;
        }
    }

    public final String c()
    {
        if (b instanceof Number)
        {
            return b().toString();
        }
        if (b instanceof Boolean)
        {
            return ((Boolean)b).toString();
        } else
        {
            return (String)b;
        }
    }

    public final double d()
    {
        if (b instanceof Number)
        {
            return b().doubleValue();
        } else
        {
            return Double.parseDouble(c());
        }
    }

    public final float e()
    {
        if (b instanceof Number)
        {
            return b().floatValue();
        } else
        {
            return Float.parseFloat(c());
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
        obj = (ad)obj;
        if (b != null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (((ad) (obj)).b != null)
        {
            return false;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (!a(this) || !a(((ad) (obj))))
        {
            break; /* Loop/switch isn't completed */
        }
        if (b().longValue() != ((ad) (obj)).b().longValue())
        {
            return false;
        }
        if (true) goto _L1; else goto _L4
_L4:
        if ((b instanceof Number) && (((ad) (obj)).b instanceof Number))
        {
            double d1 = b().doubleValue();
            double d2 = ((ad) (obj)).b().doubleValue();
            if (d1 != d2 && (!Double.isNaN(d1) || !Double.isNaN(d2)))
            {
                return false;
            }
        } else
        {
            return b.equals(((ad) (obj)).b);
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    public final long f()
    {
        if (b instanceof Number)
        {
            return b().longValue();
        } else
        {
            return Long.parseLong(c());
        }
    }

    public final int g()
    {
        if (b instanceof Number)
        {
            return b().intValue();
        } else
        {
            return Integer.parseInt(c());
        }
    }

    public final boolean h()
    {
        if (b instanceof Boolean)
        {
            return ((Boolean)b).booleanValue();
        } else
        {
            return Boolean.parseBoolean(c());
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
            long l1 = b().longValue();
            return (int)(l1 ^ l1 >>> 32);
        }
        if (b instanceof Number)
        {
            long l2 = Double.doubleToLongBits(b().doubleValue());
            return (int)(l2 ^ l2 >>> 32);
        } else
        {
            return b.hashCode();
        }
    }

    public final boolean l()
    {
        return b instanceof Number;
    }

    public final boolean m()
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
