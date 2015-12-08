// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.annotation;

import java.lang.annotation.Annotation;

public interface JsonProperty
    extends Annotation
{

    public static final String USE_DEFAULT_NAME = "";

    public abstract boolean required();

    public abstract String value();
}
