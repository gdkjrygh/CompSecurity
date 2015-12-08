// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import fs.org.simpleframework.xml.stream.InputNode;
import fs.org.simpleframework.xml.stream.OutputNode;

interface Converter
{

    public abstract Object read(InputNode inputnode)
        throws Exception;

    public abstract Object read(InputNode inputnode, Object obj)
        throws Exception;

    public abstract void write(OutputNode outputnode, Object obj)
        throws Exception;
}
