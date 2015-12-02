// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.gamebooster;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.qihoo.security.locale.d;
import com.qihoo.security.locale.widget.LocaleButton;
import com.qihoo.security.locale.widget.LocaleTextView;
import com.qihoo.security.support.b;
import com.qihoo360.mobilesafe.b.f;

// Referenced classes of package com.qihoo.security.gamebooster:
//            CreateGameShortcutActivity, b, GameBoosterActivity

class a
    implements android.view.hortcutActivity._cls2
{

    final CreateGameShortcutActivity a;

    public void onClick(View view)
    {
        if (!f.a())
        {
            com.qihoo.security.gamebooster.CreateGameShortcutActivity.b(a);
            if (CreateGameShortcutActivity.c(a) == 1)
            {
                CreateGameShortcutActivity.e(a).setText(com.qihoo.security.gamebooster.CreateGameShortcutActivity.d(a).a(0x7f0c008b));
                com.qihoo.security.gamebooster.CreateGameShortcutActivity.f(a).setText(com.qihoo.security.gamebooster.CreateGameShortcutActivity.d(a).a(0x7f0c008c));
                CreateGameShortcutActivity.g(a).setText(com.qihoo.security.gamebooster.CreateGameShortcutActivity.d(a).a(0x7f0c008d));
                CreateGameShortcutActivity.h(a).setVisibility(0);
                b.b(11102);
                a.a();
                return;
            }
            if (CreateGameShortcutActivity.c(a) == 2)
            {
                b.b(11103);
                if (b.a().f() && !TextUtils.isEmpty(CreateGameShortcutActivity.i(a)))
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

    A(CreateGameShortcutActivity creategameshortcutactivity)
    {
        a = creategameshortcutactivity;
        super();
    }
}
