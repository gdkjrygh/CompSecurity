// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.io.File;

class bzt extends mtf
{

    private final bzo a;
    private final String b;
    private final String c;
    private final boolean j;

    bzt(Context context, bzo bzo1, String s, String s1, boolean flag)
    {
        super(context, bzo.b);
        a = bzo1;
        b = s;
        c = s1;
        j = flag;
    }

    protected final mue a()
    {
        String s = a.a(b, c, j);
        if (s == null)
        {
            return new mue(false);
        }
        File file = new File(s);
        if (!file.exists() || !file.canRead() || file.length() == 0L)
        {
            bzo.a(a, b);
            return new mue(false);
        } else
        {
            mue mue1 = new mue(true);
            mue1.a().putString("path", s);
            return mue1;
        }
    }
}
