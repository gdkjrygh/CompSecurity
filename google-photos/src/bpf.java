// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class bpf
    implements mrv
{

    bpf(bpe bpe)
    {
    }

    public final void a(Context context, mru mru1)
    {
        if (mru1 instanceof mry)
        {
            String s = String.valueOf(b.d(((mry)mru1).b.a));
            if (s.length() != 0)
            {
                "VE: ".concat(s);
            } else
            {
                new String("VE: ");
            }
        }
        mru1.a(context);
    }
}
