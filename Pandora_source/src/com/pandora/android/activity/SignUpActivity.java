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
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import com.pandora.android.provider.b;
import com.pandora.android.util.r;
import com.pandora.android.util.s;
import com.pandora.android.view.ValidatingEditText;
import com.pandora.radio.util.k;
import java.util.Locale;
import p.co.a;
import p.cw.c;
import p.cx.e;

// Referenced classes of package com.pandora.android.activity:
//            BaseFragmentActivity, PandoraIntent, PandoraIntentFilter, c, 
//            WelcomeActivity

public class SignUpActivity extends BaseFragmentActivity
{

    private ValidatingEditText A;
    private ValidatingEditText B;
    private String C;
    private boolean D;
    private ImageView E;
    private TextView F;
    private TextView G;
    private RadioGroup H;
    private CheckBox I;
    private CheckBox J;
    private ScrollView K;
    private AlertDialog L;
    private TextWatcher M;
    private android.widget.CompoundButton.OnCheckedChangeListener N;
    private int o;
    private Button p;
    private ValidatingEditText q;
    private ValidatingEditText z;

    public SignUpActivity()
    {
        o = 0;
        M = new TextWatcher() {

            final SignUpActivity a;

            public void afterTextChanged(Editable editable)
            {
                com.pandora.android.activity.SignUpActivity.a(a);
            }

            public void beforeTextChanged(CharSequence charsequence, int j, int i1, int j1)
            {
            }

            public void onTextChanged(CharSequence charsequence, int j, int i1, int j1)
            {
            }

            
            {
                a = SignUpActivity.this;
                super();
            }
        };
        N = new android.widget.CompoundButton.OnCheckedChangeListener() {

            final SignUpActivity a;

            public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                com.pandora.android.activity.SignUpActivity.a(a);
            }

            
            {
                a = SignUpActivity.this;
                super();
            }
        };
    }

    static int a(SignUpActivity signupactivity, int j)
    {
        signupactivity.o = j;
        return j;
    }

    static String a(SignUpActivity signupactivity, String s1)
    {
        signupactivity.C = s1;
        return s1;
    }

    private void a(Bundle bundle)
    {
        if (bundle == null)
        {
            return;
        }
        q.setText(bundle.getString("emailText"));
        z.setText(bundle.getString("passwordText"));
        A.setText(bundle.getString("birthYearText"));
        B.setText(bundle.getString("zipCodeText"));
        C = bundle.getString("genderText");
        if (s.a(C)) goto _L2; else goto _L1
_L1:
        D = true;
        E.setSelected(true);
        if (!C.equals(getString(0x7f0801b2))) goto _L4; else goto _L3
_L3:
        H.check(0x7f10027f);
_L2:
        I.setChecked(bundle.getBoolean("optInCheck"));
        J.setChecked(bundle.getBoolean("agreeCheck"));
        return;
_L4:
        if (C.equals(getString(0x7f0801b1)))
        {
            H.check(0x7f100280);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    static void a(SignUpActivity signupactivity)
    {
        signupactivity.o();
    }

    private void a(String s1, String s2, int j, String s3, String s4)
    {
        if (!p.co.a.a(this, j))
        {
            finish();
            b.a.b().o().a(com.pandora.radio.util.k.k.k);
            return;
        } else
        {
            b.a.b().m().a(s1, s2, j, s4, I.isChecked(), s3.toLowerCase(Locale.US), r.a(j));
            p.setEnabled(false);
            S();
            return;
        }
    }

    static boolean a(SignUpActivity signupactivity, boolean flag)
    {
        signupactivity.D = flag;
        return flag;
    }

    public static Bundle b(View view)
    {
        Bundle bundle = new Bundle();
        if (view != null)
        {
            int ai[] = new int[2];
            view.getLocationOnScreen(ai);
            bundle.putIntArray("logo_location", ai);
        }
        return bundle;
    }

    static ScrollView b(SignUpActivity signupactivity)
    {
        return signupactivity.K;
    }

    static int c(SignUpActivity signupactivity)
    {
        return signupactivity.o;
    }

    static boolean d(SignUpActivity signupactivity)
    {
        return signupactivity.D;
    }

    static ImageView e(SignUpActivity signupactivity)
    {
        return signupactivity.E;
    }

    static RadioGroup f(SignUpActivity signupactivity)
    {
        return signupactivity.H;
    }

    static void g(SignUpActivity signupactivity)
    {
        signupactivity.m();
    }

    static ValidatingEditText h(SignUpActivity signupactivity)
    {
        return signupactivity.B;
    }

    static ValidatingEditText i(SignUpActivity signupactivity)
    {
        return signupactivity.q;
    }

    private void m()
    {
        z.clearFocus();
        boolean flag = n();
        String s1 = s.a(q.getText());
        String s2 = s.a(z.getText());
        String s3 = s.a(A.getText());
        String s4 = s.a(B.getText());
        String s5 = C;
        int j = p.co.a.g(s3);
        if (!flag)
        {
            if (!J.isChecked());
            L = s.a(this, s1, true);
            K.fullScroll(33);
            b.a.b().o().a(com.pandora.radio.util.k.k.k);
            return;
        } else
        {
            a(s1, s2, j, s5, s4);
            return;
        }
    }

    private boolean n()
    {
        return q.b() && z.b() && J.isChecked() && B.b() && A.b() && !s.a(C);
    }

    private void o()
    {
        if (n())
        {
            p.setEnabled(true);
            return;
        } else
        {
            p.setEnabled(false);
            return;
        }
    }

    protected String Y()
    {
        return getResources().getString(0x7f080245);
    }

    protected void a(Context context, Intent intent, String s1)
    {
        if (!s.a(s1) && s1.equals(com.pandora.android.activity.PandoraIntent.a("user_signed_up")))
        {
            b.a.b().o().a(com.pandora.radio.util.k.k.m);
            finish();
        }
    }

    protected boolean a(Context context, Intent intent)
    {
        String s1 = intent.getAction();
        if (!s.a(s1) && s1.equals(com.pandora.android.activity.PandoraIntent.a("api_error")))
        {
            b.a.b().o().a(com.pandora.radio.util.k.k.k);
            U();
            p.setEnabled(true);
            context = intent.getStringExtra("intent_message");
            intent = (Intent)intent.getParcelableExtra("intent_followon_intent");
            if (intent != null)
            {
                s.a(this, context, intent);
            } else
            {
                L = s.a(this, context, true);
            }
            if ((new p.bw.a(b.a.h())).a(1024).equals(context))
            {
                B.setError(true);
            }
            return true;
        } else
        {
            return super.a(context, intent);
        }
    }

    public boolean a(com.pandora.android.util.k.a a1)
    {
        return false;
    }

    protected IntentFilter l()
    {
        PandoraIntentFilter pandoraintentfilter = new PandoraIntentFilter();
        pandoraintentfilter.a("user_signed_up");
        return pandoraintentfilter;
    }

    public void onBackPressed()
    {
        AnimatorSet animatorset = new AnimatorSet();
        animatorset.setDuration(500L);
        animatorset.addListener(new AnimatorListenerAdapter() {

            final SignUpActivity a;

            public void onAnimationEnd(Animator animator)
            {
                super.onAnimationEnd(animator);
                animator = new Bundle();
                animator.putBoolean("has_animated", true);
                animator.putString("android.intent.extra.EMAIL", s.a(SignUpActivity.i(a).getText()));
                com.pandora.android.activity.c.a().a(a, com/pandora/android/activity/WelcomeActivity, animator);
            }

            
            {
                a = SignUpActivity.this;
                super();
            }
        });
        animatorset.playTogether(new Animator[] {
            ObjectAnimator.ofFloat(K, "translationY", new float[] {
                0.0F, (float)o
            }), ObjectAnimator.ofFloat(A, "alpha", new float[] {
                0.0F
            }), ObjectAnimator.ofFloat(findViewById(0x7f10027b), "alpha", new float[] {
                0.0F
            }), ObjectAnimator.ofFloat(B, "alpha", new float[] {
                0.0F
            }), ObjectAnimator.ofFloat(findViewById(0x7f10027c), "alpha", new float[] {
                0.0F
            }), ObjectAnimator.ofFloat(findViewById(0x7f10027d), "alpha", new float[] {
                0.0F
            }), ObjectAnimator.ofFloat(findViewById(0x7f100281), "alpha", new float[] {
                0.0F
            }), ObjectAnimator.ofFloat(findViewById(0x7f100282), "alpha", new float[] {
                0.0F
            }), ObjectAnimator.ofFloat(findViewById(0x7f100285), "alpha", new float[] {
                0.0F
            }), ObjectAnimator.ofFloat(p, "alpha", new float[] {
                0.0F
            })
        });
        animatorset.start();
        b.a.b().o().a(com.pandora.radio.util.k.k.l);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f040096);
        K = (ScrollView)findViewById(0x7f100278);
        K.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

            final SignUpActivity a;

            public void onGlobalLayout()
            {
                Object obj;
                if (android.os.Build.VERSION.SDK_INT < 16)
                {
                    com.pandora.android.activity.SignUpActivity.b(a).getViewTreeObserver().removeGlobalOnLayoutListener(this);
                } else
                {
                    com.pandora.android.activity.SignUpActivity.b(a).getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
                obj = a.getIntent().getExtras();
                if (obj != null)
                {
                    int ai[] = new int[2];
                    a.findViewById(0x7f1001eb).getLocationOnScreen(ai);
                    com.pandora.android.activity.SignUpActivity.a(a, ((Bundle) (obj)).getIntArray("logo_location")[1] - ai[1]);
                }
                com.pandora.android.activity.SignUpActivity.b(a).setTranslationY(com.pandora.android.activity.SignUpActivity.c(a));
                com.pandora.android.activity.SignUpActivity.b(a).setAlpha(1.0F);
                obj = new AnimatorSet();
                ((AnimatorSet) (obj)).setDuration(500L);
                ((AnimatorSet) (obj)).playTogether(new Animator[] {
                    ObjectAnimator.ofFloat(com.pandora.android.activity.SignUpActivity.b(a), "translationY", new float[] {
                        0.0F
                    })
                });
                ((AnimatorSet) (obj)).start();
            }

            
            {
                a = SignUpActivity.this;
                super();
            }
        });
        p = (Button)findViewById(0x7f100288);
        q = (ValidatingEditText)findViewById(0x7f100274);
        z = (ValidatingEditText)findViewById(0x7f100092);
        A = (ValidatingEditText)findViewById(0x7f100095);
        B = (ValidatingEditText)findViewById(0x7f100098);
        ValidatingEditText validatingedittext = B;
        int j;
        if (r.a())
        {
            j = 0x7f0801b7;
        } else
        {
            j = 0x7f0801b6;
        }
        validatingedittext.setHint(getString(j));
        q.setValidator(p.co.b.a(p.co.b.a.a));
        z.setValidator(p.co.b.a(p.co.b.a.c));
        A.setValidator(p.co.b.a(p.co.b.a.e));
        B.setValidator(p.co.b.a(p.co.b.a.d));
        E = (ImageView)findViewById(0x7f10009b);
        H = (RadioGroup)findViewById(0x7f10027e);
        J = (CheckBox)findViewById(0x7f100286);
        I = (CheckBox)findViewById(0x7f100283);
        F = (TextView)findViewById(0x7f100287);
        G = (TextView)findViewById(0x7f100284);
        F.setMovementMethod(LinkMovementMethod.getInstance());
        G.setMovementMethod(LinkMovementMethod.getInstance());
        D = false;
        H.setOnCheckedChangeListener(new android.widget.RadioGroup.OnCheckedChangeListener() {

            final SignUpActivity a;

            public void onCheckedChanged(RadioGroup radiogroup, int i1)
            {
                if (!SignUpActivity.d(a))
                {
                    com.pandora.android.activity.SignUpActivity.e(a).setSelected(true);
                }
                if (i1 == 0x7f10027f)
                {
                    com.pandora.android.activity.SignUpActivity.a(a, a.getString(0x7f0801b2));
                } else
                {
                    com.pandora.android.activity.SignUpActivity.a(a, a.getString(0x7f0801b1));
                }
                com.pandora.android.activity.SignUpActivity.a(a, true);
                com.pandora.android.activity.SignUpActivity.a(a);
                SignUpActivity.f(a).requestFocus();
            }

            
            {
                a = SignUpActivity.this;
                super();
            }
        });
        H.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() {

            final SignUpActivity a;

            public void onFocusChange(View view, boolean flag)
            {
                if (flag)
                {
                    ((InputMethodManager)a.getSystemService("input_method")).hideSoftInputFromWindow(SignUpActivity.f(a).getWindowToken(), 0);
                }
            }

            
            {
                a = SignUpActivity.this;
                super();
            }
        });
        p.setOnClickListener(new android.view.View.OnClickListener() {

            final SignUpActivity a;
            private long b;

            public void onClick(View view)
            {
                if (System.currentTimeMillis() - b > 220L)
                {
                    SignUpActivity.g(a);
                    b.a.b().o().a(com.pandora.radio.util.k.k.j);
                }
                b = System.currentTimeMillis();
            }

            
            {
                a = SignUpActivity.this;
                super();
                b = System.currentTimeMillis();
            }
        });
        B.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

            final SignUpActivity a;

            public boolean onEditorAction(TextView textview, int i1, KeyEvent keyevent)
            {
                if (i1 == 0 || i1 == 66)
                {
                    s.a(a, SignUpActivity.h(a));
                    return true;
                } else
                {
                    return false;
                }
            }

            
            {
                a = SignUpActivity.this;
                super();
            }
        });
        q.addTextChangedListener(M);
        z.addTextChangedListener(M);
        B.addTextChangedListener(M);
        A.addTextChangedListener(M);
        J.setOnCheckedChangeListener(N);
        a(bundle);
        if (bundle == null)
        {
            b.a.b().o().a(com.pandora.radio.util.k.k.i);
        }
        getWindow().setBackgroundDrawable(new com.pandora.android.view.c());
    }

    protected void onDestroy()
    {
        super.onDestroy();
        if (L != null)
        {
            L.dismiss();
        }
    }

    protected void onResume()
    {
        boolean flag1 = true;
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
        validatingedittext = z;
        if (!z.b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        validatingedittext.setError(flag);
        validatingedittext = A;
        if (!A.b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        validatingedittext.setError(flag);
        validatingedittext = B;
        if (!B.b())
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
        String s1 = s.a(q.getText());
        String s2 = s.a(z.getText());
        String s3 = s.a(A.getText());
        String s4 = s.a(B.getText());
        String s5 = C;
        boolean flag = J.isChecked();
        boolean flag1 = I.isChecked();
        bundle.putString("emailText", s1);
        bundle.putString("passwordText", s2);
        bundle.putString("birthYearText", s3);
        bundle.putString("zipCodeText", s4);
        bundle.putString("genderText", s5);
        bundle.putBoolean("optInCheck", flag1);
        bundle.putBoolean("agreeCheck", flag);
    }
}
