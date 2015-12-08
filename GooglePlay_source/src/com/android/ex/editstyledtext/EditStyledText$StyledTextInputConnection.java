// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.ex.editstyledtext;

import android.util.Log;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

// Referenced classes of package com.android.ex.editstyledtext:
//            EditStyledText

public static final class mEST extends InputConnectionWrapper
{

    EditStyledText mEST;

    public final boolean commitText(CharSequence charsequence, int i)
    {
        Log.d("EditStyledText", "--- commitText:");
        EditStyledText.access$1700$352fb8c5().posingMask();
        return super.commitText(charsequence, i);
    }

    public final boolean finishComposingText()
    {
        Log.d("EditStyledText", "--- finishcomposing:");
        throw new NullPointerException();
    }

    public (InputConnection inputconnection, EditStyledText editstyledtext)
    {
        super(inputconnection, true);
        mEST = editstyledtext;
    }
}
