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
        com.google.gson.internal..Gson.Preconditions.checkArgument(flag);
        b = obj;
        return;
_L4:
        Class class1 = obj.getClass();
        Class aclass[] = a;
        i = 0;
        do
        {
            if (i >= 16)
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
        if (getAsNumber().longValue() != ((JsonPrimitive) (obj)).getAsNumber().longValue())
        {
            return false;
        }
        if (true) goto _L1; else goto _L4
_L4:
        if ((b instanceof Number) && (((JsonPrimitive) (obj)).b instanceof Number))
        {
            double d = getAsNumber().doubleValue();
            double d1 = ((JsonPrimitive) (obj)).getAsNumber().doubleValue();
            if (d != d1 && (!Double.isNaN(d) || !Double.isNaN(d1)))
            {
                return false;
            }
        } else
        {
            return b.equals(((JsonPrimitive) (obj)).b);
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    public final boolean getAsBoolean()
    {
        if (isBoolean())
        {
            return ((Boolean)b).booleanValue();
        } else
        {
            return Boolean.parseBoolean(getAsString());
        }
    }

    public final double getAsDouble()
    {
        if (isNumber())
        {
            return getAsNumber().doubleValue();
        } else
        {
            return Double.parseDouble(getAsString());
        }
    }

    public final int getAsInt()
    {
        if (isNumber())
        {
            return getAsNumber().intValue();
        } else
        {
            return Integer.parseInt(getAsString());
        }
    }

    public final long getAsLong()
    {
        if (isNumber())
        {
            return getAsNumber().longValue();
        } else
        {
            return Long.parseLong(getAsString());
        }
    }

    public final Number getAsNumber()
    {
        if (b instanceof String)
        {
            return new LazilyParsedNumber((String)b);
        } else
        {
            return (Number)b;
        }
    }

    public final String getAsString()
    {
        if (isNumber())
        {
            return getAsNumber().toString();
        }
        if (isBoolean())
        {
            return ((Boolean)b).toString();
        } else
        {
            return (String)b;
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
            long l = getAsNumber().longValue();
            return (int)(l ^ l >>> 32);
        }
        if (b instanceof Number)
        {
            long l1 = Double.doubleToLongBits(getAsNumber().doubleValue());
            return (int)(l1 ^ l1 >>> 32);
        } else
        {
            return b.hashCode();
        }
    }

    public final boolean isBoolean()
    {
        return b instanceof Boolean;
    }

    public final boolean isNumber()
    {
        return b instanceof Number;
    }

    public final boolean isString()
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
