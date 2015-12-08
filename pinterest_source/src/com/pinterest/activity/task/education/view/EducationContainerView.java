// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.education.view;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.util.Pair;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.pinterest.activity.home.events.PageChangedEvent;
import com.pinterest.activity.task.activity.MainActivity;
import com.pinterest.activity.task.education.event.EducationEvent;
import com.pinterest.activity.task.education.model.Education;
import com.pinterest.activity.task.education.model.EducationBackground;
import com.pinterest.activity.task.education.model.EducationButton;
import com.pinterest.activity.task.education.model.EducationForeground;
import com.pinterest.activity.task.education.model.EducationGradientText;
import com.pinterest.activity.task.education.model.EducationPulse;
import com.pinterest.activity.task.education.model.EducationStep;
import com.pinterest.activity.task.education.model.EducationToolTip;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.api.remote.ExperiencesApi;
import com.pinterest.base.Device;
import com.pinterest.base.Events;
import com.pinterest.education.EducationHelper;
import com.pinterest.experience.ExperienceValue;
import com.pinterest.experience.Experiences;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.log.PLog;
import com.pinterest.schemas.experiences.AndroidEducationAnchor;
import com.pinterest.schemas.experiences.ClientDestination;
import com.pinterest.schemas.experiences.Experience;
import com.pinterest.schemas.experiences.TooltipDisplayType;
import com.pinterest.ui.text.PTextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.pinterest.activity.task.education.view:
//            EducationTriggerView, EducationFlyoutView, EducationBackgroundView, EducationCardView, 
//            EducationPulseView, EducationToolTipView, EducationPulsarView, EducationPromptView

public class EducationContainerView extends RelativeLayout
{

    private static final long FIRST_PIN_EXP_DIMISS_VIEW = 1500L;
    private static final Integer PULSAR_POSITION_ANCHORS[];
    private static final Integer TRIGGER_REFRESH_EXPERIENCES[];
    private EducationBackgroundView _background;
    private EducationCardView _currentCard;
    private Education _currentEducation;
    private int _currentStep;
    private List _currentSteps;
    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    private EducationFlyoutView _flyout;
    private FrameLayout _foreground;
    private LinearLayout _gradientView;
    private BaseFragment _initFragment;
    private boolean _isActive;
    private boolean _isExpectingPageChange;
    private EducationPromptView _promptView;
    private EducationPulsarView _pulsar;
    private EducationPulseView _pulse;
    private EducationToolTip _toolTip;
    private EducationToolTipView _toolTipView;
    private EducationTriggerView _trigger;

    public EducationContainerView(Context context)
    {
        this(context, null);
    }

    public EducationContainerView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public EducationContainerView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        _currentSteps = Collections.emptyList();
        _eventsSubscriber = new _cls6();
        init();
    }

    private void changePromptViewText(final String title)
    {
        postDelayed(new _cls2(), 2000L);
    }

    private void dismiss()
    {
        dismissUi();
        if (_currentEducation == null)
        {
            return;
        }
        if (_currentEducation.getExperienceValue() != null)
        {
            _currentEducation.getExperienceValue().c();
        }
        Experiences.c(_currentEducation.getPid());
    }

    private void dismissUi()
    {
        if (EducationHelper.j())
        {
            Events.post(new com.pinterest.activity.flashlight.FlashlightResultsFragment.FlashlightEducationDismissedEvent());
        }
        hideContent();
        Events.unregister(_eventsSubscriber, new Class[] {
            com/pinterest/activity/task/model/Navigation, com/pinterest/activity/home/events/PageChangedEvent, com/pinterest/activity/task/view/MainViewPager$PageChangedEvent, com/pinterest/activity/pin/fragment/PinFragment$PinFragmentMoveAccessoryBarEvent, com/pinterest/activity/create/helper/CreateBoardHelper$BoardCreatedEvent, com/pinterest/activity/task/education/view/EducationContainerView$PositionPulsarEvent, com/pinterest/api/model/Pin$UpdateEvent, com/pinterest/activity/library/fragment/LibraryAllPinsFragment$ShowPulserEvent, com/pinterest/activity/library/fragment/LibraryAllPinsFragment$HidePulserEvent
        });
        _trigger.hide(null);
        _flyout.hide(null);
        Experiences.c().d();
    }

    private void handleNext()
    {
        _isExpectingPageChange = true;
        Object obj = (EducationStep)_currentSteps.get(_currentStep);
        final Object uri;
        final int destination;
        if (obj != null)
        {
            uri = ((EducationStep) (obj)).getForeground();
        } else
        {
            uri = null;
        }
        if (uri != null)
        {
            uri = ((EducationForeground) (uri)).getForward();
        } else
        {
            uri = null;
        }
        if (uri != null)
        {
            destination = ((EducationButton) (uri)).getDestination();
        } else
        {
            destination = 0;
        }
        if (uri != null)
        {
            uri = ((EducationButton) (uri)).getUri();
        } else
        {
            uri = null;
        }
        if (obj != null)
        {
            obj = ((EducationStep) (obj)).getBackground();
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            obj = ((EducationBackground) (obj)).getPulse();
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            obj = ((EducationPulse) (obj)).getAnchor();
        } else
        {
            obj = null;
        }
        if (destination != 0 || !TextUtils.isEmpty(((CharSequence) (uri))))
        {
            _background.setDefault(new _cls3());
            if (obj != null)
            {
                _currentCard.showSuccess(null);
            }
            return;
        }
        if (obj != null)
        {
            _currentCard.showSuccess(new _cls4());
            return;
        } else
        {
            showNextStep();
            return;
        }
    }

    private void handleStart(Education education, EducationEvent educationevent)
    {
        if (!education.isEmpty())
        {
            if (EducationHelper.g())
            {
                Events.post(new ShowShareExtensionEvent());
                return;
            }
            if (!_isActive)
            {
                if (education.isFlyout() && !education.isTriggered())
                {
                    _trigger.hide(null);
                    _flyout.setEvent(educationevent);
                    _flyout.show();
                    EducationHelper.a();
                    handleStartRegisterEvents();
                    return;
                }
                if (education.isAutomatic() || education.isTriggered())
                {
                    setEducation(education, educationevent);
                    handleStartRegisterEvents();
                    return;
                }
                if (education.getSteps().size() > 0)
                {
                    _trigger.setEvent(educationevent);
                    _trigger.show(null);
                    handleStartRegisterEvents();
                    return;
                }
            }
        }
    }

    private void handleStartRegisterEvents()
    {
        Events.register(_eventsSubscriber, com/pinterest/activity/task/model/Navigation, new Class[] {
            com/pinterest/activity/home/events/PageChangedEvent, com/pinterest/activity/task/view/MainViewPager$PageChangedEvent, com/pinterest/activity/pin/fragment/PinFragment$PinFragmentMoveAccessoryBarEvent, com/pinterest/activity/task/education/view/EducationContainerView$PositionPulsarEvent, com/pinterest/activity/library/fragment/LibraryAllPinsFragment$HidePulserEvent, com/pinterest/activity/library/fragment/LibraryAllPinsFragment$ShowPulserEvent
        });
        Events.registerSticky(_eventsSubscriber, com/pinterest/activity/create/helper/CreateBoardHelper$BoardCreatedEvent, new Class[0]);
    }

    private void hideContent()
    {
        Device.resetToDefaultOrientation((Activity)getContext());
        _isActive = false;
        removeCardViews();
        removeBackgroundViews();
        _pulse.setPulse(null);
        _initFragment = null;
        setBackgroundColor(Resources.color(0x7f0e00b0));
        _toolTipView.setVisibility(4);
        _gradientView.setVisibility(8);
        _pulsar.hidePulsar();
        _promptView.hidePrompt();
    }

    private void init()
    {
        _isActive = false;
        _isExpectingPageChange = false;
        Events.register(_eventsSubscriber, com/pinterest/activity/task/education/event/EducationEvent, new Class[0]);
        _background = new EducationBackgroundView(getContext());
        _background.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        addView(_background);
        _foreground = new FrameLayout(getContext());
        _foreground.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        addView(_foreground);
        _pulse = new EducationPulseView(getContext());
        addView(_pulse, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        _pulsar = new EducationPulsarView(getContext());
        addView(_pulsar, new android.widget.RelativeLayout.LayoutParams(-2, -2));
        _trigger = new EducationTriggerView(getContext());
        addView(_trigger, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        _flyout = new EducationFlyoutView(getContext());
        addView(_flyout, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        _toolTipView = new EducationToolTipView(getContext());
        addView(_toolTipView, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        _promptView = new EducationPromptView(getContext());
        addView(_promptView, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        _gradientView = new LinearLayout(getContext());
        LayoutInflater.from(getContext()).inflate(0x7f0301c9, _gradientView, true);
        _gradientView.setVisibility(8);
        addView(_gradientView, new android.widget.RelativeLayout.LayoutParams(-1, -1));
    }

    private boolean isScrollingToTarget(EducationStep educationstep)
    {
        if (_currentStep != 0)
        {
            return false;
        }
        if (educationstep.getBackground() != null)
        {
            educationstep = educationstep.getBackground().getAnchor();
        } else
        {
            educationstep = null;
        }
        if (educationstep == null)
        {
            return false;
        }
        BaseFragment basefragment = ((MainActivity)getContext()).getActiveFragment();
        educationstep = EducationPulseView.getTargetView((MainActivity)getContext(), educationstep);
        if (basefragment == null || educationstep == null)
        {
            return false;
        }
        if (basefragment.getScrollPosition().equals(new Pair(Integer.valueOf((int)educationstep.getX()), Integer.valueOf((int)educationstep.getY()))))
        {
            return false;
        } else
        {
            PLog.info("Scroll to the anchor target %d, %d ", new Object[] {
                Float.valueOf(educationstep.getX()), Float.valueOf(educationstep.getY())
            });
            basefragment.scrollTo((int)educationstep.getX(), (int)educationstep.getY());
            _currentStep = _currentStep - 1;
            postDelayed(new _cls5(), 300L);
            return true;
        }
    }

    private void performAction(int i, String s)
    {
        if (i != ClientDestination.HOME_FEED.getValue())
        {
            break MISSING_BLOCK_LABEL_70;
        }
        s = (Activity)getContext();
        if (s != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if ((s = s.findViewById(0x7f0f0086)) == null) goto _L1; else goto _L3
_L3:
        setClickable(true);
        s.onKeyLongPress(4, new KeyEvent(0, 4));
        Events.register(_eventsSubscriber, com/pinterest/activity/task/view/MainViewPager$PageStateEvent, new Class[0]);
        return;
        if (!TextUtils.isEmpty(s))
        {
            setClickable(true);
            Location.navigateUri(getContext(), s);
            Events.register(_eventsSubscriber, com/pinterest/activity/task/view/MainViewPager$PageStateEvent, new Class[0]);
            return;
        } else
        {
            showNextStep();
            return;
        }
    }

    private void removeBackgroundViews()
    {
        _background.setSteps(new ArrayList());
    }

    private void removeCardViews()
    {
        _foreground.removeAllViews();
    }

    private void safeCompleteExperience(Education education)
    {
        if (education != null && education.getExperienceValue() != null)
        {
            education.getExperienceValue().b();
        }
    }

    private void setUpGradientView()
    {
        _isActive = true;
        PTextView ptextview = (PTextView)_gradientView.findViewById(0x7f0f0474);
        PTextView ptextview1 = (PTextView)_gradientView.findViewById(0x7f0f0475);
        ptextview.setTypefaceId(com.pinterest.kit.utils.FontUtils.TypefaceId.BOLD);
        ptextview1.setTypefaceId(com.pinterest.kit.utils.FontUtils.TypefaceId.BOLD);
        ptextview.setText(_currentEducation.getGradientText().titleText);
        ptextview1.setText(_currentEducation.getGradientText().descriptionText);
        _gradientView.setVisibility(0);
    }

    private void setUpPromptView()
    {
        _isActive = true;
        _promptView.setTitle(_currentEducation.getPromptTitle());
    }

    private void show(EducationStep educationstep)
    {
        _background.showNextStep(_currentStep);
        _pulse.setPulse(educationstep.getBackground().getPulse());
        removeCardViews();
        if (educationstep != null)
        {
            _currentCard = new EducationCardView(getContext());
            _currentCard.setStep(educationstep);
            educationstep = _currentCard;
            boolean flag;
            if (_currentStep == _currentSteps.size() - 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            educationstep.setIsLastStep(flag);
            _foreground.addView(_currentCard);
        }
    }

    private void showNextStep()
    {
        _isActive = true;
        _isExpectingPageChange = false;
        _currentStep = _currentStep + 1;
        if (_currentStep < _currentSteps.size())
        {
            EducationStep educationstep = (EducationStep)_currentSteps.get(_currentStep);
            if (isScrollingToTarget(educationstep))
            {
                return;
            }
            if (educationstep.shouldComplete())
            {
                safeCompleteExperience(_currentEducation);
            }
            show(educationstep);
            return;
        }
        if (_currentStep == _currentSteps.size() && !((EducationStep)_currentSteps.get(_currentStep - 1)).shouldComplete())
        {
            safeCompleteExperience(_currentEducation);
        }
        dismissUi();
    }

    private void showPulsar()
    {
        Events.register(_eventsSubscriber, com/pinterest/api/model/Pin$UpdateEvent, new Class[0]);
        _pulsar.positionPulsar(AndroidEducationAnchor.findByValue(_toolTip.anchorPoint));
        _pulsar.setOnClickListener(new _cls1());
    }

    private void showToolTip()
    {
        if (EducationHelper.a(getContext(), AndroidEducationAnchor.findByValue(_toolTip.anchorPoint)) != null)
        {
            _isActive = true;
            _toolTipView.setToolTip(_toolTip);
            _toolTipView.setClickable(true);
            _toolTipView.setFocusable(true);
            _toolTipView.setVisibility(0);
            _toolTipView.setAlpha(0.0F);
            setBackgroundColor(Resources.color(0x7f0e00c2));
        }
    }

    public boolean isActive()
    {
        return _isActive;
    }

    protected void onDetachedFromWindow()
    {
        Events.unregister(_eventsSubscriber);
        super.onDetachedFromWindow();
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (motionevent.getAction() == 0 && _currentEducation != null && _currentEducation.getExperienceValue() != null && Arrays.asList(TRIGGER_REFRESH_EXPERIENCES).contains(Integer.valueOf(_currentEducation.getExperienceValue().b)))
        {
            hideContent();
            Experiences.c().d();
        }
        return super.onTouchEvent(motionevent);
    }

    public void setEducation(Education education, EducationEvent educationevent)
    {
        Device.lockToCurrentOrientation((Activity)getContext());
        BaseFragment basefragment;
        if (getContext() != null)
        {
            basefragment = ((MainActivity)getContext()).getActiveFragment();
        } else
        {
            basefragment = null;
        }
        _initFragment = basefragment;
        _currentStep = -1;
        _currentEducation = education;
        if (_currentEducation != null)
        {
            _currentSteps = _currentEducation.getSteps();
        }
        _trigger.setEvent(educationevent);
        _trigger.hide(null);
        _background.setSteps(_currentSteps);
        if (_currentEducation != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        education = _currentEducation.getExperienceValue();
        if (education != null)
        {
            ExperiencesApi.b(((ExperienceValue) (education)).d);
        }
        _toolTip = _currentEducation.getToolTip();
        if (_toolTip == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (_toolTip.displayType == TooltipDisplayType.IMMEDIATE.getValue())
        {
            showToolTip();
        } else
        if (_toolTip.displayType == TooltipDisplayType.PULSER.getValue())
        {
            showPulsar();
        }
        if (!TextUtils.isEmpty(_currentEducation.getPromptTitle()))
        {
            setUpPromptView();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (!TextUtils.isEmpty(_currentEducation.getPromptTitle()))
        {
            setUpPromptView();
            if (_currentEducation.getGradientText() != null)
            {
                setUpGradientView();
                return;
            }
        } else
        {
            showNextStep();
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void setFragmentManager(FragmentManager fragmentmanager)
    {
        _background.setFragmentManager(fragmentmanager);
    }

    public void suspend()
    {
        hideContent();
        _trigger.show(null);
    }

    static 
    {
        PULSAR_POSITION_ANCHORS = (new Integer[] {
            Integer.valueOf(AndroidEducationAnchor.CLICKTHROUGH_BUTTON.getValue()), Integer.valueOf(AndroidEducationAnchor.LIBRARY_TOPIC.getValue()), Integer.valueOf(AndroidEducationAnchor.LIBRARY_ALL_PINS.getValue()), Integer.valueOf(AndroidEducationAnchor.HOMEFEED_FIRST_PIN.getValue()), Integer.valueOf(AndroidEducationAnchor.CLOSEUP_ATTRIBUTION_NAME.getValue()), Integer.valueOf(AndroidEducationAnchor.RICH_ACTION_BUTTON.getValue()), Integer.valueOf(AndroidEducationAnchor.CHECKOUT_ADD_CREDIT_CARD_BUTTON.getValue())
        });
        TRIGGER_REFRESH_EXPERIENCES = (new Integer[] {
            Integer.valueOf(Experience.ANDROID_FIRST_PIN_TAP_PROMPT.getValue()), Integer.valueOf(Experience.ANDROID_FIRST_PIN_SCROLL_PROMPT.getValue()), Integer.valueOf(Experience.ANDROID_FLASHLIGHT_BUTTON_TOOLTIP.getValue()), Integer.valueOf(Experience.ANDROID_WARM_SEO_NUX_HOMEFEED_INTRO.getValue())
        });
    }










/*
    static boolean access$1602(EducationContainerView educationcontainerview, boolean flag)
    {
        educationcontainerview._isActive = flag;
        return flag;
    }

*/










    private class _cls6
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final EducationContainerView this$0;

        public void onEventMainThread(com.pinterest.activity.create.helper.CreateBoardHelper.BoardCreatedEvent boardcreatedevent)
        {
            Events.removeStickyEvent(boardcreatedevent);
            showNextStep();
            class _cls1
                implements Runnable
            {

                final _cls6 this$1;

                public void run()
                {
                    dismiss();
                }

                _cls1()
                {
                    this$1 = _cls6.this;
                    super();
                }
            }

            postDelayed(new _cls1(), 1500L);
        }

        public void onEventMainThread(PageChangedEvent pagechangedevent)
        {
            if (!_isExpectingPageChange)
            {
                _flyout.updateLocationState();
                dismissUi();
            }
        }

        public void onEventMainThread(com.pinterest.activity.library.fragment.LibraryAllPinsFragment.HidePulserEvent hidepulserevent)
        {
            if (_pulsar == null)
            {
                return;
            } else
            {
                _pulsar.hidePulsar();
                return;
            }
        }

        public void onEventMainThread(com.pinterest.activity.library.fragment.LibraryAllPinsFragment.ShowPulserEvent showpulserevent)
        {
            if (_pulsar == null)
            {
                return;
            } else
            {
                _pulsar.positionPulsar(showpulserevent._androidEducationAnchor);
                return;
            }
        }

        public void onEventMainThread(com.pinterest.activity.pin.fragment.PinFragment.PinFragmentMoveAccessoryBarEvent pinfragmentmoveaccessorybarevent)
        {
            _pulse.setVisibility(8);
        }

        public void onEventMainThread(EducationEvent educationevent)
        {
            switch (_cls7..SwitchMap.com.pinterest.activity.task.education.event.EducationEvent.Type[educationevent.getType().ordinal()])
            {
            default:
                return;

            case 1: // '\001'
                EducationHelper.a(educationevent.getEducation().getEid());
                handleStart(educationevent.getEducation(), educationevent);
                return;

            case 2: // '\002'
                handleNext();
                return;

            case 3: // '\003'
                dismiss();
                EducationHelper.a(null);
                return;

            case 4: // '\004'
                dismissUi();
                EducationHelper.a(null);
                return;

            case 5: // '\005'
                suspend();
                break;
            }
            EducationHelper.a(null);
        }

        public void onEventMainThread(PositionPulsarEvent positionpulsarevent)
        {
            while (_toolTip == null || !Arrays.asList(EducationContainerView.PULSAR_POSITION_ANCHORS).contains(Integer.valueOf(_toolTip.anchorPoint))) 
            {
                return;
            }
            _pulsar.positionPulsar(AndroidEducationAnchor.findByValue(_toolTip.anchorPoint));
        }

        public void onEventMainThread(Navigation navigation)
        {
            if (_currentEducation != null && _currentEducation.getExperienceValue() != null && _currentEducation.getExperienceValue().b == Experience.ANDROID_FIRST_PIN_TAP_PROMPT.getValue())
            {
                dismiss();
            }
            if (!_isExpectingPageChange)
            {
                _flyout.updateLocationState();
                dismissUi();
            }
        }

        public void onEventMainThread(com.pinterest.activity.task.view.MainViewPager.PageChangedEvent pagechangedevent)
        {
            if (!_isExpectingPageChange)
            {
                _flyout.updateLocationState();
                dismissUi();
            }
        }

        public void onEventMainThread(com.pinterest.activity.task.view.MainViewPager.PageStateEvent pagestateevent)
        {
            switch (pagestateevent.getState())
            {
            default:
                return;

            case 0: // '\0'
                setClickable(false);
                break;
            }
            Events.unregister(_eventsSubscriber, new Class[] {
                com/pinterest/activity/task/view/MainViewPager$PageStateEvent
            });
            showNextStep();
        }

        public void onEventMainThread(com.pinterest.api.model.Pin.UpdateEvent updateevent)
        {
            if (_toolTip != null)
            {
                _isActive = false;
                _pulsar.hidePulsar();
            }
        }

        _cls6()
        {
            this$0 = EducationContainerView.this;
            super();
        }

        private class _cls7
        {

            static final int $SwitchMap$com$pinterest$activity$task$education$event$EducationEvent$Type[];

            static 
            {
                $SwitchMap$com$pinterest$activity$task$education$event$EducationEvent$Type = new int[com.pinterest.activity.task.education.event.EducationEvent.Type.values().length];
                try
                {
                    $SwitchMap$com$pinterest$activity$task$education$event$EducationEvent$Type[com.pinterest.activity.task.education.event.EducationEvent.Type.START.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$pinterest$activity$task$education$event$EducationEvent$Type[com.pinterest.activity.task.education.event.EducationEvent.Type.NEXT.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$pinterest$activity$task$education$event$EducationEvent$Type[com.pinterest.activity.task.education.event.EducationEvent.Type.DISMISS.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$pinterest$activity$task$education$event$EducationEvent$Type[com.pinterest.activity.task.education.event.EducationEvent.Type.DISMISS_UI.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$pinterest$activity$task$education$event$EducationEvent$Type[com.pinterest.activity.task.education.event.EducationEvent.Type.SUSPEND.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

    }


    private class _cls2
        implements Runnable
    {

        final EducationContainerView this$0;
        final String val$title;

        public void run()
        {
            _promptView.setTitle(title);
            class _cls1
                implements Runnable
            {

                final _cls2 this$1;

                public void run()
                {
                    _promptView.hidePrompt();
                }

                _cls1()
                {
                    this$1 = _cls2.this;
                    super();
                }
            }

            postDelayed(new _cls1(), 2000L);
        }

        _cls2()
        {
            this$0 = EducationContainerView.this;
            title = s;
            super();
        }
    }


    private class _cls3 extends com.pinterest.kit.utils.AnimationUtils.AnimationListener
    {

        final EducationContainerView this$0;
        final int val$destination;
        final String val$uri;

        public void onAnimationEnd(Animator animator)
        {
            super.onAnimationEnd(animator);
            performAction(destination, uri);
        }

        _cls3()
        {
            this$0 = EducationContainerView.this;
            destination = i;
            uri = s;
            super();
        }
    }


    private class _cls4 extends com.pinterest.kit.utils.AnimationUtils.AnimationListener
    {

        final EducationContainerView this$0;

        public void onAnimationEnd(Animator animator)
        {
            super.onAnimationEnd(animator);
            showNextStep();
        }

        _cls4()
        {
            this$0 = EducationContainerView.this;
            super();
        }
    }


    private class ShowShareExtensionEvent
    {

        public ShowShareExtensionEvent()
        {
        }
    }


    private class _cls5
        implements Runnable
    {

        final EducationContainerView this$0;

        public void run()
        {
            showNextStep();
        }

        _cls5()
        {
            this$0 = EducationContainerView.this;
            super();
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final EducationContainerView this$0;

        public void onClick(View view)
        {
            _pulsar.hidePulsar();
            view = _currentEducation.getId();
            if (EducationHelper.a(view, Experience.ANDROID_OWN_LIBRARY_PROFILE_ED))
            {
                Events.post(new com.pinterest.activity.library.fragment.LibraryFragment.ShowAllPinsPageEvent());
                dismiss();
                return;
            }
            if (EducationHelper.a(view, Experience.ANDROID_OWN_LIBRARY_ALL_PINS_ED))
            {
                Events.post(new com.pinterest.activity.library.fragment.LibraryAllPinsFragment.ShowTopicClickedEvent());
                dismiss();
                changePromptViewText(_currentEducation.getDetailTitle());
                return;
            }
            if (EducationHelper.a(view, Experience.ANDROID_FLASHLIGHT_BUTTON_TOOLTIP))
            {
                dismiss();
                EducationHelper.a(null);
                Events.post(new com.pinterest.activity.pin.view.PinCloseupImageView.FlashlightSearchButtonEvent());
                return;
            } else
            {
                showToolTip();
                return;
            }
        }

        _cls1()
        {
            this$0 = EducationContainerView.this;
            super();
        }
    }

}
