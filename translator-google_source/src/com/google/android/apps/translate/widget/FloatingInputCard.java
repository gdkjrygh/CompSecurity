// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.am;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.translate.TranslateActivity;
import com.google.android.apps.translate.anim.AnimationScheme;
import com.google.android.apps.translate.e.d;
import com.google.android.apps.translate.e.i;
import com.google.android.apps.translate.inputs.Camera2InputPopup;
import com.google.android.apps.translate.inputs.KeyboardHandwritingPopup;
import com.google.android.apps.translate.inputs.VoiceInputPopup;
import com.google.android.apps.translate.inputs.a;
import com.google.android.apps.translate.inputs.bi;
import com.google.android.apps.translate.inputtools.InputToolsInput;
import com.google.android.apps.translate.k;
import com.google.android.apps.translate.m;
import com.google.android.apps.translate.o;
import com.google.android.apps.translate.r;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.core.b;
import com.google.android.libraries.translate.e.h;
import com.google.android.libraries.translate.e.j;
import com.google.android.libraries.translate.languages.Language;
import com.google.android.libraries.translate.logging.Event;
import com.google.android.libraries.translate.logging.e;
import com.google.android.libraries.translate.speech.c;

// Referenced classes of package com.google.android.apps.translate.widget:
//            w, z, LanguagePicker, PartialStateButton, 
//            SpeakerView, InputTextView, d, WordWrapInput

public class FloatingInputCard extends LinearLayout
    implements android.os.Handler.Callback, android.view.View.OnClickListener, w, z, j
{

    public final View a;
    public final int b;
    public final View c;
    public final InputTextView d = (InputTextView)findViewById(0x1020014);
    public final TextView e;
    public boolean f;
    public boolean g;
    private final LanguagePicker h;
    private final PartialStateButton i;
    private final PartialStateButton j;
    private final PartialStateButton k;
    private final int l;
    private final int m;
    private final View n;
    private final SpeakerView o;
    private final TextView p;
    private final View q;
    private final Handler r = new Handler(this);
    private final int s;
    private Activity t;
    private boolean u;

    public FloatingInputCard(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        u = true;
        g = false;
        setOrientation(1);
        LayoutInflater.from(context).inflate(o.widget_floating_input_card, this, true);
        h = (LanguagePicker)findViewById(m.language_picker);
        i = (PartialStateButton)findViewById(m.btn_speech);
        j = (PartialStateButton)findViewById(m.btn_camera);
        k = (PartialStateButton)findViewById(m.btn_handwriting);
        a = findViewById(m.lyt_home);
        c = findViewById(m.lyt_result);
        o = (SpeakerView)findViewById(m.speaker_view);
        p = (TextView)findViewById(m.txt_lang);
        q = findViewById(m.speaker_view_wrapper);
        e = (TextView)findViewById(m.txt_transliteration);
        e.setOnClickListener(this);
        f = false;
        setCursorBlink();
        f = true;
        context = new i(this);
        i.setOnClickListener(context);
        j.setOnClickListener(context);
        k.setOnClickListener(context);
        a.setOnClickListener(context);
        d.setOnClickListener(context);
        d.setTextPasteController(this);
        findViewById(m.btn_clear_input).setOnClickListener(this);
        a(h.getFromLanguage(), h.getToLanguage());
        a.setOnLongClickListener(new com.google.android.apps.translate.e.o(findViewById(m.img_cursor), this));
        context = new Rect();
        n = findViewById(m.input_bar_contents);
        n.getBackground().getPadding(context);
        s = ((Rect) (context)).bottom;
        m = getResources().getDimensionPixelSize(k.activity_title_height) + getResources().getDimensionPixelSize(k.default_touch_target) + s;
        l = getResources().getDimensionPixelSize(k.floating_input_height_min);
        b = getResources().getDimensionPixelSize(k.floating_input_holder_height) - m;
        a.getLayoutParams().height = b;
        com.google.android.libraries.translate.e.h.a(this, new int[] {
            7, 18
        });
        if (com.google.android.libraries.translate.e.o.f)
        {
            n.setOutlineProvider(new com.google.android.apps.translate.widget.d(this));
        }
    }

    static View a(FloatingInputCard floatinginputcard)
    {
        return floatinginputcard.n;
    }

    private a a(int i1, Language language, Language language1)
    {
        if (i1 == m.btn_handwriting)
        {
            language = new KeyboardHandwritingPopup(getContext(), language, language1, n, true);
        } else
        if (i1 == m.btn_camera)
        {
            if (com.google.android.libraries.translate.e.o.g && t.checkSelfPermission("android.permission.CAMERA") != 0)
            {
                language = t;
                i1 = m.btn_camera;
                language.requestPermissions(new String[] {
                    "android.permission.CAMERA"
                }, i1);
                return null;
            }
            language = new Camera2InputPopup(getContext(), language, language1);
        } else
        if (i1 == m.btn_speech)
        {
            if (com.google.android.libraries.translate.e.o.g && t.checkSelfPermission("android.permission.RECORD_AUDIO") != 0)
            {
                language = t;
                i1 = m.btn_speech;
                language.requestPermissions(new String[] {
                    "android.permission.RECORD_AUDIO"
                }, i1);
                return null;
            }
            Context context = getContext();
            View view;
            if (f)
            {
                view = a;
            } else
            {
                view = c;
            }
            language = new VoiceInputPopup(context, language, language1, view, c, i);
        } else
        {
            language = new KeyboardHandwritingPopup(getContext(), language, language1, n, false);
        }
        language.setOwnerActivity(t);
        return language;
    }

    private void a(int i1)
    {
        if (!r.hasMessages(i1))
        {
            r.sendEmptyMessage(i1);
        }
    }

    private void a(Language language, Language language1)
    {
        Object obj = getContext();
        PartialStateButton partialstatebutton = i;
        boolean flag;
        if (!((c)Singleton.e.b()).a(new Language[] {
    language
}))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        partialstatebutton.setPartiallyDisabled(flag, ((Context) (obj)).getString(r.msg_no_voice_for_lang, new Object[] {
            language.getLongName()
        }));
        partialstatebutton = k;
        if (!com.google.android.libraries.translate.core.b.a(getContext(), language))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        partialstatebutton.setPartiallyDisabled(flag, ((Context) (obj)).getString(r.msg_no_handwriting_for_lang, new Object[] {
            language.getLongName()
        }));
        obj = TranslateActivity.b(getContext(), language);
        if (obj == null)
        {
            j.setPartiallyDisabled(false, "");
            flag = Camera2InputPopup.a(getContext(), language.getShortName(), language1.getShortName(), null);
            j.setSelected(flag);
            return;
        } else
        {
            j.setPartiallyDisabled(true, ((String) (obj)));
            j.setSelected(false);
            return;
        }
    }

    static int b(FloatingInputCard floatinginputcard)
    {
        return floatinginputcard.s;
    }

    static View c(FloatingInputCard floatinginputcard)
    {
        return floatinginputcard.c;
    }

    public final void a()
    {
        o.setVisibility(8);
        p.setVisibility(4);
        e.setText("");
        u = true;
        e.setSingleLine(true);
        e.setVisibility(4);
    }

    public final void a(int i1, int j1)
    {
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams1 = (android.view.ViewGroup.MarginLayoutParams)a.getLayoutParams();
        int l1 = marginlayoutparams1.height;
        int i2 = marginlayoutparams.topMargin;
        int k1 = i1 - m;
        if (k1 < l)
        {
            marginlayoutparams1.height = l;
            marginlayoutparams.topMargin = Math.max(Math.min(marginlayoutparams.topMargin + j1, 0), k1 - l);
        } else
        {
            i1 = k1;
            if (k1 > b)
            {
                i1 = b;
            }
            marginlayoutparams1.height = i1;
            marginlayoutparams.topMargin = 0;
        }
        if (i2 != marginlayoutparams.topMargin)
        {
            a(2);
        }
        if (l1 != marginlayoutparams1.height)
        {
            a(1);
        }
    }

    public final void a(int i1, Bundle bundle)
    {
        i1;
        JVM INSTR lookupswitch 5: default 52
    //                   6: 118
    //                   7: 118
    //                   12: 143
    //                   18: 345
    //                   101: 53;
           goto _L1 _L2 _L2 _L3 _L4 _L5
_L1:
        return;
_L5:
        if (bundle != null && (bundle = ((Intent)bundle.getParcelable("intent")).getData()) != null)
        {
            Camera2InputPopup camera2inputpopup = new Camera2InputPopup(getContext(), h.getFromLanguage(), h.getToLanguage());
            camera2inputpopup.setOwnerActivity(t);
            camera2inputpopup.b(bundle.toString());
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        a((Language)bundle.getSerializable("from"), (Language)bundle.getSerializable("to"));
        return;
_L3:
        String s1 = bundle.getString("input");
        Object obj = (Language)bundle.getSerializable("from");
        Language language = (Language)bundle.getSerializable("to");
        bundle = (new com.google.android.libraries.translate.core.m(bundle.getString("output"))).a(0);
        if (((c)Singleton.e.b()).a(new Language[] {
    obj, language
}))
        {
            obj = (VoiceInputPopup)a(m.btn_speech, ((Language) (obj)), language);
            if (obj != null)
            {
                ((VoiceInputPopup) (obj)).show();
                ((VoiceInputPopup) (obj)).a();
                ((VoiceInputPopup) (obj)).f.setText(s1);
                ((VoiceInputPopup) (obj)).g.setText(bundle);
                obj.j = ((VoiceInputPopup) (obj)).h;
                obj.k = ((VoiceInputPopup) (obj)).i;
                obj.m = ((VoiceInputPopup) (obj)).i;
                obj.n = ((VoiceInputPopup) (obj)).h;
                obj.l = true;
                ((VoiceInputPopup) (obj)).a(bundle, ((VoiceInputPopup) (obj)).b);
                AnimationScheme.SIDE.showView(((VoiceInputPopup) (obj)).findViewById(m.root_view));
                return;
            }
        }
        if (true) goto _L1; else goto _L4
_L4:
        bundle = h.getFromLanguage();
        PartialStateButton partialstatebutton = i;
        boolean flag;
        if (!((c)Singleton.e.b()).a(new Language[] {
    bundle
}))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        partialstatebutton.setPartiallyDisabled(flag, getContext().getString(r.msg_no_voice_for_lang, new Object[] {
            bundle.getLongName()
        }));
        return;
    }

    public final void a(Activity activity, int i1, Language language, Language language1)
    {
        language = a(i1, language, language1);
        if (language != null)
        {
            language.a(activity);
        }
    }

    public final void a(am am)
    {
        am = new bi(getContext(), h.getFromLanguage(), h.getToLanguage(), am);
        am.setOwnerActivity(t);
        am.b(null);
        Singleton.b().a(Event.SMS_PICKER, null, null);
    }

    public final void a(ViewGroup viewgroup)
    {
        ViewGroup viewgroup1 = (ViewGroup)getParent();
        if (viewgroup1 == viewgroup)
        {
            return;
        }
        if (viewgroup1 != null)
        {
            viewgroup1.removeView(this);
        }
        viewgroup.addView(this);
    }

    public final boolean b()
    {
        return ((ClipboardManager)getContext().getSystemService("clipboard")).hasPrimaryClip();
    }

    public final boolean c()
    {
        CharSequence charsequence = com.google.android.libraries.translate.e.o.d(getContext());
        if (!TextUtils.isEmpty(charsequence))
        {
            com.google.android.libraries.translate.e.h.a(3, com.google.android.apps.translate.e.k.a(charsequence.toString(), h.getFromLanguage(), h.getToLanguage(), "source=paste"));
            return true;
        } else
        {
            return false;
        }
    }

    public com.google.android.apps.translate.c.a getCurrentLanguages()
    {
        return new com.google.android.apps.translate.c.a(h.getFromLanguage(), h.getToLanguage());
    }

    public boolean handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return false;

        case 1: // '\001'
            a.requestLayout();
            return true;

        case 2: // '\002'
            requestLayout();
            break;
        }
        return true;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        com.google.android.libraries.translate.e.h.a(this, new int[] {
            7, 6, 101, 12, 18
        });
        setCursorBlink();
    }

    public void onClick(View view)
    {
        Object obj;
        Language language;
        obj = h.getFromLanguage();
        language = h.getToLanguage();
        if (view != q) goto _L2; else goto _L1
_L1:
        if (o.getVisibility() == 0)
        {
            o.a();
            Singleton.b().a(Event.INPUT_TTS, (String)p.getTag(), null);
        }
_L4:
        return;
_L2:
        if (view != i && view != j && view != k && view != a && view != d)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = a(view.getId(), ((Language) (obj)), language);
        if (obj != null)
        {
            if (view == d)
            {
                ((a) (obj)).b(d.getText().toString());
                if (d.getTouchCharPos() > 0)
                {
                    view = (KeyboardHandwritingPopup)obj;
                    int i1 = d.getTouchCharPos();
                    ((KeyboardHandwritingPopup) (view)).f.setSelection(i1);
                    return;
                }
            } else
            if (!f && view == k)
            {
                ((a) (obj)).b(d.getText().toString());
                return;
            } else
            {
                ((a) (obj)).b("");
                return;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (view == e)
        {
            boolean flag;
            if (!u)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            u = flag;
            e.setSingleLine(u);
            return;
        }
        if (view.getId() == m.btn_clear_input)
        {
            com.google.android.libraries.translate.e.h.a(11);
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    protected void onDetachedFromWindow()
    {
        com.google.android.libraries.translate.e.h.a(this);
        super.onDetachedFromWindow();
    }

    public void onWindowFocusChanged(boolean flag)
    {
        super.onWindowFocusChanged(flag);
        if (flag)
        {
            a(h.getFromLanguage(), h.getToLanguage());
        }
    }

    public void setCursorBlink()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = ((ImageView)findViewById(m.img_cursor)).getDrawable();
        if (obj instanceof AnimationDrawable)
        {
            obj = (AnimationDrawable)obj;
            ((AnimationDrawable) (obj)).stop();
            if (f)
            {
                ((AnimationDrawable) (obj)).start();
            }
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void setParentActivity(Activity activity)
    {
        t = activity;
    }

    public void setResultInformation(Language language, com.google.android.libraries.translate.core.m m1)
    {
        m1 = m1.a(3);
        o.setTextToPlay(d.getText().toString(), language, "input");
        com.google.android.apps.translate.e.d.a(d, language.getShortName());
        p.setText(language.getLongName());
        p.setTag(language.getShortName());
        p.setVisibility(0);
        if (o.a)
        {
            q.setOnClickListener(this);
        } else
        {
            q.setOnClickListener(null);
            q.setClickable(false);
        }
        if (!TextUtils.isEmpty(m1))
        {
            e.setText(m1);
            e.setVisibility(0);
        }
    }
}
