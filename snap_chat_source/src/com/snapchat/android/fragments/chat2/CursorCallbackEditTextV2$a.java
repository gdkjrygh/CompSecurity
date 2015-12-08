// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.chat2;

import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.style.SuggestionSpan;
import android.text.style.UnderlineSpan;

// Referenced classes of package com.snapchat.android.fragments.chat2:
//            CursorCallbackEditTextV2

public class a
    implements SpanWatcher
{

    private CursorCallbackEditTextV2 a;

    public void onSpanAdded(Spannable spannable, Object obj, int i, int j)
    {
        if ((obj instanceof UnderlineSpan) && !(obj instanceof neSpan) && !(obj instanceof SuggestionSpan))
        {
            a.getEditableText().removeSpan(obj);
        }
    }

    public void onSpanChanged(Spannable spannable, Object obj, int i, int j, int k, int l)
    {
    }

    public void onSpanRemoved(Spannable spannable, Object obj, int i, int j)
    {
    }

    protected neSpan(CursorCallbackEditTextV2 cursorcallbackedittextv2)
    {
        a = cursorcallbackedittextv2;
        super();
    }
}
