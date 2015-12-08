// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.challenges.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.View;
import org.androidannotations.a.b;
import org.androidannotations.a.c.a;
import org.androidannotations.a.c.c;

// Referenced classes of package com.fitbit.challenges.ui:
//            ChallengeGameplayActivity

public final class ChallengeGameplayActivity_ extends ChallengeGameplayActivity
    implements org.androidannotations.a.c.a
{
    public static class a
    {

        private Context a;
        private final Intent b;
        private Fragment c;

        public Intent a()
        {
            return b;
        }

        public a a(int i)
        {
            b.setFlags(i);
            return this;
        }

        public a a(String s)
        {
            b.putExtra("challengeRules", s);
            return this;
        }

        public a b(String s)
        {
            b.putExtra("challengeId", s);
            return this;
        }

        public void b()
        {
            a.startActivity(b);
        }

        public void b(int i)
        {
            if (c != null)
            {
                c.startActivityForResult(b, i);
                return;
            }
            if (a instanceof Activity)
            {
                ((Activity)a).startActivityForResult(b, i);
                return;
            } else
            {
                a.startActivity(b);
                return;
            }
        }

        public a c(String s)
        {
            b.putExtra("challengeType", s);
            return this;
        }

        public a(Context context)
        {
            a = context;
            b = new Intent(context, com/fitbit/challenges/ui/ChallengeGameplayActivity_);
        }

        public a(Fragment fragment)
        {
            c = fragment;
            a = fragment.getActivity();
            b = new Intent(a, com/fitbit/challenges/ui/ChallengeGameplayActivity_);
        }
    }


    public static final String d = "challengeRules";
    public static final String e = "challengeId";
    public static final String f = "challengeType";
    private final c g = new c();

    public ChallengeGameplayActivity_()
    {
    }

    public static a a(Context context)
    {
        return new a(context);
    }

    public static a a(Fragment fragment)
    {
        return new a(fragment);
    }

    private void a(Bundle bundle)
    {
        f();
    }

    private void f()
    {
        Bundle bundle = getIntent().getExtras();
        if (bundle != null)
        {
            if (bundle.containsKey("challengeRules"))
            {
                c = bundle.getString("challengeRules");
            }
            if (bundle.containsKey("challengeId"))
            {
                a = bundle.getString("challengeId");
            }
            if (bundle.containsKey("challengeType"))
            {
                b = bundle.getString("challengeType");
            }
        }
    }

    public void onCreate(Bundle bundle)
    {
        c c1 = c.a(g);
        a(bundle);
        super.onCreate(bundle);
        c.a(c1);
        setContentView(0x7f04016c);
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (b.a() < 5 && i == 4 && keyevent.getRepeatCount() == 0)
        {
            onBackPressed();
        }
        return super.onKeyDown(i, keyevent);
    }

    public void setContentView(int i)
    {
        super.setContentView(i);
        g.a(this);
    }

    public void setContentView(View view)
    {
        super.setContentView(view);
        g.a(this);
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.setContentView(view, layoutparams);
        g.a(this);
    }

    public void setIntent(Intent intent)
    {
        super.setIntent(intent);
        f();
    }
}
