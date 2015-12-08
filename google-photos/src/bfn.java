// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.consumerphotoeditor.views.CropOverlayView;

final class bfn
    implements android.view.View.OnClickListener
{

    private bfk a;

    bfn(bfk bfk1)
    {
        a = bfk1;
        super();
    }

    public final void onClick(View view)
    {
        if (bfk.a(a).g || bfk.a(a).p || bfk.a(a).q)
        {
            return;
        }
        mry.a(bfk.g(a), 4, (new msn()).a(new msm(pwu.I)).a(new msm(pwu.r)).a(bfk.h(a)));
        view = bfk.d(a).a;
        if (view == bdp.c || view == bdp.d)
        {
            bfk.d(a).j();
            bfk.a(a).a();
        }
        if (view == bdp.h || view == bdp.i || view == bdp.g || view == bdp.f)
        {
            bfk.d(a).g();
            ((bdx)bfk.e(a)).r_();
            return;
        } else
        {
            bfk.f(a).b(41);
            return;
        }
    }
}
