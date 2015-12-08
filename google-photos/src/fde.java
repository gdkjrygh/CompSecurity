// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

final class fde
    implements dup, fda, mti, omb, opl, opn
{

    private final am a;
    private Context b;
    private mtj c;
    private fbw d;

    public fde(am am)
    {
        a = am;
    }

    public final hgo a(dum dum)
    {
        fbx fbx1 = d.b();
        switch (fdf.a[fbx1.ordinal()])
        {
        default:
            dum = String.valueOf(fbx1);
            throw new IllegalStateException((new StringBuilder(String.valueOf(dum).length() + 41)).append("unhandled DeviceManagementFeature state: ").append(dum).toString());

        case 1: // '\001'
            return new fdr(b, a, dum);

        case 2: // '\002'
        case 3: // '\003'
            return new fdv(dum, fbx1);
        }
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        b = context;
        d = (fbw)olm1.a(fbw);
        c = (mtj)olm1.a(mtj);
    }

    public final void a(Bundle bundle)
    {
        c.a(this);
    }

    public final void a(fcm fcm)
    {
        c.a(new fdg(fcm));
    }

    public final void a(String s, mue mue1, mua mua)
    {
        while (!"com.google.android.apps.photos.devicemanagement.assistant.RECLAIM_SPACE".equals(s) || mue1 == null || !mue1.c()) 
        {
            return;
        }
        nuo.a(a, nup.F);
    }

    public final void a(olm olm1)
    {
        olm1.a(fda, this);
    }

    public final hhg b()
    {
        return new fdy();
    }

    public final void c()
    {
        c.b(this);
    }
}
