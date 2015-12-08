// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.json;

import java.lang.annotation.Annotation;

public interface JsonPolymorphicTypeMap
    extends Annotation
{
    public static interface TypeDef
        extends Annotation
    {

        public abstract String key();

        public abstract Class ref();
    }


    public abstract TypeDef[] typeDefinitions();
}
