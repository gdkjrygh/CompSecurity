// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.json.simple.parser;

import java.io.IOException;

// Referenced classes of package org.json.simple.parser:
//            ParseException

public interface ContentHandler
{

    public abstract boolean endArray()
        throws ParseException, IOException;

    public abstract void endJSON()
        throws ParseException, IOException;

    public abstract boolean endObject()
        throws ParseException, IOException;

    public abstract boolean endObjectEntry()
        throws ParseException, IOException;

    public abstract boolean primitive(Object obj)
        throws ParseException, IOException;

    public abstract boolean startArray()
        throws ParseException, IOException;

    public abstract void startJSON()
        throws ParseException, IOException;

    public abstract boolean startObject()
        throws ParseException, IOException;

    public abstract boolean startObjectEntry(String s)
        throws ParseException, IOException;
}
