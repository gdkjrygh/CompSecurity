// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.cash;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.util.AttributeSet;
import com.snapchat.android.ui.StickyEndEditText;
import sp;

public class CardCvvEditText extends StickyEndEditText
{
    final class a
        implements TextWatcher
    {

        private CharSequence a;
        private CardCvvEditText b;

        public final void afterTextChanged(Editable editable)
        {
            editable = new StringBuilder(editable);
            if (TextUtils.equals(a, editable)) goto _L2; else goto _L1
_L1:
            if (editable.length() != 3) goto _L4; else goto _L3
_L3:
            CardCvvEditText.a(b, true);
            if (CardCvvEditText.a(b) != null)
            {
                CardCvvEditText.a(b).b();
            }
_L6:
            a = editable;
_L2:
            return;
_L4:
            CardCvvEditText.a(b, false);
            if (CardCvvEditText.a(b) != null)
            {
                CardCvvEditText.a(b).a();
            }
            if (true) goto _L6; else goto _L5
_L5:
        }

        public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
        {
        }

        public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
        {
        }

        private a()
        {
            b = CardCvvEditText.this;
            super();
            a = null;
        }

        a(byte byte0)
        {
            this();
        }
    }


    public boolean a;
    private sp b;

    public CardCvvEditText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = false;
        addTextChangedListener(new a((byte)0));
        setKeyListener(DigitsKeyListener.getInstance("0123456789"));
    }

    static sp a(CardCvvEditText cardcvvedittext)
    {
        return cardcvvedittext.b;
    }

    static boolean a(CardCvvEditText cardcvvedittext, boolean flag)
    {
        cardcvvedittext.a = flag;
        return flag;
    }

    protected final boolean a()
    {
        if (getEditableText().length() == 0 && b != null)
        {
            b.c();
            return true;
        } else
        {
            return false;
        }
    }

    public final String b()
    {
        return getText().toString().trim();
    }

    public void setValidatedInputCallback(sp sp1)
    {
        b = sp1;
    }
}
