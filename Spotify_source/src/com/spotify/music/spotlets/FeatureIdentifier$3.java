// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music.spotlets;

import com.spotify.mobile.android.util.Assertion;

// Referenced classes of package com.spotify.music.spotlets:
//            FeatureIdentifier

final class nit> extends FeatureIdentifier
{

    public final String a()
    {
        Assertion.a("canary".equals("release"), "This can only be used from debug views");
        return super.a();
    }

    (String s, String s1)
    {
        super(s, 2, s1, (byte)0);
    }
}
