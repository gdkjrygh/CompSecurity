// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.sendapin.ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Adapter;
import android.widget.ListAdapter;
import com.pinterest.activity.sendapin.adapter.SendPinAdapter;
import com.pinterest.kit.log.PLog;
import com.pinterest.ui.listview.DismissingOverscrollListView;

public class SendPinListView extends DismissingOverscrollListView
{

    private SendPinAdapter _adapter;
    private int _currentScrollY;
    private int _firstChildIndex;

    public SendPinListView(Context context)
    {
        this(context, null, 0);
    }

    public SendPinListView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public SendPinListView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        _firstChildIndex = 0;
        _currentScrollY = 0;
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        if (parcelable instanceof Bundle)
        {
            parcelable = (Bundle)parcelable;
            _firstChildIndex = parcelable.getInt("firstChildIndex");
            _currentScrollY = parcelable.getInt("scrollY");
            _adapter.setMessage(parcelable.getString("message"));
            restoreTranslation();
            super.onRestoreInstanceState(parcelable.getParcelable("instance"));
            return;
        } else
        {
            super.onRestoreInstanceState(parcelable);
            return;
        }
    }

    public Parcelable onSaveInstanceState()
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instance", super.onSaveInstanceState());
        bundle.putString("message", _adapter.getMessage());
        bundle.putInt("firstChildIndex", _firstChildIndex);
        bundle.putInt("scrollY", _currentScrollY);
        return bundle;
    }

    public void restoreTranslation()
    {
        setSelectionFromTop(_firstChildIndex, _currentScrollY);
        int j = _firstChildIndex;
        int k = _currentScrollY;
        int l = getFirstVisiblePosition();
        int i;
        if (getChildAt(0) == null)
        {
            i = -1;
        } else
        {
            i = getChildAt(0).getTop();
        }
        PLog.logv("#restoreTranslation to %d %d Current %d %d", new Object[] {
            Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(l), Integer.valueOf(i)
        });
    }

    public void saveTranslation()
    {
        _firstChildIndex = getFirstVisiblePosition();
        View view = getChildAt(0);
        int i;
        if (view == null)
        {
            i = 0;
        } else
        {
            i = view.getTop();
        }
        _currentScrollY = i;
        PLog.logv("#saveTranslation %d %d", new Object[] {
            Integer.valueOf(_firstChildIndex), Integer.valueOf(_currentScrollY)
        });
    }

    public volatile void setAdapter(Adapter adapter)
    {
        setAdapter((ListAdapter)adapter);
    }

    public void setAdapter(ListAdapter listadapter)
    {
        super.setAdapter(listadapter);
        _adapter = (SendPinAdapter)listadapter;
    }
}
