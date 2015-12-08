// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.EnumSet;

public final class foi
    implements hzv
{

    private hzv a;
    private mmr b;
    private boolean c;

    public foi(Context context)
    {
        b = (mmr)olm.a(context, mmr);
        b();
    }

    private void b()
    {
        c = b.e();
        Object obj;
        if (c)
        {
            obj = new foj();
        } else
        {
            obj = new fwl(b);
        }
        a = ((hzv) (obj));
    }

    public final EnumSet a()
    {
        if (c != b.e())
        {
            b();
        }
        return a.a();
    }
}
