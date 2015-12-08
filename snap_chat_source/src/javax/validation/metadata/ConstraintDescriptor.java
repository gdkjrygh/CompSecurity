// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.validation.metadata;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface ConstraintDescriptor
{

    public abstract Annotation getAnnotation();

    public abstract Map getAttributes();

    public abstract Set getComposingConstraints();

    public abstract List getConstraintValidatorClasses();

    public abstract Set getGroups();

    public abstract String getMessageTemplate();

    public abstract Set getPayload();

    public abstract int getValidationAppliesTo$2f1c97b();

    public abstract boolean isReportAsSingleViolation();
}
