// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.util.viewuri.Verified;

public final class frf
{

    public final boolean a;
    public final int b;
    public final Verified c;
    public final com.spotify.mobile.android.util.viewuri.ViewUri.SubView d;

    private frf(boolean flag, int i, Verified verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview)
    {
        a = flag;
        b = i;
        c = verified;
        d = subview;
    }

    public frf(boolean flag, int i, Verified verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview, byte byte0)
    {
        this(flag, i, verified, subview);
    }
}
