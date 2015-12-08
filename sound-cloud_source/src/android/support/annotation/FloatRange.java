// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.annotation;

import java.lang.annotation.Annotation;

public interface FloatRange
    extends Annotation
{

    public abstract double from();

    public abstract boolean fromInclusive();

    public abstract double to();

    public abstract boolean toInclusive();
}
