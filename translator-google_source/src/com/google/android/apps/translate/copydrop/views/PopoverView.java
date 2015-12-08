// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.copydrop.views;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.translate.c.a;
import com.google.android.apps.translate.e.k;
import com.google.android.apps.translate.m;
import com.google.android.apps.translate.r;
import com.google.android.apps.translate.widget.LangSpinner;
import com.google.android.apps.translate.widget.LanguagePicker;
import com.google.android.apps.translate.widget.ae;
import com.google.android.apps.translate.z;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.core.b;
import com.google.android.libraries.translate.e.h;
import com.google.android.libraries.translate.e.j;
import com.google.android.libraries.translate.e.o;
import com.google.android.libraries.translate.languages.Language;
import com.google.android.libraries.translate.languages.d;
import com.google.android.libraries.translate.languages.e;
import com.google.android.libraries.translate.logging.Event;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.google.android.apps.translate.copydrop.views:
//            TranslatedTextWithIconView, TranslationEditTextView, c, d

public class PopoverView extends LinearLayout
    implements android.view.View.OnClickListener, ae, j
{

    private static final String e = com/google/android/apps/translate/copydrop/views/PopoverView.getSimpleName();
    public View a;
    public View b;
    public TranslationEditTextView c;
    public AnimationDrawable d;
    private TextView f;
    private View g;
    private ImageView h;
    private TranslatedTextWithIconView i;
    private LangSpinner j;
    private LangSpinner k;
    private View l;

    public PopoverView(Context context)
    {
        super(context);
    }

    public PopoverView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public PopoverView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
    }

    static LangSpinner a(PopoverView popoverview)
    {
        return popoverview.j;
    }

    static LangSpinner b(PopoverView popoverview)
    {
        return popoverview.k;
    }

    private void b()
    {
        setVisibility(8);
        a();
    }

    public final List a(LangSpinner langspinner)
    {
        d d1 = com.google.android.libraries.translate.languages.e.a().a(getContext(), Locale.getDefault());
        ArrayList arraylist = new ArrayList();
        if (langspinner == k)
        {
            arraylist.addAll(com.google.android.libraries.translate.core.b.d(getContext(), d1));
            if (arraylist.size() > 0)
            {
                arraylist.add(null);
            }
            arraylist.addAll(Collections.unmodifiableList(d1.b));
            return arraylist;
        }
        arraylist.addAll(com.google.android.libraries.translate.core.b.c(getContext(), d1));
        if (arraylist.size() > 0)
        {
            arraylist.add(null);
        }
        arraylist.addAll(Collections.unmodifiableList(d1.a));
        return arraylist;
    }

    public final void a()
    {
        f.setText(r.popover_translation_text);
        a.setVisibility(0);
        b.setVisibility(8);
        g.setVisibility(8);
        Object obj = i;
        ((TranslatedTextWithIconView) (obj)).setVisibility(8);
        ((TranslatedTextWithIconView) (obj)).a.setVisibility(0);
        obj = c;
        ((TranslationEditTextView) (obj)).c.setOnFocusChangeListener(null);
        ((TranslationEditTextView) (obj)).c.setText("");
        ((TranslationEditTextView) (obj)).c.clearFocus();
        ((TranslationEditTextView) (obj)).d.setText("");
        ((TranslationEditTextView) (obj)).a.setVisibility(8);
        ((TranslationEditTextView) (obj)).b.setVisibility(8);
        ((TranslationEditTextView) (obj)).setVisibility(8);
        d.stop();
        d.selectDrawable(0);
    }

    public final void a(int i1, Bundle bundle)
    {
        switch (i1)
        {
        case 252: 
        default:
            (new StringBuilder(26)).append("Unknown event: ").append(i1);
            return;

        case 253: 
            b();
            return;

        case 251: 
            b();
            return;

        case 254: 
            g.setVisibility(0);
            break;
        }
    }

    public final void a(LangSpinner langspinner, Language language, Language language1, int i1)
    {
        if (language1.getShortName().equals(language.getShortName()))
        {
            return;
        }
        Object obj = j.getSelectedLanguage();
        Object obj1 = k.getSelectedLanguage();
        com.google.android.libraries.translate.core.b.a(getContext(), ((Language) (obj)), ((Language) (obj1)));
        obj = com.google.android.apps.translate.e.k.a(null, ((Language) (obj)), ((Language) (obj1)), null);
        obj1 = c;
        ((TranslationEditTextView) (obj1)).a();
        ((TranslationEditTextView) (obj1)).e.b(((Bundle) (obj)));
        if (langspinner == j)
        {
            obj = Event.COPYDROP_LANG1_PICKED;
        } else
        {
            obj = Event.COPYDROP_LANG2_PICKED;
        }
        Singleton.b().a(((Event) (obj)), language1.getShortName(), language.getShortName());
        Singleton.b().a(((Event) (obj)), langspinner.getLastOpenTime(), language1.getShortName(), language.getShortName(), i1);
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        if (keyevent.getKeyCode() == 4)
        {
            com.google.android.libraries.translate.e.h.a(251);
        }
        return super.dispatchKeyEvent(keyevent);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        com.google.android.libraries.translate.e.h.a(this, new int[] {
            253, 251, 254
        });
    }

    public void onClick(View view)
    {
        if (m.popover_expand_button == view.getId())
        {
            com.google.android.libraries.translate.e.h.a(250);
            a.setVisibility(8);
            b.setVisibility(0);
            d.start();
            i.setVisibility(0);
            c.b();
        } else
        {
            if (m.popover_close_btn == view.getId())
            {
                com.google.android.libraries.translate.e.h.a(251);
                return;
            }
            if (l == view)
            {
                view = LanguagePicker.a(getContext(), j.getSelectedLanguage(), k.getSelectedLanguage());
                if (view != null)
                {
                    Language language;
                    if (o.b)
                    {
                        l.setRotation(0.0F);
                        long l1 = l.animate().setStartDelay(0L).rotationBy(180F).getDuration() / 2L;
                        AnimatorSet animatorset = new AnimatorSet();
                        animatorset.playTogether(new Animator[] {
                            ObjectAnimator.ofFloat(j, View.TRANSLATION_X, new float[] {
                                0.0F, (float)j.getMeasuredWidth()
                            }), ObjectAnimator.ofFloat(k, View.TRANSLATION_X, new float[] {
                                0.0F, (float)(-k.getMeasuredWidth())
                            })
                        });
                        animatorset.addListener(new c(this, view));
                        AnimatorSet animatorset1 = new AnimatorSet();
                        animatorset1.playTogether(new Animator[] {
                            ObjectAnimator.ofFloat(j, View.TRANSLATION_X, new float[] {
                                (float)j.getMeasuredWidth(), 0.0F
                            }), ObjectAnimator.ofFloat(k, View.TRANSLATION_X, new float[] {
                                (float)(-k.getMeasuredWidth()), 0.0F
                            })
                        });
                        animatorset1.addListener(new com.google.android.apps.translate.copydrop.views.d(this));
                        AnimatorSet animatorset2 = new AnimatorSet();
                        animatorset2.playSequentially(new Animator[] {
                            animatorset, animatorset1
                        });
                        animatorset2.setDuration(l1);
                        animatorset2.setStartDelay(0L);
                        animatorset2.start();
                    } else
                    {
                        j.setSelectedLang(((a) (view)).a);
                        k.setSelectedLang(((a) (view)).b);
                    }
                    language = ((a) (view)).a;
                    view = ((a) (view)).b;
                    com.google.android.libraries.translate.core.b.a(getContext(), language, view);
                    com.google.android.libraries.translate.e.h.a(6, com.google.android.apps.translate.e.k.a(null, language, view, "swap=1"));
                    Singleton.b().a(Event.COPYDROP_LANG_SWAPPED, language.getShortName(), view.getShortName());
                    return;
                }
            }
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        com.google.android.libraries.translate.e.h.a(this);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        f = (TextView)findViewById(m.popover_translation_text);
        a = findViewById(m.popover_header_start);
        b = findViewById(m.popover_header_main);
        h = (ImageView)findViewById(m.popover_dots_to_sans);
        i = (TranslatedTextWithIconView)findViewById(m.translated_text_view_with_icon);
        c = (TranslationEditTextView)findViewById(m.translation_edit_text_views);
        g = findViewById(m.language_header);
        j = (LangSpinner)findViewById(m.spinner1);
        k = (LangSpinner)findViewById(m.spinner2);
        l = findViewById(m.btn_swap);
        Object obj = com.google.android.libraries.translate.languages.e.a(getContext());
        Language alanguage[] = com.google.android.libraries.translate.core.b.a(getContext(), ((d) (obj)));
        obj = alanguage[0];
        Language language = alanguage[1];
        j.setSelectedLang(((Language) (obj)));
        k.setSelectedLang(language);
        j.setSpinnerHandler(this);
        k.setSpinnerHandler(this);
        j.setClickEvent(Event.COPYDROP_LANG1_PICKER_OPEN);
        k.setClickEvent(Event.COPYDROP_LANG2_PICKER_OPEN);
        findViewById(m.spinner1_frame).setOnClickListener(j);
        findViewById(m.spinner2_frame).setOnClickListener(k);
        c.setToSpinner(k);
        l.setOnClickListener(this);
        d = (AnimationDrawable)h.getDrawable();
        findViewById(m.popover_expand_button).setOnClickListener(this);
        findViewById(m.popover_close_btn).setOnClickListener(this);
        if (!isInEditMode())
        {
            setVisibility(8);
            g.setVisibility(8);
            i.setVisibility(8);
            c.setVisibility(8);
        }
    }

    public void setCurrentAppIcon(Drawable drawable)
    {
        i.setAppIcon(drawable);
    }

    public void setEditTextFocused()
    {
        c.setFocused();
    }

    public void setTextToBeTranslated(String s)
    {
        i.setOriginalText(s);
    }

    public void setTranslatedText(String s, Language language)
    {
        f.setText(s);
        i.setTranslatedText(s, language);
    }

}
