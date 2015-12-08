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

public class ZipEditText extends StickyEndEditText
{
    final class a
        implements TextWatcher
    {

        private CharSequence a;
        private ZipEditText b;

        public final void afterTextChanged(Editable editable)
        {
            editable = new StringBuilder(editable);
            if (TextUtils.equals(a, editable)) goto _L2; else goto _L1
_L1:
            if (editable.length() != 5) goto _L4; else goto _L3
_L3:
            ZipEditText.a(b, true);
            if (ZipEditText.a(b) != null)
            {
                ZipEditText.a(b).b();
            }
_L6:
            a = editable;
_L2:
            return;
_L4:
            ZipEditText.a(b, false);
            if (ZipEditText.a(b) != null)
            {
                ZipEditText.a(b).a();
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
            b = ZipEditText.this;
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

    public ZipEditText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = false;
        addTextChangedListener(new a((byte)0));
        setKeyListener(DigitsKeyListener.getInstance("0123456789"));
    }

    static sp a(ZipEditText zipedittext)
    {
        return zipedittext.b;
    }

    static boolean a(ZipEditText zipedittext, boolean flag)
    {
        zipedittext.a = flag;
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

    public void setValidatedInputCallback(sp sp1)
    {
        b = sp1;
    }
}
