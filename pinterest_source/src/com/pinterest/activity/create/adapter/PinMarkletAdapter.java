// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.adapter;

import android.view.View;
import android.view.ViewGroup;
import com.pinterest.activity.create.model.PinnableImage;
import com.pinterest.adapter.PinterestBaseAdapter;
import com.pinterest.api.model.Pin;
import com.pinterest.base.Device;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.feedback.PinFeedbackState;
import com.pinterest.ui.grid.PinGridCell;
import com.pinterest.ui.grid.PinGridFeedbackView;

public class PinMarkletAdapter extends PinterestBaseAdapter
{

    public PinMarkletAdapter()
    {
    }

    private String getPinDescription(int i, int j)
    {
        return (new StringBuilder()).append(i).append(" x ").append(j).toString();
    }

    private boolean isImageGif(String s)
    {
        return s != null && s.endsWith("gif");
    }

    public int getItemSpan(int i)
    {
        PinnableImage pinnableimage = (PinnableImage)getItem(i);
        return pinnableimage == null || (float)pinnableimage.getWidth() <= Device.getScreenWidth() || pinnableimage.getWidth() / pinnableimage.getHeight() <= 1 ? 1 : 2;
    }

    public View getView(int i, View view, ViewGroup viewgroup, boolean flag)
    {
        Pin pin;
        PinnableImage pinnableimage;
label0:
        {
            pinnableimage = (PinnableImage)getItem(i);
            Object obj = view;
            if (pinnableimage != null)
            {
                pin = new Pin();
                if (!pinnableimage.isPinned())
                {
                    break label0;
                }
                pin.setFeedbackState(new PinFeedbackState(0x7f020268, 0x7f020253, Resources.string(0x7f070208), null));
                obj = PinGridFeedbackView.from(view, viewgroup);
                ((PinGridFeedbackView) (obj)).setPin(pin, flag);
            }
            return ((View) (obj));
        }
        pin.setUid(pinnableimage.getUid());
        pin.setDescription(getPinDescription(pinnableimage.getWidth(), pinnableimage.getHeight()));
        pin.setCleanDescription(Pin.cleanDescription(pin.getDescription()));
        pin.setImageMediumUrl(pinnableimage.getImageUrl());
        pin.setImageMediumWidth(Integer.valueOf(pinnableimage.getWidth()));
        pin.setImageMediumHeight(Integer.valueOf(pinnableimage.getHeight()));
        if (isImageGif(pinnableimage.getImageUrl()))
        {
            pin.setEmbedType("gif");
        }
        view = PinGridCell.from(view, ViewHelper.getContext(view, viewgroup));
        view.setPin(pin, flag);
        view.setRenderUser(false);
        view.setRenderOnto(false);
        view.setOverrideClicks(true);
        return view;
    }

    protected void loadMore(int i)
    {
    }
}
