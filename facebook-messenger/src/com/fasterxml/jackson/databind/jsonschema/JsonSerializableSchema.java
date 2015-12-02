// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.jsonschema;

import java.lang.annotation.Annotation;

public interface JsonSerializableSchema
    extends Annotation
{

    public static final String NO_VALUE = "##irrelevant";

    public abstract String id();

    public abstract String schemaItemDefinition();

    public abstract String schemaObjectPropertiesDefinition();

    public abstract String schemaType();
}
