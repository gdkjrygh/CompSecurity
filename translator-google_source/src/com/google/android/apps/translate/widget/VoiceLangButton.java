// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.translate.e.i;
import com.google.android.apps.translate.j;

// Referenced classes of package com.google.android.apps.translate.widget:
//            az, ay

public class VoiceLangButton extends TextView
    implements android.view.View.OnClickListener, android.view.View.OnLongClickListener
{

    private static final int a[] = {
        0x10100a0
    };
    private boolean b;
    private az c;
    private boolean d;
    private final ColorStateList e = getTextColors();

    public VoiceLangButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        setOnClickListener(new i(this));
        setOnLongClickListener(this);
    }

    public void onClick(View view)
    {
        if (c != null)
        {
            c.a(this, false);
        }
    }

    protected int[] onCreateDrawableState(int k)
    {
        int ai[] = super.onCreateDrawableState(k + 1);
        if (b)
        {
            mergeDrawableStates(ai, a);
        }
        return ai;
    }

    public boolean onLongClick(View view)
    {
        if (c != null)
        {
            d = true;
            c.a(this, true);
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        motionevent.getAction();
        JVM INSTR tableswitch 0 3: default 36
    //                   0 42
    //                   1 50
    //                   2 36
    //                   3 42;
           goto _L1 _L2 _L3 _L1 _L2
_L1:
        return super.onTouchEvent(motionevent);
_L2:
        d = false;
        continue; /* Loop/switch isn't completed */
_L3:
        if (d && b && c != null)
        {
            c.b();
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void setChecked(boolean flag)
    {
        if (b != flag)
        {
            b = flag;
            refreshDrawableState();
        }
    }

    public void setColorByState(State state)
    {
        switch (ay.a[state.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            setTextColor(e);
            return;

        case 2: // '\002'
            setTextColor(getResources().getColor(j.voice_active_text_color));
            return;

        case 3: // '\003'
            setTextColor(getResources().getColor(j.voice_translation_text_color));
            break;
        }
    }

    public void setVoiceLangButtonCallback(az az1)
    {
        c = az1;
    }


    private class State extends Enum
    {

        public static final State DEFAULT;
        public static final State SOURCE_LANGUAGE;
        public static final State TARGET_LANGUAGE;
        private static final State a[];

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(com/google/android/apps/translate/widget/VoiceLangButton$State, s);
        }

        public static State[] values()
        {
            return (State[])a.clone();
        }

        static 
        {
            DEFAULT = new State("DEFAULT", 0);
            SOURCE_LANGUAGE = new State("SOURCE_LANGUAGE", 1);
            TARGET_LANGUAGE = new State("TARGET_LANGUAGE", 2);
            a = (new State[] {
                DEFAULT, SOURCE_LANGUAGE, TARGET_LANGUAGE
            });
        }

        private State(String s, int k)
        {
            super(s, k);
        }
    }

}
