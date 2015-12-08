// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.openssl;

import java.io.IOException;
import java.io.Writer;
import org.bouncycastle.util.io.pem.PemGenerationException;
import org.bouncycastle.util.io.pem.PemObjectGenerator;
import org.bouncycastle.util.io.pem.PemWriter;

// Referenced classes of package org.bouncycastle.openssl:
//            MiscPEMGenerator

public class PEMWriter extends PemWriter
{

    private String a;

    public PEMWriter(Writer writer)
    {
        this(writer, "BC");
    }

    private PEMWriter(Writer writer, String s)
    {
        super(writer);
        a = s;
    }

    public final void a(Object obj)
    {
        try
        {
            super.a(new MiscPEMGenerator(obj));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        if (((PemGenerationException) (obj)).getCause() instanceof IOException)
        {
            throw (IOException)((PemGenerationException) (obj)).getCause();
        } else
        {
            throw obj;
        }
    }

    public final void a(PemObjectGenerator pemobjectgenerator)
    {
        super.a(pemobjectgenerator);
    }
}
