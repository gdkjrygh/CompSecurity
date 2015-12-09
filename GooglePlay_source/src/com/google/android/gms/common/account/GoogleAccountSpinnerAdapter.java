// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.account;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBar;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public final class GoogleAccountSpinnerAdapter extends BaseAdapter
    implements android.widget.AdapterView.OnItemSelectedListener
{
    public static final class Builder
    {

        public String mAccountNames[];
        public final ActionBar mActionBar;
        public final Context mContext;
        public android.widget.AdapterView.OnItemSelectedListener mListener;
        public String mPackageName;
        public String mSelectedAccountName;
        public CharSequence mTitle;

        public Builder(ActionBar actionbar)
        {
            mActionBar = actionbar;
            mContext = actionbar.getThemedContext();
            mPackageName = mContext.getPackageName();
        }
    }


    public String mAccountNames[];
    private final Context mContext;
    public android.widget.AdapterView.OnItemSelectedListener mDelegateListener;
    private final LayoutInflater mLayoutInflater;
    private final Object mLock;
    private final String mPackageName;
    public int mSelection;
    private final SharedPreferences mSharedPreferences;
    public Spinner mSpinner;
    private final CharSequence mTitle;

    private GoogleAccountSpinnerAdapter(Context context, String s, CharSequence charsequence, String as[])
    {
        mLock = new Object();
        mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
        mSharedPreferences = context.getSharedPreferences("common.google_account_spinner", 0);
        mPackageName = s;
        mTitle = charsequence;
        mAccountNames = as;
        mSelection = getPosition(mSharedPreferences.getString("common.google_account_spinner.selected_account", null));
    }

    public GoogleAccountSpinnerAdapter(Context context, String s, CharSequence charsequence, String as[], byte byte0)
    {
        this(context, s, charsequence, as);
    }

    public final int getCount()
    {
        return mAccountNames.length;
    }

    public final View getDropDownView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = mLayoutInflater.inflate(0x7f040137, viewgroup, false);
        }
        try
        {
            ((TextView)view1).setText(getItem(i));
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            Log.wtf("GoogleAccountSpinnerAdapter", "drop down view didn't cast to TextView");
            return view1;
        }
        return view1;
    }

    public final volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public final String getItem(int i)
    {
        if (i < 0 || i >= mAccountNames.length)
        {
            return null;
        } else
        {
            return mAccountNames[i];
        }
    }

    public final long getItemId(int i)
    {
        return (long)getItem(i).hashCode();
    }

    public final int getItemViewType(int i)
    {
        return 0;
    }

    public final int getPosition(String s)
    {
        if (!TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        int j = -1;
_L4:
        return j;
_L2:
        String as[] = mAccountNames;
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= as.length)
                {
                    break label1;
                }
                j = i;
                if (s.equals(as[i]))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return -1;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            view = mLayoutInflater.inflate(0x7f040030, viewgroup, false);
        }
        try
        {
            viewgroup = (TextView)view.findViewById(0x7f0d00b1);
            viewgroup.setTextAppearance(mContext, 0x7f11018d);
            viewgroup.setText(mTitle);
        }
        // Misplaced declaration of an exception variable
        catch (ViewGroup viewgroup)
        {
            Log.wtf("GoogleAccountSpinnerAdapter", "title field didn't cast to TextView");
        }
        try
        {
            viewgroup = (TextView)view.findViewById(0x7f0d00b2);
            viewgroup.setTextAppearance(mContext, 0x7f11018b);
            viewgroup.setText(getItem(i));
            viewgroup.setVisibility(0);
        }
        // Misplaced declaration of an exception variable
        catch (ViewGroup viewgroup)
        {
            Log.wtf("GoogleAccountSpinnerAdapter", "subtitle field didn't cast to TextView");
            return view;
        }
        return view;
    }

    public final int getViewTypeCount()
    {
        return 1;
    }

    public final boolean hasStableIds()
    {
        return true;
    }

    public final void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        mSelection = i;
        persistSelectedAccountName(mAccountNames[i]);
        if (mDelegateListener != null)
        {
            mDelegateListener.onItemSelected(adapterview, view, i, l);
        }
    }

    public final void onNothingSelected(AdapterView adapterview)
    {
        mSelection = -1;
        persistSelectedAccountName(null);
        if (mDelegateListener != null)
        {
            mDelegateListener.onNothingSelected(adapterview);
        }
    }

    public final void persistSelectedAccountName(String s)
    {
        if (TextUtils.equals(mSharedPreferences.getString("common.google_account_spinner.selected_account", null), s))
        {
            return;
        }
        android.content.SharedPreferences.Editor editor = mSharedPreferences.edit();
        if (s != null)
        {
            editor.putString("common.google_account_spinner.selected_account", s);
        } else
        {
            editor.remove("common.google_account_spinner.selected_account");
        }
        editor.apply();
    }
}
