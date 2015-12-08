// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.util.List;

final class nhq extends mtf
{

    private final String a;
    private final String b;
    private final nhr c;
    private final ngg j;

    nhq(String s, String s1, String s2, nhr nhr1, ngg ngg)
    {
        super(s);
        a = s1;
        b = s2;
        c = nhr1;
        j = ngg;
    }

    protected final mue a(Context context)
    {
        context = c.a(a, b, j, false);
        mue mue1 = nhk.a(context);
        if (((ngw) (context)).a)
        {
            mue1.a().putInt("account_id", ((Integer)((ngw) (context)).f.get(0)).intValue());
        }
        return mue1;
    }
}
