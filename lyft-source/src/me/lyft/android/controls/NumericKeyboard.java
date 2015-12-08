// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.content.Context;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import butterknife.ButterKnife;
import me.lyft.android.utils.Keyboard;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.controls:
//            IKeyboardButton, KeyboardImageButton

public class NumericKeyboard extends FrameLayout
{

    KeyboardImageButton delButton;
    private KeyPressListener listener;
    private final Action1 onKeyboardClicked;
    private Vibrator vibrator;

    public NumericKeyboard(Context context)
    {
        super(context);
        listener = new SimpleKeyPressListener();
        onKeyboardClicked = new Action1() {

            final NumericKeyboard this$0;

            public void call(KeyEvent keyevent)
            {
                listener.onKeyPressed(keyevent);
            }

            public volatile void call(Object obj)
            {
                call((KeyEvent)obj);
            }

            
            {
                this$0 = NumericKeyboard.this;
                super();
            }

            private class KeyPressListener
            {

                public abstract void onDelLongPressed();

                public abstract void onKeyPressed(KeyEvent keyevent);
            }

        };
    }

    public NumericKeyboard(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        listener = new SimpleKeyPressListener();
        onKeyboardClicked = new _cls2();
    }

    public NumericKeyboard(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        listener = new SimpleKeyPressListener();
        onKeyboardClicked = new _cls2();
    }

    private void initNumericButton(View view, int i, int j)
    {
        view = (IKeyboardButton)ButterKnife.a(view, i);
        view.setButtonId(Integer.valueOf(j + 7));
        view.setClickAction(onKeyboardClicked);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        } else
        {
            Keyboard.hideOnStart(this);
            return;
        }
    }

    protected void onDetachedFromWindow()
    {
        Keyboard.showOnStart(this);
        super.onDetachedFromWindow();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        View view = LayoutInflater.from(getContext()).inflate(0x7f03008d, this, true);
        if (isInEditMode())
        {
            return;
        } else
        {
            ButterKnife.a(this);
            initNumericButton(view, 0x7f0d0251, 0);
            initNumericButton(view, 0x7f0d0247, 1);
            initNumericButton(view, 0x7f0d0248, 2);
            initNumericButton(view, 0x7f0d0249, 3);
            initNumericButton(view, 0x7f0d024a, 4);
            initNumericButton(view, 0x7f0d024b, 5);
            initNumericButton(view, 0x7f0d024c, 6);
            initNumericButton(view, 0x7f0d024d, 7);
            initNumericButton(view, 0x7f0d024e, 8);
            initNumericButton(view, 0x7f0d024f, 9);
            delButton.setButtonId(Integer.valueOf(67));
            delButton.setClickAction(onKeyboardClicked);
            delButton.setOnLongClickListener(new android.view.View.OnLongClickListener() {

                final NumericKeyboard this$0;

                public boolean onLongClick(View view1)
                {
                    vibrator.vibrate(50L);
                    listener.onDelLongPressed();
                    return false;
                }

            
            {
                this$0 = NumericKeyboard.this;
                super();
            }
            });
            vibrator = (Vibrator)getContext().getSystemService("vibrator");
            return;
        }
    }

    public void setKeyPressListener(KeyPressListener keypresslistener)
    {
        listener = keypresslistener;
    }



    private class SimpleKeyPressListener
        implements KeyPressListener
    {

        public void onDelLongPressed()
        {
        }

        public void onKeyPressed(KeyEvent keyevent)
        {
        }

        public SimpleKeyPressListener()
        {
        }
    }

}
