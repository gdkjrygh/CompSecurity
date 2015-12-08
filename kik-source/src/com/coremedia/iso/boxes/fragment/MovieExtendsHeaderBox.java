// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes.fragment;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.b.b.a.a;
import org.b.b.b.b;

public class MovieExtendsHeaderBox extends AbstractFullBox
{

    public static final String TYPE = "mehd";
    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    private long fragmentDuration;

    public MovieExtendsHeaderBox()
    {
        super("mehd");
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("MovieExtendsHeaderBox.java", com/coremedia/iso/boxes/fragment/MovieExtendsHeaderBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getFragmentDuration", "com.coremedia.iso.boxes.fragment.MovieExtendsHeaderBox", "", "", "", "long"), 65);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "setFragmentDuration", "com.coremedia.iso.boxes.fragment.MovieExtendsHeaderBox", "long", "fragmentDuration", "", "void"), 69);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        long l;
        if (getVersion() == 1)
        {
            l = IsoTypeReader.readUInt64(bytebuffer);
        } else
        {
            l = IsoTypeReader.readUInt32(bytebuffer);
        }
        fragmentDuration = l;
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        if (getVersion() == 1)
        {
            IsoTypeWriter.writeUInt64(bytebuffer, fragmentDuration);
            return;
        } else
        {
            IsoTypeWriter.writeUInt32(bytebuffer, fragmentDuration);
            return;
        }
    }

    protected long getContentSize()
    {
        int i;
        if (getVersion() == 1)
        {
            i = 12;
        } else
        {
            i = 8;
        }
        return (long)i;
    }

    public long getFragmentDuration()
    {
        org.b.a.a a1 = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return fragmentDuration;
    }

    public void setFragmentDuration(long l)
    {
        org.b.a.a a1 = b.a(ajc$tjp_1, this, this, a.a(l));
        RequiresParseDetailAspect.aspectOf().before(a1);
        fragmentDuration = l;
    }

    static 
    {
        ajc$preClinit();
    }
}
