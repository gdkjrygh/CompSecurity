// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.databinding;

import java.lang.annotation.Annotation;

public interface BindingMethod
    extends Annotation
{

    public abstract String attribute();

    public abstract String method();

    public abstract Class type();
}
