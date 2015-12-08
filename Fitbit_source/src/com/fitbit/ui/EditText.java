// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.fitbit.e.a;
import com.fitbit.util.ap;

// Referenced classes of package com.fitbit.ui:
//            EditTextWithImeHack, e

public class EditText extends EditTextWithImeHack
{
    private static class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new _cls1();
        String a;
        int b;

        public void writeToParcel(Parcel parcel, int j)
        {
            super.writeToParcel(parcel, j);
            parcel.writeString(a);
            parcel.writeInt(b);
        }


        SavedState(Parcel parcel)
        {
            super(parcel);
            a = parcel.readString();
            b = parcel.readInt();
        }

        public SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }

        /* block-local class not found */
        class _cls1 {}

    }


    private static final String a = "EditText";
    private boolean b;
    private e c;
    private CharSequence d;
    private int e;
    private boolean f;
    private int g;
    private int h;
    private int i;

    public EditText(Context context)
    {
        this(context, null);
    }

    public EditText(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x101006e);
    }

    public EditText(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        g = 0x7f02032b;
        h = 0x7f02032a;
        i = 0x7f0202ba;
        a(context, attributeset, j);
    }

    static int a(EditText edittext)
    {
        return edittext.e;
    }

    private void a()
    {
        int ai[];
        a(true);
        ai = new int[2];
        getLocationOnScreen(ai);
        if (b)
        {
            return;
        }
        try
        {
            c.showAtLocation(getRootView(), 0x800033, ai[0] + b(), ai[1] + getHeight());
            c.a(c.isAboveAnchor());
            return;
        }
        catch (Exception exception)
        {
            com.fitbit.e.a.a("EditText", "Unable to show popup error: %s", new Object[] {
                exception.getMessage()
            });
        }
        return;
    }

    private void a(Context context, AttributeSet attributeset, int j)
    {
        context = context.obtainStyledAttributes(attributeset, com.fitbit.FitbitMobile.R.styleable.FitbitEditText, j, 0);
        g = context.getResourceId(0, 0x7f02032b);
        h = context.getResourceId(1, 0x7f02032a);
        i = context.getResourceId(2, 0x7f0202ba);
        context.recycle();
    }

    private void a(PopupWindow popupwindow, CharSequence charsequence, TextView textview)
    {
        charsequence = new int[2];
        getLocationOnScreen(charsequence);
        textview.measure(android.view.View.MeasureSpec.makeMeasureSpec(Math.min(ap.a(getContext(), 300F), charsequence[0] + getWidth() + c()), 0x80000000), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        popupwindow.setWidth(textview.getMeasuredWidth());
        popupwindow.setHeight(textview.getMeasuredHeight());
    }

    private void a(boolean flag)
    {
        if (getWindowToken() == null)
        {
            b = true;
            return;
        }
        if (c == null || flag)
        {
            c = new e(this, (TextView)LayoutInflater.from(getContext()).inflate(0x7f0401b0, null), 200, 50, g, h);
            c.setFocusable(false);
            c.setInputMethodMode(1);
        }
        TextView textview = (TextView)c.getContentView();
        textview.setText(d);
        a(((PopupWindow) (c)), d, textview);
    }

    private static boolean a(int j)
    {
        j &= 0xfff;
        return j == 129 || j == 145 || j == 225 || j == 18;
    }

    private int b()
    {
        return (getWidth() - c.getWidth()) + c();
    }

    private int c()
    {
        Drawable drawable = getCompoundDrawables()[2];
        int k = ap.a(getContext(), 24F);
        int l = getPaddingRight();
        int j;
        if (drawable != null)
        {
            j = drawable.getBounds().width() / 2;
        } else
        {
            j = 0;
        }
        return k - l - j;
    }

    private int d()
    {
        boolean flag = false;
        int l = getBottom();
        int i1 = getTop();
        int j1 = getCompoundPaddingBottom();
        int k1 = getCompoundPaddingTop();
        Drawable drawable = getCompoundDrawables()[2];
        int k = getCompoundPaddingTop();
        int j;
        if (drawable != null)
        {
            j = drawable.getBounds().height();
        } else
        {
            j = 0;
        }
        l = (l - i1 - j1 - k1 - j) / 2;
        j = ((flag) ? 1 : 0);
        if (drawable != null)
        {
            j = drawable.getBounds().height();
        }
        return (l + k + j) - getHeight() - 2;
    }

    public void c(int j)
    {
        e = j;
        if (e == 0)
        {
            setError(null);
            return;
        } else
        {
            setError(getContext().getString(e));
            return;
        }
    }

    public CharSequence getError()
    {
        return d;
    }

    public void h()
    {
        try
        {
            if (c != null)
            {
                if (c.isShowing())
                {
                    c.dismiss();
                }
                b = false;
            }
            return;
        }
        catch (Exception exception)
        {
            com.fitbit.e.a.a("EditText", "Unable to hide popup error: %s", new Object[] {
                exception.getMessage()
            });
        }
    }

    public void i()
    {
        (new Handler()).postDelayed(new Runnable() {

            final EditText a;

            public void run()
            {
                a.setError(null);
                a.c(com.fitbit.ui.EditText.a(a));
            }

            
            {
                a = EditText.this;
                super();
            }
        }, 100L);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (b)
        {
            a();
            b = false;
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (d != null)
        {
            h();
        }
    }

    protected void onFocusChanged(boolean flag, int j, Rect rect)
    {
        super.onFocusChanged(flag, j, rect);
        if (flag)
        {
            if (d != null)
            {
                setError(null);
                c(e);
            }
        } else
        if (d != null)
        {
            h();
            return;
        }
    }

    public boolean onKeyDown(int j, KeyEvent keyevent)
    {
        if (d != null && !f)
        {
            setError(null, null);
        }
        return super.onKeyDown(j, keyevent);
    }

    public boolean onKeyUp(int j, KeyEvent keyevent)
    {
        if (d != null && !f)
        {
            setError(null, null);
        }
        return super.onKeyUp(j, keyevent);
    }

    protected void onLayout(boolean flag, int j, int k, int l, int i1)
    {
        super.onLayout(flag, j, k, l, i1);
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        if (!(parcelable instanceof SavedState))
        {
            super.onRestoreInstanceState(parcelable);
            return;
        } else
        {
            parcelable = (SavedState)parcelable;
            d = ((SavedState) (parcelable)).a;
            e = ((SavedState) (parcelable)).b;
            super.onRestoreInstanceState(parcelable.getSuperState());
            return;
        }
    }

    public Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        savedstate.a = (String)d;
        savedstate.b = e;
        return savedstate;
    }

    protected void onTextChanged(CharSequence charsequence, int j, int k, int l)
    {
        super.onTextChanged(charsequence, j, k, l);
        if (a(getInputType()))
        {
            if (getText().length() == 0)
            {
                if (getTypeface() != Typeface.DEFAULT)
                {
                    setTypeface(Typeface.DEFAULT);
                }
            } else
            if (getTypeface() != Typeface.MONOSPACE)
            {
                setTypeface(Typeface.MONOSPACE);
                return;
            }
        }
    }

    public void setError(CharSequence charsequence)
    {
        if (charsequence == null)
        {
            setError(null, null);
            return;
        } else
        {
            Drawable drawable = getContext().getResources().getDrawable(i);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            setError(charsequence, drawable);
            return;
        }
    }

    public void setError(CharSequence charsequence, Drawable drawable)
    {
        charsequence = TextUtils.stringOrSpannedString(charsequence);
        d = charsequence;
        f = true;
        Drawable adrawable[] = getCompoundDrawables();
        setCompoundDrawables(adrawable[0], adrawable[1], drawable, adrawable[3]);
        if (charsequence == null)
        {
            try
            {
                if (c != null)
                {
                    if (c.isShowing())
                    {
                        c.dismiss();
                    }
                    c = null;
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (CharSequence charsequence)
            {
                com.fitbit.e.a.a("EditText", "Unable to set error: %s", new Object[] {
                    charsequence.getMessage()
                });
            }
            break MISSING_BLOCK_LABEL_100;
        }
        if (isFocused())
        {
            a();
            return;
        }
    }
}
