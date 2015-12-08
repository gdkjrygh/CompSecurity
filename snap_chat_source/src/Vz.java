// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.security.MessageDigest;
import java.text.MessageFormat;

public final class Vz
{

    public static String a(String s)
    {
        s = MessageFormat.format("Zk7iW21C8v4zt5xJlpZX~{0}~WFrs1P2KHtzADoxWMaa7", new Object[] {
            s
        });
        MessageDigest messagedigest = MessageDigest.getInstance("SHA-256");
        messagedigest.update(s.getBytes(dp.a));
        return eK.a().a(messagedigest.digest());
    }
}
