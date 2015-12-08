// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view;

import android.content.Context;
import android.content.res.Configuration;
import android.support.v4.app.FragmentManager;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.pinterest.activity.FragmentHelper;
import com.pinterest.activity.commerce.util.CommerceHelper;
import com.pinterest.activity.pin.view.modules.PinCloseUpPromotedModule;
import com.pinterest.activity.pin.view.modules.PinCloseupAggregatedModule;
import com.pinterest.activity.pin.view.modules.PinCloseupAttributionModule;
import com.pinterest.activity.pin.view.modules.PinCloseupBaseModule;
import com.pinterest.activity.pin.view.modules.PinCloseupBasicModule;
import com.pinterest.activity.pin.view.modules.PinCloseupCommerceModule;
import com.pinterest.activity.pin.view.modules.PinCloseupCsrAttributionModule;
import com.pinterest.activity.pin.view.modules.PinCloseupFollowModule;
import com.pinterest.activity.pin.view.modules.PinCloseupGalleryModule;
import com.pinterest.activity.pin.view.modules.PinCloseupImageModule;
import com.pinterest.activity.pin.view.modules.PinCloseupLinkModule;
import com.pinterest.activity.pin.view.modules.PinCloseupMovieModule;
import com.pinterest.activity.pin.view.modules.PinCloseupNewPlaceModule;
import com.pinterest.activity.pin.view.modules.PinCloseupPlaceModule;
import com.pinterest.activity.pin.view.modules.PinCloseupPriceModule;
import com.pinterest.activity.pin.view.modules.PinCloseupRecipeModule;
import com.pinterest.activity.pin.view.modules.PinCloseupSourceDescriptionModule;
import com.pinterest.activity.pin.view.modules.PinCloseupSourceModule;
import com.pinterest.activity.pin.view.modules.PinCloseupStatsModule;
import com.pinterest.activity.pin.view.modules.PinCloseupTitleModule;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.Pin;
import com.pinterest.api.remote.CSRApi;
import com.pinterest.api.remote.PinApi;
import com.pinterest.base.Device;
import com.pinterest.base.Events;
import com.pinterest.education.EducationHelper;
import com.pinterest.experiment.Experiments;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.pinterest.activity.pin.view:
//            PinCloseupVariantSelector, PinCloseupAccessoryActionBar

public class PinCloseupView extends LinearLayout
{

    private PinCloseupAccessoryActionBar _accessoryBar;
    private String _apiTag;
    private PinCloseupGalleryModule _closeupGalleryModule;
    private PinCloseupImageModule _closeupImageModule;
    private boolean _detailsLoaded;
    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    private boolean _firstLoad;
    private FragmentManager _fragmentManager;
    private Pin _pin;
    private String _pinUid;
    private ArrayList _subViews;
    private com.pinterest.api.remote.PinApi.PinApiResponse onPinLoaded;

    public PinCloseupView(Context context)
    {
        this(context, null);
    }

    public PinCloseupView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        _detailsLoaded = false;
        onPinLoaded = new _cls1();
        _eventsSubscriber = new _cls2();
        init();
    }

    private void init()
    {
        updatePadding();
        setOrientation(1);
        setBackgroundColor(-1);
        _firstLoad = true;
    }

    private void loadData()
    {
        if (!_firstLoad || !ModelHelper.isValid(_pinUid))
        {
            return;
        }
        if (_pin.isCSR())
        {
            CSRApi.a(_pinUid, MyUser.hasAccessToken(), onPinLoaded, _apiTag);
        } else
        {
            PinApi.a(_pinUid, MyUser.hasAccessToken(), onPinLoaded, _apiTag);
        }
        _firstLoad = false;
    }

    private void updatePadding()
    {
        int i = (int)((Device.getScreenWidth() - (float)FragmentHelper.getCloseupWidth()) / 2.0F);
        setPadding(i, 0, i, 0);
    }

    private void updateView()
    {
        if (_subViews == null)
        {
            Object obj = getContext();
            _subViews = new ArrayList();
            _subViews.add(new PinCloseupSourceModule(((Context) (obj))));
            if (CommerceHelper.isCommerceEnabled())
            {
                _subViews.add(new PinCloseupPriceModule(((Context) (obj))));
            }
            _subViews.add(new PinCloseupTitleModule(((Context) (obj))));
            if (Experiments.u() || CommerceHelper.isCommerceEnabled())
            {
                _closeupGalleryModule = new PinCloseupGalleryModule(((Context) (obj)));
                _subViews.add(_closeupGalleryModule);
            } else
            {
                _closeupImageModule = new PinCloseupImageModule(((Context) (obj)));
                _subViews.add(_closeupImageModule);
            }
            if (CommerceHelper.isCommerceEnabled())
            {
                _subViews.add(new PinCloseupVariantSelector(((Context) (obj))));
            }
            _subViews.add(new PinCloseupLinkModule(((Context) (obj))));
            if (!EducationHelper.c() && !EducationHelper.d())
            {
                _subViews.add(new PinCloseupFollowModule(((Context) (obj))));
            }
            if (CommerceHelper.isCommerceEnabled())
            {
                _subViews.add(new PinCloseupCommerceModule(((Context) (obj))));
            }
            if (!EducationHelper.c() && !EducationHelper.d())
            {
                _subViews.add(new PinCloseupSourceDescriptionModule(((Context) (obj))));
                _subViews.add(new PinCloseupAttributionModule(((Context) (obj))));
                _subViews.add(new PinCloseupRecipeModule(((Context) (obj))));
                _subViews.add(new PinCloseupMovieModule(((Context) (obj))));
                _subViews.add(new PinCloseupNewPlaceModule(((Context) (obj)), _apiTag));
                _subViews.add(new PinCloseupPlaceModule(((Context) (obj))));
                PinCloseupBaseModule pincloseupbasemodule;
                if (Experiments.P() && !_pin.isCSR())
                {
                    _subViews.add(new PinCloseupAggregatedModule(((Context) (obj))));
                } else
                {
                    _subViews.add(new PinCloseupBasicModule(((Context) (obj))));
                    _subViews.add(new PinCloseupStatsModule(((Context) (obj))));
                }
                _subViews.add(new PinCloseupCsrAttributionModule(((Context) (obj))));
                _subViews.add(new PinCloseUpPromotedModule(((Context) (obj))));
            }
            _accessoryBar = new PinCloseupAccessoryActionBar(((Context) (obj)));
            _subViews.add(_accessoryBar);
            for (obj = _subViews.iterator(); ((Iterator) (obj)).hasNext(); addView(pincloseupbasemodule, -1, -2))
            {
                pincloseupbasemodule = (PinCloseupBaseModule)((Iterator) (obj)).next();
                pincloseupbasemodule.setApiTag(_apiTag);
            }

        }
        for (Iterator iterator = _subViews.iterator(); iterator.hasNext(); ((PinCloseupBaseModule)iterator.next()).setPin(_pin, _detailsLoaded)) { }
    }

    public void checkForCardBeginView(int i)
    {
        if (_subViews != null)
        {
            Iterator iterator = _subViews.iterator();
            while (iterator.hasNext()) 
            {
                ((PinCloseupBaseModule)iterator.next()).checkForBeginView(i);
            }
        }
    }

    public boolean detailsLoaded()
    {
        return _detailsLoaded;
    }

    public void endView()
    {
        if (_subViews != null)
        {
            Iterator iterator = _subViews.iterator();
            while (iterator.hasNext()) 
            {
                ((PinCloseupBaseModule)iterator.next()).endView();
            }
        }
    }

    public PinCloseupAccessoryActionBar getAccessoryActionBar()
    {
        return _accessoryBar;
    }

    public PinCloseupGalleryModule getCloseupGalleryModule()
    {
        return _closeupGalleryModule;
    }

    public PinCloseupImageModule getCloseupImageModule()
    {
        return _closeupImageModule;
    }

    public FragmentManager getFragmentManager()
    {
        return _fragmentManager;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        loadData();
        Events.register(_eventsSubscriber, com/pinterest/api/model/Pin$UpdateEvent, new Class[] {
            com/pinterest/api/model/Comment$CreateEvent, com/pinterest/api/model/Comment$UpdateEvent
        });
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        updatePadding();
    }

    protected void onDetachedFromWindow()
    {
        Events.unregister(_eventsSubscriber);
        _fragmentManager = null;
        removeAllViews();
        super.onDetachedFromWindow();
    }

    public void setApiTag(String s)
    {
        _apiTag = s;
    }

    public void setFragmentManager(FragmentManager fragmentmanager)
    {
        _fragmentManager = fragmentmanager;
    }

    public void setPin(Pin pin)
    {
        if (pin == null)
        {
            return;
        } else
        {
            _pin = pin;
            _pinUid = _pin.getUid();
            loadData();
            updateView();
            return;
        }
    }


/*
    static boolean access$002(PinCloseupView pincloseupview, boolean flag)
    {
        pincloseupview._detailsLoaded = flag;
        return flag;
    }

*/





    private class _cls1 extends com.pinterest.api.remote.PinApi.PinApiResponse
    {

        final PinCloseupView this$0;

        public void onSuccess(Pin pin)
        {
            _detailsLoaded = true;
            setPin(pin);
            HashMap hashmap = new HashMap();
            hashmap.put("pin_id", pin.getUid());
            class _cls1 extends com.pinterest.api.remote.ExperiencesApi.ExperienceResponseHandler
            {

                final _cls1 this$1;

                public void onSuccess()
                {
                    Events.post(new com.pinterest.activity.pin.fragment.PinSwipeFragment.PinSwipeProfXEvent(_pin));
                }

                _cls1()
                {
                    this$1 = _cls1.this;
                    super();
                }
            }

            ExperiencesApi.a(String.valueOf(Placement.ANDROID_PIN_CLOSEUP_TAKEOVER.getValue()), hashmap, new _cls1(), _apiTag);
        }

        _cls1()
        {
            this$0 = PinCloseupView.this;
            super();
        }
    }


    private class _cls2
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final PinCloseupView this$0;

        public void onEventMainThread(com.pinterest.api.model.Comment.CreateEvent createevent)
        {
            if (!createevent.getComment().getPinUid().equals(_pinUid))
            {
                return;
            } else
            {
                _pin.setCommentCount(Integer.valueOf(_pin.getCommentCountDisplay() + 1));
                updateView();
                return;
            }
        }

        public void onEventMainThread(com.pinterest.api.model.Comment.UpdateEvent updateevent)
        {
            if (!updateevent.getComment().getPinUid().equals(_pinUid) || !updateevent.wasDeleted())
            {
                return;
            } else
            {
                _pin.setCommentCount(Integer.valueOf(_pin.getCommentCountDisplay() - 1));
                updateView();
                return;
            }
        }

        public void onEventMainThread(com.pinterest.api.model.Pin.UpdateEvent updateevent)
        {
            if (!updateevent.getPin().getUid().equals(_pinUid))
            {
                return;
            } else
            {
                setPin(updateevent.getPin());
                return;
            }
        }

        _cls2()
        {
            this$0 = PinCloseupView.this;
            super();
        }
    }

}
