// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public class bub extends mtf
{

    private final bty a;
    private final String b;
    private final String c;
    private final boolean j;

    public bub(Context context, bty bty1, String s, String s1, boolean flag)
    {
        super(context, bty.a);
        a = bty1;
        b = s;
        c = s1;
        j = flag;
    }

    protected final mue a()
    {
        boolean flag = false;
        if (!j) goto _L2; else goto _L1
_L1:
        bty.a(a, b);
_L4:
        mue mue1 = new mue(true);
        mue1.a().putBoolean("entry_missing", flag);
        return mue1;
_L2:
        if (!bty.a(a, b, c))
        {
            flag = true;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
