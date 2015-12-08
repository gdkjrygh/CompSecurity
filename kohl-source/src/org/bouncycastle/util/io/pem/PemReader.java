// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.util.io.pem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.util.encoders.Base64;

// Referenced classes of package org.bouncycastle.util.io.pem:
//            PemHeader, PemObject

public class PemReader extends BufferedReader
{

    private static final String BEGIN = "-----BEGIN ";
    private static final String END = "-----END ";

    public PemReader(Reader reader)
    {
        super(reader);
    }

    private PemObject loadObject(String s)
        throws IOException
    {
        String s1 = (new StringBuilder()).append("-----END ").append(s).toString();
        StringBuffer stringbuffer = new StringBuffer();
        ArrayList arraylist = new ArrayList();
        do
        {
label0:
            {
                String s2 = readLine();
                if (s2 != null)
                {
                    if (s2.indexOf(":") >= 0)
                    {
                        int i = s2.indexOf(':');
                        arraylist.add(new PemHeader(s2.substring(0, i), s2.substring(i + 1).trim()));
                        continue;
                    }
                    if (s2.indexOf(s1) == -1)
                    {
                        break label0;
                    }
                }
                if (s2 == null)
                {
                    throw new IOException((new StringBuilder()).append(s1).append(" not found").toString());
                } else
                {
                    return new PemObject(s, arraylist, Base64.decode(stringbuffer.toString()));
                }
            }
            stringbuffer.append(s2.trim());
        } while (true);
    }

    public PemObject readPemObject()
        throws IOException
    {
        String s;
        for (s = readLine(); s != null && !s.startsWith("-----BEGIN "); s = readLine()) { }
        if (s != null)
        {
            s = s.substring("-----BEGIN ".length());
            int i = s.indexOf('-');
            s = s.substring(0, i);
            if (i > 0)
            {
                return loadObject(s);
            }
        }
        return null;
    }
}
