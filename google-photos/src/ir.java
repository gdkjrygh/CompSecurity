// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public class ir
    implements mau
{

    public iu a;

    public ir()
    {
    }

    public ir(Context context)
    {
        if (a())
        {
            a = new is(context);
            return;
        } else
        {
            a = new it();
            return;
        }
    }

    public static boolean a()
    {
        return android.os.Build.VERSION.SDK_INT >= 19;
    }

    public lzx a(jyw jyw)
    {
        return new mao(jyw);
    }
}
