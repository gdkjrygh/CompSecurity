// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public final class nfi
    implements nfp
{

    private final File a;

    public nfi(File file)
    {
        a = file;
    }

    private static void a(File file, nfn nfn1)
    {
        String s;
        nfn1.a(file.getAbsolutePath());
        s = null;
        file = new BufferedReader(new FileReader(file));
_L3:
        s = file.readLine();
        if (s == null) goto _L2; else goto _L1
_L1:
        nfn1.a(s);
          goto _L3
        nfn1;
_L7:
        p.a(file);
        return;
_L2:
        p.a(file);
        return;
        nfn1;
        file = s;
_L5:
        p.a(file);
        throw nfn1;
        nfn1;
        if (true) goto _L5; else goto _L4
_L4:
        file;
        file = null;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void a(nfn nfn1)
    {
        int i = 0;
        do
        {
            Object obj = new StringBuilder();
            ((StringBuilder) (obj)).append(a.getAbsolutePath());
            ((StringBuilder) (obj)).append('.');
            ((StringBuilder) (obj)).append(i + 1);
            obj = new File(((StringBuilder) (obj)).toString());
            if (!((File) (obj)).exists())
            {
                break;
            }
            a(((File) (obj)), nfn1);
            i++;
        } while (true);
        if (a.exists())
        {
            a(a, nfn1);
        }
    }
}
