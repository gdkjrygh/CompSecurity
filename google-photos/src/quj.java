// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;

public class quj extends qtx
{

    public int a;

    public quj()
    {
    }

    public final void a(ByteBuffer bytebuffer)
    {
        a = b.a(bytebuffer.get());
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (quj)obj;
            if (a != ((quj) (obj)).a)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return a;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("SLConfigDescriptor");
        stringbuilder.append("{predefined=").append(a);
        stringbuilder.append('}');
        return stringbuilder.toString();
    }
}
