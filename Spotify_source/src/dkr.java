// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.common.base.Optional;

public abstract class dkr
{

    public dkr()
    {
    }

    public static dkr a(Context context)
    {
        return new dks(context);
    }

    public abstract Optional a(String s);

    public abstract void a(String s, String s1);
}
