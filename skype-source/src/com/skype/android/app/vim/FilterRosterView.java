// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.vim;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Outline;
import android.os.Handler;
import android.os.Message;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Referenced classes of package com.skype.android.app.vim:
//            VideoEffect

public class FilterRosterView extends RecyclerView
    implements android.os.Handler.Callback
{
    public static interface FilterRosterEventsListener
    {

        public abstract void onFilterRosterVisibilityChanged(boolean flag);

        public abstract void onFilterSelected(VideoEffect videoeffect);
    }

    private final class a extends android.support.v7.widget.RecyclerView.a
    {

        private VideoEffect enabledFilters[];
        final FilterRosterView this$0;

        private void setVideoFilters(String as[])
        {
            ArrayList arraylist = new ArrayList();
            arraylist.add(0, VideoEffect.NORMAL);
            HashMap hashmap = new HashMap();
            VideoEffect avideoeffect[] = VideoEffect.values();
            int k = avideoeffect.length;
            for (int i = 0; i < k; i++)
            {
                VideoEffect videoeffect1 = avideoeffect[i];
                hashmap.put(videoeffect1.name(), videoeffect1);
            }

            k = as.length;
            for (int j = 0; j < k; j++)
            {
                VideoEffect videoeffect = (VideoEffect)hashmap.get(as[j].toUpperCase());
                if (videoeffect != null)
                {
                    arraylist.add(videoeffect);
                }
            }

            enabledFilters = (VideoEffect[])arraylist.toArray(new VideoEffect[arraylist.size()]);
        }

        public final int getItemCount()
        {
            return enabledFilters.length;
        }

        public final volatile void onBindViewHolder(android.support.v7.widget.RecyclerView.v v, int i)
        {
            onBindViewHolder((b)v, i);
        }

        public final void onBindViewHolder(b b1, int i)
        {
            VideoEffect videoeffect = enabledFilters[i];
            b1.preview.setBackgroundResource(videoeffect.getPreviewDrawableId());
            b1.preview.setTag(videoeffect);
            b1.preview.setOnClickListener(new android.view.View.OnClickListener() {

                final a this$1;

                public final void onClick(View view)
                {
                    currentEffect = (VideoEffect)view.getTag();
                    if (eventListener != null)
                    {
                        eventListener.onFilterSelected(currentEffect);
                    }
                    notifyDataSetChanged();
                    scheduleTimeout(5000L);
                }

            
            {
                this$1 = a.this;
                super();
            }
            });
            b1 = b1.preview;
            boolean flag;
            if (currentEffect == videoeffect)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            b1.setSelected(flag);
        }

        public final volatile android.support.v7.widget.RecyclerView.v onCreateViewHolder(ViewGroup viewgroup, int i)
        {
            return onCreateViewHolder(viewgroup, i);
        }

        public final b onCreateViewHolder(ViewGroup viewgroup, int i)
        {
            viewgroup = LayoutInflater.from(getContext()).inflate(0x7f03008f, viewgroup, false);
            return new b(viewgroup);
        }

        public a(String as[])
        {
            this$0 = FilterRosterView.this;
            super();
            setVideoFilters(as);
        }
    }

    private final class b extends android.support.v7.widget.RecyclerView.v
    {

        ImageView preview;
        final FilterRosterView this$0;

        public b(View view)
        {
            this$0 = FilterRosterView.this;
            super(view);
            preview = (ImageView)view.findViewById(0x7f100378);
            if (android.os.Build.VERSION.SDK_INT >= 21)
            {
                ((ViewGroup)view).setClipChildren(false);
                preview.setElevation(getResources().getDimensionPixelSize(0x7f0c00bc));
                preview.setOutlineProvider(new _cls1());
            }
        }
    }


    private static final int ANIMATION_DURATION = 300;
    private static final long TIMEOUT_LONG_VALUE = 5000L;
    private static final int TIMEOUT_MSG = 1;
    private static final long TIMEOUT_SHORT_VALUE = 3000L;
    private VideoEffect currentEffect;
    private FilterRosterEventsListener eventListener;
    private Handler handler;

    public FilterRosterView(Context context)
    {
        super(context);
        init();
    }

    public FilterRosterView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public FilterRosterView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void init()
    {
        setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        setHasFixedSize(true);
        addOnScrollListener(new android.support.v7.widget.RecyclerView.m() {

            final FilterRosterView this$0;

            public final void onScrolled(RecyclerView recyclerview, int i, int j)
            {
                super.onScrolled(recyclerview, i, j);
                if (i != 0)
                {
                    scheduleTimeout(5000L);
                }
            }

            
            {
                this$0 = FilterRosterView.this;
                super();
            }
        });
        handler = new Handler(this);
    }

    private void scheduleTimeout(long l)
    {
        handler.removeMessages(1);
        handler.sendEmptyMessageDelayed(1, l);
    }

    public boolean handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return false;

        case 1: // '\001'
            break;
        }
        if (isShown())
        {
            hide();
        }
        return true;
    }

    public void hide()
    {
        handler.removeMessages(1);
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            animate().translationY(getMeasuredHeight()).setInterpolator(new AccelerateInterpolator()).setDuration(180L).withEndAction(new Runnable() {

                final FilterRosterView this$0;

                public final void run()
                {
                    setVisibility(8);
                }

            
            {
                this$0 = FilterRosterView.this;
                super();
            }
            }).setStartDelay(0L);
        } else
        {
            setVisibility(8);
        }
        if (eventListener != null)
        {
            eventListener.onFilterRosterVisibilityChanged(false);
        }
    }

    public boolean isShown()
    {
        return getVisibility() == 0;
    }

    public boolean onInterceptBackButton()
    {
        if (isShown())
        {
            hide();
            return true;
        } else
        {
            return false;
        }
    }

    public void setFilters(String as[])
    {
        setAdapter(new a(as));
    }

    public void setOnFilterSelectionListener(FilterRosterEventsListener filterrostereventslistener)
    {
        eventListener = filterrostereventslistener;
    }

    public void show(VideoEffect videoeffect, boolean flag)
    {
        currentEffect = videoeffect;
        setVisibility(0);
        getAdapter().notifyDataSetChanged();
        setTranslationY((int)((float)getResources().getDimensionPixelSize(0x7f0c01b9) * 2.5F));
        long l;
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            videoeffect = animate().translationY(0.0F).setInterpolator(new OvershootInterpolator()).setDuration(300L).withEndAction(null);
            if (flag)
            {
                l = 0L;
            } else
            {
                l = getResources().getInteger(0x10e0001);
            }
            videoeffect.setStartDelay(l);
        }
        if (flag)
        {
            l = 5000L;
        } else
        {
            l = 3000L;
        }
        scheduleTimeout(l);
        if (eventListener != null)
        {
            eventListener.onFilterRosterVisibilityChanged(true);
        }
    }




/*
    static VideoEffect access$102(FilterRosterView filterrosterview, VideoEffect videoeffect)
    {
        filterrosterview.currentEffect = videoeffect;
        return videoeffect;
    }

*/


    // Unreferenced inner class com/skype/android/app/vim/FilterRosterView$b$1

/* anonymous class */
    final class b._cls1 extends ViewOutlineProvider
    {

        final b this$1;
        final FilterRosterView val$this$0;

        public final void getOutline(View view, Outline outline)
        {
            outline.setOval(0, 0, view.getWidth(), view.getHeight());
        }

            
            {
                this$1 = final_b1;
                this$0 = FilterRosterView.this;
                super();
            }
    }

}
