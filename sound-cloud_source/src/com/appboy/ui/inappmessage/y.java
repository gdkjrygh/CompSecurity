// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import android.view.View;
import com.appboy.ui.inappmessage.a.c;

// Referenced classes of package com.appboy.ui.inappmessage:
//            v

final class y
    implements android.view.View.OnClickListener
{

    final v a;

    y(v v1)
    {
        a = v1;
        super();
    }

    public final void onClick(View view)
    {
        view = com.appboy.ui.inappmessage.v.c(a);
        v.b(a);
        v.a(a);
        view.c();
        a.a();
    }
}
