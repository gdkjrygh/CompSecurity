// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.security.MessageDigest;

public class ene
    implements ane
{

    final String b;
    final String c;
    final mfu d;

    public ene(String s, String s1, mfu mfu1)
    {
        b = b.f(s);
        c = s1;
        d = (mfu)b.a(mfu1, "Argument must not be null");
    }

    public final void a(MessageDigest messagedigest)
    {
        messagedigest.update(b.getBytes(a));
        if (c != null)
        {
            messagedigest.update(c.getBytes(a));
        }
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof ene)
        {
            obj = (ene)obj;
            if (b.equals(((ene) (obj)).b) && c != null)
            {
                flag = c.equals(((ene) (obj)).c);
            } else
            {
                flag = flag1;
                if (((ene) (obj)).c == null)
                {
                    return true;
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return c.a(b, c.a(c, 17));
    }

    public String toString()
    {
        String s = b;
        String s1 = c;
        return (new StringBuilder(String.valueOf(s).length() + 43 + String.valueOf(s1).length())).append("CoverPhotoRequest {accountName: ").append(s).append(", pageId: ").append(s1).append("}").toString();
    }
}
