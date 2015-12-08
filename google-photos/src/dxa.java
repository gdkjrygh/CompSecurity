// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class dxa
    implements dxb
{

    private dui a;

    public dxa(dui dui1)
    {
        a = dui1;
    }

    public final String a()
    {
        return "PHOTOS_ASSISTANT_JOB_SUBSYSTEM";
    }

    public final boolean a(Context context, int i)
    {
        ((dxz)olm.a(context, dxz)).a(context, a);
        return true;
    }

    public final boolean b()
    {
        return false;
    }

    public final byte[] c()
    {
        dxf dxf1 = new dxf();
        dxf1.a = Integer.valueOf(a.a());
        dxf1.b = a.b();
        dxf1.c = a.c();
        return qlw.a(dxf1);
    }

    public final String toString()
    {
        String s = String.valueOf(a.toString());
        if (s.length() != 0)
        {
            return "Card Dismiss Job : ".concat(s);
        } else
        {
            return new String("Card Dismiss Job : ");
        }
    }
}
