// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.QuickAction;

import android.content.Context;
import android.graphics.Rect;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;

// Referenced classes of package com.QRBS.QuickAction:
//            PopupWindows, ActionItem

public class QuickAction extends PopupWindows
{
    public static interface OnActionItemClickListener
    {

        public abstract void onItemClick(int i);
    }


    public static final int ANIM_AUTO = 4;
    public static final int ANIM_GROW_FROM_CENTER = 3;
    public static final int ANIM_GROW_FROM_LEFT = 1;
    public static final int ANIM_GROW_FROM_RIGHT = 2;
    private int animStyle;
    private boolean animateTrack;
    private LayoutInflater inflater;
    private ImageView mArrowDown;
    private ImageView mArrowUp;
    private int mChildPos;
    private OnActionItemClickListener mListener;
    private ViewGroup mTrack;
    private Animation mTrackAnim;

    public QuickAction(Context context)
    {
        super(context);
        inflater = (LayoutInflater)context.getSystemService("layout_inflater");
        mTrackAnim = AnimationUtils.loadAnimation(context, 0x7f040006);
        mTrackAnim.setInterpolator(new Interpolator() {

            final QuickAction this$0;

            public float getInterpolation(float f)
            {
                f = 1.55F * f - 1.1F;
                return 1.2F - f * f;
            }

            
            {
                this$0 = QuickAction.this;
                super();
            }
        });
        setRootViewId(0x7f030036);
        animStyle = 4;
        animateTrack = true;
        mChildPos = 0;
    }

    private void setAnimationStyle(int i, int j, boolean flag)
    {
        int l = 0x7f07006a;
        int k = 0x7f070068;
        j -= mArrowUp.getMeasuredWidth() / 2;
        switch (animStyle)
        {
        default:
            return;

        case 1: // '\001'
            PopupWindow popupwindow = mWindow;
            if (!flag)
            {
                k = 0x7f070064;
            }
            popupwindow.setAnimationStyle(k);
            return;

        case 2: // '\002'
            PopupWindow popupwindow1 = mWindow;
            if (flag)
            {
                i = 0x7f070069;
            } else
            {
                i = 0x7f070065;
            }
            popupwindow1.setAnimationStyle(i);
            return;

        case 3: // '\003'
            PopupWindow popupwindow2 = mWindow;
            if (flag)
            {
                i = 0x7f07006a;
            } else
            {
                i = 0x7f070066;
            }
            popupwindow2.setAnimationStyle(i);
            return;

        case 4: // '\004'
            break;
        }
        if (j <= i / 4)
        {
            PopupWindow popupwindow3 = mWindow;
            if (!flag)
            {
                k = 0x7f070064;
            }
            popupwindow3.setAnimationStyle(k);
            return;
        }
        if (j > i / 4 && j < (i / 4) * 3)
        {
            PopupWindow popupwindow4 = mWindow;
            if (flag)
            {
                i = l;
            } else
            {
                i = 0x7f070066;
            }
            popupwindow4.setAnimationStyle(i);
            return;
        } else
        {
            PopupWindow popupwindow5 = mWindow;
            if (!flag);
            popupwindow5.setAnimationStyle(0x7f070065);
            return;
        }
    }

    private void showArrow(int i, int j)
    {
        ImageView imageview;
        ImageView imageview1;
        if (i == 0x7f0d00b7)
        {
            imageview = mArrowUp;
        } else
        {
            imageview = mArrowDown;
        }
        if (i == 0x7f0d00b7)
        {
            imageview1 = mArrowDown;
        } else
        {
            imageview1 = mArrowUp;
        }
        i = mArrowUp.getMeasuredWidth();
        imageview.setVisibility(0);
        ((android.view.ViewGroup.MarginLayoutParams)imageview.getLayoutParams()).leftMargin = j - i / 2;
        imageview1.setVisibility(4);
    }

    public void addActionItem(ActionItem actionitem)
    {
        String s = actionitem.getTitle();
        actionitem = actionitem.getIcon();
        View view = inflater.inflate(0x7f030015, null);
        ImageView imageview = (ImageView)view.findViewById(0x7f0d004b);
        TextView textview = (TextView)view.findViewById(0x7f0d004c);
        if (actionitem != null)
        {
            imageview.setImageDrawable(actionitem);
        } else
        {
            imageview.setVisibility(8);
        }
        if (s != null)
        {
            textview.setText(s);
        } else
        {
            textview.setVisibility(8);
        }
        view.setOnClickListener(new android.view.View.OnClickListener() {

            final QuickAction this$0;
            private final int val$pos;

            public void onClick(View view1)
            {
                if (mListener != null)
                {
                    mListener.onItemClick(pos);
                }
                dismiss();
            }

            
            {
                this$0 = QuickAction.this;
                pos = i;
                super();
            }
        });
        view.setFocusable(true);
        view.setClickable(true);
        mTrack.addView(view, mChildPos + 1);
        mChildPos = mChildPos + 1;
    }

    public void animateTrack(boolean flag)
    {
        animateTrack = flag;
    }

    public void setAnimStyle(int i)
    {
        animStyle = i;
    }

    public void setOnActionItemClickListener(OnActionItemClickListener onactionitemclicklistener)
    {
        mListener = onactionitemclicklistener;
    }

    public void setRootViewId(int i)
    {
        mRootView = (ViewGroup)inflater.inflate(i, null);
        mTrack = (ViewGroup)mRootView.findViewById(0x7f0d00b6);
        mArrowDown = (ImageView)mRootView.findViewById(0x7f0d00b8);
        mArrowUp = (ImageView)mRootView.findViewById(0x7f0d00b7);
        setContentView(mRootView);
    }

    public void show(View view)
    {
        preShow();
        int ai[] = new int[2];
        view.getLocationOnScreen(ai);
        Rect rect = new Rect(ai[0], ai[1], ai[0] + view.getWidth(), ai[1] + view.getHeight());
        mRootView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
        mRootView.measure(-2, -2);
        int i = mRootView.getMeasuredWidth();
        int j = mRootView.getMeasuredHeight();
        int k = mWindowManager.getDefaultDisplay().getWidth();
        int l = (k - i) / 2;
        i = rect.top - j;
        boolean flag = true;
        if (j > view.getTop())
        {
            i = rect.bottom;
            flag = false;
        }
        if (flag)
        {
            j = 0x7f0d00b8;
        } else
        {
            j = 0x7f0d00b7;
        }
        showArrow(j, rect.centerX());
        setAnimationStyle(k, rect.centerX(), flag);
        mWindow.showAtLocation(view, 0, l, i);
        if (animateTrack)
        {
            mTrack.startAnimation(mTrackAnim);
        }
    }

}
