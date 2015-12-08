// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.ads.internal.d;

// Referenced classes of package com.google.android.gms.internal:
//            cf

public final class cj extends Handler
{

    public cj(Looper looper)
    {
        super(looper);
    }

    public final void handleMessage(Message message)
    {
        try
        {
            super.handleMessage(message);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            d.f().a(message, false);
        }
        throw message;
    }
}
