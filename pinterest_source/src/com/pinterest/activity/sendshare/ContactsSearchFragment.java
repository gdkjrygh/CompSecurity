// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.sendshare;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.widget.ListView;
import butterknife.ButterKnife;
import com.pinterest.activity.sendapin.adapter.PeopleSearchAdapter;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.base.Device;
import com.pinterest.ui.text.SearchEditText;

public class ContactsSearchFragment extends BaseFragment
{

    private PeopleSearchAdapter _adapter;
    ListView _listView;
    private android.view.View.OnFocusChangeListener _onSearchFocusChanged;
    private TextWatcher _onSearchQueryChanged;
    SearchEditText _searchEt;

    public ContactsSearchFragment()
    {
        _onSearchQueryChanged = new _cls1();
        _onSearchFocusChanged = new _cls2();
    }

    private void init()
    {
        _adapter = new PeopleSearchAdapter(getContext(), true);
        _adapter.setListCellLayoutId(0x7f030162);
        _listView.setAdapter(_adapter);
        _adapter.refresh();
        _searchEt.setBrioStyle(true);
        _searchEt.addTextChangedListener(_onSearchQueryChanged);
        _searchEt.setOnFocusChangeListener(_onSearchFocusChanged);
    }

    public PeopleSearchAdapter getListViewAdapter()
    {
        return _adapter;
    }

    protected void onActivate()
    {
        if (getActivity() != null)
        {
            getActivity().getWindow().setSoftInputMode(16);
        }
        super.onActivate();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _layoutId = 0x7f030100;
    }

    protected void onDeactivate()
    {
        if (getActivity() != null)
        {
            getActivity().getWindow().setSoftInputMode(32);
        }
        super.onDeactivate();
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ButterKnife.a(this);
    }

    public void onPause()
    {
        super.onPause();
        Device.hideSoftKeyboard(_searchEt);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        ButterKnife.a(this, view);
        init();
    }

    public void setListViewOnItemClickListener(android.widget.AdapterView.OnItemClickListener onitemclicklistener)
    {
        _listView.setOnItemClickListener(onitemclicklistener);
    }


    private class _cls1
        implements TextWatcher
    {

        final ContactsSearchFragment this$0;

        public void afterTextChanged(Editable editable)
        {
        }

        public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
        {
        }

        public void onTextChanged(CharSequence charsequence, int i, int j, int k)
        {
            charsequence = StringUtils.trimToEmpty(charsequence.toString());
            _adapter.onSearchQueryChanged(charsequence);
        }

        _cls1()
        {
            this$0 = ContactsSearchFragment.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnFocusChangeListener
    {

        final ContactsSearchFragment this$0;

        public void onFocusChange(View view, boolean flag)
        {
            Events.post(new SearchEditTextFocusEvent(flag));
        }

        _cls2()
        {
            this$0 = ContactsSearchFragment.this;
            super();
        }

        private class SearchEditTextFocusEvent
        {

            public boolean hasFocus;
            final ContactsSearchFragment this$0;

            public SearchEditTextFocusEvent(boolean flag)
            {
                this$0 = ContactsSearchFragment.this;
                super();
                hasFocus = flag;
            }
        }

    }

}
