// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.signin.dialog;

import android.os.Bundle;
import com.pinterest.activity.task.dialog.BaseDialog;
import java.util.List;

// Referenced classes of package com.pinterest.activity.signin.dialog:
//            BusinessTypeListAdapter

public class BusinessAccountTypeDialog extends BaseDialog
{

    private BusinessTypeListAdapter _adapter;
    private String _lastSelectedKey;
    private List _types;
    private android.widget.AdapterView.OnItemClickListener onTypeClicked;

    public BusinessAccountTypeDialog()
    {
        onTypeClicked = new _cls1();
    }

    public static BusinessAccountTypeDialog newInstance()
    {
        return new BusinessAccountTypeDialog();
    }

    private void setListView()
    {
        _adapter = new BusinessTypeListAdapter(getActivity());
        _adapter.setDataSource(_types);
        setListViewOptions(_adapter, onTypeClicked);
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        setTitle(0x7f070507);
        setListView();
    }

    public void setLastSelectedKey(String s)
    {
        _lastSelectedKey = s;
    }

    public void setTypes(List list)
    {
        _types = list;
    }


    private class _cls1
        implements android.widget.AdapterView.OnItemClickListener
    {

        final BusinessAccountTypeDialog this$0;

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            adapterview = _adapter.getItem(i);
            if (adapterview != null)
            {
                Events.post(new BusinessTypeSelected(adapterview));
            }
            dismiss();
        }

        _cls1()
        {
            this$0 = BusinessAccountTypeDialog.this;
            super();
        }

        private class BusinessTypeSelected
        {

            public String key;
            public String name;

            public BusinessTypeSelected(BusinessType businesstype)
            {
                key = businesstype.getKey();
                name = businesstype.getName();
            }
        }

    }

}
