// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.RelativeLayout;
import com.google.android.apps.translate.c.a;
import com.google.android.apps.translate.e.k;
import com.google.android.apps.translate.e.l;
import com.google.android.apps.translate.e.v;
import com.google.android.apps.translate.m;
import com.google.android.apps.translate.o;
import com.google.android.apps.translate.p;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.core.b;
import com.google.android.libraries.translate.e.f;
import com.google.android.libraries.translate.e.h;
import com.google.android.libraries.translate.e.j;
import com.google.android.libraries.translate.languages.Language;
import com.google.android.libraries.translate.languages.c;
import com.google.android.libraries.translate.languages.d;
import com.google.android.libraries.translate.languages.e;
import com.google.android.libraries.translate.logging.Event;
import com.google.android.libraries.translate.logging.LogParams;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.google.android.apps.translate.widget:
//            ae, LangSpinner, ai, aj, 
//            ak

public class LanguagePicker extends RelativeLayout
    implements android.view.View.OnClickListener, ae, j
{

    private final LangSpinner a;
    private final LangSpinner b;
    private final View c;

    public LanguagePicker(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        LayoutInflater.from(context).inflate(o.widget_language_picker, this, true);
        attributeset = e.a(getContext());
        Language alanguage[] = com.google.android.libraries.translate.core.b.a(getContext(), attributeset);
        if (alanguage[0] == null || alanguage[1] == null)
        {
            SharedPreferences sharedpreferences = PreferenceManager.getDefaultSharedPreferences(getContext());
            com.google.android.libraries.translate.logging.e e1 = Singleton.b();
            if (alanguage[0] == null)
            {
                context = "Unknown source";
            } else
            {
                context = "Unknown target";
            }
            e1.a(-2004, LogParams.create(context).addParam("from", sharedpreferences.getString("key_language_from", "-")).addParam("to", sharedpreferences.getString("key_language_to", "-")).addParam("allFrom", sharedpreferences.getString("key_recent_language_from", "-")).addParam("allTo", sharedpreferences.getString("key_recent_language_to", "-")));
            sharedpreferences.edit().remove("key_language_from").remove("key_language_to").remove("key_recent_language_from").remove("key_recent_language_to").commit();
            alanguage[0] = attributeset.a();
            alanguage[1] = attributeset.b();
        }
        a = (LangSpinner)findViewById(m.spinner1);
        a.setSelectedLang(alanguage[0]);
        a.setSpinnerHandler(this);
        a.setClickEvent(Event.LANG1_PICKER_OPEN);
        findViewById(m.spinner1_frame).setOnClickListener(a);
        b = (LangSpinner)findViewById(m.spinner2);
        b.setSelectedLang(alanguage[1]);
        b.setSpinnerHandler(this);
        b.setClickEvent(Event.LANG2_PICKER_OPEN);
        findViewById(m.spinner2_frame).setOnClickListener(b);
        c = findViewById(m.btn_swap);
        c.setOnClickListener(this);
        c.setOnLongClickListener(new v());
        context = l.a(findViewById(m.menu_overflow), p.main_menu, new ai(this));
        if (context != null)
        {
            context.findItem(m.menu_sms).setVisible(com.google.android.libraries.translate.e.o.a(getContext()));
        }
        a();
        h.a(this, new int[] {
            7, 16
        });
    }

    LanguagePicker(Context context, LangSpinner langspinner, LangSpinner langspinner1)
    {
        super(context);
        a = langspinner;
        b = langspinner1;
        c = null;
    }

    public static a a(Context context, Language language, Language language1)
    {
        if (f.a(language))
        {
            return null;
        }
        d d1 = e.a().a(context, Locale.getDefault());
        language1 = d1.b(language1.getShortName());
        if (com.google.android.libraries.translate.languages.c.a(language.getShortName()))
        {
            context = d1.a(context);
        } else
        {
            context = d1.c(language.getShortName());
        }
        return new a(language1, context);
    }

    static LangSpinner a(LanguagePicker languagepicker)
    {
        return languagepicker.a;
    }

    private void a()
    {
        View view = c;
        boolean flag;
        if (!f.a(getFromLanguage()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view.setEnabled(flag);
    }

    private void a(a a1, long l1)
    {
        c.setRotation(0.0F);
        long l2 = c.animate().setStartDelay(l1).rotationBy(180F).getDuration() / 2L;
        AnimatorSet animatorset = new AnimatorSet();
        animatorset.playTogether(new Animator[] {
            ObjectAnimator.ofFloat(a, View.TRANSLATION_X, new float[] {
                0.0F, (float)a.getMeasuredWidth()
            }), ObjectAnimator.ofFloat(b, View.TRANSLATION_X, new float[] {
                0.0F, (float)(-b.getMeasuredWidth())
            })
        });
        animatorset.addListener(new aj(this, a1));
        a1 = new AnimatorSet();
        a1.playTogether(new Animator[] {
            ObjectAnimator.ofFloat(a, View.TRANSLATION_X, new float[] {
                (float)a.getMeasuredWidth(), 0.0F
            }), ObjectAnimator.ofFloat(b, View.TRANSLATION_X, new float[] {
                (float)(-b.getMeasuredWidth()), 0.0F
            })
        });
        a1.addListener(new ak(this));
        AnimatorSet animatorset1 = new AnimatorSet();
        animatorset1.playSequentially(new Animator[] {
            animatorset, a1
        });
        animatorset1.setDuration(l2);
        animatorset1.setStartDelay(l1);
        animatorset1.start();
    }

    static LangSpinner b(LanguagePicker languagepicker)
    {
        return languagepicker.b;
    }

    private a getSwapLangPair()
    {
        return a(getContext(), getFromLanguage(), getToLanguage());
    }

    public final List a(LangSpinner langspinner)
    {
        d d1 = e.a().a(getContext(), Locale.getDefault());
        ArrayList arraylist = new ArrayList();
        if (langspinner == b)
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

    public final void a(int i, Bundle bundle)
    {
        boolean flag = false;
        if (i != 7) goto _L2; else goto _L1
_L1:
        Language language = (Language)bundle.getSerializable("from");
        Language language1 = (Language)bundle.getSerializable("to");
        if (!getFromLanguage().equals(language) || !getToLanguage().equals(language1))
        {
            com.google.android.libraries.translate.core.b.a(getContext(), language, language1);
            if (hasWindowFocus())
            {
                com.google.android.libraries.translate.e.m.a((new a(language, language1)).toString(), 0);
            }
        }
        i = ((flag) ? 1 : 0);
        if (com.google.android.libraries.translate.e.o.b)
        {
            i = ((flag) ? 1 : 0);
            if (bundle.containsKey("lang_anim_delay"))
            {
                a a1 = getSwapLangPair();
                i = ((flag) ? 1 : 0);
                if (a1 != null)
                {
                    i = ((flag) ? 1 : 0);
                    if (a1.a.equals(language))
                    {
                        i = ((flag) ? 1 : 0);
                        if (a1.b.equals(language1))
                        {
                            i = 1;
                            a(a1, bundle.getLong("lang_anim_delay", 0L));
                        }
                    }
                }
            }
        }
        if (i == 0)
        {
            a.setSelectedLang(language);
            b.setSelectedLang(language1);
            a();
        }
_L4:
        return;
_L2:
        if (i != 16)
        {
            continue; /* Loop/switch isn't completed */
        }
        bundle = getFromLanguage();
        if (bundle != null)
        {
            bundle = e.a(getContext()).a(bundle.getShortName());
            if (bundle != null)
            {
                a.setSelectedLang(bundle);
            }
        }
        bundle = getToLanguage();
        if (bundle == null) goto _L4; else goto _L3
_L3:
        bundle = e.a(getContext()).c(bundle.getShortName());
        if (bundle == null) goto _L4; else goto _L5
_L5:
        b.setSelectedLang(bundle);
        return;
        if (i != 17) goto _L4; else goto _L6
_L6:
        findViewById(m.menu_overflow).performClick();
        return;
    }

    public final void a(LangSpinner langspinner, Language language, Language language1, int i)
    {
        if (language1.getShortName().equals(language.getShortName()))
        {
            return;
        }
        Object obj;
        boolean flag;
        if (getFromLanguage().getShortName().equals(getToLanguage().getShortName()) && !com.google.android.libraries.translate.languages.c.a(getToLanguage().getShortName()))
        {
            flag = true;
            Language language2;
            Language language3;
            if (langspinner == a)
            {
                if (com.google.android.libraries.translate.languages.c.a(language1.getShortName()))
                {
                    d d1 = e.a(getContext());
                    b.setSelectedLang(d1.a(getContext()));
                } else
                if (!language1.getShortName().equals("auto"))
                {
                    b.setSelectedLang(language1);
                } else
                {
                    flag = false;
                }
            } else
            if (com.google.android.libraries.translate.languages.c.a(language1.getShortName()))
            {
                obj = e.a(getContext());
                a.setSelectedLang(((d) (obj)).a("zh-CN"));
            } else
            {
                a.setSelectedLang(language1);
            }
        } else
        {
            flag = false;
        }
        language2 = getFromLanguage();
        language3 = getToLanguage();
        if (flag)
        {
            com.google.android.libraries.translate.e.m.a((new a(language2, language3)).toString(), 0);
            Singleton.b().a(Event.AUTO_LANG_SWAPPED, a.getSelectedLanguage().getShortName(), b.getSelectedLanguage().getShortName());
        }
        com.google.android.libraries.translate.core.b.a(getContext(), language2, language3);
        a();
        if (langspinner == a)
        {
            obj = Event.LANG1_PICKED;
        } else
        {
            obj = Event.LANG2_PICKED;
        }
        h.a(6, k.a(null, language2, language3, null));
        Singleton.b().a(((Event) (obj)), language1.getShortName(), language.getShortName());
        Singleton.b().a(((Event) (obj)), langspinner.getLastOpenTime(), language1.getShortName(), language.getShortName(), i);
    }

    public Language getFromLanguage()
    {
        return a.getSelectedLanguage();
    }

    public Language getToLanguage()
    {
        return b.getSelectedLanguage();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        h.a(this, new int[] {
            7, 16, 17
        });
    }

    public void onClick(View view)
    {
        if (view == c)
        {
            Object obj = getSwapLangPair();
            if (obj != null)
            {
                if (com.google.android.libraries.translate.e.o.b)
                {
                    a(((a) (obj)), 0L);
                } else
                {
                    a.setSelectedLang(((a) (obj)).a);
                    b.setSelectedLang(((a) (obj)).b);
                }
                view = ((a) (obj)).a;
                obj = ((a) (obj)).b;
                com.google.android.libraries.translate.core.b.a(getContext(), view, ((Language) (obj)));
                h.a(6, k.a(null, view, ((Language) (obj)), "swap=1"));
                Singleton.b().a(Event.LANG_SWAPPED, view.getShortName(), ((Language) (obj)).getShortName());
            }
        }
    }

    protected void onDetachedFromWindow()
    {
        h.a(this);
        super.onDetachedFromWindow();
    }
}
