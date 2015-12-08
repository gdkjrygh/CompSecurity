// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.JsonSerializer;

final class serializer
{

    public final JsonSerializer serializer;
    public final Class type;

    public (Class class1, JsonSerializer jsonserializer)
    {
        type = class1;
        serializer = jsonserializer;
    }
}
