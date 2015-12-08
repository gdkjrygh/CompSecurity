// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.skippy;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class UnzipUtil
{

    private static final int BUFFER_SIZE = 4096;

    public UnzipUtil()
    {
    }

    private void extractFile(ZipInputStream zipinputstream, String s)
        throws IOException
    {
        s = new BufferedOutputStream(new FileOutputStream(s));
        byte abyte0[] = new byte[4096];
_L1:
        int i = zipinputstream.read(abyte0);
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        s.write(abyte0, 0, i);
          goto _L1
        zipinputstream;
        s.close();
        throw zipinputstream;
        s.close();
        return;
    }

    public void extractFile(String s, String s1, String s2, String s3)
        throws IOException
    {
        ZipInputStream zipinputstream = new ZipInputStream(new FileInputStream(s));
        s = zipinputstream.getNextEntry();
_L2:
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        int i;
        if (s.isDirectory() || !s1.equals(s.getName()))
        {
            break MISSING_BLOCK_LABEL_114;
        }
        s = s.getName();
        i = s.lastIndexOf(File.separator);
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        s.substring(i + 1, s.length());
        extractFile(zipinputstream, (new StringBuilder()).append(s2).append(File.separator).append(s3).toString());
        zipinputstream.close();
        return;
        zipinputstream.closeEntry();
        s = zipinputstream.getNextEntry();
        if (true) goto _L2; else goto _L1
_L1:
        s;
        zipinputstream.close();
        throw s;
    }
}
