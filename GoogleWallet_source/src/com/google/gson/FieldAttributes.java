// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson;

import java.lang.reflect.Field;

public final class FieldAttributes
{

    private final Field field;

    public FieldAttributes(Field field1)
    {
        com.google.gson.internal..Gson.Preconditions.checkNotNull(field1);
        field = field1;
    }
}
