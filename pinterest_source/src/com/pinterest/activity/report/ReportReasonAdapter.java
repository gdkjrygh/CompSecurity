// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.report;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.pinterest.ui.listview.ListCellBasic;
import java.util.List;

public class ReportReasonAdapter extends BaseAdapter
{

    private int _checkedIndex;
    private List _dataSource;
    private List _serverReasons;

    public ReportReasonAdapter()
    {
        _checkedIndex = -1;
    }

    public String checkedText()
    {
        if (_checkedIndex == -1)
        {
            _checkedIndex = _serverReasons.size() - 1;
        }
        return (String)_serverReasons.get(_checkedIndex);
    }

    public int getCount()
    {
        if (_dataSource == null)
        {
            return 0;
        } else
        {
            return _dataSource.size();
        }
    }

    public Object getItem(int i)
    {
        return _dataSource.get(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        view = ListCellBasic.get(view, viewgroup);
        view.setText((String)_dataSource.get(i));
        if (i == _dataSource.size() - 1)
        {
            i = 4;
        } else
        {
            i = 0;
        }
        view.setDividerVisibility(i);
        return view;
    }

    public void setCheckedIndex(int i)
    {
        _checkedIndex = i;
    }

    public void setDataSource(List list)
    {
        _dataSource = list;
    }

    public void setServerReasons(List list)
    {
        _serverReasons = list;
    }
}
