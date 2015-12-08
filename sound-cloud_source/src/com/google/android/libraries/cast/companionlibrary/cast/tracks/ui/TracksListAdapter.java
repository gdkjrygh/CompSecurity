// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.cast.tracks.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.gms.cast.q;
import java.util.ArrayList;
import java.util.List;

public class TracksListAdapter extends ArrayAdapter
    implements android.view.View.OnClickListener
{
    private class Holder
    {

        private final TextView label;
        private final RadioButton radio;
        final TracksListAdapter this$0;



        private Holder(TextView textview, RadioButton radiobutton)
        {
            this$0 = TracksListAdapter.this;
            super();
            label = textview;
            radio = radiobutton;
        }

        Holder(TextView textview, RadioButton radiobutton, _cls1 _pcls1)
        {
            this(textview, radiobutton);
        }
    }


    private final Context mContext;
    private int mSelectedPosition;
    private final List mTracks = new ArrayList();

    public TracksListAdapter(Context context, int i, List list, int j)
    {
        super(context, i);
        mSelectedPosition = -1;
        mContext = context;
        mTracks.addAll(list);
        mSelectedPosition = j;
    }

    public int getCount()
    {
        if (mTracks == null)
        {
            return 0;
        } else
        {
            return mTracks.size();
        }
    }

    public q getSelectedTrack()
    {
        if (mSelectedPosition >= 0)
        {
            return (q)mTracks.get(mSelectedPosition);
        } else
        {
            return null;
        }
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        RadioButton radiobutton;
        boolean flag;
        if (view == null)
        {
            view = ((LayoutInflater)mContext.getSystemService("layout_inflater")).inflate(com.google.android.libraries.cast.companionlibrary.R.layout.tracks_row_layout, viewgroup, false);
            viewgroup = new Holder((TextView)view.findViewById(com.google.android.libraries.cast.companionlibrary.R.id.text), (RadioButton)view.findViewById(com.google.android.libraries.cast.companionlibrary.R.id.radio), null);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (Holder)view.getTag();
        }
        ((Holder) (viewgroup)).radio.setTag(Integer.valueOf(i));
        radiobutton = ((Holder) (viewgroup)).radio;
        if (mSelectedPosition == i)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        radiobutton.setChecked(flag);
        view.setOnClickListener(this);
        ((Holder) (viewgroup)).label.setText(((q)mTracks.get(i)).d);
        return view;
    }

    public void onClick(View view)
    {
        mSelectedPosition = ((Integer)((Holder)view.getTag()).radio.getTag()).intValue();
        notifyDataSetChanged();
    }
}
