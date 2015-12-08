// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.photos.jobqueue.JobService;

public final class fpv
    implements omb, opl, opr, ops, opv
{

    private Context a;
    private boolean b;

    public fpv(opd opd1)
    {
        opd1.a(this);
    }

    public final void a(Context context, olm olm, Bundle bundle)
    {
        a = context;
    }

    public final void a(Bundle bundle)
    {
        if (bundle != null)
        {
            b = bundle.getBoolean("job_queue_started", false);
        }
    }

    public final void al_()
    {
        if (!b)
        {
            JobService.b(a);
            b = true;
        }
    }

    public final void e(Bundle bundle)
    {
        bundle.putBoolean("job_queue_started", b);
    }
}
