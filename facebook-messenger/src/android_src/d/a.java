// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.d;

import android.telephony.PhoneNumberUtils;
import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import com.facebook.phonenumbers.AsYouTypeFormatter;
import com.facebook.phonenumbers.PhoneNumberUtil;
import java.util.Locale;

public class a
    implements TextWatcher
{

    private boolean a;
    private boolean b;
    private AsYouTypeFormatter c;

    public a()
    {
        this(Locale.getDefault().getCountry());
    }

    public a(String s)
    {
        a = false;
        if (s == null)
        {
            throw new IllegalArgumentException();
        } else
        {
            c = PhoneNumberUtil.getInstance().getAsYouTypeFormatter(s);
            return;
        }
    }

    private String a(char c1, boolean flag)
    {
        if (flag)
        {
            return c.inputDigitAndRememberPosition(c1);
        } else
        {
            return c.inputDigit(c1);
        }
    }

    private String a(CharSequence charsequence, int i)
    {
        String s = null;
        c.clear();
        int k = charsequence.length();
        int j = 0;
        boolean flag = false;
        char c1 = '\0';
        for (; j < k; j++)
        {
            char c2 = charsequence.charAt(j);
            if (PhoneNumberUtils.isNonSeparator(c2))
            {
                boolean flag1 = flag;
                if (c1 != 0)
                {
                    s = a(c1, flag);
                    flag1 = false;
                }
                c1 = c2;
                flag = flag1;
            }
            if (j == i - 1)
            {
                flag = true;
            }
        }

        if (c1 != 0)
        {
            s = a(c1, flag);
        }
        return s;
    }

    private void a()
    {
        b = true;
        c.clear();
    }

    private boolean a(CharSequence charsequence, int i, int j)
    {
        for (int k = i; k < i + j; k++)
        {
            if (!PhoneNumberUtils.isNonSeparator(charsequence.charAt(k)))
            {
                return true;
            }
        }

        return false;
    }

    public void afterTextChanged(Editable editable)
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        if (!b) goto _L2; else goto _L1
_L1:
        if (editable.length() == 0)
        {
            flag = false;
        }
        b = flag;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        String s;
        if (a)
        {
            continue; /* Loop/switch isn't completed */
        }
        s = a(editable, Selection.getSelectionEnd(editable));
        if (s == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        int i = c.getRememberedPosition();
        a = true;
        editable.replace(0, editable.length(), s, 0, s.length());
        if (s.equals(editable.toString()))
        {
            Selection.setSelection(editable, i);
        }
        a = false;
        if (true) goto _L4; else goto _L3
_L3:
        editable;
        throw editable;
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        while (a || b || j <= 0 || !a(charsequence, i, j)) 
        {
            return;
        }
        a();
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        while (a || b || k <= 0 || !a(charsequence, i, k)) 
        {
            return;
        }
        a();
    }
}
