// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.sift;

import fs.ch.qos.logback.core.spi.LifeCycle;

public interface Discriminator
    extends LifeCycle
{

    public abstract String getDiscriminatingValue(Object obj);

    public abstract String getKey();
}
