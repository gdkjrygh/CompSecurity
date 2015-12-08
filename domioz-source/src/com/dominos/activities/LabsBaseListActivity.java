// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;

// Referenced classes of package com.dominos.activities:
//            BaseActivity

public abstract class LabsBaseListActivity extends BaseActivity
{

    private static final String TAG = com/dominos/activities/LabsBaseListActivity.getName();
    protected ListAdapter mAdapter;
    private boolean mFinishedStart;
    private Handler mHandler;
    protected ListView mList;
    private android.widget.AdapterView.OnItemClickListener mOnClickListener;
    private Runnable mRequestFocus;

    public LabsBaseListActivity()
    {
        mHandler = new Handler();
        mFinishedStart = false;
        mRequestFocus = new _cls1();
        mOnClickListener = new _cls2();
    }

    private void ensureList()
    {
        if (mList == null)
        {
            mList = (ListView)findViewById(0x102000a);
        }
    }

    public ListAdapter getListAdapter()
    {
        return mAdapter;
    }

    public ListView getListView()
    {
        ensureList();
        return mList;
    }

    public long getSelectedItemId()
    {
        return mList.getSelectedItemId();
    }

    public int getSelectedItemPosition()
    {
        return mList.getSelectedItemPosition();
    }

    public void onContentChanged()
    {
        super.onContentChanged();
        View view = findViewById(0x1020004);
        mList = (ListView)findViewById(0x102000a);
        if (mList == null)
        {
            throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
        }
        if (view != null)
        {
            mList.setEmptyView(view);
        }
        mList.setOnItemClickListener(mOnClickListener);
        if (mFinishedStart)
        {
            setListAdapter(mAdapter);
        }
        mHandler.post(mRequestFocus);
        mFinishedStart = true;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

    public void onDestroy()
    {
        mHandler.removeCallbacks(mRequestFocus);
        super.onDestroy();
    }

    protected void onListItemClick(ListView listview, View view, int i, long l)
    {
    }

    protected void onPause()
    {
        super.onPause();
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        ensureList();
        super.onRestoreInstanceState(bundle);
    }

    public void setListAdapter(ListAdapter listadapter)
    {
        this;
        JVM INSTR monitorenter ;
        ensureList();
        mAdapter = listadapter;
        mList.setAdapter(listadapter);
        this;
        JVM INSTR monitorexit ;
        return;
        listadapter;
        this;
        JVM INSTR monitorexit ;
        throw listadapter;
    }

    public void setSelection(int i)
    {
        mList.setSelection(i);
    }


    private class _cls1
        implements Runnable
    {

        final LabsBaseListActivity this$0;

        public void run()
        {
            mList.focusableViewAvailable(mList);
        }

        _cls1()
        {
            this$0 = LabsBaseListActivity.this;
            super();
        }
    }


    private class _cls2
        implements android.widget.AdapterView.OnItemClickListener
    {

        final LabsBaseListActivity this$0;

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            onListItemClick((ListView)adapterview, view, i, l);
        }

        _cls2()
        {
            this$0 = LabsBaseListActivity.this;
            super();
        }
    }

}
