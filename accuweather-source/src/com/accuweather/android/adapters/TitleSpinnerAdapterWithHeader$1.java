// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.adapters;

import android.view.View;
import com.accuweather.android.utilities.Logger;
import java.util.List;

// Referenced classes of package com.accuweather.android.adapters:
//            TitleSpinnerAdapterWithHeader, HeaderGroupItem

class val.position
    implements android.view.AdapterWithHeader._cls1
{

    final TitleSpinnerAdapterWithHeader this$0;
    final int val$position;

    public void onClick(View view)
    {
        Logger.i(this, (new StringBuilder()).append("onClick position is ").append(val$position).toString());
        int i = TitleSpinnerAdapterWithHeader.access$000(TitleSpinnerAdapterWithHeader.this).size();
        if (val$position < i)
        {
            Logger.i(this, (new StringBuilder()).append("onItemSelected ").append(val$position).toString());
            TitleSpinnerAdapterWithHeader.access$100(TitleSpinnerAdapterWithHeader.this).onSpinnerItemSelected(val$position);
            return;
        } else
        {
            Logger.i(this, (new StringBuilder()).append("onHeaderGroupItemSelected ").append(val$position).toString());
            TitleSpinnerAdapterWithHeader.access$100(TitleSpinnerAdapterWithHeader.this).onSpinnerHeaderGroupItemSelected(((HeaderGroupItem)TitleSpinnerAdapterWithHeader.access$300(TitleSpinnerAdapterWithHeader.this).get(TitleSpinnerAdapterWithHeader.access$200(TitleSpinnerAdapterWithHeader.this, val$position))).getTitle(), val$position - i);
            return;
        }
    }

    itleSpinnerListener()
    {
        this$0 = final_titlespinneradapterwithheader;
        val$position = I.this;
        super();
    }
}
