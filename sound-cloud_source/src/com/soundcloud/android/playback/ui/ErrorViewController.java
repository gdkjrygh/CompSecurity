// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.soundcloud.android.playback.ui.view.WaveformViewController;
import java.util.Iterator;

class ErrorViewController
{
    public static class Factory
    {

        public ErrorViewController create(View view)
        {
            return new ErrorViewController(view);
        }

        Factory()
        {
        }
    }


    private com.soundcloud.android.playback.Player.Reason currentError;
    private View errorLayout;
    private final ViewStub errorStub;
    private final TrackPagePresenter.TrackPageHolder holder;
    private final View trackView;

    public ErrorViewController(View view)
    {
        trackView = view;
        holder = (TrackPagePresenter.TrackPageHolder)view.getTag();
        errorStub = (ViewStub)view.findViewById(0x7f0f01f9);
    }

    private void setGone(Iterable iterable)
    {
        View view;
        for (iterable = iterable.iterator(); iterable.hasNext(); view.setVisibility(8))
        {
            view = (View)iterable.next();
            view.clearAnimation();
        }

    }

    private void setMessageFromReason(com.soundcloud.android.playback.Player.Reason reason)
    {
        TextView textview = (TextView)errorLayout.findViewById(0x7f0f027f);
        int i;
        if (reason == com.soundcloud.android.playback.Player.Reason.ERROR_FAILED)
        {
            i = 0x7f07017e;
        } else
        {
            i = 0x7f070180;
        }
        textview.setText(i);
    }

    private void setVisible(Iterable iterable)
    {
        View view;
        for (iterable = iterable.iterator(); iterable.hasNext(); view.setAlpha(1.0F))
        {
            view = (View)iterable.next();
            view.setVisibility(0);
        }

    }

    private void setupErrorLayout()
    {
        errorLayout = trackView.findViewById(0x7f0f01fa);
        if (errorLayout == null)
        {
            errorLayout = errorStub.inflate();
            return;
        } else
        {
            errorLayout.setVisibility(0);
            return;
        }
    }

    public void hideError()
    {
        if (isShowingError())
        {
            holder.waveformController.show();
            setVisible(holder.hideOnErrorViews);
            errorLayout.setVisibility(8);
            currentError = null;
        }
    }

    public boolean isShowingError()
    {
        return currentError != null;
    }

    public void showError(com.soundcloud.android.playback.Player.Reason reason)
    {
        currentError = reason;
        holder.waveformController.hide();
        setGone(holder.hideOnErrorViews);
        setupErrorLayout();
        setMessageFromReason(reason);
    }
}
