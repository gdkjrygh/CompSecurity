// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.explore.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.activity.explore.adapter.ExploreSubInterestsAdapter;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.api.model.Category;
import com.pinterest.api.model.Interest;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.MyUser;
import com.pinterest.base.Events;
import com.pinterest.experiment.Experiments;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.utils.DrawableUtils;
import com.pinterest.ui.ViewHelper;
import org.apache.commons.lang3.StringUtils;
import org.lucasr.twowayview.TwoWayView;

public class ExploreInterestsListCell extends LinearLayout
{

    ImageView _chevron;
    View _divider;
    private Interest _interest;
    TwoWayView _interestListView;
    private boolean _isLarge;
    private ExploreSubInterestsAdapter _l2InterestAdapter;
    private int _scrollPosition;
    TextView _seeAll;
    TextView _title;

    public ExploreInterestsListCell(Context context)
    {
        this(context, null);
    }

    public ExploreInterestsListCell(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ExploreInterestsListCell(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    public static ExploreInterestsListCell from(View view, ViewGroup viewgroup)
    {
        if (view instanceof ExploreInterestsListCell)
        {
            return (ExploreInterestsListCell)view;
        } else
        {
            return new ExploreInterestsListCell(ViewHelper.getContext(view, viewgroup));
        }
    }

    private Interest getLatestCachedInterest(Interest interest)
    {
        Interest interest1 = ModelHelper.getInterest(interest.getUid());
        if (interest1 != null)
        {
            interest = interest1;
        }
        return interest;
    }

    public Interest getInterest()
    {
        return _interest;
    }

    public int getScrollPosition()
    {
        if (_interestListView != null)
        {
            int i = _interestListView.getFirstVisiblePosition();
            if (i == 0)
            {
                return i;
            } else
            {
                return i + 1;
            }
        } else
        {
            return 0;
        }
    }

    protected void init()
    {
        LayoutInflater.from(getContext()).inflate(0x7f030154, this, true);
        ButterKnife.a(this);
        _l2InterestAdapter = new ExploreSubInterestsAdapter();
        _interestListView.setOrientation(org.lucasr.twowayview.TwoWayView.Orientation.HORIZONTAL);
        _interestListView.setOnItemClickListener(new _cls1());
        _interestListView.setSelector(0x7f020275);
        _title.setOnClickListener(new _cls2());
        setOrientation(1);
        setPadding(0, (int)Resources.dimension(0x7f0a015f), 0, 0);
        _chevron.setImageDrawable(DrawableUtils.tintIcon(0x7f0200c4, 0x7f0e007a));
    }

    protected void navigateToCategoryOrInterest(Interest interest)
    {
        if (interest == null || StringUtils.isEmpty(interest.getUid()))
        {
            return;
        }
        if ("2".equals(interest.getUid()))
        {
            Category category = new Category();
            category.setUid("2");
            category.setKey("everything");
            category.setName(Resources.string(0x7f07027c));
            ModelHelper.setInterest(interest);
            MyUser.addLastUsedInterest(interest.getUid());
            Events.post(new Navigation(Location.CATEGORY, category));
            return;
        }
        if ("3".equals(interest.getUid()))
        {
            Category category1 = new Category();
            category1.setUid("3");
            category1.setKey("popular");
            category1.setName(Resources.string(0x7f070463));
            ModelHelper.setInterest(interest);
            MyUser.addLastUsedInterest(interest.getUid());
            Events.post(new Navigation(Location.CATEGORY, category1));
            return;
        } else
        {
            Events.post(new Navigation(Location.INTEREST, getLatestCachedInterest(interest)));
            return;
        }
    }

    public void setDividerVisibility(int i)
    {
        _divider.setVisibility(i);
    }

    public void setInterest(Interest interest)
    {
        _interest = interest;
    }

    public void setLarge(boolean flag)
    {
        _isLarge = flag;
    }

    public void setScrollPosition(int i)
    {
        _scrollPosition = i;
    }

    public void updateUI()
    {
        if (_interest != null)
        {
            if (_interest.getName() != null)
            {
                _title.setVisibility(0);
                _title.setText(_interest.getName());
            } else
            {
                _title.setVisibility(8);
            }
            if (_interest.getUid() != null && !Experiments.k())
            {
                _seeAll.setVisibility(0);
                _chevron.setVisibility(0);
            } else
            {
                _seeAll.setVisibility(8);
                _chevron.setVisibility(8);
            }
            _l2InterestAdapter.setLarge(_isLarge);
            _l2InterestAdapter.setDataSource(_interest.getChildInterests(), _interest);
            _interestListView.setAdapter(_l2InterestAdapter);
            if (_interestListView != null && _scrollPosition != 0 && _scrollPosition <= _interestListView.getCount())
            {
                _interestListView.setSelectionFromOffset(_scrollPosition, (int)Resources.dimension(0x7f0a015f));
            }
        }
    }


    private class _cls1
        implements android.widget.AdapterView.OnItemClickListener
    {

        final ExploreInterestsListCell this$0;

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            adapterview = (Interest)((ExploreSubInterestsAdapter)adapterview.getAdapter()).getItem(i);
            navigateToCategoryOrInterest(adapterview);
        }

        _cls1()
        {
            this$0 = ExploreInterestsListCell.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final ExploreInterestsListCell this$0;

        public void onClick(View view)
        {
            navigateToCategoryOrInterest(_interest);
        }

        _cls2()
        {
            this$0 = ExploreInterestsListCell.this;
            super();
        }
    }

}
