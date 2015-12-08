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

class this._cls0
    implements Runnable
{

    final RecCard this$0;

    public void run()
    {
        RecCard.access$1100(RecCard.this).setVisibility(0);
        RecCard.access$1200(RecCard.this).setVisibility(0);
        e e1 = a.a();
        e1.a(f.b(14D, 14D));
        e1.a(new d() {

            final RecCard._cls8 this$1;

            public void onSpringAtRest(e e2)
            {
                e2 = AnimationUtils.loadAnimation(getContext(), 0x7f04001b);
                RecCard.access$1100(this$0).startAnimation(e2);
            }

            public void onSpringUpdate(e e2)
            {
                float f1 = (float)e2.d.a;
                ad.c(RecCard.access$1100(this$0), o.a(f1, 0.0F, 0.45F, 1.0F, 1.0F));
                RecCard.access$1100(this$0).setTranslationY((1.0F - f1) * 50F);
                RecCard.access$1100(this$0).setAlpha(f1);
                RecCard.access$1200(this$0).setTranslationY((1.0F - f1) * 50F);
                RecCard.access$1200(this$0).setAlpha(f1);
            }

            
            {
                this$1 = RecCard._cls8.this;
                super();
            }
        });
        e1.a(0.0D);
        e1.b(1.0D);
    }

    _cls1.this._cls1()
    {
        this$0 = RecCard.this;
        super();
    }
}
