// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class gji
    implements mmu
{

    private final Context a;

    gji(Context context)
    {
        a = context;
    }

    public final void a(int i)
    {
        gjr gjr1 = (gjr)olm.a(a, gjr);
        boolean flag;
        if (!gjr.a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gjr1.a(i, flag);
    }

    public final void b(int i)
    {
    }
}
