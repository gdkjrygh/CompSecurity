// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal;

import android.app.Activity;

// Referenced classes of package com.actionbarsherlock.internal:
//            ActionBarSherlockCompat

class this._cls0
    implements Runnable
{

    final ActionBarSherlockCompat this$0;

    public void run()
    {
        if (!ActionBarSherlockCompat.access$000(ActionBarSherlockCompat.this) && !ActionBarSherlockCompat.access$100(ActionBarSherlockCompat.this).isFinishing() && ActionBarSherlockCompat.access$200(ActionBarSherlockCompat.this) == null)
        {
            dispatchInvalidateOptionsMenu();
        }
    }

    ()
    {
        this$0 = ActionBarSherlockCompat.this;
        super();
    }
}
