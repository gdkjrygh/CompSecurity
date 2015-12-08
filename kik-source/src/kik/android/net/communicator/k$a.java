// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.net.communicator;

import java.io.ByteArrayOutputStream;

// Referenced classes of package kik.android.net.communicator:
//            k

private final class it> extends ByteArrayOutputStream
{

    final k a;

    public final byte[] a()
    {
        return buf;
    }

    public final int b()
    {
        return count;
    }

    public (k k1)
    {
        a = k1;
        super(61440);
    }
}
