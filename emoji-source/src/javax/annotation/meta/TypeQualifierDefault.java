// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.annotation.meta;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;

public interface TypeQualifierDefault
    extends Annotation
{

    public abstract ElementType[] value();
}
