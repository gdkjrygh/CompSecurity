// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.education.view;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import butterknife.ButterKnife;
import com.pinterest.activity.board.fragment.BoardFragment;
import com.pinterest.activity.home.HomeFragment;
import com.pinterest.activity.pin.fragment.PinSwipeFragment;
import com.pinterest.activity.task.activity.MainActivity;
import com.pinterest.activity.task.education.model.EducationPulse;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.activity.task.fragment.ViewPagerFragment;
import com.pinterest.activity.user.UserFragment;
import com.pinterest.base.Device;
import com.pinterest.schemas.experiences.AndroidEducationAnchor;
import com.pinterest.schemas.experiences.EducationAction;
import java.util.Hashtable;

// Referenced classes of package com.pinterest.activity.task.education.view:
//            EducationPulseAnimation, EducationPulseGraphic

public class EducationPulseView extends FrameLayout
{

    private static final int HORIZONTAL = 1;
    private static Hashtable UI_LOCATIONS;
    private static final int VERTICAL = 2;
    private GestureDetector _gestureDetector;
    private EducationPulse _pulse;
    private EducationPulseAnimation _pulseAnimator;
    EducationPulseGraphic _pulseGraphic;
    ImageView _pulseTouchable;
    private com.pinterest.ui.scrollview.ObservableScrollView.ScrollViewListener _scrollListener;
    private android.view.View.OnTouchListener _swipeListener;
    private View _targetView;

    public EducationPulseView(Context context)
    {
        this(context, null);
    }

    public EducationPulseView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public EducationPulseView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init(context);
    }

    private GestureDetector buildGestureDetector(final int direction, final float finalScrollDistance, final EducationAction action)
    {
        return new GestureDetector(getContext(), new _cls4());
    }

    private void buildScrollListener()
    {
        if (_targetView != null && _pulse.getScrollAction() == 2)
        {
            final int distance = _targetView.getHeight() / 2;
            final BaseFragment f = ((MainActivity)getContext()).getActiveFragment();
            if (f != null)
            {
                _scrollListener = new _cls2();
                f.setScrollListener(_scrollListener);
                return;
            }
        }
    }

    private android.view.View.OnTouchListener buildSwipeTouchListener(final View target, EducationAction educationaction)
    {
        float f;
        if (educationaction == EducationAction.TAP)
        {
            f = _targetView.getHeight() / 2;
        } else
        {
            f = 500F * Device.getDensity();
        }
        if (educationaction == EducationAction.SWIPE_RIGHT || educationaction == EducationAction.SWIPE_DOWN)
        {
            f = -f;
        } else
        if (educationaction == EducationAction.TAP)
        {
            f = -target.getMeasuredHeight() / 2;
        }
        _cls5..SwitchMap.com.pinterest.schemas.experiences.EducationAction[educationaction.ordinal()];
        JVM INSTR tableswitch 1 5: default 76
    //                   1 129
    //                   2 129
    //                   3 129
    //                   4 115
    //                   5 115;
           goto _L1 _L2 _L2 _L2 _L3 _L3
_L1:
        return new _cls3();
_L3:
        _gestureDetector = buildGestureDetector(1, f, educationaction);
        continue; /* Loop/switch isn't completed */
_L2:
        _gestureDetector = buildGestureDetector(2, f, educationaction);
        if (true) goto _L1; else goto _L4
_L4:
    }

    public static View getTargetView(MainActivity mainactivity, AndroidEducationAnchor androideducationanchor)
    {
        String s;
        int i;
        if (UI_LOCATIONS.get(androideducationanchor) != null)
        {
            i = ((PulseViewContext)UI_LOCATIONS.get(androideducationanchor)).getViewId();
        } else
        {
            i = 0;
        }
        if (UI_LOCATIONS.get(androideducationanchor) != null)
        {
            s = ((PulseViewContext)UI_LOCATIONS.get(androideducationanchor)).getFragmentTag();
        } else
        {
            s = null;
        }
        if (mainactivity != null)
        {
            mainactivity = mainactivity.getActiveFragment();
        } else
        {
            mainactivity = null;
        }
        androideducationanchor = mainactivity;
        if (mainactivity != null)
        {
            androideducationanchor = mainactivity;
            if (!((BaseFragment)mainactivity).getFragmentTag().equals(s))
            {
                androideducationanchor = mainactivity.getChildFragmentManager().findFragmentByTag(s);
                if (androideducationanchor instanceof ViewPagerFragment)
                {
                    androideducationanchor = ((ViewPagerFragment)androideducationanchor).getActiveFragment();
                }
            }
        }
        if (androideducationanchor != null)
        {
            mainactivity = androideducationanchor.getView();
        } else
        {
            mainactivity = null;
        }
        if (mainactivity != null)
        {
            return mainactivity.findViewById(i);
        } else
        {
            return null;
        }
    }

    private View getTargetView(AndroidEducationAnchor androideducationanchor)
    {
        return getTargetView((MainActivity)getContext(), androideducationanchor);
    }

    private void init(Context context)
    {
        LayoutInflater.from(context).inflate(0x7f03009b, this, true);
        ButterKnife.a(this);
        setClipChildren(false);
        _pulseAnimator = new EducationPulseAnimation();
        resetToDefault();
    }

    private void resetToDefault()
    {
        setVisibility(4);
        _pulseAnimator.cancel(_pulseGraphic);
        _pulseGraphic.setScaleX(1.0F);
        _pulseGraphic.setScaleY(1.0F);
        _pulseTouchable.setOnClickListener(null);
        _pulseTouchable.setOnTouchListener(null);
        _gestureDetector = null;
        _swipeListener = null;
        _targetView = null;
    }

    private void setActionHandler(EducationAction educationaction, final int touchTarget)
    {
        if (educationaction == EducationAction.TAP)
        {
            _pulseTouchable.setOnClickListener(new _cls1());
            buildScrollListener();
            return;
        } else
        {
            _swipeListener = buildSwipeTouchListener(_targetView, educationaction);
            _pulseTouchable.setOnTouchListener(_swipeListener);
            return;
        }
    }

    private void setAnchors(AndroidEducationAnchor androideducationanchor, EducationAction educationaction, int i)
    {
        int ai[];
        int l;
        ai = new int[2];
        l = Device.getStatusBarHeight();
        if (!androideducationanchor.equals(AndroidEducationAnchor.SCREEN_TOP_THIRD)) goto _L2; else goto _L1
_L1:
        int j;
        int k;
        ai[0] = (int)Device.getScreenWidth() / 2;
        ai[1] = (int)Device.getScreenHeight() / 3;
        k = 0;
        j = 0;
_L15:
        _cls5..SwitchMap.com.pinterest.schemas.experiences.EducationAction[educationaction.ordinal()];
        JVM INSTR tableswitch 1 5: default 88
    //                   1 343
    //                   2 352
    //                   3 363
    //                   4 374
    //                   5 385;
           goto _L3 _L4 _L5 _L6 _L7 _L8
_L3:
        float f;
        float f1;
        f1 = 0.0F;
        f = 0.0F;
_L13:
        float f2;
        float f3;
        int i1;
        if (UI_LOCATIONS.get(androideducationanchor) != null)
        {
            f2 = ((PulseViewContext)UI_LOCATIONS.get(androideducationanchor)).getXOffset() / 2.0F;
        } else
        {
            f2 = 0.0F;
        }
        if (UI_LOCATIONS.get(androideducationanchor) != null)
        {
            f3 = ((PulseViewContext)UI_LOCATIONS.get(androideducationanchor)).getYOffset() / 2.0F;
        } else
        {
            f3 = 0.0F;
        }
        androideducationanchor = _pulseGraphic;
        i1 = ai[0];
        androideducationanchor.setTranslationX(((float)((int)(f1 * (float)k) + i1) - (float)(_pulseGraphic.getMeasuredWidth() - k) / 2.0F) + f2);
        androideducationanchor = _pulseGraphic;
        i1 = ai[1];
        androideducationanchor.setTranslationY(f3 + ((float)(((int)(f * (float)j) + i1) - l) - (float)(_pulseGraphic.getMeasuredHeight() - j) / 2.0F));
        if (i != 2) goto _L10; else goto _L9
_L9:
        _pulseTouchable.setX(_pulseGraphic.getX());
        _pulseTouchable.setY(_pulseGraphic.getY());
        _pulseTouchable.setLayoutParams(new android.widget.FrameLayout.LayoutParams(_pulseGraphic.getMeasuredWidth(), _pulseGraphic.getMeasuredHeight()));
_L12:
        return;
_L2:
        if (_targetView == null) goto _L12; else goto _L11
_L11:
        k = _targetView.getMeasuredWidth();
        j = Math.min(_targetView.getMeasuredHeight(), (int)Device.getScreenHeight());
        _targetView.getLocationOnScreen(ai);
        continue; /* Loop/switch isn't completed */
_L4:
        f1 = 0.0F;
        f = 0.0F;
          goto _L13
_L5:
        f1 = 0.0F;
        f = 0.3F;
          goto _L13
_L6:
        f1 = 0.0F;
        f = -0.3F;
          goto _L13
_L7:
        f1 = 0.3F;
        f = 0.0F;
          goto _L13
_L8:
        f1 = -0.3F;
        f = 0.0F;
          goto _L13
_L10:
        _pulseTouchable.setX(ai[0]);
        _pulseTouchable.setY(ai[1] - l);
        _pulseTouchable.setLayoutParams(new android.widget.FrameLayout.LayoutParams(k, j));
        return;
        if (true) goto _L15; else goto _L14
_L14:
    }

    private void setAnimation(EducationAction educationaction)
    {
        _pulseAnimator.perform(_pulseGraphic, educationaction, _targetView);
    }

    public void setPulse(EducationPulse educationpulse)
    {
        _pulse = educationpulse;
        if (educationpulse == null || educationpulse.getAnchor() == null || educationpulse.getAction() == null)
        {
            resetToDefault();
            return;
        } else
        {
            resetToDefault();
            setVisibility(0);
            _targetView = getTargetView(educationpulse.getAnchor());
            setAnchors(educationpulse.getAnchor(), educationpulse.getAction(), educationpulse.getTouchTarget());
            setAnimation(educationpulse.getAction());
            setActionHandler(educationpulse.getAction(), educationpulse.getTouchTarget());
            return;
        }
    }

    static 
    {
        Hashtable hashtable = new Hashtable();
        UI_LOCATIONS = hashtable;
        hashtable.put(AndroidEducationAnchor.EXPLORE_TAB, new PulseViewContext(0x7f0f0508, com/pinterest/activity/home/HomeFragment.getSimpleName(), 0.0F, 0.0F));
        UI_LOCATIONS.put(AndroidEducationAnchor.PIN_IMAGE_VIEW, new PulseViewContext(0x7f0f000f, com/pinterest/activity/pin/fragment/PinSwipeFragment.getSimpleName(), 0.0F, 0.0F));
        UI_LOCATIONS.put(AndroidEducationAnchor.NEWS_BUTTON, new PulseViewContext(0x7f0f0506, com/pinterest/activity/user/UserFragment.getSimpleName(), 0.0F, 0.0F));
        UI_LOCATIONS.put(AndroidEducationAnchor.PIN_IT_BUTTON, new PulseViewContext(0x7f0f0305, com/pinterest/activity/pin/fragment/PinSwipeFragment.getSimpleName(), 0.0F, 0.0F));
        UI_LOCATIONS.put(AndroidEducationAnchor.BOARD_FOLLOW_BUTTON, new PulseViewContext(0x7f0f031b, com/pinterest/activity/board/fragment/BoardFragment.getSimpleName(), 0.0F, 0.0F));
    }





    private class _cls4 extends android.view.GestureDetector.SimpleOnGestureListener
    {

        private float _currScrollDistance;
        private boolean _hasPostedEvent;
        final EducationPulseView this$0;
        final EducationAction val$action;
        final int val$direction;
        final float val$finalScrollDistance;

        private boolean hasHitScrollDestination()
        {
            if (finalScrollDistance >= 0.0F) goto _L2; else goto _L1
_L1:
            if (_currScrollDistance > finalScrollDistance) goto _L4; else goto _L3
_L3:
            return true;
_L4:
            return false;
_L2:
            if (_currScrollDistance < finalScrollDistance)
            {
                return false;
            }
            if (true) goto _L3; else goto _L5
_L5:
        }

        public boolean onDown(MotionEvent motionevent)
        {
            return true;
        }

        public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
        {
            direction;
            JVM INSTR tableswitch 1 2: default 28
        //                       1 129
        //                       2 155;
               goto _L1 _L2 _L3
_L1:
            break; /* Loop/switch isn't completed */
_L3:
            break MISSING_BLOCK_LABEL_155;
_L4:
            PLog.info("onScroll %f", new Object[] {
                Float.valueOf(f1)
            });
            if (Math.abs(finalScrollDistance - _currScrollDistance) > Math.abs(finalScrollDistance))
            {
                _currScrollDistance = 0.0F;
            } else
            if (Math.abs(_currScrollDistance) > Math.abs(finalScrollDistance))
            {
                _currScrollDistance = finalScrollDistance;
            }
            if (hasHitScrollDestination() && !_hasPostedEvent)
            {
                com.pinterest.activity.task.education.event.EducationEvent.Type type;
                if (action == EducationAction.TAP)
                {
                    type = com.pinterest.activity.task.education.event.EducationEvent.Type.SUSPEND;
                } else
                {
                    type = com.pinterest.activity.task.education.event.EducationEvent.Type.NEXT;
                }
                Events.post(new EducationEvent(type));
                _hasPostedEvent = true;
            }
            return super.onScroll(motionevent, motionevent1, f, f1);
_L2:
            if (Math.abs(f) > Math.abs(f1))
            {
                _currScrollDistance = _currScrollDistance + f;
            }
              goto _L4
            if (Math.abs(f1) > Math.abs(f))
            {
                _currScrollDistance = _currScrollDistance + f1;
            }
              goto _L4
        }

        _cls4()
        {
            this$0 = EducationPulseView.this;
            direction = i;
            finalScrollDistance = f;
            action = educationaction;
            super();
            _currScrollDistance = 0.0F;
            _hasPostedEvent = false;
        }
    }


    private class _cls2 extends com.pinterest.ui.scrollview.ObservableScrollView.ScrollViewListener
    {

        final EducationPulseView this$0;
        final int val$distance;
        final BaseFragment val$f;

        public void onScroll(View view, int i, int j, int k, int l)
        {
            if (j > distance)
            {
                Events.post(new EducationEvent(com.pinterest.activity.task.education.event.EducationEvent.Type.SUSPEND));
                if (f != null)
                {
                    f.setScrollListener(null);
                }
            }
        }

        _cls2()
        {
            this$0 = EducationPulseView.this;
            distance = i;
            f = basefragment;
            super();
        }
    }


    private class _cls5
    {

        static final int $SwitchMap$com$pinterest$schemas$experiences$EducationAction[];

        static 
        {
            $SwitchMap$com$pinterest$schemas$experiences$EducationAction = new int[EducationAction.values().length];
            try
            {
                $SwitchMap$com$pinterest$schemas$experiences$EducationAction[EducationAction.TAP.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                $SwitchMap$com$pinterest$schemas$experiences$EducationAction[EducationAction.SWIPE_UP.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$pinterest$schemas$experiences$EducationAction[EducationAction.SWIPE_DOWN.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$pinterest$schemas$experiences$EducationAction[EducationAction.SWIPE_LEFT.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$pinterest$schemas$experiences$EducationAction[EducationAction.SWIPE_RIGHT.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class _cls3
        implements android.view.View.OnTouchListener
    {

        final EducationPulseView this$0;
        final View val$target;

        public boolean onTouch(View view, MotionEvent motionevent)
        {
            if (_gestureDetector != null)
            {
                _gestureDetector.onTouchEvent(motionevent);
            }
            if (view != target && target != null)
            {
                return target.dispatchTouchEvent(motionevent);
            } else
            {
                return false;
            }
        }

        _cls3()
        {
            this$0 = EducationPulseView.this;
            target = view;
            super();
        }
    }


    private class PulseViewContext
    {

        private String _fragmentTag;
        private int _viewId;
        private float _xOffset;
        private float _yOffset;

        public String getFragmentTag()
        {
            return _fragmentTag;
        }

        public int getViewId()
        {
            return _viewId;
        }

        public float getXOffset()
        {
            return _xOffset;
        }

        public float getYOffset()
        {
            return _yOffset;
        }

        public PulseViewContext(int i, String s, float f, float f1)
        {
            _viewId = i;
            _fragmentTag = s;
            _xOffset = f;
            _yOffset = f1;
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final EducationPulseView this$0;
        final int val$touchTarget;

        public void onClick(View view)
        {
            Pinalytics.a(ElementType.HELP_PULSE, ComponentType.CONTEXTUAL_USER_EDUCATION);
            EducationHelper.b(_pulse.getAnchor().getValue());
            if (_targetView != null)
            {
                _targetView.performClick();
            }
            resetToDefault();
            if (touchTarget != 2)
            {
                Events.postDelayed(new EducationEvent(com.pinterest.activity.task.education.event.EducationEvent.Type.NEXT), 200L);
            }
        }

        _cls1()
        {
            this$0 = EducationPulseView.this;
            touchTarget = i;
            super();
        }
    }

}
