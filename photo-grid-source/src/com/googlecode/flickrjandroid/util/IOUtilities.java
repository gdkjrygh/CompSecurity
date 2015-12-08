// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class IOUtilities
{

    private IOUtilities()
    {
    }

    public static void close(InputStream inputstream)
    {
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_8;
        }
        inputstream.close();
        return;
        inputstream;
    }

    public static void close(OutputStream outputstream)
    {
        if (outputstream == null)
        {
            break MISSING_BLOCK_LABEL_8;
        }
        outputstream.close();
        return;
        outputstream;
    }

    public static void close(Reader reader)
    {
        if (reader == null)
        {
            break MISSING_BLOCK_LABEL_8;
        }
        reader.close();
        return;
        reader;
    }

    public static void close(Writer writer)
    {
        if (writer == null)
        {
            break MISSING_BLOCK_LABEL_8;
        }
        writer.close();
        return;
        writer;
    }
}
