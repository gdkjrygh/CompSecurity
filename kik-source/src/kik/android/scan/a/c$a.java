// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.scan.a;

import com.kik.scan.RemoteKikCode;

// Referenced classes of package kik.android.scan.a:
//            c, a

private static final class a extends c
{

    a a;

    public final byte[] a()
    {
        byte abyte1[] = null;
        byte abyte0[] = abyte1;
        if (a != null)
        {
            abyte0 = abyte1;
            if (a.c() != null)
            {
                abyte0 = a.c().encode();
            }
        }
        abyte1 = abyte0;
        if (abyte0 == null)
        {
            abyte1 = new byte[0];
        }
        return abyte1;
    }

    public final String b()
    {
        if (a == null)
        {
            return "";
        } else
        {
            return a.d();
        }
    }

    public final int c()
    {
        if (a == null)
        {
            return 0;
        } else
        {
            return a.a();
        }
    }

    ode(a a1)
    {
        a = a1;
    }
}
