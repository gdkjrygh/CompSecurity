// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.support.v4.app.Fragment;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import com.facebook.appevents.AppEventsLogger;

// Referenced classes of package com.facebook:
//            FacebookException, FacebookSdk

public abstract class FacebookButtonBase extends Button
{

    private String analyticsButtonCreatedEventName;
    private android.view.View.OnClickListener externalOnClickListener;
    private android.view.View.OnClickListener internalOnClickListener;
    private boolean overrideCompoundPadding;
    private int overrideCompoundPaddingLeft;
    private int overrideCompoundPaddingRight;
    private Fragment parentFragment;
    private int requestCode;

    protected FacebookButtonBase(Context context, AttributeSet attributeset, int i, int j, String s, int k)
    {
        super(context, attributeset, 0);
        if (j == 0)
        {
            j = getDefaultStyleResource();
        }
        int l = j;
        if (j == 0)
        {
            l = R.style.com_facebook_button;
        }
        configureButton(context, attributeset, i, l);
        analyticsButtonCreatedEventName = s;
        requestCode = k;
    }

    private void logButtonCreated(Context context)
    {
        AppEventsLogger.newLogger(context).logSdkEvent(analyticsButtonCreatedEventName, null, null);
    }

    private void parseBackgroundAttributes(Context context, AttributeSet attributeset, int i, int j)
    {
        context = context.getTheme().obtainStyledAttributes(attributeset, new int[] {
            0x10100d4
        }, i, j);
        if (!context.hasValue(0))
        {
            break MISSING_BLOCK_LABEL_69;
        }
        i = context.getResourceId(0, 0);
        if (i == 0) goto _L2; else goto _L1
_L1:
        setBackgroundResource(i);
_L3:
        context.recycle();
        return;
_L2:
        setBackgroundColor(context.getColor(0, 0));
          goto _L3
        attributeset;
        context.recycle();
        throw attributeset;
        setBackgroundColor(context.getColor(0, R.color.com_facebook_blue));
          goto _L3
    }

    private void parseCompoundDrawableAttributes(Context context, AttributeSet attributeset, int i, int j)
    {
        context = context.getTheme().obtainStyledAttributes(attributeset, new int[] {
            0x101016f, 0x101016d, 0x1010170, 0x101016e, 0x1010171
        }, i, j);
        setCompoundDrawablesWithIntrinsicBounds(context.getResourceId(0, 0), context.getResourceId(1, 0), context.getResourceId(2, 0), context.getResourceId(3, 0));
        setCompoundDrawablePadding(context.getDimensionPixelSize(4, 0));
        context.recycle();
        return;
        attributeset;
        context.recycle();
        throw attributeset;
    }

    private void parseContentAttributes(Context context, AttributeSet attributeset, int i, int j)
    {
        context = context.getTheme().obtainStyledAttributes(attributeset, new int[] {
            0x10100d6, 0x10100d7, 0x10100d8, 0x10100d9
        }, i, j);
        setPadding(context.getDimensionPixelSize(0, 0), context.getDimensionPixelSize(1, 0), context.getDimensionPixelSize(2, 0), context.getDimensionPixelSize(3, 0));
        context.recycle();
        return;
        attributeset;
        context.recycle();
        throw attributeset;
    }

    private void parseTextAttributes(Context context, AttributeSet attributeset, int i, int j)
    {
        TypedArray typedarray = context.getTheme().obtainStyledAttributes(attributeset, new int[] {
            0x1010098
        }, i, j);
        setTextColor(typedarray.getColor(0, -1));
        typedarray.recycle();
        typedarray = context.getTheme().obtainStyledAttributes(attributeset, new int[] {
            0x10100af
        }, i, j);
        setGravity(typedarray.getInt(0, 17));
        typedarray.recycle();
        context = context.getTheme().obtainStyledAttributes(attributeset, new int[] {
            0x1010095, 0x1010097, 0x101014f
        }, i, j);
        setTextSize(0, context.getDimensionPixelSize(0, 0));
        setTypeface(Typeface.defaultFromStyle(context.getInt(1, 1)));
        setText(context.getString(2));
        context.recycle();
        return;
        context;
        typedarray.recycle();
        throw context;
        context;
        typedarray.recycle();
        throw context;
        attributeset;
        context.recycle();
        throw attributeset;
    }

    private void setupOnClickListener()
    {
        super.setOnClickListener(new _cls1());
    }

    protected void callExternalOnClickListener(View view)
    {
        if (externalOnClickListener != null)
        {
            externalOnClickListener.onClick(view);
        }
    }

    protected void configureButton(Context context, AttributeSet attributeset, int i, int j)
    {
        parseBackgroundAttributes(context, attributeset, i, j);
        parseCompoundDrawableAttributes(context, attributeset, i, j);
        parseContentAttributes(context, attributeset, i, j);
        parseTextAttributes(context, attributeset, i, j);
        setupOnClickListener();
    }

    protected Activity getActivity()
    {
        Context context = getContext();
        if (context instanceof Activity)
        {
            return (Activity)context;
        }
        if (context instanceof ContextWrapper)
        {
            context = ((ContextWrapper)context).getBaseContext();
            if (context instanceof Activity)
            {
                return (Activity)context;
            }
        }
        throw new FacebookException("Unable to get Activity.");
    }

    public int getCompoundPaddingLeft()
    {
        if (overrideCompoundPadding)
        {
            return overrideCompoundPaddingLeft;
        } else
        {
            return super.getCompoundPaddingLeft();
        }
    }

    public int getCompoundPaddingRight()
    {
        if (overrideCompoundPadding)
        {
            return overrideCompoundPaddingRight;
        } else
        {
            return super.getCompoundPaddingRight();
        }
    }

    protected int getDefaultStyleResource()
    {
        return 0;
    }

    public Fragment getFragment()
    {
        return parentFragment;
    }

    public int getRequestCode()
    {
        return requestCode;
    }

    protected int measureTextWidth(String s)
    {
        return (int)Math.ceil(getPaint().measureText(s));
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        logButtonCreated(getContext());
    }

    protected void onDraw(Canvas canvas)
    {
        int i;
        if ((getGravity() & 1) != 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            i = getCompoundPaddingLeft();
            int j = getCompoundPaddingRight();
            int k = getCompoundDrawablePadding();
            k = Math.min((getWidth() - (k + i) - j - measureTextWidth(getText().toString())) / 2, (i - getPaddingLeft()) / 2);
            overrideCompoundPaddingLeft = i - k;
            overrideCompoundPaddingRight = j + k;
            overrideCompoundPadding = true;
        }
        super.onDraw(canvas);
        overrideCompoundPadding = false;
    }

    public void setFragment(Fragment fragment)
    {
        parentFragment = fragment;
    }

    protected void setInternalOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        internalOnClickListener = onclicklistener;
    }

    public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        externalOnClickListener = onclicklistener;
    }

    protected void setRequestCode(int i)
    {
        if (FacebookSdk.isFacebookRequestCode(i))
        {
            throw new IllegalArgumentException((new StringBuilder("Request code ")).append(i).append(" cannot be within the range reserved by the Facebook SDK.").toString());
        } else
        {
            requestCode = i;
            return;
        }
    }



    private class _cls1
        implements android.view.View.OnClickListener
    {

        final FacebookButtonBase this$0;

        public void onClick(View view)
        {
            if (internalOnClickListener != null)
            {
                internalOnClickListener.onClick(view);
            } else
            if (externalOnClickListener != null)
            {
                externalOnClickListener.onClick(view);
                return;
            }
        }

        _cls1()
        {
            this$0 = FacebookButtonBase.this;
            super();
        }
    }

}
