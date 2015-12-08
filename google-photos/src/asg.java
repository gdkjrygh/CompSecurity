// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.AssetManager;

public final class asg
    implements ase, ato
{

    public asg()
    {
    }

    public final ann a(AssetManager assetmanager, String s)
    {
        return new aoc(assetmanager, s);
    }

    public final atm a(Context context, atu atu)
    {
        return new asd(context.getAssets(), this);
    }

    public final void a()
    {
    }
}
