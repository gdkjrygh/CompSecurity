// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public final class hyh
    implements mti, omb, opl, ops, opv
{

    public gll a;
    public mtj b;
    public ekp c;
    private nwm d;
    private noz e;
    private fba f;

    public hyh(opd opd1)
    {
        opd1.a(this);
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        a = (gll)olm1.a(gll);
        b = ((mtj)olm1.a(mtj)).a(this);
        d = (nwm)olm1.a(nwm);
        e = noz.a(context, "AsyncScrollToMedia", new String[0]);
        f = (fba)olm1.a(fba);
    }

    public final void a(Bundle bundle)
    {
        if (bundle != null)
        {
            c = (ekp)bundle.getParcelable("current_media_to_scroll_to");
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
            ((hyo)d.ai_().a(hyo)).a(f.c, i, new hyi(this));
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public final boolean a(ekp ekp1)
    {
        return ekp1 != null && c != ekp1;
    }

    public final void e(Bundle bundle)
    {
        bundle.putParcelable("current_media_to_scroll_to", c);
    }
}
