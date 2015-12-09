// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.os.Handler;
import android.view.View;

// Referenced classes of package android.support.design.widget:
//            Snackbar

class this._cls1
    implements Runnable
{

    final is._cls0 this$1;

    public void run()
    {
        Snackbar.access$300(_fld0, 3);
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class android/support/design/widget/Snackbar$5

/* anonymous class */
    class Snackbar._cls5
        implements Snackbar.SnackbarLayout.OnAttachStateChangeListener
    {

        final Snackbar this$0;

        public void onViewAttachedToWindow(View view)
        {
        }

        public void onViewDetachedFromWindow(View view)
        {
            if (isShownOrQueued())
            {
                Snackbar.access$100().post(new Snackbar._cls5._cls1());
            }
        }

            
            {
                this$0 = Snackbar.this;
                super();
            }
    }

}
