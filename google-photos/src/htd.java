// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class htd
{

    public static final String a = mmu.getName();
    public static final String b = htb.getName();
    private static htc c;

    public static void a(Context context, olm olm1)
    {
        if (c == null)
        {
            c = new htc();
        }
        olm1.a(htb, new htb(context, (mmv)olm1.a(mmv)));
    }

    public static void a(olm olm1)
    {
        if (c == null)
        {
            c = new htc();
        }
        olm1.a(mmu, new mmu[] {
            (htb)olm1.a(htb)
        });
    }

}
