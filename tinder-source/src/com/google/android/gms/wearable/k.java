// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.f;

// Referenced classes of package com.google.android.gms.wearable:
//            l

public interface k
{
    public static interface a
    {

        public abstract void onMessageReceived(l l);
    }

    public static interface b
        extends f
    {
    }


    public abstract d a(c c, a a1);

    public abstract d a(c c, String s, String s1);

    public abstract d b(c c, a a1);
}
