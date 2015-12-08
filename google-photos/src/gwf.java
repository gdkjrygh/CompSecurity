// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gwf
{

    final String a;
    final byte b[];

    gwf(int i)
    {
        this(i, null, null);
    }

    gwf(int i, String s, byte abyte0[])
    {
        boolean flag;
        if (i != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag, "status must be non-null");
        a = s;
        b = abyte0;
    }
}
