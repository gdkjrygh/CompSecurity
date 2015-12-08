// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.google.android.gms.common.api.Status;

final class jvd
    implements jux
{

    private jva a;

    jvd(jva jva1)
    {
        a = jva1;
        super();
    }

    public final void a(Status status)
    {
        jva.b().a(String.format("Cast screen has ended: %d", new Object[] {
            Integer.valueOf(status.g)
        }), new Object[0]);
        if (jva.b(a) != null)
        {
            jva.b(a).post(new jve(this));
        }
    }
}
