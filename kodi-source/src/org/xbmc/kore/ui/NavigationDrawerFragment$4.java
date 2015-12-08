// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;

// Referenced classes of package org.xbmc.kore.ui:
//            NavigationDrawerFragment

class val.launchIntentFinal
    implements Runnable
{

    final NavigationDrawerFragment this$0;
    final Intent val$launchIntentFinal;

    public void run()
    {
        startActivity(val$launchIntentFinal);
        getActivity().overridePendingTransition(0x7f04000a, 0x7f04000b);
    }

    ()
    {
        this$0 = final_navigationdrawerfragment;
        val$launchIntentFinal = Intent.this;
        super();
    }
}
