// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;

public final class WritableObjectId
{

    public final ObjectIdGenerator generator;
    public Object id;
    public JsonSerializer serializer;

    public WritableObjectId(ObjectIdGenerator objectidgenerator)
    {
        generator = objectidgenerator;
    }
}
