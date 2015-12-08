// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public interface gng
{

    public abstract ObjectMapper a();

    public abstract gng a(com.fasterxml.jackson.annotation.JsonInclude.Include include);

    public abstract gng a(DeserializationFeature deserializationfeature, boolean flag);

    public abstract gng a(SerializationFeature serializationfeature, boolean flag);
}
