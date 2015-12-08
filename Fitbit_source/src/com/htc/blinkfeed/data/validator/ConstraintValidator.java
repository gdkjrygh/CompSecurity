// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.htc.blinkfeed.data.validator;

import java.lang.annotation.Annotation;

public interface ConstraintValidator
{

    public abstract void init(Annotation annotation);

    public abstract boolean validate(Object obj);
}
