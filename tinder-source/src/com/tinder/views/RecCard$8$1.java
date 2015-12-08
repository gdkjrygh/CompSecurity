// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.view.View;
import android.view.animation.AnimationUtils;
import com.facebook.a.d;
import com.facebook.a.e;
import com.facebook.a.f;
import com.tinder.utils.a;
import com.tinder.utils.ad;
import com.tinder.utils.o;

// Referenced classes of package com.tinder.views:
//            RecCard

class this._cls1 extends d
{

    final is._cls0 this$1;

    public void onSpringAtRest(e e1)
    {
        e1 = AnimationUtils.loadAnimation(getContext(), 0x7f04001b);
        RecCard.access$1100(_fld0).startAnimation(e1);
    }

    public void onSpringUpdate(e e1)
    {
        float f = (float)e1.d._fld1;
        ad.c(RecCard.access$1100(_fld0), o.a(f, 0.0F, 0.45F, 1.0F, 1.0F));
        RecCard.access$1100(_fld0).setTranslationY((1.0F - f) * 50F);
        RecCard.access$1100(_fld0).setAlpha(f);
        RecCard.access$1200(_fld0).setTranslationY((1.0F - f) * 50F);
        RecCard.access$1200(_fld0).setAlpha(f);
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/tinder/views/RecCard$8

/* anonymous class */
    class RecCard._cls8
        implements Runnable
    {

        final RecCard this$0;

        public void run()
        {
            RecCard.access$1100(RecCard.this).setVisibility(0);
            RecCard.access$1200(RecCard.this).setVisibility(0);
            e e1 = a.a();
            e1.a(f.b(14D, 14D));
            e1.a(new RecCard._cls8._cls1());
            e1.a(0.0D);
            e1.b(1.0D);
        }

            
            {
                this$0 = RecCard.this;
                super();
            }
    }

}
