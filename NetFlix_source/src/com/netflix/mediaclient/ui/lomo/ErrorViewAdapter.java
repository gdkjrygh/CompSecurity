// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.lomo;

import android.view.View;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.fragment.ErrorView;
import com.netflix.mediaclient.servicemgr.BasicLoMo;

// Referenced classes of package com.netflix.mediaclient.ui.lomo:
//            RowAdapter, RowAdapterCallbacks

public class ErrorViewAdapter
    implements RowAdapter
{

    private final RowAdapterCallbacks callbacks;

    public ErrorViewAdapter(RowAdapterCallbacks rowadaptercallbacks)
    {
        callbacks = rowadaptercallbacks;
    }

    public int getCount()
    {
        return 1;
    }

    public int getRowHeightInPx()
    {
        return -2;
    }

    public View getView(int i)
    {
        return ErrorView.create(callbacks.getActivity().getLayoutInflater(), null);
    }

    public boolean hasMoreData()
    {
        return false;
    }

    public void invalidateRequestId()
    {
    }

    public void refreshData(BasicLoMo basiclomo, int i)
    {
    }

    public void restoreFromMemento(Object obj)
    {
    }

    public Object saveToMemento()
    {
        return null;
    }

    public void trackPresentation(int i)
    {
    }
}
