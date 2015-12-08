// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser.input;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckedTextView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package org.chromium.content.browser.input:
//            SelectPopupItem

public class SelectPopupAdapter extends ArrayAdapter
{

    private boolean mAreAllItemsEnabled;
    private List mItems;

    public SelectPopupAdapter(Context context, int i, List list)
    {
        super(context, i, list);
        mItems = new ArrayList(list);
        mAreAllItemsEnabled = true;
        i = 0;
        do
        {
label0:
            {
                if (i < mItems.size())
                {
                    if (((SelectPopupItem)mItems.get(i)).getType() == 2)
                    {
                        break label0;
                    }
                    mAreAllItemsEnabled = false;
                }
                return;
            }
            i++;
        } while (true);
    }

    public boolean areAllItemsEnabled()
    {
        return mAreAllItemsEnabled;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (i < 0 || i >= getCount())
        {
            return null;
        }
        view = super.getView(i, null, viewgroup);
        ((TextView)view).setText(((SelectPopupItem)mItems.get(i)).getLabel());
        if (((SelectPopupItem)mItems.get(i)).getType() != 2)
        {
            if (((SelectPopupItem)mItems.get(i)).getType() == 0)
            {
                if (view instanceof CheckedTextView)
                {
                    ((CheckedTextView)view).setCheckMarkDrawable(null);
                }
            } else
            {
                view.setEnabled(false);
            }
        }
        return view;
    }

    public boolean isEnabled(int i)
    {
        if (i < 0 || i >= getCount())
        {
            return false;
        }
        return ((SelectPopupItem)mItems.get(i)).getType() == 2;
    }
}
