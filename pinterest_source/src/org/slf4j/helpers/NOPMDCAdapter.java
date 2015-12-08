// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.slf4j.helpers;

import java.util.Map;
import org.slf4j.spi.MDCAdapter;

public class NOPMDCAdapter
    implements MDCAdapter
{

    public NOPMDCAdapter()
    {
    }

    public void clear()
    {
    }

    public String get(String s)
    {
        return null;
    }

    public Map getCopyOfContextMap()
    {
        return null;
    }

    public void put(String s, String s1)
    {
    }

    public void remove(String s)
    {
    }

    public void setContextMap(Map map)
    {
    }
}
