// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;

import android.text.Editable;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import com.google.android.apps.translate.inputtools.InputToolsInput;
import com.google.android.libraries.handwriting.gui.UIHandler;

// Referenced classes of package com.google.android.apps.translate.widget:
//            bb, p, HandwritingInputView, o

public final class n extends BaseInputConnection
    implements bb
{

    final p a = new p(this);
    final HandwritingInputView b;

    public n(HandwritingInputView handwritinginputview, View view)
    {
        b = handwritinginputview;
        super(view, true);
    }

    public final void a()
    {
        int i = a.a;
        int j = a.b;
        HandwritingInputView.d(b).a(i, j, a.a, a.b, a.c, a.d);
    }

    public final boolean commitText(CharSequence charsequence, int i)
    {
        HandwritingInputView.e(b).beginBatchEdit();
        int j = HandwritingInputView.e(b).getSelectionStart();
        int k = HandwritingInputView.e(b).getSelectionEnd();
        if (j < k)
        {
            HandwritingInputView.e(b).getText().delete(j, k);
        }
        boolean flag = super.commitText(charsequence, i);
        b.post(new o(this));
        return flag;
    }

    public final boolean finishComposingText()
    {
        a.c = a.a;
        a.d = a.b;
        HandwritingInputView.d(b).a(a.a, a.b, a.a, a.b, a.c, a.d);
        return super.finishComposingText();
    }

    public final Editable getEditable()
    {
        return HandwritingInputView.e(b).getEditableText();
    }

    public final ExtractedText getExtractedText(ExtractedTextRequest extractedtextrequest, int i)
    {
        extractedtextrequest = new ExtractedText();
        extractedtextrequest.text = getEditable().toString();
        return extractedtextrequest;
    }

    public final boolean setComposingRegion(int i, int j)
    {
        int l = i;
        int k = j;
        if (i == j)
        {
            l = a.a;
            k = a.a;
        }
        a.c = l;
        a.d = k;
        HandwritingInputView.d(b).a(a.a, a.b, a.a, a.b, a.c, a.d);
        return super.setComposingRegion(l, k);
    }

    public final boolean setComposingText(CharSequence charsequence, int i)
    {
        if (a.c == -1)
        {
            a.c = a.a;
            a.d = a.a;
        }
        a.d = a.c + charsequence.length();
        a.a = a.d;
        a.b = a.d;
        HandwritingInputView.d(b).a(a.a, a.b, a.a, a.b, a.c, a.d);
        return super.setComposingText(charsequence, i);
    }
}
