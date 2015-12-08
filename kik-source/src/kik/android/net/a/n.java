// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.net.a;

import java.io.File;
import java.io.RandomAccessFile;

// Referenced classes of package kik.android.net.a:
//            h

public final class n
    implements h
{

    private final RandomAccessFile a;

    public n(File file, String s)
    {
        a = new RandomAccessFile(file, s);
    }

    public final int a(byte abyte0[], int i)
    {
        return a.read(abyte0, 0, i);
    }

    public final long a()
    {
        return a.length();
    }

    public final void a(long l)
    {
        a.seek(l);
    }

    public final void close()
    {
        a.close();
    }
}
