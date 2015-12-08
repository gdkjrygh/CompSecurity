// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.drawer;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;

class PlayDrawerDownloadSwitchRow extends RelativeLayout
    implements android.view.View.OnClickListener, Checkable, android.widget.CompoundButton.OnCheckedChangeListener
{

    private static final boolean SUPPORTS_STYLED_SWITCH;
    private TextView mActionTextView;
    private boolean mBroadcasting;
    private boolean mChecked;
    private Switch mSwitch;
    private final android.view.View.OnTouchListener mSwitchTouchListener;
    private int mUncheckedTextColor;

    public PlayDrawerDownloadSwitchRow(Context context)
    {
        this(context, null);
    }

    public PlayDrawerDownloadSwitchRow(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mSwitchTouchListener = new android.view.View.OnTouchListener() {

            final PlayDrawerDownloadSwitchRow this$0;

            public final boolean onTouch(View view, MotionEvent motionevent)
            {
                if (motionevent.getActionMasked() == 0)
                {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                }
                return false;
            }

            
            {
                this$0 = PlayDrawerDownloadSwitchRow.this;
                super();
            }
        };
        mUncheckedTextColor = getResources().getColor(0x7f0b024b);
    }

    public boolean isChecked()
    {
        return mChecked;
    }

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        if (flag != mChecked)
        {
            setChecked(flag);
        }
    }

    public void onClick(View view)
    {
        toggle();
    }

    protected int[] onCreateDrawableState(int i)
    {
        int ai[] = super.onCreateDrawableState(i + 1);
        if (mChecked)
        {
            mergeDrawableStates(ai, new int[] {
                0x1010106
            });
        }
        return ai;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        mActionTextView = (TextView)findViewById(0x7f0d01a3);
        setOnClickListener(this);
        View view = findViewById(0x7f0d0306);
        if (view != null)
        {
            mSwitch = (Switch)view;
            mSwitch.setOnCheckedChangeListener(this);
            mSwitch.setOnTouchListener(mSwitchTouchListener);
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        super.onInitializeAccessibilityEvent(accessibilityevent);
        accessibilityevent.setClassName(com/google/android/play/drawer/PlayDrawerDownloadSwitchRow.getName());
        accessibilityevent.setChecked(mChecked);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
    {
        super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
        accessibilitynodeinfo.setClassName(android/widget/CheckBox.getName());
        accessibilitynodeinfo.setCheckable(true);
        accessibilitynodeinfo.setChecked(mChecked);
    }

    public void setChecked(boolean flag)
    {
label0:
        {
            if (mChecked != flag)
            {
                mChecked = flag;
                if (SUPPORTS_STYLED_SWITCH && mSwitch != null)
                {
                    mSwitch.setChecked(flag);
                    mSwitch.refreshDrawableState();
                }
                TextView textview = mActionTextView;
                int i;
                if (flag)
                {
                    i = 0;
                } else
                {
                    i = mUncheckedTextColor;
                }
                textview.setTextColor(i);
                if (!mBroadcasting)
                {
                    break label0;
                }
            }
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            sendAccessibilityEvent(2048);
        }
        mBroadcasting = true;
        mBroadcasting = false;
    }

    public void toggle()
    {
        boolean flag;
        if (!mChecked)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setChecked(flag);
    }

    static 
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        SUPPORTS_STYLED_SWITCH = flag;
    }
}
