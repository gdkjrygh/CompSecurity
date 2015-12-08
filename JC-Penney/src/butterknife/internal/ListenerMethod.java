// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package butterknife.internal;

import java.lang.annotation.Annotation;

public interface ListenerMethod
    extends Annotation
{

    public abstract String defaultReturn();

    public abstract String name();

    public abstract String[] parameters();

    public abstract String returnType();
}
