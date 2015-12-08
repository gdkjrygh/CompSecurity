// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class dix
{

    public static final String a = mvi.getName();
    public static final String b = dit.getName();
    private static diw c;

    public static void a(Context context, olm olm1)
    {
        if (c == null)
        {
            c = new diw();
        }
        olm1.a(dit, new dit(context));
    }

    public static void a(olm olm1)
    {
        if (c == null)
        {
            c = new diw();
        }
        olm1.a(mvi, new mvi[] {
            new div()
        });
    }

}
