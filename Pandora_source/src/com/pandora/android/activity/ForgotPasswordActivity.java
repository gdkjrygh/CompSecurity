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
import com.pandora.android.view.c;
import p.cm.k;
import p.co.b;

// Referenced classes of package com.pandora.android.activity:
//            BaseFragmentActivity, p, PandoraIntent, PandoraIntentFilter, 
//            c, WelcomeActivity

public class ForgotPasswordActivity extends BaseFragmentActivity
    implements android.view.View.OnClickListener, p
{

    private AlertDialog A;
    private TextWatcher B;
    private int o;
    private Button p;
    private ValidatingEditText q;
    private View z;

    public ForgotPasswordActivity()
    {
        o = 0;
        B = new TextWatcher() {

            final ForgotPasswordActivity a;

            public void afterTextChanged(Editable editable)
            {
                com.pandora.android.activity.ForgotPasswordActivity.b(a).setEnabled(ForgotPasswordActivity.a(a).b());
            }

            public void beforeTextChanged(CharSequence charsequence, int i, int j, int i1)
            {
            }

            public void onTextChanged(CharSequence charsequence, int i, int j, int i1)
            {
            }

            
            {
                a = ForgotPasswordActivity.this;
                super();
            }
        };
    }

    static int a(ForgotPasswordActivity forgotpasswordactivity, int i)
    {
        forgotpasswordactivity.o = i;
        return i;
    }

    public static Bundle a(Bundle bundle, View view)
    {
        if (view != null)
        {
            int ai[] = new int[2];
            view.getLocationOnScreen(ai);
            bundle.putIntArray("logo_location", ai);
        }
        return bundle;
    }

    static ValidatingEditText a(ForgotPasswordActivity forgotpasswordactivity)
    {
        return forgotpasswordactivity.q;
    }

    static Button b(ForgotPasswordActivity forgotpasswordactivity)
    {
        return forgotpasswordactivity.p;
    }

    static View c(ForgotPasswordActivity forgotpasswordactivity)
    {
        return forgotpasswordactivity.z;
    }

    static int d(ForgotPasswordActivity forgotpasswordactivity)
    {
        return forgotpasswordactivity.o;
    }

    protected String Y()
    {
        return getResources().getString(0x7f080230);
    }

    protected void a(Context context, Intent intent, String s1)
    {
        if (s1.equals(PandoraIntent.a("password_sent")))
        {
            U();
            A = s.a(this, getString(0x7f080199, new Object[] {
                intent.getStringExtra("intent_email")
            }), true);
        }
    }

    protected boolean a(Context context, Intent intent)
    {
        String s1 = intent.getAction();
        if (!s.a(s1) && s1.equals(PandoraIntent.a("api_error")))
        {
            U();
            context = intent.getStringExtra("intent_message");
            intent = (Intent)intent.getParcelableExtra("intent_followon_intent");
            if (intent != null)
            {
                s.a(this, context, intent);
            } else
            {
                A = s.a(this, context, true);
            }
            return true;
        } else
        {
            return super.a(context, intent);
        }
    }

    protected IntentFilter l()
    {
        PandoraIntentFilter pandoraintentfilter = new PandoraIntentFilter();
        pandoraintentfilter.a("password_sent");
        return pandoraintentfilter;
    }

    public void m()
    {
        String s1 = s.a(q.getText());
        if (q.b())
        {
            (new k()).execute(new Object[] {
                s1
            });
            S();
            s.a(this, q);
        }
    }

    public void onBackPressed()
    {
        AnimatorSet animatorset = new AnimatorSet();
        animatorset.setDuration(500L);
        animatorset.addListener(new AnimatorListenerAdapter() {

            final ForgotPasswordActivity a;

            public void onAnimationEnd(Animator animator)
            {
                super.onAnimationEnd(animator);
                animator = new Bundle();
                animator.putBoolean("has_animated", true);
                Editable editable = ForgotPasswordActivity.a(a).getText();
                if (editable != null && s.j(editable.toString()))
                {
                    animator.putString("android.intent.extra.EMAIL", editable.toString());
                }
                com.pandora.android.provider.b.a.b().o().a(com.pandora.radio.util.k.k.h);
                com.pandora.android.activity.c.a().a(a, com/pandora/android/activity/WelcomeActivity, animator);
            }

            
            {
                a = ForgotPasswordActivity.this;
                super();
            }
        });
        animatorset.playTogether(new Animator[] {
            ObjectAnimator.ofFloat(z, "translationY", new float[] {
                0.0F, (float)o
            }), ObjectAnimator.ofFloat(p, "alpha", new float[] {
                0.0F
            }), ObjectAnimator.ofFloat(findViewById(0x7f10017f), "alpha", new float[] {
                0.0F
            })
        });
        animatorset.start();
    }

    public void onClick(View view)
    {
        if (view.getId() == 0x7f10017e)
        {
            m();
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f040056);
        z = findViewById(0x7f10017b);
        z.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

            final ForgotPasswordActivity a;

            public void onGlobalLayout()
            {
                com.pandora.android.activity.ForgotPasswordActivity.c(a).getViewTreeObserver().removeGlobalOnLayoutListener(this);
                Object obj = a.getIntent().getExtras();
                if (obj != null)
                {
                    int ai[] = new int[2];
                    a.findViewById(0x7f100163).getLocationOnScreen(ai);
                    ForgotPasswordActivity.a(a, ((Bundle) (obj)).getIntArray("logo_location")[1] - ai[1]);
                }
                com.pandora.android.activity.ForgotPasswordActivity.c(a).setTranslationY(ForgotPasswordActivity.d(a));
                com.pandora.android.activity.ForgotPasswordActivity.c(a).setAlpha(1.0F);
                obj = new AnimatorSet();
                ((AnimatorSet) (obj)).setDuration(500L);
                ((AnimatorSet) (obj)).playTogether(new Animator[] {
                    ObjectAnimator.ofFloat(com.pandora.android.activity.ForgotPasswordActivity.c(a), "translationY", new float[] {
                        0.0F
                    })
                });
                ((AnimatorSet) (obj)).start();
            }

            
            {
                a = ForgotPasswordActivity.this;
                super();
            }
        });
        q = (ValidatingEditText)findViewById(0x7f10017d);
        q.setValidator(p.co.b.a(p.co.b.a.a));
        q.addTextChangedListener(B);
        p = (Button)findViewById(0x7f10017e);
        p.setEnabled(q.b());
        p.setOnClickListener(this);
        bundle = getIntent().getStringExtra("android.intent.extra.EMAIL");
        if (!s.a(bundle))
        {
            q.setText(bundle);
        }
        q.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

            final ForgotPasswordActivity a;

            public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
            {
                if (i == 6)
                {
                    if (ForgotPasswordActivity.a(a).b())
                    {
                        a.m();
                    } else
                    {
                        ForgotPasswordActivity.a(a).d();
                    }
                    return true;
                } else
                {
                    return false;
                }
            }

            
            {
                a = ForgotPasswordActivity.this;
                super();
            }
        });
        getWindow().setBackgroundDrawable(new c());
    }

    protected void onDestroy()
    {
        super.onDestroy();
        if (A != null)
        {
            A.dismiss();
        }
    }

    protected void onResume()
    {
        super.onResume();
        ValidatingEditText validatingedittext = q;
        boolean flag;
        if (!q.b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        validatingedittext.setError(flag);
    }
}
