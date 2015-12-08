// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputs;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.android.apps.translate.anim.AnimationScheme;
import com.google.android.apps.translate.anim.c;
import com.google.android.apps.translate.anim.f;
import com.google.android.apps.translate.e.d;
import com.google.android.apps.translate.inputtools.InputToolsInput;
import com.google.android.apps.translate.k;
import com.google.android.apps.translate.m;
import com.google.android.apps.translate.r;
import com.google.android.apps.translate.s;
import com.google.android.apps.translate.widget.HandwritingInputView;
import com.google.android.apps.translate.widget.SizeListeningView;
import com.google.android.apps.translate.widget.SuggestionList;
import com.google.android.apps.translate.widget.au;
import com.google.android.apps.translate.widget.aw;
import com.google.android.apps.translate.widget.l;
import com.google.android.apps.translate.widget.n;
import com.google.android.libraries.handwriting.gui.HandwritingOverlayView;
import com.google.android.libraries.handwriting.gui.UIHandler;
import com.google.android.libraries.handwriting.gui.ab;
import com.google.android.libraries.translate.core.Entry;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.core.b;
import com.google.android.libraries.translate.e.h;
import com.google.android.libraries.translate.e.o;
import com.google.android.libraries.translate.languages.Language;
import com.google.android.libraries.translate.languages.e;
import com.google.android.libraries.translate.logging.Event;
import java.util.Locale;

// Referenced classes of package com.google.android.apps.translate.inputs:
//            a, ba, aw, bj, 
//            bb, ao, bc, az, 
//            bh, ay, be, ax, 
//            bd, bf, bg

public final class KeyboardHandwritingPopup extends a
    implements android.view.View.OnClickListener, android.view.View.OnTouchListener, android.widget.AdapterView.OnItemSelectedListener, android.widget.TextView.OnEditorActionListener, au, aw, Runnable
{

    private boolean A;
    private boolean B;
    private boolean C;
    private Object D;
    public final InputToolsInput f;
    private final View g;
    private final SizeListeningView h;
    private final View i;
    private final View j;
    private final RelativeLayout k;
    private final View l;
    private final Spinner m;
    private final FrameLayout n;
    private final boolean o;
    private final View p;
    private final bj q;
    private final SuggestionList r;
    private final com.google.android.libraries.translate.languages.d s;
    private final SharedPreferences t;
    private final int u;
    private int v;
    private float w;
    private int x;
    private String y;
    private HandwritingInputView z;

    public KeyboardHandwritingPopup(Context context, Language language, Language language1, View view, boolean flag)
    {
        boolean flag1 = true;
        super(context, language, language1, "", s.KeyboardDialogTheme);
        x = 0;
        z = null;
        A = true;
        C = false;
        boolean flag3 = com.google.android.libraries.translate.core.b.a(context, language);
        Object obj;
        HorizontalScrollView horizontalscrollview;
        int i1;
        boolean flag2;
        if (flag3 && flag)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        o = flag2;
        if (flag)
        {
            i1 = r.label_handwriting;
        } else
        {
            i1 = r.label_keyboard;
        }
        setTitle(i1);
        obj = getWindow();
        if (o)
        {
            i1 = 2;
        } else
        {
            i1 = 4;
        }
        ((Window) (obj)).setSoftInputMode(i1 | 0x10);
        if (o.f)
        {
            getWindow().addFlags(0x80000000);
        }
        setContentView(com.google.android.apps.translate.o.popup_handwriting_input);
        p = view;
        g = findViewById(m.input_glass);
        i = findViewById(m.cards_holder);
        s = com.google.android.libraries.translate.languages.e.a().a(context, Locale.getDefault());
        j = findViewById(m.btn_clear_input);
        j.setOnClickListener(this);
        f = (InputToolsInput)findViewById(m.edit_input);
        f.setHint(language.getLongName());
        f.setOnEditorActionListener(this);
        f.setOnClickListener(this);
        com.google.android.apps.translate.e.d.a(f, language.getShortName());
        j.setVisibility(0);
        com.google.android.libraries.translate.e.o.a(f);
        com.google.android.libraries.translate.e.o.a(f, a);
        k = (RelativeLayout)findViewById(m.result_layout);
        k.setOnClickListener(this);
        l = findViewById(m.divider);
        view = (TextView)findViewById(m.result_text);
        obj = (TextView)findViewById(m.result_transliteration);
        horizontalscrollview = (HorizontalScrollView)findViewById(m.result_scroller);
        horizontalscrollview.setOnTouchListener(new ba(this, new GestureDetector(getContext(), new com.google.android.apps.translate.inputs.aw(this))));
        if (o.b)
        {
            int j1;
            int k1;
            if (language1.isRTL())
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            view.setLayoutDirection(i1);
            ((TextView) (obj)).setLayoutDirection(i1);
            horizontalscrollview.setLayoutDirection(i1);
            k1 = context.getResources().getDimensionPixelSize(k.card_padding_top_rtl);
            j1 = context.getResources().getDimensionPixelSize(k.card_spacing);
            if (com.google.android.libraries.translate.e.o.d())
            {
                i1 = j1;
            } else
            {
                i1 = 0;
            }
            horizontalscrollview.setPadding(i1, k1, j1, 0);
        }
        D = com.google.android.libraries.translate.e.o.e(context);
        r = (SuggestionList)findViewById(m.result_container);
        view.setHint(language1.getLongName());
        r.setOnSuggestClickListener(this);
        q = new bj(view, ((TextView) (obj)), language, language1, r, horizontalscrollview);
        q.a(a());
        f.addTextChangedListener(q);
        f.addTextChangedListener(new bb(this));
        n = (FrameLayout)findViewById(m.handwriting_container);
        m = (Spinner)findViewById(m.input_mode);
        language = new ao(context);
        language.a(r.label_keyboard, 0, false);
        if (flag3)
        {
            language.a(r.label_handwriting, 1, true);
        } else
        {
            m.setVisibility(8);
        }
        m.setAdapter(language);
        language1 = m;
        if (flag && flag3)
        {
            i1 = ((flag1) ? 1 : 0);
        } else
        {
            i1 = 0;
        }
        language1.setSelection(i1);
        u = context.getResources().getDimensionPixelSize(k.handwriting_height_limit);
        t = context.getSharedPreferences("app_ui", 0);
        h = (SizeListeningView)findViewById(m.size_listener);
        h.setOnSizeChangeListener(this);
        com.google.android.libraries.translate.e.h.a(this);
        language1 = Singleton.b();
        if (o)
        {
            context = "handwriting";
        } else
        {
            context = "keyboard";
        }
        language1.c(context);
        C = false;
        flag = f.a(a.getShortName());
        f.setLanguageCode(a.getShortName(), new bc(this, language, flag));
    }

    private int a(int i1)
    {
        return Math.max(u, Math.min(i1, v - u));
    }

    private static int a(Resources resources, CardsMode cardsmode)
    {
        switch (az.a[cardsmode.ordinal()])
        {
        default:
            return 0;

        case 1: // '\001'
            return resources.getDimensionPixelSize(k.edit_input_height) + resources.getDimensionPixelSize(k.default_touch_target);

        case 2: // '\002'
            return resources.getDimensionPixelSize(k.edit_input_height) + resources.getDimensionPixelSize(k.source_target_divider_size) + resources.getDimensionPixelSize(k.instant_result_visible_height);
        }
    }

    static RelativeLayout a(KeyboardHandwritingPopup keyboardhandwritingpopup)
    {
        return keyboardhandwritingpopup.k;
    }

    private String a()
    {
        if (z != null)
        {
            return "inputm=5";
        }
        boolean flag;
        if (f.a != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return "inputm=2";
        } else
        {
            return "inputm=2&itid=pk";
        }
    }

    private void b()
    {
        if (z != null)
        {
            return;
        } else
        {
            z = (HandwritingInputView)View.inflate(getContext(), com.google.android.apps.translate.o.widget_handwriting_view, null);
            HandwritingInputView handwritinginputview = z;
            handwritinginputview.e = f;
            handwritinginputview.f = handwritinginputview.e.getInputType();
            com.google.android.libraries.translate.e.o.b(handwritinginputview.e);
            handwritinginputview.d = new n(handwritinginputview, handwritinginputview.e);
            handwritinginputview.e.setSelectionChangeListener(handwritinginputview.d);
            handwritinginputview.e.addTextChangedListener(new l(handwritinginputview));
            handwritinginputview.a.h();
            z.setSourceAndTargetLanguages(a, b);
            n.addView(z);
            AnimationScheme.BOTTOM_FAST.showView(n);
            A = false;
            f.b();
            z.findViewById(m.hand_drag).setOnTouchListener(this);
            q.a(a());
            return;
        }
    }

    static void b(KeyboardHandwritingPopup keyboardhandwritingpopup)
    {
        Object obj = keyboardhandwritingpopup.getContext().getResources();
        int i1 = a(((Resources) (obj)), CardsMode.FULL);
        c c1 = (new c(keyboardhandwritingpopup.i)).a("height", i1);
        c1.a(keyboardhandwritingpopup.getContext(), 0x10e0001);
        if (o.f)
        {
            c1.setInterpolator(AnimationUtils.loadInterpolator(keyboardhandwritingpopup.getContext(), 0x10c000d));
        }
        AnimationScheme.SIDE.showView(keyboardhandwritingpopup.l);
        AnimationScheme.FADE_FAST.showView(keyboardhandwritingpopup.k);
        int j1 = ((Resources) (obj)).getDimensionPixelOffset(k.activity_title_height);
        obj = (new c(keyboardhandwritingpopup.g)).a("topMargin", i1 - j1);
        ((c) (obj)).a(keyboardhandwritingpopup.getContext(), 0x10e0001);
        if (o.f)
        {
            ((c) (obj)).setInterpolator(AnimationUtils.loadInterpolator(keyboardhandwritingpopup.getContext(), 0x10c000d));
        }
        keyboardhandwritingpopup.i.startAnimation(c1);
        keyboardhandwritingpopup.g.startAnimation(((android.view.animation.Animation) (obj)));
    }

    private void b(String s1, Language language, Language language1)
    {
        f.setOnEditorActionListener(null);
        f.setIsTextEditor(false);
        String s2 = com.google.android.libraries.translate.e.n.a(s1);
        s1 = language1;
        if (language.equals(language1))
        {
            Language language2 = s.c(a.getShortName());
            s1 = language1;
            if (language2 != null)
            {
                s1 = language2;
            }
        }
        if (s2.isEmpty())
        {
            s1 = new Bundle();
            s1.putBoolean("animate", false);
            com.google.android.libraries.translate.e.h.b(11, s1);
        } else
        {
            f.setText(s2);
            d = a();
            a(s2, language, s1);
        }
        a(new bh(this));
    }

    static Spinner c(KeyboardHandwritingPopup keyboardhandwritingpopup)
    {
        return keyboardhandwritingpopup.m;
    }

    static boolean d(KeyboardHandwritingPopup keyboardhandwritingpopup)
    {
        return keyboardhandwritingpopup.C;
    }

    static void e(KeyboardHandwritingPopup keyboardhandwritingpopup)
    {
        keyboardhandwritingpopup.b();
    }

    static boolean f(KeyboardHandwritingPopup keyboardhandwritingpopup)
    {
        keyboardhandwritingpopup.C = true;
        return true;
    }

    static View g(KeyboardHandwritingPopup keyboardhandwritingpopup)
    {
        return keyboardhandwritingpopup.p;
    }

    static boolean h(KeyboardHandwritingPopup keyboardhandwritingpopup)
    {
        keyboardhandwritingpopup.B = true;
        return true;
    }

    static boolean i(KeyboardHandwritingPopup keyboardhandwritingpopup)
    {
        return keyboardhandwritingpopup.o;
    }

    static InputToolsInput j(KeyboardHandwritingPopup keyboardhandwritingpopup)
    {
        return keyboardhandwritingpopup.f;
    }

    static void k(KeyboardHandwritingPopup keyboardhandwritingpopup)
    {
        keyboardhandwritingpopup.B = false;
        keyboardhandwritingpopup.j.setVisibility(8);
        AnimationScheme.FADE.hideView(keyboardhandwritingpopup.g);
        keyboardhandwritingpopup.p.setVisibility(4);
        int i1 = keyboardhandwritingpopup.a(keyboardhandwritingpopup.p);
        Object obj = (new c(keyboardhandwritingpopup.i)).a("topMargin", i1).a("height", keyboardhandwritingpopup.p.getHeight());
        Object obj1 = keyboardhandwritingpopup.p.findViewById(0x1020014);
        if (obj1 != null)
        {
            obj = new com.google.android.apps.translate.anim.e(new f[] {
                obj, (new c(keyboardhandwritingpopup.f)).a("topMargin", keyboardhandwritingpopup.a(((View) (obj1))) - i1 - keyboardhandwritingpopup.f.getPaddingTop())
            });
        } else
        {
            obj = new com.google.android.apps.translate.anim.e(new f[] {
                obj
            });
        }
        ((com.google.android.apps.translate.anim.e) (obj)).setAnimationListener(new ay(keyboardhandwritingpopup));
        ((com.google.android.apps.translate.anim.e) (obj)).a(keyboardhandwritingpopup.getContext(), 0x10e0001);
        if (o.f)
        {
            ((com.google.android.apps.translate.anim.e) (obj)).setInterpolator(AnimationUtils.loadInterpolator(keyboardhandwritingpopup.getContext(), 0x10c000d));
        }
        keyboardhandwritingpopup.i.startAnimation(((android.view.animation.Animation) (obj)));
        AnimationScheme.FADE_FAST.hideViews(new View[] {
            keyboardhandwritingpopup.l, keyboardhandwritingpopup.k
        });
        obj = keyboardhandwritingpopup.findViewById(m.input_mode_buttons);
        keyboardhandwritingpopup.findViewById(m.spacer).setVisibility(0);
        ((View) (obj)).setVisibility(0);
        obj1 = new AlphaAnimation(0.0F, 1.0F);
        ((AlphaAnimation) (obj1)).setDuration(keyboardhandwritingpopup.getContext().getResources().getInteger(0x10e0001));
        ((View) (obj)).startAnimation(((android.view.animation.Animation) (obj1)));
    }

    static FrameLayout l(KeyboardHandwritingPopup keyboardhandwritingpopup)
    {
        return keyboardhandwritingpopup.n;
    }

    public final void a(int i1, int j1)
    {
        Object obj;
label0:
        {
            if (j1 > 0)
            {
                v = j1;
                if (j1 > i1)
                {
                    obj = "hand_port_height";
                } else
                {
                    obj = "hand_land_height";
                }
                y = ((String) (obj));
                i1 = t.getInt(y, j1 / 2);
                n.getLayoutParams().height = a(i1);
                n.requestLayout();
                if (z != null)
                {
                    z.a();
                }
                if (A && !h.a())
                {
                    obj = com.google.android.libraries.translate.e.o.e(getContext());
                    if (obj != null && D != null && !D.equals(obj))
                    {
                        break label0;
                    }
                    onBackPressed();
                }
            }
            return;
        }
        D = obj;
        com.google.android.libraries.translate.e.o.a(f, a);
    }

    public final void a(Activity activity)
    {
        super.a(activity);
        q.a();
        i.setVisibility(0);
        g.setVisibility(0);
        findViewById(m.result_container).setVisibility(0);
        if (o)
        {
            b();
        }
        B = true;
        m.setOnItemSelectedListener(this);
        l.setVisibility(8);
        k.setVisibility(8);
        findViewById(m.input_mode_buttons).setVisibility(8);
        Resources resources = getContext().getResources();
        int i1;
        if (TextUtils.isEmpty(f.getText()))
        {
            activity = CardsMode.INPUT_AND_BUTTONS;
        } else
        {
            activity = CardsMode.FULL;
        }
        i1 = a(resources, ((CardsMode) (activity)));
        activity = (android.view.ViewGroup.MarginLayoutParams)i.getLayoutParams();
        activity.height = i1;
        activity.topMargin = 0;
    }

    public final void a(Entry entry)
    {
        if (entry == null)
        {
            d();
            return;
        } else
        {
            b(entry.getInputText(), entry.getFromLanguage(s), b);
            return;
        }
    }

    public final void b(String s1)
    {
        q.a();
        show();
        B = false;
        f.setText(s1);
        f.setSelection(s1.length());
        f.addTextChangedListener(new be(this));
        l.setVisibility(8);
        k.setVisibility(8);
        Object obj = (android.view.ViewGroup.MarginLayoutParams)i.getLayoutParams();
        obj.height = p.getHeight();
        obj.topMargin = a(p);
        boolean flag = TextUtils.isEmpty(s1);
        obj = getContext().getResources();
        int i1;
        int j1;
        if (flag)
        {
            s1 = CardsMode.INPUT_AND_BUTTONS;
        } else
        {
            s1 = CardsMode.FULL;
        }
        i1 = a(((Resources) (obj)), s1);
        j1 = ((Resources) (obj)).getDimensionPixelOffset(k.activity_title_height);
        g.setPadding(0, i1 - j1, 0, 0);
        a(this);
    }

    public final void d()
    {
        if (!B)
        {
            return;
        }
        if (z != null)
        {
            HandwritingInputView handwritinginputview = z;
            if (handwritinginputview.f != -1)
            {
                int i1 = handwritinginputview.e.getSelectionStart();
                int j1 = handwritinginputview.e.getSelectionEnd();
                handwritinginputview.e.setInputType(handwritinginputview.f);
                handwritinginputview.e.setSelection(i1, j1);
                handwritinginputview.f = -1;
            }
            handwritinginputview.b.i();
            handwritinginputview.b();
            handwritinginputview.c.setHandwritingOverlayListener(null);
            AnimationScheme.BOTTOM.hideView(handwritinginputview);
        }
        b(f.getText().toString(), a, b);
    }

    public final void onBackPressed()
    {
        if (B)
        {
            super.onBackPressed();
        }
    }

    public final void onClick(View view)
    {
        if (B) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (view != j)
        {
            break; /* Loop/switch isn't completed */
        }
        if (TextUtils.isEmpty(f.getText()))
        {
            super.onBackPressed();
            return;
        }
        f.setText("");
        if (z != null)
        {
            z.a();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (view == f)
        {
            if (A)
            {
                f.a();
                return;
            }
            if (z == null)
            {
                b();
                return;
            } else
            {
                f.clearComposingText();
                z.a();
                return;
            }
        }
        if (view == k)
        {
            a(((Entry) (null)));
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public final void onDismiss(DialogInterface dialoginterface)
    {
        super.onDismiss(dialoginterface);
        f.removeTextChangedListener(q);
        q.b();
    }

    public final boolean onEditorAction(TextView textview, int i1, KeyEvent keyevent)
    {
        if (i1 == 3 || i1 == 6 || keyevent.getAction() == 0 && keyevent.getKeyCode() == 66)
        {
            d();
            return true;
        } else
        {
            return false;
        }
    }

    public final void onItemSelected(AdapterView adapterview, View view, int i1, long l1)
    {
        boolean flag = false;
        if (l1 == (long)r.label_keyboard || l1 == (long)r.label_phonetic)
        {
            if (z != null)
            {
                z.d();
            }
            if (l1 == (long)r.label_phonetic)
            {
                flag = true;
            }
            f.setInputToolsEnabled(flag);
            if (f.a())
            {
                adapterview = new ax(this);
                AnimationScheme.BOTTOM_FAST.hideView(n, 0L, adapterview);
                z = null;
                com.google.android.libraries.translate.e.o.a(f);
                com.google.android.libraries.translate.e.o.a(f, a);
                q.a(a());
                A = true;
                h.a = System.currentTimeMillis();
                if (flag)
                {
                    adapterview = Event.INPUT_SWITCHED_TO_INPUT_TOOLS;
                } else
                {
                    adapterview = Event.INPUT_SWITCHED_TO_KEYBOARD;
                }
                a(adapterview);
            }
        } else
        if (l1 == (long)r.label_handwriting && A)
        {
            A = false;
            f.b();
            a(Event.INPUT_SWITCHED_TO_HANDWRITING);
            h.a = System.currentTimeMillis();
            if (h.a())
            {
                c.postDelayed(new bd(this), 200L);
                return;
            } else
            {
                b();
                return;
            }
        }
    }

    public final void onNothingSelected(AdapterView adapterview)
    {
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        View view1 = findViewById(m.resizer);
        switch (motionevent.getAction())
        {
        default:
            return false;

        case 0: // '\0'
            if (z != null)
            {
                z.d();
            }
            x = n.getMeasuredHeight();
            ((android.view.ViewGroup.MarginLayoutParams)view1.getLayoutParams()).topMargin = v - x;
            view1.setVisibility(0);
            w = motionevent.getY();
            view.setVisibility(4);
            return true;

        case 2: // '\002'
            int i1 = (int)(motionevent.getY() - w);
            i1 = a(x - i1);
            ((android.view.ViewGroup.MarginLayoutParams)view1.getLayoutParams()).topMargin = v - i1;
            view1.requestLayout();
            return true;

        case 3: // '\003'
            view1.setVisibility(8);
            view.setVisibility(0);
            return true;

        case 1: // '\001'
            view1.setVisibility(8);
            view.setVisibility(0);
            int j1 = (int)(motionevent.getY() - w);
            j1 = a(x - j1);
            t.edit().putInt(y, j1).commit();
            n.getLayoutParams().height = j1;
            n.requestLayout();
            Singleton.b().a(Event.HANDWRITING_RESIZED, null, null);
            return true;
        }
    }

    public final void run()
    {
        i.setVisibility(0);
        a(new bf(this));
        Resources resources = getContext().getResources();
        boolean flag = TextUtils.isEmpty(f.getText());
        Object obj;
        View view;
        AlphaAnimation alphaanimation;
        int i1;
        if (flag)
        {
            obj = CardsMode.INPUT_AND_BUTTONS;
        } else
        {
            obj = CardsMode.FULL;
        }
        i1 = a(resources, ((CardsMode) (obj)));
        obj = (new c(i)).a("topMargin", 0).a("height", i1);
        ((c) (obj)).setAnimationListener(new bg(this));
        ((c) (obj)).a(getContext(), 0x10e0001);
        if (o.f)
        {
            ((c) (obj)).setInterpolator(AnimationUtils.loadInterpolator(getContext(), 0x10c000d));
        }
        i.startAnimation(((android.view.animation.Animation) (obj)));
        obj = findViewById(m.input_mode_buttons);
        view = findViewById(m.spacer);
        alphaanimation = new AlphaAnimation(1.0F, 0.0F);
        alphaanimation.setAnimationListener(new com.google.android.apps.translate.anim.b(new View[] {
            obj, view
        }));
        alphaanimation.setDuration(resources.getInteger(0x10e0001));
        ((View) (obj)).startAnimation(alphaanimation);
        if (!flag)
        {
            AnimationScheme.FADE_FAST.showViews(new View[] {
                l, k
            });
        }
        AnimationScheme.FADE.showView(g);
        q.afterTextChanged(f.getText());
    }

    private class CardsMode extends Enum
    {

        public static final CardsMode FULL;
        public static final CardsMode INPUT_AND_BUTTONS;
        private static final CardsMode a[];

        public static CardsMode valueOf(String s1)
        {
            return (CardsMode)Enum.valueOf(com/google/android/apps/translate/inputs/KeyboardHandwritingPopup$CardsMode, s1);
        }

        public static CardsMode[] values()
        {
            return (CardsMode[])a.clone();
        }

        static 
        {
            INPUT_AND_BUTTONS = new CardsMode("INPUT_AND_BUTTONS", 0);
            FULL = new CardsMode("FULL", 1);
            a = (new CardsMode[] {
                INPUT_AND_BUTTONS, FULL
            });
        }

        private CardsMode(String s1, int i1)
        {
            super(s1, i1);
        }
    }

}
