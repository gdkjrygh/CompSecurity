// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view.modules;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.pinterest.activity.pin.view.PinCloseupImageView;
import com.pinterest.activity.pin.view.modules.util.ClickThroughUtil;
import com.pinterest.activity.task.education.event.EducationEvent;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Pin;
import com.pinterest.base.Colors;
import com.pinterest.base.Events;
import com.pinterest.base.StopWatch;
import com.pinterest.education.EducationHelper;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.schemas.experiences.Experience;
import java.util.List;

// Referenced classes of package com.pinterest.activity.pin.view.modules:
//            PinCloseupBaseModule

public class PinCloseupImageModule extends PinCloseupBaseModule
    implements android.view.View.OnClickListener
{

    private PinCloseupImageView _imageVw;

    public PinCloseupImageModule(Context context)
    {
        super(context);
    }

    public PinCloseupImageView getCloseupImageView()
    {
        return _imageVw;
    }

    protected ComponentType getComponentType()
    {
        return ComponentType.PIN_CLOSEUP_IMAGE;
    }

    protected boolean hasContent()
    {
        return true;
    }

    protected void init()
    {
        int i = (int)Resources.dimension(0x7f0a0186);
        _padding.left = i;
        _padding.right = i;
        _padding.top = (int)Resources.dimension(0x7f0a0186);
        _padding.bottom = 0;
    }

    protected void initView()
    {
        setBackgroundColor(Colors.WHITE);
        removeAllViews();
        _imageVw = new PinCloseupImageView(getContext());
        _imageVw.setOnPinClickListener(this);
        int i = (int)Resources.dimension(0x7f0a0186);
        _imageVw.setImageMargin(i);
        addView(_imageVw, -1, -2);
    }

    public void onClick(View view)
    {
        view = _pin.getClickThroughUrl();
        Pinalytics.a(ElementType.PIN_SOURCE_IMAGE, ComponentType.MODAL_PIN, _pin.getUid(), _pin.getLoggingAuxData());
        StopWatch.get().start("clickthrough_verify");
        ClickThroughUtil.gotoPinLink(view, _pin, _apiTag);
        int i = EducationHelper.b();
        if (i == Experience.ANDROID_CLICKTHROUGH_ED.getValue() || i == Experience.ANDROID_CLICKTHROUGH_ED_HELPER.getValue() || i == Experience.ANDROID_CLICKTHROUGH_ED_TABLET.getValue() || i == Experience.ANDROID_CLICKTHROUGH_ED_HELPER_TABLET.getValue())
        {
            Events.post(new EducationEvent(com.pinterest.activity.task.education.event.EducationEvent.Type.NEXT));
        }
    }

    protected void onDetachedFromWindow()
    {
        _imageVw.setOnPinClickListener(null);
        super.onDetachedFromWindow();
    }

    protected boolean shouldUpdateView()
    {
        return true;
    }

    protected void updateView()
    {
        _imageVw.setGalleryItem((com.pinterest.api.model.Pin.GalleryItem)_pin.getGalleryItems().get(0));
    }
}
