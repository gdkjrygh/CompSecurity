// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import android.content.Context;
import android.telephony.TelephonyManager;

public final class cr
{

    public static String a(Context context)
    {
        return ((TelephonyManager)context.getSystemService("phone")).getLine1Number();
    }
}
