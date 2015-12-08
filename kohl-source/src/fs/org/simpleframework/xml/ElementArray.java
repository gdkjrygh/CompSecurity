// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml;

import java.lang.annotation.Annotation;

public interface ElementArray
    extends Annotation
{

    public abstract boolean data();

    public abstract boolean empty();

    public abstract String entry();

    public abstract String name();

    public abstract boolean required();
}
