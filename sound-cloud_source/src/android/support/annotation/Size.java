// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.annotation;

import java.lang.annotation.Annotation;

public interface Size
    extends Annotation
{

    public abstract long max();

    public abstract long min();

    public abstract long multiple();

    public abstract long value();
}
