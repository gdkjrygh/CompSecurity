// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.content.Context;
import android.text.Editable;
import android.text.style.ReplacementSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;

// Referenced classes of package com.skype.android.widget:
//            AccessibleEditText

public class ChatEditText extends AccessibleEditText
{
    public static interface ChatEditTextCallback
    {

        public abstract boolean keyboardDismissed();
    }


    private ChatEditTextCallback a;

    public ChatEditText(Context context)
    {
        super(context);
        a = null;
    }

    public ChatEditText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = null;
    }

    public ChatEditText(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = null;
    }

    public final void a()
    {
        ReplacementSpan replacementspan;
        Editable editable;
        int k;
        int l;
label0:
        {
            replacementspan = null;
            editable = getText();
            k = getSelectionStart();
            ReplacementSpan areplacementspan[] = (ReplacementSpan[])getText().getSpans(0, k, android/text/style/ReplacementSpan);
            l = areplacementspan.length;
            for (int i = 0; i < l; i++)
            {
                ReplacementSpan replacementspan1 = areplacementspan[i];
                if (editable.getSpanEnd(replacementspan1) == k)
                {
                    replacementspan = replacementspan1;
                }
            }

            if (replacementspan != null)
            {
                l = editable.getSpanStart(replacementspan);
                k = editable.getSpanEnd(replacementspan);
                if (k != l)
                {
                    break label0;
                }
            }
            return;
        }
        int j = k;
        if (k > editable.length())
        {
            j = editable.length();
        }
        editable.removeSpan(replacementspan);
        editable.delete(l, j);
    }

    public boolean onKeyPreIme(int i, KeyEvent keyevent)
    {
        if (i == 4 && a != null && a.keyboardDismissed())
        {
            return true;
        } else
        {
            return super.onKeyPreIme(i, keyevent);
        }
    }

    public void setCallback(ChatEditTextCallback chatedittextcallback)
    {
        a = chatedittextcallback;
    }
}
