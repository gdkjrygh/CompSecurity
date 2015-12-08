// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.apps.translate.anim.AnimationScheme;
import com.google.android.apps.translate.cards.DictionaryCard;
import com.google.android.apps.translate.cards.TranslateErrorCard;
import com.google.android.apps.translate.cards.a;
import com.google.android.apps.translate.cards.b;
import com.google.android.apps.translate.e.k;
import com.google.android.apps.translate.widget.LangSpinner;
import com.google.android.apps.translate.widget.SpeakerView;
import com.google.android.apps.translate.widget.TintImageView;
import com.google.android.apps.translate.widget.ae;
import com.google.android.apps.translate.widget.aq;
import com.google.android.apps.translate.widget.w;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.core.m;
import com.google.android.libraries.translate.e.h;
import com.google.android.libraries.translate.e.j;
import com.google.android.libraries.translate.e.n;
import com.google.android.libraries.translate.languages.Language;
import com.google.android.libraries.translate.languages.d;
import com.google.android.libraries.translate.languages.e;
import com.google.android.libraries.translate.logging.Event;
import com.google.android.libraries.translate.tts.MyTts;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.google.android.apps.translate:
//            m, r, l, z, 
//            o

public class QuickTranslateActivity extends Activity
    implements android.view.View.OnClickListener, a, ae, aq, w, j
{

    private SpeakerView a;
    private SpeakerView b;
    private LangSpinner c;
    private LangSpinner d;
    private TextView e;
    private TextView f;
    private TextView g;
    private TextView h;
    private TintImageView i;
    private z j;
    private View k;
    private DictionaryCard l;
    private TranslateErrorCard m;
    private ScrollView n;
    private View o;
    private boolean p;

    public QuickTranslateActivity()
    {
        l = null;
        m = null;
        n = null;
        o = null;
        p = false;
    }

    private void a(View view)
    {
        TextView textview = (TextView)findViewById(m.label_more_less);
        ImageView imageview = (ImageView)findViewById(m.ic_caret_more_less);
        if (view == null)
        {
            AnimationScheme.SIDE.hideView(o);
            n.setVisibility(8);
            n.removeAllViews();
            textview.setText(r.label_more);
            imageview.setImageResource(l.quantum_ic_keyboard_arrow_down_grey600_24);
            return;
        } else
        {
            AnimationScheme.SIDE.showView(o);
            n.setVisibility(0);
            n.addView(view);
            textview.setText(r.label_less);
            imageview.setImageResource(l.quantum_ic_keyboard_arrow_up_grey600_24);
            return;
        }
    }

    private void a(String s, String s1, b b1)
    {
        b.setTextToPlay(s, b1.f, "target");
        if (b1.g != null)
        {
            h.setTypeface(b1.g);
        }
        h.setText(s);
        if (s1 == null || s1.isEmpty())
        {
            g.setVisibility(4);
            return;
        } else
        {
            g.setText(s1);
            return;
        }
    }

    private void b(boolean flag)
    {
        p = flag;
        View view = findViewById(m.replace_wrapper);
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view.setEnabled(flag);
    }

    public final List a(LangSpinner langspinner)
    {
        d d1 = com.google.android.libraries.translate.languages.e.a().a(this, Locale.getDefault());
        ArrayList arraylist = new ArrayList();
        if (langspinner == d)
        {
            arraylist.addAll(com.google.android.libraries.translate.core.b.d(this, d1));
            if (arraylist.size() > 0)
            {
                arraylist.add(null);
            }
            arraylist.addAll(Collections.unmodifiableList(d1.b));
            return arraylist;
        }
        arraylist.addAll(com.google.android.libraries.translate.core.b.c(this, d1));
        if (arraylist.size() > 0)
        {
            arraylist.add(null);
        }
        arraylist.addAll(Collections.unmodifiableList(d1.a));
        return arraylist;
    }

    public final void a()
    {
        f.setText("");
        f.setVisibility(4);
        h.setText("");
    }

    public final void a(int i1, Bundle bundle)
    {
        i1;
        JVM INSTR tableswitch 3 6: default 32
    //                   3 51
    //                   4 32
    //                   5 32
    //                   6 33;
           goto _L1 _L2 _L1 _L1 _L3
_L1:
        return;
_L3:
        a();
        j.b(bundle);
        b(true);
        return;
_L2:
        a(true);
        l = null;
        j.a(bundle);
        b(true);
        if (bundle.containsKey("output") || bundle.getBoolean("update_lang", false))
        {
            com.google.android.libraries.translate.e.h.a(7, bundle);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public final void a(LangSpinner langspinner, Language language, Language language1, int i1)
    {
        if (language1.getShortName().equals(language.getShortName()))
        {
            return;
        }
        Language language2 = c.getSelectedLanguage();
        Language language3 = d.getSelectedLanguage();
        com.google.android.libraries.translate.core.b.b(this, language2, language3);
        Event event;
        if (langspinner == c)
        {
            event = Event.QUICK_LANG1_PICKED;
        } else
        {
            event = Event.QUICK_LANG2_PICKED;
        }
        com.google.android.libraries.translate.e.h.a(6, com.google.android.apps.translate.e.k.a(null, language2, language3, null));
        Singleton.b().a(event, language1.getShortName(), language.getShortName());
        Singleton.b().a(event, langspinner.getLastOpenTime(), language1.getShortName(), language.getShortName(), i1);
    }

    public final void a(m m1, b b1, Bundle bundle, int i1)
    {
        if (m1 == null) goto _L2; else goto _L1
_L1:
        if (!TextUtils.isEmpty(m1.a(0))) goto _L4; else goto _L3
_L3:
        m = new TranslateErrorCard(this, b1, bundle, -1);
_L6:
        b(false);
        return;
_L4:
        d.setSelectedLang(b1.f);
        a(m1.a(0), b1.c.a(1), b1);
        if (!TextUtils.isEmpty(m1.a(2)))
        {
            l = new DictionaryCard(this, b1, 3, this);
            findViewById(m.more_wrapper).setVisibility(0);
            findViewById(m.spacer).setVisibility(8);
        }
        continue; /* Loop/switch isn't completed */
_L2:
        m = new TranslateErrorCard(this, b1, bundle, i1);
        a(((View) (m)));
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void a(String s, b b1)
    {
        a(s, null, b1);
    }

    public final void a(boolean flag)
    {
        byte byte0 = 8;
        a(((View) (null)));
        Object obj = k;
        int i1;
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        ((View) (obj)).setVisibility(i1);
        obj = h;
        if (flag)
        {
            i1 = 8;
        } else
        {
            i1 = 0;
        }
        ((TextView) (obj)).setVisibility(i1);
        obj = g;
        if (flag)
        {
            i1 = byte0;
        } else
        {
            i1 = 0;
        }
        ((TextView) (obj)).setVisibility(i1);
    }

    public void onBackPressed()
    {
        Singleton.b().a(Event.QUICK_TRANSLATE_CANCEL, null, null);
        super.onBackPressed();
    }

    public void onClick(View view)
    {
        Object obj = null;
        if (view != a) goto _L2; else goto _L1
_L1:
        if (a.getVisibility() == 0)
        {
            a.a();
            view = c.getSelectedLanguage().getShortName();
            Singleton.b().a(Event.QUICK_INPUT_TTS, view, null);
        }
_L4:
        return;
_L2:
        if (view != b)
        {
            break; /* Loop/switch isn't completed */
        }
        if (b.getVisibility() == 0)
        {
            b.a();
            view = d.getSelectedLanguage().getShortName();
            Singleton.b().a(Event.QUICK_RESULT_TTS, view, null);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (view == i)
        {
            Singleton.b().a(Event.QUICK_TRANSLATE_CANCEL, null, null);
            finish();
            return;
        }
        if (m.replace_wrapper != view.getId())
        {
            continue; /* Loop/switch isn't completed */
        }
        if (p) goto _L4; else goto _L5
_L5:
        view = getIntent();
        view.putExtra("android.intent.extra.PROCESS_TEXT", h.getText());
        setResult(-1, view);
        Singleton.b().a(Event.QUICK_TRANSLATE_REPLACE, null, null);
        finish();
        return;
        if (m.more_wrapper != view.getId() || p || l == null) goto _L4; else goto _L6
_L6:
        view = obj;
        if (n.getChildCount() == 0)
        {
            view = l;
        }
        a(view);
        return;
    }

    protected void onCreate(Bundle bundle)
    {
        Language language;
        d d1;
        language = null;
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(o.activity_quick_translate);
        a = (SpeakerView)findViewById(m.speaker_view_src);
        a.setOnClickListener(this);
        b = (SpeakerView)findViewById(m.speaker_view_tgt);
        b.setOnClickListener(this);
        c = (LangSpinner)findViewById(m.spinner1);
        c.setSpinnerHandler(this);
        c.setClickEvent(Event.QUICK_LANG1_PICKER_OPEN);
        findViewById(m.spinner1_frame).setOnClickListener(c);
        d = (LangSpinner)findViewById(m.spinner2);
        d.setSpinnerHandler(this);
        d.setClickEvent(Event.QUICK_LANG2_PICKER_OPEN);
        findViewById(m.spinner2_frame).setOnClickListener(d);
        e = (TextView)findViewById(m.txt_source);
        f = (TextView)findViewById(m.txt_transliteration_src);
        h = (TextView)findViewById(m.txt_target);
        g = (TextView)findViewById(m.txt_transliteration_tgt);
        i = (TintImageView)findViewById(m.btn_close);
        i.setOnClickListener(this);
        j = new z(this, this, this);
        k = findViewById(m.progress_container);
        findViewById(m.more_wrapper).setOnClickListener(this);
        findViewById(m.replace_wrapper).setOnClickListener(this);
        n = (ScrollView)findViewById(m.dictionary_holder);
        n.setVisibility(8);
        o = findViewById(m.divider);
        o.setVisibility(8);
        d1 = com.google.android.libraries.translate.languages.e.a(this);
        if (bundle == null) goto _L2; else goto _L1
_L1:
        String s;
        s = bundle.getString("key_language_from");
        bundle = bundle.getString("key_language_to");
        if (s == null || bundle == null) goto _L2; else goto _L3
_L3:
        language = d1.a(s);
        bundle = d1.c(bundle);
_L5:
        Object obj;
label0:
        {
            if (language != null)
            {
                obj = bundle;
                if (bundle != null)
                {
                    break label0;
                }
            }
            language = d1.a("auto");
            obj = com.google.android.libraries.translate.core.b.b(this, d1)[1];
        }
        c.setSelectedLang(language);
        d.setSelectedLang(((Language) (obj)));
        onNewIntent(getIntent());
        return;
_L2:
        bundle = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected void onNewIntent(Intent intent)
    {
label0:
        {
            if ("android.intent.action.PROCESS_TEXT".equals(intent.getAction()))
            {
                Object obj = intent.getCharSequenceExtra("android.intent.extra.PROCESS_TEXT");
                boolean flag = intent.getBooleanExtra("android.intent.extra.PROCESS_TEXT_READONLY", false);
                intent = findViewById(m.replace_wrapper);
                com.google.android.libraries.translate.logging.e e1;
                byte byte0;
                if (flag)
                {
                    byte0 = 8;
                } else
                {
                    byte0 = 0;
                }
                intent.setVisibility(byte0);
                intent = findViewById(m.spacer);
                if (flag)
                {
                    byte0 = 8;
                } else
                {
                    byte0 = 0;
                }
                intent.setVisibility(byte0);
                findViewById(m.more_wrapper).setVisibility(8);
                if (obj != null)
                {
                    intent = com.google.android.libraries.translate.e.n.a(((CharSequence) (obj)).toString());
                } else
                {
                    intent = "";
                }
                if (intent.isEmpty())
                {
                    break label0;
                }
                e.setText(intent);
                e1 = Singleton.b();
                if (flag)
                {
                    obj = Event.QUICK_TRANSLATE_RO;
                } else
                {
                    obj = Event.QUICK_TRANSLATE_RW;
                }
                e1.a(((Event) (obj)), null, null);
                a(3, com.google.android.apps.translate.e.k.a(intent, c.getSelectedLanguage(), d.getSelectedLanguage(), ""));
            }
            return;
        }
        Toast.makeText(this, getString(r.msg_no_camera_result, new Object[] {
            ""
        }).replace("  ", " "), 1).show();
        finish();
    }

    protected void onPause()
    {
        ((MyTts)Singleton.b.b()).b();
        com.google.android.libraries.translate.e.h.a(this);
        super.onPause();
    }

    protected void onResume()
    {
        super.onResume();
        com.google.android.libraries.translate.e.h.a(this, new int[] {
            6, 3
        });
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        bundle.putString("key_language_from", c.getSelectedLanguage().getShortName());
        bundle.putString("key_language_to", d.getSelectedLanguage().getShortName());
        super.onSaveInstanceState(bundle);
    }

    public void setResultInformation(Language language, m m1)
    {
        Object obj;
        a.setTextToPlay(e.getText().toString(), language, "input");
        c.setSelectedLang(language);
        com.google.android.apps.translate.e.d.a(e, language.getShortName());
        obj = m1.a(3);
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            f.setText(((CharSequence) (obj)));
            f.setVisibility(0);
        }
        obj = d.getSelectedLanguage();
        if (!language.equals(obj)) goto _L2; else goto _L1
_L1:
        ArrayList arraylist;
        arraylist = new ArrayList();
        if (!TextUtils.isEmpty(m1.a(5)))
        {
            android.text.TextUtils.SimpleStringSplitter simplestringsplitter = new android.text.TextUtils.SimpleStringSplitter(',');
            simplestringsplitter.setString(m1.a(5));
            m1 = simplestringsplitter.iterator();
            do
            {
                if (!m1.hasNext())
                {
                    break;
                }
                String s = (String)m1.next();
                if (!TextUtils.isEmpty(s))
                {
                    arraylist.add(s);
                }
            } while (true);
        }
        arraylist.remove(language.getShortName());
        if (arraylist.contains(((Language) (obj)).getShortName())) goto _L2; else goto _L3
_L3:
        m1 = com.google.android.libraries.translate.core.b.b(this, com.google.android.libraries.translate.languages.e.a(this));
        if (m1[0].equals(obj)) goto _L2; else goto _L4
_L4:
        m1 = m1[0];
        a(3, com.google.android.apps.translate.e.k.a(e.getText().toString(), language, m1, ""));
_L6:
        com.google.android.libraries.translate.core.b.b(this, language, m1);
        return;
_L2:
        m1 = ((m) (obj));
        if (true) goto _L6; else goto _L5
_L5:
    }
}
