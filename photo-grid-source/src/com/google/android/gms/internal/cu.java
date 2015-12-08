// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.SharedPreferences;

// Referenced classes of package com.google.android.gms.internal:
//            cq

final class cu extends cq
{

    cu(String s, String s1)
    {
        super(s, s1, (byte)0);
    }

    public final Object a(SharedPreferences sharedpreferences)
    {
        return sharedpreferences.getString(a(), (String)b());
    }
}
