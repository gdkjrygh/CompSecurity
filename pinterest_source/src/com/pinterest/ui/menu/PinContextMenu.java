// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.menu;

import android.view.LayoutInflater;
import com.pinterest.activity.board.fragment.BoardFragment;
import com.pinterest.activity.category.fragment.CategoryFragment;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.Pin;
import com.pinterest.base.Constants;
import com.pinterest.experiment.Experiments;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.pinterest.ui.menu:
//            ContextMenu, ContextMenuItemView, ContextMenuView

public class PinContextMenu
    implements ContextMenu
{

    private static final int ARRANGE_INDEX_3[] = {
        1, 2, 0
    };
    private static final int ARRANGE_INDEX_4[] = {
        2, 1, 3, 0
    };
    private static final Set FEEDBACK_ENABLED_FRAGMENTS = new _cls1();
    private BaseFragment _fragment;
    private Pin _pin;

    public PinContextMenu()
    {
    }

    private List arrangeItems(List list)
    {
        int j = list.size();
        if (j != 3 && j != 4)
        {
            return list;
        }
        ArrayList arraylist = new ArrayList(j);
        int ai[];
        int i;
        if (j == 3)
        {
            ai = ARRANGE_INDEX_3;
        } else
        {
            ai = ARRANGE_INDEX_4;
        }
        for (i = 0; i < j; i++)
        {
            arraylist.add(list.get(ai[i]));
        }

        list.clear();
        return arraylist;
    }

    private ContextMenuItemView getEditView(LayoutInflater layoutinflater)
    {
        layoutinflater = (ContextMenuItemView)layoutinflater.inflate(0x7f030058, null);
        layoutinflater.setImage(0x7f020175);
        layoutinflater.setToolTip(0x7f07017e);
        layoutinflater.setVisibility(4);
        layoutinflater.setOnClickListener(new _cls6());
        return layoutinflater;
    }

    private ContextMenuItemView getHideView(final LayoutInflater view)
    {
        view = (ContextMenuItemView)view.inflate(0x7f030058, null);
        int i;
        if (Experiments.E())
        {
            i = 0x7f020179;
        } else
        {
            i = 0x7f020177;
        }
        view.setImage(i);
        view.setToolTip(0x7f07017f);
        view.setVisibility(4);
        view.setOnClickListener(new _cls4());
        return view;
    }

    private ContextMenuItemView getLikeView(LayoutInflater layoutinflater, boolean flag)
    {
        layoutinflater = (ContextMenuItemView)layoutinflater.inflate(0x7f030058, null);
        if (!flag)
        {
            layoutinflater.setImage(0x7f020178);
            layoutinflater.setToolTip(0x7f070180);
        } else
        {
            layoutinflater.setImage(0x7f02017e);
            layoutinflater.setToolTip(0x7f070184);
        }
        layoutinflater.setOnClickListener(new _cls5());
        layoutinflater.setVisibility(4);
        return layoutinflater;
    }

    private ContextMenuItemView getRepinView(LayoutInflater layoutinflater)
    {
        layoutinflater = (ContextMenuItemView)layoutinflater.inflate(0x7f030058, null);
        layoutinflater.setImage(0x7f02017b);
        layoutinflater.setToolTip(0x7f070181);
        layoutinflater.setVisibility(4);
        layoutinflater.setOnClickListener(new _cls2());
        return layoutinflater;
    }

    private ContextMenuItemView getSendView(LayoutInflater layoutinflater)
    {
        layoutinflater = (ContextMenuItemView)layoutinflater.inflate(0x7f030058, null);
        layoutinflater.setImage(0x7f02017c);
        layoutinflater.setToolTip(0x7f070183);
        layoutinflater.setVisibility(4);
        layoutinflater.setOnClickListener(new _cls3());
        return layoutinflater;
    }

    private ContextMenuItemView getVisitSiteView(LayoutInflater layoutinflater)
    {
        layoutinflater = (ContextMenuItemView)layoutinflater.inflate(0x7f030058, null);
        layoutinflater.setImage(0x7f02017f);
        layoutinflater.setToolTip(0x7f070185);
        layoutinflater.setVisibility(4);
        layoutinflater.setOnClickListener(new _cls7());
        return layoutinflater;
    }

    private boolean isFeedbackSupported(boolean flag)
    {
        if (_fragment == null)
        {
            return false;
        }
        if (_fragment instanceof BoardFragment)
        {
            return !flag;
        }
        if (_fragment instanceof CategoryFragment)
        {
            return !((CategoryFragment)_fragment).isLocalCategory();
        } else
        {
            return FEEDBACK_ENABLED_FRAGMENTS.contains(_fragment.getClass());
        }
    }

    public void setFragment(BaseFragment basefragment)
    {
        _fragment = basefragment;
    }

    public void show(ContextMenuView contextmenuview, Pin pin)
    {
        if (pin == null)
        {
            return;
        }
        _pin = pin;
        ArrayList arraylist = new ArrayList(3);
        LayoutInflater layoutinflater = LayoutInflater.from(contextmenuview.getContext());
        arraylist.add(getRepinView(layoutinflater));
        boolean flag = MyUser.isUserMe(pin.getUserUid());
        boolean flag1 = pin.isSecret();
        boolean flag2 = Constants.isTrue(pin.getLiked());
        if (!pin.isCSR())
        {
            ContextMenuItemView contextmenuitemview;
            if (flag)
            {
                contextmenuitemview = getEditView(layoutinflater);
            } else
            {
                contextmenuitemview = getLikeView(layoutinflater, flag2);
            }
            arraylist.add(contextmenuitemview);
            if (!flag1)
            {
                arraylist.add(getSendView(layoutinflater));
            }
        }
        if (pin.isCSR())
        {
            arraylist.add(getVisitSiteView(layoutinflater));
        }
        if (Experiments.c(true) && isFeedbackSupported(flag))
        {
            arraylist.add(getHideView(layoutinflater));
        }
        contextmenuview.addMenuOptions(arrangeItems(arraylist));
        contextmenuview.show();
    }

    public volatile void show(ContextMenuView contextmenuview, Object obj)
    {
        show(contextmenuview, (Pin)obj);
    }




    private class _cls6
        implements android.view.View.OnClickListener
    {

        final PinContextMenu this$0;

        public void onClick(View view)
        {
            Pinalytics.a(ElementType.PIN_EDIT_BUTTON, ComponentType.CONTEXTUAL_MENU, _pin.getUid());
            view = view.getContext();
            if (view != null)
            {
                Intent intent = ActivityHelper.getPinEditIntent(view);
                intent.putExtra("com.pinterest.EXTRA_PIN_ID", _pin.getUid());
                view.startActivity(intent);
            }
        }

        _cls6()
        {
            this$0 = PinContextMenu.this;
            super();
        }
    }


    private class _cls4
        implements android.view.View.OnClickListener
    {

        final PinContextMenu this$0;
        final ContextMenuItemView val$view;

        public void onClick(View view1)
        {
            if (StringUtils.isNotEmpty(_pin.getUid()))
            {
                Pinalytics.a(ElementType.PIN_HIDE_BUTTON, ComponentType.CONTEXTUAL_MENU);
                PinFeedbackBase.get(view.getContext(), _pin, _fragment).showFeedBack();
            }
        }

        _cls4()
        {
            this$0 = PinContextMenu.this;
            view = contextmenuitemview;
            super();
        }
    }


    private class _cls5
        implements android.view.View.OnClickListener
    {

        final PinContextMenu this$0;

        public void onClick(View view)
        {
            int i = 1;
            view = ModelHelper.getPin(_pin.getUid());
            boolean flag;
            if (!Constants.isTrue(view.getLiked()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (view != null)
            {
                Pinalytics.a(ElementType.PIN_LIKE_BUTTON, ComponentType.CONTEXTUAL_MENU, _pin.getUid());
                view.setLiked(Boolean.valueOf(flag));
                int j = view.getLikeCountDisplay();
                class _cls1 extends com.pinterest.api.remote.PinApi.PinLikeApiResponse
                {

                    final _cls5 this$1;

                    public void onFailure(Throwable throwable, ApiResponse apiresponse)
                    {
                        super.onFailure(throwable, apiresponse);
                        if (_pin != null)
                        {
                            throwable = _pin;
                            int k;
                            boolean flag1;
                            if (!_pin.getLiked().booleanValue())
                            {
                                flag1 = true;
                            } else
                            {
                                flag1 = false;
                            }
                            throwable.setLiked(Boolean.valueOf(flag1));
                            throwable = _pin;
                            if (_pin.getLiked().booleanValue())
                            {
                                k = _pin.getLikeCountDisplay() + 1;
                            } else
                            {
                                k = _pin.getLikeCountDisplay() - 1;
                            }
                            throwable.setLikeCount(Integer.valueOf(k));
                            ModelHelper.setPin(_pin);
                        }
                    }

                    public void onSuccess(ApiResponse apiresponse)
                    {
                        super.onSuccess(apiresponse);
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

                _cls1(Pin pin)
                {
                    this$1 = _cls5.this;
                    super(pin);
                }
                }

                if (!flag)
                {
                    i = -1;
                }
                view.setLikeCount(Integer.valueOf(i + j));
                Events.post(new com.pinterest.api.model.Pin.UpdateEvent(view));
                PinApi.a(view.getUid(), flag, new _cls1(view));
            }
        }

        _cls5()
        {
            this$0 = PinContextMenu.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final PinContextMenu this$0;

        public void onClick(View view)
        {
            Pinalytics.a(ElementType.PIN_REPIN_BUTTON, ComponentType.CONTEXTUAL_MENU, _pin.getUid());
            Pin pin = _pin;
            if (_fragment != null)
            {
                view = _fragment.getApiTag();
            } else
            {
                view = null;
            }
            PinUtils.repinOrSavePin(pin, null, view);
        }

        _cls2()
        {
            this$0 = PinContextMenu.this;
            super();
        }
    }


    private class _cls3
        implements android.view.View.OnClickListener
    {

        final PinContextMenu this$0;

        public void onClick(View view)
        {
label0:
            {
                if (StringUtils.isNotEmpty(_pin.getUid()))
                {
                    Pinalytics.a(ElementType.SEND_BUTTON, ComponentType.CONTEXTUAL_MENU);
                    if (!Experiments.K())
                    {
                        break label0;
                    }
                    SendShareUtils.getInstance().postSendShareNavigation(_pin);
                }
                return;
            }
            SendPinActivity.startSendPin(view.getContext(), _pin.getUid());
        }

        _cls3()
        {
            this$0 = PinContextMenu.this;
            super();
        }
    }


    private class _cls7
        implements android.view.View.OnClickListener
    {

        final PinContextMenu this$0;

        public void onClick(View view)
        {
            Pinalytics.a(ElementType.WEBSITE_BUTTON, ComponentType.CONTEXTUAL_MENU, _pin.getUid());
            if (view.getContext() != null)
            {
                ClickThroughUtil.gotoPinLink(_pin.getClickThroughUrl(), _pin, null);
            }
        }

        _cls7()
        {
            this$0 = PinContextMenu.this;
            super();
        }
    }


    private class _cls1 extends HashSet
    {

        _cls1()
        {
            add(com/pinterest/activity/dynamicgrid/DynamicGridFragment);
            add(com/pinterest/activity/home/HomeFragment);
            add(com/pinterest/activity/interest/InterestFragment);
            add(com/pinterest/activity/search/GuidedSearchFragment);
        }
    }

}
