// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.validation.constraintvalidation;

import java.lang.annotation.Annotation;

// Referenced classes of package javax.validation.constraintvalidation:
//            ValidationTarget

public interface SupportedValidationTarget
    extends Annotation
{

    public abstract ValidationTarget[] value();
}
