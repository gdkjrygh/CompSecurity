// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public final class mqb
    implements omb, opl, ops, opv
{

    mqj a;
    mqg b;
    mqi c;

    public mqb(opd opd1)
    {
        opd1.a(this);
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        a = (mqj)olm1.a(mqj);
        c = (mqi)olm1.a(mqi);
    }

    public final void a(Bundle bundle)
    {
        if (bundle != null)
        {
            b = (mqg)bundle.getParcelable("requestcodehelper_pending_requests");
            return;
        } else
        {
            b = new mqg();
            return;
        }
    }

    public final void e(Bundle bundle)
    {
        bundle.putParcelable("requestcodehelper_pending_requests", b);
    }
}
