// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.pinterest.base.Device;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.utils.NetworkUtils;
import com.pinterest.reporting.CrashReporting;
import com.pinterest.ui.ObservableImageView;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.anim.FanAnimationUtil;
import com.pinterest.ui.progress.LoadingView;
import org.apache.commons.lang3.StringUtils;

public class AdapterEmptyView extends FrameLayout
{

    private static boolean CUSTOM_PADDING = false;
    private static final float SIDE_SCALE = 0.87F;
    private static final int STATE_COUNT = 3;
    public static final int STATE_EMPTY = 1;
    public static final int STATE_LOADING = 0;
    public static final int STATE_NONE = 2;
    private Button _actionBt;
    private SparseArray _actionStates;
    private ObservableImageView _centerIv;
    private View _container;
    private boolean _customMode;
    private com.pinterest.ui.anim.FanAnimationUtil.FanUtilParams _fanUtilParams;
    private RelativeLayout _imageContainer;
    private boolean _isActive;
    private boolean _isAnimating;
    private ObservableImageView _leftIv;
    private int _maxHeight;
    private TextView _messageTv;
    private View _noInternet;
    private int _previousOrientation;
    private Button _refreshBt;
    private ObservableImageView _rightIv;
    private LoadingView _spinner;
    private int _state;
    private LinearLayout _textContainer;
    private boolean _viewsAnimated;
    private ViewGroup _wrapper;

    public AdapterEmptyView(Context context)
    {
        super(context);
        _state = 2;
        init();
    }

    public AdapterEmptyView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        _state = 2;
        init();
    }

    public AdapterEmptyView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        _state = 2;
        init();
    }

    private static void clearIcon(ImageView imageview)
    {
        if (imageview == null)
        {
            return;
        } else
        {
            imageview.setImageDrawable(null);
            imageview.setVisibility(8);
            return;
        }
    }

    private com.pinterest.ui.anim.FanAnimationUtil.FanUtilParams emptyStatesFanParams(com.pinterest.ui.anim.FanAnimationUtil.FanUtilParams fanutilparams)
    {
        final com.pinterest.ui.anim.FanAnimationUtil.FanUtilParams finalPassedParams = fanutilparams;
        if (fanutilparams == null)
        {
            finalPassedParams = new com.pinterest.ui.anim.FanAnimationUtil.FanUtilParams();
        }
        return (new com.pinterest.ui.anim.FanAnimationUtil.FanUtilParams(finalPassedParams)).setListener(new _cls2());
    }

    private void hideViews(boolean flag)
    {
        _centerIv.setVisibility(8);
        _leftIv.setVisibility(8);
        _rightIv.setVisibility(8);
        if (flag)
        {
            _textContainer.setVisibility(8);
        } else
        {
            _textContainer.setTranslationY(0.0F);
            if (!Device.isTablet())
            {
                _container.setPadding(_container.getPaddingLeft(), (int)(Resources.dimension(0x7f0a0117) / 2.0F), _container.getPaddingRight(), _container.getPaddingBottom());
                return;
            }
        }
    }

    private void init()
    {
        View view = ViewHelper.viewById(getContext(), 0x7f030170);
        _spinner = (LoadingView)view.findViewById(0x7f0f01d0);
        _centerIv = (ObservableImageView)view.findViewById(0x7f0f038f);
        _messageTv = (TextView)view.findViewById(0x7f0f0173);
        _actionBt = (Button)view.findViewById(0x7f0f0390);
        _refreshBt = (Button)view.findViewById(0x7f0f038b);
        _wrapper = (ViewGroup)view.findViewById(0x7f0f0389);
        _container = view.findViewById(0x7f0f0241);
        _noInternet = view.findViewById(0x7f0f038a);
        _leftIv = (ObservableImageView)view.findViewById(0x7f0f038e);
        _rightIv = (ObservableImageView)view.findViewById(0x7f0f038d);
        _textContainer = (LinearLayout)view.findViewById(0x7f0f01d4);
        _imageContainer = (RelativeLayout)view.findViewById(0x7f0f038c);
        _isAnimating = false;
        _previousOrientation = getResources().getConfiguration().orientation;
        _viewsAnimated = false;
        _leftIv.setScaleX(0.87F);
        _leftIv.setScaleY(0.87F);
        _rightIv.setScaleX(0.87F);
        _rightIv.setScaleY(0.87F);
        _centerIv.setVisibility(4);
        _leftIv.setVisibility(4);
        _rightIv.setVisibility(4);
        _centerIv.setAlpha(0.0F);
        _leftIv.setAlpha(0.0F);
        _rightIv.setAlpha(0.0F);
        _actionStates = new SparseArray(3);
        updateView();
        addView(view);
    }

    private void runAnimations()
    {
        com.pinterest.ui.anim.FanAnimationUtil.FanUtilParams fanutilparams1 = _fanUtilParams;
        com.pinterest.ui.anim.FanAnimationUtil.FanUtilParams fanutilparams = fanutilparams1;
        if (fanutilparams1 == null)
        {
            fanutilparams = new com.pinterest.ui.anim.FanAnimationUtil.FanUtilParams();
        }
        if (fanutilparams.getFanDistance() == 0L && fanutilparams.getMode() == com.pinterest.ui.anim.FanAnimationUtil.FanUtilParams.Orientation.VERTICAL)
        {
            long l = (long)((float)_centerIv.getMeasuredHeight() * 0.87F);
            _centerIv.setTranslationY(l);
        }
        if (!_isAnimating)
        {
            FanAnimationUtil.animate(_leftIv, _centerIv, _rightIv, _textContainer, emptyStatesFanParams(fanutilparams));
            _viewsAnimated = true;
        }
    }

    private void setAction(ActionState actionstate)
    {
        setAction(actionstate.label, actionstate.onClick);
    }

    private void setAction(String s, android.view.View.OnClickListener onclicklistener)
    {
        if (_actionBt != null)
        {
            if (StringUtils.isNotEmpty(s))
            {
                _actionBt.setText(s);
            }
            _actionBt.setOnClickListener(onclicklistener);
            s = _actionBt;
            byte byte0;
            if (onclicklistener == null)
            {
                byte0 = 8;
            } else
            {
                byte0 = 0;
            }
            s.setVisibility(byte0);
        }
    }

    private void setAnimations()
    {
        if (getResources().getConfiguration().orientation == 2)
        {
            hideViews(false);
            _textContainer.setTranslationY(0.0F);
        } else
        if (!_viewsAnimated)
        {
            showViews();
            _centerIv.setTranslationY(0.0F);
            _centerIv.setTranslationX(0.0F);
            _leftIv.setTranslationY(0.0F);
            _leftIv.setTranslationX(0.0F);
            _rightIv.setTranslationY(0.0F);
            _rightIv.setTranslationX(0.0F);
            _textContainer.setTranslationX(0.0F);
            _textContainer.setTranslationY(0.0F);
            setConstraints();
            if (_fanUtilParams != null && _fanUtilParams.getFanDistance() > 0L)
            {
                runAnimations();
                return;
            }
            if (_centerIv.getMeasuredWidth() == 0 || _centerIv.getMeasuredHeight() == 0 || _leftIv.getMeasuredWidth() == 0 || _leftIv.getMeasuredHeight() == 0 || _rightIv.getMeasuredWidth() == 0 || _rightIv.getMeasuredHeight() == 0)
            {
                _cls1 _lcls1 = new _cls1();
                if (_centerIv.getDrawable() != null)
                {
                    _centerIv.setOnDrawListener(_lcls1);
                    return;
                }
                if (_leftIv.getDrawable() != null)
                {
                    _leftIv.setOnDrawListener(_lcls1);
                    return;
                }
                if (_rightIv.getDrawable() != null)
                {
                    _rightIv.setOnDrawListener(_lcls1);
                    return;
                }
            } else
            {
                runAnimations();
                return;
            }
        } else
        {
            showViews();
            return;
        }
    }

    private void setAsymmetricalHeights()
    {
        if (_leftIv != null && _leftIv.getDrawable() != null && _rightIv != null && _rightIv.getDrawable() != null && _leftIv.getDrawable().getIntrinsicHeight() != _rightIv.getDrawable().getIntrinsicHeight())
        {
            Object obj = _leftIv.getDrawable();
            Drawable drawable = _rightIv.getDrawable();
            if (((Drawable) (obj)).getIntrinsicHeight() > drawable.getIntrinsicHeight())
            {
                _leftIv.setMaxHeight(_maxHeight);
                int i = (int)((float)drawable.getIntrinsicHeight() * _rightIv.getScaleX());
                float f = ((float)((Drawable) (obj)).getIntrinsicHeight() * _leftIv.getScaleX() - (float)_maxHeight) / (float)((Drawable) (obj)).getIntrinsicHeight();
                _rightIv.setMaxHeight((int)((1.0F - f) * (float)i));
                obj = (android.widget.RelativeLayout.LayoutParams)_rightIv.getLayoutParams();
                ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(8, _leftIv.getId());
                _rightIv.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
                return;
            }
            if (drawable.getIntrinsicHeight() > ((Drawable) (obj)).getIntrinsicHeight())
            {
                _rightIv.setMaxHeight(_maxHeight);
                int j = (int)((float)((Drawable) (obj)).getIntrinsicHeight() * _leftIv.getScaleX());
                float f1 = ((float)drawable.getIntrinsicHeight() * _rightIv.getScaleX() - (float)_maxHeight) / (float)drawable.getIntrinsicHeight();
                _leftIv.setMaxHeight((int)((float)j * (1.0F - f1)));
                obj = (android.widget.RelativeLayout.LayoutParams)_leftIv.getLayoutParams();
                ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(8, _rightIv.getId());
                _leftIv.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
                return;
            }
        }
    }

    private void setConstraints()
    {
        if (_fanUtilParams != null)
        {
            setAsymmetricalHeights();
            if (_fanUtilParams.getRotation() != 0.0F)
            {
                _leftIv.setOnDrawListener(new _cls3());
                _rightIv.setOnDrawListener(new _cls4());
                return;
            }
        }
    }

    private void setContainerHeight()
    {
        float f2 = 0.0F;
        float f = Math.abs((float)Math.sin(Math.toRadians(_fanUtilParams.getRotation())));
        float f3 = Math.abs((float)Math.cos(Math.toRadians(_fanUtilParams.getRotation())));
        _imageContainer.getLayoutParams().height = (int)Math.max((float)_leftIv.getMeasuredWidth() * f + (float)_leftIv.getMeasuredHeight() * f3, f * (float)_rightIv.getMeasuredWidth() + f3 * (float)_rightIv.getMeasuredHeight());
        if (_centerIv.getDrawable() == null)
        {
            float f1;
            if (_fanUtilParams.getRotation() > 0.0F)
            {
                f1 = _leftIv.getMeasuredWidth();
            } else
            {
                f1 = 0.0F;
            }
            if (_fanUtilParams.getRotation() <= 0.0F)
            {
                f2 = _rightIv.getMeasuredWidth();
            }
            _leftIv.setPivotX(f1);
            _leftIv.setPivotY(_leftIv.getMeasuredHeight());
            _rightIv.setPivotX(f2);
            _rightIv.setPivotY(_rightIv.getMeasuredHeight());
        }
    }

    private static void setIcon(ImageView imageview, int i)
    {
        if (imageview == null)
        {
            return;
        } else
        {
            imageview.setImageResource(i);
            imageview.setVisibility(0);
            return;
        }
    }

    public static void setState(AdapterEmptyView adapteremptyview, int i)
    {
        if (adapteremptyview != null)
        {
            adapteremptyview.setState(i);
        }
    }

    private void showViews()
    {
        _centerIv.setVisibility(0);
        _leftIv.setVisibility(0);
        _rightIv.setVisibility(0);
        _textContainer.setVisibility(0);
        if (!Device.isTablet())
        {
            _container.setPadding(_container.getPaddingLeft(), (int)Resources.dimension(0x7f0a0117), _container.getPaddingRight(), _container.getPaddingBottom());
        }
    }

    private void updateView()
    {
        if (!_isActive) goto _L2; else goto _L1
_L1:
        _state;
        JVM INSTR tableswitch 0 2: default 36
    //                   0 158
    //                   1 67
    //                   2 178;
           goto _L3 _L4 _L5 _L6
_L3:
        setAction((ActionState)_actionStates.get(_state, new ActionState("", null, null)));
_L2:
        return;
_L5:
        _spinner.setState(2);
        _container.setVisibility(0);
        if (NetworkUtils.getInstance().hasInternet())
        {
            if (_customMode)
            {
                clearDefaults();
            }
            _wrapper.setVisibility(0);
            _noInternet.setVisibility(8);
            setAnimations();
        } else
        {
            if (_customMode)
            {
                resetDefaults();
            }
            _wrapper.setVisibility(8);
            _noInternet.setVisibility(0);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        _spinner.setState(0);
        _container.setVisibility(8);
        continue; /* Loop/switch isn't completed */
_L6:
        _spinner.setState(2);
        _container.setVisibility(8);
        if (true) goto _L3; else goto _L7
_L7:
    }

    public void activate()
    {
        _isActive = true;
        updateView();
        showViews();
    }

    protected void clearDefaults()
    {
        if (_container != null)
        {
            _container.setBackgroundColor(Resources.color(0x106000d));
        }
        if (CUSTOM_PADDING)
        {
            View view = findViewById(0x7f0f0388);
            if (view != null)
            {
                view.setPadding(0, (int)Device.dpToPixel(28F), 0, 0);
                view.forceLayout();
            }
        }
    }

    public void deactivate()
    {
        _isActive = false;
    }

    public int getState()
    {
        return _state;
    }

    public boolean hasAction(int i)
    {
        return _actionStates.get(i, null) != null;
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        if (_previousOrientation != 1 || configuration.orientation != 2) goto _L2; else goto _L1
_L1:
        hideViews(false);
_L4:
        _previousOrientation = configuration.orientation;
        return;
_L2:
        if (_previousOrientation == 2 && configuration.orientation == 1)
        {
            getRootView().getViewTreeObserver().addOnGlobalLayoutListener(new _cls5());
            setAnimations();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void onDetachedFromWindow()
    {
        if (_actionBt != null)
        {
            _actionBt.setOnClickListener(null);
        }
        if (_refreshBt != null)
        {
            _refreshBt.setOnClickListener(null);
        }
        if (_rightIv != null)
        {
            _rightIv.setOnDrawListener(null);
        }
        if (_centerIv != null)
        {
            _centerIv.setOnDrawListener(null);
        }
        if (_leftIv != null)
        {
            _leftIv.setOnDrawListener(null);
        }
        removeAllViews();
        super.onDetachedFromWindow();
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        _maxHeight = getMeasuredHeight() / 2;
    }

    public void refresh()
    {
        if (_state == 1)
        {
            _viewsAnimated = false;
            setAnimations();
        }
    }

    public void removeAction(int i)
    {
        _actionStates.remove(i);
        if (_state == i)
        {
            updateView();
        }
    }

    protected void resetDefaults()
    {
        _container.setBackgroundResource(0x7f02028c);
        if (CUSTOM_PADDING)
        {
            View view = findViewById(0x7f0f0388);
            if (view != null)
            {
                int i = (int)Device.dpToPixel(28F);
                view.setPadding(i, i, i, i);
                view.forceLayout();
            }
        }
    }

    public void resetViews()
    {
        setCustomView(0x7f030173, false);
        resetDefaults();
    }

    public void setAction(int i, int j, android.view.View.OnClickListener onclicklistener)
    {
        setAction(i, Resources.string(j), onclicklistener);
    }

    public void setAction(int i, String s, android.view.View.OnClickListener onclicklistener)
    {
        _actionStates.put(i, new ActionState(s, onclicklistener, null));
        if (_state == i)
        {
            updateView();
        }
    }

    public void setCenterIcon(int i)
    {
        setIcon(_centerIv, i);
    }

    public void setCustomView(int i)
    {
        setCustomView(i, false);
    }

    public void setCustomView(int i, boolean flag)
    {
        _customMode = flag;
        _wrapper.removeAllViews();
        inflate(getContext(), i, _wrapper);
        if (flag)
        {
            clearDefaults();
        }
    }

    public void setCustomView(View view)
    {
        setCustomView(view, false);
    }

    public void setCustomView(View view, boolean flag)
    {
        _customMode = flag;
        _wrapper.removeAllViews();
        _wrapper.addView(view);
        if (flag)
        {
            clearDefaults();
        }
    }

    public void setEmptyIllustrations(int i, int j, int k)
    {
        try
        {
            setCenterIcon(i);
            setLeftIcon(j);
            setRightIcon(k);
            return;
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            CrashReporting.a(outofmemoryerror);
        }
        clearIcon(_centerIv);
        clearIcon(_leftIv);
        clearIcon(_rightIv);
    }

    public void setFanUtilParams(com.pinterest.ui.anim.FanAnimationUtil.FanUtilParams fanutilparams)
    {
        _fanUtilParams = fanutilparams;
        if (fanutilparams != null && fanutilparams.getMode() == com.pinterest.ui.anim.FanAnimationUtil.FanUtilParams.Orientation.VERTICAL)
        {
            fanutilparams = (android.widget.RelativeLayout.LayoutParams)_leftIv.getLayoutParams();
            fanutilparams.addRule(13);
            _leftIv.setLayoutParams(fanutilparams);
            _rightIv.setLayoutParams(fanutilparams);
        }
    }

    public void setLeftIcon(int i)
    {
        setIcon(_leftIv, i);
    }

    public void setMessage(int i)
    {
        if (_messageTv != null)
        {
            setMessage(Resources.string(i));
        }
    }

    public void setMessage(String s)
    {
        if (_messageTv != null && s != null)
        {
            _messageTv.setText(Html.fromHtml(s));
        }
    }

    public void setRefreshAction(android.view.View.OnClickListener onclicklistener)
    {
        if (_refreshBt != null)
        {
            _refreshBt.setOnClickListener(onclicklistener);
        }
    }

    public void setRightIcon(int i)
    {
        setIcon(_rightIv, i);
    }

    public void setState(int i)
    {
        if (_state == i)
        {
            return;
        } else
        {
            _state = i;
            updateView();
            return;
        }
    }

    static 
    {
        CUSTOM_PADDING = false;
    }








/*
    static boolean access$702(AdapterEmptyView adapteremptyview, boolean flag)
    {
        adapteremptyview._isAnimating = flag;
        return flag;
    }

*/


    private class _cls2 extends com.pinterest.kit.utils.AnimationUtils.AnimationListener
    {

        final AdapterEmptyView this$0;
        final com.pinterest.ui.anim.FanAnimationUtil.FanUtilParams val$finalPassedParams;

        public void onAnimationCancel(Animator animator)
        {
            super.onAnimationCancel(animator);
            if (finalPassedParams.getListener() != null)
            {
                finalPassedParams.getListener().onAnimationCancel(animator);
            }
            _isAnimating = false;
        }

        public void onAnimationEnd(Animator animator)
        {
            super.onAnimationEnd(animator);
            if (finalPassedParams.getListener() != null)
            {
                finalPassedParams.getListener().onAnimationEnd(animator);
            }
            _isAnimating = false;
        }

        public void onAnimationRepeat(Animator animator)
        {
            super.onAnimationRepeat(animator);
            if (finalPassedParams.getListener() != null)
            {
                finalPassedParams.getListener().onAnimationRepeat(animator);
            }
            _isAnimating = true;
        }

        public void onAnimationStart(Animator animator)
        {
            super.onAnimationStart(animator);
            if (finalPassedParams.getListener() != null)
            {
                finalPassedParams.getListener().onAnimationStart(animator);
            }
            _isAnimating = true;
        }

        _cls2()
        {
            this$0 = AdapterEmptyView.this;
            finalPassedParams = fanutilparams;
            super();
        }
    }


    private class ActionState
    {

        String label;
        android.view.View.OnClickListener onClick;

        private ActionState(String s, android.view.View.OnClickListener onclicklistener)
        {
            label = s;
            onClick = onclicklistener;
        }

        ActionState(String s, android.view.View.OnClickListener onclicklistener, _cls1 _pcls1)
        {
            this(s, onclicklistener);
        }
    }


    private class _cls1
        implements com.pinterest.ui.ObservableImageView.OnDrawListener
    {

        final AdapterEmptyView this$0;

        public void onDraw(ImageView imageview)
        {
            if (imageview instanceof ObservableImageView)
            {
                ((ObservableImageView)imageview).setOnDrawListener(null);
            }
            if (_fanUtilParams != null && _fanUtilParams.getMode() == com.pinterest.ui.anim.FanAnimationUtil.FanUtilParams.Orientation.VERTICAL)
            {
                _imageContainer.setMinimumHeight(_centerIv.getMeasuredHeight() + (int)((float)(_leftIv.getMeasuredHeight() + _rightIv.getMeasuredHeight()) * 0.87F));
            }
            runAnimations();
        }

        _cls1()
        {
            this$0 = AdapterEmptyView.this;
            super();
        }
    }


    private class _cls3
        implements com.pinterest.ui.ObservableImageView.OnDrawListener
    {

        final AdapterEmptyView this$0;

        public void onDraw(ImageView imageview)
        {
            _leftIv.setOnDrawListener(null);
            if (_rightIv.getMeasuredHeight() > 0)
            {
                setContainerHeight();
            }
        }

        _cls3()
        {
            this$0 = AdapterEmptyView.this;
            super();
        }
    }


    private class _cls4
        implements com.pinterest.ui.ObservableImageView.OnDrawListener
    {

        final AdapterEmptyView this$0;

        public void onDraw(ImageView imageview)
        {
            _rightIv.setOnDrawListener(null);
            if (_leftIv.getMeasuredHeight() > 0)
            {
                setContainerHeight();
            }
        }

        _cls4()
        {
            this$0 = AdapterEmptyView.this;
            super();
        }
    }


    private class _cls5
        implements android.view.ViewTreeObserver.OnGlobalLayoutListener
    {

        final AdapterEmptyView this$0;

        public void onGlobalLayout()
        {
            getRootView().getViewTreeObserver().removeGlobalOnLayoutListener(this);
            if (_fanUtilParams != null && _fanUtilParams.getMode() == com.pinterest.ui.anim.FanAnimationUtil.FanUtilParams.Orientation.VERTICAL)
            {
                _imageContainer.setMinimumHeight(_centerIv.getMeasuredHeight() + (int)((float)(_leftIv.getMeasuredHeight() + _rightIv.getMeasuredHeight()) * 0.87F));
            }
        }

        _cls5()
        {
            this$0 = AdapterEmptyView.this;
            super();
        }
    }

}
