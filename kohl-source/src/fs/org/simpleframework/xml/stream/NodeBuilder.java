// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.stream;

import java.io.Reader;
import java.io.Writer;

// Referenced classes of package fs.org.simpleframework.xml.stream:
//            ProviderFactory, NodeReader, Provider, NodeWriter, 
//            EventReader, InputNode, Format, OutputNode

public final class NodeBuilder
{

    private static Provider provider = ProviderFactory.getInstance();

    private static InputNode read(EventReader eventreader)
        throws Exception
    {
        return (new NodeReader(eventreader)).readRoot();
    }

    public static InputNode read(Reader reader)
        throws Exception
    {
        return read(provider.provide(reader));
    }

    public static OutputNode write(Writer writer, Format format)
        throws Exception
    {
        return (new NodeWriter(writer, format)).writeRoot();
    }

}
