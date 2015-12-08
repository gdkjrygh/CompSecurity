// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

public final class bgq
    implements mti, omb, opl, ops, opv
{

    public mtj a;
    public Uri b;
    private final ar c;
    private noz d;

    public bgq(ar ar1, opd opd1)
    {
        c = ar1;
        opd1.a(this);
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        d = noz.a(context, "StoragePrecheckMixin", new String[0]);
        a = (mtj)olm1.a(mtj);
        a.a(this);
    }

    public final void a(Bundle bundle)
    {
        if (bundle != null)
        {
            b = (Uri)bundle.getParcelable("video_uri");
        }
    }

    public final void a(String s, mue mue, mua mua)
    {
        if ("StorageLookupTask".equals(s))
        {
            s = imp.a(mue);
            if (b.a(mue, "StorageLookupTask", d) && ((imp) (s)).a != -1L && ((imp) (s)).b != -1L && ((imp) (s)).a > ((imp) (s)).b)
            {
                mue = c.c();
                bgk.b(((imp) (s)).a, ((imp) (s)).b, ((imp) (s)).c).a(mue, "LowStorageDialogFragment");
                return;
            }
        }
    }

    public final void e(Bundle bundle)
    {
        bundle.putParcelable("video_uri", b);
    }
}
