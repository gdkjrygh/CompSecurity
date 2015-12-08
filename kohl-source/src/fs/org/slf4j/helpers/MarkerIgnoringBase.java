// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.slf4j.helpers;

import fs.org.slf4j.Logger;

// Referenced classes of package fs.org.slf4j.helpers:
//            NamedLoggerBase

public abstract class MarkerIgnoringBase extends NamedLoggerBase
    implements Logger
{

    public MarkerIgnoringBase()
    {
    }

    public String toString()
    {
        return getClass().getName() + "(" + getName() + ")";
    }
}
