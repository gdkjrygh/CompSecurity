// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.util.io.pem;

import java.io.BufferedWriter;
import java.io.Writer;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.util.encoders.Base64;

// Referenced classes of package org.bouncycastle.util.io.pem:
//            PemObjectGenerator, PemObject, PemHeader

public class PemWriter extends BufferedWriter
{

    private final int a;
    private char b[];

    public PemWriter(Writer writer)
    {
        super(writer);
        b = new char[64];
        writer = System.getProperty("line.separator");
        if (writer != null)
        {
            a = writer.length();
            return;
        } else
        {
            a = 2;
            return;
        }
    }

    private void a(byte abyte0[])
    {
        abyte0 = Base64.a(abyte0);
        for (int i = 0; i < abyte0.length; i += b.length)
        {
            int j;
            for (j = 0; j != b.length && i + j < abyte0.length; j++)
            {
                b[j] = (char)abyte0[i + j];
            }

            write(b, 0, j);
            newLine();
        }

    }

    public void a(PemObjectGenerator pemobjectgenerator)
    {
        pemobjectgenerator = pemobjectgenerator.a();
        String s = pemobjectgenerator.b();
        write((new StringBuilder("-----BEGIN ")).append(s).append("-----").toString());
        newLine();
        if (!pemobjectgenerator.c().isEmpty())
        {
            for (Iterator iterator = pemobjectgenerator.c().iterator(); iterator.hasNext(); newLine())
            {
                PemHeader pemheader = (PemHeader)iterator.next();
                write(pemheader.a());
                write(": ");
                write(pemheader.b());
            }

            newLine();
        }
        a(pemobjectgenerator.d());
        pemobjectgenerator = pemobjectgenerator.b();
        write((new StringBuilder("-----END ")).append(pemobjectgenerator).append("-----").toString());
        newLine();
    }
}
