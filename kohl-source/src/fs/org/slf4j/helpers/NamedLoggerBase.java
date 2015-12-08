// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.slf4j.helpers;

import fs.org.slf4j.Logger;
import java.io.Serializable;

abstract class NamedLoggerBase
    implements Logger, Serializable
{

    protected String name;

    NamedLoggerBase()
    {
    }

    public String getName()
    {
        return name;
    }
}
