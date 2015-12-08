// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.utils;

import java.io.File;
import java.io.InputStream;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;

public class Files
{

    public Files()
    {
    }

    public static void copy(File file, File file1)
    {
        file = Okio.buffer(Okio.source(file));
        file1 = Okio.buffer(Okio.sink(file1));
        file1.writeAll(file);
        file1.close();
        file.close();
    }

    public static void copy(InputStream inputstream, File file)
    {
        inputstream = Okio.buffer(Okio.source(inputstream));
        file = Okio.buffer(Okio.sink(file));
        file.writeAll(inputstream);
        file.close();
        inputstream.close();
    }

    public static void write(byte abyte0[], File file)
    {
        file = Okio.buffer(Okio.sink(file));
        file.write(abyte0);
        file.close();
    }
}
