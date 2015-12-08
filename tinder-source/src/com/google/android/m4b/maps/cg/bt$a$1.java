// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.m4b.maps.ay.t;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            bt

final class a extends Handler
{

    private a a;

    public final void handleMessage(Message message)
    {
        ((t)message.obj).b();
    }

    ( , Looper looper)
    {
        a = ;
        super(looper);
    }
}
