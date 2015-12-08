// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.json.simple;

import java.io.IOException;
import java.io.Writer;

public interface JSONStreamAware
{

    public abstract void writeJSONString(Writer writer)
        throws IOException;
}
