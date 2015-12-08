// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.main;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.widget.SymbolView;

// Referenced classes of package com.skype.android.app.main:
//            HubMaterialActivity

final class this._cls1
    implements Runnable
{

    final is._cls0 this$1;

    public final void run()
    {
        PropertyValuesHolder propertyvaluesholder = PropertyValuesHolder.ofFloat(View.SCALE_X.getName(), new float[] {
            1.25F, 1.15F
        });
        PropertyValuesHolder propertyvaluesholder1 = PropertyValuesHolder.ofFloat(View.SCALE_Y.getName(), new float[] {
            1.25F, 1.15F
        });
        if (HubMaterialActivity.access$000(_fld0) != null)
        {
            HubMaterialActivity.access$000(_fld0).cancel();
        }
        HubMaterialActivity.access$002(_fld0, ObjectAnimator.ofPropertyValuesHolder(skypeLogo, new PropertyValuesHolder[] {
            propertyvaluesholder, propertyvaluesholder1
        }));
        HubMaterialActivity.access$000(_fld0).setInterpolator(new AccelerateDecelerateInterpolator());
        HubMaterialActivity.access$000(_fld0).setRepeatMode(2);
        HubMaterialActivity.access$000(_fld0).setRepeatCount(-1);
        HubMaterialActivity.access$000(_fld0).setDuration(500L);
        HubMaterialActivity.access$000(_fld0).start();
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/skype/android/app/main/HubMaterialActivity$3

/* anonymous class */
    final class HubMaterialActivity._cls3
        implements android.view.View.OnTouchListener
    {

        final HubMaterialActivity this$0;

        public final boolean onTouch(View view, MotionEvent motionevent)
        {
            boolean flag = true;
            motionevent.getAction();
            JVM INSTR tableswitch 0 3: default 36
        //                       0 40
        //                       1 142
        //                       2 36
        //                       3 142;
               goto _L1 _L2 _L3 _L1 _L3
_L1:
            flag = false;
_L5:
            return flag;
_L2:
            analytics.c(AnalyticsEvent.dg);
            if (HubMaterialActivity.access$000(HubMaterialActivity.this) != null)
            {
                HubMaterialActivity.access$000(HubMaterialActivity.this).cancel();
            }
            skypeLogo.animate().scaleX(1.25F).scaleY(1.25F).setDuration(200L).setInterpolator(new DecelerateInterpolator());
            if (android.os.Build.VERSION.SDK_INT >= 16)
            {
                skypeLogo.animate().withEndAction(new HubMaterialActivity._cls3._cls1());
                return true;
            }
            continue; /* Loop/switch isn't completed */
_L3:
            if (HubMaterialActivity.access$000(HubMaterialActivity.this) != null)
            {
                HubMaterialActivity.access$000(HubMaterialActivity.this).cancel();
            }
            skypeLogo.animate().scaleX(1.0F).scaleY(1.0F).setInterpolator(new BounceInterpolator()).setDuration(600L);
            if (android.os.Build.VERSION.SDK_INT >= 16)
            {
                skypeLogo.animate().withEndAction(null);
                return true;
            }
            if (true) goto _L5; else goto _L4
_L4:
        }

            
            {
                this$0 = HubMaterialActivity.this;
                super();
            }
    }

}
