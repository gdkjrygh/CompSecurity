// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.base.Optional;
import com.spotify.mobile.android.ui.contextmenu.delegates.flags.CanRemoveTrack;

public final class fwz
{

    private fwv a;

    private fwz(fwv fwv1)
    {
        a = fwv1;
        super();
    }

    fwz(fwv fwv1, byte byte0)
    {
        this(fwv1);
    }

    public final fxa a(boolean flag, Integer integer)
    {
        fwv fwv1 = a;
        Object obj;
        if (flag)
        {
            obj = CanRemoveTrack.a;
        } else
        {
            obj = CanRemoveTrack.b;
        }
        fwv1.g = ((CanRemoveTrack) (obj));
        obj = a;
        if (integer == null)
        {
            integer = Optional.e();
        } else
        {
            integer = Optional.b(integer);
        }
        obj.m = integer;
        return new fxa(a, (byte)0);
    }
}
