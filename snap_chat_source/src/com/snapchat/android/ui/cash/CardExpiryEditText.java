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
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.snapchat.android.ui.StickyEndEditText;
import java.util.Calendar;
import sp;

public class CardExpiryEditText extends StickyEndEditText
{
    final class a
        implements TextWatcher
    {

        private CharSequence a;
        private boolean b;
        private boolean c;
        private CardExpiryEditText d;

        public final void afterTextChanged(Editable editable)
        {
            StringBuilder stringbuilder;
            if (c)
            {
                return;
            }
            stringbuilder = CardExpiryEditText.a(d, editable);
            if (b)
            {
                stringbuilder.delete(stringbuilder.length() - 2, stringbuilder.length());
            }
            if (TextUtils.equals(a, stringbuilder.toString())) goto _L2; else goto _L1
_L1:
            int i;
            CardExpiryEditText cardexpiryedittext = d;
            String s = stringbuilder.toString();
            if (!s.matches("[0-9]{2}/[0-9]{2}"))
            {
                break MISSING_BLOCK_LABEL_301;
            }
            String as[] = s.split("/");
            int k = Integer.parseInt(as[0]);
            if (k <= 0 || k > 12)
            {
                i = 0;
            } else
            {
                i = Integer.parseInt(as[1]);
                int l = cardexpiryedittext.a.get(1);
                int j = i + (l - l % 100);
                i = j;
                if (j < l)
                {
                    i = j + 100;
                }
                cardexpiryedittext.b.set(1, i);
                cardexpiryedittext.b.set(2, k - 1);
                cardexpiryedittext.b.set(5, cardexpiryedittext.b.getActualMaximum(5));
                cardexpiryedittext.b.add(5, 1);
                if (cardexpiryedittext.b.before(cardexpiryedittext.a) || i - l > 25)
                {
                    break MISSING_BLOCK_LABEL_301;
                }
                i = 1;
            }
_L3:
            if (i != 0)
            {
                CardExpiryEditText.a(d, true);
                if (CardExpiryEditText.a(d) != null)
                {
                    CardExpiryEditText.a(d).b();
                }
            } else
            {
                CardExpiryEditText.a(d, false);
                if (CardExpiryEditText.a(d) != null)
                {
                    CardExpiryEditText.a(d).a();
                }
            }
            a = stringbuilder;
_L2:
            c = true;
            editable.replace(0, editable.length(), stringbuilder);
            c = false;
            return;
            i = 0;
              goto _L3
        }

        public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
        {
            boolean flag;
            if (k == 0 && charsequence.subSequence(i, i + j).toString().equals("/"))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            b = flag;
        }

        public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
        {
        }

        private a()
        {
            d = CardExpiryEditText.this;
            super();
            a = null;
            b = false;
            c = false;
        }

        a(byte byte0)
        {
            this();
        }
    }


    final Calendar a = Calendar.getInstance();
    final Calendar b = Calendar.getInstance();
    public boolean c;
    private Animation d;
    private sp e;

    public CardExpiryEditText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = false;
        d = AnimationUtils.loadAnimation(context, 0x7f050005);
        addTextChangedListener(new a((byte)0));
        setKeyListener(DigitsKeyListener.getInstance("0123456789//"));
    }

    static StringBuilder a(CardExpiryEditText cardexpiryedittext, Editable editable)
    {
        StringBuilder stringbuilder;
        int k;
        stringbuilder = new StringBuilder();
        k = 0;
_L14:
        if (k >= editable.length()) goto _L2; else goto _L1
_L1:
        char c1 = editable.charAt(k);
        if (!Character.isDigit(c1)) goto _L4; else goto _L3
_L3:
        k;
        JVM INSTR tableswitch 0 4: default 76
    //                   0 106
    //                   1 121
    //                   2 76
    //                   3 174
    //                   4 267;
           goto _L5 _L6 _L7 _L5 _L8 _L9
_L5:
        stringbuilder.append(c1);
        if (stringbuilder.length() == 2)
        {
            stringbuilder.append('/');
        }
_L4:
        k++;
        continue; /* Loop/switch isn't completed */
_L6:
        if (c1 > '1')
        {
            stringbuilder.append(0);
        }
          goto _L5
_L7:
        if ((editable.charAt(0) != '1' || c1 >= '0' && c1 <= '2') && (editable.charAt(0) != '0' || c1 != '0')) goto _L5; else goto _L10
_L10:
        cardexpiryedittext.startAnimation(cardexpiryedittext.d);
          goto _L4
_L8:
        int i = Integer.parseInt(String.valueOf(editable.charAt(k)));
        int l = cardexpiryedittext.a.get(1);
        int j1 = l - l % 100;
        boolean flag;
        if (i * 10 + j1 + 9 >= l && i * 10 + j1 < l + 25)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag) goto _L5; else goto _L11
_L11:
        cardexpiryedittext.startAnimation(cardexpiryedittext.d);
          goto _L4
_L9:
        int j = Integer.parseInt(editable.subSequence(k - 1, k + 1).toString());
        int k1 = Integer.parseInt(editable.subSequence(0, 2).toString());
        int l1 = cardexpiryedittext.a.get(1);
        int i1 = j + (l1 - l1 % 100);
        j = i1;
        if (i1 < l1)
        {
            j = i1 + 100;
        }
        if (j == l1)
        {
            if (k1 > cardexpiryedittext.a.get(2))
            {
                j = 1;
            } else
            {
                j = 0;
            }
        } else
        if (j - l1 <= 25)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (j != 0) goto _L5; else goto _L12
_L12:
        cardexpiryedittext.startAnimation(cardexpiryedittext.d);
          goto _L4
_L2:
        return stringbuilder;
        if (true) goto _L14; else goto _L13
_L13:
    }

    static sp a(CardExpiryEditText cardexpiryedittext)
    {
        return cardexpiryedittext.e;
    }

    static boolean a(CardExpiryEditText cardexpiryedittext, boolean flag)
    {
        cardexpiryedittext.c = flag;
        return flag;
    }

    protected final boolean a()
    {
        if (getEditableText().length() == 0 && e != null)
        {
            e.c();
            return true;
        } else
        {
            return false;
        }
    }

    public void setValidatedInputCallback(sp sp1)
    {
        e = sp1;
    }
}
