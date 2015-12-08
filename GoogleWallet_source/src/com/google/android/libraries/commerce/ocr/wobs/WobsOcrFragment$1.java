// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.wobs;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import java.util.TimerTask;

// Referenced classes of package com.google.android.libraries.commerce.ocr.wobs:
//            WobsOcrFragment

final class this._cls0 extends TimerTask
{

    final WobsOcrFragment this$0;

    public final void run()
    {
        getChildFragmentManager().beginTransaction().replace(ainer, WobsOcrFragment.access$000(WobsOcrFragment.this), WobsOcrFragment.access$100()).addToBackStack(null).commit();
    }

    ()
    {
        this$0 = WobsOcrFragment.this;
        super();
    }
}
