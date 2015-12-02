// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.v5;

import android.content.Context;
import android.view.View;
import com.qihoo.security.support.b;
import com.qihoo360.common.utils.Utils;
import com.qihoo360.mobilesafe.b.f;

// Referenced classes of package com.qihoo.security.v5:
//            UpdateHelper

static final class b
    implements android.view.tener
{

    final Context a;
    final com.qihoo.security.dialog.b b;

    public void onClick(View view)
    {
        if (f.b())
        {
            com.qihoo.security.support.b.b(27006);
            com.qihoo.security.locale.language.b.c(a);
            Utils.dismissDialog(b);
        }
    }

    (Context context, com.qihoo.security.dialog.b b1)
    {
        a = context;
        b = b1;
        super();
    }
}
