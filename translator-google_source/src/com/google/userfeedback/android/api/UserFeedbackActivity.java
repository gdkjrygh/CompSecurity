// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.userfeedback.android.api;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

// Referenced classes of package com.google.userfeedback.android.api:
//            m, l, e, r, 
//            ah, h, g, q, 
//            s, t, u, x, 
//            w

public class UserFeedbackActivity extends Activity
{

    private EditText a;
    private CheckBox b;
    private CheckBox c;
    private Button d;
    private Button e;
    private Spinner f;
    private final m g;

    public UserFeedbackActivity()
    {
        g = m.c;
    }

    private void a(int i, l l1)
    {
        TextView textview = (TextView)findViewById(i);
        int j;
        if (l1.b != 0)
        {
            i = l1.b;
        } else
        {
            i = e.gf_header_background;
        }
        j = l1.c;
        if (textview != null)
        {
            if (i < 0)
            {
                textview.setBackgroundDrawable(null);
            } else
            {
                textview.setBackgroundDrawable(getResources().getDrawable(i));
            }
            if (j != 0)
            {
                textview.setTextColor(getResources().getColor(j));
            }
        }
    }

    private void a(Activity activity)
    {
        (new r(this, activity)).execute(new Void[0]);
    }

    static void a(boolean flag, boolean flag1, String s1)
    {
        m.c.b(flag, flag1, s1);
    }

    static boolean a(UserFeedbackActivity userfeedbackactivity)
    {
        if (!userfeedbackactivity.g.a.g)
        {
            return false;
        } else
        {
            return userfeedbackactivity.c.isChecked();
        }
    }

    static boolean b(UserFeedbackActivity userfeedbackactivity)
    {
        if (userfeedbackactivity.g.a.h)
        {
            return userfeedbackactivity.b.isChecked();
        } else
        {
            return false;
        }
    }

    static EditText c(UserFeedbackActivity userfeedbackactivity)
    {
        return userfeedbackactivity.a;
    }

    static m d(UserFeedbackActivity userfeedbackactivity)
    {
        return userfeedbackactivity.g;
    }

    static Spinner e(UserFeedbackActivity userfeedbackactivity)
    {
        return userfeedbackactivity.f;
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        switch (j)
        {
        default:
            return;

        case -1: 
            setResult(-1);
            break;
        }
        finish();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(h.gf_feedback_activity);
        if (g == null || g.a == null)
        {
            setResult(0);
            finishActivity(0);
            return;
        }
        bundle = m.c.a.o;
        if (bundle != null)
        {
            if (((l) (bundle)).a)
            {
                findViewById(g.gf_app_header).setVisibility(8);
            } else
            {
                a(this);
            }
            if (((l) (bundle)).d != 0)
            {
                getWindow().getDecorView().setBackgroundColor(getResources().getColor(((l) (bundle)).d));
            }
            a(g.gf_feedback_header, bundle);
            a(g.gf_privacy, bundle);
            a(g.gf_user_account, bundle);
        } else
        {
            a(this);
        }
        if (!g.a.g)
        {
            findViewById(g.gf_screenshot_option).setVisibility(8);
        } else
        {
            c = (CheckBox)findViewById(g.gf_send_screenshot);
            c.setOnCheckedChangeListener(new w(this));
        }
        a = (EditText)findViewById(g.gf_feedback);
        if (!g.a.h)
        {
            findViewById(g.gf_system_logs_option).setVisibility(8);
        } else
        {
            b = (CheckBox)findViewById(g.gf_send_system_info);
            b.setOnCheckedChangeListener(new w(this));
        }
        e = (Button)findViewById(g.gf_preview);
        e.setOnClickListener(new q(this));
        d = (Button)findViewById(g.gf_send);
        d.setOnClickListener(new s(this, this));
        f = (Spinner)findViewById(g.gf_account_spinner);
        f.setBackgroundDrawable(null);
        f.setOnItemSelectedListener(new t(this, this));
        findViewById(g.gf_privacy_option).setOnClickListener(new u(this));
        (new x(this, this, f, e)).execute(new Void[0]);
    }

    protected void onDestroy()
    {
        super.onDestroy();
        m.a(this);
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        super.onRestoreInstanceState(bundle);
        if (g == null || g.a == null || g.g == null)
        {
            setResult(0);
            finish();
        }
    }
}
