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
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.QRBS.QuickAction:
//            MyPopupWindow, QuickActionItem

public class QuickActionPopup extends MyPopupWindow
    implements android.widget.PopupWindow.OnDismissListener
{
    public static interface OnActionItemClickListener
    {

        public abstract void onItemClick(QuickActionPopup quickactionpopup, int i, int j);
    }

    public static interface OnDismissListener
    {

        public abstract void onDismiss();
    }


    public static final int ANIM_GROW_FROM_LEFT = 1;
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;
    private List actionItems;
    private int mAnimStyle;
    private ImageView mArrowDown;
    private ImageView mArrowUp;
    private int mChildPos;
    private boolean mDidAction;
    private OnDismissListener mDismissListener;
    private LayoutInflater mInflater;
    private int mInsertPos;
    private OnActionItemClickListener mItemClickListener;
    private int mOrientation;
    private View mRootView;
    private ScrollView mScroller;
    private ViewGroup mTrack;
    private boolean reverseOrientationItem;
    private int rootWidth;

    public QuickActionPopup(Context context)
    {
        this(context, 1);
    }

    public QuickActionPopup(Context context, int i)
    {
        super(context);
        actionItems = new ArrayList();
        reverseOrientationItem = false;
        rootWidth = 0;
        mOrientation = i;
        mInflater = (LayoutInflater)context.getSystemService("layout_inflater");
        if (mOrientation == 0)
        {
            setRootViewId(0x7f030034);
        } else
        {
            setRootViewId(0x7f030035);
        }
        mAnimStyle = 1;
        mChildPos = 0;
    }

    private void setAnimationStyle(int i, int j, boolean flag)
    {
        i = mArrowUp.getMeasuredWidth() / 2;
        PopupWindow popupwindow;
        switch (mAnimStyle)
        {
        default:
            return;

        case 1: // '\001'
            popupwindow = mWindow;
            break;
        }
        if (flag)
        {
            i = 0x7f070068;
        } else
        {
            i = 0x7f070064;
        }
        popupwindow.setAnimationStyle(i);
    }

    private void setRootViewId(int i)
    {
        mRootView = (ViewGroup)mInflater.inflate(i, null);
        mTrack = (ViewGroup)mRootView.findViewById(0x7f0d00b6);
        mArrowDown = (ImageView)mRootView.findViewById(0x7f0d00b8);
        mArrowUp = (ImageView)mRootView.findViewById(0x7f0d00b7);
        mScroller = (ScrollView)mRootView.findViewById(0x7f0d00b5);
        mRootView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
        setContentView(mRootView);
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

    public void addActionItem(QuickActionItem quickactionitem)
    {
        actionItems.add(quickactionitem);
        String s = quickactionitem.getTitle();
        android.graphics.drawable.Drawable drawable = quickactionitem.getIcon();
        View view;
        ImageView imageview;
        TextView textview;
        if (mOrientation == 0 && !reverseOrientationItem)
        {
            view = mInflater.inflate(0x7f030016, null);
        } else
        {
            view = mInflater.inflate(0x7f030017, null);
        }
        imageview = (ImageView)view.findViewById(0x7f0d004b);
        textview = (TextView)view.findViewById(0x7f0d004c);
        if (drawable != null)
        {
            imageview.setImageDrawable(drawable);
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

            final QuickActionPopup this$0;
            private final int val$actionId;
            private final int val$pos;

            public void onClick(View view1)
            {
                if (mItemClickListener != null)
                {
                    mItemClickListener.onItemClick(QuickActionPopup.this, pos, actionId);
                }
                if (!getActionItem(pos).isSticky())
                {
                    mDidAction = true;
                    dismiss();
                }
            }

            
            {
                this$0 = QuickActionPopup.this;
                pos = i;
                actionId = j;
                super();
            }
        });
        view.setFocusable(true);
        view.setClickable(true);
        mTrack.addView(view, mInsertPos);
        mChildPos = mChildPos + 1;
        mInsertPos = mInsertPos + 1;
    }

    public QuickActionItem getActionItem(int i)
    {
        return (QuickActionItem)actionItems.get(i);
    }

    public boolean isReverseOrientationItem()
    {
        return reverseOrientationItem;
    }

    public void onDismiss()
    {
        if (!mDidAction && mDismissListener != null)
        {
            mDismissListener.onDismiss();
        }
    }

    public void setAnimStyle(int i)
    {
        mAnimStyle = i;
    }

    public void setBackgroundResources(int i, int j, int k)
    {
        if (i != 0 && j != 0 && k != 0)
        {
            mScroller.setBackgroundResource(i);
            mArrowDown.setImageResource(k);
            mArrowUp.setImageResource(j);
        }
    }

    public void setOnActionItemClickListener(OnActionItemClickListener onactionitemclicklistener)
    {
        mItemClickListener = onactionitemclicklistener;
    }

    public void setOnDismissListener(OnDismissListener ondismisslistener)
    {
        setOnDismissListener(((android.widget.PopupWindow.OnDismissListener) (this)));
        mDismissListener = ondismisslistener;
    }

    public void setReverseOrientationItem(boolean flag)
    {
        reverseOrientationItem = flag;
    }

    public void show(View view)
    {
        preShow();
        mDidAction = false;
        int ai[] = new int[2];
        view.getLocationOnScreen(ai);
        Rect rect = new Rect(ai[0], ai[1], ai[0] + view.getWidth(), ai[1] + view.getHeight());
        mRootView.measure(-2, -2);
        int k1 = mRootView.getMeasuredHeight();
        if (rootWidth == 0)
        {
            rootWidth = mRootView.getMeasuredWidth();
        }
        int j1 = mWindowManager.getDefaultDisplay().getWidth();
        int i1 = mWindowManager.getDefaultDisplay().getHeight();
        int j;
        int k;
        int l;
        int l1;
        int i2;
        boolean flag;
        if (rect.left + rootWidth > j1)
        {
            k = rect.left - (rootWidth - view.getWidth());
            int i = k;
            if (k < 0)
            {
                i = 0;
            }
            k = rect.centerX() - i;
            l = i;
        } else
        {
            if (view.getWidth() > rootWidth)
            {
                j = rect.centerX() - rootWidth / 2;
            } else
            {
                j = rect.left;
            }
            k = rect.centerX() - j;
            l = j;
        }
        l1 = rect.top;
        i2 = i1 - rect.bottom;
        if (l1 > i2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            if (k1 > l1)
            {
                j = 15;
                mScroller.getLayoutParams().height = l1 - view.getHeight();
            } else
            {
                j = rect.top - k1;
            }
        } else
        {
            i1 = rect.bottom;
            j = i1;
            if (k1 > i2)
            {
                mScroller.getLayoutParams().height = i2;
                j = i1;
            }
        }
        if (flag)
        {
            i1 = 0x7f0d00b8;
        } else
        {
            i1 = 0x7f0d00b7;
        }
        showArrow(i1, k);
        setAnimationStyle(j1, rect.centerX(), flag);
        mWindow.showAtLocation(view, 0, l, j);
    }


}
