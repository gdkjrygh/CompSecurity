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
//            JsonElement, JsonNull, JsonPrimitive

public final class JsonArray extends JsonElement
    implements Iterable
{

    private final List elements = new ArrayList();

    public JsonArray()
    {
    }

    public final void add(JsonElement jsonelement)
    {
        Object obj = jsonelement;
        if (jsonelement == null)
        {
            obj = JsonNull.INSTANCE;
        }
        elements.add(obj);
    }

    public final void add(Boolean boolean1)
    {
        List list = elements;
        if (boolean1 == null)
        {
            boolean1 = JsonNull.INSTANCE;
        } else
        {
            boolean1 = new JsonPrimitive(boolean1);
        }
        list.add(boolean1);
    }

    public final void add(Character character)
    {
        List list = elements;
        if (character == null)
        {
            character = JsonNull.INSTANCE;
        } else
        {
            character = new JsonPrimitive(character);
        }
        list.add(character);
    }

    public final void add(Number number)
    {
        List list = elements;
        if (number == null)
        {
            number = JsonNull.INSTANCE;
        } else
        {
            number = new JsonPrimitive(number);
        }
        list.add(number);
    }

    public final void add(String s)
    {
        List list = elements;
        if (s == null)
        {
            s = JsonNull.INSTANCE;
        } else
        {
            s = new JsonPrimitive(s);
        }
        list.add(s);
    }

    public final void addAll(JsonArray jsonarray)
    {
        elements.addAll(jsonarray.elements);
    }

    public final boolean contains(JsonElement jsonelement)
    {
        return elements.contains(jsonelement);
    }

    final JsonArray deepCopy()
    {
        JsonArray jsonarray = new JsonArray();
        for (Iterator iterator1 = elements.iterator(); iterator1.hasNext(); jsonarray.add(((JsonElement)iterator1.next()).deepCopy())) { }
        return jsonarray;
    }

    final volatile JsonElement deepCopy()
    {
        return deepCopy();
    }

    public final boolean equals(Object obj)
    {
        return obj == this || (obj instanceof JsonArray) && ((JsonArray)obj).elements.equals(elements);
    }

    public final JsonElement get(int i)
    {
        return (JsonElement)elements.get(i);
    }

    public final BigDecimal getAsBigDecimal()
    {
        if (elements.size() == 1)
        {
            return ((JsonElement)elements.get(0)).getAsBigDecimal();
        } else
        {
            throw new IllegalStateException();
        }
    }

    public final BigInteger getAsBigInteger()
    {
        if (elements.size() == 1)
        {
            return ((JsonElement)elements.get(0)).getAsBigInteger();
        } else
        {
            throw new IllegalStateException();
        }
    }

    public final boolean getAsBoolean()
    {
        if (elements.size() == 1)
        {
            return ((JsonElement)elements.get(0)).getAsBoolean();
        } else
        {
            throw new IllegalStateException();
        }
    }

    public final byte getAsByte()
    {
        if (elements.size() == 1)
        {
            return ((JsonElement)elements.get(0)).getAsByte();
        } else
        {
            throw new IllegalStateException();
        }
    }

    public final char getAsCharacter()
    {
        if (elements.size() == 1)
        {
            return ((JsonElement)elements.get(0)).getAsCharacter();
        } else
        {
            throw new IllegalStateException();
        }
    }

    public final double getAsDouble()
    {
        if (elements.size() == 1)
        {
            return ((JsonElement)elements.get(0)).getAsDouble();
        } else
        {
            throw new IllegalStateException();
        }
    }

    public final float getAsFloat()
    {
        if (elements.size() == 1)
        {
            return ((JsonElement)elements.get(0)).getAsFloat();
        } else
        {
            throw new IllegalStateException();
        }
    }

    public final int getAsInt()
    {
        if (elements.size() == 1)
        {
            return ((JsonElement)elements.get(0)).getAsInt();
        } else
        {
            throw new IllegalStateException();
        }
    }

    public final long getAsLong()
    {
        if (elements.size() == 1)
        {
            return ((JsonElement)elements.get(0)).getAsLong();
        } else
        {
            throw new IllegalStateException();
        }
    }

    public final Number getAsNumber()
    {
        if (elements.size() == 1)
        {
            return ((JsonElement)elements.get(0)).getAsNumber();
        } else
        {
            throw new IllegalStateException();
        }
    }

    public final short getAsShort()
    {
        if (elements.size() == 1)
        {
            return ((JsonElement)elements.get(0)).getAsShort();
        } else
        {
            throw new IllegalStateException();
        }
    }

    public final String getAsString()
    {
        if (elements.size() == 1)
        {
            return ((JsonElement)elements.get(0)).getAsString();
        } else
        {
            throw new IllegalStateException();
        }
    }

    public final int hashCode()
    {
        return elements.hashCode();
    }

    public final Iterator iterator()
    {
        return elements.iterator();
    }

    public final JsonElement remove(int i)
    {
        return (JsonElement)elements.remove(i);
    }

    public final boolean remove(JsonElement jsonelement)
    {
        return elements.remove(jsonelement);
    }

    public final JsonElement set(int i, JsonElement jsonelement)
    {
        return (JsonElement)elements.set(i, jsonelement);
    }

    public final int size()
    {
        return elements.size();
    }
}
