// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.sms;

import android.content.Context;
import com.facebook.inject.ab;
import com.facebook.inject.d;
import com.facebook.ui.media.b.a;

// Referenced classes of package com.facebook.orca.sms:
//            r, bk, ah, ai

class al extends d
{

    final ah a;

    private al(ah ah)
    {
        a = ah;
        super();
    }

    al(ah ah, ai ai)
    {
        this(ah);
    }

    public r a()
    {
        return new r((Context)e().a(android/content/Context), (bk)a(com/facebook/orca/sms/bk), (a)a(com/facebook/ui/media/b/a));
    }

    public Object b()
    {
        return a();
    }
}
