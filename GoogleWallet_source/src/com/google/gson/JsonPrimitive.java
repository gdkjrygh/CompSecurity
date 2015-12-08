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

    private static final Class PRIMITIVE_TYPES[];
    private Object value;

    public JsonPrimitive(Boolean boolean1)
    {
        setValue(boolean1);
    }

    public JsonPrimitive(Number number)
    {
        setValue(number);
    }

    public JsonPrimitive(String s)
    {
        setValue(s);
    }

    private static boolean isIntegral(JsonPrimitive jsonprimitive)
    {
        boolean flag;
label0:
        {
            boolean flag1 = false;
            flag = flag1;
            if (!(jsonprimitive.value instanceof Number))
            {
                break label0;
            }
            jsonprimitive = (Number)jsonprimitive.value;
            if (!(jsonprimitive instanceof BigInteger) && !(jsonprimitive instanceof Long) && !(jsonprimitive instanceof Integer) && !(jsonprimitive instanceof Short))
            {
                flag = flag1;
                if (!(jsonprimitive instanceof Byte))
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
    }

    private static boolean isPrimitiveOrString(Object obj)
    {
        if (!(obj instanceof String)) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        obj = obj.getClass();
        Class aclass[] = PRIMITIVE_TYPES;
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

    private void setValue(Object obj)
    {
        if (obj instanceof Character)
        {
            value = String.valueOf(((Character)obj).charValue());
            return;
        }
        boolean flag;
        if ((obj instanceof Number) || isPrimitiveOrString(obj))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.gson.internal..Gson.Preconditions.checkArgument(flag);
        value = obj;
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
        if (value != null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (((JsonPrimitive) (obj)).value != null)
        {
            return false;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (!isIntegral(this) || !isIntegral(((JsonPrimitive) (obj))))
        {
            break; /* Loop/switch isn't completed */
        }
        if (getAsNumber().longValue() != ((JsonPrimitive) (obj)).getAsNumber().longValue())
        {
            return false;
        }
        if (true) goto _L1; else goto _L4
_L4:
        if ((value instanceof Number) && (((JsonPrimitive) (obj)).value instanceof Number))
        {
            double d = getAsNumber().doubleValue();
            double d1 = ((JsonPrimitive) (obj)).getAsNumber().doubleValue();
            if (d != d1 && (!Double.isNaN(d) || !Double.isNaN(d1)))
            {
                return false;
            }
        } else
        {
            return value.equals(((JsonPrimitive) (obj)).value);
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    public final boolean getAsBoolean()
    {
        if (isBoolean())
        {
            return getAsBooleanWrapper().booleanValue();
        } else
        {
            return Boolean.parseBoolean(getAsString());
        }
    }

    final Boolean getAsBooleanWrapper()
    {
        return (Boolean)value;
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
        if (value instanceof String)
        {
            return new LazilyParsedNumber((String)value);
        } else
        {
            return (Number)value;
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
            return getAsBooleanWrapper().toString();
        } else
        {
            return (String)value;
        }
    }

    public final int hashCode()
    {
        if (value == null)
        {
            return 31;
        }
        if (isIntegral(this))
        {
            long l = getAsNumber().longValue();
            return (int)(l >>> 32 ^ l);
        }
        if (value instanceof Number)
        {
            long l1 = Double.doubleToLongBits(getAsNumber().doubleValue());
            return (int)(l1 >>> 32 ^ l1);
        } else
        {
            return value.hashCode();
        }
    }

    public final boolean isBoolean()
    {
        return value instanceof Boolean;
    }

    public final boolean isNumber()
    {
        return value instanceof Number;
    }

    public final boolean isString()
    {
        return value instanceof String;
    }

    static 
    {
        PRIMITIVE_TYPES = (new Class[] {
            Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, java/lang/Integer, java/lang/Long, 
            java/lang/Short, java/lang/Float, java/lang/Double, java/lang/Byte, java/lang/Boolean, java/lang/Character
        });
    }
}
