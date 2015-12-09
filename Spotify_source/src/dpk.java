// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonNavigationLink;

public final class dpk
{

    public com.spotify.mobile.android.porcelain.subitem.PorcelainNavigationLink.Type a;
    public String b;
    private final String c;

    public dpk(String s)
    {
        a = com.spotify.mobile.android.porcelain.subitem.PorcelainNavigationLink.Type.b;
        c = (String)ctz.a(s);
    }

    public final PorcelainJsonNavigationLink a()
    {
        return new PorcelainJsonNavigationLink(a, c, b, null);
    }
}
