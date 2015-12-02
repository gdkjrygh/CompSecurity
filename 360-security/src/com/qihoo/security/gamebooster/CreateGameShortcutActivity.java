// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.gamebooster;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import android.widget.ImageView;
import com.qihoo.security.app.BaseSimpleActivity;
import com.qihoo.security.locale.d;
import com.qihoo.security.locale.widget.LocaleButton;
import com.qihoo.security.locale.widget.LocaleTextView;
import com.qihoo.security.support.b;
import com.qihoo360.mobilesafe.b.a;
import com.qihoo360.mobilesafe.b.f;
import com.qihoo360.mobilesafe.share.SharedPref;

// Referenced classes of package com.qihoo.security.gamebooster:
//            b, GameBoosterActivity

public class CreateGameShortcutActivity extends BaseSimpleActivity
{

    private final d a = com.qihoo.security.locale.d.a();
    private LocaleTextView b;
    private LocaleTextView c;
    private ImageView d;
    private LocaleButton e;
    private int f;
    private View g;
    private Context h;
    private Handler i;
    private Runnable j;
    private String k;

    public CreateGameShortcutActivity()
    {
        c = null;
        f = 0;
    }

    static Context a(CreateGameShortcutActivity creategameshortcutactivity)
    {
        return creategameshortcutactivity.h;
    }

    private boolean a(Activity activity, MotionEvent motionevent)
    {
        int l = (int)motionevent.getX();
        int i1 = (int)motionevent.getY();
        int j1 = ViewConfiguration.get(activity).getScaledWindowTouchSlop();
        activity = activity.getWindow().getDecorView();
        return l < -j1 || i1 < -j1 || l > activity.getWidth() + j1 || i1 > activity.getHeight() + j1;
    }

    static int b(CreateGameShortcutActivity creategameshortcutactivity)
    {
        int l = creategameshortcutactivity.f;
        creategameshortcutactivity.f = l + 1;
        return l;
    }

    private void b()
    {
        g = findViewById(0x7f0b0066);
        b = (LocaleTextView)findViewById(0x7f0b0067);
        c = (LocaleTextView)findViewById(0x7f0b0068);
        d = (ImageView)findViewById(0x7f0b0069);
        e = (LocaleButton)findViewById(0x7f0b006a);
        android.view.ViewGroup.LayoutParams layoutparams = g.getLayoutParams();
        layoutparams.width = com.qihoo360.mobilesafe.b.a.a(h) - com.qihoo360.mobilesafe.b.a.a(h, 60F);
        g.setLayoutParams(layoutparams);
        e.setOnClickListener(new android.view.View.OnClickListener() {

            final CreateGameShortcutActivity a;

            public void onClick(View view)
            {
                if (!com.qihoo360.mobilesafe.b.f.a())
                {
                    com.qihoo.security.gamebooster.CreateGameShortcutActivity.b(a);
                    if (CreateGameShortcutActivity.c(a) == 1)
                    {
                        CreateGameShortcutActivity.e(a).setText(com.qihoo.security.gamebooster.CreateGameShortcutActivity.d(a).a(0x7f0c008b));
                        com.qihoo.security.gamebooster.CreateGameShortcutActivity.f(a).setText(com.qihoo.security.gamebooster.CreateGameShortcutActivity.d(a).a(0x7f0c008c));
                        CreateGameShortcutActivity.g(a).setText(com.qihoo.security.gamebooster.CreateGameShortcutActivity.d(a).a(0x7f0c008d));
                        CreateGameShortcutActivity.h(a).setVisibility(0);
                        com.qihoo.security.support.b.b(11102);
                        a.a();
                        return;
                    }
                    if (CreateGameShortcutActivity.c(a) == 2)
                    {
                        com.qihoo.security.support.b.b(11103);
                        if (com.qihoo.security.gamebooster.b.a().f() && !TextUtils.isEmpty(CreateGameShortcutActivity.i(a)))
                        {
                            view = new Intent(a, com/qihoo/security/gamebooster/GameBoosterActivity);
                            a.getIntent().removeExtra("pkg_name");
                            view.addFlags(0x10000000);
                            view.addFlags(0x200000);
                            view.putExtra("pkg_name", CreateGameShortcutActivity.i(a));
                            a.startActivity(view);
                        }
                        a.finish();
                        return;
                    }
                }
            }

            
            {
                a = CreateGameShortcutActivity.this;
                super();
            }
        });
    }

    static int c(CreateGameShortcutActivity creategameshortcutactivity)
    {
        return creategameshortcutactivity.f;
    }

    static d d(CreateGameShortcutActivity creategameshortcutactivity)
    {
        return creategameshortcutactivity.a;
    }

    static LocaleTextView e(CreateGameShortcutActivity creategameshortcutactivity)
    {
        return creategameshortcutactivity.b;
    }

    static LocaleTextView f(CreateGameShortcutActivity creategameshortcutactivity)
    {
        return creategameshortcutactivity.c;
    }

    static LocaleButton g(CreateGameShortcutActivity creategameshortcutactivity)
    {
        return creategameshortcutactivity.e;
    }

    static ImageView h(CreateGameShortcutActivity creategameshortcutactivity)
    {
        return creategameshortcutactivity.d;
    }

    static String i(CreateGameShortcutActivity creategameshortcutactivity)
    {
        return creategameshortcutactivity.k;
    }

    public void a()
    {
        com.qihoo.security.gamebooster.b.a().c();
    }

    protected void onCreate(Bundle bundle)
    {
        requestWindowFeature(1);
        super.onCreate(bundle);
        k = getIntent().getStringExtra("pkg_name");
        h = getApplicationContext();
        setContentView(0x7f03001b);
        b();
        com.qihoo.security.support.b.b(11101);
        i = new Handler();
        j = new Runnable() {

            final CreateGameShortcutActivity a;

            public void run()
            {
                SharedPref.a(com.qihoo.security.gamebooster.CreateGameShortcutActivity.a(a), "sp_key_last_recommend_create_shortcut_time", System.currentTimeMillis());
                int l = SharedPref.b(com.qihoo.security.gamebooster.CreateGameShortcutActivity.a(a), "sp_key_last_recommend_create_shortcut_times", 0);
                SharedPref.a(com.qihoo.security.gamebooster.CreateGameShortcutActivity.a(a), "sp_key_last_recommend_create_shortcut_times", l + 1);
            }

            
            {
                a = CreateGameShortcutActivity.this;
                super();
            }
        };
        i.postDelayed(j, 3000L);
    }

    protected void onDestroy()
    {
        super.onDestroy();
        i.removeCallbacks(j);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (motionevent.getAction() == 0 && a(this, motionevent))
        {
            finish();
            return true;
        } else
        {
            return false;
        }
    }
}
