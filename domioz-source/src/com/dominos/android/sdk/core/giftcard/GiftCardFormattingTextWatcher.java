// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.giftcard;

import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;

// Referenced classes of package com.dominos.android.sdk.core.giftcard:
//            GiftCardNumberUtils

public class GiftCardFormattingTextWatcher
    implements TextWatcher
{

    private boolean mDeletingBackward;
    private boolean mDeletingHyphen;
    private boolean mFormatting;
    private int mHyphenStart;

    public GiftCardFormattingTextWatcher()
    {
    }

    public void afterTextChanged(Editable editable)
    {
        this;
        JVM INSTR monitorenter ;
        if (mFormatting) goto _L2; else goto _L1
_L1:
        mFormatting = true;
        if (!mDeletingHyphen || mHyphenStart <= 0) goto _L4; else goto _L3
_L3:
        if (!mDeletingBackward) goto _L6; else goto _L5
_L5:
        if (mHyphenStart - 1 < editable.length())
        {
            editable.delete(mHyphenStart - 1, mHyphenStart);
        }
_L4:
        GiftCardNumberUtils.formatNumber(editable);
        mFormatting = false;
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L6:
        if (mHyphenStart >= editable.length()) goto _L4; else goto _L7
_L7:
        editable.delete(mHyphenStart, mHyphenStart + 1);
          goto _L4
        editable;
        throw editable;
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
label0:
        {
label1:
            {
                if (!mFormatting)
                {
                    int l = Selection.getSelectionStart(charsequence);
                    int i1 = Selection.getSelectionEnd(charsequence);
                    if (charsequence.length() <= 1 || j != 1 || k != 0 || charsequence.charAt(i) != ' ' || l != i1)
                    {
                        break label0;
                    }
                    mDeletingHyphen = true;
                    mHyphenStart = i;
                    if (l != i + 1)
                    {
                        break label1;
                    }
                    mDeletingBackward = true;
                }
                return;
            }
            mDeletingBackward = false;
            return;
        }
        mDeletingHyphen = false;
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }
}
