// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.presentation.CellRenderer;
import com.soundcloud.android.properties.FeatureFlags;
import com.soundcloud.android.properties.Flag;
import java.util.List;

public class StationsOnboardingStreamItemRenderer
    implements CellRenderer
{
    public static interface Listener
    {

        public abstract void onStationOnboardingItemClosed(int i);
    }


    private final FeatureFlags featureFlags;
    private Listener listener;

    public StationsOnboardingStreamItemRenderer(FeatureFlags featureflags)
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
        int i;
        if (featureFlags.isEnabled(Flag.NEW_STREAM))
        {
            i = 0x7f0300b9;
        } else
        {
            i = 0x7f0300ba;
        }
        return LayoutInflater.from(viewgroup.getContext()).inflate(i, viewgroup, false);
    }

    public void setListener(Listener listener1)
    {
        listener = listener1;
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final StationsOnboardingStreamItemRenderer this$0;
        final int val$position;

        public void onClick(View view)
        {
            listener.onStationOnboardingItemClosed(position);
        }

        _cls1()
        {
            this$0 = StationsOnboardingStreamItemRenderer.this;
            position = i;
            super();
        }
    }

}
