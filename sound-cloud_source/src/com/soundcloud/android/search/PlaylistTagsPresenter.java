// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.search;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.soundcloud.android.utils.ViewUtils;
import com.soundcloud.rx.eventbus.EventBus;
import java.util.Iterator;
import java.util.List;

public class PlaylistTagsPresenter
{
    public static interface Listener
    {

        public abstract void onTagSelected(Context context, String s);
    }


    private final EventBus eventBus;
    private Listener listener;
    private final android.view.View.OnClickListener popularTagClickListener = new _cls2();
    private final android.view.View.OnClickListener recentTagClickListener = new _cls1();
    private final Resources resources;

    public PlaylistTagsPresenter(Resources resources1, EventBus eventbus)
    {
        resources = resources1;
        eventBus = eventbus;
    }

    private void displayTags(View view, List list, int i, android.view.View.OnClickListener onclicklistener)
    {
        ViewGroup viewgroup = (ViewGroup)view.findViewById(i);
        viewgroup.removeAllViews();
        i = ViewUtils.dpToPx(resources, 5);
        com.soundcloud.android.view.FlowLayout.LayoutParams layoutparams = new com.soundcloud.android.view.FlowLayout.LayoutParams(i, i);
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            String s = (String)list.next();
            if (!TextUtils.isEmpty(s))
            {
                TextView textview = (TextView)View.inflate(view.getContext(), 0x7f030029, null);
                textview.setText((new StringBuilder("#")).append(s).toString());
                textview.setTag(s);
                textview.setOnClickListener(onclicklistener);
                viewgroup.addView(textview, layoutparams);
            }
        } while (true);
    }

    public void displayPopularTags(View view, List list)
    {
        displayTags(view, list, 0x7f0f0207, popularTagClickListener);
    }

    public void displayRecentTags(View view, List list)
    {
        view.findViewById(0x7f0f0203).setVisibility(0);
        displayTags(view, list, 0x7f0f0204, recentTagClickListener);
    }

    public void setListener(Listener listener1)
    {
        listener = listener1;
    }



    private class _cls1
        implements android.view.View.OnClickListener
    {

        final PlaylistTagsPresenter this$0;

        public void onClick(View view)
        {
            eventBus.publish(EventQueue.TRACKING, SearchEvent.recentTagSearch((String)view.getTag()));
            if (listener != null)
            {
                listener.onTagSelected(view.getContext(), (String)view.getTag());
            }
        }

        _cls1()
        {
            this$0 = PlaylistTagsPresenter.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final PlaylistTagsPresenter this$0;

        public void onClick(View view)
        {
            eventBus.publish(EventQueue.TRACKING, SearchEvent.popularTagSearch((String)view.getTag()));
            if (listener != null)
            {
                listener.onTagSelected(view.getContext(), (String)view.getTag());
            }
        }

        _cls2()
        {
            this$0 = PlaylistTagsPresenter.this;
            super();
        }
    }

}
