// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.accessenable;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;

// Referenced classes of package com.phunware.nbc.sochi.accessenable:
//            SelectProviderFragment, SelectProviderActivity

class val.progressBar
    implements android.view.lectProviderFragment._cls1
{

    final SelectProviderFragment this$0;
    final View val$layout;
    final View val$progressBar;

    public void onClick(View view)
    {
        if (isActivityDead())
        {
            return;
        } else
        {
            ((SelectProviderActivity)getActivity()).showProviderList((ArrayList)getArguments().getSerializable("ARG_MVPDS"));
            val$layout.setVisibility(4);
            val$progressBar.setVisibility(0);
            return;
        }
    }

    ()
    {
        this$0 = final_selectproviderfragment;
        val$layout = view;
        val$progressBar = View.this;
        super();
    }
}
