// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.common.ui.toast;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.kohls.mcommerce.opal.common.util.Logger;

// Referenced classes of package com.kohls.mcommerce.opal.common.ui.toast:
//            ManagerCustomToast, Style

public class KohlsToast
{

    private static final String TAG = "KohlsToast";
    private Animations mAnimations;
    private int mBackground;
    private Context mContext;
    private int mDuration;
    private int mGravity;
    private TextView mMessageTextView;
    private LinearLayout mRootLayout;
    private View mToastView;
    private int mTypefaceStyle;
    private WindowManager mWindowManager;
    private android.view.WindowManager.LayoutParams mWindowManagerParams;
    private int mXOffset;
    private int mYOffset;

    public KohlsToast(Context context)
    {
    /* block-local class not found */
    class Animations {}

        mAnimations = Animations.FADE;
        mGravity = 80;
        mDuration = 1500;
        mXOffset = 0;
        mYOffset = 0;
        if (context == null)
        {
            throw new IllegalArgumentException("KohlsToastContext is null");
        } else
        {
            mContext = context;
            mYOffset = context.getResources().getDimensionPixelSize(0x7f090124);
            mToastView = ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(0x7f030093, null);
            mWindowManager = (WindowManager)mToastView.getContext().getApplicationContext().getSystemService("window");
            mRootLayout = (LinearLayout)mToastView.findViewById(0x7f0d0384);
            mMessageTextView = (TextView)mToastView.findViewById(0x7f0d0385);
            return;
        }
    }

    public KohlsToast(Context context, Style style)
    {
        mAnimations = Animations.FADE;
        mGravity = 80;
        mDuration = 1500;
        mXOffset = 0;
        mYOffset = 0;
        if (context == null)
        {
            throw new IllegalArgumentException("KohlsToastContext is null");
        } else
        {
            mContext = context;
            mYOffset = context.getResources().getDimensionPixelSize(0x7f090124);
            mToastView = ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(0x7f030093, null);
            mWindowManager = (WindowManager)mToastView.getContext().getApplicationContext().getSystemService("window");
            mRootLayout = (LinearLayout)mToastView.findViewById(0x7f0d0384);
            mMessageTextView = (TextView)mToastView.findViewById(0x7f0d0385);
            setStyle(style);
            return;
        }
    }

    public static void cancelAllSuperToasts()
    {
        ManagerCustomToast.getInstance().cancelAllCustomToasts();
    }

    public static KohlsToast create(Context context, CharSequence charsequence, int i)
    {
        context = new KohlsToast(context);
        context.setText(charsequence);
        context.setDuration(i);
        return context;
    }

    public static KohlsToast create(Context context, CharSequence charsequence, int i, Animations animations)
    {
        context = new KohlsToast(context);
        context.setText(charsequence);
        context.setDuration(i);
        context.setAnimations(animations);
        return context;
    }

    public static KohlsToast create(Context context, CharSequence charsequence, int i, Style style)
    {
        context = new KohlsToast(context);
        context.setText(charsequence);
        context.setDuration(i);
        context.setStyle(style);
        return context;
    }

    private int getAnimation()
    {
        if (mAnimations == Animations.FLYIN)
        {
            return 0x1030003;
        }
        if (mAnimations == Animations.SCALE)
        {
            return 0x1030002;
        }
        return mAnimations != Animations.POPUP ? 0x1030004 : 0x1030056;
    }

    private void setStyle(Style style)
    {
        setAnimations(style.animations);
        setTypefaceStyle(style.typefaceStyle);
        setTextColor(style.textColor);
        setBackground(style.background);
    }

    public void dismiss()
    {
        ManagerCustomToast.getInstance().removeCustomToast(this);
    }

    public Animations getAnimations()
    {
        return mAnimations;
    }

    public int getBackground()
    {
        return mBackground;
    }

    public int getDuration()
    {
        return mDuration;
    }

    public CharSequence getText()
    {
        return mMessageTextView.getText();
    }

    public int getTextColor()
    {
        return mMessageTextView.getCurrentTextColor();
    }

    public float getTextSize()
    {
        return mMessageTextView.getTextSize();
    }

    public TextView getTextView()
    {
        return mMessageTextView;
    }

    public int getTypefaceStyle()
    {
        return mTypefaceStyle;
    }

    public View getView()
    {
        return mToastView;
    }

    public WindowManager getWindowManager()
    {
        return mWindowManager;
    }

    public android.view.WindowManager.LayoutParams getWindowManagerParams()
    {
        return mWindowManagerParams;
    }

    public boolean isShowing()
    {
        return mToastView != null && mToastView.isShown();
    }

    public void setAnimations(Animations animations)
    {
        mAnimations = animations;
    }

    public void setBackground(int i)
    {
        mBackground = i;
        mRootLayout.setBackgroundResource(i);
    }

    public void setDuration(int i)
    {
        Logger.error("KohlsToast", (new StringBuilder()).append("Duration ::: ").append(i).toString());
        mDuration = i;
    }

    public void setGravity(int i, int j, int k)
    {
        mGravity = i;
        mXOffset = j;
        mYOffset = k;
    }

    public void setIcon(int i, IconPosition iconposition)
    {
    /* block-local class not found */
    class IconPosition {}

        if (iconposition == IconPosition.LEFT)
        {
            mMessageTextView.setCompoundDrawablesWithIntrinsicBounds(mContext.getResources().getDrawable(0x7f020160), null, null, null);
        } else
        if (iconposition == IconPosition.RIGHT)
        {
            mMessageTextView.setCompoundDrawablesWithIntrinsicBounds(null, null, mContext.getResources().getDrawable(i), null);
            return;
        }
    }

    public void setText(CharSequence charsequence)
    {
        mMessageTextView.setText(charsequence);
    }

    public void setTextColor(int i)
    {
        mMessageTextView.setTextColor(i);
    }

    public void setTextGravity(int i)
    {
        mMessageTextView.setGravity(i);
    }

    public void setTextSize(int i)
    {
        mMessageTextView.setTextSize(i);
    }

    public void setTypefaceStyle(int i)
    {
        mTypefaceStyle = i;
        mMessageTextView.setTypeface(mMessageTextView.getTypeface(), i);
    }

    public void show()
    {
        mWindowManagerParams = new android.view.WindowManager.LayoutParams();
        mWindowManagerParams.height = -2;
        mWindowManagerParams.width = -1;
        mWindowManagerParams.flags = 152;
        mWindowManagerParams.format = -3;
        mWindowManagerParams.windowAnimations = getAnimation();
        mWindowManagerParams.type = 2005;
        mWindowManagerParams.gravity = mGravity;
        mWindowManagerParams.x = mXOffset;
        mWindowManagerParams.y = mYOffset;
        ManagerCustomToast.getInstance().add(this);
    }

    // Unreferenced inner class com/kohls/mcommerce/opal/common/ui/toast/KohlsToast$Background
    /* block-local class not found */
    class Background {}


    // Unreferenced inner class com/kohls/mcommerce/opal/common/ui/toast/KohlsToast$Duration
    /* block-local class not found */
    class Duration {}


    // Unreferenced inner class com/kohls/mcommerce/opal/common/ui/toast/KohlsToast$TextSize
    /* block-local class not found */
    class TextSize {}

}
