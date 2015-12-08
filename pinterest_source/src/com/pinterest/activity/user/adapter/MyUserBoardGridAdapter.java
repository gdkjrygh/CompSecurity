// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.pinterest.adapter.BoardGridAdapter;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.Model;
import com.pinterest.base.Colors;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MyUserBoardGridAdapter extends BoardGridAdapter
{

    protected static final int EXTRA_SECRET_PADDING = 2;
    protected Feed secretDatasource;
    protected List sectionIndicies;

    public MyUserBoardGridAdapter()
    {
        sectionIndicies = new ArrayList(2);
        for (int i = 0; i < 2; i++)
        {
            sectionIndicies.add(Integer.valueOf(0));
        }

    }

    private int convertIndexToSecretIndex(int i)
    {
        int j = super.getCount();
        if (i > j)
        {
            i -= j + 2;
            if (i >= 0 && secretDatasource != null && i < secretDatasource.getCount())
            {
                return i;
            }
        }
        return -1;
    }

    private void updateSections()
    {
        int i;
        if (_dataSource == null)
        {
            i = 0;
        } else
        {
            i = _dataSource.getCount() - 1;
        }
        sectionIndicies.set(0, Integer.valueOf(i + 1));
        sectionIndicies.set(1, Integer.valueOf(getCount() - 1));
    }

    public int getCount()
    {
        int k = super.getCount();
        int i;
        if (_dataSource != null && secretDatasource != null && _dataSource.getCount() == 0 && secretDatasource.getCount() == 0)
        {
            i = 0;
        } else
        {
            i = k;
            if (_dataSource != null)
            {
                i = k;
                if (secretDatasource != null)
                {
                    k = k + 1 + 1;
                    int j = k;
                    if (secretDatasource.getCount() > 0)
                    {
                        j = k + secretDatasource.getCount();
                    }
                    return j + 1;
                }
            }
        }
        return i;
    }

    public Board getItem(int i)
    {
        if (isSecretDivider(i) || isCreateCell(i) || isCreateSecretCell(i))
        {
            return null;
        }
        if (isSecretCell(i))
        {
            i = convertIndexToSecretIndex(i);
            return (Board)secretDatasource.get(i);
        } else
        {
            return (Board)super.getItem(i);
        }
    }

    public volatile Model getItem(int i)
    {
        return getItem(i);
    }

    public volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public int getItemHeight(int i, int j)
    {
        if (isCreateCell(i) || isCreateSecretCell(i))
        {
            if (_cachedItemHeights.get(Integer.valueOf(i)) == null)
            {
                j = android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000);
                int k = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                _measureView = super.getView(0, null, null, true);
                _measureView.measure(j, k);
                _cachedItemHeights.put(Integer.valueOf(i), Integer.valueOf(_measureView.getMeasuredHeight()));
            }
            return ((Integer)_cachedItemHeights.get(Integer.valueOf(i))).intValue();
        } else
        {
            return super.getItemHeight(i, j);
        }
    }

    public int getItemSpan(int i)
    {
        if (isSecretDivider(i))
        {
            return 0x7fffffff;
        } else
        {
            return super.getItemSpan(i);
        }
    }

    public Feed getSecretDatasource()
    {
        return secretDatasource;
    }

    public View getSectionBackground(int i, ViewGroup viewgroup)
    {
        if (i == 0)
        {
            return super.getSectionBackground(i, viewgroup);
        } else
        {
            viewgroup = new View(viewgroup.getContext());
            viewgroup.setBackgroundResource(0x7f02003f);
            return viewgroup;
        }
    }

    public List getSectionIndicies()
    {
        return sectionIndicies;
    }

    public View getView(int i, View view, ViewGroup viewgroup, boolean flag)
    {
        if (isSecretDivider(i))
        {
            return getInflater(view, viewgroup).inflate(0x7f03016a, null);
        }
        if (isCreateCell(i) || isCreateSecretCell(i))
        {
            view = getInflater(view, viewgroup).inflate(0x7f030149, null);
            int j;
            if (isCreateSecretCell(i))
            {
                j = Colors.BG_GRID_DARK;
            } else
            {
                j = Colors.BG_GRID;
            }
            view.setBackgroundColor(j);
            viewgroup = (TextView)view.findViewById(0x7f0f0349);
            if (isCreateSecretCell(i))
            {
                i = 0x7f0701ae;
            } else
            {
                i = 0x7f070196;
            }
            viewgroup.setText(i);
            return view;
        }
        view = super.getView(i, view, viewgroup, flag);
        if (isSecretCell(i))
        {
            view.setBackgroundColor(Colors.BG_GRID_DARK);
            return view;
        } else
        {
            view.setBackgroundColor(Colors.BG_GRID);
            return view;
        }
    }

    public boolean isCreateCell(int i)
    {
        return i == super.getCount();
    }

    public boolean isCreateSecretCell(int i)
    {
        return secretDatasource != null && i == getCount() - 1;
    }

    public boolean isSecretCell(int i)
    {
        return convertIndexToSecretIndex(i) != -1;
    }

    public boolean isSecretDivider(int i)
    {
        return i == super.getCount() + 1;
    }

    public void notifyDataSetChanged()
    {
        updateSections();
        super.notifyDataSetChanged();
    }

    public void notifyDataSetInvalidated()
    {
        updateSections();
        super.notifyDataSetInvalidated();
    }

    public void setSecretDatasource(Feed feed)
    {
        secretDatasource = feed;
        notifyDataSetChanged();
    }
}
