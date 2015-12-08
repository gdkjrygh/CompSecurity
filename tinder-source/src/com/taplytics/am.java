// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.content.Context;

// Referenced classes of package com.taplytics:
//            aq, ao, an

public final class am
{

    final an a;

    public am(Context context, android.view.GestureDetector.OnGestureListener ongesturelistener)
    {
        this(context, ongesturelistener, (byte)0);
    }

    private am(Context context, android.view.GestureDetector.OnGestureListener ongesturelistener, byte byte0)
    {
        if (android.os.Build.VERSION.SDK_INT > 17)
        {
            a = new aq(context, ongesturelistener);
            return;
        } else
        {
            a = new ao(context, ongesturelistener);
            return;
        }
    }
}
