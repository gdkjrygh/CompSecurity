// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.dialog;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import butterknife.ButterKnife;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.adapter.InterestListAdapter;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.InterestsFeed;
import com.pinterest.base.Device;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.grid.AdapterFooterView;
import com.pinterest.ui.text.SearchEditText;

public class AddInterestView extends LinearLayout
{

    private InterestListAdapter _adapter;
    View _divider;
    private AdapterFooterView _footerVw;
    private Handler _handler;
    ListView _listView;
    private BaseDialog _parent;
    SearchEditText _searchEt;
    private TextWatcher onSearchChanged;

    public AddInterestView(Context context)
    {
        this(context, null);
    }

    public AddInterestView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public AddInterestView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        onSearchChanged = new _cls1();
        init();
    }

    private void init()
    {
        setOrientation(1);
        inflate(getContext(), 0x7f03005c, this);
        ButterKnife.a(this);
        _listView.addFooterView(makeFooterView(), null, false);
        _listView.setAdapter(_adapter);
        Device.showSoftKeyboard(_searchEt);
        _searchEt.addTextChangedListener(onSearchChanged);
        _searchEt.setHint(Resources.string(0x7f0705f6));
        _handler = new Handler(Looper.getMainLooper());
        _adapter = new InterestListAdapter();
        _adapter.setNeverEmpty(true);
        _listView.setAdapter(_adapter);
    }

    private View makeFooterView()
    {
        ViewGroup viewgroup = (ViewGroup)LayoutInflater.from(getContext()).inflate(0x7f030175, _listView, false);
        _footerVw = (AdapterFooterView)viewgroup.findViewById(0x7f0f01fd);
        _footerVw.setBackgroundDrawable(null);
        AdapterFooterView.setState(_footerVw, 2);
        return viewgroup;
    }

    private void onSearchFailure(Throwable throwable, ApiResponse apiresponse)
    {
        AdapterFooterView.setState(_footerVw, 2);
    }

    private void onSearchSuccess(Feed feed, String s)
    {
        if (_searchEt == null || !_searchEt.getText().toString().equals(s))
        {
            return;
        } else
        {
            _adapter.setDataSource((InterestsFeed)feed);
            AdapterFooterView.setState(_footerVw, 2);
            return;
        }
    }

    private void submitSearch(final String query)
    {
        AdapterFooterView.setState(_footerVw, 0);
        _handler.removeCallbacksAndMessages(null);
        _handler.postDelayed(new _cls2(), 100L);
    }

    public InterestListAdapter getAdapter()
    {
        return _adapter;
    }

    protected void onDetachedFromWindow()
    {
        _handler.removeCallbacksAndMessages(null);
        if (_searchEt != null)
        {
            _searchEt.removeTextChangedListener(onSearchChanged);
        }
        if (_listView != null)
        {
            _listView.setOnItemClickListener(null);
        }
        _footerVw = null;
        ButterKnife.a(this);
        super.onDetachedFromWindow();
    }

    public void setOnItemClickListener(android.widget.AdapterView.OnItemClickListener onitemclicklistener)
    {
        if (_listView != null)
        {
            _listView.setOnItemClickListener(onitemclicklistener);
        }
    }







    private class _cls1
        implements TextWatcher
    {

        final AddInterestView this$0;

        public void afterTextChanged(Editable editable)
        {
        }

        public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
        {
        }

        public void onTextChanged(CharSequence charsequence, int i, int j, int k)
        {
label0:
            {
                if (_divider != null)
                {
                    _handler.removeCallbacksAndMessages(null);
                    if (charsequence.length() <= 0)
                    {
                        break label0;
                    }
                    charsequence = charsequence.toString();
                    submitSearch(charsequence);
                    _divider.setVisibility(0);
                }
                return;
            }
            _divider.setVisibility(8);
            _adapter.setDataSource(null);
            AdapterFooterView.setState(_footerVw, 2);
        }

        _cls1()
        {
            this$0 = AddInterestView.this;
            super();
        }
    }


    private class _cls2
        implements Runnable
    {

        final AddInterestView this$0;
        final String val$query;

        public void run()
        {
            class _cls1 extends com.pinterest.api.remote.InterestsApi.InterestsFeedApiResponse
            {

                final _cls2 this$1;

                public void onFailure(Throwable throwable, ApiResponse apiresponse)
                {
                    super.onFailure(throwable, apiresponse);
                    onSearchFailure(throwable, apiresponse);
                }

                public void onSuccess(Feed feed)
                {
                    super.onSuccess(feed);
                    onSearchSuccess(feed, query);
                }

                public void onSuccess(PinterestJsonObject pinterestjsonobject)
                {
                    if (_searchEt == null || !_searchEt.getText().toString().equals(query))
                    {
                        return;
                    } else
                    {
                        super.onSuccess(pinterestjsonobject);
                        return;
                    }
                }

                _cls1()
                {
                    this$1 = _cls2.this;
                    super();
                }
            }

            SearchApi.a(query, new _cls1());
        }

        _cls2()
        {
            this$0 = AddInterestView.this;
            query = s;
            super();
        }
    }

}
