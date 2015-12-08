// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class afN
{

    public static boolean a(Context context)
    {
        if (afH.b == null)
        {
            afH.a(context);
            if (afH.b == null)
            {
                return false;
            }
        }
        return true;
    }
}
