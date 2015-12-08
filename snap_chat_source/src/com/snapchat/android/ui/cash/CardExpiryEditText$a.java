// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.cash;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import java.util.Calendar;
import sp;

// Referenced classes of package com.snapchat.android.ui.cash:
//            CardExpiryEditText

final class <init>
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

    private (CardExpiryEditText cardexpiryedittext)
    {
        d = cardexpiryedittext;
        super();
        a = null;
        b = false;
        c = false;
    }

    c(CardExpiryEditText cardexpiryedittext, byte byte0)
    {
        this(cardexpiryedittext);
    }
}
