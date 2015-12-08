// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;

public interface Converter
{
    public static abstract class None
        implements Converter
    {

        public None()
        {
        }
    }


    public abstract Object convert(Object obj);

    public abstract JavaType getInputType(TypeFactory typefactory);

    public abstract JavaType getOutputType(TypeFactory typefactory);
}
