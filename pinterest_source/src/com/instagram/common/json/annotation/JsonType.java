// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.instagram.common.json.annotation;

import java.lang.annotation.Annotation;

public interface JsonType
    extends Annotation
{

    public static final String DEFAULT_VALUE_EXTRACT_FORMATTER = "${subobject_helper_class}.parseFromJson(${parser_object})";
    public static final String POSTPROCESSING_METHOD_NAME = "postprocess";

    public abstract boolean postprocessingEnabled();

    public abstract String valueExtractFormatter();
}
