// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.instagram.common.json.annotation;

import java.lang.annotation.Annotation;

public interface JsonField
    extends Annotation
{

    public abstract String[] alternateFieldNames();

    public abstract String fieldAssignmentFormatter();

    public abstract String fieldName();

    public abstract TypeMapping mapping();

    public abstract String serializeCodeFormatter();

    public abstract String valueExtractFormatter();
}
