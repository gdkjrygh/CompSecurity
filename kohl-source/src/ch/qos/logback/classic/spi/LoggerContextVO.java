// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic.spi;

import ch.qos.logback.classic.LoggerContext;
import java.io.Serializable;
import java.util.Map;

public class LoggerContextVO
    implements Serializable
{

    final long birthTime;
    final String name;
    final Map propertyMap;

    public LoggerContextVO(LoggerContext loggercontext)
    {
        name = loggercontext.getName();
        propertyMap = loggercontext.getCopyOfPropertyMap();
        birthTime = loggercontext.getBirthTime();
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof LoggerContextVO))
            {
                return false;
            }
            obj = (LoggerContextVO)obj;
            if (birthTime != ((LoggerContextVO) (obj)).birthTime)
            {
                return false;
            }
            if (name == null ? ((LoggerContextVO) (obj)).name != null : !name.equals(((LoggerContextVO) (obj)).name))
            {
                return false;
            }
            if (propertyMap == null ? ((LoggerContextVO) (obj)).propertyMap != null : !propertyMap.equals(((LoggerContextVO) (obj)).propertyMap))
            {
                return false;
            }
        }
        return true;
    }

    public long getBirthTime()
    {
        return birthTime;
    }

    public String getName()
    {
        return name;
    }

    public Map getPropertyMap()
    {
        return propertyMap;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (name != null)
        {
            i = name.hashCode();
        } else
        {
            i = 0;
        }
        if (propertyMap != null)
        {
            j = propertyMap.hashCode();
        }
        return (i * 31 + j) * 31 + (int)(birthTime ^ birthTime >>> 32);
    }

    public String toString()
    {
        return (new StringBuilder()).append("LoggerContextVO{name='").append(name).append('\'').append(", propertyMap=").append(propertyMap).append(", birthTime=").append(birthTime).append('}').toString();
    }
}
