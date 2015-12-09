// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.persona;

import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package com.dominos.nina.persona:
//            DominosNinaPersona

class val.v
    implements Runnable
{

    final DominosNinaPersona this$0;
    final View val$v;

    public void run()
    {
        DominosNinaPersona.access$500(DominosNinaPersona.this).removeAllViews();
        if (val$v != null)
        {
            DominosNinaPersona.access$500(DominosNinaPersona.this).addView(val$v);
        }
    }

    ()
    {
        this$0 = final_dominosninapersona;
        val$v = View.this;
        super();
    }
}
