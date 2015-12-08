// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core;


// Referenced classes of package com.fasterxml.jackson.core:
//            JsonGenerator

public interface PrettyPrinter
{

    public abstract void beforeArrayValues(JsonGenerator jsongenerator);

    public abstract void beforeObjectEntries(JsonGenerator jsongenerator);

    public abstract void writeArrayValueSeparator(JsonGenerator jsongenerator);

    public abstract void writeEndArray(JsonGenerator jsongenerator, int i);

    public abstract void writeEndObject(JsonGenerator jsongenerator, int i);

    public abstract void writeObjectEntrySeparator(JsonGenerator jsongenerator);

    public abstract void writeObjectFieldValueSeparator(JsonGenerator jsongenerator);

    public abstract void writeRootValueSeparator(JsonGenerator jsongenerator);

    public abstract void writeStartArray(JsonGenerator jsongenerator);

    public abstract void writeStartObject(JsonGenerator jsongenerator);
}
