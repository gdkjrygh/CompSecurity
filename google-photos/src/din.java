// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

public final class din
{

    final Bundle a;
    final String b;
    private final boolean c;

    public din(boolean flag, String s, Bundle bundle)
    {
        c = flag;
        a = bundle;
        b = s;
    }

    public static din a(Bundle bundle)
    {
        return new din(true, null, bundle);
    }

    public final boolean a()
    {
        return !c;
    }
}
