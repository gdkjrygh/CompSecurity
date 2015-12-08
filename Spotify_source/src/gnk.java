// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.util.Map;

final class gnk
    implements gng
{

    private final gnh a = new gnh();
    private final gnj b;

    gnk(gnj gnj1)
    {
        b = gnj1;
    }

    public final ObjectMapper a()
    {
        return b.a(a);
    }

    public final gng a(com.fasterxml.jackson.annotation.JsonInclude.Include include)
    {
        a.d = include;
        return this;
    }

    public final gng a(DeserializationFeature deserializationfeature, boolean flag)
    {
        a.b.put(deserializationfeature, Boolean.valueOf(flag));
        return this;
    }

    public final gng a(SerializationFeature serializationfeature, boolean flag)
    {
        a.a.put(serializationfeature, Boolean.valueOf(flag));
        return this;
    }
}
