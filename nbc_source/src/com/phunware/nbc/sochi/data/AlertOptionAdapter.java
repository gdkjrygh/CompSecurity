// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.data;

import android.content.Context;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.phunware.nbc.sochi.content.AlertOption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Predicate;

public class AlertOptionAdapter extends BaseExpandableListAdapter
{

    private List mAlertOptions;
    private LayoutInflater mInflater;

    public AlertOptionAdapter(Context context)
    {
        mInflater = LayoutInflater.from(context);
    }

    public Object getChild(int i, int j)
    {
        return ((AlertOption)mAlertOptions.get(i)).getSubsections().get(j);
    }

    public long getChildId(int i, int j)
    {
        return 0L;
    }

    public View getChildView(int i, int j, boolean flag, View view, ViewGroup viewgroup)
    {
        view = (AlertOption)getChild(i, j);
        viewgroup = mInflater.inflate(0x7f040054, viewgroup, false);
        TextView textview = (TextView)viewgroup.findViewById(0x7f0f011d);
        CheckBox checkbox = (CheckBox)viewgroup.findViewById(0x7f0f011e);
        textview.setText(((AlertOption)((AlertOption)mAlertOptions.get(i)).getSubsections().get(j)).getDisplay());
        checkbox.setChecked(view.isSelected());
        return viewgroup;
    }

    public int getChildrenCount(int i)
    {
        if (((AlertOption)mAlertOptions.get(i)).getSubsections() == null)
        {
            return 0;
        } else
        {
            return ((AlertOption)mAlertOptions.get(i)).getSubsections().size();
        }
    }

    public Object getGroup(int i)
    {
        return mAlertOptions.get(i);
    }

    public int getGroupCount()
    {
        return mAlertOptions.size();
    }

    public long getGroupId(int i)
    {
        return 0L;
    }

    public View getGroupView(int i, boolean flag, View view, ViewGroup viewgroup)
    {
        view = (AlertOption)getGroup(i);
        viewgroup = mInflater.inflate(0x7f040053, viewgroup, false);
        ImageView imageview = (ImageView)viewgroup.findViewById(0x7f0f011c);
        TextView textview = (TextView)viewgroup.findViewById(0x7f0f011d);
        CheckBox checkbox = (CheckBox)viewgroup.findViewById(0x7f0f011e);
        int k = getChildrenCount(i);
        if (k == 0)
        {
            checkbox.setChecked(view.isSelected());
            imageview.setVisibility(4);
            textview.setText(((AlertOption)mAlertOptions.get(i)).getDisplay());
            return viewgroup;
        }
        int l = CollectionUtils.countMatches(view.getSubsections(), new Predicate() {

            final AlertOptionAdapter this$0;

            public boolean evaluate(AlertOption alertoption)
            {
                return alertoption.isSelected();
            }

            public volatile boolean evaluate(Object obj)
            {
                return evaluate((AlertOption)obj);
            }

            
            {
                this$0 = AlertOptionAdapter.this;
                super();
            }
        });
        checkbox.setVisibility(8);
        imageview.setVisibility(0);
        int j;
        if (flag)
        {
            j = 0x7f020097;
        } else
        {
            j = 0x7f020098;
        }
        imageview.setImageResource(j);
        textview.setText(String.format("%s (%s/%s)", new Object[] {
            ((AlertOption)mAlertOptions.get(i)).getDisplay(), Integer.toString(l), Integer.toString(k)
        }));
        return viewgroup;
    }

    public Pair getSelectedAlertOptions()
    {
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        for (Iterator iterator = mAlertOptions.iterator(); iterator.hasNext();)
        {
            Object obj = (AlertOption)iterator.next();
            if (((AlertOption) (obj)).getSubsections() == null)
            {
                if (((AlertOption) (obj)).isSelected())
                {
                    arraylist.add(obj);
                } else
                {
                    arraylist1.add(obj);
                }
            } else
            {
                obj = ((AlertOption) (obj)).getSubsections().iterator();
                while (((Iterator) (obj)).hasNext()) 
                {
                    AlertOption alertoption = (AlertOption)((Iterator) (obj)).next();
                    if (alertoption.isSelected())
                    {
                        arraylist.add(alertoption);
                    } else
                    {
                        arraylist1.add(alertoption);
                    }
                }
            }
        }

        return new Pair(arraylist, arraylist1);
    }

    public boolean hasStableIds()
    {
        return false;
    }

    public boolean isChildSelectable(int i, int j)
    {
        return true;
    }

    public void setData(List list)
    {
        mAlertOptions = list;
        notifyDataSetChanged();
    }
}
