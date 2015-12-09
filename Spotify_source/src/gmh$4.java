// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

final class ang.Object
    implements Runnable
{

    private String a;
    private byte b[];
    private gmh c;

    public final void run()
    {
        if (c.a.containsKey(a))
        {
            gmj gmj1 = ((gmi)c.a.get(a)).c;
            byte abyte0[] = b;
            if (gmj1.a != null)
            {
                gmj1.a.a(abyte0);
            }
            return;
        } else
        {
            String s = a;
            return;
        }
    }

    (gmh gmh1, String s, byte abyte0[])
    {
        c = gmh1;
        a = s;
        b = abyte0;
        super();
    }
}
