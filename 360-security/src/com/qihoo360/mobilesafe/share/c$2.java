// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.share;

import android.content.Context;
import android.view.View;
import com.qihoo.security.dialog.h;
import com.qihoo.security.support.b;
import com.qihoo.security.ui.a;

// Referenced classes of package com.qihoo360.mobilesafe.share:
//            c, SharedPref

static final class c
    implements android.view..OnClickListener
{

    final Context a;
    final h b;
    final int c;

    public void onClick(View view)
    {
        com.qihoo360.mobilesafe.share.SharedPref.a(a, "is_click_rating_dialog", true);
        com.qihoo.security.ui.a.e(a);
        b.dismiss();
        if (c == 0)
        {
            com.qihoo.security.support.b.c(17026);
        } else
        {
            if (c == 1)
            {
                com.qihoo.security.support.b.c(17003);
                return;
            }
            if (c == 2)
            {
                com.qihoo.security.support.b.c(17004);
                return;
            }
        }
    }

    edPref(Context context, h h1, int i)
    {
        a = context;
        b = h1;
        c = i;
        super();
    }
}
