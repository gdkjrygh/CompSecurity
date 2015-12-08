// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public final class edo
    implements omb, omz, opv
{

    private boolean a;
    private boolean b;
    private omx c;
    private mmv d;
    private mmr e;

    public edo(opd opd1)
    {
        opd1.a(this);
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        c = (omx)olm1.a(omx);
        c.a(this);
        d = (mmv)olm1.a(mmv);
        e = (mmr)olm1.a(mmr);
    }

    public final void a(boolean flag)
    {
label0:
        {
            if (flag && !b)
            {
                if (!a)
                {
                    long l = d.a(e.d()).a("first_assistant_load_time_stamp", System.currentTimeMillis());
                    d.b(e.d()).b("first_assistant_load_time_stamp", l).d();
                    a = true;
                }
                int i = d.a(e.d()).a("assistant_view_experience_count", 0);
                if (i >= 10)
                {
                    break label0;
                }
                d.b(e.d()).c("assistant_view_experience_count", i + 1).d();
            }
            return;
        }
        b = true;
    }
}
