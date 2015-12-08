// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.List;

public interface bbe
{

    public abstract ByteBuffer a(long l, long l1);

    public abstract List a(Class class1);

    public abstract void b(WritableByteChannel writablebytechannel);

    public abstract List d();
}
