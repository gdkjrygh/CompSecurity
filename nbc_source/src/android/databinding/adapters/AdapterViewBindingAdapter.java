// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.databinding.adapters;

import android.view.View;
import android.widget.AdapterView;

public class AdapterViewBindingAdapter
{
    public static interface OnItemSelected
    {

        public abstract void onItemSelected(AdapterView adapterview, View view, int i, long l);
    }

    public static class OnItemSelectedComponentListener
        implements android.widget.AdapterView.OnItemSelectedListener
    {

        private final OnNothingSelected mNothingSelected;
        private final OnItemSelected mSelected;

        public void onItemSelected(AdapterView adapterview, View view, int i, long l)
        {
            if (mSelected != null)
            {
                mSelected.onItemSelected(adapterview, view, i, l);
            }
        }

        public void onNothingSelected(AdapterView adapterview)
        {
            if (mNothingSelected != null)
            {
                mNothingSelected.onNothingSelected(adapterview);
            }
        }

        public OnItemSelectedComponentListener(OnItemSelected onitemselected, OnNothingSelected onnothingselected)
        {
            mSelected = onitemselected;
            mNothingSelected = onnothingselected;
        }
    }

    public static interface OnNothingSelected
    {

        public abstract void onNothingSelected(AdapterView adapterview);
    }


    public AdapterViewBindingAdapter()
    {
    }

    public static void setListener(AdapterView adapterview, OnItemSelected onitemselected)
    {
        setListener(adapterview, onitemselected, null);
    }

    public static void setListener(AdapterView adapterview, OnItemSelected onitemselected, OnNothingSelected onnothingselected)
    {
        if (onitemselected == null && onnothingselected == null)
        {
            adapterview.setOnItemSelectedListener(null);
            return;
        } else
        {
            adapterview.setOnItemSelectedListener(new OnItemSelectedComponentListener(onitemselected, onnothingselected));
            return;
        }
    }

    public static void setListener(AdapterView adapterview, OnNothingSelected onnothingselected)
    {
        setListener(adapterview, null, onnothingselected);
    }
}
