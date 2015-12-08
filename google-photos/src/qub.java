// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;
import java.util.Arrays;

public class qub extends qtx
{

    private byte a[];

    public qub()
    {
    }

    public final void a(ByteBuffer bytebuffer)
    {
        if (e > 0)
        {
            a = new byte[e];
            bytebuffer.get(a);
        }
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (qub)obj;
            if (!Arrays.equals(a, ((qub) (obj)).a))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        if (a != null)
        {
            return Arrays.hashCode(a);
        } else
        {
            return 0;
        }
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("DecoderSpecificInfo");
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
