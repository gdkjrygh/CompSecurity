// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import com.coremedia.iso.BoxParser;
import com.googlecode.mp4parser.DataSource;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

// Referenced classes of package com.coremedia.iso.boxes:
//            Container

public interface Box
{

    public abstract void getBox(WritableByteChannel writablebytechannel);

    public abstract long getOffset();

    public abstract Container getParent();

    public abstract long getSize();

    public abstract String getType();

    public abstract void parse(DataSource datasource, ByteBuffer bytebuffer, long l, BoxParser boxparser);

    public abstract void setParent(Container container);
}
