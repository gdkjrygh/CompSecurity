// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.databinding.adapters;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package android.databinding.adapters:
//            AdapterViewBindingAdapter

public static class mNothingSelected
    implements android.widget.onentListener
{

    private final ted mNothingSelected;
    private final ted mSelected;

    public void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        if (mSelected != null)
        {
            mSelected.mSelected(adapterview, view, i, l);
        }
    }

    public void onNothingSelected(AdapterView adapterview)
    {
        if (mNothingSelected != null)
        {
            mNothingSelected.ted(adapterview);
        }
    }

    public ( ,  1)
    {
        mSelected = ;
        mNothingSelected = 1;
    }
}
