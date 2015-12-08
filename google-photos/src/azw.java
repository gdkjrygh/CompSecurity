// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.security.MessageDigest;

public final class azw
    implements ane
{

    private final Object b;

    public azw(Object obj)
    {
        b = b.a(obj, "Argument must not be null");
    }

    public final void a(MessageDigest messagedigest)
    {
        messagedigest.update(b.toString().getBytes(a));
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof azw)
        {
            obj = (azw)obj;
            return b.equals(((azw) (obj)).b);
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        return b.hashCode();
    }

    public final String toString()
    {
        String s = String.valueOf("ObjectKey{object=");
        String s1 = String.valueOf(b);
        return (new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(s1).length())).append(s).append(s1).append("}").toString();
    }
}
