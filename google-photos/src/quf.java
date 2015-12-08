// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;

public class quf extends qtx
{

    private byte a[];

    public quf()
    {
    }

    public final void a(ByteBuffer bytebuffer)
    {
        if (b() > 0)
        {
            a = new byte[b()];
            bytebuffer.get(a);
        }
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("ExtensionDescriptor");
        StringBuilder stringbuilder1 = stringbuilder.append("{bytes=");
        String s;
        if (a == null)
        {
            s = "null";
        } else
        {
            s = bav.a(a);
        }
        stringbuilder1.append(s);
        stringbuilder.append('}');
        return stringbuilder.toString();
    }
}
