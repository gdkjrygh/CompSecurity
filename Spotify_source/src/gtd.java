// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;
import java.util.Map;
import okio.ByteString;

final class gtd
{

    private final hch a;

    gtd(hch hch1)
    {
        a = hch1;
    }

    private void a(int i, int j)
    {
        if (i < j)
        {
            a.b(i | 0);
            return;
        }
        a.b(j | 0);
        for (i -= j; i >= 128; i >>>= 7)
        {
            a.b(i & 0x7f | 0x80);
        }

        a.b(i);
    }

    private void a(ByteString bytestring)
    {
        a(bytestring.f(), 127);
        a.a(bytestring);
    }

    final void a(List list)
    {
        int j = list.size();
        int i = 0;
        while (i < j) 
        {
            ByteString bytestring = ((gta)list.get(i)).h.e();
            Integer integer = (Integer)gtb.b().get(bytestring);
            if (integer != null)
            {
                a(integer.intValue() + 1, 15);
                a(((gta)list.get(i)).i);
            } else
            {
                a.b(0);
                a(bytestring);
                a(((gta)list.get(i)).i);
            }
            i++;
        }
    }
}
