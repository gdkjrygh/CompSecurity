// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.cash;

import Ij;
import Ll;
import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.util.AttributeSet;
import android.widget.EditText;
import com.snapchat.android.SnapchatApplication;
import sp;

public class CardNumberEditText extends EditText
{
    final class a
        implements TextWatcher
    {

        private CharSequence a;
        private boolean b;
        private boolean c;
        private boolean d;
        private int e;
        private CardNumberEditText f;

        public final void afterTextChanged(Editable editable)
        {
            if (!b) goto _L2; else goto _L1
_L1:
            return;
_L2:
            StringBuilder stringbuilder1;
            if (d)
            {
                b = true;
                editable.delete(e - 1, e);
                d = false;
                b = false;
            }
            stringbuilder1 = CardNumberEditText.a(editable);
            if (TextUtils.equals(a, stringbuilder1)) goto _L1; else goto _L3
_L3:
            if (stringbuilder1.length() != 19) goto _L5; else goto _L4
_L4:
            StringBuilder stringbuilder;
            stringbuilder = stringbuilder1;
            int i;
            if (CardNumberEditText.a(f) != null)
            {
                if (Ij.a(f.a()))
                {
                    CardNumberEditText.a(f).b();
                    stringbuilder = stringbuilder1;
                } else
                {
                    CardNumberEditText.a(f).a();
                    stringbuilder = stringbuilder1;
                }
            }
_L7:
            a = stringbuilder;
            b = true;
            editable.replace(0, editable.length(), stringbuilder);
            i = editable.length();
            if (c && i > 0 && (i % 4 == 0 || i == 3))
            {
                f.setSelection(f.getSelectionStart() + 1);
            }
            b = false;
            return;
_L5:
            if (stringbuilder1.length() > 19)
            {
                stringbuilder = new StringBuilder(a);
            } else
            {
                stringbuilder = stringbuilder1;
                if (CardNumberEditText.a(f) != null)
                {
                    CardNumberEditText.a(f).a();
                    stringbuilder = stringbuilder1;
                }
            }
            if (true) goto _L7; else goto _L6
_L6:
        }

        public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
        {
            if (k < j)
            {
                c = true;
                if (charsequence.length() > 0 && charsequence.charAt(i) == ' ')
                {
                    d = true;
                    e = i;
                }
                return;
            } else
            {
                c = false;
                d = false;
                return;
            }
        }

        public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
        {
        }

        private a()
        {
            f = CardNumberEditText.this;
            super();
            a = null;
            b = false;
            d = false;
            e = 0;
        }

        a(byte byte0)
        {
            this();
        }
    }


    private sp a;

    public CardNumberEditText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        SnapchatApplication.getDIComponent().a(this);
        setKeyListener(DigitsKeyListener.getInstance("0123456789 "));
        addTextChangedListener(new a((byte)0));
    }

    static StringBuilder a(Editable editable)
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (int i = 0; i < editable.length(); i++)
        {
            char c = editable.charAt(i);
            if (Character.isDigit(c))
            {
                stringbuilder.append(c);
            }
        }

        int j = 4;
        while (j <= stringbuilder.length()) 
        {
            if (j < 19)
            {
                if (j == stringbuilder.length())
                {
                    stringbuilder.append(' ');
                } else
                {
                    stringbuilder.insert(j, ' ');
                }
            }
            j += 5;
        }
        return stringbuilder;
    }

    static sp a(CardNumberEditText cardnumberedittext)
    {
        return cardnumberedittext.a;
    }

    public final String a()
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (int i = 0; i < getText().length(); i++)
        {
            char c = getText().charAt(i);
            if (Character.isDigit(c))
            {
                stringbuilder.append(c);
            }
        }

        return stringbuilder.toString();
    }

    public void setValidatedInputCallback(sp sp)
    {
        a = sp;
    }
}
