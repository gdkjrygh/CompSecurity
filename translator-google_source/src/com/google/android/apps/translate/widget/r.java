// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import com.google.android.apps.translate.inputtools.InputToolsInput;
import com.google.android.libraries.handwriting.base.RecognitionResult;
import com.google.android.libraries.handwriting.base.ScoredCandidate;
import com.google.android.libraries.handwriting.gui.UIHandler;
import com.google.android.libraries.handwriting.gui.al;
import com.google.android.libraries.handwriting.gui.c;
import com.google.android.libraries.handwriting.gui.i;
import java.util.LinkedList;

// Referenced classes of package com.google.android.apps.translate.widget:
//            s, HandwritingInputView

final class r extends UIHandler
{

    final HandwritingInputView a;

    public r(HandwritingInputView handwritinginputview, al al, i j, Object obj)
    {
        a = handwritinginputview;
        super(al, j, obj);
    }

    private void a(CharSequence charsequence)
    {
        post(new s(this, charsequence));
    }

    public final void a(float f, float f1, long l, float f2, int j)
    {
        if (HandwritingInputView.m(a))
        {
            HandwritingInputView.n(a);
        }
        HandwritingInputView.a(a, "");
        if (HandwritingInputView.h(a))
        {
            a("...");
        }
        super.a(f, f1, l, f2, j);
    }

    public final void a(int j, int k)
    {
        super.a(j, k);
        HandwritingInputView.j(a);
        d();
        super.h.a.clear();
        a(RecognitionResult.i, false);
        if (HandwritingInputView.e(a) != null)
        {
            ((InputMethodManager)a.getContext().getSystemService("input_method")).hideSoftInputFromWindow(HandwritingInputView.e(a).getWindowToken(), 0);
        }
    }

    public final void a(RecognitionResult recognitionresult, boolean flag)
    {
        super.a(recognitionresult, flag);
        if (!HandwritingInputView.h(a))
        {
            return;
        }
        if (recognitionresult != null && recognitionresult.a() > 0)
        {
            if (com.google.android.apps.translate.widget.HandwritingInputView.i(a).e())
            {
                a("...");
                return;
            } else
            {
                a(((CharSequence) (recognitionresult.a(0).a)));
                return;
            }
        } else
        {
            a("");
            return;
        }
    }
}
