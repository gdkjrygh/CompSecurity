// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux.fragment;

import android.support.v4.app.FragmentActivity;

// Referenced classes of package com.pinterest.activity.nux.fragment:
//            NUXEndScreenFragment

class this._cls0
    implements Runnable
{

    final NUXEndScreenFragment this$0;

    public void run()
    {
        if (getActivity() != null)
        {
            getActivity().finish();
        }
    }

    ()
    {
        this$0 = NUXEndScreenFragment.this;
        super();
    }
}
