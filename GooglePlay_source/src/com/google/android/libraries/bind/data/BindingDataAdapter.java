// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.bind.data;

import android.view.View;
import com.google.android.libraries.bind.card.ViewGenerator;
import com.google.android.libraries.bind.util.Util;
import com.google.android.libraries.bind.view.ViewHeap;
import java.util.List;

// Referenced classes of package com.google.android.libraries.bind.data:
//            DataAdapter, Data, DataView

public final class BindingDataAdapter extends DataAdapter
{

    private static final int viewResIds[] = {
        0x7f040023, 0x7f040025
    };
    private final int a11yCardCountKey;
    private final int equalityFieldsKey;
    public final int viewGeneratorKey;
    public final int viewResourceIdKey;
    private final List viewTypes;

    public final int getA11yRowCount(int i)
    {
        throw new NullPointerException();
    }

    public final int getItemViewType(int i)
    {
        if (i < viewTypes.size())
        {
            return ((Integer)viewTypes.get(i)).intValue();
        } else
        {
            return -1;
        }
    }

    public final View getView$7f88da85(int i, View view, Data data)
    {
        Integer integer = (Integer)data.get(viewResourceIdKey);
        if (integer == null)
        {
            view = (ViewGenerator)data.get(viewGeneratorKey);
            boolean flag;
            if (view != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Util.checkPrecondition(flag, "Missing both view resource ID and view generator");
            return view.makeView$4b5572a0();
        }
        view = viewHeap.get(integer.intValue(), view, new android.widget.AbsListView.LayoutParams(-1, -2));
        data = (int[])data.get(equalityFieldsKey);
        if (view instanceof DataView)
        {
            view = (DataView)view;
            throw new NullPointerException();
        } else
        {
            return view;
        }
    }

    public final int getViewTypeCount()
    {
        throw new NullPointerException();
    }

}
