// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.sms;

import android.content.Context;
import com.facebook.inject.ab;
import com.facebook.inject.d;
import com.facebook.orca.annotations.IsCallLogEnabled;
import com.facebook.orca.annotations.IsMmsReadPermitted;
import com.facebook.orca.threads.r;

// Referenced classes of package com.facebook.orca.sms:
//            y, bn, r, a, 
//            bk, ah, ai

class ap extends d
{

    final ah a;

    private ap(ah ah)
    {
        a = ah;
        super();
    }

    ap(ah ah, ai ai)
    {
        this(ah);
    }

    public y a()
    {
        return new y((Context)e().a(android/content/Context), (bn)a(com/facebook/orca/sms/bn), (com.facebook.orca.sms.r)a(com/facebook/orca/sms/r), (a)a(com/facebook/orca/sms/a), (bk)a(com/facebook/orca/sms/bk), (com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d), (r)a(com/facebook/orca/threads/r), b(java/lang/Boolean, com/facebook/orca/annotations/IsMmsReadPermitted), b(java/lang/Boolean, com/facebook/orca/annotations/IsCallLogEnabled));
    }

    public Object b()
    {
        return a();
    }
}
