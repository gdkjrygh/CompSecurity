// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.support.v4.view.af;
import android.support.v4.view.ak;
import android.support.v4.view.x;
import android.support.v7.internal.widget.ActionBarContextView;
import android.view.View;
import android.widget.PopupWindow;

// Referenced classes of package android.support.v7.app:
//            AppCompatDelegateImplV7

class this._cls0
    implements Runnable
{

    final AppCompatDelegateImplV7 this$0;

    public void run()
    {
        mActionModePopup.showAtLocation(mActionModeView, 55, 0, 0);
        AppCompatDelegateImplV7.access$400(AppCompatDelegateImplV7.this);
        x.c(mActionModeView, 0.0F);
        mFadeAnim = x.s(mActionModeView).a(1.0F);
        mFadeAnim.a(new ak() {

            final AppCompatDelegateImplV7._cls4 this$1;

            public void onAnimationEnd(View view)
            {
                x.c(mActionModeView, 1.0F);
                mFadeAnim.a(null);
                mFadeAnim = null;
            }

            public void onAnimationStart(View view)
            {
                mActionModeView.setVisibility(0);
            }

            
            {
                this$1 = AppCompatDelegateImplV7._cls4.this;
                super();
            }
        });
    }

    _cls1.this._cls1()
    {
        this$0 = AppCompatDelegateImplV7.this;
        super();
    }
}
