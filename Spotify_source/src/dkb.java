// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.mobile.android.ui.fragments.logic.Flags;

public abstract class dkb
{

    public dkb()
    {
    }

    public static dkb a(Context context)
    {
        return new dkc(context);
    }

    public abstract boolean a();

    public abstract boolean a(Flags flags);
}
