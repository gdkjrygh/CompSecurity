// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.node;


// Referenced classes of package com.fasterxml.jackson.databind.node:
//            ValueNode, JsonNodeType

public abstract class NumericNode extends ValueNode
{

    protected NumericNode()
    {
    }

    public final int asInt()
    {
        return intValue();
    }

    public final int asInt(int i)
    {
        return intValue();
    }

    public final long asLong()
    {
        return longValue();
    }

    public final long asLong(long l)
    {
        return longValue();
    }

    public final JsonNodeType getNodeType()
    {
        return JsonNodeType.NUMBER;
    }

    public abstract int intValue();

    public abstract long longValue();
}
