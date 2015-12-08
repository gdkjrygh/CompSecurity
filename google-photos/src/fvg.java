// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

class fvg
{

    final Context a;
    final neq b;

    fvg(Context context)
    {
        a = context;
        b = new neq(context, new fvh(this));
    }

    static void a(ekp ekp)
    {
        if (!(ekp instanceof fuv))
        {
            ekp = String.valueOf(ekp.getClass());
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(ekp).length() + 28)).append("Expected LocalMedia, found: ").append(ekp).toString());
        } else
        {
            return;
        }
    }

    static void a(ekq ekq)
    {
        if (!(ekq instanceof fux))
        {
            ekq = String.valueOf(ekq.getClass());
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(ekq).length() + 38)).append("Expected LocalMediaCollection, found: ").append(ekq).toString());
        } else
        {
            return;
        }
    }
}
