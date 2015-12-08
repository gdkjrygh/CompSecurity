// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.annotation.meta;

import java.lang.annotation.Annotation;

// Referenced classes of package javax.annotation.meta:
//            When

public interface TypeQualifierValidator
{

    public abstract When forConstantValue(Annotation annotation, Object obj);
}
