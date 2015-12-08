// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.content.Context;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.controls:
//            IKeyboardButton

public class KeyboardTextButton extends TextView
    implements IKeyboardButton
{

    private Integer buttonId;
    private Action1 listener;
    private Vibrator vibrator;

    public KeyboardTextButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        if (isInEditMode())
        {
            return;
        } else
        {
            vibrator = (Vibrator)getContext().getSystemService("vibrator");
            setOnClickListener(new android.view.View.OnClickListener() {

                final KeyboardTextButton this$0;

                public void onClick(View view)
                {
                    vibrator.vibrate(5L);
                    listener.call(new KeyEvent(0, buttonId.intValue()));
                }

            
            {
                this$0 = KeyboardTextButton.this;
                super();
            }
            });
            return;
        }
    }

    public void setButtonId(Integer integer)
    {
        buttonId = integer;
    }

    public void setClickAction(Action1 action1)
    {
        listener = action1;
    }



}
