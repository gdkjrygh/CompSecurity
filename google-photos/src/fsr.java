// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class fsr extends fte
{

    private static final msm a;
    private final Context b;

    fsr(Context context)
    {
        b = context;
    }

    public final void a(fsv fsv1)
    {
        fsv1 = (new msn()).a(a).a(fsv1.i);
        mry.a(b, 30, fsv1);
    }

    static 
    {
        a = new msm(pwt.q);
    }
}
