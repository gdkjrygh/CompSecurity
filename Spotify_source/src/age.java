// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.BitmapFactory;

public class age extends agu
{

    private final String a;

    public age(String s, String s1)
    {
        super(s);
        a = s1;
        b.b("InternalPlayerScreenImage(%s), SplitScreenIdent (%s)", new Object[] {
            s, s1
        });
    }

    public final void a(boolean flag)
    {
        d.a(c, flag);
        d.a(a, flag);
    }

    public final void a(byte abyte0[])
    {
        b.b("setImage(%s)", new Object[] {
            abyte0
        });
        d.a(c, abyte0);
        if (abyte0 != null)
        {
            abyte0 = ahl.a(BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length));
            if (abyte0 != null && abyte0.length > 0)
            {
                d.a(a, abyte0);
            }
            return;
        } else
        {
            d.a(a, abyte0);
            return;
        }
    }
}
