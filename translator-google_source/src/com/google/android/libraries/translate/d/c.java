// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.d;

import android.content.Context;
import com.google.android.libraries.translate.e.d;
import java.io.IOException;
import java.io.InputStream;

public abstract class c
{

    public final String a;

    c(String s)
    {
        a = s;
    }

    public abstract InputStream a(Context context);

    public final String c(Context context)
    {
        try
        {
            context = d.a(a(context));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        return context;
    }
}
