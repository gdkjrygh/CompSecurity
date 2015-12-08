// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.fragments;

import com.actionbarsherlock.internal.widget.IcsSpinner;

// Referenced classes of package com.accuweather.android.fragments:
//            HourlyFragment

class this._cls1
    implements Runnable
{

    final is._cls0 this$1;

    public void run()
    {
        spinner.setOnItemSelectedListener(_fld0);
    }

    l.selection()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/accuweather/android/fragments/HourlyFragment$1

/* anonymous class */
    class HourlyFragment._cls1
        implements Runnable
    {

        final HourlyFragment this$0;
        final int val$selection;
        final IcsSpinner val$spinner;

        public void run()
        {
            spinner.setSelection(selection);
            spinner.post(new HourlyFragment._cls1._cls1());
        }

            
            {
                this$0 = final_hourlyfragment;
                spinner = icsspinner;
                selection = I.this;
                super();
            }
    }

}
