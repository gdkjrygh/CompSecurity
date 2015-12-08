// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.slf4j.spi;

import org.slf4j.IMarkerFactory;

public interface MarkerFactoryBinder
{

    public abstract IMarkerFactory getMarkerFactory();

    public abstract String getMarkerFactoryClassStr();
}
