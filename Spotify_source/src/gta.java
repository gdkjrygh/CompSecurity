// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import okio.ByteString;

public final class gta
{

    public static final ByteString a = ByteString.a(":status");
    public static final ByteString b = ByteString.a(":method");
    public static final ByteString c = ByteString.a(":path");
    public static final ByteString d = ByteString.a(":scheme");
    public static final ByteString e = ByteString.a(":authority");
    public static final ByteString f = ByteString.a(":host");
    public static final ByteString g = ByteString.a(":version");
    public final ByteString h;
    public final ByteString i;
    final int j;

    public gta(String s, String s1)
    {
        this(ByteString.a(s), ByteString.a(s1));
    }

    public gta(ByteString bytestring, String s)
    {
        this(bytestring, ByteString.a(s));
    }

    public gta(ByteString bytestring, ByteString bytestring1)
    {
        h = bytestring;
        i = bytestring1;
        j = bytestring.f() + 32 + bytestring1.f();
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof gta)
        {
            obj = (gta)obj;
            flag = flag1;
            if (h.equals(((gta) (obj)).h))
            {
                flag = flag1;
                if (i.equals(((gta) (obj)).i))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return (h.hashCode() + 527) * 31 + i.hashCode();
    }

    public final String toString()
    {
        return String.format("%s: %s", new Object[] {
            h.a(), i.a()
        });
    }

}
