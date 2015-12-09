// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import com.pandora.android.util.s;
import com.pandora.android.view.ValidatingEditText;
import com.pandora.radio.util.k;
import p.co.b;
import p.cw.c;
import p.cx.e;

// Referenced classes of package com.pandora.android.activity:
//            BaseFragmentActivity, p, c, SignUpActivity, 
//            PandoraIntent, ForgotPasswordActivity

public class WelcomeActivity extends BaseFragmentActivity
    implements android.view.View.OnClickListener, p
{

    private Button A;
    private Button B;
    private View C;
    private View D;
    private View E;
    private AlertDialog F;
    private TextWatcher G;
    boolean o;
    private ValidatingEditText p;
    private ValidatingEditText q;
    private View z;

    public WelcomeActivity()
    {
        G = new TextWatcher() {

            final WelcomeActivity a;

            public void afterTextChanged(Editable editable)
            {
                WelcomeActivity.a(a).setEnabled(a.n());
            }

            public void beforeTextChanged(CharSequence charsequence, int i, int j, int i1)
            {
            }

            public void onTextChanged(CharSequence charsequence, int i, int j, int i1)
            {
            }

            
            {
                a = WelcomeActivity.this;
                super();
            }
        };
    }

    static Button a(WelcomeActivity welcomeactivity)
    {
        return welcomeactivity.A;
    }

    static void a(WelcomeActivity welcomeactivity, boolean flag)
    {
        welcomeactivity.c(flag);
    }

    static View b(WelcomeActivity welcomeactivity)
    {
        return welcomeactivity.z;
    }

    static View c(WelcomeActivity welcomeactivity)
    {
        return welcomeactivity.D;
    }

    private void c(boolean flag)
    {
        if (C != null)
        {
            int ai[] = new int[2];
            int ai1[] = new int[2];
            C.getLocationOnScreen(ai);
            D.getLocationOnScreen(ai1);
            int i1 = Math.abs(ai1[1] - ai[1]);
            int j = ai1[1];
            int i = j;
            if (android.os.Build.VERSION.SDK_INT < 19)
            {
                i = j - C.getMeasuredHeight();
            }
            AnimatorSet animatorset = new AnimatorSet();
            long l1;
            if (flag)
            {
                l1 = 500L;
            } else
            {
                l1 = 0L;
            }
            animatorset.setDuration(l1);
            animatorset.playTogether(new Animator[] {
                ObjectAnimator.ofFloat(C, "Y", new float[] {
                    (float)i
                }), ObjectAnimator.ofFloat(E, "alpha", new float[] {
                    0.0F, 1.0F
                }), ObjectAnimator.ofFloat(E, "translationY", new float[] {
                    (float)i1, 0.0F
                })
            });
            animatorset.addListener(new AnimatorListenerAdapter() {

                final WelcomeActivity a;

                public void onAnimationEnd(Animator animator)
                {
                    com.pandora.android.activity.WelcomeActivity.c(a).setVisibility(0);
                    WelcomeActivity.d(a).setVisibility(4);
                }

            
            {
                a = WelcomeActivity.this;
                super();
            }
            });
            animatorset.start();
        }
    }

    static View d(WelcomeActivity welcomeactivity)
    {
        return welcomeactivity.C;
    }

    static ValidatingEditText e(WelcomeActivity welcomeactivity)
    {
        return welcomeactivity.q;
    }

    private void o()
    {
        com.pandora.android.activity.c.a().a(this, com/pandora/android/activity/SignUpActivity, com.pandora.android.activity.SignUpActivity.b(C));
    }

    private void p()
    {
        p = (ValidatingEditText)findViewById(0x7f100274);
        p.setValidator(p.co.b.a(p.co.b.a.a));
        p.addTextChangedListener(G);
        q = (ValidatingEditText)findViewById(0x7f100092);
        q.setValidator(p.co.b.a(p.co.b.a.b));
        q.addTextChangedListener(G);
        q.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

            final WelcomeActivity a;

            public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
            {
                if (i == 6 || i == 0)
                {
                    if (a.n())
                    {
                        a.m();
                    } else
                    {
                        com.pandora.android.activity.WelcomeActivity.e(a).clearFocus();
                    }
                    return true;
                } else
                {
                    return false;
                }
            }

            
            {
                a = WelcomeActivity.this;
                super();
            }
        });
        A = (Button)findViewById(0x7f100275);
        A.setEnabled(n());
        A.setOnClickListener(this);
        ((TextView)findViewById(0x7f100276)).setOnClickListener(this);
        B = (Button)findViewById(0x7f100277);
        B.setOnClickListener(this);
    }

    protected String Y()
    {
        return getResources().getString(0x7f080241);
    }

    protected void a(Context context, Intent intent, String s1)
    {
    }

    protected boolean a(Context context, Intent intent)
    {
        String s1 = intent.getAction();
        if (s.a(s1) || !s1.equals(PandoraIntent.a("api_error"))) goto _L2; else goto _L1
_L1:
        U();
        context = intent.getStringExtra("intent_message");
        intent = (Intent)intent.getParcelableExtra("intent_followon_intent");
        if (intent == null) goto _L4; else goto _L3
_L3:
        s.a(this, context, intent);
_L5:
        q.setText("");
        com.pandora.android.provider.b.a.b().o().a(com.pandora.radio.util.k.k.e);
        return true;
_L4:
        if (s)
        {
            F = s.a(this, context, true);
        }
        if (true) goto _L5; else goto _L2
_L2:
        return super.a(context, intent);
    }

    public boolean a(com.pandora.android.util.k.a a1)
    {
        return false;
    }

    protected IntentFilter l()
    {
        return null;
    }

    public void m()
    {
        q.clearFocus();
        com.pandora.android.provider.b.a.b().m().a(s.a(p.getText()), s.a(q.getText()));
        s.a(this, p);
        s.a(this, q);
        S();
    }

    protected boolean n()
    {
        return p.b() && q.b();
    }

    public void onClick(View view)
    {
        int i = view.getId();
        if (i == 0x7f100275)
        {
            m();
            com.pandora.android.provider.b.a.b().o().a(com.pandora.radio.util.k.k.d);
        } else
        {
            if (i == 0x7f100276)
            {
                com.pandora.android.provider.b.a.b().o().a(com.pandora.radio.util.k.k.g);
                view = new Bundle();
                String s1 = s.a(p.getText());
                if (s.j(s1))
                {
                    view.putString("android.intent.extra.EMAIL", s1);
                }
                com.pandora.android.activity.c.a().a(this, com/pandora/android/activity/ForgotPasswordActivity, ForgotPasswordActivity.a(view, C));
                return;
            }
            if (i == 0x7f100277)
            {
                o();
                return;
            }
        }
    }

    public void onCreate(Bundle bundle)
    {
        boolean flag;
label0:
        {
            boolean flag1 = false;
            super.onCreate(bundle);
            setContentView(0x7f040095);
            p();
            Bundle bundle1 = getIntent().getExtras();
            if (bundle1 != null)
            {
                String s1 = bundle1.getString("android.intent.extra.EMAIL");
                if (!s.a(s1))
                {
                    p.setText(s1);
                }
            }
            z = findViewById(0x7f100270);
            C = findViewById(0x7f100163);
            D = findViewById(0x7f100272);
            E = findViewById(0x7f100271);
            z.setFitsSystemWindows(false);
            getWindow().setBackgroundDrawable(new com.pandora.android.view.c());
            if (bundle1 != null)
            {
                flag = flag1;
                if (bundle1.getBoolean("has_animated"))
                {
                    break label0;
                }
            }
            if (bundle != null)
            {
                flag = flag1;
                if (bundle.getBoolean("has_animated"))
                {
                    break label0;
                }
            }
            flag = true;
        }
        o = flag;
        z.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

            final WelcomeActivity a;

            public void onGlobalLayout()
            {
                Handler handler;
                Runnable runnable;
                long l1;
                if (android.os.Build.VERSION.SDK_INT < 16)
                {
                    com.pandora.android.activity.WelcomeActivity.b(a).getViewTreeObserver().removeGlobalOnLayoutListener(this);
                } else
                {
                    com.pandora.android.activity.WelcomeActivity.b(a).getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
                handler = new Handler();
                runnable = new Runnable(this) {

                    final _cls2 a;

                    public void run()
                    {
                        com.pandora.android.activity.WelcomeActivity.b(a.a).setFitsSystemWindows(true);
                        WelcomeActivity.a(a.a, a.a.o);
                    }

            
            {
                a = _pcls2;
                super();
            }
                };
                if (a.o)
                {
                    l1 = 500L;
                } else
                {
                    l1 = 0L;
                }
                handler.postDelayed(runnable, l1);
            }

            
            {
                a = WelcomeActivity.this;
                super();
            }
        });
        if (bundle == null)
        {
            com.pandora.android.provider.b.a.b().o().a(com.pandora.radio.util.k.k.c);
        }
    }

    protected void onDestroy()
    {
        super.onDestroy();
        if (F != null)
        {
            F.dismiss();
        }
    }

    protected void onResume()
    {
        boolean flag1 = true;
        super.onResume();
        ValidatingEditText validatingedittext = p;
        boolean flag;
        if (!p.b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        validatingedittext.setError(flag);
        validatingedittext = q;
        if (!q.b())
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        validatingedittext.setError(flag);
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("has_animated", true);
    }
}
