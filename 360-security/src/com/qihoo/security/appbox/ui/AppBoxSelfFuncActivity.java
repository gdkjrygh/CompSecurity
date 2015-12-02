// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.appbox.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import com.qihoo.security.app.BaseActivity;
import com.qihoo.security.appbox.ui.fragment.AppsFragment;
import com.qihoo.security.appbox.ui.fragment.GamesFragment;
import com.qihoo.security.appbox.ui.fragment.PickersFragment;
import com.qihoo.security.ui.fragment.a;
import com.qihoo.security.widget.QihooViewPager;
import com.qihoo.security.widget.TabPageIndicator;
import com.qihoo.security.widget.c;
import com.qihoo360.mobilesafe.b.r;

// Referenced classes of package com.qihoo.security.appbox.ui:
//            AppBoxActivity

public class AppBoxSelfFuncActivity extends BaseActivity
{

    private TabPageIndicator A;
    private com.qihoo.security.ui.b.a.f B;
    private QihooViewPager y;
    private a z;

    public AppBoxSelfFuncActivity()
    {
    }

    private void o()
    {
        c(getResources().getColor(0x7f080059));
        y = (QihooViewPager)findViewById(0x7f0b0071);
        A = (TabPageIndicator)findViewById(0x7f0b0070);
        y.setOffscreenPageLimit(3);
        z = new a(e());
        z.a(p, 0x7f0c00ab, com/qihoo/security/appbox/ui/fragment/PickersFragment, null);
        z.a(p, 0x7f0c00ac, com/qihoo/security/appbox/ui/fragment/AppsFragment, null);
        z.a(p, 0x7f0c00ad, com/qihoo/security/appbox/ui/fragment/GamesFragment, null);
        y.setAdapter(z);
        c c = new c() {

            final AppBoxSelfFuncActivity a;

            public void a(int i)
            {
                super.a(i);
            }

            
            {
                a = AppBoxSelfFuncActivity.this;
                super();
            }
        };
        A.a(y, c, 0);
        A.setTabSmoothScroll(true);
        A.setOnTabItemClickListener(new com.qihoo.security.widget.TabPageIndicator.b() {

            final AppBoxSelfFuncActivity a;

            public boolean a(int i, View view)
            {
                return false;
            }

            
            {
                a = AppBoxSelfFuncActivity.this;
                super();
            }
        });
    }

    public void finish()
    {
        Intent intent = getIntent();
        if (intent != null && "com.qihoo.security.lite.ACTION_APPBOX_SHORTCUT".equals(intent.getAction()))
        {
            r.a(getApplicationContext(), com/qihoo/security/appbox/ui/AppBoxActivity.getName(), true);
        }
        super.finish();
    }

    protected void j()
    {
        super.j();
        if (r != null)
        {
            b(0x7f0c01e4);
            a(new ColorDrawable(getResources().getColor(0x7f080059)));
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        B = com.qihoo.security.ui.b.a.a().b(0x7f030022);
        if (B == null)
        {
            B = new com.qihoo.security.ui.b.a.f() {

                final AppBoxSelfFuncActivity a;

                public View a(int i)
                {
                    return a.findViewById(i);
                }

            
            {
                a = AppBoxSelfFuncActivity.this;
                super();
            }
            };
            setContentView(0x7f030022);
        } else
        {
            setContentView(B.b);
        }
        o();
    }
}
