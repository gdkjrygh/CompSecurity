// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.dominos.MobileSession;
import com.dominos.android.sdk.core.models.LabsProduct;
import com.dominos.android.sdk.core.models.LabsSize;
import com.dominos.android.sdk.core.models.LabsVariant;
import com.dominos.android.sdk.core.store.MenuManager;
import com.dominos.views.LabsVariantView;
import com.dominos.views.LabsVariantView_;
import java.util.ArrayList;
import java.util.List;

public class LabsVariantListAdapter extends BaseAdapter
{

    Context context;
    protected LayoutInflater inflater;
    private MenuManager mMenuManager;
    MobileSession mMobileSession;
    protected List sectionHeaders;
    private boolean showFlavorOnly;
    private List variantList;

    public LabsVariantListAdapter()
    {
        showFlavorOnly = false;
    }

    private Section getSection(int i)
    {
        if (sectionHeaders != null && sectionHeaders.size() != 0) goto _L2; else goto _L1
_L1:
        Section section = null;
_L4:
        return section;
_L2:
        Section section1 = (Section)sectionHeaders.get(0);
        int j = 0;
        do
        {
            section = section1;
            if (j >= sectionHeaders.size())
            {
                continue;
            }
            if (i >= ((Section)sectionHeaders.get(j)).startIndex && i < ((Section)sectionHeaders.get(j)).endIndex)
            {
                return (Section)sectionHeaders.get(j);
            }
            j++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public int getCount()
    {
        return variantList.size();
    }

    public LabsVariant getItem(int i)
    {
        return (LabsVariant)variantList.get(i);
    }

    public volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        viewgroup = (LabsVariantView)view;
        view = viewgroup;
        if (viewgroup == null)
        {
            view = LabsVariantView_.build(context);
        }
        viewgroup = getSection(i);
        view.hideHeader();
        if (i == 0)
        {
            if (((Section) (viewgroup)).single && sectionHeaders.size() == 1)
            {
                view.setItemBackground(0x7f020139);
            } else
            {
                view.setItemBackground(0x7f02013a);
            }
        } else
        if (i == getCount() - 1)
        {
            view.setItemBackground(0x7f020137);
        } else
        {
            view.setItemBackground(0x7f020138);
        }
        view.bind(getItem(i), showFlavorOnly);
        return view;
    }

    public void setShowFlavorOnly(boolean flag)
    {
        showFlavorOnly = flag;
    }

    public void setVariantList(List list)
    {
        boolean flag2 = true;
        variantList = list;
        if (variantList == null || variantList.isEmpty())
        {
            return;
        }
        sectionHeaders = new ArrayList();
        int i = 0;
        Section section = null;
        while (i < list.size()) 
        {
            Object obj = mMenuManager.getSize((LabsVariant)list.get(i));
            if (obj == null)
            {
                if (section == null)
                {
                    obj = mMenuManager.getProduct(((LabsVariant)list.get(i)).getProductCode());
                    section = new Section(null);
                    section.startIndex = i;
                    section.name = ((LabsProduct) (obj)).getName();
                }
            } else
            if (section == null)
            {
                section = new Section(null);
                section.startIndex = i;
                section.name = ((LabsSize) (obj)).getName();
            } else
            if (!((LabsSize) (obj)).getName().equalsIgnoreCase(section.name))
            {
                section.endIndex = i;
                boolean flag;
                if (section.endIndex - section.startIndex == 1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                section.single = flag;
                sectionHeaders.add(section);
                section = new Section(null);
                section.startIndex = i;
                section.name = ((LabsSize) (obj)).getName();
            }
            i++;
        }
        section.endIndex = list.size();
        boolean flag1;
        if (section.endIndex - section.startIndex == 1)
        {
            flag1 = flag2;
        } else
        {
            flag1 = false;
        }
        section.single = flag1;
        sectionHeaders.add(section);
    }

    void setupInflater()
    {
        inflater = (LayoutInflater)context.getSystemService("layout_inflater");
        mMenuManager = (MenuManager)mMobileSession.getManager("menu_manager");
    }

    private class Section
    {

        int endIndex;
        String name;
        boolean single;
        int startIndex;

        private Section()
        {
        }

        Section(_cls1 _pcls1)
        {
            this();
        }
    }

}
