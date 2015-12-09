// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.usersetup;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.wallet.userscope.UserInjector;
import com.google.android.apps.wallet.util.view.Views;
import com.google.common.base.Preconditions;

public class ZipCodeView extends LinearLayout
{
    final class ButtonClickListener
        implements android.view.View.OnClickListener, android.view.View.OnHoverListener, android.view.View.OnTouchListener
    {

        final ZipCodeView this$0;

        private static void simulateClickForAccessibility(View view)
        {
            if (view.isPressed())
            {
                return;
            } else
            {
                view.setPressed(true);
                view.performClick();
                view.setPressed(false);
                return;
            }
        }

        public final void onClick(View view)
        {
            view.performHapticFeedback(3);
            if (view.getId() == com.google.android.apps.walletnfcrel.R.id.ZipBackspace)
            {
                onBackspace();
                return;
            }
            if (view.getId() == com.google.android.apps.walletnfcrel.R.id.ZipContinue)
            {
                onContinue();
                return;
            } else
            {
                onNumberButton(view.getId());
                return;
            }
        }

        public final boolean onHover(View view, MotionEvent motionevent)
        {
            if (!accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled())
            {
                int i;
                switch (motionevent.getActionMasked())
                {
                default:
                    return false;

                case 10: // '\n'
                    i = view.getPaddingLeft();
                    break;
                }
                int j = view.getWidth();
                int k = view.getPaddingRight();
                int l = view.getPaddingTop();
                int i1 = view.getHeight();
                int j1 = view.getPaddingBottom();
                int k1 = (int)motionevent.getX();
                int l1 = (int)motionevent.getY();
                if (k1 > i && k1 < j - k && l1 > l && l1 < i1 - j1)
                {
                    simulateClickForAccessibility(view);
                    return false;
                }
            }
            return false;
        }

        public final boolean onTouch(View view, MotionEvent motionevent)
        {
            if (motionevent.getAction() == 0)
            {
                view.setPressed(true);
                return true;
            } else
            {
                return false;
            }
        }

        private ButtonClickListener()
        {
            this$0 = ZipCodeView.this;
            super();
        }

    }

    public static interface SubmitListener
    {

        public abstract void onSubmit(String s);
    }


    private static final SparseIntArray ID_TO_NUMBER_MAP;
    AccessibilityManager accessibilityManager;
    private final ImageButton backspaceButton;
    private final ImageButton continueButton;
    private final TextView entryView;
    private final Button numberButtons[] = new Button[10];
    private SubmitListener submitListener;
    private String value;

    public ZipCodeView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        if (!isInEditMode())
        {
            UserInjector.inject(this, context);
        }
        LayoutInflater.from(context).inflate(com.google.android.apps.walletnfcrel.R.layout.zip_code_view, this, true);
        context = new ButtonClickListener();
        numberButtons[0] = (Button)setupButton(findViewById(com.google.android.apps.walletnfcrel.R.id.Zip0), context);
        numberButtons[1] = (Button)setupButton(findViewById(com.google.android.apps.walletnfcrel.R.id.Zip1), context);
        numberButtons[2] = (Button)setupButton(findViewById(com.google.android.apps.walletnfcrel.R.id.Zip2), context);
        numberButtons[3] = (Button)setupButton(findViewById(com.google.android.apps.walletnfcrel.R.id.Zip3), context);
        numberButtons[4] = (Button)setupButton(findViewById(com.google.android.apps.walletnfcrel.R.id.Zip4), context);
        numberButtons[5] = (Button)setupButton(findViewById(com.google.android.apps.walletnfcrel.R.id.Zip5), context);
        numberButtons[6] = (Button)setupButton(findViewById(com.google.android.apps.walletnfcrel.R.id.Zip6), context);
        numberButtons[7] = (Button)setupButton(findViewById(com.google.android.apps.walletnfcrel.R.id.Zip7), context);
        numberButtons[8] = (Button)setupButton(findViewById(com.google.android.apps.walletnfcrel.R.id.Zip8), context);
        numberButtons[9] = (Button)setupButton(findViewById(com.google.android.apps.walletnfcrel.R.id.Zip9), context);
        backspaceButton = (ImageButton)setupButton(findViewById(com.google.android.apps.walletnfcrel.R.id.ZipBackspace), context);
        continueButton = (ImageButton)setupButton(findViewById(com.google.android.apps.walletnfcrel.R.id.ZipContinue), context);
        entryView = (TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.ZipEntry);
        value = "";
        update();
    }

    private void onBackspace()
    {
        if (value.length() == 0)
        {
            return;
        } else
        {
            value = value.substring(0, value.length() - 1);
            update();
            return;
        }
    }

    private void onContinue()
    {
        if (value.length() != 5 || submitListener == null)
        {
            return;
        } else
        {
            submitListener.onSubmit(value);
            return;
        }
    }

    private void onNumberButton(int i)
    {
        if (value.length() >= 5)
        {
            return;
        }
        i = ID_TO_NUMBER_MAP.get(i, -1);
        String s;
        boolean flag;
        if (i != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        s = value;
        value = (new StringBuilder(String.valueOf(s).length() + 11)).append(s).append(i).toString();
        update();
    }

    private static View setupButton(View view, ButtonClickListener buttonclicklistener)
    {
        view.setOnClickListener(buttonclicklistener);
        view.setOnTouchListener(buttonclicklistener);
        view.setOnHoverListener(buttonclicklistener);
        return view;
    }

    private void update()
    {
        entryView.setText(value);
        ImageButton imagebutton = continueButton;
        boolean flag;
        if (value.length() == 5)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        imagebutton.setEnabled(flag);
    }

    public final void clear()
    {
        value = "";
        update();
    }

    public boolean onKeyUp(int i, KeyEvent keyevent)
    {
        i;
        JVM INSTR lookupswitch 23: default 196
    //                   7: 261
    //                   8: 203
    //                   9: 217
    //                   10: 222
    //                   11: 227
    //                   12: 232
    //                   13: 237
    //                   14: 243
    //                   15: 249
    //                   16: 255
    //                   66: 276
    //                   67: 266
    //                   144: 261
    //                   145: 203
    //                   146: 217
    //                   147: 222
    //                   148: 227
    //                   149: 232
    //                   150: 237
    //                   151: 243
    //                   152: 249
    //                   153: 255
    //                   160: 276;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L12:
        break MISSING_BLOCK_LABEL_276;
_L1:
        return super.onKeyUp(i, keyevent);
_L3:
        i = 1;
_L14:
        numberButtons[i].performClick();
        return true;
_L4:
        i = 2;
        continue; /* Loop/switch isn't completed */
_L5:
        i = 3;
        continue; /* Loop/switch isn't completed */
_L6:
        i = 4;
        continue; /* Loop/switch isn't completed */
_L7:
        i = 5;
        continue; /* Loop/switch isn't completed */
_L8:
        i = 6;
        continue; /* Loop/switch isn't completed */
_L9:
        i = 7;
        continue; /* Loop/switch isn't completed */
_L10:
        i = 8;
        continue; /* Loop/switch isn't completed */
_L11:
        i = 9;
        continue; /* Loop/switch isn't completed */
_L2:
        i = 0;
        if (true) goto _L14; else goto _L13
_L13:
        backspaceButton.performClick();
        return true;
        continueButton.performClick();
        return true;
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        if (!(parcelable instanceof Bundle))
        {
            super.onRestoreInstanceState(android.view.View.BaseSavedState.EMPTY_STATE);
            return;
        } else
        {
            parcelable = (Bundle)parcelable;
            value = parcelable.getString("zip_code_value", "");
            super.onRestoreInstanceState(parcelable.getParcelable("super_state"));
            update();
            return;
        }
    }

    protected Parcelable onSaveInstanceState()
    {
        Parcelable parcelable = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putString("zip_code_value", value);
        bundle.putParcelable("super_state", parcelable);
        return bundle;
    }

    public void setSubmitListener(SubmitListener submitlistener)
    {
        submitListener = submitlistener;
    }

    static 
    {
        SparseIntArray sparseintarray = new SparseIntArray(10);
        ID_TO_NUMBER_MAP = sparseintarray;
        sparseintarray.put(com.google.android.apps.walletnfcrel.R.id.Zip0, 0);
        ID_TO_NUMBER_MAP.put(com.google.android.apps.walletnfcrel.R.id.Zip1, 1);
        ID_TO_NUMBER_MAP.put(com.google.android.apps.walletnfcrel.R.id.Zip2, 2);
        ID_TO_NUMBER_MAP.put(com.google.android.apps.walletnfcrel.R.id.Zip3, 3);
        ID_TO_NUMBER_MAP.put(com.google.android.apps.walletnfcrel.R.id.Zip4, 4);
        ID_TO_NUMBER_MAP.put(com.google.android.apps.walletnfcrel.R.id.Zip5, 5);
        ID_TO_NUMBER_MAP.put(com.google.android.apps.walletnfcrel.R.id.Zip6, 6);
        ID_TO_NUMBER_MAP.put(com.google.android.apps.walletnfcrel.R.id.Zip7, 7);
        ID_TO_NUMBER_MAP.put(com.google.android.apps.walletnfcrel.R.id.Zip8, 8);
        ID_TO_NUMBER_MAP.put(com.google.android.apps.walletnfcrel.R.id.Zip9, 9);
    }



}
