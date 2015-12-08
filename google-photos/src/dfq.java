// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.accessibility.AccessibilityManager;

public final class dfq
{

    public static final String a = dfo.getName();
    private static dfp b;

    public static void a(Context context, olm olm1)
    {
        if (b == null)
        {
            b = new dfp();
        }
        olm1.a(dfo, new dfo((AccessibilityManager)context.getSystemService("accessibility")));
    }

}
