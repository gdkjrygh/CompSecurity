// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.mdx;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class MdxTargetSelectionDialog
{
    public static class Builder extends android.app.AlertDialog.Builder
    {

        private final Activity activity;
        private final TargetsAdapter adapterWrapper;
        private final View content;
        private final ListView listView;
        private final TextView title;

        public AlertDialog create()
        {
            AlertDialog alertdialog = (new android.app.AlertDialog.Builder(activity)).setView(content).create();
            alertdialog.setCanceledOnTouchOutside(true);
            return alertdialog;
        }

        public void setAdapterData(List list)
        {
            adapterWrapper.setData(list);
        }

        public void setOnItemClickListener(android.widget.AdapterView.OnItemClickListener onitemclicklistener)
        {
            listView.setOnItemClickListener(onitemclicklistener. new android.widget.AdapterView.OnItemClickListener() {

                final Builder this$0;
                final android.widget.AdapterView.OnItemClickListener val$listener;

                public void onItemClick(AdapterView adapterview, View view, int i, long l)
                {
                    adapterWrapper.notifyDataSetChanged();
                    listener.onItemClick(adapterview, view, i, l);
                }

            
            {
                this$0 = final_builder;
                listener = android.widget.AdapterView.OnItemClickListener.this;
                super();
            }
            });
        }

        public void setSelection(int i, String s)
        {
            adapterWrapper.setSelected(i, s);
        }

        public volatile android.app.AlertDialog.Builder setTitle(int i)
        {
            return setTitle(i);
        }

        public Builder setTitle(int i)
        {
            title.setText(i);
            return this;
        }


        public Builder(Activity activity1)
        {
            super(activity1);
            activity = activity1;
            MdxTargetSelectionDialog.mSelectedRowColor = activity1.getResources().getColor(0x7f090046);
            MdxTargetSelectionDialog.mRowColor = activity1.getResources().getColor(0x7f090045);
            activity1 = activity1.getLayoutInflater();
            content = activity1.inflate(0x7f03005c, null);
            title = (TextView)content.findViewById(0x7f070131);
            listView = (ListView)content.findViewById(0x7f070132);
            adapterWrapper = new TargetsAdapter(activity1);
            listView.setAdapter(adapterWrapper);
            setCancelable(true);
        }
    }

    private static class TargetsAdapter extends BaseAdapter
    {

        private List data;
        private final LayoutInflater inflater;
        private int selectedIndex;
        private String subText;

        public int getCount()
        {
            return data.size();
        }

        public volatile Object getItem(int i)
        {
            return getItem(i);
        }

        public String getItem(int i)
        {
            return (String)data.get(i);
        }

        public long getItemId(int i)
        {
            return (long)i;
        }

        public View getView(int i, View view, ViewGroup viewgroup)
        {
            boolean flag = false;
            Object obj;
            TextView textview;
            boolean flag1;
            if (view == null)
            {
                view = inflater.inflate(0x7f03004b, null);
                viewgroup = new ViewHolder((TextView)view.findViewById(0x7f070101), (TextView)view.findViewById(0x7f070102), (CheckBox)view.findViewById(0x7f070100));
                view.setTag(viewgroup);
            } else
            {
                viewgroup = (ViewHolder)view.getTag();
            }
            ((ViewHolder) (viewgroup)).title.setText(getItem(i));
            if (i == selectedIndex)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            textview = ((ViewHolder) (viewgroup)).subTitle;
            if (flag1)
            {
                obj = subText;
            } else
            {
                obj = "";
            }
            textview.setText(((CharSequence) (obj)));
            if (flag1)
            {
                if (subText != null && !"".equals(subText.trim()))
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                obj = ((ViewHolder) (viewgroup)).subTitle;
                if (i != 0)
                {
                    i = ((flag) ? 1 : 0);
                } else
                {
                    i = 8;
                }
                ((TextView) (obj)).setVisibility(i);
            } else
            {
                ((ViewHolder) (viewgroup)).subTitle.setVisibility(8);
            }
            ((ViewHolder) (viewgroup)).checkBox.setChecked(flag1);
            if (flag1)
            {
                view.setBackgroundColor(MdxTargetSelectionDialog.mSelectedRowColor);
                return view;
            } else
            {
                view.setBackgroundColor(MdxTargetSelectionDialog.mRowColor);
                return view;
            }
        }

        public void setData(List list)
        {
            data = list;
            notifyDataSetChanged();
        }

        public void setSelected(int i, String s)
        {
            selectedIndex = i;
            subText = s;
            notifyDataSetChanged();
        }

        public TargetsAdapter(LayoutInflater layoutinflater)
        {
            inflater = layoutinflater;
            data = new ArrayList();
        }
    }

    private static class ViewHolder
    {

        CheckBox checkBox;
        TextView subTitle;
        TextView title;

        ViewHolder(TextView textview, TextView textview1, CheckBox checkbox)
        {
            title = textview;
            subTitle = textview1;
            checkBox = checkbox;
        }
    }


    private static int mRowColor;
    private static int mSelectedRowColor;

    private MdxTargetSelectionDialog()
    {
    }



/*
    static int access$002(int i)
    {
        mSelectedRowColor = i;
        return i;
    }

*/



/*
    static int access$102(int i)
    {
        mRowColor = i;
        return i;
    }

*/
}
