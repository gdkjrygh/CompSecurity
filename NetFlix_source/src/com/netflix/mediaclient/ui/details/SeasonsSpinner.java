// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.details;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Spinner;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.ui.details:
//            SeasonsSpinnerAdapter

public class SeasonsSpinner extends Spinner
{

    private static final int STANDARD_BG_RES_ID = 0x7f020167;
    private static final String TAG = "SeasonsSpinner";
    private android.widget.AdapterView.OnItemSelectedListener itemSelectedListener;
    private SeasonsSpinnerAdapter spinnerAdapter;

    public SeasonsSpinner(Context context)
    {
        super(context, null);
        init();
    }

    public SeasonsSpinner(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public SeasonsSpinner(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void init()
    {
        setBackgroundResource(0x7f020167);
        spinnerAdapter = new SeasonsSpinnerAdapter((NetflixActivity)getContext());
        setAdapter(spinnerAdapter);
    }

    public int getSeasonIndexBySeasonNumber(int i)
    {
        return spinnerAdapter.getSeasonIndexBySeasonNumber(i);
    }

    public int getSeasonNumberForPosition(int i)
    {
        return spinnerAdapter.getSeasonNumberForPosition(i);
    }

    public void setOnItemSelectedListener(android.widget.AdapterView.OnItemSelectedListener onitemselectedlistener)
    {
        itemSelectedListener = onitemselectedlistener;
    }

    public void setSelection(int i)
    {
        Log.v("SeasonsSpinner", (new StringBuilder()).append("Setting selection to position: ").append(i).toString());
        super.setSelection(i);
        if (itemSelectedListener != null)
        {
            itemSelectedListener.onItemSelected(this, this, i, getSelectedItemId());
        }
    }

    public void setSelectionWithoutCallback(int i)
    {
        Log.v("SeasonsSpinner", (new StringBuilder()).append("Setting selection (no callback) to position: ").append(i).toString());
        super.setSelection(i);
    }

    public void updateSeasonData(List list)
    {
        boolean flag = true;
        spinnerAdapter.updateSeasonData(list);
        int i;
        if (spinnerAdapter.getCount() <= 1)
        {
            flag = false;
        }
        setEnabled(flag);
        if (flag)
        {
            i = 0x7f020167;
        } else
        {
            i = 0x7f090030;
        }
        setBackgroundResource(i);
    }
}
