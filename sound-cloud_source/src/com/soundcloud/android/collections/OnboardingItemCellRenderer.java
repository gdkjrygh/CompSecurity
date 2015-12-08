// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.collections;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.soundcloud.android.presentation.CellRenderer;
import com.soundcloud.android.properties.FeatureFlags;
import com.soundcloud.android.properties.Flag;
import java.util.List;

class OnboardingItemCellRenderer
    implements CellRenderer
{
    static interface Listener
    {

        public abstract void onCollectionsOnboardingItemClosed(int i);
    }


    private final FeatureFlags featureFlags;
    private Listener listener;

    public OnboardingItemCellRenderer(FeatureFlags featureflags)
    {
        featureFlags = featureflags;
    }

    public void bindItemView(final int position, View view, List list)
    {
        view.setEnabled(false);
        if (listener != null)
        {
            view.findViewById(0x7f0f00d6).setOnClickListener(new _cls1());
        }
    }

    public View createItemView(ViewGroup viewgroup)
    {
        viewgroup = LayoutInflater.from(viewgroup.getContext()).inflate(0x7f03002f, viewgroup, false);
        if (featureFlags.isEnabled(Flag.STATIONS_SOFT_LAUNCH))
        {
            ((TextView)viewgroup.findViewById(0x7f0f0073)).setText(0x7f0700ef);
        }
        return viewgroup;
    }

    public void setListener(Listener listener1)
    {
        listener = listener1;
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final OnboardingItemCellRenderer this$0;
        final int val$position;

        public void onClick(View view)
        {
            listener.onCollectionsOnboardingItemClosed(position);
        }

        _cls1()
        {
            this$0 = OnboardingItemCellRenderer.this;
            position = i;
            super();
        }
    }

}
