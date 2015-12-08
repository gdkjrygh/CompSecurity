// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.ui.contextmenu.delegates.flags.CanRemoveFromCollection;

public final class fwy
{

    private fwv a;

    private fwy(fwv fwv1)
    {
        a = fwv1;
        super();
    }

    fwy(fwv fwv1, byte byte0)
    {
        this(fwv1);
    }

    public final fwz a(boolean flag)
    {
        fwv fwv1 = a;
        CanRemoveFromCollection canremovefromcollection;
        if (flag)
        {
            canremovefromcollection = CanRemoveFromCollection.a;
        } else
        {
            canremovefromcollection = CanRemoveFromCollection.b;
        }
        fwv1.f = canremovefromcollection;
        return new fwz(a, (byte)0);
    }
}
