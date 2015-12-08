// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class arv
{

    private final bad a = new bad(1000);

    public arv()
    {
    }

    private static String b(ane ane1)
    {
        try
        {
            MessageDigest messagedigest = MessageDigest.getInstance("SHA-256");
            ane1.a(messagedigest);
            ane1 = bag.a(messagedigest.digest());
        }
        // Misplaced declaration of an exception variable
        catch (ane ane1)
        {
            throw new RuntimeException(ane1);
        }
        return ane1;
    }

    public final String a(ane ane1)
    {
        String s;
        synchronized (a)
        {
            s = (String)a.b(ane1);
        }
        obj = s;
        if (s == null)
        {
            obj = b(ane1);
        }
        synchronized (a)
        {
            a.b(ane1, obj);
        }
        return ((String) (obj));
        ane1;
        obj;
        JVM INSTR monitorexit ;
        throw ane1;
        ane1;
        bad1;
        JVM INSTR monitorexit ;
        throw ane1;
    }
}
