// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class fak
    implements faj
{

    private final int a;

    public fak(int i)
    {
        a = i;
    }

    public final String a(Context context)
    {
        if (a == 0)
        {
            return "";
        } else
        {
            return context.getString(a);
        }
    }
}
