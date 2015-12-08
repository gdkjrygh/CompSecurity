// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.slf4j.helpers;

import fs.org.slf4j.spi.MDCAdapter;
import java.util.Map;

public class NOPMDCAdapter
    implements MDCAdapter
{

    public NOPMDCAdapter()
    {
    }

    public Map getCopyOfContextMap()
    {
        return null;
    }
}
