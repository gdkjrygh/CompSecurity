// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Plugins.Components;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class AppHeader extends RelativeLayout
{
    public static final class HeaderButtonColors extends Enum
    {

        private static final HeaderButtonColors $VALUES[];
        public static final HeaderButtonColors BLUE;
        public static final HeaderButtonColors RED;

        public static HeaderButtonColors valueOf(String s)
        {
            return (HeaderButtonColors)Enum.valueOf(com/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderButtonColors, s);
        }

        public static HeaderButtonColors[] values()
        {
            return (HeaderButtonColors[])$VALUES.clone();
        }

        static 
        {
            RED = new HeaderButtonColors("RED", 0);
            BLUE = new HeaderButtonColors("BLUE", 1);
            $VALUES = (new HeaderButtonColors[] {
                RED, BLUE
            });
        }

        private HeaderButtonColors(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class HeaderLeftButtons extends Enum
    {

        private static final HeaderLeftButtons $VALUES[];
        public static final HeaderLeftButtons BACK;
        public static final HeaderLeftButtons CLOSE;
        public static final HeaderLeftButtons MENU;

        public static HeaderLeftButtons valueOf(String s)
        {
            return (HeaderLeftButtons)Enum.valueOf(com/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderLeftButtons, s);
        }

        public static HeaderLeftButtons[] values()
        {
            return (HeaderLeftButtons[])$VALUES.clone();
        }

        static 
        {
            BACK = new HeaderLeftButtons("BACK", 0);
            MENU = new HeaderLeftButtons("MENU", 1);
            CLOSE = new HeaderLeftButtons("CLOSE", 2);
            $VALUES = (new HeaderLeftButtons[] {
                BACK, MENU, CLOSE
            });
        }

        private HeaderLeftButtons(String s, int i)
        {
            super(s, i);
        }
    }


    public static final int BACK = 1;
    public static final int BOLD = 1;
    public static final int BOLD_ITALIC = 3;
    public static final int CLOSE = 2;
    public static final int GLOBAL_HOME = 0;
    public static final int GLOBAL_UNKNOWN = 16;
    public static final int ITALIC = 2;
    public static final int MENU = 0;
    public static final int NAV_UNKNOWN = 16;
    public static final int NORMAL = 0;
    public static final String TAG = "AppHeader";
    public int backButtonResId;
    private boolean buried;
    public int homeButtonResId;
    private ImageButton mGlobalButton;
    private boolean mIsAppHeaderDisabled;
    private int mNavBtnColor;
    private ImageButton mNavButton;
    private int mNavOption;
    private String mText;
    private int mTextColor;
    private float mTextSize;
    private int mTextStyle;
    private TextView mTextView;
    public int menuButtonResId;
    public int xButtonResId;

    public AppHeader(Context context)
    {
        super(context);
        mIsAppHeaderDisabled = false;
        buried = false;
        Resources resources = getResources();
        mText = "";
        mTextSize = resources.getDimension(0x7f0a0004);
        mTextStyle = 1;
        mTextColor = resources.getColor(0x106000b);
        mNavOption = 0;
        View.inflate(context, 0x7f030002, this);
    }

    public AppHeader(Context context, AttributeSet attributeset)
    {
        Resources resources;
        super(context, attributeset);
        mIsAppHeaderDisabled = false;
        buried = false;
        attributeset = context.getTheme().obtainStyledAttributes(attributeset, com.konylabs.capitalone.R.styleable.C1Attrs, 0, 0);
        resources = getResources();
        mText = attributeset.getString(4);
        if (mText == null)
        {
            mText = "";
        }
        mTextSize = attributeset.getDimension(1, resources.getDimension(0x7f0a0004));
        mTextStyle = attributeset.getInt(2, 0);
        mTextColor = attributeset.getColor(3, resources.getColor(0x106000b));
        mNavOption = attributeset.getInt(9, 0);
        mNavBtnColor = attributeset.getInt(10, 0);
        attributeset.recycle();
        View.inflate(context, 0x7f030002, this);
        return;
        context;
        attributeset.recycle();
        throw context;
    }

    public void buryNavButton()
    {
        buried = true;
        if (mNavButton.getVisibility() != 4)
        {
            mNavButton.setVisibility(4);
            postInvalidate();
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        if (!mIsAppHeaderDisabled)
        {
            return super.dispatchTouchEvent(motionevent);
        } else
        {
            return mIsAppHeaderDisabled;
        }
    }

    public ImageButton getGlobalButton()
    {
        return mGlobalButton;
    }

    public ImageButton getNavButton()
    {
        return mNavButton;
    }

    public int getNavOption()
    {
        return mNavOption;
    }

    public String getText()
    {
        return mText;
    }

    public int getTextColor()
    {
        return mTextColor;
    }

    public float getTextSize()
    {
        return mTextSize;
    }

    public int getTextStyle()
    {
        return mTextStyle;
    }

    public boolean hasBack()
    {
        return mNavOption == 1 && mNavButton.getVisibility() == 0;
    }

    public boolean hasClose()
    {
        return mNavOption == 2 && mNavButton.getVisibility() == 0;
    }

    public boolean hasMenu()
    {
        return mNavOption == 0 && mNavButton.getVisibility() == 0;
    }

    public void hideGlobalButton()
    {
        mGlobalButton.setVisibility(8);
    }

    public void hideNavButton()
    {
        buried = false;
        if (mNavButton.getVisibility() != 8)
        {
            mNavButton.setVisibility(8);
            postInvalidate();
        }
    }

    public boolean isAppHeaderDisabled()
    {
        return mIsAppHeaderDisabled;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        mGlobalButton = (ImageButton)findViewById(0x7f080021);
        mNavButton = (ImageButton)findViewById(0x7f080020);
        setNavOption(mNavOption);
        if (mNavBtnColor == 0)
        {
            setNavButtonColor(HeaderButtonColors.BLUE);
        } else
        {
            setNavButtonColor(HeaderButtonColors.RED);
        }
        mTextView = (TextView)findViewById(0x7f08001f);
        setText(mText);
        setTextSize(mTextSize);
        setTextColor(mTextColor);
        setTextStyle(mTextStyle);
        mTextView.bringToFront();
    }

    public void setAppHeaderDisabled(boolean flag)
    {
        mIsAppHeaderDisabled = flag;
    }

    public void setHasHomeButton(boolean flag)
    {
        if (flag)
        {
            mGlobalButton.setImageResource(homeButtonResId);
            mGlobalButton.setVisibility(0);
            return;
        } else
        {
            mGlobalButton.setVisibility(8);
            return;
        }
    }

    public void setNavButtonColor(HeaderButtonColors headerbuttoncolors)
    {
        if (headerbuttoncolors != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        boolean flag = false;
        static class _cls1
        {

            static final int $SwitchMap$com$EnterpriseMobileBanking$Plugins$Components$AppHeader$HeaderButtonColors[];

            static 
            {
                $SwitchMap$com$EnterpriseMobileBanking$Plugins$Components$AppHeader$HeaderButtonColors = new int[HeaderButtonColors.values().length];
                try
                {
                    $SwitchMap$com$EnterpriseMobileBanking$Plugins$Components$AppHeader$HeaderButtonColors[HeaderButtonColors.RED.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$EnterpriseMobileBanking$Plugins$Components$AppHeader$HeaderButtonColors[HeaderButtonColors.BLUE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.EnterpriseMobileBanking.Plugins.Components.AppHeader.HeaderButtonColors[headerbuttoncolors.ordinal()];
        JVM INSTR tableswitch 1 2: default 36
    //                   1 58
    //                   2 87;
           goto _L3 _L4 _L5
_L3:
        if (flag)
        {
            if (hasBack())
            {
                setNavOption(1);
            } else
            {
                setNavOption(0);
            }
            setHasHomeButton(true);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
        backButtonResId = 0x7f0200a5;
        menuButtonResId = 0x7f0200ba;
        xButtonResId = 0x7f0200ae;
        homeButtonResId = 0x7f0200b3;
        flag = true;
          goto _L3
_L5:
        backButtonResId = 0x7f0200a4;
        menuButtonResId = 0x7f0200b9;
        xButtonResId = 0x7f0200ad;
        homeButtonResId = 0x7f0200b2;
        flag = true;
          goto _L3
    }

    public void setNavOption(int i)
    {
        String s;
        s = "";
        if (buried)
        {
            mNavButton.setVisibility(4);
        }
        i;
        JVM INSTR tableswitch 0 2: default 44
    //                   0 162
    //                   1 103
    //                   2 202;
           goto _L1 _L2 _L3 _L4
_L1:
        postInvalidate();
        String s1 = s;
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            s1 = (new StringBuilder()).append(s).append(" ").append(getResources().getString(0x7f09012e)).toString();
        }
        findViewById(0x7f080020).setContentDescription(s1);
        return;
_L3:
        mNavOption = 1;
        mNavButton.setImageResource(backButtonResId);
        mNavButton.setTag("back");
        String s2 = getResources().getString(0x7f09012a);
        s = s2;
        if (buried)
        {
            mNavButton.setVisibility(0);
            s = s2;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        mNavOption = 0;
        mNavButton.setImageResource(menuButtonResId);
        mNavButton.setTag("menu");
        s = getResources().getString(0x7f090128);
        continue; /* Loop/switch isn't completed */
_L4:
        mNavOption = 2;
        mNavButton.setImageResource(xButtonResId);
        mNavButton.setTag("close");
        s = getResources().getString(0x7f09012c);
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void setOnGlobalButtonClick(android.view.View.OnClickListener onclicklistener)
    {
        mGlobalButton.setOnClickListener(onclicklistener);
    }

    public void setOnNavOptionClick(android.view.View.OnClickListener onclicklistener)
    {
        mNavButton.setOnClickListener(onclicklistener);
    }

    public void setText(String s)
    {
        mText = s;
        mTextView.setText(mText);
    }

    public void setTextColor(int i)
    {
        mTextColor = i;
        mTextView.setTextColor(mTextColor);
    }

    public void setTextSize(float f)
    {
        mTextSize = f;
        mTextView.setTextSize(0, mTextSize);
    }

    public void setTextStyle(int i)
    {
        mTextStyle = i;
        mTextView.setTypeface(mTextView.getTypeface(), mTextStyle);
    }

    public void showGlobalButton()
    {
        mGlobalButton.setVisibility(0);
    }

    public void showNavButton()
    {
        buried = false;
        if (mNavButton.getVisibility() != 0)
        {
            mNavButton.setVisibility(0);
            postInvalidate();
        }
    }
}
