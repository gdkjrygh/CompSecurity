// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.FrameLayout;

final class itu
    implements android.view.View.OnFocusChangeListener
{

    private FrameLayout a;
    private itf b;

    itu(itf itf1, FrameLayout framelayout)
    {
        b = itf1;
        a = framelayout;
        super();
    }

    public final void onFocusChange(View view, boolean flag)
    {
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        if (b.w(itf.g(b))) goto _L2; else goto _L1
_L1:
        view = b.h();
        nuq nuq1 = new nuq();
        nuq1.a = nup.x;
        nuo.a(view, nuq1);
        a.requestFocus();
_L4:
        return;
_L2:
        mry.a(view, 10);
        if (itf.h(b) != null)
        {
            itf.i(b);
        }
        if (itf.j(b)) goto _L4; else goto _L3
_L3:
        itf.a(b, true);
        return;
        mry.a(view, 11);
        return;
    }
}
