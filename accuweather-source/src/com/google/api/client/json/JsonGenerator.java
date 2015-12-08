// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.json;

import com.google.api.client.util.ClassInfo;
import com.google.api.client.util.Data;
import com.google.api.client.util.DateTime;
import com.google.api.client.util.FieldInfo;
import com.google.api.client.util.GenericData;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.Types;
import java.io.IOException;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.api.client.json:
//            JsonString, JsonFactory

public abstract class JsonGenerator
{

    public JsonGenerator()
    {
    }

    private void serialize(boolean flag, Object obj)
        throws IOException
    {
        if (obj == null)
        {
            return;
        }
        Object obj1 = obj.getClass();
        if (Data.isNull(obj))
        {
            writeNull();
            return;
        }
        if (obj instanceof String)
        {
            writeString((String)obj);
            return;
        }
        if (obj instanceof Number)
        {
            if (flag)
            {
                writeString(obj.toString());
                return;
            }
            if (obj instanceof BigDecimal)
            {
                writeNumber((BigDecimal)obj);
                return;
            }
            if (obj instanceof BigInteger)
            {
                writeNumber((BigInteger)obj);
                return;
            }
            if (obj instanceof Long)
            {
                writeNumber(((Long)obj).longValue());
                return;
            }
            if (obj instanceof Float)
            {
                float f = ((Number)obj).floatValue();
                if (!Float.isInfinite(f) && !Float.isNaN(f))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                Preconditions.checkArgument(flag);
                writeNumber(f);
                return;
            }
            if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte))
            {
                writeNumber(((Number)obj).intValue());
                return;
            }
            double d = ((Number)obj).doubleValue();
            if (!Double.isInfinite(d) && !Double.isNaN(d))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag);
            writeNumber(d);
            return;
        }
        if (obj instanceof Boolean)
        {
            writeBoolean(((Boolean)obj).booleanValue());
            return;
        }
        if (obj instanceof DateTime)
        {
            writeString(((DateTime)obj).toStringRfc3339());
            return;
        }
        if ((obj instanceof Iterable) || ((Class) (obj1)).isArray())
        {
            writeStartArray();
            for (obj = Types.iterableOf(obj).iterator(); ((Iterator) (obj)).hasNext(); serialize(flag, ((Iterator) (obj)).next())) { }
            writeEndArray();
            return;
        }
        if (((Class) (obj1)).isEnum())
        {
            obj = FieldInfo.of((Enum)obj).getName();
            if (obj == null)
            {
                writeNull();
                return;
            } else
            {
                writeString(((String) (obj)));
                return;
            }
        }
        writeStartObject();
        boolean flag1;
        if ((obj instanceof Map) && !(obj instanceof GenericData))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            obj1 = null;
        } else
        {
            obj1 = ClassInfo.of(((Class) (obj1)));
        }
        obj = Data.mapOf(obj).entrySet().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Object obj3 = (java.util.Map.Entry)((Iterator) (obj)).next();
            Object obj2 = ((java.util.Map.Entry) (obj3)).getValue();
            if (obj2 != null)
            {
                obj3 = (String)((java.util.Map.Entry) (obj3)).getKey();
                boolean flag2;
                if (flag1)
                {
                    flag2 = flag;
                } else
                {
                    Field field = ((ClassInfo) (obj1)).getField(((String) (obj3)));
                    if (field != null && field.getAnnotation(com/google/api/client/json/JsonString) != null)
                    {
                        flag2 = true;
                    } else
                    {
                        flag2 = false;
                    }
                }
                writeFieldName(((String) (obj3)));
                serialize(flag2, obj2);
            }
        } while (true);
        writeEndObject();
    }

    public abstract void close()
        throws IOException;

    public void enablePrettyPrint()
        throws IOException
    {
    }

    public abstract void flush()
        throws IOException;

    public abstract JsonFactory getFactory();

    public final void serialize(Object obj)
        throws IOException
    {
        serialize(false, obj);
    }

    public abstract void writeBoolean(boolean flag)
        throws IOException;

    public abstract void writeEndArray()
        throws IOException;

    public abstract void writeEndObject()
        throws IOException;

    public abstract void writeFieldName(String s)
        throws IOException;

    public abstract void writeNull()
        throws IOException;

    public abstract void writeNumber(double d)
        throws IOException;

    public abstract void writeNumber(float f)
        throws IOException;

    public abstract void writeNumber(int i)
        throws IOException;

    public abstract void writeNumber(long l)
        throws IOException;

    public abstract void writeNumber(String s)
        throws IOException;

    public abstract void writeNumber(BigDecimal bigdecimal)
        throws IOException;

    public abstract void writeNumber(BigInteger biginteger)
        throws IOException;

    public abstract void writeStartArray()
        throws IOException;

    public abstract void writeStartObject()
        throws IOException;

    public abstract void writeString(String s)
        throws IOException;
}
