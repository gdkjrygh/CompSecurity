// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.util.io.pem;

import java.io.BufferedWriter;
import java.io.Writer;
import java.util.Iterator;
import java.util.List;
import org.spongycastle.util.encoders.Base64;

// Referenced classes of package org.spongycastle.util.io.pem:
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

    public final void a(PemObjectGenerator pemobjectgenerator)
    {
        pemobjectgenerator = pemobjectgenerator.d();
        String s = pemobjectgenerator.a();
        write((new StringBuilder("-----BEGIN ")).append(s).append("-----").toString());
        newLine();
        if (!pemobjectgenerator.b().isEmpty())
        {
            for (Iterator iterator = pemobjectgenerator.b().iterator(); iterator.hasNext(); newLine())
            {
                PemHeader pemheader = (PemHeader)iterator.next();
                write(pemheader.a());
                write(": ");
                write(pemheader.b());
            }

            newLine();
        }
        a(pemobjectgenerator.c());
        pemobjectgenerator = pemobjectgenerator.a();
        write((new StringBuilder("-----END ")).append(pemobjectgenerator).append("-----").toString());
        newLine();
    }
}
