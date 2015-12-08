// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import java.security.MessageDigest;

final class mjv
    implements ane
{

    private final ata b;
    private String c;

    mjv(ata ata1)
    {
        b = ata1;
    }

    private String a()
    {
        this;
        JVM INSTR monitorenter ;
        String s;
        if (c == null)
        {
            c = Uri.parse(b.c()).getPath();
        }
        s = c;
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(MessageDigest messagedigest)
    {
        messagedigest.update(a().getBytes(a));
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof mjv)
        {
            obj = (mjv)obj;
            return a().equals(((mjv) (obj)).a());
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        return a().hashCode();
    }

    public final String toString()
    {
        String s = String.valueOf("FifeUrlKey{glideUrl=");
        String s1 = String.valueOf(b);
        String s2 = String.valueOf(a());
        return (new StringBuilder(String.valueOf(s).length() + 9 + String.valueOf(s1).length() + String.valueOf(s2).length())).append(s).append(s1).append(", key='").append(s2).append("'}").toString();
    }
}
