// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public final class fgq
    implements omb, opl, ops, opv
{

    public static final ekk a = (new ekm()).a(hpe).a();
    public final int b;
    public final fgs c;
    public mtj d;
    public mmr e;
    public ekq f;
    private noz g;

    public fgq(opd opd1, int i, fgs fgs1)
    {
        b = i;
        c = (fgs)p.b(fgs1, "must provide non-null listener");
        opd1.a(this);
    }

    static void a(fgq fgq1, mue mue1)
    {
        if (mue1 == null || mue1.c())
        {
            String s = elc.a(fgq1.b);
            if (fgq1.g.a())
            {
                noy.a("result", mue1);
                noy.a("taskTag", s);
            }
            fgq1.c.Z_();
            return;
        } else
        {
            fgq1.f = (ekq)mue1.a().getParcelable("com.google.android.apps.photos.core.media_collection");
            fgq1.c.Y_();
            return;
        }
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        d = ((mtj)olm1.a(mtj)).a(elc.a(b), new fgr(this));
        e = (mmr)olm1.a(mmr);
        g = noz.a(context, "LoadAlbumMixin", new String[0]);
    }

    public final void a(Bundle bundle)
    {
        if (bundle != null)
        {
            f = (ekq)bundle.getParcelable("com.google.android.apps.photos.core.media_collection");
        }
    }

    public final void e(Bundle bundle)
    {
        bundle.putParcelable("com.google.android.apps.photos.core.media_collection", f);
    }

}
