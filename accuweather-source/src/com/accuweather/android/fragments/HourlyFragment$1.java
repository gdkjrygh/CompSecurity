// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.fragments;

import com.actionbarsherlock.internal.widget.IcsSpinner;

// Referenced classes of package com.accuweather.android.fragments:
//            HourlyFragment

class val.selection
    implements Runnable
{

    final HourlyFragment this$0;
    final int val$selection;
    final IcsSpinner val$spinner;

    public void run()
    {
        val$spinner.setSelection(val$selection);
        val$spinner.post(new Runnable() {

            final HourlyFragment._cls1 this$1;

            public void run()
            {
                spinner.setOnItemSelectedListener(this$0);
            }

            
            {
                this$1 = HourlyFragment._cls1.this;
                super();
            }
        });
    }

    _cls1.this._cls1()
    {
        this$0 = final_hourlyfragment;
        val$spinner = icsspinner;
        val$selection = I.this;
        super();
    }
}
