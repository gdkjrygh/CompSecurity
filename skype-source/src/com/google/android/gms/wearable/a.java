// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.g;

// Referenced classes of package com.google.android.gms.wearable:
//            b

public interface com.google.android.gms.wearable.a
{
    public static interface a
    {

        public abstract void onCapabilityChanged(com.google.android.gms.wearable.b b1);
    }

    public static interface b
        extends g
    {

        public abstract com.google.android.gms.wearable.b a();
    }


    public abstract e a(c c, String s);
}
