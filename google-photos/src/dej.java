// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;

public final class dej
{

    private static final String a = dej.getSimpleName();

    private dej()
    {
    }

    public static void a(dei dei1)
    {
        if (dei1 == null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        dei1.b();
        return;
        RuntimeException runtimeexception;
        runtimeexception;
        String s = a;
        dei1 = String.valueOf(dei1);
        Log.e(s, (new StringBuilder(String.valueOf(dei1).length() + 16)).append("Failed to stop: ").append(dei1).toString(), runtimeexception);
        return;
    }

}
