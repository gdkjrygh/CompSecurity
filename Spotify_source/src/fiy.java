// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.ui.fragments.logic.Flags;

public final class fiy
{

    public static boolean a(Flags flags)
    {
        return ((Boolean)flags.a(fys.x)).booleanValue();
    }

    public static boolean b(Flags flags)
    {
        return ((Boolean)flags.a(fys.x)).booleanValue() || ((Boolean)flags.a(fys.M)).booleanValue();
    }

    public static boolean c(Flags flags)
    {
        return ((Boolean)flags.a(fys.x)).booleanValue() && ((Boolean)flags.a(fys.A)).booleanValue() || ((Boolean)flags.a(fys.M)).booleanValue();
    }

    public static boolean d(Flags flags)
    {
        return ((Boolean)flags.a(fys.B)).booleanValue();
    }
}
