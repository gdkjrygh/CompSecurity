// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;

// Referenced classes of package com.google.android.gms.internal:
//            me

public class ie
{

    private final me Dh;
    private final Context mContext;

    private ie(Context context, me me)
    {
        mContext = context;
        Dh = me;
    }

    public static ie a(Context context, me me)
    {
        return new ie(context, me);
    }
}
