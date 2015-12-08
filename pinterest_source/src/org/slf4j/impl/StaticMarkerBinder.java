// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.slf4j.impl;

import org.slf4j.IMarkerFactory;
import org.slf4j.helpers.BasicMarkerFactory;
import org.slf4j.spi.MarkerFactoryBinder;

public class StaticMarkerBinder
    implements MarkerFactoryBinder
{

    public static final StaticMarkerBinder SINGLETON = new StaticMarkerBinder();
    private final IMarkerFactory markerFactory = new BasicMarkerFactory();

    private StaticMarkerBinder()
    {
    }

    public IMarkerFactory getMarkerFactory()
    {
        return markerFactory;
    }

    public String getMarkerFactoryClassStr()
    {
        return org/slf4j/helpers/BasicMarkerFactory.getName();
    }

}
