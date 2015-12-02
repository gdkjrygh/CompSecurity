// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.sms;

import android.content.ContentResolver;
import com.facebook.inject.ab;
import com.facebook.inject.d;
import com.facebook.orca.annotations.IsClientSmsEnabled;
import com.facebook.orca.annotations.IsSmsReadPermitted;
import com.facebook.orca.g.aa;
import com.facebook.orca.notify.at;
import com.facebook.orca.sms.a.a;
import com.facebook.orca.sms.a.b;

// Referenced classes of package com.facebook.orca.sms:
//            ah, ai

class bg extends d
{

    final ah a;

    private bg(ah ah)
    {
        a = ah;
        super();
    }

    bg(ah ah, ai ai)
    {
        this(ah);
    }

    public b a()
    {
        return new b((ContentResolver)e().a(android/content/ContentResolver), (aa)a(com/facebook/orca/g/aa), (at)a(com/facebook/orca/notify/at), b(java/lang/Boolean, com/facebook/orca/annotations/IsClientSmsEnabled), b(java/lang/Boolean, com/facebook/orca/annotations/IsSmsReadPermitted), (a)a(com/facebook/orca/sms/a/a));
    }

    public Object b()
    {
        return a();
    }
}
