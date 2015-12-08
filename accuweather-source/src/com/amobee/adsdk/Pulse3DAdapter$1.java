// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.adsdk;

import com.amobee.pulse3d.Pulse3DView;

// Referenced classes of package com.amobee.adsdk:
//            Pulse3DAdapter, AmobeeAdPlaceholder

class val.view
    implements Runnable
{

    final Pulse3DAdapter this$0;
    private final AmobeeAdPlaceholder val$placeholder;
    private final Pulse3DView val$view;

    public void run()
    {
        val$placeholder.setCurrentAdapter(Pulse3DAdapter.this);
        val$view.setVisibility(0);
        val$placeholder.setNextAdapter(null);
        do
        {
            if (val$placeholder.getChildCount() <= 1)
            {
                fireAdRecieved(networkName);
                return;
            }
            if (val$placeholder.getChildAt(0) != Pulse3DAdapter.access$0(Pulse3DAdapter.this))
            {
                val$placeholder.removeViewAt(0);
            } else
            {
                val$placeholder.removeViewAt(1);
            }
        } while (true);
    }

    er()
    {
        this$0 = final_pulse3dadapter;
        val$placeholder = amobeeadplaceholder;
        val$view = Pulse3DView.this;
        super();
    }
}
