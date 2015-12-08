// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

public final class bgo
    implements mti, omb, opl, opr, ops, opv
{

    mtj a;
    orr b;
    Uri c;
    Uri d;
    boolean e;
    private final omp f;
    private final bgp g;
    private final osu h;
    private Context i;
    private noz j;

    public bgo(omp omp, opd opd1, bgp bgp1, osu osu)
    {
        f = omp;
        g = bgp1;
        h = osu;
        opd1.a(this);
    }

    private void a(Uri uri)
    {
        e = false;
        a.b.a("SaveVideoMixin");
        g.a(uri);
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        i = context;
        j = noz.a(context, "SaveVideoMixin", new String[0]);
        a = (mtj)olm1.a(mtj);
        a.a(this);
    }

    public final void a(Bundle bundle)
    {
        if (bundle != null)
        {
            b = (orr)bundle.getParcelable("video");
            c = (Uri)bundle.getParcelable("video_uri");
            d = (Uri)bundle.getParcelable("output_uri");
            e = bundle.getBoolean("is_saving");
        }
    }

    public final void a(String s, mue mue1, mua mua1)
    {
        if (!"StorageLookupTask".equals(s)) goto _L2; else goto _L1
_L1:
        s = imp.a(mue1);
        if (!b.a(mue1, "StorageLookupTask", j) || ((imp) (s)).a == -1L || ((imp) (s)).b == -1L) goto _L4; else goto _L3
_L3:
        long l = (((imp) (s)).a * (b.f - b.e)) / b.a.f;
        if (l <= ((imp) (s)).b) goto _L4; else goto _L5
_L5:
        bgk.a(l, ((imp) (s)).b, ((imp) (s)).c).a(((am) (f)).B, "LowStorageDialogFragment");
        a(((Uri) (null)));
_L7:
        return;
_L4:
        a.a(new bgn(i, b, c, d, h));
        return;
_L2:
        if ("RenderVideoTask".equals(s))
        {
            if (b.a(mue1, "RenderVideoTask", j))
            {
                s = (Uri)mue1.a().getParcelable("result_output_uri");
            } else
            {
                s = null;
            }
            a(((Uri) (s)));
            return;
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void al_()
    {
        if (e)
        {
            b();
        }
    }

    void b()
    {
        a.b.a(null, null, "SaveVideoMixin", false);
    }

    public final void e(Bundle bundle)
    {
        bundle.putParcelable("video", b);
        bundle.putParcelable("video_uri", c);
        bundle.putParcelable("output_uri", d);
        bundle.putBoolean("is_saving", e);
    }
}
