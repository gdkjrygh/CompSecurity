// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.EditText;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.Pin;
import com.pinterest.base.Device;
import com.pinterest.experiment.Experiments;
import com.pinterest.kit.network.image.ImageCache;
import com.pinterest.kit.utils.AggregatedPinUtils;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.schemas.event.EventType;
import com.pinterest.ui.ViewHelper;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.activity.create.fragment:
//            CreateBaseFragment

public class RepinFragment extends CreateBaseFragment
{

    protected Pin _pin;

    public RepinFragment()
    {
    }

    protected String getDescriptionTextFromEditField()
    {
        String s1 = descriptionEt.getText().toString();
        String s = s1;
        if (Experiments.P())
        {
            s = s1;
            if (StringUtils.isEmpty(s1))
            {
                s = s1;
                if (!AggregatedPinUtils.hasUserChangedDescription(_pin))
                {
                    s = _pin.getDescription();
                }
            }
        }
        return s;
    }

    public int getTitleId()
    {
        return 0x7f07049b;
    }

    protected void init(View view)
    {
        super.init(view);
        ImageCache.loadImage(pinIv, _pin.getImageMediumUrl());
        boolean flag = Experiments.P();
        if (flag)
        {
            descriptionEt.setHint(0x7f07019c);
        }
        if (!flag || AggregatedPinUtils.hasUserChangedDescription(_pin))
        {
            ViewHelper.setTextAndCursor(descriptionEt, _pin.getDescription());
        }
        if (StringUtils.isEmpty(descriptionEt.getText().toString()))
        {
            Device.showSoftKeyboard(descriptionEt);
        }
    }

    public boolean isValid()
    {
        if (_pin == null)
        {
            return false;
        } else
        {
            return super.isValid();
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getActivity().getIntent().getExtras();
        if (bundle != null && bundle.getString("com.pinterest.EXTRA_PIN_ID") != null)
        {
            String s = bundle.getString("com.pinterest.EXTRA_PIN_ID");
            _pin = ModelHelper.getPin(s);
            if (_pin == null)
            {
                _pin = new Pin();
                _pin.setUid(s);
                _pin.setDescription(bundle.getString("com.pinterest.EXTRA_MESSAGE"));
                _pin.setImageLargeUrl(bundle.getString("com.pinterest.EXTRA_URL"));
                updatePlaceDisplay(_pin.getPlace(), _pin.getDescription());
            }
        }
    }

    public void pin()
    {
        Pinalytics.a(ElementType.PIN_REPIN_BUTTON, ComponentType.MODAL_ADD_PIN, _pin.getUid());
        com.pinterest.api.remote.PinApi.PinDetailParams pindetailparams = new com.pinterest.api.remote.PinApi.PinDetailParams();
        pindetailparams.a = _pin.getUid();
        pindetailparams.b = boardUid;
        pindetailparams.d = getDescriptionTextFromEditField();
        Pinalytics.a(EventType.PIN_REPIN, _pin.getUid());
        ModelHelper.repinPin(_pin, pindetailparams, new _cls1(), getApiTag());
    }

    private class _cls1 extends ApiResponseHandler
    {

        final RepinFragment this$0;

        public void onSuccess(ApiResponse apiresponse)
        {
            try
            {
                Pin.make((PinterestJsonObject)apiresponse.getData(), false).getPin();
            }
            // Misplaced declaration of an exception variable
            catch (ApiResponse apiresponse) { }
            Application.showToast(0x7f0701ad, DrawableUtils.tintIcon(0x7f0201d3, 0x106000b));
            Events.postSticky(new com.pinterest.events.FeedEvents.MyBoardsInvalidated());
        }

        _cls1()
        {
            this$0 = RepinFragment.this;
            super();
        }
    }

}
