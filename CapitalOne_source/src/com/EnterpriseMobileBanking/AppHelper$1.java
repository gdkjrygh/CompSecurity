// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking;

import android.view.View;
import android.view.ViewTreeObserver;

// Referenced classes of package com.EnterpriseMobileBanking:
//            AppHelper, EnterpriseMobileBanking

static final class _cls1.val.root
    implements Runnable
{

    public void run()
    {
        final View root = AppHelper.access$000().findViewById(0x7f08009b);
        root.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

            final AppHelper._cls1 this$0;
            final View val$root;

            public void onGlobalLayout()
            {
                int i = root.getRootView().getHeight();
                int j = root.getHeight();
                root.postDelayed((i - j). new Runnable() {

                    final _cls1 this$1;
                    final int val$heightDiff;

                    public void run()
                    {
                        boolean flag;
                        if (heightDiff > 100)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        boolean _tmp = AppHelper.access$102(flag);
                    }

            
            {
                this$1 = final__pcls1;
                heightDiff = I.this;
                super();
            }
                }, 250L);
            }

            
            {
                this$0 = AppHelper._cls1.this;
                root = view;
                super();
            }
        });
    }

    _cls1.val.root()
    {
    }
}
