// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.home.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.activity.home.adapter.HomefeedBuilderPinGridAdapter;
import com.pinterest.activity.home.util.HomefeedBuilderData;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.Interest;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.imageview.ProportionalImageView;
import com.pinterest.ui.text.PImageButton;
import java.util.ArrayList;
import java.util.HashMap;
import org.lucasr.twowayview.TwoWayView;

// Referenced classes of package com.pinterest.activity.home.view:
//            HomefeedBuilderInterestFollowButton

public class HomefeedBuilderListCell extends RelativeLayout
{

    private HomefeedBuilderPinGridAdapter _adapter;
    protected PImageButton _dismissTopicButton;
    protected HomefeedBuilderInterestFollowButton _followBtn;
    protected ProportionalImageView _image;
    private int _indexOfInterest;
    private Interest _interest;
    private com.pinterest.activity.home.HomefeedBuilderFragment.MODE _mode;
    protected TwoWayView _samplePinList;
    protected TextView _topicName;

    public HomefeedBuilderListCell(Context context)
    {
        this(context, null);
    }

    public HomefeedBuilderListCell(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public HomefeedBuilderListCell(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    public static HomefeedBuilderListCell from(View view, Context context)
    {
        if (view instanceof HomefeedBuilderListCell)
        {
            return (HomefeedBuilderListCell)view;
        } else
        {
            return new HomefeedBuilderListCell(context);
        }
    }

    private void init()
    {
        inflate(getContext(), 0x7f030159, this);
        ButterKnife.a(this);
        setPadding(0, 0, 0, (int)Resources.dimension(0x7f0a0160));
        _samplePinList.setOrientation(org.lucasr.twowayview.TwoWayView.Orientation.HORIZONTAL);
        _samplePinList.setOnItemClickListener(new _cls1());
        _samplePinList.setSelector(0x7f020275);
        _samplePinList.setOnScrollListener(new _cls2());
    }

    public void loadImageUrl(String s)
    {
        if (s != null && s.equals(_image.getUrl()))
        {
            return;
        } else
        {
            _image.loadUrl(s);
            return;
        }
    }

    public void onDismissTopicClick(View view)
    {
        view = new HashMap();
        view.put("interest", _interest.getName());
        view.put("interest_id", _interest.getUid());
        view.put("index", String.valueOf(_indexOfInterest));
        Pinalytics.a(ElementType.HOMEFEED_BUILDER_TOPIC_DISMISS_BUTTON, ComponentType.INTEREST_GRID, view);
        animate().alpha(0.0F).setDuration(Resources.integer(0x7f0d000d).intValue()).setListener(new _cls4()).start();
    }

    public void onTopicClick(View view)
    {
        Pinalytics.a(ElementType.HOMEFEED_BUILDER_INTEREST, ComponentType.INTEREST_GRID, HomefeedBuilderData.getAuxData(_interest, _mode));
        Events.post(new Navigation(Location.INTEREST, _interest));
    }

    public void setIndexOfInterest(int i)
    {
        _indexOfInterest = i;
    }

    public void setInterest(Interest interest, boolean flag)
    {
        if (interest == null)
        {
            return;
        }
        _interest = interest;
        if (!flag)
        {
            int i = (int)Resources.dimension(0x7f0a013d);
            android.graphics.drawable.ShapeDrawable shapedrawable = ViewHelper.getRoundDrawable(i, interest.getBackgroundColor());
            _image.setBackgroundDrawable(shapedrawable);
            _image.setCornerRadius(i);
            loadImageUrl(interest.getBestImageUrl(2));
        }
        _topicName.setText(interest.getName());
        _followBtn.setInterest(interest);
        _adapter = new HomefeedBuilderPinGridAdapter();
        interest = new _cls3();
        _samplePinList.setAdapter(_adapter);
        ArrayList arraylist = new ArrayList();
        if (_interest.getRecommendationPins() != null)
        {
            arraylist.addAll(_interest.getRecommendationPins());
            arraylist.add(_interest);
        }
        interest.setItems(arraylist);
        _adapter.setDataSource(interest);
        _adapter.notifyDataSetChanged();
    }

    public void setMode(com.pinterest.activity.home.HomefeedBuilderFragment.MODE mode)
    {
        _mode = mode;
        if (mode != com.pinterest.activity.home.HomefeedBuilderFragment.MODE.BROWSE)
        {
            _dismissTopicButton.setVisibility(8);
        }
    }



    private class _cls1
        implements android.widget.AdapterView.OnItemClickListener
    {

        final HomefeedBuilderListCell this$0;

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            adapterview = ((HomefeedBuilderPinGridAdapter)adapterview.getAdapter()).getItem(i);
            if (adapterview instanceof Pin)
            {
                Pinalytics.a(ElementType.HOMEFEED_BUILDER_PIN, ComponentType.INTEREST_GRID, HomefeedBuilderData.getAuxData(_interest, _mode));
                Events.post(new Navigation(Location.PIN, adapterview));
            } else
            if (adapterview instanceof Interest)
            {
                Pinalytics.a(ElementType.HOMEFEED_BUILDER_SEE_MORE_BUTTON, ComponentType.INTEREST_GRID, HomefeedBuilderData.getAuxData(_interest, _mode));
                Events.post(new Navigation(Location.INTEREST, adapterview));
                return;
            }
        }

        _cls1()
        {
            this$0 = HomefeedBuilderListCell.this;
            super();
        }
    }


    private class _cls2
        implements org.lucasr.twowayview.TwoWayView.OnScrollListener
    {

        final HomefeedBuilderListCell this$0;

        public void onScroll(TwoWayView twowayview, int i, int j, int k)
        {
        }

        public void onScrollStateChanged(TwoWayView twowayview, int i)
        {
            if (i != 0)
            {
                Pinalytics.a(EventType.HOMEFEED_BUILDER_PIN_GRID_SCROLL, null, null, HomefeedBuilderData.getAuxData(_interest, _mode));
            }
        }

        _cls2()
        {
            this$0 = HomefeedBuilderListCell.this;
            super();
        }
    }


    private class _cls4 extends com.pinterest.kit.utils.AnimationUtils.AnimationListener
    {

        final HomefeedBuilderListCell this$0;

        public void onAnimationEnd(Animator animator)
        {
            Events.post(new FadeoutDismissedViewEndEvent(_interest));
        }

        public void onAnimationStart(Animator animator)
        {
            Events.post(new FadeoutDismissedViewStartEvent(_interest));
        }

        _cls4()
        {
            this$0 = HomefeedBuilderListCell.this;
            super();
        }

        private class FadeoutDismissedViewEndEvent
        {

            private final Interest _interest;

            public Interest getInterest()
            {
                return _interest;
            }

            public FadeoutDismissedViewEndEvent(Interest interest)
            {
                _interest = interest;
            }
        }


        private class FadeoutDismissedViewStartEvent
        {

            private final Interest _interest;

            public Interest getInterest()
            {
                return _interest;
            }

            public FadeoutDismissedViewStartEvent(Interest interest)
            {
                _interest = interest;
            }
        }

    }


    private class _cls3 extends Feed
    {

        final HomefeedBuilderListCell this$0;

        protected List getPersistedItems()
        {
            return null;
        }

        _cls3()
        {
            this$0 = HomefeedBuilderListCell.this;
            super();
        }
    }

}
