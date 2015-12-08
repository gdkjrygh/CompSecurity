// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import org.apache.commons.io.output.StringBuilderWriter;

public final class hdc
{

    public static void a(Closeable closeable)
    {
        if (closeable == null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        closeable.close();
        return;
        closeable;
    }

    public static void a(InputStream inputstream)
    {
        a(((Closeable) (inputstream)));
    }

    public static void a(OutputStream outputstream)
    {
        a(((Closeable) (outputstream)));
    }

    static 
    {
        char c = File.separatorChar;
        StringBuilderWriter stringbuilderwriter = new StringBuilderWriter((byte)0);
        PrintWriter printwriter = new PrintWriter(stringbuilderwriter);
        printwriter.println();
        stringbuilderwriter.toString();
        printwriter.close();
    }
}
