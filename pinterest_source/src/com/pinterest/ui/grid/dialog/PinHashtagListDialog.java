// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid.dialog;

import android.os.Bundle;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.adapter.HashtagListAdapter;
import java.util.List;

public class PinHashtagListDialog extends BaseDialog
{

    private HashtagListAdapter _adapter;
    private List _hashTags;
    private android.widget.AdapterView.OnItemClickListener onClicked;

    public PinHashtagListDialog()
    {
        onClicked = new _cls1();
    }

    public static PinHashtagListDialog newInstance()
    {
        return new PinHashtagListDialog();
    }

    private void setListView()
    {
        _adapter = new HashtagListAdapter();
        _adapter.setDataSource(_hashTags);
        setListViewOptions(_adapter, onClicked);
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        setTitle(0x7f0700e1);
        setListView();
    }

    public void setHashTags(List list)
    {
        _hashTags = list;
    }


    private class _cls1
        implements android.widget.AdapterView.OnItemClickListener
    {

        final PinHashtagListDialog this$0;

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            HashTagUtils.gotoTarget((String)_adapter.getItem(i));
            dismiss();
        }

        _cls1()
        {
            this$0 = PinHashtagListDialog.this;
            super();
        }
    }

}
