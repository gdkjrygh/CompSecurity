// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.internal.view.menu.MenuBuilder;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.ListPopupWindow;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;
import com.pinterest.activity.ActivityHelper;
import com.pinterest.activity.DialogHelper;
import com.pinterest.activity.commerce.util.BuyableProductHelper;
import com.pinterest.activity.pin.view.modules.PinCloseupBaseModule;
import com.pinterest.activity.sendapin.SendPinActivity;
import com.pinterest.activity.sendshare.util.SendShareUtils;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.adapter.IconTextListAdapter;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.Pin;
import com.pinterest.api.remote.PinApi;
import com.pinterest.base.Colors;
import com.pinterest.base.Constants;
import com.pinterest.base.Events;
import com.pinterest.base.SocialUtils;
import com.pinterest.base.StopWatch;
import com.pinterest.education.EducationHelper;
import com.pinterest.events.VariantUpdatedEvent;
import com.pinterest.experiment.Experiments;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.utils.DrawableUtils;
import com.pinterest.kit.utils.PinUtils;
import com.pinterest.reporting.CrashReporting;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PinCloseupAccessoryActionBar extends PinCloseupBaseModule
    implements android.support.v7.widget.ActionMenuView.OnMenuItemClickListener, android.support.v7.widget.Toolbar.OnMenuItemClickListener, android.view.View.OnClickListener
{

    private Toolbar _actionBar;
    private View _buyItButton;
    private View _divider;
    private MenuItem _editMenuItem;
    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    private String _imageSignature;
    private ActionMenuView _leftMenu;
    private MenuItem _likeMenuItem;
    private ListPopupWindow _overflowPoup;
    private Pin _pin;
    private View _pinItButton;
    private ActionMenuView _rightMenu;
    private MenuItem _sendMenuItem;
    private MenuItem _shareMenuItem;
    private ListPopupWindow _sharePopup;

    public PinCloseupAccessoryActionBar(Context context)
    {
        this(context, null);
    }

    public PinCloseupAccessoryActionBar(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PinCloseupAccessoryActionBar(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        _eventsSubscriber = new _cls5();
    }

    private void ensureOverflowPopup()
    {
        if (_overflowPoup != null)
        {
            return;
        }
        MenuBuilder menubuilder = new MenuBuilder(getContext());
        (new MenuInflater(getContext())).inflate(0x7f10000b, menubuilder);
        final IconTextListAdapter adapter = new IconTextListAdapter();
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        int i = 0;
        for (int j = menubuilder.size(); i < j; i++)
        {
            MenuItem menuitem = menubuilder.getItem(i);
            if ((!MyUser.hasAccessToken() || menuitem.getItemId() != 0x7f0f0513) && (MyUser.hasAccessToken() || menuitem.getItemId() != 0x7f0f0515))
            {
                arraylist.add(new com.pinterest.adapter.IconTextListAdapter.IconText(null, String.valueOf(menuitem.getTitle()), null));
                arraylist1.add(Integer.valueOf(menuitem.getItemId()));
            }
        }

        adapter.setDataSource(arraylist);
        adapter.setIds(arraylist1);
        _overflowPoup = new ListPopupWindow(getContext());
        _overflowPoup.setAdapter(adapter);
        _overflowPoup.setAnchorView(_actionBar.findViewById(0x7f0f051a));
        _overflowPoup.setModal(true);
        _overflowPoup.setContentWidth((int)Resources.dimension(0x7f0a0166));
        _overflowPoup.setOnItemClickListener(new _cls4());
    }

    private void ensureSharePopup()
    {
        if (_sharePopup != null)
        {
            return;
        } else
        {
            View view = _actionBar.findViewById(0x7f0f0519);
            _sharePopup = new ListPopupWindow(getContext());
            final IconTextListAdapter adapter = new IconTextListAdapter();
            List list = SocialUtils.getAppListForShare();
            list.add(new com.pinterest.adapter.IconTextListAdapter.IconText(null, Resources.string(0x7f0704fb), null));
            adapter.setDataSource(list);
            _sharePopup.setAdapter(adapter);
            _sharePopup.setAnchorView(view);
            _sharePopup.setModal(true);
            _sharePopup.setContentWidth((int)Resources.dimension(0x7f0a0166));
            _sharePopup.setOnItemClickListener(new _cls3());
            return;
        }
    }

    private void onBuyItClicked()
    {
        onBuyItClicked(null);
    }

    private void onBuyItClicked(com.pinterest.api.model.BuyableProduct.Variant variant)
    {
        Object obj = null;
        String s = obj;
        if (variant != null)
        {
            variant = variant.getVariant();
            s = obj;
            if (variant.containsKey("colors"))
            {
                s = (String)variant.get("colors");
            }
        }
        Pinalytics.a(ElementType.BUY_BUTTON, ComponentType.MODAL_PIN, _pin.getUid());
        StopWatch.get().start("buy_it_clicked");
        variant = new Navigation(Location.COMMERCE_CHECKOUT, _pin);
        variant.putExtra("colors", s);
        Events.post(variant);
    }

    private void onEditClicked()
    {
        Intent intent = ActivityHelper.getPinEditIntent(getContext());
        intent.putExtra("com.pinterest.EXTRA_PIN_ID", _pin.getUid());
        ((Activity)getContext()).startActivityForResult(intent, 10300);
    }

    private void onLikeClicked()
    {
        int i = 1;
        Pin pin = _pin;
        int j;
        boolean flag;
        if (_pin.getLiked() != Boolean.TRUE)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        pin.setLiked(Boolean.valueOf(flag));
        pin = _pin;
        j = _pin.getLikeCountDisplay();
        if (!_pin.getLiked().booleanValue())
        {
            i = -1;
        }
        pin.setLikeCount(Integer.valueOf(i + j));
        Events.post(new com.pinterest.api.model.Pin.UpdateEvent(_pin));
        updateView();
        Pinalytics.a(ElementType.PIN_LIKE_BUTTON, ComponentType.MODAL_PIN, _pin.getUid());
        PinApi.a(_pin.getUid(), _pin.getLiked().booleanValue(), new _cls2(_pin));
    }

    private void onLoginClicked()
    {
        Pinalytics.a(ElementType.LOGIN_BUTTON, ComponentType.NAVIGATION);
        DialogHelper.goLogin();
    }

    private void onOverflowClicked()
    {
        Pinalytics.a(ElementType.MENU_BUTTON, ComponentType.NAVIGATION);
        ensureOverflowPopup();
        _overflowPoup.show();
    }

    private void onPinItClicked()
    {
        Pinalytics.a(ElementType.PIN_REPIN_BUTTON, ComponentType.MODAL_PIN, _pin.getUid());
        PinUtils.repinOrSavePin(_pin, _imageSignature, _apiTag);
    }

    private void onSendClicked()
    {
        Pinalytics.a(ElementType.PIN_SEND_BUTTON, ComponentType.NAVIGATION);
        if (Experiments.K())
        {
            SendShareUtils.getInstance().postSendShareNavigation(_pin);
            return;
        } else
        {
            SendPinActivity.startSendPin(getContext(), _pin.getUid());
            return;
        }
    }

    private void onShareClicked()
    {
        Pinalytics.a(ElementType.PIN_SHARE, ComponentType.NAVIGATION);
        ensureSharePopup();
        _sharePopup.show();
    }

    private void onShareMoreClicked()
    {
        Pinalytics.a(ElementType.SHARE_SOCIAL_BUTTON, ComponentType.NAVIGATION, "more");
        SocialUtils.startShare(getContext(), _pin);
    }

    private void onSignupClicked()
    {
        Pinalytics.a(ElementType.SIGNUP_BUTTON, ComponentType.NAVIGATION);
        DialogHelper.goSignup();
    }

    public void beginView()
    {
    }

    public void endView()
    {
    }

    public View getBuyItButton()
    {
        return _buyItButton;
    }

    protected ComponentType getComponentType()
    {
        return ComponentType.PIN_CLOSEUP_BODY;
    }

    public View getPinItButton()
    {
        return _pinItButton;
    }

    protected boolean hasContent()
    {
        return true;
    }

    protected void init()
    {
        setOrientation(1);
        _divider = new View(getContext());
        _divider.setBackgroundColor(Resources.color(0x7f0e0074));
        addView(_divider, -1, Constants.HAIRLINE);
        _actionBar = new Toolbar(getContext(), null, 0x7f0b0078);
        _actionBar.setBackgroundColor(Resources.color(0x7f0e000a));
        _actionBar.setMinimumHeight(Constants.ACTIONBAR_HEIGHT);
        addView(_actionBar, -1, Constants.ACTIONBAR_HEIGHT);
        if (MyUser.hasAccessToken())
        {
            MenuInflater menuinflater = ((Activity)getContext()).getMenuInflater();
            int i = (int)Resources.dimension(0x7f0a0187);
            if (!EducationHelper.c() && !EducationHelper.d())
            {
                _leftMenu = new ActionMenuView(getContext());
                menuinflater.inflate(0x7f10000d, _leftMenu.getMenu());
                _leftMenu.setOnMenuItemClickListener(this);
                _leftMenu.setPadding(i, 0, 0, 0);
                _actionBar.addView(_leftMenu);
                DrawableUtils.tintMenu(_leftMenu.getMenu(), 0x7f0e006d);
            }
            _rightMenu = new ActionMenuView(getContext());
            menuinflater.inflate(0x7f10000e, _rightMenu.getMenu());
            _rightMenu.setPadding(0, 0, i, 0);
            _actionBar.addView(_rightMenu);
            DrawableUtils.tintMenu(_rightMenu.getMenu(), 0x7f0e006d);
            _pinItButton = _actionBar.findViewById(0x7f0f0305);
            _buyItButton = _actionBar.findViewById(0x7f0f04b8);
            _buyItButton.setVisibility(8);
            _pinItButton.setOnClickListener(this);
            _buyItButton.setOnClickListener(this);
        } else
        {
            _actionBar.setPadding(Constants.MARGIN, 0, 0, 0);
            _actionBar.setTitle(0x7f070333);
            _actionBar.setSubtitle(0x7f070313);
            _actionBar.inflateMenu(0x7f10000f);
            _actionBar.findViewById(0x7f0f014b).setOnClickListener(this);
            _actionBar.findViewById(0x7f0f051a).setOnClickListener(this);
        }
        _actionBar.setOnMenuItemClickListener(this);
        DrawableUtils.tintToolbarIcons(_actionBar, 0x7f0e006d, false);
        updateView();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        Events.register(_eventsSubscriber, com/pinterest/activity/pin/view/modules/PinCloseupGalleryModule$GalleryClickedEvent, new Class[] {
            com/pinterest/activity/pin/view/modules/PinCloseupGalleryModule$GalleryUpdatedEvent, com/pinterest/events/VariantUpdatedEvent, com/pinterest/activity/task/education/view/EducationToolTipView$PinItToolTipEvent, com/pinterest/activity/task/education/view/EducationToolTipView$BuyItToolTipEvent
        });
    }

    public void onClick(View view)
    {
        if (_pin == null)
        {
            return;
        }
        switch (view.getId())
        {
        default:
            return;

        case 2131689803: 
            onSignupClicked();
            return;

        case 2131690245: 
            onPinItClicked();
            return;

        case 2131690680: 
            onBuyItClicked();
            return;

        case 2131690778: 
            onOverflowClicked();
            break;
        }
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        if (_overflowPoup != null)
        {
            _overflowPoup.dismiss();
        }
        if (_sharePopup != null)
        {
            _sharePopup.dismiss();
        }
        post(new _cls1());
    }

    protected void onDetachedFromWindow()
    {
        Events.unregister(_eventsSubscriber);
        super.onDetachedFromWindow();
    }

    public boolean onFilterTouchEventForSecurity(MotionEvent motionevent)
    {
        boolean flag1 = true;
        boolean flag = flag1;
        if ((motionevent.getFlags() & 1) != 0)
        {
            flag = flag1;
            if (BuyableProductHelper.isPinAvailable(_pin))
            {
                flag = flag1;
                if (BuyableProductHelper.isPointInsideView(motionevent.getRawX(), motionevent.getRawY(), _buyItButton))
                {
                    Toast.makeText(getContext(), 0x7f070160, 1).show();
                    motionevent.setAction(3);
                    CrashReporting.a(new IllegalStateException("Buy button tap-jacking prevented."));
                    flag = false;
                }
            }
        }
        return flag;
    }

    public boolean onMenuItemClick(MenuItem menuitem)
    {
        if (_pin == null)
        {
            return false;
        }
        menuitem.getItemId();
        JVM INSTR tableswitch 2131690774 2131690779: default 52
    //                   2131690774 54
    //                   2131690775 61
    //                   2131690776 68
    //                   2131690777 75
    //                   2131690778 82
    //                   2131690779 89;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        return true;
_L2:
        onEditClicked();
        continue; /* Loop/switch isn't completed */
_L3:
        onLikeClicked();
        continue; /* Loop/switch isn't completed */
_L4:
        onSendClicked();
        continue; /* Loop/switch isn't completed */
_L5:
        onShareClicked();
        continue; /* Loop/switch isn't completed */
_L6:
        onOverflowClicked();
        continue; /* Loop/switch isn't completed */
_L7:
        onPinItClicked();
        if (true) goto _L1; else goto _L8
_L8:
    }

    public void setPin(Pin pin, boolean flag)
    {
        _pin = pin;
        updateView();
    }

    protected boolean shouldUpdateView()
    {
        return true;
    }

    protected void updateView()
    {
        boolean flag1 = true;
        if (_pin != null && _actionBar != null)
        {
            if (_shareMenuItem == null && _leftMenu != null)
            {
                _shareMenuItem = _leftMenu.getMenu().findItem(0x7f0f0519);
            }
            boolean flag;
            if (_shareMenuItem != null)
            {
                Object obj = _shareMenuItem;
                if (!Experiments.K() && !_pin.isSecret() && !_pin.isCSR())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                ((MenuItem) (obj)).setVisible(flag);
            }
            if (_sendMenuItem == null && _leftMenu != null)
            {
                _sendMenuItem = _leftMenu.getMenu().findItem(0x7f0f0518);
            }
            if (_sendMenuItem != null)
            {
                obj = _sendMenuItem;
                if (!_pin.isSecret() && !_pin.isCSR())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                ((MenuItem) (obj)).setVisible(flag);
            }
            if (_editMenuItem == null && _leftMenu != null)
            {
                _editMenuItem = _leftMenu.getMenu().findItem(0x7f0f0516);
            }
            if (_editMenuItem != null)
            {
                _editMenuItem.setVisible(MyUser.isUserMe(_pin.getUser()));
            }
            if (_likeMenuItem == null && _leftMenu != null)
            {
                _likeMenuItem = _leftMenu.getMenu().findItem(0x7f0f0517);
            }
            if (_likeMenuItem != null)
            {
                obj = _likeMenuItem;
                if (!MyUser.isUserMe(_pin.getUser()) && !_pin.isCSR())
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
                ((MenuItem) (obj)).setVisible(flag);
            }
            if (_likeMenuItem != null)
            {
                obj = _likeMenuItem;
                int i;
                if (_pin.getLiked() == Boolean.TRUE)
                {
                    i = Colors.RED;
                } else
                {
                    i = Colors.GRAY_SOLID;
                }
                DrawableUtils.tintIcon(((MenuItem) (obj)), i);
            }
            if (BuyableProductHelper.isPinBuyable(_pin))
            {
                obj = BuyableProductHelper.getPriceTitleType(_pin.getBuyableProduct());
                switch (_cls6..SwitchMap.com.pinterest.activity.commerce.util.BuyableProductHelper.PriceTitleType[((com.pinterest.activity.commerce.util.BuyableProductHelper.PriceTitleType) (obj)).ordinal()])
                {
                default:
                    return;

                case 1: // '\001'
                case 2: // '\002'
                    if (BuyableProductHelper.buyableProductReady(_pin.getBuyableProduct()))
                    {
                        _buyItButton.setVisibility(0);
                        return;
                    } else
                    {
                        _buyItButton.setVisibility(8);
                        return;
                    }

                case 3: // '\003'
                case 4: // '\004'
                    _buyItButton.setVisibility(8);
                    return;
                }
            }
        }
    }











/*
    static String access$702(PinCloseupAccessoryActionBar pincloseupaccessoryactionbar, String s)
    {
        pincloseupaccessoryactionbar._imageSignature = s;
        return s;
    }

*/



    private class _cls5
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final PinCloseupAccessoryActionBar this$0;

        public void onEventMainThread(com.pinterest.activity.pin.view.modules.PinCloseupGalleryModule.GalleryClickedEvent galleryclickedevent)
        {
            if (!galleryclickedevent.isEventForPin(_pin))
            {
                return;
            } else
            {
                onBuyItClicked(galleryclickedevent.getVariant());
                return;
            }
        }

        public void onEventMainThread(com.pinterest.activity.pin.view.modules.PinCloseupGalleryModule.GalleryUpdatedEvent galleryupdatedevent)
        {
            galleryupdatedevent = galleryupdatedevent.getGallerySelectedItem();
            if (_pin == null || !galleryupdatedevent.getPin().getUid().equals(_pin.getUid()))
            {
                return;
            } else
            {
                _imageSignature = galleryupdatedevent.getImageSignature();
                return;
            }
        }

        public void onEventMainThread(com.pinterest.activity.task.education.view.EducationToolTipView.BuyItToolTipEvent buyittooltipevent)
        {
            Events.unregister(_eventsSubscriber, new Class[] {
                com/pinterest/activity/task/education/view/EducationToolTipView$BuyItToolTipEvent
            });
            if (!StopWatch.get().isActive("buy_it_clicked"))
            {
                onBuyItClicked();
            }
        }

        public void onEventMainThread(com.pinterest.activity.task.education.view.EducationToolTipView.PinItToolTipEvent pinittooltipevent)
        {
            Events.unregister(_eventsSubscriber, new Class[] {
                com/pinterest/activity/task/education/view/EducationToolTipView$PinItToolTipEvent
            });
            if (!StopWatch.get().isActive("repin_dialog"))
            {
                onPinItClicked();
            }
        }

        public void onEventMainThread(VariantUpdatedEvent variantupdatedevent)
        {
            final com.pinterest.api.model.BuyableProduct.Variant variant = variantupdatedevent.a();
            if (variant == null || !variantupdatedevent.a(_pin))
            {
                return;
            }
            variantupdatedevent = BuyableProductHelper.getPriceTitleType(variant);
            switch (_cls6..SwitchMap.com.pinterest.activity.commerce.util.BuyableProductHelper.PriceTitleType[variantupdatedevent.ordinal()])
            {
            default:
                return;

            case 1: // '\001'
            case 2: // '\002'
                _buyItButton.setVisibility(0);
                class _cls1
                    implements android.view.View.OnClickListener
                {

                    final _cls5 this$1;
                    final com.pinterest.api.model.BuyableProduct.Variant val$variant;

                    public void onClick(View view)
                    {
                        onBuyItClicked(variant);
                    }

                _cls1()
                {
                    this$1 = _cls5.this;
                    variant = variant1;
                    super();
                }
                }

                _buyItButton.setOnClickListener(new _cls1());
                return;

            case 3: // '\003'
            case 4: // '\004'
                _buyItButton.setVisibility(8);
                break;
            }
        }

        _cls5()
        {
            this$0 = PinCloseupAccessoryActionBar.this;
            super();
        }
    }


    private class _cls4
        implements android.widget.AdapterView.OnItemClickListener
    {

        final PinCloseupAccessoryActionBar this$0;
        final IconTextListAdapter val$adapter;

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            if (i < 0 || i >= adapter.getCount()) goto _L2; else goto _L1
_L1:
            (int)l;
            JVM INSTR tableswitch 2131690771 2131690773: default 44
        //                       2131690771 65
        //                       2131690772 91
        //                       2131690773 75;
               goto _L2 _L3 _L4 _L5
_L2:
            if (_overflowPoup != null)
            {
                _overflowPoup.dismiss();
            }
            return;
_L3:
            onLoginClicked();
            continue; /* Loop/switch isn't completed */
_L5:
            SendShareUtils.getInstance().reportPin(_pin);
            continue; /* Loop/switch isn't completed */
_L4:
            SendShareUtils.getInstance().trySavePinImage((BaseActivity)getContext(), _pin);
            if (true) goto _L2; else goto _L6
_L6:
        }

        _cls4()
        {
            this$0 = PinCloseupAccessoryActionBar.this;
            adapter = icontextlistadapter;
            super();
        }
    }


    private class _cls3
        implements android.widget.AdapterView.OnItemClickListener
    {

        final PinCloseupAccessoryActionBar this$0;
        final IconTextListAdapter val$adapter;

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            if (i >= 0 && i < adapter.getCount())
            {
                if (i != adapter.getCount() - 1)
                {
                    adapterview = (com.pinterest.adapter.IconTextListAdapter.IconText)adapter.getItem(i);
                    view = ActivityHelper.getElementTypeByPackageName(((com.pinterest.adapter.IconTextListAdapter.IconText) (adapterview)).meta);
                    if (view == null)
                    {
                        Pinalytics.a(ElementType.SHARE_SOCIAL_BUTTON, ComponentType.MODAL_DIALOG, ((com.pinterest.adapter.IconTextListAdapter.IconText) (adapterview)).meta);
                    } else
                    {
                        Pinalytics.a(view, ComponentType.MODAL_DIALOG, _pin.getUid());
                    }
                    if (Experiments.L())
                    {
                        SocialUtils.shareWithInviteCode(getContext(), new SendableObject(_pin.getUid(), 0), ((com.pinterest.adapter.IconTextListAdapter.IconText) (adapterview)).meta, 
// JavaClassFileOutputException: get_constant: invalid tag

        _cls3()
        {
            this$0 = PinCloseupAccessoryActionBar.this;
            adapter = icontextlistadapter;
            super();
        }
    }


    private class _cls2 extends com.pinterest.api.remote.PinApi.PinLikeApiResponse
    {

        final PinCloseupAccessoryActionBar this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            onFailure(throwable, apiresponse);
            if (_pin != null)
            {
                throwable = _pin;
                int i;
                boolean flag;
                if (!_pin.getLiked().booleanValue())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                throwable.setLiked(Boolean.valueOf(flag));
                throwable = _pin;
                if (_pin.getLiked().booleanValue())
                {
                    i = _pin.getLikeCountDisplay() + 1;
                } else
                {
                    i = _pin.getLikeCountDisplay() - 1;
                }
                throwable.setLikeCount(Integer.valueOf(i));
                ModelHelper.setPin(_pin);
                updateView();
            }
        }

        public void onSuccess(ApiResponse apiresponse)
        {
            onSuccess(apiresponse);
            if (_pin != null)
            {
                if (_pin.getLiked().booleanValue())
                {
                    apiresponse = EventType.PIN_LIKE;
                } else
                {
                    apiresponse = EventType.PIN_UNLIKE;
                }
                Pinalytics.a(apiresponse, _pin.getUid(), _pin.getLoggingAuxData());
                ModelHelper.setPin(_pin);
            }
        }

        _cls2(Pin pin)
        {
            this$0 = PinCloseupAccessoryActionBar.this;
            super(pin);
        }
    }


    private class _cls1
        implements Runnable
    {

        final PinCloseupAccessoryActionBar this$0;

        public void run()
        {
            requestLayout();
        }

        _cls1()
        {
            this$0 = PinCloseupAccessoryActionBar.this;
            super();
        }
    }


    private class _cls6
    {

        static final int $SwitchMap$com$pinterest$activity$commerce$util$BuyableProductHelper$PriceTitleType[];

        static 
        {
            $SwitchMap$com$pinterest$activity$commerce$util$BuyableProductHelper$PriceTitleType = new int[com.pinterest.activity.commerce.util.BuyableProductHelper.PriceTitleType.values().length];
            try
            {
                $SwitchMap$com$pinterest$activity$commerce$util$BuyableProductHelper$PriceTitleType[com.pinterest.activity.commerce.util.BuyableProductHelper.PriceTitleType.NORMAL.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$pinterest$activity$commerce$util$BuyableProductHelper$PriceTitleType[com.pinterest.activity.commerce.util.BuyableProductHelper.PriceTitleType.ON_SALE.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$pinterest$activity$commerce$util$BuyableProductHelper$PriceTitleType[com.pinterest.activity.commerce.util.BuyableProductHelper.PriceTitleType.OUT_OF_STOCK.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$pinterest$activity$commerce$util$BuyableProductHelper$PriceTitleType[com.pinterest.activity.commerce.util.BuyableProductHelper.PriceTitleType.UNAVAILABLE.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
