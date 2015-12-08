// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.mp4;

import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ObjectDescriptorFactory;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.b.b.b.b;

public class AbstractDescriptorBox extends AbstractFullBox
{

    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    private static final org.b.a.a.a ajc$tjp_2;
    private static final org.b.a.a.a ajc$tjp_3;
    private static final org.b.a.a.a ajc$tjp_4;
    private static Logger log = Logger.getLogger(com/googlecode/mp4parser/boxes/mp4/AbstractDescriptorBox.getName());
    protected ByteBuffer data;
    protected BaseDescriptor descriptor;

    public AbstractDescriptorBox(String s)
    {
        super(s);
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("AbstractDescriptorBox.java", com/googlecode/mp4parser/boxes/mp4/AbstractDescriptorBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getData", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "", "", "", "java.nio.ByteBuffer"), 42);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "getDescriptor", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "", "", "", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor"), 58);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "getDescriptorAsString", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "", "", "", "java.lang.String"), 62);
        ajc$tjp_3 = b1.a("method-execution", b1.a("1", "setDescriptor", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor", "descriptor", "", "void"), 66);
        ajc$tjp_4 = b1.a("method-execution", b1.a("1", "setData", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "java.nio.ByteBuffer", "data", "", "void"), 70);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        data = bytebuffer.slice();
        bytebuffer.position(bytebuffer.position() + bytebuffer.remaining());
        try
        {
            data.rewind();
            descriptor = ObjectDescriptorFactory.createFrom(-1, data);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ByteBuffer bytebuffer)
        {
            log.log(Level.WARNING, "Error parsing ObjectDescriptor", bytebuffer);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ByteBuffer bytebuffer)
        {
            log.log(Level.WARNING, "Error parsing ObjectDescriptor", bytebuffer);
        }
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        data.rewind();
        bytebuffer.put(data);
    }

    protected long getContentSize()
    {
        return (long)(data.limit() + 4);
    }

    public ByteBuffer getData()
    {
        org.b.a.a a = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return data;
    }

    public BaseDescriptor getDescriptor()
    {
        org.b.a.a a = b.a(ajc$tjp_1, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return descriptor;
    }

    public String getDescriptorAsString()
    {
        org.b.a.a a = b.a(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return descriptor.toString();
    }

    public void setData(ByteBuffer bytebuffer)
    {
        org.b.a.a a = b.a(ajc$tjp_4, this, this, bytebuffer);
        RequiresParseDetailAspect.aspectOf().before(a);
        data = bytebuffer;
    }

    public void setDescriptor(BaseDescriptor basedescriptor)
    {
        org.b.a.a a = b.a(ajc$tjp_3, this, this, basedescriptor);
        RequiresParseDetailAspect.aspectOf().before(a);
        descriptor = basedescriptor;
    }

    static 
    {
        ajc$preClinit();
    }
}
