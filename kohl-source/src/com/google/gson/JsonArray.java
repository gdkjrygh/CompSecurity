// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.gson:
//            JsonElement, JsonNull

public final class JsonArray extends JsonElement
    implements Iterable
{

    private final List elements = new ArrayList();

    public JsonArray()
    {
    }

    public void add(JsonElement jsonelement)
    {
        Object obj = jsonelement;
        if (jsonelement == null)
        {
            obj = JsonNull.INSTANCE;
        }
        elements.add(obj);
    }

    public void addAll(JsonArray jsonarray)
    {
        elements.addAll(jsonarray.elements);
    }

    JsonArray deepCopy()
    {
        JsonArray jsonarray = new JsonArray();
        for (Iterator iterator1 = elements.iterator(); iterator1.hasNext(); jsonarray.add(((JsonElement)iterator1.next()).deepCopy())) { }
        return jsonarray;
    }

    volatile JsonElement deepCopy()
    {
        return deepCopy();
    }

    public boolean equals(Object obj)
    {
        return obj == this || (obj instanceof JsonArray) && ((JsonArray)obj).elements.equals(elements);
    }

    public JsonElement get(int i)
    {
        return (JsonElement)elements.get(i);
    }

    public BigDecimal getAsBigDecimal()
    {
        if (elements.size() == 1)
        {
            return ((JsonElement)elements.get(0)).getAsBigDecimal();
        } else
        {
            throw new IllegalStateException();
        }
    }

    public BigInteger getAsBigInteger()
    {
        if (elements.size() == 1)
        {
            return ((JsonElement)elements.get(0)).getAsBigInteger();
        } else
        {
            throw new IllegalStateException();
        }
    }

    public boolean getAsBoolean()
    {
        if (elements.size() == 1)
        {
            return ((JsonElement)elements.get(0)).getAsBoolean();
        } else
        {
            throw new IllegalStateException();
        }
    }

    public byte getAsByte()
    {
        if (elements.size() == 1)
        {
            return ((JsonElement)elements.get(0)).getAsByte();
        } else
        {
            throw new IllegalStateException();
        }
    }

    public char getAsCharacter()
    {
        if (elements.size() == 1)
        {
            return ((JsonElement)elements.get(0)).getAsCharacter();
        } else
        {
            throw new IllegalStateException();
        }
    }

    public double getAsDouble()
    {
        if (elements.size() == 1)
        {
            return ((JsonElement)elements.get(0)).getAsDouble();
        } else
        {
            throw new IllegalStateException();
        }
    }

    public float getAsFloat()
    {
        if (elements.size() == 1)
        {
            return ((JsonElement)elements.get(0)).getAsFloat();
        } else
        {
            throw new IllegalStateException();
        }
    }

    public int getAsInt()
    {
        if (elements.size() == 1)
        {
            return ((JsonElement)elements.get(0)).getAsInt();
        } else
        {
            throw new IllegalStateException();
        }
    }

    public long getAsLong()
    {
        if (elements.size() == 1)
        {
            return ((JsonElement)elements.get(0)).getAsLong();
        } else
        {
            throw new IllegalStateException();
        }
    }

    public Number getAsNumber()
    {
        if (elements.size() == 1)
        {
            return ((JsonElement)elements.get(0)).getAsNumber();
        } else
        {
            throw new IllegalStateException();
        }
    }

    public short getAsShort()
    {
        if (elements.size() == 1)
        {
            return ((JsonElement)elements.get(0)).getAsShort();
        } else
        {
            throw new IllegalStateException();
        }
    }

    public String getAsString()
    {
        if (elements.size() == 1)
        {
            return ((JsonElement)elements.get(0)).getAsString();
        } else
        {
            throw new IllegalStateException();
        }
    }

    public int hashCode()
    {
        return elements.hashCode();
    }

    public Iterator iterator()
    {
        return elements.iterator();
    }

    public int size()
    {
        return elements.size();
    }
}
