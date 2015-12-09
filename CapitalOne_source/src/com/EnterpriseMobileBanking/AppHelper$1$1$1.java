// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking;

import android.view.View;
import android.view.ViewTreeObserver;

// Referenced classes of package com.EnterpriseMobileBanking:
//            AppHelper, EnterpriseMobileBanking

class val.heightDiff
    implements Runnable
{

    final ._cls102 this$1;
    final int val$heightDiff;

    public void run()
    {
        boolean flag;
        if (val$heightDiff > 100)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        boolean _tmp = AppHelper.access$102(flag);
    }

    l.root()
    {
        this$1 = final_root;
        val$heightDiff = I.this;
        super();
    }

    // Unreferenced inner class com/EnterpriseMobileBanking/AppHelper$1

/* anonymous class */
    static final class AppHelper._cls1
        implements Runnable
    {

        public void run()
        {
            View view = AppHelper.access$000().findViewById(0x7f08009b);
            view.getViewTreeObserver().addOnGlobalLayoutListener(view. new AppHelper._cls1._cls1());
        }

    }


    // Unreferenced inner class com/EnterpriseMobileBanking/AppHelper$1$1

/* anonymous class */
    class AppHelper._cls1._cls1
        implements android.view.ViewTreeObserver.OnGlobalLayoutListener
    {

        final AppHelper._cls1 this$0;
        final View val$root;

        public void onGlobalLayout()
        {
            int i = root.getRootView().getHeight();
            int j = root.getHeight();
            root.postDelayed((i - j). new AppHelper._cls1._cls1._cls1(), 250L);
        }

            
            {
                this$0 = final__pcls1;
                root = View.this;
                super();
            }
    }

}
