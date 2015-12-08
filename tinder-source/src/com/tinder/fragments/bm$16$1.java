// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewStub;
import android.widget.LinearLayout;
import com.tinder.utils.o;

// Referenced classes of package com.tinder.fragments:
//            bm

final class der extends ViewOutlineProvider
{

    final val a;

    public final void getOutline(View view, Outline outline)
    {
        outline.setOval(0, 0, view.getWidth(), view.getHeight());
    }

    teListener(teListener telistener)
    {
        a = telistener;
        super();
    }

    // Unreferenced inner class com/tinder/fragments/bm$16

/* anonymous class */
    final class bm._cls16
        implements android.view.ViewStub.OnInflateListener
    {

        final bm a;

        public final void onInflate(ViewStub viewstub, View view)
        {
            bm.a(a, (LinearLayout)view.findViewById(0x7f0e01c4));
            bm.b(a, bm.a(a).findViewById(0x7f0e01c0));
            bm.c(a, bm.a(a).findViewById(0x7f0e01c1));
            bm.d(a, bm.a(a).findViewById(0x7f0e01c5));
            if (o.e())
            {
                viewstub = new bm._cls16._cls1(this);
                bm.b(a).setOutlineProvider(viewstub);
                bm.c(a).setOutlineProvider(viewstub);
                bm.d(a).setOutlineProvider(viewstub);
            }
            bm.b(a).setOnClickListener(a);
            bm.c(a).setOnClickListener(a);
            bm.d(a).setOnClickListener(a);
            bm.b(a).setVisibility(4);
            bm.c(a).setVisibility(4);
            bm.d(a).setVisibility(4);
            bm.e(a);
        }

            
            {
                a = bm1;
                super();
            }
    }

}
