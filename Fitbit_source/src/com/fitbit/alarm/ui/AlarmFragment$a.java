// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.alarm.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.fitbit.data.domain.Alarm;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.alarm.ui:
//            AlarmFragment, AlarmItem, AlarmItem_

class a extends BaseAdapter
{

    final AlarmFragment a;
    private List b;

    public List a()
    {
        return b;
    }

    public void a(List list)
    {
        b = list;
        notifyDataSetChanged();
    }

    public boolean a(long l)
    {
        if (getCount() == 0)
        {
            return false;
        }
        for (Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            if (((Alarm)iterator.next()).getEntityId().longValue() == l)
            {
                return true;
            }
        }

        return false;
    }

    public int getCount()
    {
        if (b == null)
        {
            return 0;
        } else
        {
            return b.size();
        }
    }

    public Object getItem(int i)
    {
        return b.get(i);
    }

    public long getItemId(int i)
    {
        return ((Alarm)b.get(i)).getEntityId().longValue();
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        android.content.Context context = viewgroup.getContext();
        viewgroup = (AlarmItem)view;
        view = viewgroup;
        if (viewgroup == null)
        {
            view = AlarmItem_.a(context);
        }
        view.a((Alarm)b.get(i));
        return view;
    }

    (AlarmFragment alarmfragment)
    {
        a = alarmfragment;
        super();
    }
}
