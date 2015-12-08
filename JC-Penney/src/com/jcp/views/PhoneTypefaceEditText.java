// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.views;

import android.content.Context;
import android.text.TextUtils;
import android.text.method.DigitsKeyListener;
import android.util.AttributeSet;
import com.jcp.util.bq;

// Referenced classes of package com.jcp.views:
//            TypefaceEditText

public class PhoneTypefaceEditText extends TypefaceEditText
{

    private String a;
    private boolean b;

    public PhoneTypefaceEditText(Context context)
    {
        this(context, null, 0);
    }

    public PhoneTypefaceEditText(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x101006e);
    }

    public PhoneTypefaceEditText(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        b();
    }

    private String a(String s)
    {
        byte byte0 = 6;
        if (TextUtils.isEmpty(s))
        {
            return s;
        }
        int l = s.length();
        StringBuilder stringbuilder = new StringBuilder("");
        for (int i = 0; i < l && i < 3; i++)
        {
            stringbuilder.append(s.charAt(i));
        }

        StringBuilder stringbuilder1 = new StringBuilder("");
        if (l > 3)
        {
            for (int j = 3; j < l && j < 6; j++)
            {
                stringbuilder1.append(s.charAt(j));
            }

        }
        StringBuilder stringbuilder2 = new StringBuilder("");
        if (l > 6)
        {
            for (int k = byte0; k < l && k < 10; k++)
            {
                stringbuilder2.append(s.charAt(k));
            }

        }
        return String.format("(%s) %s-%s", new Object[] {
            stringbuilder.toString(), stringbuilder1.toString(), stringbuilder2.toString()
        });
    }

    private String b(String s)
    {
        return s.replaceAll("\\(", "").replaceAll("\\)", "").replaceAll(" ", "").replaceAll("-", "");
    }

    private void b()
    {
        a = null;
        setRawInputType(3);
        setKeyListener(new DigitsKeyListener());
        b = false;
    }

    private void setCursorPosition(int i)
    {
        int k = i + 1;
        int j = k;
        if (i > 3)
        {
            k += 2;
            j = k;
            if (i > 6)
            {
                j = k + 1;
            }
        }
        setSelection(j);
    }

    public boolean a()
    {
        String s = b(super.getText().toString());
        if (s == null)
        {
            return false;
        } else
        {
            return bq.c(s);
        }
    }

    public String getPhoneNumber()
    {
        return b(super.getText().toString());
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        if (b)
        {
            return;
        }
        b = true;
        charsequence = charsequence.toString();
        if (TextUtils.isEmpty(charsequence)) goto _L2; else goto _L1
_L1:
        charsequence = b(charsequence);
        if (TextUtils.isEmpty(charsequence)) goto _L4; else goto _L3
_L3:
        if (charsequence.length() <= 10) goto _L6; else goto _L5
_L5:
        if (!TextUtils.isEmpty(a))
        {
            setText(a);
            setSelection(a.length());
        } else
        {
            setText("");
        }
_L2:
        b = false;
        return;
_L6:
        String s = a(charsequence);
        if (!TextUtils.isEmpty(s) && !s.equals(a))
        {
            a = s;
            setText(s);
            setCursorPosition(charsequence.length());
        }
        continue; /* Loop/switch isn't completed */
_L4:
        a = null;
        setText("");
        setSelection(0);
        if (true) goto _L2; else goto _L7
_L7:
    }
}
