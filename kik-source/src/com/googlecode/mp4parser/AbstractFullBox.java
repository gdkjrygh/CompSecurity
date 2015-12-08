// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.boxes.FullBox;
import java.nio.ByteBuffer;
import org.b.b.a.a;
import org.b.b.b.b;

// Referenced classes of package com.googlecode.mp4parser:
//            AbstractBox, RequiresParseDetailAspect

public abstract class AbstractFullBox extends AbstractBox
    implements FullBox
{

    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    private int flags;
    private int version;

    protected AbstractFullBox(String s)
    {
        super(s);
    }

    protected AbstractFullBox(String s, byte abyte0[])
    {
        super(s, abyte0);
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("AbstractFullBox.java", com/googlecode/mp4parser/AbstractFullBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "setVersion", "com.googlecode.mp4parser.AbstractFullBox", "int", "version", "", "void"), 51);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "setFlags", "com.googlecode.mp4parser.AbstractFullBox", "int", "flags", "", "void"), 64);
    }

    public int getFlags()
    {
        if (!isParsed)
        {
            parseDetails();
        }
        return flags;
    }

    public int getVersion()
    {
        if (!isParsed)
        {
            parseDetails();
        }
        return version;
    }

    protected final long parseVersionAndFlags(ByteBuffer bytebuffer)
    {
        version = IsoTypeReader.readUInt8(bytebuffer);
        flags = IsoTypeReader.readUInt24(bytebuffer);
        return 4L;
    }

    public void setFlags(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_1, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        flags = i;
    }

    public void setVersion(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_0, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        version = i;
    }

    protected final void writeVersionAndFlags(ByteBuffer bytebuffer)
    {
        IsoTypeWriter.writeUInt8(bytebuffer, version);
        IsoTypeWriter.writeUInt24(bytebuffer, flags);
    }

    static 
    {
        ajc$preClinit();
    }
}
