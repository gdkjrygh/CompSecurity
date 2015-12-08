// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.loyalty;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import java.lang.ref.WeakReference;

// Referenced classes of package com.kohls.mcommerce.opal.loyalty:
//            LoyaltyEnrollmentActivity

private class mWeakEditText
    implements TextWatcher
{

    private boolean clearFlag;
    private boolean mFormatting;
    private String mLastBeforeText;
    private int mLastStartLocation;
    private WeakReference mWeakEditText;
    final LoyaltyEnrollmentActivity this$0;

    private String formatUsNumber(Editable editable)
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (int i = 0; i < editable.length();)
        {
            if (!Character.isDigit(editable.charAt(i)))
            {
                editable.delete(i, i + 1);
            } else
            {
                i++;
            }
        }

        String s = editable.toString();
        int l = s.length();
        if (l == 0 || l > 10 && !s.startsWith("1") || l > 11)
        {
            editable.clear();
            editable.append(s);
            return s;
        }
        int j = 0;
        if (s.equals("1") && clearFlag)
        {
            editable.clear();
            clearFlag = false;
            return "";
        }
        if (l - 0 > 3)
        {
            stringbuilder.append((new StringBuilder()).append("(").append(s.substring(0, 3)).append(") ").toString());
            j = 0 + 3;
        }
        int k = j;
        if (l - j > 3)
        {
            stringbuilder.append((new StringBuilder()).append(s.substring(j, j + 3)).append("-").toString());
            k = j + 3;
        }
        if (l > k)
        {
            stringbuilder.append(s.substring(k));
        }
        editable.clear();
        editable.append(stringbuilder.toString());
        return stringbuilder.toString();
    }

    public void afterTextChanged(Editable editable)
    {
        if (!mFormatting)
        {
            mFormatting = true;
            int i = mLastStartLocation;
            String s = mLastBeforeText;
            String s1 = editable.toString();
            editable = formatUsNumber(editable);
            if (s1.length() > s.length())
            {
                i = editable.length() - (s.length() - i);
                editable = (EditText)mWeakEditText.get();
                if (i < 0)
                {
                    i = 0;
                }
                editable.setSelection(i);
            } else
            {
                int j = editable.length() - (s1.length() - i);
                i = j;
                if (j > 0)
                {
                    i = j;
                    if (!Character.isDigit(editable.charAt(j - 1)))
                    {
                        i = j - 1;
                    }
                }
                editable = (EditText)mWeakEditText.get();
                if (i < 0)
                {
                    i = 0;
                }
                editable.setSelection(i);
            }
            mFormatting = false;
        }
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        if (k == 0 && charsequence.toString().equals("1 "))
        {
            clearFlag = true;
        }
        mLastStartLocation = i;
        mLastBeforeText = charsequence.toString();
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public (WeakReference weakreference)
    {
        this$0 = LoyaltyEnrollmentActivity.this;
        super();
        mWeakEditText = weakreference;
    }
}
