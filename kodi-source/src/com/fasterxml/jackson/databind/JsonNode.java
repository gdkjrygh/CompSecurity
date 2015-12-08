// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.databind.node.JsonNodeType;
import com.fasterxml.jackson.databind.util.EmptyIterator;
import java.util.Iterator;

// Referenced classes of package com.fasterxml.jackson.databind:
//            JsonSerializable

public abstract class JsonNode
    implements TreeNode, JsonSerializable, Iterable
{

    protected JsonNode()
    {
    }

    public boolean asBoolean()
    {
        return asBoolean(false);
    }

    public boolean asBoolean(boolean flag)
    {
        return flag;
    }

    public double asDouble()
    {
        return asDouble(0.0D);
    }

    public double asDouble(double d)
    {
        return d;
    }

    public int asInt()
    {
        return asInt(0);
    }

    public int asInt(int i)
    {
        return i;
    }

    public abstract String asText();

    public double doubleValue()
    {
        return 0.0D;
    }

    public Iterator elements()
    {
        return EmptyIterator.instance();
    }

    public JsonNode get(String s)
    {
        return null;
    }

    public abstract JsonNodeType getNodeType();

    public boolean has(String s)
    {
        return get(s) != null;
    }

    public int intValue()
    {
        return 0;
    }

    public final boolean isArray()
    {
        return getNodeType() == JsonNodeType.ARRAY;
    }

    public final boolean isNull()
    {
        return getNodeType() == JsonNodeType.NULL;
    }

    public final Iterator iterator()
    {
        return elements();
    }

    public int size()
    {
        return 0;
    }

    public String textValue()
    {
        return null;
    }

    public abstract String toString();
}
