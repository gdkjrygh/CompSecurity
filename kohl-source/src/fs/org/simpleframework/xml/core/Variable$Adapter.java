// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import fs.org.simpleframework.xml.stream.InputNode;
import fs.org.simpleframework.xml.stream.OutputNode;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            Repeater, Variable, PersistenceException, Converter

private class value
    implements Repeater
{

    private final Converter reader;
    final Variable this$0;
    private final Object value;

    public Object read(InputNode inputnode)
        throws Exception
    {
        return read(inputnode, value);
    }

    public Object read(InputNode inputnode, Object obj)
        throws Exception
    {
        fs.org.simpleframework.xml.stream.Position position = inputnode.getPosition();
        String s = inputnode.getName();
        if (reader instanceof Repeater)
        {
            return ((Repeater)reader).read(inputnode, obj);
        } else
        {
            throw new PersistenceException("Element '%s' declared twice at %s", new Object[] {
                s, position
            });
        }
    }

    public void write(OutputNode outputnode, Object obj)
        throws Exception
    {
        write(outputnode, obj);
    }

    public ion(Converter converter, Object obj)
    {
        this$0 = Variable.this;
        super();
        reader = converter;
        value = obj;
    }
}
