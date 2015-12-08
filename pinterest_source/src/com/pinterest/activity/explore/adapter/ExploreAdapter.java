// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.explore.adapter;

import android.view.View;
import android.view.ViewGroup;
import com.pinterest.activity.commerce.view.ShopSpaceCoverView;
import com.pinterest.activity.explore.view.ExploreListCell;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Category;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.Hero;
import com.pinterest.api.model.Model;
import com.pinterest.kit.utils.CollectionUtils;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.EventType;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.listview.SolidTitleDivider;
import java.util.List;

// Referenced classes of package com.pinterest.activity.explore.adapter:
//            ExploreBaseAdapter

public class ExploreAdapter extends ExploreBaseAdapter
{

    public static final int TYPE_CATEGORY = 0;
    public static final int TYPE_COUNT = 4;
    public static final int TYPE_DIVIDER_ALL = 1;
    public static final int TYPE_DIVIDER_RECENT = 2;
    public static final int TYPE_SHOP_SPACE_HERO_HEADER = 3;
    private Hero _shopSpaceHeroHeader;

    public ExploreAdapter()
    {
    }

    private int getBaseAdapterOffset()
    {
        int i = getShopeSpaceHeaderOffset();
        if (CollectionUtils.isEmpty(_recentCategories))
        {
            return i + 1;
        } else
        {
            return i + 2 + _recentCategories.size();
        }
    }

    private int getShopeSpaceHeaderOffset()
    {
        return _shopSpaceHeroHeader != null ? 1 : 0;
    }

    public int getCount()
    {
        int i;
        int j;
        if (_dataSource == null)
        {
            i = 0;
        } else
        {
            i = _dataSource.getCount();
        }
        j = i;
        if (i > 0)
        {
            j = i;
            if (CollectionUtils.isNotEmpty(_recentCategories))
            {
                j = i + 1 + _recentCategories.size();
            }
            i = j + 1;
            j = i;
            if (_shopSpaceHeroHeader != null)
            {
                j = i + 1;
            }
        }
        return j;
    }

    public Category getItem(int i)
    {
        if (getItemViewType(i) != 0)
        {
            return null;
        }
        if (isRecentCell(i))
        {
            return (Category)_recentCategories.get(i - 1 - getShopeSpaceHeaderOffset());
        } else
        {
            return (Category)_dataSource.getItems().get(i - getBaseAdapterOffset());
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

    public int getItemPaddingMode(int i)
    {
        return 0;
    }

    public int getItemSpan(int i)
    {
        return 0x7fffffff;
    }

    public int getItemVerticalPaddingMode(int i)
    {
        return 0;
    }

    public int getItemViewType(int i)
    {
        if (i == 0 && _shopSpaceHeroHeader != null)
        {
            return 3;
        }
        if (isAllDivider(i))
        {
            return 1;
        }
        return !isRecentDivider(i) ? 0 : 2;
    }

    public View getView(int i, View view, ViewGroup viewgroup, boolean flag)
    {
        int j = getItemViewType(i);
        j;
        JVM INSTR tableswitch 0 3: default 40
    //                   0 70
    //                   1 42
    //                   2 42
    //                   3 106;
           goto _L1 _L2 _L3 _L3 _L4
_L1:
        return view;
_L3:
        view = SolidTitleDivider.from(view, viewgroup);
        if (j == 1)
        {
            i = 0x7f070048;
        } else
        {
            i = 0x7f070482;
        }
        view.setText(i);
        return view;
_L2:
        Category category = getItem(i);
        viewgroup = ExploreListCell.from(view, viewgroup);
        view = viewgroup;
        if (category != null)
        {
            viewgroup.setText(category.getName());
            viewgroup.setTitleOnly(true);
            return viewgroup;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        ShopSpaceCoverView shopspacecoverview1 = (ShopSpaceCoverView)view;
        ShopSpaceCoverView shopspacecoverview = shopspacecoverview1;
        if (shopspacecoverview1 == null)
        {
            shopspacecoverview = new ShopSpaceCoverView(ViewHelper.getContext(view, viewgroup));
        }
        shopspacecoverview.bind(_shopSpaceHeroHeader);
        view = shopspacecoverview;
        if (!flag)
        {
            Pinalytics.a(EventType.RENDER, null, ComponentType.SHOP_SPACE_BANNER, null);
            return shopspacecoverview;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    public int getViewTypeCount()
    {
        return 4;
    }

    public boolean isAllDivider(int i)
    {
label0:
        {
            boolean flag1 = false;
            boolean flag2 = CollectionUtils.isEmpty(_recentCategories);
            int k = getShopeSpaceHeaderOffset();
            int j;
            boolean flag;
            if (flag2)
            {
                j = 0;
            } else
            {
                j = _recentCategories.size();
            }
            if (!flag2 || i != k)
            {
                flag = flag1;
                if (flag2)
                {
                    break label0;
                }
                flag = flag1;
                if (i != j + k + 1)
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
    }

    public boolean isRecentCell(int i)
    {
        return CollectionUtils.isNotEmpty(_recentCategories) && i - getShopeSpaceHeaderOffset() <= _recentCategories.size();
    }

    public boolean isRecentDivider(int i)
    {
        return i == getShopeSpaceHeaderOffset() && CollectionUtils.isNotEmpty(_recentCategories);
    }

    public void setHeroHeader(Hero hero)
    {
        _shopSpaceHeroHeader = hero;
    }
}
