// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;

final class nsi extends mtf
{

    private final int a;
    private final ArrayList b;
    private final nqx c;

    public nsi(Context context, int i, ArrayList arraylist, nqx nqx)
    {
        super(context, "NotificationsAckTask");
        a = i;
        b = arraylist;
        c = nqx;
    }

    protected final mue a()
    {
        ntj ntj1 = new ntj(d(), a, b, c);
        ntj1.d();
        return new mue(((nxx) (ntj1)).l, ((nxx) (ntj1)).n, null);
    }
}
