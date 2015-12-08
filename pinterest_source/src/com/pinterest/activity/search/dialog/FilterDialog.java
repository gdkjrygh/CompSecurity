// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.api.model.ModelAccessCache;
import com.pinterest.api.model.SearchFilter;

// Referenced classes of package com.pinterest.activity.search.dialog:
//            FilterDialogView

public class FilterDialog extends BaseDialog
{

    private FilterDialogView _dialogView;

    public FilterDialog()
    {
    }

    public static FilterDialog newInstance(SearchFilter searchfilter, int i, int j, int k)
    {
        FilterDialog filterdialog = new FilterDialog();
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("filterOptionIds", ModelAccessCache.toIdList(searchfilter.getFilterOptions()));
        bundle.putStringArrayList("topFilterOptionIds", ModelAccessCache.toIdList(searchfilter.getTopFilterOptions()));
        bundle.putString("filterType", searchfilter.getType());
        bundle.putString("filterName", searchfilter.getDisplayName());
        bundle.putString("filterImageUrl", searchfilter.getDisplayImageUrl());
        bundle.putString("mainOptionsTitle", searchfilter.getMainOptionsTitle());
        bundle.putString("topOptionsTitle", searchfilter.getTopOptionsTitle());
        bundle.putInt("position", i);
        bundle.putInt("height", j);
        bundle.putInt("offset", k);
        filterdialog.setArguments(bundle);
        return filterdialog;
    }

    public void make(LayoutInflater layoutinflater)
    {
        _dialogView = new FilterDialogView(getContext());
        setContent(_dialogView, 0, -1, -1);
        super.make(layoutinflater);
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        bundle = getArguments();
        _dialogView.setFilter(bundle);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setStyle(2, 0x7f0b00eb);
        setCancelable(true);
    }
}
