// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.slf4j.helpers;

import java.io.Serializable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

abstract class NamedLoggerBase
    implements Serializable, Logger
{

    private static final long serialVersionUID = 0x68929dc81c4e557dL;
    protected String name;

    NamedLoggerBase()
    {
    }

    public String getName()
    {
        return name;
    }

    protected Object readResolve()
    {
        return LoggerFactory.getLogger(getName());
    }
}
