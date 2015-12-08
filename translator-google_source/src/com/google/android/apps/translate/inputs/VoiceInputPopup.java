// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputs;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.view.Window;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;
import com.google.android.apps.translate.anim.AnimationScheme;
import com.google.android.apps.translate.e.d;
import com.google.android.apps.translate.e.g;
import com.google.android.apps.translate.m;
import com.google.android.apps.translate.o;
import com.google.android.apps.translate.r;
import com.google.android.apps.translate.s;
import com.google.android.apps.translate.widget.CopyTextView;
import com.google.android.apps.translate.widget.PulseView;
import com.google.android.apps.translate.widget.VoiceButton;
import com.google.android.apps.translate.widget.VoiceLangButton;
import com.google.android.apps.translate.widget.WordWrapInput;
import com.google.android.apps.translate.widget.ax;
import com.google.android.apps.translate.widget.az;
import com.google.android.apps.translate.widget.ba;
import com.google.android.libraries.translate.b.c;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.core.b;
import com.google.android.libraries.translate.core.k;
import com.google.android.libraries.translate.e.h;
import com.google.android.libraries.translate.e.n;
import com.google.android.libraries.translate.languages.Language;
import com.google.android.libraries.translate.logging.Event;
import com.google.android.libraries.translate.speech.e;
import com.google.android.libraries.translate.speech.f;
import com.google.android.libraries.translate.speech.s3.RecognitionState;
import com.google.android.libraries.translate.speech.s3.a;
import com.google.android.libraries.translate.tts.MyTts;
import com.google.common.base.p;
import com.google.common.collect.Lists;

// Referenced classes of package com.google.android.apps.translate.inputs:
//            a, as, bo, bn, 
//            bm, br, aq, bs, 
//            bp, bq

public final class VoiceInputPopup extends com.google.android.apps.translate.inputs.a
    implements TextWatcher, android.view.View.OnClickListener, android.widget.TextView.OnEditorActionListener, as, ax, az, ba, e, com.google.android.libraries.translate.tts.e, Runnable
{

    private static final int o;
    private static final int p;
    private static final int q;
    private static final VoiceStates r[];
    private final View A;
    private final View B;
    private final LinearLayout C;
    private final View D;
    private final PulseView E;
    private final VoiceButton F;
    private final String G;
    private final String H;
    private final String I;
    private final a J;
    private Toast K;
    private Toast L;
    private Toast M;
    private View N;
    private ViewFlipper O;
    private CopyTextView P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private com.google.android.libraries.translate.speech.h U;
    private aq V;
    private g W;
    private boolean X;
    private final boolean Y;
    private boolean Z;
    private boolean aa;
    private int ab;
    private int ac;
    private String ad;
    private int ae;
    private int af;
    private int ag;
    private String ah;
    private boolean ai;
    private final boolean aj;
    private boolean ak;
    private final boolean al;
    private String am;
    private final boolean an;
    private long ao;
    private String ap;
    private Language aq;
    public final WordWrapInput f;
    public final TextView g;
    public final VoiceLangButton h;
    public final VoiceLangButton i;
    public VoiceLangButton j;
    public VoiceLangButton k;
    public boolean l;
    public VoiceLangButton m;
    public VoiceLangButton n;
    private final c s;
    private final View t;
    private final View u;
    private final View v;
    private final VoiceButton w;
    private final View x;
    private final View y;
    private final View z;

    public VoiceInputPopup(Context context, Language language, Language language1, View view, View view1, View view2)
    {
        super(context, language, language1, "inputm=3", s.SpeechTransparentTheme);
        s = (new c(VoiceStates.START)).a(VoiceStates.START, VoiceStates.RECOG_NEW_WORD, VoiceStates.RECOG_NEW_WORD).a(VoiceStates.START, VoiceStates.EDITTEXT_NEW_WORD, VoiceStates.EDITTEXT_NEW_WORD).a(VoiceStates.RECOG_NEW_WORD, null, null).a(VoiceStates.EDITTEXT_NEW_WORD, null, null).a(VoiceStates.RECOG_COMLETE, VoiceStates.TRANSLATION_SUCCESS, VoiceStates.TTS_BEGIN).a(VoiceStates.RECOG_COMLETE, VoiceStates.TRANSLATION_ERROR, VoiceStates.ERROR).a(VoiceStates.EDITTEXT_COMLETE, VoiceStates.TRANSLATION_SUCCESS, VoiceStates.TTS_BEGIN).a(VoiceStates.EDITTEXT_COMLETE, VoiceStates.TRANSLATION_ERROR, VoiceStates.ERROR).a(null, VoiceStates.RECOG_ERROR, VoiceStates.ERROR).a(VoiceStates.TRANSLATION_SUCCESS, VoiceStates.RECOG_COMLETE, VoiceStates.TTS_BEGIN).a(VoiceStates.TRANSLATION_SUCCESS, VoiceStates.EDITTEXT_COMLETE, VoiceStates.TTS_BEGIN).a(VoiceStates.TRANSLATION_SUCCESS, null, null).a(VoiceStates.TRANSLATION_ERROR, VoiceStates.RECOG_COMLETE, VoiceStates.ERROR).a(VoiceStates.TRANSLATION_ERROR, VoiceStates.EDITTEXT_COMLETE, VoiceStates.ERROR).a(VoiceStates.TRANSLATION_ERROR, null, null).a(null, VoiceStates.TTS_COMPLETE, VoiceStates.COMPLETE).a(null, VoiceStates.TTS_ERROR, VoiceStates.ERROR).a(VoiceStates.COMPLETE, new bo(this)).a(VoiceStates.ERROR, new bn(this)).a(VoiceStates.TTS_BEGIN, new bm(this));
        Q = false;
        S = false;
        T = false;
        l = false;
        X = false;
        ab = 0;
        ac = 0;
        ae = 0;
        af = 0;
        ag = -1;
        ah = "inputm=3";
        ai = false;
        ak = false;
        requestWindowFeature(8);
        setContentView(o.popup_voice_input);
        getWindow().setSoftInputMode(34);
        if (com.google.android.libraries.translate.e.o.f)
        {
            getWindow().addFlags(0x80000000);
        }
        setTitle(r.label_speech);
        com.google.android.libraries.translate.speech.c c1 = (com.google.android.libraries.translate.speech.c)Singleton.e.b();
        String s1 = c1.a(context, language);
        String s2 = c1.a(context, language1);
        J = new a(context);
        an = J.a();
        boolean flag;
        if (an)
        {
            al = c1.a(s2);
            aj = c1.a(s1);
        } else
        {
            al = c1.b(s2);
            aj = c1.b(s1);
            ai = false;
        }
        if (!com.google.android.libraries.translate.core.b.i(context))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Y = flag;
        t = view;
        u = view1;
        v = view2;
        w = (VoiceButton)findViewById(m.btn_voice_drop_down);
        x = findViewById(m.lang_bar);
        y = findViewById(m.input_card);
        z = findViewById(m.result_card);
        A = findViewById(m.img_arrow);
        B = findViewById(m.btn_fullscreen);
        C = (LinearLayout)findViewById(m.cards_holder);
        D = findViewById(m.divider);
        h = (VoiceLangButton)findViewById(m.lang1);
        h.setText(com.google.android.libraries.translate.e.n.a(context, r.lang_name, language.getShortName(), language.getLongName()));
        h.setContentDescription(language.toString());
        h.setTag(p, language);
        h.setTag(o, s1);
        h.setTag(q, Integer.valueOf(0));
        h.setBackgroundDrawable(new com.google.android.apps.translate.b.c(context, true));
        h.setVoiceLangButtonCallback(this);
        i = (VoiceLangButton)findViewById(m.lang2);
        i.setText(com.google.android.libraries.translate.e.n.a(context, r.lang_name, language1.getShortName(), language1.getLongName()));
        i.setContentDescription(language1.toString());
        i.setTag(p, language1);
        i.setTag(o, s2);
        i.setTag(q, Integer.valueOf(0));
        i.setBackgroundDrawable(new com.google.android.apps.translate.b.c(context, false));
        if (!al)
        {
            i.setEnabled(false);
        }
        i.setVoiceLangButtonCallback(this);
        com.google.android.apps.translate.e.d.a(i, language1.getShortName());
        F = (VoiceButton)findViewById(m.btn_voice);
        F.setVoiceButtonCallback(this);
        f = (WordWrapInput)findViewById(m.txt_recognized);
        f.setOnEditorActionListener(this);
        f.setBackButtonListener(this);
        f.addTextChangedListener(this);
        g = (TextView)findViewById(m.txt_translated);
        E = (PulseView)findViewById(m.img_pulse);
        view = findViewById(m.btn_clear_input);
        f.addTextChangedListener(new com.google.android.apps.translate.e.b(view));
        a(this, new View[] {
            findViewById(m.btn_fullscreen), view
        });
        G = com.google.android.libraries.translate.e.n.a(context, r.msg_speak_now, language1.getShortName(), language1.getLongName());
        H = com.google.android.libraries.translate.e.n.a(context, r.msg_speak_now, language.getShortName(), language.getLongName());
        I = context.getString(r.msg_listening_both_langs);
        setVolumeControlStream(3);
        com.google.android.libraries.translate.e.h.a(this, new int[] {
            15
        });
        t();
        Singleton.b().c("speech");
    }

    static int a(VoiceInputPopup voiceinputpopup, int i1)
    {
        voiceinputpopup.ag = i1;
        return i1;
    }

    private static android.widget.LinearLayout.LayoutParams a(int i1, int j1, View view)
    {
        view = (android.widget.LinearLayout.LayoutParams)view.getLayoutParams();
        view.width = j1;
        view.height = i1;
        return view;
    }

    static TextView a(VoiceInputPopup voiceinputpopup)
    {
        return voiceinputpopup.g;
    }

    static Language a(VoiceLangButton voicelangbutton)
    {
        return b(voicelangbutton);
    }

    static void a(VoiceInputPopup voiceinputpopup, View view)
    {
        voiceinputpopup.b(view);
    }

    static void a(VoiceInputPopup voiceinputpopup, VoiceLangButton voicelangbutton, VoiceLangButton voicelangbutton1)
    {
        voiceinputpopup.a(voicelangbutton, voicelangbutton1, true);
    }

    static void a(VoiceInputPopup voiceinputpopup, String s1, Language language)
    {
        voiceinputpopup.a(s1, language);
    }

    private void a(VoiceLangButton voicelangbutton, VoiceLangButton voicelangbutton1, boolean flag)
    {
        Object obj2;
        Object obj3;
        String s2;
        if (!isShowing())
        {
            return;
        }
        a(((android.view.View.OnClickListener) (null)), new View[] {
            f
        });
        f.setIsTextEditor(false);
        f.setCursorVisible(false);
        f.b();
        am = null;
        obj3 = null;
        if (!ai)
        {
            break MISSING_BLOCK_LABEL_263;
        }
        obj2 = (String)voicelangbutton.getTag(o);
        s2 = (String)voicelangbutton1.getTag(o);
        if (!((com.google.android.libraries.translate.speech.c)Singleton.e.b()).a(((String) (obj2)))) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        VoiceLangButton voicelangbutton2;
        obj = obj2;
        voicelangbutton2 = voicelangbutton;
        obj1 = voicelangbutton1;
        if (!((com.google.android.libraries.translate.speech.c)Singleton.e.b()).a(s2)) goto _L4; else goto _L3
_L3:
        obj1 = Lists.a(new String[] {
            (String)voicelangbutton1.getTag(o)
        });
        obj = obj2;
        obj2 = obj1;
_L5:
        boolean flag1;
        m = voicelangbutton;
        n = voicelangbutton1;
        if (!s.a(r))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        b(true);
        if (!ai && !voicelangbutton.isSelected() && flag1)
        {
            o();
            l = true;
            return;
        }
        break MISSING_BLOCK_LABEL_288;
_L2:
        com.google.common.base.p.b(((com.google.android.libraries.translate.speech.c)Singleton.e.b()).a(s2), "Either one of locales should be supported by speech input.");
        obj = s2;
        obj1 = voicelangbutton;
        voicelangbutton2 = voicelangbutton1;
_L4:
        obj2 = obj3;
        voicelangbutton = voicelangbutton2;
        voicelangbutton1 = ((VoiceLangButton) (obj1));
          goto _L5
        obj = (String)voicelangbutton.getTag(o);
        obj2 = obj3;
          goto _L5
        boolean flag2;
        q();
        if (flag1 && j == voicelangbutton)
        {
            f.setText("");
            g.setText("");
        }
        j = voicelangbutton;
        k = voicelangbutton1;
        j.setColorByState(com.google.android.apps.translate.widget.VoiceLangButton.State.DEFAULT);
        k.setColorByState(com.google.android.apps.translate.widget.VoiceLangButton.State.DEFAULT);
        boolean flag3 = X;
        String s1;
        a a1;
        if (X || voicelangbutton == i)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        X = flag2;
        if (!ak) goto _L7; else goto _L6
_L6:
        ak = false;
_L9:
        obj1 = this;
        flag2 = false;
_L10:
        obj1.l = flag2;
        if (X)
        {
            obj1 = "inputm=3&source=conv";
        } else
        {
            obj1 = "inputm=3";
        }
        ah = ((String) (obj1));
        if (!flag3 && X && ag > 0)
        {
            a(Event.CONV_START_LENGTH, ag);
        }
        if (Y && X && !S)
        {
            m = voicelangbutton1;
            n = voicelangbutton;
        }
        if (J.a() && ((com.google.android.libraries.translate.speech.c)Singleton.e.b()).a(((String) (obj))))
        {
            Z = flag;
            obj1 = com.google.android.libraries.translate.core.b.f(getContext(), getContext().getString(r.default_single_speech_service));
            s1 = com.google.android.libraries.translate.core.b.g(getContext(), getContext().getString(r.default_multi_speech_service));
            a1 = J;
            flag2 = com.google.android.libraries.translate.core.b.j(getContext(), getContext().getString(r.default_use_translate_s2s_single));
            flag3 = com.google.android.libraries.translate.core.b.k(getContext(), getContext().getString(r.default_use_translate_s2s_multi));
            U = new com.google.android.libraries.translate.speech.s3.c(this, a1.a, com.google.android.libraries.translate.e.o.b(), ((String) (obj)), ((java.util.List) (obj2)), com.google.android.libraries.translate.core.b.h(Singleton.a()), flag, flag2, flag3, ((String) (obj1)), s1);
            if (s())
            {
                ((com.google.android.libraries.translate.speech.s3.c)U).d = b(j);
                obj = (com.google.android.libraries.translate.speech.s3.c)U;
                obj1 = b(k);
                obj.e = ((Language) (obj1));
                ((com.google.android.libraries.translate.speech.s3.c) (obj)).a.a = ((Language) (obj1));
            }
            if (!flag)
            {
                Singleton.b().a(Event.WALKIE_TALKIE_USED, b(voicelangbutton).getShortName(), b(voicelangbutton1).getShortName());
            }
        } else
        {
            Z = true;
            U = new f(getContext(), ((String) (obj)), this);
        }
        if (!ai)
        {
            voicelangbutton = j;
            if (!s())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            b(voicelangbutton, flag);
        }
        if (!((AccessibilityManager)Singleton.a.b()).isEnabled())
        {
            K = com.google.android.libraries.translate.e.m.a(r.msg_please_wait, 1);
        }
        U.b_();
        F.setState(1);
        f.setHint(r.msg_initializing);
        aa = false;
        return;
_L7:
        if (!X && !S) goto _L9; else goto _L8
_L8:
        flag2 = true;
        obj1 = this;
          goto _L10
    }

    private void a(Event event, int i1)
    {
        Singleton.b().a(event, a.getShortName(), b.getShortName(), i1);
    }

    static boolean a(VoiceInputPopup voiceinputpopup, boolean flag)
    {
        voiceinputpopup.Q = flag;
        return flag;
    }

    private static Language b(VoiceLangButton voicelangbutton)
    {
        return (Language)voicelangbutton.getTag(p);
    }

    private void b(View view)
    {
        if (!R)
        {
            return;
        }
        getOwnerActivity().setRequestedOrientation(-1);
        q();
        R = false;
        AnimationScheme.BOTTOM.hideView(x);
        w.setVisibility(0);
        w.setState(0);
        AnimationScheme.FADE.hideView(w);
        D.setVisibility(8);
        F.setVisibility(8);
        E.setVisibility(8);
        findViewById(m.root_view).setBackgroundColor(0);
        a(y.getMeasuredHeight(), y.getMeasuredWidth(), y).weight = 0.0F;
        AnimationScheme.FADE.hideView(y);
        AnimationScheme.FADE.hideView(z);
        android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)C.getLayoutParams();
        layoutparams.height = C.getMeasuredHeight();
        layoutparams.weight = 0.0F;
        view = (new com.google.android.apps.translate.anim.c(C)).a("topMargin", a(view)).a("height", view.getHeight());
        view.setAnimationListener(new br(this));
        view.a(getContext(), 0x10e0000);
        if (com.google.android.libraries.translate.e.o.f)
        {
            view.setInterpolator(AnimationUtils.loadInterpolator(getContext(), 0x10c000e));
        }
        C.startAnimation(view);
    }

    private void b(VoiceLangButton voicelangbutton, boolean flag)
    {
        int i1 = 0;
        this;
        JVM INSTR monitorenter ;
        if (voicelangbutton != h) goto _L2; else goto _L1
_L1:
        Object obj = y;
_L5:
        j = voicelangbutton;
        if (voicelangbutton != h) goto _L4; else goto _L3
_L3:
        VoiceLangButton voicelangbutton1 = i;
_L6:
        k = voicelangbutton1;
        if (C.indexOfChild(((View) (obj))) != 0)
        {
            C.removeView(((View) (obj)));
            C.addView(((View) (obj)), 0);
            C.removeView(D);
            C.addView(D, 1);
            if (P != null)
            {
                P.setCopySource(null);
            }
            obj = f.getText();
            f.setText(g.getText());
            g.setText(((CharSequence) (obj)));
        }
        obj = B;
        if (j != h)
        {
            i1 = 4;
        }
        ((View) (obj)).setVisibility(i1);
        voicelangbutton = b(voicelangbutton);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_230;
        }
        V = new aq(g, voicelangbutton, b(k));
        V.a(ah);
        f.addTextChangedListener(V);
        V.e = this;
        V.a();
        com.google.android.libraries.translate.e.o.a(f, voicelangbutton);
        if (W != null)
        {
            W.a();
        }
        W = com.google.android.apps.translate.e.d.a(f, voicelangbutton.getShortName());
        s.a();
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        obj = z;
          goto _L5
_L4:
        voicelangbutton1 = h;
          goto _L6
        voicelangbutton;
        throw voicelangbutton;
          goto _L5
    }

    private void b(boolean flag)
    {
        if (flag & true)
        {
            z.setOnClickListener(this);
            A.setVisibility(0);
            return;
        } else
        {
            z.setOnClickListener(null);
            z.setClickable(false);
            A.setVisibility(4);
            return;
        }
    }

    static boolean b(VoiceInputPopup voiceinputpopup)
    {
        voiceinputpopup.T = true;
        return true;
    }

    static VoiceLangButton c(VoiceInputPopup voiceinputpopup)
    {
        return voiceinputpopup.j;
    }

    static VoiceLangButton d(VoiceInputPopup voiceinputpopup)
    {
        return voiceinputpopup.k;
    }

    static int e(VoiceInputPopup voiceinputpopup)
    {
        return voiceinputpopup.ag;
    }

    static void f(VoiceInputPopup voiceinputpopup)
    {
        voiceinputpopup.q();
    }

    static boolean g(VoiceInputPopup voiceinputpopup)
    {
        return voiceinputpopup.l;
    }

    static VoiceLangButton h(VoiceInputPopup voiceinputpopup)
    {
        return voiceinputpopup.m;
    }

    static VoiceLangButton i(VoiceInputPopup voiceinputpopup)
    {
        return voiceinputpopup.n;
    }

    static View j(VoiceInputPopup voiceinputpopup)
    {
        return voiceinputpopup.v;
    }

    static boolean k(VoiceInputPopup voiceinputpopup)
    {
        voiceinputpopup.R = true;
        return true;
    }

    static VoiceButton l(VoiceInputPopup voiceinputpopup)
    {
        return voiceinputpopup.w;
    }

    static int m()
    {
        return q;
    }

    static VoiceButton m(VoiceInputPopup voiceinputpopup)
    {
        return voiceinputpopup.F;
    }

    static PulseView n(VoiceInputPopup voiceinputpopup)
    {
        return voiceinputpopup.E;
    }

    private void n()
    {
        if (U != null)
        {
            U.b();
            U = null;
        }
    }

    static View o(VoiceInputPopup voiceinputpopup)
    {
        return voiceinputpopup.y;
    }

    private void o()
    {
        if (U != null)
        {
            Z = true;
            U.c();
            F.setState(3);
            if (aa)
            {
                s.a(VoiceStates.RECOG_COMLETE);
            }
        }
    }

    static View p(VoiceInputPopup voiceinputpopup)
    {
        return voiceinputpopup.z;
    }

    private void p()
    {
        if (V != null)
        {
            f.removeTextChangedListener(V);
            V.b();
            V = null;
        }
    }

    private void q()
    {
        n();
        p();
        ((MyTts)Singleton.b.b()).b();
        s.a();
        E.a(0.0F);
        f.setHint(r.msg_tap_to_speak);
        F.setState(0);
        h.setChecked(false);
        i.setChecked(false);
        h.setSelected(false);
        i.setSelected(false);
        if (f.getText().length() > 0)
        {
            a(this, new View[] {
                f
            });
        }
        if (L != null)
        {
            L.cancel();
            L = null;
        }
    }

    static boolean q(VoiceInputPopup voiceinputpopup)
    {
        return voiceinputpopup.u();
    }

    static View r(VoiceInputPopup voiceinputpopup)
    {
        return voiceinputpopup.D;
    }

    private void r()
    {
        if (!s.a(new VoiceStates[] {
    VoiceStates.EDITTEXT_NEW_WORD, VoiceStates.TRANSLATION_SUCCESS, VoiceStates.TRANSLATION_ERROR
}))
        {
            return;
        }
        String s1 = f.getText().toString();
        if (TextUtils.isEmpty(s1))
        {
            s.a(VoiceStates.START);
        } else
        {
            if (!TextUtils.equals(ad, s1))
            {
                ae = ae + 1;
            }
            V.b(s1);
            s.a(VoiceStates.EDITTEXT_COMLETE);
        }
        f.setIsTextEditor(false);
        f.setCursorVisible(false);
    }

    private boolean s()
    {
        if (U instanceof com.google.android.libraries.translate.speech.s3.c)
        {
            return ((com.google.android.libraries.translate.speech.s3.c)U).b;
        } else
        {
            return false;
        }
    }

    static boolean s(VoiceInputPopup voiceinputpopup)
    {
        return voiceinputpopup.Q;
    }

    static View t(VoiceInputPopup voiceinputpopup)
    {
        return voiceinputpopup.u;
    }

    private void t()
    {
        int i1 = getContext().getResources().getDimensionPixelSize(com.google.android.apps.translate.k.source_target_divider_size);
        if (!u()) goto _L2; else goto _L1
_L1:
        C.setOrientation(0);
        a(-1, 0, y);
        a(-1, 0, z);
        a(-1, i1, D);
        if (Q && !S)
        {
            v();
            com.google.android.libraries.translate.e.o.a(N);
            ab = ab + 1;
        }
_L4:
        if (isShowing())
        {
            C.requestLayout();
        }
        return;
_L2:
        C.setOrientation(1);
        a(0, -1, y);
        a(0, -1, z);
        a(i1, -1, D);
        if (Q && S)
        {
            w();
            com.google.android.libraries.translate.e.o.a(N);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private boolean u()
    {
        return getContext().getResources().getConfiguration().orientation == 2;
    }

    private void v()
    {
        boolean flag;
        if (N == null)
        {
            N = ((ViewStub)findViewById(m.fullscreen_stub)).inflate();
            O = (ViewFlipper)N.findViewById(m.fullscreen_texts);
            android.graphics.Typeface typeface = i.getTypeface();
            Object obj = (TextView)N.findViewById(m.lang2);
            ((TextView) (obj)).setText(i.getText());
            ((TextView) (obj)).setTypeface(typeface);
            if (i.isEnabled())
            {
                obj = (TextView)N.findViewById(m.lang1);
                ((TextView) (obj)).setText(G);
                ((TextView) (obj)).setTypeface(typeface);
            }
            P = (CopyTextView)O.getChildAt(0);
            P.setTypeface(typeface);
            obj = (CopyTextView)O.getChildAt(1);
            ((CopyTextView) (obj)).setTypeface(typeface);
            ((CopyTextView) (obj)).setCopySource(f);
        }
        S = true;
        Singleton.b().c("speech_expand");
        flag = i.isEnabled();
        if (!flag)
        {
            F.setVisibility(4);
        }
        if (s.a(r)) goto _L2; else goto _L1
_L1:
        if (j == i)
        {
            O.setDisplayedChild(1);
        } else
        {
            P.setCopySource(g);
            O.setDisplayedChild(0);
            if (flag && !i.isSelected())
            {
                a(i, h, true);
            } else
            {
                o();
            }
        }
_L4:
        if (getActionBar() != null)
        {
            getActionBar().hide();
        }
        l = flag;
        m = i;
        n = h;
        AnimationScheme.FADE.showView(N);
        return;
_L2:
        if (j == i)
        {
            P.setCopySource(f);
            O.setDisplayedChild(0);
            if (flag && F.getState() == 0)
            {
                a(i, h, true);
            }
        } else
        {
            P.setText(g.getText());
            O.setDisplayedChild(0);
            if (flag)
            {
                a(i, h, true);
            } else
            {
                o();
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void w()
    {
        if (getActionBar() != null)
        {
            getActionBar().show();
        }
        S = false;
        Singleton.b().c("speech_collapse");
        F.setVisibility(0);
        AnimationScheme.FADE.hideView(N);
        P.setCopySource(null);
        l = true;
        if (!s.a(r))
        {
            m = h;
            n = i;
            l = true;
            o();
            return;
        } else
        {
            a(h, i, true);
            return;
        }
    }

    public final void a()
    {
        boolean flag = true;
        getWindow().setFlags(128, 128);
        y.setVisibility(0);
        z.setVisibility(0);
        x.setVisibility(0);
        C.setVisibility(0);
        D.setVisibility(0);
        findViewById(m.root_view).setBackgroundColor(-1);
        F.setVisibility(0);
        E.setVisibility(0);
        R = true;
        if (com.google.android.libraries.translate.e.o.a() || u())
        {
            flag = false;
        }
        Q = flag;
        if (Q)
        {
            getOwnerActivity().setRequestedOrientation(4);
        }
    }

    public final void a(float f1)
    {
        E.a(f1);
    }

    public final void a(int i1)
    {
        if (s.a(new VoiceStates[] {
    VoiceStates.RECOG_COMLETE
}) && i1 != 0)
        {
            n();
        }
        if (i1 != 0)
        {
            if (1 == i1)
            {
                s.a(VoiceStates.TRANSLATION_SUCCESS);
            } else
            {
                s.a(VoiceStates.TRANSLATION_ERROR);
            }
            if (s.a(new VoiceStates[] {
    VoiceStates.ERROR
}))
            {
                com.google.android.libraries.translate.e.m.a(r.msg_translation_error, 0);
            }
        }
    }

    public final void a(int i1, Bundle bundle)
    {
        if (i1 == 15)
        {
            t();
            return;
        } else
        {
            super.a(i1, bundle);
            return;
        }
    }

    public final void a(Activity activity)
    {
        super.a(activity);
        a();
        a(h, i, true);
    }

    protected final void a(Bundle bundle)
    {
        bundle.putLong("lang_anim_delay", 500L);
    }

    public final void a(VoiceLangButton voicelangbutton, boolean flag)
    {
        boolean flag3 = true;
        boolean flag1 = true;
        if (flag && j == voicelangbutton && s.a(new VoiceStates[] {
    VoiceStates.START, VoiceStates.RECOG_NEW_WORD
}) && U != null)
        {
            l = false;
        } else
        {
            if (flag)
            {
                q();
            }
            if (!flag && !ai && j == voicelangbutton && s.a(new VoiceStates[] {
    VoiceStates.START, VoiceStates.RECOG_NEW_WORD
}) && U != null)
            {
                com.google.android.libraries.translate.logging.e e1 = Singleton.b();
                if (voicelangbutton == h)
                {
                    voicelangbutton = Event.SPEECH_INPUT_PAUSED1;
                } else
                {
                    voicelangbutton = Event.SPEECH_INPUT_PAUSED2;
                }
                e1.a(voicelangbutton, b(j).getShortName(), b(k).getShortName());
                b();
                return;
            }
            if (ai)
            {
                ai = false;
            }
            if (!Y)
            {
                ak = true;
            }
            if (voicelangbutton.getId() == m.lang1)
            {
                voicelangbutton = h;
                VoiceLangButton voicelangbutton1 = i;
                if (flag)
                {
                    flag1 = false;
                }
                a(voicelangbutton, voicelangbutton1, flag1);
            } else
            {
                if (!X)
                {
                    a(Event.CONV_STARTED_USING_BTN);
                }
                voicelangbutton = i;
                VoiceLangButton voicelangbutton2 = h;
                boolean flag2;
                if (!flag)
                {
                    flag2 = flag3;
                } else
                {
                    flag2 = false;
                }
                a(voicelangbutton, voicelangbutton2, flag2);
            }
            if (flag)
            {
                l = false;
                return;
            }
        }
    }

    public final void a(String s1, Language language)
    {
        if (!isShowing())
        {
            return;
        }
        n();
        MyTts mytts = (MyTts)Singleton.b.b();
        if (!TextUtils.isEmpty(s1) && language != null && mytts.a(language))
        {
            String s2;
            if (S)
            {
                if (language.equals(b(h)))
                {
                    s2 = "spflsrc";
                } else
                {
                    s2 = "spfltrg";
                }
            } else
            if (language.equals(b(h)))
            {
                s2 = "spsrc";
            } else
            {
                s2 = "sptrg";
            }
            if (!((AccessibilityManager)Singleton.a.b()).isEnabled())
            {
                M = com.google.android.libraries.translate.e.m.a(r.msg_preparing_to_speak, 1);
            }
            ap = s2;
            aq = language;
            mytts.a(getContext(), language, s1, s2, this);
            return;
        } else
        {
            com.google.android.libraries.translate.e.m.a(r.msg_no_tts, 1);
            j();
            return;
        }
    }

    public final void a(String s1, String s2, boolean flag)
    {
        if (TextUtils.isEmpty(s1)) goto _L2; else goto _L1
_L1:
        boolean flag1;
        if (ai && !TextUtils.equals(am, s2))
        {
            am = s2;
            s2 = com.google.android.libraries.translate.e.f.b(s2);
            p();
            boolean flag2;
            if (TextUtils.equals(b(h).getShortName(), s2))
            {
                m = h;
                n = i;
            } else
            {
                m = i;
                n = h;
            }
            s2 = m;
            if (!s())
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            b(s2, flag2);
            s2 = "";
        } else
        {
            s2 = f.getText().toString();
        }
        if (!s2.equals(s1) || s.a(new VoiceStates[] {
    VoiceStates.START
}))
        {
            s.a(VoiceStates.RECOG_NEW_WORD);
            f.setText(s1);
        }
        if (!s()) goto _L4; else goto _L3
_L3:
        s2 = (com.google.android.libraries.translate.speech.s3.c)U;
        if (((com.google.android.libraries.translate.speech.s3.c) (s2)).c != null && TextUtils.equals(((com.google.android.libraries.translate.speech.s3.c) (s2)).c.e, s1))
        {
            s1 = ((com.google.android.libraries.translate.speech.s3.c) (s2)).c.f;
        } else
        {
            s1 = null;
        }
        if (s1 == null) goto _L4; else goto _L5
_L5:
        if (!s1.equals(g.getText()))
        {
            g.setText(s1);
        }
        flag1 = true;
_L7:
        aa = flag;
        if (flag && Z)
        {
            if (!flag1 || s.a != VoiceStates.RECOG_COMLETE)
            {
                s.a(VoiceStates.RECOG_COMLETE);
            }
            ao = System.currentTimeMillis();
            j.setColorByState(com.google.android.apps.translate.widget.VoiceLangButton.State.SOURCE_LANGUAGE);
            k.setColorByState(com.google.android.apps.translate.widget.VoiceLangButton.State.TARGET_LANGUAGE);
        }
        b(flag);
        a(((android.view.View.OnClickListener) (this)), new View[] {
            g, f
        });
        if (S && j == m)
        {
            O.setDisplayedChild(1);
        }
_L2:
        return;
_L4:
        flag1 = false;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void a(boolean flag)
    {
        boolean flag2 = true;
        if (flag && ai && s.a(new VoiceStates[] {
    VoiceStates.START, VoiceStates.RECOG_NEW_WORD
}) && U != null)
        {
            l = false;
            return;
        }
        if (F.getState() != 0)
        {
            q();
            a(Event.SPEECH_INPUT_PAUSED);
            return;
        }
        if (!ai)
        {
            VoiceLangButton voicelangbutton;
            VoiceLangButton voicelangbutton1;
            boolean flag1;
            if (an && aj && al && com.google.android.libraries.translate.core.b.i(getContext()))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            ai = flag1;
        }
        if (ai)
        {
            X = true;
        }
        voicelangbutton = j;
        voicelangbutton1 = k;
        if (!flag)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        a(voicelangbutton, voicelangbutton1, flag);
    }

    public final void afterTextChanged(Editable editable)
    {
    }

    public final void b()
    {
        if (s.a(r))
        {
            q();
            return;
        } else
        {
            o();
            return;
        }
    }

    public final void b(int i1)
    {
        if (M != null)
        {
            M.cancel();
            M = null;
        }
        com.google.android.libraries.translate.e.m.a(com.google.android.libraries.translate.tts.b.a(i1), 1);
        s.a(VoiceStates.TTS_ERROR);
    }

    public final void b(String s1)
    {
        show();
        getWindow().setFlags(128, 128);
        R = false;
        v.setSelected(true);
        a(this);
        if (getActionBar() != null)
        {
            getActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    public final void b(String s1, Language language)
    {
        F.setState(4);
        if (ap != null && aq != null)
        {
            Singleton.b().a(Event.SPEECH_TTS_START, ao, aq.getShortName(), null, null, ap.length());
        }
    }

    public final void beforeTextChanged(CharSequence charsequence, int i1, int j1, int k1)
    {
    }

    public final void c()
    {
        q();
        dismiss();
    }

    public final void c(String s1)
    {
        if (K != null)
        {
            K.cancel();
            K = null;
        }
        com.google.android.libraries.translate.e.m.a(s1, 1);
        s.a(VoiceStates.RECOG_ERROR);
    }

    public final void d()
    {
        b(t);
    }

    public final void e()
    {
        if (s.a(r))
        {
            q();
            return;
        } else
        {
            o();
            return;
        }
    }

    public final void f()
    {
        F.setState(2);
        f.setHint(H);
        if (ai)
        {
            g.setHint(G);
            h.setChecked(true);
            i.setChecked(true);
        } else
        {
            g.setHint("");
            j.setChecked(true);
        }
        if (K != null)
        {
            K.cancel();
            K = null;
        }
        if (ai)
        {
            if (S)
            {
                ((TextView)N.findViewById(h.getId())).setText(H);
                ((TextView)N.findViewById(i.getId())).setText(G);
                return;
            } else
            {
                L = com.google.android.libraries.translate.e.m.a(I, 1);
                return;
            }
        }
        String s1;
        boolean flag;
        if (j == i)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            s1 = G;
        } else
        {
            s1 = H;
        }
        if (S)
        {
            View view = N;
            VoiceLangButton voicelangbutton;
            if (flag)
            {
                voicelangbutton = i;
            } else
            {
                voicelangbutton = h;
            }
            ((TextView)view.findViewById(voicelangbutton.getId())).setText(s1);
        } else
        {
            L = com.google.android.libraries.translate.e.m.a(s1, 1);
        }
        f.setHint(s1);
    }

    public final void g()
    {
        F.setState(0);
        if (ai)
        {
            h.setChecked(false);
            i.setChecked(false);
        } else
        {
            j.setChecked(false);
        }
        if (S)
        {
            if (ai)
            {
                ((TextView)N.findViewById(h.getId())).setText("");
                ((TextView)N.findViewById(i.getId())).setText("");
            } else
            {
                ((TextView)N.findViewById(n.getId())).setText("");
            }
        }
        if (L != null)
        {
            L.cancel();
            L = null;
        }
    }

    public final void h()
    {
        if (an)
        {
            F.setState(3);
        }
    }

    public final void i()
    {
        if (g.getText().length() > 0)
        {
            s.a(VoiceStates.TRANSLATION_SUCCESS);
        }
    }

    public final void j()
    {
        if (M != null)
        {
            M.cancel();
            M = null;
        }
        s.a(VoiceStates.TTS_COMPLETE);
    }

    public final void k()
    {
        F.setState(3);
    }

    public final void l()
    {
        r();
    }

    public final void onBackPressed()
    {
        if (S)
        {
            w();
            Q = false;
            getOwnerActivity().setRequestedOrientation(-1);
            return;
        } else
        {
            super.onBackPressed();
            return;
        }
    }

    public final void onClick(View view)
    {
        int i1 = view.getId();
        if (i1 != m.btn_clear_input) goto _L2; else goto _L1
_L1:
        if (f.getText().length() != 0 && j != null) goto _L4; else goto _L3
_L3:
        com.google.android.libraries.translate.logging.e e1 = Singleton.b();
        if (j == h)
        {
            view = Event.SPEECH_CROSS_TO_BACK1;
        } else
        {
            view = Event.SPEECH_CROSS_TO_BACK2;
        }
        e1.a(view, b(j).getShortName(), b(k).getShortName());
        super.onBackPressed();
_L6:
        return;
_L4:
        q();
        com.google.android.libraries.translate.logging.e e2 = Singleton.b();
        if (j == h)
        {
            view = Event.SPEECH_CROSS_TO_CLEAR1;
        } else
        {
            view = Event.SPEECH_CROSS_TO_CLEAR2;
        }
        e2.a(view, b(j).getShortName(), b(k).getShortName());
        f.setText("");
        b(false);
        a(j, k, true);
        return;
_L2:
        if (i1 == m.btn_fullscreen)
        {
            v();
            ac = ac + 1;
            return;
        }
        if (i1 != m.result_card)
        {
            break; /* Loop/switch isn't completed */
        }
        view = com.google.android.libraries.translate.e.n.a(f.getText().toString());
        if (!view.isEmpty())
        {
            a(view, b(j), b(k));
            com.google.android.libraries.translate.logging.e e3 = Singleton.b();
            if (j == h)
            {
                view = Event.SPEECH_SEE_DETAILS1;
            } else
            {
                view = Event.SPEECH_SEE_DETAILS2;
            }
            e3.a(view, b(j).getShortName(), b(k).getShortName());
            a(new bs(this));
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (i1 != m.txt_recognized)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (f.getText().length() > 0)
        {
            if (!s.a(new VoiceStates[] {
    VoiceStates.EDITTEXT_NEW_WORD
}))
            {
                q();
                if (X)
                {
                    if (j == h)
                    {
                        view = "inputm=2&source=conv1-edit";
                    } else
                    {
                        view = "inputm=2&source=conv2-edit";
                    }
                    ah = view;
                } else
                {
                    ah = "inputm=2&source=voice-edit";
                }
                s.a(VoiceStates.EDITTEXT_NEW_WORD);
                V = new aq(g, b(j), b(k));
                V.a(ah);
                f.addTextChangedListener(V);
                V.e = this;
                V.a();
            }
            if (!f.onCheckIsTextEditor())
            {
                ad = f.getText().toString();
            }
            f.setIsTextEditor(true);
            f.setCursorVisible(true);
            f.requestFocus();
            f.a();
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (i1 != m.txt_translated || !s.a(r)) goto _L6; else goto _L7
_L7:
        view = g.getText().toString();
        if (!view.isEmpty())
        {
            s.a();
            a(view, b(k));
            af = af + 1;
            return;
        }
        if (true) goto _L6; else goto _L8
_L8:
    }

    public final void onDismiss(DialogInterface dialoginterface)
    {
        int i1 = ((Integer)h.getTag(q)).intValue();
        int j1 = ((Integer)i.getTag(q)).intValue();
        if (j1 > 0)
        {
            a(Event.CONV_SESSION, i1 + j1);
            a(Event.CONV_SESSION_LANG1, i1);
            a(Event.CONV_SESSION_LANG2, j1);
        } else
        {
            a(Event.SPEECH_SESSION, i1);
        }
        if (ac > 0)
        {
            a(Event.SPEECH_ZOOM_USING_BTN, ac);
        }
        if (ab > 0)
        {
            a(Event.SPEECH_ZOOM_USING_GESTURE, ab);
        }
        if (ae > 0)
        {
            a(Event.SPEECH_CORRECTED, ae);
        }
        if (af > 0)
        {
            a(Event.SPEECH_TTS_REPLAYED, af);
        }
        if (T)
        {
            com.google.android.libraries.translate.e.h.a(13);
        }
        q();
        v.setSelected(false);
        v.setVisibility(0);
        getOwnerActivity().setRequestedOrientation(-1);
        super.onDismiss(dialoginterface);
    }

    public final boolean onEditorAction(TextView textview, int i1, KeyEvent keyevent)
    {
        if (i1 == 3 || i1 == 6 || keyevent.getAction() == 0 && keyevent.getKeyCode() == 66)
        {
            f.b();
            r();
            return true;
        } else
        {
            return false;
        }
    }

    public final boolean onMenuItemSelected(int i1, MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            onBackPressed();
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    public final void onTextChanged(CharSequence charsequence, int i1, int j1, int k1)
    {
        s.a(VoiceStates.RECOG_NEW_WORD);
    }

    public final void run()
    {
        w.setState(2);
        w.setVisibility(0);
        a(new bp(this));
        C.setVisibility(0);
        AnimationScheme.BOTTOM.showView(x);
        android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)C.getLayoutParams();
        layoutparams.height = t.getHeight();
        layoutparams.weight = 0.0F;
        layoutparams.topMargin = a(t);
        View view = findViewById(m.root_view);
        com.google.android.apps.translate.anim.c c1 = (new com.google.android.apps.translate.anim.c(C)).a("topMargin", 0).a("height", view.getMeasuredHeight() - w.getMeasuredHeight());
        c1.setAnimationListener(new bq(this, layoutparams, view));
        c1.a(getContext(), 0x10e0000);
        if (com.google.android.libraries.translate.e.o.f)
        {
            c1.setInterpolator(AnimationUtils.loadInterpolator(getContext(), 0x10c000d));
        }
        C.startAnimation(c1);
        a(h, i, true);
    }

    static 
    {
        o = m.lang1;
        p = m.lang2;
        q = m.progress;
        r = (new VoiceStates[] {
            VoiceStates.START, VoiceStates.ERROR, VoiceStates.COMPLETE
        });
    }

    private class VoiceStates extends Enum
    {

        public static final VoiceStates COMPLETE;
        public static final VoiceStates EDITTEXT_COMLETE;
        public static final VoiceStates EDITTEXT_NEW_WORD;
        public static final VoiceStates ERROR;
        public static final VoiceStates RECOG_COMLETE;
        public static final VoiceStates RECOG_ERROR;
        public static final VoiceStates RECOG_NEW_WORD;
        public static final VoiceStates START;
        public static final VoiceStates TRANSLATION_ERROR;
        public static final VoiceStates TRANSLATION_SUCCESS;
        public static final VoiceStates TTS_BEGIN;
        public static final VoiceStates TTS_COMPLETE;
        public static final VoiceStates TTS_ERROR;
        private static final VoiceStates a[];

        public static VoiceStates valueOf(String s1)
        {
            return (VoiceStates)Enum.valueOf(com/google/android/apps/translate/inputs/VoiceInputPopup$VoiceStates, s1);
        }

        public static VoiceStates[] values()
        {
            return (VoiceStates[])a.clone();
        }

        static 
        {
            START = new VoiceStates("START", 0);
            RECOG_NEW_WORD = new VoiceStates("RECOG_NEW_WORD", 1);
            RECOG_COMLETE = new VoiceStates("RECOG_COMLETE", 2);
            RECOG_ERROR = new VoiceStates("RECOG_ERROR", 3);
            TRANSLATION_SUCCESS = new VoiceStates("TRANSLATION_SUCCESS", 4);
            TRANSLATION_ERROR = new VoiceStates("TRANSLATION_ERROR", 5);
            TTS_BEGIN = new VoiceStates("TTS_BEGIN", 6);
            TTS_COMPLETE = new VoiceStates("TTS_COMPLETE", 7);
            TTS_ERROR = new VoiceStates("TTS_ERROR", 8);
            EDITTEXT_NEW_WORD = new VoiceStates("EDITTEXT_NEW_WORD", 9);
            EDITTEXT_COMLETE = new VoiceStates("EDITTEXT_COMLETE", 10);
            ERROR = new VoiceStates("ERROR", 11);
            COMPLETE = new VoiceStates("COMPLETE", 12);
            a = (new VoiceStates[] {
                START, RECOG_NEW_WORD, RECOG_COMLETE, RECOG_ERROR, TRANSLATION_SUCCESS, TRANSLATION_ERROR, TTS_BEGIN, TTS_COMPLETE, TTS_ERROR, EDITTEXT_NEW_WORD, 
                EDITTEXT_COMLETE, ERROR, COMPLETE
            });
        }

        private VoiceStates(String s1, int i1)
        {
            super(s1, i1);
        }
    }

}
