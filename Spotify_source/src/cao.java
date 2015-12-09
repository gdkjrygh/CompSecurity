// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

final class cao
{

    Base64OutputStream a;
    private ByteArrayOutputStream b;

    public cao()
    {
        b = new ByteArrayOutputStream(4096);
        a = new Base64OutputStream(b, 10);
    }

    public final String toString()
    {
        String s;
        try
        {
            a.close();
        }
        catch (IOException ioexception)
        {
            bka.b("HashManager: Unable to convert to Base64.", ioexception);
        }
        b.close();
        s = b.toString();
        b = null;
        a = null;
        return s;
        Object obj;
        obj;
        bka.b("HashManager: Unable to convert to Base64.", ((Throwable) (obj)));
        b = null;
        a = null;
        return "";
        obj;
        b = null;
        a = null;
        throw obj;
    }
}
