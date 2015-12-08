// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.copydrop.views;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.translate.cards.b;
import com.google.android.apps.translate.e.k;
import com.google.android.apps.translate.r;
import com.google.android.apps.translate.widget.LangSpinner;
import com.google.android.apps.translate.widget.aq;
import com.google.android.apps.translate.widget.w;
import com.google.android.apps.translate.z;
import com.google.android.libraries.translate.core.m;
import com.google.android.libraries.translate.e.h;
import com.google.android.libraries.translate.languages.Language;

// Referenced classes of package com.google.android.apps.translate.copydrop.views:
//            g, h, e, f

public class TranslationEditTextView extends LinearLayout
    implements aq, w
{

    private static final String f = com/google/android/apps/translate/copydrop/views/TranslationEditTextView.getSimpleName();
    View a;
    ViewGroup b;
    EditText c;
    TextView d;
    z e;
    private boolean g;
    private LangSpinner h;

    public TranslationEditTextView(Context context)
    {
        super(context);
    }

    public TranslationEditTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public TranslationEditTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    static void a(TranslationEditTextView translationedittextview)
    {
        translationedittextview.c.clearFocus();
        ((InputMethodManager)translationedittextview.getContext().getSystemService("input_method")).toggleSoftInput(0, 1);
        Bundle bundle = new Bundle();
        bundle.putString("output", translationedittextview.d.getText().toString());
        com.google.android.libraries.translate.e.h.a(253, bundle);
    }

    static void a(TranslationEditTextView translationedittextview, CharSequence charsequence)
    {
        Language language = translationedittextview.h.getSelectedLanguage();
        charsequence = k.a(translationedittextview.getContext(), charsequence, "auto", language.getShortName());
        translationedittextview.e.a(charsequence);
    }

    static boolean b(TranslationEditTextView translationedittextview)
    {
        return translationedittextview.g;
    }

    static boolean c(TranslationEditTextView translationedittextview)
    {
        translationedittextview.g = false;
        return false;
    }

    public final void a()
    {
        d.setText("");
    }

    public final void a(m m1, b b1, Bundle bundle, int i)
    {
        if (m1 != null)
        {
            d.setText(m1.a(0));
        }
    }

    public final void a(boolean flag)
    {
    }

    public final void b()
    {
        g = true;
        c.setOnEditorActionListener(new g(this));
        c.addTextChangedListener(new com.google.android.apps.translate.copydrop.views.h(this));
        setVisibility(0);
    }

    public final void c()
    {
        a.setVisibility(0);
        b.setVisibility(0);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        a = findViewById(com.google.android.apps.translate.m.translated_text_divider);
        b = (ViewGroup)findViewById(com.google.android.apps.translate.m.translated_text_with_send_container);
        c = (EditText)findViewById(com.google.android.apps.translate.m.input_text_for_translation);
        d = (TextView)findViewById(com.google.android.apps.translate.m.translated_text_view);
        e = new z(getContext(), this, this);
        if (!isInEditMode())
        {
            a.setVisibility(8);
            b.setVisibility(8);
            c.clearFocus();
        }
        c.setOnFocusChangeListener(new e(this));
        findViewById(com.google.android.apps.translate.m.btn_send_text).setOnClickListener(new f(this));
    }

    public void setFocused()
    {
        c.requestFocus();
        c.requestFocusFromTouch();
    }

    public void setResultInformation(Language language, m m1)
    {
    }

    public void setToSpinner(LangSpinner langspinner)
    {
        h = langspinner;
        langspinner = langspinner.getSelectedLanguage().getLongName();
        langspinner = getContext().getString(r.hint_translation_to, new Object[] {
            langspinner
        });
        d.setHint(langspinner);
    }

}
