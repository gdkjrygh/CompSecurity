// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class hlu extends mtf
{

    private final int a;
    private final String b;

    public hlu(int i, String s)
    {
        super("DeleteCollection");
        a = i;
        b = s;
    }

    protected final mue a(Context context)
    {
        boolean flag;
        if (((erz)olm.a(context, erz)).b(a, b) > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return new mue(flag);
    }
}
