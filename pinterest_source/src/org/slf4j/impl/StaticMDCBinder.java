// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.slf4j.impl;

import org.slf4j.helpers.NOPMDCAdapter;
import org.slf4j.spi.MDCAdapter;

public class StaticMDCBinder
{

    public static final StaticMDCBinder SINGLETON = new StaticMDCBinder();

    private StaticMDCBinder()
    {
    }

    public MDCAdapter getMDCA()
    {
        return new NOPMDCAdapter();
    }

    public String getMDCAdapterClassStr()
    {
        return org/slf4j/helpers/NOPMDCAdapter.getName();
    }

}
