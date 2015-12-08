// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class fds
    implements dwg
{

    private fcm a;
    private am b;
    private fdr c;

    fds(fdr fdr1, fcm fcm, am am1)
    {
        c = fdr1;
        a = fcm;
        b = am1;
        super();
    }

    public final void a(Context context)
    {
        if (c.a.a())
        {
            fdn.a(a).a(b.h(), "device_mgmt_dialog_simple");
            return;
        } else
        {
            context = b.h();
            nuq nuq1 = new nuq();
            nuq1.a = nup.F;
            nuo.a(context, nuq1);
            return;
        }
    }
}
