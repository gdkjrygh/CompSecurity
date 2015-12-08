// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings;

import android.view.View;
import android.view.ViewGroup;
import com.pinterest.activity.settings.model.AccountSettings;
import com.pinterest.activity.settings.view.CheckedTextViewSettingsListCell;
import com.pinterest.activity.settings.view.TextValueSettingsListCell;
import com.pinterest.activity.settings.view.TitleTextSettingsListCell;
import com.pinterest.adapter.PinterestBaseAdapter;
import com.pinterest.api.model.Feed;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.ViewHelper;

public class AccountSettingsAdapter extends PinterestBaseAdapter
{

    private static final int TYPE_CHECKED_TEXT = 2;
    private static final int TYPE_TEXT_VALUE = 1;
    private static final int TYPE_TITLE = 0;
    private static final int VIEW_TYPE_COUNT = 3;

    public AccountSettingsAdapter()
    {
    }

    private boolean isNextItemTitleText(int i)
    {
        if (i + 1 > _dataSource.getCount())
        {
            return false;
        }
        AccountSettings accountsettings = (AccountSettings)_dataSource.get(i + 1);
        return accountsettings != null && accountsettings.getType() == 0;
    }

    private boolean isPreviousItemTitleText(int i)
    {
        if (i - 1 < 0)
        {
            return false;
        }
        AccountSettings accountsettings = (AccountSettings)_dataSource.get(i - 1);
        return accountsettings != null && accountsettings.getType() == 0;
    }

    public int getCount()
    {
        if (_dataSource == null)
        {
            return 0;
        } else
        {
            return _dataSource.getCount();
        }
    }

    public long getItemId(int i)
    {
        return (long)((AccountSettings)_dataSource.get(i)).getId();
    }

    public int getItemViewType(int i)
    {
        return ((AccountSettings)_dataSource.get(i)).getType();
    }

    public View getView(int i, View view, ViewGroup viewgroup, boolean flag)
    {
        AccountSettings accountsettings = (AccountSettings)getItem(i);
        if (accountsettings == null) goto _L2; else goto _L1
_L1:
        getItemViewType(i);
        JVM INSTR tableswitch 0 2: default 48
    //                   0 416
    //                   1 206
    //                   2 50;
           goto _L2 _L3 _L4 _L5
_L2:
        return view;
_L5:
        if (view == null || !(view instanceof CheckedTextViewSettingsListCell))
        {
            view = new CheckedTextViewSettingsListCell(ViewHelper.getContext(view, viewgroup));
        } else
        {
            view = (CheckedTextViewSettingsListCell)view;
            view.reset();
        }
        if (isNextItemTitleText(i) && isPreviousItemTitleText(i))
        {
            view.setCardBackGround(3);
            view.hideDivider();
        } else
        if (isPreviousItemTitleText(i))
        {
            view.setCardBackGround(1);
        } else
        if (isNextItemTitleText(i))
        {
            view.setCardBackGround(2);
            view.hideDivider();
        } else
        {
            view.setCardBackGround(0);
        }
        view.setSocialCheckedString(accountsettings.getName());
        if (accountsettings.getChecked().booleanValue())
        {
            view.setSocialChecked(Boolean.TRUE);
        } else
        {
            view.setSocialChecked(Boolean.FALSE);
        }
        view.setTag(Integer.valueOf(accountsettings.getId()));
        return view;
_L4:
        if (view == null || !(view instanceof TextValueSettingsListCell))
        {
            view = new TextValueSettingsListCell(ViewHelper.getContext(view, viewgroup));
        } else
        {
            view = (TextValueSettingsListCell)view;
            view.reset();
        }
        if (isNextItemTitleText(i) && isPreviousItemTitleText(i) || isCell(accountsettings.getName(), Resources.string(0x7f0705d9)))
        {
            view.setCardBackGround(3);
            view.hideDivider();
        } else
        if (isPreviousItemTitleText(i))
        {
            view.setCardBackGround(1);
        } else
        if (isNextItemTitleText(i))
        {
            view.setCardBackGround(2);
            view.hideDivider();
        }
        view.setLabelTitleText(accountsettings.getName());
        if (accountsettings.getValue() != null)
        {
            view.setSettingTextValueText(accountsettings.getValue());
        }
        if (isCell(accountsettings.getName(), Resources.string(0x7f0700db)))
        {
            view.centerTextViewGravity();
        } else
        {
            view.setTextValueVisible();
        }
        if (isCell(accountsettings.getName(), Resources.string(0x7f070318)))
        {
            view.setSmallSettingTextValueTextSize();
        } else
        {
            view.setNormalSettingTextValueTextSize();
        }
        view.setTag(Integer.valueOf(accountsettings.getId()));
        return view;
_L3:
        if (view == null || !(view instanceof TitleTextSettingsListCell))
        {
            view = new TitleTextSettingsListCell(ViewHelper.getContext(view, viewgroup));
        } else
        {
            view = (TitleTextSettingsListCell)view;
        }
        view.setTitleSettingsTvText(accountsettings.getName());
        view.setTag(Integer.valueOf(accountsettings.getId()));
        return view;
    }

    public int getViewTypeCount()
    {
        return 3;
    }

    public boolean isCell(String s, String s1)
    {
        return s != null && s1 != null && s.equalsIgnoreCase(s1);
    }
}
