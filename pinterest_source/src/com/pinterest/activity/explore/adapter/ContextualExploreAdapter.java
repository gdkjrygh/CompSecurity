// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.explore.adapter;

import android.view.View;
import android.view.ViewGroup;
import com.pinterest.activity.explore.util.ExploreStoryCell;
import com.pinterest.activity.explore.view.ExploreContextualBoardCell;
import com.pinterest.activity.explore.view.ExploreContextualSearchCell;
import com.pinterest.activity.explore.view.ExploreContextualSectionFooter;
import com.pinterest.activity.explore.view.ExploreContextualSectionHeader;
import com.pinterest.activity.explore.view.ExploreContextualUserCell;
import com.pinterest.activity.explore.view.ExploreListCell;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.Category;
import com.pinterest.api.model.ContextualItem;
import com.pinterest.api.model.ContextualSearchObject;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.Model;
import com.pinterest.api.model.User;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.utils.CollectionUtils;
import com.pinterest.schemas.event.EventType;
import com.pinterest.ui.listview.SolidTitleDivider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.pinterest.activity.explore.adapter:
//            ExploreBaseAdapter

public class ContextualExploreAdapter extends ExploreBaseAdapter
{

    private static final int TYPE_BOARD_CELL = 2;
    private static final int TYPE_CATEGORY = 5;
    private static final int TYPE_COUNT = 8;
    private static final int TYPE_DIVIDER_ALL = 6;
    private static final int TYPE_DIVIDER_RECENT = 7;
    private static final int TYPE_SEARCH_CELL = 3;
    public static final int TYPE_SECTION_FOOTER = 1;
    private static final int TYPE_SECTION_HEADER = 0;
    private static final int TYPE_USER_CELL = 4;
    private HashMap _isShowingAllRelatedObjects;

    public ContextualExploreAdapter()
    {
        _isShowingAllRelatedObjects = new HashMap();
    }

    private int getBaseAdapterOffset()
    {
        int i = getContextualItemsOffset();
        if (CollectionUtils.isEmpty(_recentCategories))
        {
            return i + 1;
        } else
        {
            return i + 2 + _recentCategories.size();
        }
    }

    private int getContextualItemViewCount(int i)
    {
        return ((ContextualItem)_contextualItems.get(i)).getRelatedObjects().size() + 2;
    }

    private int getContextualItemsOffset()
    {
        int j = 0;
        int k;
        if (_contextualItems != null)
        {
            int i = 0;
            do
            {
                k = i;
                if (j >= _contextualItems.size())
                {
                    break;
                }
                i += getContextualItemViewCount(j);
                j++;
            } while (true);
        } else
        {
            k = 0;
        }
        return k;
    }

    private Model getRelatedObjectAtPosition(int i)
    {
        boolean flag = false;
        int j = i;
        for (i = ((flag) ? 1 : 0); i < _contextualItems.size();)
        {
            int l = getContextualItemViewCount(i);
            int k;
            if (j < l)
            {
                k = j;
                if (j != 0)
                {
                    k = j;
                    if (j != l - 1)
                    {
                        return (Model)((ContextualItem)_contextualItems.get(i)).getRelatedObjects().get(j - 1);
                    }
                }
            } else
            {
                k = j - l;
            }
            i++;
            j = k;
        }

        return null;
    }

    private int getRelatedObjectIndex(int i)
    {
        boolean flag = false;
        int j = i;
        for (i = ((flag) ? 1 : 0); i < _contextualItems.size();)
        {
            int l = getContextualItemViewCount(i);
            int k;
            if (j < l)
            {
                k = j;
                if (j != 0)
                {
                    k = j;
                    if (j != l - 1)
                    {
                        return j - 1;
                    }
                }
            } else
            {
                k = j - l;
            }
            i++;
            j = k;
        }

        return -1;
    }

    private int getViewTypeForContextualItem(ContextualItem contextualitem)
    {
        if (contextualitem.getObjectType() == com.pinterest.activity.explore.adapter.ObjectType.Board)
        {
            return 2;
        }
        return contextualitem.getObjectType() != com.pinterest.activity.explore.adapter.ObjectType.User ? 3 : 4;
    }

    private void setStoryCellMeta(View view, int i)
    {
        ((ExploreStoryCell)view).setStoryPosition(getContextualItemIndex(i));
        ((ExploreStoryCell)view).setSlotPosition(getRelatedObjectIndex(i));
        ((ExploreStoryCell)view).setStoryId(getContextualItemAtPosition(i).getId());
    }

    public ContextualItem getContextualItemAtPosition(int i)
    {
        boolean flag = false;
        int j = i;
        for (i = ((flag) ? 1 : 0); i < _contextualItems.size(); i++)
        {
            int k = getContextualItemViewCount(i);
            if (j < k)
            {
                return (ContextualItem)_contextualItems.get(i);
            }
            j -= k;
        }

        return null;
    }

    public int getContextualItemIndex(int i)
    {
        boolean flag = false;
        int j = i;
        for (i = ((flag) ? 1 : 0); i < _contextualItems.size(); i++)
        {
            int k = getContextualItemViewCount(i);
            if (j < k)
            {
                return i;
            }
            j -= k;
        }

        return -1;
    }

    public int getContextualItemViewType(int i)
    {
        boolean flag = false;
        int j = i;
        i = ((flag) ? 1 : 0);
        do
        {
            int k;
label0:
            {
label1:
                {
                    if (i < _contextualItems.size())
                    {
                        k = getContextualItemViewCount(i);
                        if (j >= k)
                        {
                            break label0;
                        }
                        if (j != 0)
                        {
                            break label1;
                        }
                    }
                    return 0;
                }
                if (j == k - 1)
                {
                    return 1;
                } else
                {
                    return getViewTypeForContextualItem((ContextualItem)_contextualItems.get(i));
                }
            }
            j -= k;
            i++;
        } while (true);
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
            if (CollectionUtils.isNotEmpty(_contextualItems))
            {
                j = i + getContextualItemsOffset();
            }
        }
        return j;
    }

    public Category getItem(int i)
    {
        if (getItemViewType(i) != 5)
        {
            return null;
        }
        if (isRecentCell(i))
        {
            return (Category)_recentCategories.get(i - 1 - getContextualItemsOffset());
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
        int j = 0;
        switch (getItemViewType(i))
        {
        default:
            j = super.getItemPaddingMode(i);
            // fall through

        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
            return j;
        }
    }

    public int getItemSpan(int i)
    {
        i = getItemViewType(i);
        return i != 2 && i != 3 ? 0x7fffffff : 1;
    }

    public int getItemVerticalPaddingMode(int i)
    {
        int j = 0;
        switch (getItemViewType(i))
        {
        default:
            j = super.getItemVerticalPaddingMode(i);
            // fall through

        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
            return j;
        }
    }

    public int getItemViewType(int i)
    {
        if (CollectionUtils.isNotEmpty(_contextualItems) && i < getContextualItemsOffset())
        {
            return getContextualItemViewType(i);
        }
        if (isAllDivider(i))
        {
            return 6;
        }
        return !isRecentDivider(i) ? 5 : 7;
    }

    public View getView(int i, View view, ViewGroup viewgroup, boolean flag)
    {
        int j = getItemViewType(i);
        j;
        JVM INSTR tableswitch 0 7: default 56
    //                   0 132
    //                   1 172
    //                   2 224
    //                   3 309
    //                   4 270
    //                   5 96
    //                   6 58
    //                   7 58;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L8
_L6:
        break MISSING_BLOCK_LABEL_270;
_L1:
        break; /* Loop/switch isn't completed */
_L5:
        break MISSING_BLOCK_LABEL_309;
_L9:
        return view;
_L8:
        view = SolidTitleDivider.from(view, viewgroup);
        if (j == 6)
        {
            i = 0x7f070048;
        } else
        {
            i = 0x7f070482;
        }
        view.setText(i);
        view.setBackgroundColor(Resources.color(0x7f0e00b0));
        return view;
_L7:
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
_L2:
        viewgroup = ExploreContextualSectionHeader.get(view, viewgroup);
        ContextualItem contextualitem = getContextualItemAtPosition(i);
        view = viewgroup;
        if (contextualitem != null)
        {
            viewgroup.setTitle(contextualitem.getTitle());
            viewgroup.setSubTitle(contextualitem.getDescription());
            return viewgroup;
        }
        if (true) goto _L9; else goto _L3
_L3:
        viewgroup = ExploreContextualSectionFooter.get(view, viewgroup);
        ContextualItem contextualitem1 = getContextualItemAtPosition(i);
        view = viewgroup;
        if (contextualitem1 != null)
        {
            if (!_isShowingAllRelatedObjects.containsKey(contextualitem1.getId()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            viewgroup.showFooter(flag);
            return viewgroup;
        }
        if (true) goto _L9; else goto _L4
_L4:
        view = ExploreContextualBoardCell.get(view, viewgroup);
        viewgroup = getRelatedObjectAtPosition(i);
        if (viewgroup != null && (viewgroup instanceof Board))
        {
            view.setShowUser(true);
            view.setBoard((Board)viewgroup, flag);
        }
        setStoryCellMeta(view, i);
        return view;
        view = ExploreContextualUserCell.get(view, viewgroup);
        viewgroup = getRelatedObjectAtPosition(i);
        if (viewgroup != null && (viewgroup instanceof User))
        {
            view.setUser((User)viewgroup);
        }
        setStoryCellMeta(view, i);
        return view;
        view = ExploreContextualSearchCell.get(view, viewgroup);
        viewgroup = getRelatedObjectAtPosition(i);
        if (viewgroup != null && (viewgroup instanceof ContextualSearchObject))
        {
            view.setContextualSearchObject((ContextualSearchObject)viewgroup);
        }
        setStoryCellMeta(view, i);
        return view;
    }

    public int getViewTypeCount()
    {
        return 8;
    }

    public boolean isAllDivider(int i)
    {
label0:
        {
            boolean flag1 = false;
            boolean flag2 = CollectionUtils.isEmpty(_recentCategories);
            int k = getContextualItemsOffset();
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
        return CollectionUtils.isNotEmpty(_recentCategories) && i - getContextualItemsOffset() <= _recentCategories.size();
    }

    public boolean isRecentDivider(int i)
    {
        return i == getContextualItemsOffset() && CollectionUtils.isNotEmpty(_recentCategories);
    }

    public void setContextualItems(ArrayList arraylist)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("total_stories", String.valueOf(arraylist.size()));
        Pinalytics.a(EventType.CONTEXTUAL_STORIES_SHOWN, null, hashmap);
        _contextualItems = arraylist;
        notifyDataSetChanged();
    }

    public void updateContextualItem(ContextualItem contextualitem)
    {
        Iterator iterator = _contextualItems.iterator();
        for (int i = 0; iterator.hasNext(); i++)
        {
            ContextualItem contextualitem1 = (ContextualItem)iterator.next();
            if (contextualitem1.getId().equalsIgnoreCase(contextualitem.getId()))
            {
                _contextualItems.set(i, contextualitem);
                _isShowingAllRelatedObjects.put(contextualitem1.getId(), Boolean.TRUE);
            }
        }

        notifyDataSetChanged();
    }

    private class ObjectType extends Enum
    {

        private static final ObjectType $VALUES[];
        public static final ObjectType Board;
        public static final ObjectType Search;
        public static final ObjectType User;

        public static ObjectType valueOf(String s)
        {
            return (ObjectType)Enum.valueOf(com/pinterest/activity/explore/adapter/ContextualExploreAdapter$ObjectType, s);
        }

        public static ObjectType[] values()
        {
            return (ObjectType[])$VALUES.clone();
        }

        static 
        {
            Board = new ObjectType("Board", 0);
            User = new ObjectType("User", 1);
            Search = new ObjectType("Search", 2);
            $VALUES = (new ObjectType[] {
                Board, User, Search
            });
        }

        private ObjectType(String s, int i)
        {
            super(s, i);
        }
    }

}
