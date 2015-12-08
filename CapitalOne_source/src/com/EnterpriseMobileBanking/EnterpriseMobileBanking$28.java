// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking;

import android.view.View;

// Referenced classes of package com.EnterpriseMobileBanking:
//            EnterpriseMobileBanking

class val.lob
    implements Runnable
{

    final EnterpriseMobileBanking this$0;
    final View val$lob;

    public void run()
    {
        View view = val$lob.findViewById(0x7f080098);
        android.view.bileBanking bilebanking = view.getLayoutParams();
        bilebanking.h = val$lob.findViewById(0x7f0800be).getWidth();
        view.setLayoutParams(bilebanking);
        view = val$lob.findViewById(0x7f080099);
        bilebanking = view.getLayoutParams();
        bilebanking.h = val$lob.getWidth();
        view.setLayoutParams(bilebanking);
        int _tmp = EnterpriseMobileBanking.access$002(0);
        val$lob.invalidate();
        val$lob.post(EnterpriseMobileBanking.access$600(EnterpriseMobileBanking.this));
    }

    ()
    {
        this$0 = final_enterprisemobilebanking;
        val$lob = View.this;
        super();
    }
}
