// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;

public class gwr
{

    public gwr()
    {
    }

    public static gwq a(byte abyte0[])
    {
        Uri uri = null;
        p.b(abyte0, "must provide a non-null protocolBuffer");
        byte abyte1[];
        qgg qgg1;
        try
        {
            qgg1 = (qgg)qlw.a(new qgg(), abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new IllegalArgumentException("must provide a valid MediaItem protocolBuffer", abyte0);
        }
        if (qgg1.d != null && qgg1.d.b != null)
        {
            if (qgg1.d.b.b != null)
            {
                abyte0 = qlw.a(qgg1.d.b.b);
            } else
            {
                abyte0 = null;
            }
            abyte1 = abyte0;
            if (qgg1.d.b.d != null)
            {
                uri = Uri.parse(qgg1.d.b.d);
                abyte1 = abyte0;
            }
        } else
        {
            abyte1 = null;
        }
        return new gwq(uri, abyte1);
    }
}
