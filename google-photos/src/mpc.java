// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SpinnerAdapter;
import com.google.android.libraries.social.actionbar.ActionBarSpinner;

public final class mpc
    implements SpinnerAdapter
{

    public int a;
    private SpinnerAdapter b;

    public mpc(ActionBarSpinner actionbarspinner, SpinnerAdapter spinneradapter)
    {
        a = -1;
        b = spinneradapter;
    }

    public final int getCount()
    {
        return b.getCount();
    }

    public final View getDropDownView(int i, View view, ViewGroup viewgroup)
    {
        return b.getDropDownView(i, view, viewgroup);
    }

    public final Object getItem(int i)
    {
        if (a != -1)
        {
            i = a;
        }
        return b.getItem(i);
    }

    public final long getItemId(int i)
    {
        if (a != -1)
        {
            i = a;
        }
        return b.getItemId(i);
    }

    public final int getItemViewType(int i)
    {
        if (a != -1)
        {
            i = a;
        }
        return b.getItemViewType(i);
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        if (a != -1)
        {
            i = a;
        }
        return b.getView(i, view, viewgroup);
    }

    public final int getViewTypeCount()
    {
        return b.getViewTypeCount();
    }

    public final boolean hasStableIds()
    {
        return b.hasStableIds();
    }

    public final boolean isEmpty()
    {
        return b.isEmpty();
    }

    public final void registerDataSetObserver(DataSetObserver datasetobserver)
    {
        b.registerDataSetObserver(datasetobserver);
    }

    public final void unregisterDataSetObserver(DataSetObserver datasetobserver)
    {
        b.unregisterDataSetObserver(datasetobserver);
    }
}
