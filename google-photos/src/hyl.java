// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public final class hyl
    implements mti, omb, opl, opv
{

    final Activity a;
    final String b;
    nwm c;
    gll d;
    mtj e;
    private mwx f;
    private noz g;

    public hyl(Activity activity, opd opd1, String s)
    {
        a = activity;
        opd1.a(this);
        b = s;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        d = (gll)olm1.a(gll);
        e = ((mtj)olm1.a(mtj)).a(this);
        f = (mwx)olm1.a(mwx);
        c = (nwm)olm1.a(nwm);
        g = noz.a(a, "ScrollToMediaMixin", new String[0]);
    }

    public final void a(Bundle bundle)
    {
        if (!a.getIntent().hasExtra(b))
        {
            return;
        } else
        {
            f.a(new hym(this));
            return;
        }
    }

    public final void a(String s, mue mue1, mua mua)
    {
        if ("com.google.android.apps.photos.pager.model.FindPositionTask".equals(s)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (mue1 != null && !mue1.c())
        {
            break; /* Loop/switch isn't completed */
        }
        if (mue1 != null)
        {
            s = mue1.c;
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        int i = mue1.a().getInt("position", 0);
        if (i != -1)
        {
            s = (ekp)mue1.a().getParcelable("com.google.android.apps.photos.core.media");
            ((hyo)c.ai_().a(hyo)).a(s, i, new hyn(this));
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }
}
