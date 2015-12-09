// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.activity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Window;
import android.widget.ListView;
import com.uservoice.uservoicesdk.compatibility.FragmentListActivity;
import com.uservoice.uservoicesdk.flow.InitManager;
import com.uservoice.uservoicesdk.ui.InstantAnswersAdapter;

public abstract class InstantAnswersActivity extends FragmentListActivity
{

    private InstantAnswersAdapter adapter;

    public InstantAnswersActivity()
    {
    }

    protected abstract InstantAnswersAdapter createAdapter();

    protected abstract int getDiscardDialogMessage();

    public void onBackPressed()
    {
        if (adapter.hasText())
        {
            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
            builder.setTitle(com.uservoice.uservoicesdk.R.string.uv_confirm);
            builder.setMessage(getDiscardDialogMessage());
            builder.setPositiveButton(com.uservoice.uservoicesdk.R.string.uv_yes, new android.content.DialogInterface.OnClickListener() {

                final InstantAnswersActivity this$0;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    finish();
                }

            
            {
                this$0 = InstantAnswersActivity.this;
                super();
            }
            });
            builder.setNegativeButton(com.uservoice.uservoicesdk.R.string.uv_no, null);
            builder.show();
            return;
        } else
        {
            super.onBackPressed();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getListView().setDivider(null);
        adapter = createAdapter();
        setListAdapter(adapter);
        getListView().setOnHierarchyChangeListener(adapter);
        getListView().setOnItemClickListener(adapter);
        getListView().setDescendantFocusability(0x40000);
        (new InitManager(this, new Runnable() {

            final InstantAnswersActivity this$0;

            public void run()
            {
                onInitialize();
            }

            
            {
                this$0 = InstantAnswersActivity.this;
                super();
            }
        })).init();
        getWindow().setSoftInputMode(36);
    }

    protected void onInitialize()
    {
        adapter.notifyDataSetChanged();
    }
}
