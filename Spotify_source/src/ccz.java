// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.internal.zzr;

public final class ccz
    implements cnz
{

    private int a;
    private int b;

    public ccz()
    {
        this((byte)0);
    }

    private ccz(byte byte0)
    {
        a = 2500;
    }

    public final int a()
    {
        return a;
    }

    public final void a(zzr zzr)
    {
        boolean flag = true;
        b = b + 1;
        a = (int)((float)a + (float)a);
        if (b > 1)
        {
            flag = false;
        }
        if (!flag)
        {
            throw zzr;
        } else
        {
            return;
        }
    }

    public final int b()
    {
        return b;
    }
}
