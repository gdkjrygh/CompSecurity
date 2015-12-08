// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.util.io.pem;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.util.encoders.Base64;

// Referenced classes of package org.bouncycastle.util.io.pem:
//            PemObject, PemHeader, PemObjectGenerator

public class PemWriter extends BufferedWriter
{

    private static final int LINE_LENGTH = 64;
    private char buf[];
    private final int nlLength;

    public PemWriter(Writer writer)
    {
        super(writer);
        buf = new char[64];
        writer = System.getProperty("line.separator");
        if (writer != null)
        {
            nlLength = writer.length();
            return;
        } else
        {
            nlLength = 2;
            return;
        }
    }

    private void writeEncoded(byte abyte0[])
        throws IOException
    {
        abyte0 = Base64.encode(abyte0);
        int i = 0;
label0:
        do
        {
            if (i < abyte0.length)
            {
                int j = 0;
                do
                {
                    if (j == buf.length || i + j >= abyte0.length)
                    {
                        write(buf, 0, j);
                        newLine();
                        i += buf.length;
                        continue label0;
                    }
                    buf[j] = (char)abyte0[i + j];
                    j++;
                } while (true);
            }
            return;
        } while (true);
    }

    private void writePostEncapsulationBoundary(String s)
        throws IOException
    {
        write((new StringBuilder()).append("-----END ").append(s).append("-----").toString());
        newLine();
    }

    private void writePreEncapsulationBoundary(String s)
        throws IOException
    {
        write((new StringBuilder()).append("-----BEGIN ").append(s).append("-----").toString());
        newLine();
    }

    public int getOutputSize(PemObject pemobject)
    {
        int j = (pemobject.getType().length() + 10 + nlLength) * 2 + 6 + 4;
        int i = j;
        if (!pemobject.getHeaders().isEmpty())
        {
            Iterator iterator = pemobject.getHeaders().iterator();
            PemHeader pemheader;
            int k;
            for (i = j; iterator.hasNext(); i = pemheader.getValue().length() + (j + k) + nlLength + i)
            {
                pemheader = (PemHeader)iterator.next();
                j = pemheader.getName().length();
                k = ": ".length();
            }

            i = nlLength + i;
        }
        j = ((pemobject.getContent().length + 2) / 3) * 4;
        return i + (j + (((j + 64) - 1) / 64) * nlLength);
    }

    public void writeObject(PemObjectGenerator pemobjectgenerator)
        throws IOException
    {
        pemobjectgenerator = pemobjectgenerator.generate();
        writePreEncapsulationBoundary(pemobjectgenerator.getType());
        if (!pemobjectgenerator.getHeaders().isEmpty())
        {
            for (Iterator iterator = pemobjectgenerator.getHeaders().iterator(); iterator.hasNext(); newLine())
            {
                PemHeader pemheader = (PemHeader)iterator.next();
                write(pemheader.getName());
                write(": ");
                write(pemheader.getValue());
            }

            newLine();
        }
        writeEncoded(pemobjectgenerator.getContent());
        writePostEncapsulationBoundary(pemobjectgenerator.getType());
    }
}
