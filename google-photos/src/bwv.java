// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.Log;
import android.util.LongSparseArray;

public class bwv extends mtf
{

    private static final String a = bwv.getSimpleName();
    private final cst b;

    public bwv(String s, cst cst1)
    {
        String s1 = a;
        super((new StringBuilder(String.valueOf(s1).length() + 1 + String.valueOf(s).length())).append(s1).append("|").append(s).toString());
        b = (cst)b.a(cst1, "musicLibrary", null);
    }

    protected final mue a(Context context)
    {
        context = new mue(b.a());
        if (context.c())
        {
            Log.w(a, "Failed to download soundtrack list from the network.");
        } else
        {
            boolean flag;
            if (b.c().c.size() == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                b.b();
                return context;
            }
        }
        return context;
    }

}
