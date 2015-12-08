// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.kids.details;

import android.app.Activity;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.servicemgr.SeasonDetails;
import com.netflix.mediaclient.util.DeviceUtils;
import com.netflix.mediaclient.util.StringUtils;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.ui.kids.details:
//            KidsShowDetailsFrag, KidsShowDetailsAdapter

public class KidsSeasonSelector extends RelativeLayout
{

    private static final String TAG = "KidsSeasonSelector";
    private final Activity activity;
    private final KidsShowDetailsAdapter adapter;
    private final int centerOffset;
    private final int halfItemWidth;
    private final List itemViews;
    private final int itemWidth = getResources().getDimensionPixelSize(0x7f0a0078);
    private final int padViewWidth;
    private final HorizontalScrollView scroller = (HorizontalScrollView)findViewById(0x7f0700db);
    private final LinearLayout seasonsGroup = (LinearLayout)findViewById(0x7f0700dc);
    private final int selectedColor = getResources().getColor(0x7f090070);
    private final int unselectedColor = getResources().getColor(0x7f090071);

    public KidsSeasonSelector(KidsShowDetailsFrag kidsshowdetailsfrag, KidsShowDetailsAdapter kidsshowdetailsadapter)
    {
        super(kidsshowdetailsfrag.getActivity());
        activity = kidsshowdetailsfrag.getActivity();
        adapter = kidsshowdetailsadapter;
        kidsshowdetailsfrag = adapter.getSeasons();
        Log.v("KidsSeasonSelector", (new StringBuilder()).append("Creating Season Selector, num seasons: ").append(kidsshowdetailsfrag.size()).toString());
        setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, -2));
        halfItemWidth = itemWidth / 2;
        centerOffset = (DeviceUtils.getScreenWidthInPixels(activity) - itemWidth) / 2;
        padViewWidth = centerOffset;
        Log.v("KidsSeasonSelector", (new StringBuilder()).append("Item width: ").append(itemWidth).append(", centerOffset: ").append(centerOffset).toString());
        activity.getLayoutInflater().inflate(0x7f03003a, this);
        setBackgroundColor(activity.getResources().getColor(0x7f09006f));
        scroller.setHorizontalScrollBarEnabled(false);
        scroller.setOnTouchListener(new android.view.View.OnTouchListener() {

            final KidsSeasonSelector this$0;

            public boolean onTouch(View view, MotionEvent motionevent)
            {
                if (motionevent.getAction() == 1)
                {
                    Log.v("KidsSeasonSelector", (new StringBuilder()).append("onTouch, ").append(motionevent).toString());
                    getCenteredChildView().performClick();
                }
                return false;
            }

            
            {
                this$0 = KidsSeasonSelector.this;
                super();
            }
        });
        itemViews = new ArrayList(kidsshowdetailsfrag.size());
        Log.v("KidsSeasonSelector", (new StringBuilder()).append("Creating views, num: ").append(kidsshowdetailsfrag.size()).toString());
        seasonsGroup.addView(createPaddingView());
        int i = 0;
        while (i < kidsshowdetailsfrag.size()) 
        {
            int j = ((SeasonDetails)kidsshowdetailsfrag.get(i)).getSeasonNumber();
            boolean flag;
            if (i == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            kidsshowdetailsadapter = createItemView(j, flag);
            itemViews.add(kidsshowdetailsadapter);
            seasonsGroup.addView(kidsshowdetailsadapter);
            i++;
        }
        seasonsGroup.addView(createPaddingView());
    }

    private View createItemView(int i, boolean flag)
    {
        final TextView tv = (TextView)activity.getLayoutInflater().inflate(0x7f03003b, null);
        tv.setLayoutParams(new android.widget.LinearLayout.LayoutParams(itemWidth, -1));
        int j;
        if (flag)
        {
            j = selectedColor;
        } else
        {
            j = unselectedColor;
        }
        tv.setTextColor(j);
        tv.setText(String.valueOf(i));
        tv.setTag(Integer.valueOf(i));
        tv.setOnClickListener(new android.view.View.OnClickListener() {

            final KidsSeasonSelector this$0;
            final TextView val$tv;

            public void onClick(View view)
            {
                Log.v("KidsSeasonSelector", (new StringBuilder()).append("Clicked on: ").append(tv.getText()).toString());
                adapter.selectSeasonByNumber(((Integer)tv.getTag()).intValue());
            }

            
            {
                this$0 = KidsSeasonSelector.this;
                tv = textview;
                super();
            }
        });
        return tv;
    }

    private View createPaddingView()
    {
        View view = new View(activity);
        view.setLayoutParams(new android.widget.LinearLayout.LayoutParams(padViewWidth, -1));
        return view;
    }

    private View getCenteredChildView()
    {
        int i = (int)Math.floor((float)(scroller.getScrollX() + halfItemWidth) / (float)itemWidth);
        View view = (View)itemViews.get(i);
        if (Log.isLoggable("KidsSeasonSelector", 2))
        {
            Log.v("KidsSeasonSelector", (new StringBuilder()).append("getCenteredChildView(), id: ").append(i).append(", number: ").append(view.getTag()).toString());
        }
        return view;
    }

    protected void onAttachedToWindow()
    {
        Log.v("KidsSeasonSelector", (new StringBuilder()).append("onAttachedToWindow,   ").append(hashCode()).toString());
        super.onAttachedToWindow();
    }

    protected void onDetachedFromWindow()
    {
        Log.v("KidsSeasonSelector", (new StringBuilder()).append("onDetachedFromWindow, ").append(hashCode()).toString());
        super.onDetachedFromWindow();
    }

    public void setSeasonNumber(int i, final boolean useSmoothScroll)
    {
        Log.v("KidsSeasonSelector", (new StringBuilder()).append("Setting curr season number: ").append(i).toString());
        int j = 0;
        while (j < itemViews.size()) 
        {
            TextView textview = (TextView)itemViews.get(j);
            boolean flag = StringUtils.safeEquals((String)textview.getText(), String.valueOf(i));
            final int x;
            if (flag)
            {
                x = selectedColor;
            } else
            {
                x = unselectedColor;
            }
            textview.setTextColor(x);
            if (flag)
            {
                x = (itemWidth * j - centerOffset) + padViewWidth;
                Log.v("KidsSeasonSelector", (new StringBuilder()).append("Scrolling to: ").append(x).toString());
                scroller.post(new Runnable() {

                    final KidsSeasonSelector this$0;
                    final boolean val$useSmoothScroll;
                    final int val$x;

                    public void run()
                    {
                        if (useSmoothScroll)
                        {
                            scroller.smoothScrollTo(x, 0);
                            return;
                        } else
                        {
                            scroller.scrollTo(x, 0);
                            return;
                        }
                    }

            
            {
                this$0 = KidsSeasonSelector.this;
                useSmoothScroll = flag;
                x = i;
                super();
            }
                });
            }
            j++;
        }
    }



}
