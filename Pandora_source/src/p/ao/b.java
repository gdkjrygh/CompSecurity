// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ao;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import p.q.c;

public class b
    implements c
{

    private final String a;

    public b(String s)
    {
        if (s == null)
        {
            throw new NullPointerException("Signature cannot be null!");
        } else
        {
            a = s;
            return;
        }
    }

    public void a(MessageDigest messagedigest)
        throws UnsupportedEncodingException
    {
        messagedigest.update(a.getBytes("UTF-8"));
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        } else
        {
            obj = (b)obj;
            return a.equals(((b) (obj)).a);
        }
    }

    public int hashCode()
    {
        return a.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder()).append("StringSignature{signature='").append(a).append('\'').append('}').toString();
    }
}
