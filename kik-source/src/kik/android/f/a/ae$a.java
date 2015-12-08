// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.f.a;

import android.content.Context;

// Referenced classes of package kik.android.f.a:
//            ae

public static final class a extends Exception
{

    private int a;

    public final String a(Context context)
    {
        String s = context.getString(0x7f0900ae);
        switch (a)
        {
        default:
            return s;

        case 1: // '\001'
            return context.getString(0x7f090134);
        }
    }

    public xt(int i)
    {
        a = i;
    }
}
