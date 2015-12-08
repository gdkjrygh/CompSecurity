// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public final class iis
    implements dhc, omb, opv
{

    private ifj a;
    private mmr b;

    public iis(opd opd1)
    {
        opd1.a(this);
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        a = (ifj)olm1.a(ifj);
        b = (mmr)olm1.a(mmr);
    }

    public final void a(rv rv1)
    {
    }

    public final void a(rv rv1, boolean flag)
    {
        int i;
        if (a.a(b.d()))
        {
            i = b.zU;
        } else
        {
            i = b.zV;
        }
        rv1.c(i);
    }
}
