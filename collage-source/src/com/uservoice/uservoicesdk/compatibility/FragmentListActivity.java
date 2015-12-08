// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.compatibility;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ViewFlipper;
import com.uservoice.uservoicesdk.activity.BaseActivity;

public abstract class FragmentListActivity extends BaseActivity
{

    private ListAdapter mAdapter;
    private boolean mFinishedStart;
    private Handler mHandler;
    private ListView mList;
    private android.widget.AdapterView.OnItemClickListener mOnClickListener;
    private Runnable mRequestFocus;

    public FragmentListActivity()
    {
        mHandler = new Handler();
        mFinishedStart = false;
        mRequestFocus = new Runnable() {

            final FragmentListActivity this$0;

            public void run()
            {
                mList.focusableViewAvailable(mList);
            }

            
            {
                this$0 = FragmentListActivity.this;
                super();
            }
        };
        mOnClickListener = new android.widget.AdapterView.OnItemClickListener() {

            final FragmentListActivity this$0;

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                onListItemClick((ListView)adapterview, view, i, l);
            }

            
            {
                this$0 = FragmentListActivity.this;
                super();
            }
        };
    }

    private void ensureList()
    {
        this;
        JVM INSTR monitorenter ;
        ListView listview = mList;
        if (listview == null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        mList = new ListView(this);
        mList.setId(0x102000a);
        ViewFlipper viewflipper = new ViewFlipper(this);
        viewflipper.setId(com.uservoice.uservoicesdk.R.id.uv_view_flipper);
        viewflipper.addView(mList);
        setContentView(viewflipper);
        mList.setOnItemClickListener(mOnClickListener);
        if (mFinishedStart)
        {
            setListAdapter(mAdapter);
        }
        mHandler.post(mRequestFocus);
        mFinishedStart = true;
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
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

    protected void onListItemClick(ListView listview, View view, int i, long l)
    {
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

}
