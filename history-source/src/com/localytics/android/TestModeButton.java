// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.Display;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.RelativeLayout;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.localytics.android:
//            Constants, AmpCallable, DatapointHelper

public class TestModeButton extends DialogFragment
{
    class TestModeDialog extends Dialog
    {

        private static final int X_OFFSET = 0;
        private static final int Y_OFFSET = 85;
        private TranslateAnimation mAnimIn;
        private TranslateAnimation mAnimOut;
        private RelativeLayout mDialogLayout;
        private DisplayMetrics mMetrics;
        final TestModeButton this$0;

        private void adjustLayout()
        {
            mMetrics = new DisplayMetrics();
            ((WindowManager)getActivity().getSystemService("window")).getDefaultDisplay().getMetrics(mMetrics);
            Window window = getWindow();
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setGravity(51);
            android.view.WindowManager.LayoutParams layoutparams = window.getAttributes();
            layoutparams.x = (int)TypedValue.applyDimension(1, 0.0F, mMetrics);
            layoutparams.y = (int)TypedValue.applyDimension(1, 85F, mMetrics);
            layoutparams.dimAmount = 0.0F;
            window.setAttributes(layoutparams);
            window.clearFlags(2);
            window.setFlags(32, 32);
            if (mEnterAnimatable.getAndSet(false))
            {
                mDialogLayout.startAnimation(mAnimIn);
            }
            window.setFlags(1024, 1024);
        }

        private void createAnimations()
        {
            mAnimIn = new TranslateAnimation(2, -1F, 2, 0.0F, 2, 0.0F, 2, 0.0F);
            mAnimIn.setDuration(250L);
            mAnimOut = new TranslateAnimation(2, 0.0F, 2, -1F, 2, 0.0F, 2, 0.0F);
            mAnimOut.setDuration(250L);
            mAnimOut.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                final TestModeDialog this$1;

                public void onAnimationEnd(Animation animation)
                {
                    dismiss();
                }

                public void onAnimationRepeat(Animation animation)
                {
                }

                public void onAnimationStart(Animation animation)
                {
                }

            
            {
                this$1 = TestModeDialog.this;
                super();
            }
            });
        }

        private void setupViews()
        {
            mDialogLayout = new RelativeLayout(getContext());
            Object obj = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(13);
            mDialogLayout.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            obj = new Button(getContext(), null);
            ((Button) (obj)).setOnClickListener(new android.view.View.OnClickListener() {

                final TestModeDialog this$1;

                public void onClick(View view)
                {
                    mDialogLayout.startAnimation(mAnimOut);
                    if (mCallbacks != null)
                    {
                        view = (AmpCallable)mCallbacks.get(Integer.valueOf(9));
                        if (view != null)
                        {
                            view.call(null);
                        }
                    }
                }

            
            {
                this$1 = TestModeDialog.this;
                super();
            }
            });
            mDialogLayout.addView(((View) (obj)));
            requestWindowFeature(1);
            setContentView(mDialogLayout);
        }

        public boolean onKeyDown(int i, KeyEvent keyevent)
        {
            if (i == 4)
            {
                mDialogLayout.startAnimation(mAnimOut);
            }
            return super.onKeyDown(i, keyevent);
        }



        public TestModeDialog(Context context, int i)
        {
            this$0 = TestModeButton.this;
            super(context, i);
            setupViews();
            createAnimations();
            adjustLayout();
        }
    }

    class TestModeDialog.Button extends View
    {

        private static final int HEIGHT = 60;
        private static final int WIDTH = 60;
        private final int BACKGROUND_COLOR = Color.argb(255, 51, 51, 51);
        private final int BAR1_COLOR = Color.argb(255, 138, 138, 138);
        private final int BAR2_COLOR = Color.argb(255, 217, 217, 217);
        private final int BAR3_COLOR = Color.argb(255, 220, 220, 220);
        private final int OVAL_COLOR = Color.argb(255, 70, 70, 70);
        private Paint mPaint;
        private RectF mRectF;
        final TestModeDialog this$1;

        protected void onDraw(Canvas canvas)
        {
            super.onDraw(canvas);
            float f = getResources().getDisplayMetrics().density;
            mPaint.setColor(BACKGROUND_COLOR);
            canvas.drawRect(0.0F, 0.0F, 60F * f, 60F * f, mPaint);
            canvas.drawRoundRect(mRectF, 5F * f, 5F * f, mPaint);
            mPaint.setColor(BAR1_COLOR);
            canvas.drawRect(7F * f, 42F * f, 13F * f, 48F * f, mPaint);
            mPaint.setColor(BAR2_COLOR);
            canvas.drawRect(16F * f, 36F * f, 22F * f, 48F * f, mPaint);
            mPaint.setColor(BAR3_COLOR);
            canvas.drawRect(25F * f, 27F * f, 31F * f, 48F * f, mPaint);
            mPaint.setColor(-1);
            canvas.drawRect(34F * f, 12F * f, 40F * f, 48F * f, mPaint);
            mPaint.setColor(-1);
            canvas.drawRect(37F * f, 42F * f, 55F * f, 48F * f, mPaint);
            mPaint.setColor(OVAL_COLOR);
            canvas.drawOval(new RectF(59F * f, 40F * f, 63F * f, 44F * f), mPaint);
            canvas.drawOval(new RectF(59F * f, 30F * f, 63F * f, 34F * f), mPaint);
            canvas.drawOval(new RectF(59F * f, 20F * f, 63F * f, 24F * f), mPaint);
            canvas.drawOval(new RectF(59F * f, 10F * f, 63F * f, 14F * f), mPaint);
            canvas.drawOval(new RectF(54F * f, 35F * f, 58F * f, 39F * f), mPaint);
            canvas.drawOval(new RectF(54F * f, 25F * f, 58F * f, 29F * f), mPaint);
            canvas.drawOval(new RectF(54F * f, 15F * f, 58F * f, 19F * f), mPaint);
        }

        public TestModeDialog.Button(Context context, AttributeSet attributeset)
        {
            this$1 = TestModeDialog.this;
            super(context, attributeset);
            if (DatapointHelper.getApiLevel() >= 19)
            {
                setLayerType(1, null);
            }
            float f = getResources().getDisplayMetrics().density;
            mRectF = new RectF(55F * f, 0.0F, 65F * f, 60F * f);
            setLayoutParams(new android.widget.RelativeLayout.LayoutParams((int)(65F * f + 0.5F), (int)(60F * f + 0.5F)));
            mPaint = new Paint(1);
            mPaint.setColor(BACKGROUND_COLOR);
            mPaint.setStyle(android.graphics.Paint.Style.FILL);
        }
    }


    public static final String TEST_MODE_BUTTON_TAG = "amp_test_mode_button";
    private Map mCallbacks;
    private AtomicBoolean mEnterAnimatable;

    public TestModeButton()
    {
        mEnterAnimatable = new AtomicBoolean(true);
    }

    public static TestModeButton newInstance()
    {
        TestModeButton testmodebutton = new TestModeButton();
        testmodebutton.setRetainInstance(true);
        return testmodebutton;
    }

    public void onActivityCreated(Bundle bundle)
    {
        if (Constants.IS_LOGGABLE)
        {
            Log.w("TestModeButton", "onActivityCreated");
        }
        super.onActivityCreated(bundle);
    }

    public void onAttach(Activity activity)
    {
        if (Constants.IS_LOGGABLE)
        {
            Log.w("TestModeButton", "onAttach");
        }
        super.onAttach(activity);
    }

    public void onCreate(Bundle bundle)
    {
        if (Constants.IS_LOGGABLE)
        {
            Log.w("TestModeButton", "onCreate");
        }
        super.onCreate(bundle);
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        if (Constants.IS_LOGGABLE)
        {
            Log.w("TestModeButton", "onCreateDialog");
        }
        return new TestModeDialog(getActivity(), 0x103000b);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        if (Constants.IS_LOGGABLE)
        {
            Log.w("TestModeButton", "onCreateView");
        }
        return super.onCreateView(layoutinflater, viewgroup, bundle);
    }

    public void onDestroy()
    {
        if (Constants.IS_LOGGABLE)
        {
            Log.w("TestModeButton", "onDestroy");
        }
        super.onDestroy();
    }

    public void onDestroyView()
    {
        if (Constants.IS_LOGGABLE)
        {
            Log.w("TestModeButton", "onDestroyView");
        }
        if (getDialog() != null && getRetainInstance())
        {
            getDialog().setOnDismissListener(null);
        }
        super.onDestroyView();
    }

    public void onDetach()
    {
        if (Constants.IS_LOGGABLE)
        {
            Log.w("TestModeButton", "onDetach");
        }
        super.onDetach();
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        if (Constants.IS_LOGGABLE)
        {
            Log.w("TestModeButton", "onDismiss");
        }
        super.onDismiss(dialoginterface);
    }

    public void onPause()
    {
        if (Constants.IS_LOGGABLE)
        {
            Log.w("TestModeButton", "onPause");
        }
        super.onPause();
    }

    public void onResume()
    {
        if (Constants.IS_LOGGABLE)
        {
            Log.w("AmpTestButtonFragment", "onResume");
        }
        super.onResume();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        if (Constants.IS_LOGGABLE)
        {
            Log.w("TestModeButton", "onSaveInstanceState");
        }
        super.onSaveInstanceState(bundle);
    }

    public void onStart()
    {
        if (Constants.IS_LOGGABLE)
        {
            Log.w("TestModeButton", "onStart");
        }
        super.onStart();
    }

    public void onStop()
    {
        if (Constants.IS_LOGGABLE)
        {
            Log.w("TestModeButton", "onStop");
        }
        super.onStop();
    }

    public void onViewStateRestored(Bundle bundle)
    {
        if (Constants.IS_LOGGABLE)
        {
            Log.w("TestModeButton", "onViewStateRestored");
        }
        super.onViewStateRestored(bundle);
    }

    public TestModeButton setCallbacks(Map map)
    {
        mCallbacks = map;
        return this;
    }

    public void show(FragmentManager fragmentmanager, String s)
    {
        mEnterAnimatable.set(true);
        super.show(fragmentmanager, s);
    }


}
