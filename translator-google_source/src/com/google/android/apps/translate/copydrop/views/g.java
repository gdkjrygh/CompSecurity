// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.copydrop.views;

import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package com.google.android.apps.translate.copydrop.views:
//            TranslationEditTextView

final class g
    implements android.widget.TextView.OnEditorActionListener
{

    final TranslationEditTextView a;

    g(TranslationEditTextView translationedittextview)
    {
        a = translationedittextview;
        super();
    }

    public final boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 4)
        {
            TranslationEditTextView.a(a);
            return false;
        } else
        {
            return true;
        }
    }
}
