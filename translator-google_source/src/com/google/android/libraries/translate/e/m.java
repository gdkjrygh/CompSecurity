// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.e;

import android.widget.Toast;
import com.google.android.libraries.translate.core.Singleton;

public final class m
{

    private static Toast a;

    public static Toast a(int i, int j)
    {
        return a(Toast.makeText(Singleton.a(), i, j));
    }

    private static Toast a(Toast toast)
    {
        if (a != null)
        {
            a.cancel();
        }
        a = toast;
        toast.show();
        return a;
    }

    public static Toast a(CharSequence charsequence, int i)
    {
        return a(Toast.makeText(Singleton.a(), charsequence, i));
    }
}
