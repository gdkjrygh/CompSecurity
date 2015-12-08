// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson;

import com.google.gson.internal.LazilyParsedNumber;
import java.math.BigInteger;

// Referenced classes of package com.google.gson:
//            JsonElement

public final class JsonPrimitive extends JsonElement
{

    private static final Class a[];
    private Object b;

    public JsonPrimitive(Boolean boolean1)
    {
        a(boolean1);
    }

    public JsonPrimitive(Number number)
    {
        a(number);
    }

    public JsonPrimitive(String s)
    {
        a(s);
    }

    private static boolean a(JsonPrimitive jsonprimitive)
    {
        if (jsonprimitive.b instanceof Number)
        {
            jsonprimitive = (Number)jsonprimitive.b;
            return (jsonprimitive instanceof BigInteger) || (jsonprimitive instanceof Long) || (jsonprimitive instanceof Integer) || (jsonprimitive instanceof Short) || (jsonprimitive instanceof Byte);
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

    void a(Object obj)
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
        com.google.gson.internal..Gson.Preconditions.a(flag);
        b = obj;
    }

    public boolean a()
    {
        return b instanceof Boolean;
    }

    public Number b()
    {
        if (b instanceof String)
        {
            return new LazilyParsedNumber((String)b);
        } else
        {
            return (Number)b;
        }
    }

    public String c()
    {
        if (p())
        {
            return b().toString();
        }
        if (a())
        {
            return o().toString();
        } else
        {
            return (String)b;
        }
    }

    public double d()
    {
        if (p())
        {
            return b().doubleValue();
        } else
        {
            return Double.parseDouble(c());
        }
    }

    public long e()
    {
        if (p())
        {
            return b().longValue();
        } else
        {
            return Long.parseLong(c());
        }
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        }
        obj = (JsonPrimitive)obj;
        if (b != null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (((JsonPrimitive) (obj)).b != null)
        {
            return false;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (!a(this) || !a(((JsonPrimitive) (obj))))
        {
            break; /* Loop/switch isn't completed */
        }
        if (b().longValue() != ((JsonPrimitive) (obj)).b().longValue())
        {
            return false;
        }
        if (true) goto _L1; else goto _L4
_L4:
label0:
        {
            boolean flag;
label1:
            {
                if (!(b instanceof Number) || !(((JsonPrimitive) (obj)).b instanceof Number))
                {
                    break label0;
                }
                double d1 = b().doubleValue();
                double d2 = ((JsonPrimitive) (obj)).b().doubleValue();
                if (d1 != d2)
                {
                    flag = flag1;
                    if (!Double.isNaN(d1))
                    {
                        break label1;
                    }
                    flag = flag1;
                    if (!Double.isNaN(d2))
                    {
                        break label1;
                    }
                }
                flag = true;
            }
            return flag;
        }
        return b.equals(((JsonPrimitive) (obj)).b);
    }

    public int f()
    {
        if (p())
        {
            return b().intValue();
        } else
        {
            return Integer.parseInt(c());
        }
    }

    public boolean g()
    {
        if (a())
        {
            return o().booleanValue();
        } else
        {
            return Boolean.parseBoolean(c());
        }
    }

    public int hashCode()
    {
        if (b == null)
        {
            return 31;
        }
        if (a(this))
        {
            long l = b().longValue();
            return (int)(l ^ l >>> 32);
        }
        if (b instanceof Number)
        {
            long l1 = Double.doubleToLongBits(b().doubleValue());
            return (int)(l1 ^ l1 >>> 32);
        } else
        {
            return b.hashCode();
        }
    }

    Boolean o()
    {
        return (Boolean)b;
    }

    public boolean p()
    {
        return b instanceof Number;
    }

    public boolean q()
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
