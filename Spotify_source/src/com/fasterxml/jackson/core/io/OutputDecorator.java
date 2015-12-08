// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.io;

import java.io.OutputStream;
import java.io.Serializable;
import java.io.Writer;

// Referenced classes of package com.fasterxml.jackson.core.io:
//            IOContext

public abstract class OutputDecorator
    implements Serializable
{

    public abstract OutputStream decorate(IOContext iocontext, OutputStream outputstream);

    public abstract Writer decorate(IOContext iocontext, Writer writer);
}
