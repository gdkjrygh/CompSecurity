// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view.modules;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import com.pinterest.activity.commerce.util.BuyableProductHelper;
import com.pinterest.activity.pin.view.modules.util.ClickThroughUtil;
import com.pinterest.activity.pin.view.modules.util.IconDoubleTextCellView;
import com.pinterest.activity.pin.view.modules.util.VerifiedDomainUtil;
import com.pinterest.activity.task.education.event.EducationEvent;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.BoostablePinMetadata;
import com.pinterest.api.model.BuyableProduct;
import com.pinterest.api.model.Domain;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.Pin;
import com.pinterest.api.model.User;
import com.pinterest.api.model.metadata.article.Article;
import com.pinterest.api.model.metadata.movie.Movie;
import com.pinterest.api.model.metadata.recipe.Recipe;
import com.pinterest.base.Events;
import com.pinterest.base.StopWatch;
import com.pinterest.education.EducationHelper;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.schemas.experiences.Experience;
import com.pinterest.ui.text.PButton;
import org.apache.commons.lang3.BooleanUtils;

// Referenced classes of package com.pinterest.activity.pin.view.modules:
//            PinCloseupBaseModule

public class PinCloseupLinkModule extends PinCloseupBaseModule
{

    private PButton _actionButton;
    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    private boolean _firstLoad;
    private String _linkUrl;
    private IconDoubleTextCellView _verifiedDomainVw;

    public PinCloseupLinkModule(Context context)
    {
        super(context);
        _firstLoad = true;
        _eventsSubscriber = new _cls4();
    }

    private void onVerifiedDomainClick(View view)
    {
        view = _pin.getDomainObj();
        if (view != null)
        {
            if ((view = view.getOfficialUser()) != null)
            {
                Pinalytics.a(ElementType.PIN_LINK_MODULE_DOMAIN_OWNER_PROFILE, ComponentType.MODAL_PIN, view.getUid());
                Events.post(new Navigation(Location.USER, view));
                return;
            }
        }
    }

    private void onWebsiteClick(View view)
    {
        Pinalytics.a(ElementType.WEBSITE_BUTTON, ComponentType.MODAL_PIN, _pin.getUid(), _pin.getLoggingAuxData());
        StopWatch.get().start("clickthrough_verify");
        ClickThroughUtil.gotoPinLink(_linkUrl, _pin, _apiTag);
        int i = EducationHelper.b();
        if (i == Experience.ANDROID_CLICKTHROUGH_ED.getValue() || i == Experience.ANDROID_CLICKTHROUGH_ED_HELPER.getValue() || i == Experience.ANDROID_CLICKTHROUGH_ED_TABLET.getValue() || i == Experience.ANDROID_CLICKTHROUGH_ED_HELPER_TABLET.getValue())
        {
            Events.post(new EducationEvent(com.pinterest.activity.task.education.event.EducationEvent.Type.NEXT));
        }
    }

    private boolean updateLinkUrl()
    {
        String s = _pin.getClickThroughUrl();
        boolean flag;
        if (!TextUtils.equals(_linkUrl, s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        _linkUrl = s;
        return flag;
    }

    protected ComponentType getComponentType()
    {
        return ComponentType.PIN_CLOSEUP_LINK;
    }

    protected boolean hasContent()
    {
        return true;
    }

    protected void initView()
    {
        setBackgroundColor(-1);
        setGravity(16);
        removeAllViews();
        _padding.top = (int)Resources.dimension(0x7f0a0186);
        int i = (int)Resources.dimension(0x7f0a0184);
        _padding.left = i;
        _padding.right = i;
        if (EducationHelper.c() || EducationHelper.d())
        {
            _padding.bottom = (int)Resources.dimension(0x7f0a0186);
        }
        _verifiedDomainVw = new IconDoubleTextCellView(getContext());
        _verifiedDomainVw.setBackgroundResource(0x7f020283);
        _verifiedDomainVw.setIconClickListener(new _cls1());
        _verifiedDomainVw.setTextClickListener(new _cls2());
        addView(_verifiedDomainVw, new android.widget.LinearLayout.LayoutParams(-1, -2, 1.0F));
        _actionButton = new PButton(getContext(), null, 0x7f0100de);
        _actionButton.setId(0x7f0f0005);
        _actionButton.setOnClickListener(new _cls3());
        addView(_actionButton, new android.widget.LinearLayout.LayoutParams(-2, -2, 0.0F));
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        Events.register(_eventsSubscriber, com/pinterest/activity/task/education/view/EducationToolTipView$ClickthroughToolTipEvent, new Class[0]);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        Events.unregister(_eventsSubscriber, new Class[] {
            com/pinterest/activity/task/education/view/EducationToolTipView$ClickthroughToolTipEvent
        });
    }

    protected boolean shouldUpdateView()
    {
        updateLinkUrl();
        return true;
    }

    protected void updateView()
    {
        String s = _pin.getDomain();
        if (_pin.isCSR() && s == null && _pin.getDomainObj() != null)
        {
            s = _pin.getDomainObj().getName();
        }
        String s1;
        int i;
        int j;
        boolean flag;
        if (ModelHelper.isValid(s))
        {
            i = 0x7f0703f5;
        } else
        {
            i = 0x7f0703f7;
        }
        j = i;
        if (_pinMetadata == null) goto _L2; else goto _L1
_L1:
        if (!(_pinMetadata instanceof Recipe) || ((Recipe)_pinMetadata).isFromAggregatedData().booleanValue()) goto _L4; else goto _L3
_L3:
        j = 0x7f0703f6;
_L2:
        _actionButton.setText(j);
        if (_firstLoad)
        {
            _firstLoad = false;
            return;
        }
        break; /* Loop/switch isn't completed */
_L4:
        j = i;
        if (_pinMetadata instanceof Article)
        {
            j = 0x7f0703f4;
        }
        if (true) goto _L2; else goto _L5
_L5:
        s1 = VerifiedDomainUtil.getOfficialUserImageMediumUrl(_pin);
        if (s1 != null)
        {
            _verifiedDomainVw.setImageUrl(s1);
            _verifiedDomainVw.showImage(true);
        } else
        {
            _verifiedDomainVw.showImage(false);
        }
        if (BuyableProductHelper.isPinAvailable(_pin))
        {
            _verifiedDomainVw.setId(0x7f0f0018);
        }
        flag = BuyableProductHelper.isPinBuyable(_pin);
        if (ModelHelper.isValid(s))
        {
            i = 0x7f07033c;
        } else
        {
            i = -1;
        }
        if (!flag) goto _L7; else goto _L6
_L6:
        i = 0x7f07033b;
_L9:
        if (i != -1)
        {
            _verifiedDomainVw.setTitle(Resources.string(i));
        }
        if (flag)
        {
            _verifiedDomainVw.setSubTitle(_pin.getBuyableProduct().getMerchantName());
            return;
        }
        break; /* Loop/switch isn't completed */
_L7:
        if (_pin.isCSR())
        {
            i = 0x7f070339;
        } else
        if (_pinMetadata != null && (!(_pinMetadata instanceof BoostablePinMetadata) || !((BoostablePinMetadata)_pinMetadata).isFromAggregatedData().booleanValue()))
        {
            if (_pinMetadata instanceof Article)
            {
                i = 0x7f07033a;
            } else
            if (_pinMetadata instanceof Movie)
            {
                i = 0x7f07033d;
            } else
            if (_pinMetadata instanceof Recipe)
            {
                i = 0x7f07033f;
            } else
            if (BooleanUtils.isTrue(_pin.getHasPlace()))
            {
                i = 0x7f07033e;
            }
        }
        if (true) goto _L9; else goto _L8
_L8:
        s1 = VerifiedDomainUtil.getOfficialUserFullName(_pin);
        if (s1 != null)
        {
            _verifiedDomainVw.setSubTitle(s1);
            return;
        }
        if (ModelHelper.isValid(s))
        {
            _verifiedDomainVw.setSubTitle(s);
            return;
        } else
        {
            _verifiedDomainVw.setSubTitle(Resources.string(0x7f070340));
            return;
        }
    }




    private class _cls4
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final PinCloseupLinkModule this$0;

        public void onEventMainThread(com.pinterest.activity.task.education.view.EducationToolTipView.ClickthroughToolTipEvent clickthroughtooltipevent)
        {
            Events.unregister(_eventsSubscriber, new Class[] {
                com/pinterest/activity/task/education/view/EducationToolTipView$ClickthroughToolTipEvent
            });
            if (!StopWatch.get().isActive("clickthrough_verify"))
            {
                onWebsiteClick(null);
            }
        }

        _cls4()
        {
            this$0 = PinCloseupLinkModule.this;
            super();
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final PinCloseupLinkModule this$0;

        public void onClick(View view)
        {
            onVerifiedDomainClick(view);
        }

        _cls1()
        {
            this$0 = PinCloseupLinkModule.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final PinCloseupLinkModule this$0;

        public void onClick(View view)
        {
            onWebsiteClick(view);
        }

        _cls2()
        {
            this$0 = PinCloseupLinkModule.this;
            super();
        }
    }


    private class _cls3
        implements android.view.View.OnClickListener
    {

        final PinCloseupLinkModule this$0;

        public void onClick(View view)
        {
            onWebsiteClick(view);
        }

        _cls3()
        {
            this$0 = PinCloseupLinkModule.this;
            super();
        }
    }

}
