// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.report;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.pinterest.activity.report.view.ReportListCell;
import com.pinterest.activity.settings.view.TitleTextSettingsListCell;
import com.pinterest.ui.ViewHelper;
import java.util.List;

// Referenced classes of package com.pinterest.activity.report:
//            ReportItem

public class ReportAdapter extends BaseAdapter
{

    private List _dataSource;

    public ReportAdapter()
    {
    }

    private void setCellType(int i, ReportListCell reportlistcell)
    {
        if (_dataSource.size() == 1)
        {
            reportlistcell.setCardBackGround(3);
            return;
        }
        if (i == 0)
        {
            reportlistcell.setCardBackGround(1);
            return;
        }
        if (i == _dataSource.size() - 1)
        {
            reportlistcell.setCardBackGround(2);
            reportlistcell.hideDivider();
            return;
        } else
        {
            reportlistcell.setCardBackGround(0);
            return;
        }
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
        ReportItem reportitem = (ReportItem)_dataSource.get(i);
        if (view == null || !(view instanceof TitleTextSettingsListCell))
        {
            view = new ReportListCell(ViewHelper.getContext(view, viewgroup));
        } else
        {
            view = (ReportListCell)view;
        }
        setCellType(i, view);
        view.setLabelTitleText(reportitem.getTitle());
        if (reportitem.getTextValue() != null)
        {
            view.setSettingTextValueText(reportitem.getTextValue());
            return view;
        } else
        {
            view.setTextValueInvisible();
            return view;
        }
    }

    public void setDataSource(List list)
    {
        _dataSource = list;
    }
}
