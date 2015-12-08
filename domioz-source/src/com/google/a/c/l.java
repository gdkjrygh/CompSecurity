// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.c;

import com.google.a.a.ad;
import com.google.a.b.dh;
import java.io.File;
import java.io.OutputStream;
import java.nio.charset.Charset;

// Referenced classes of package com.google.a.c:
//            m, c, o, d, 
//            n, k, g, a

public final class l
{

    private static final dh a = new m();

    public static String a(File file, Charset charset)
    {
        return (new c(new o(file, (byte)0), charset, (byte)0)).b();
    }

    public static void a(byte abyte0[], File file)
    {
        Object obj;
        obj = new n(file, new k[0], (byte)0);
        ad.a(abyte0);
        file = g.a();
        obj = (OutputStream)file.a(((a) (obj)).a());
        ((OutputStream) (obj)).write(abyte0);
        ((OutputStream) (obj)).flush();
        file.close();
        return;
        abyte0;
        throw file.a(abyte0);
        abyte0;
        file.close();
        throw abyte0;
    }

}
