// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.util;

import com.fasterxml.jackson.databind.DeserializationFeature;
import dmz;
import gdz;
import gng;
import gni;

// Referenced classes of package com.spotify.mobile.android.util:
//            ClientEvent

final class Feature extends gdz
{

    protected final volatile Object a()
    {
        return ((gni)dmz.a(gni)).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
    }

    Feature()
    {
    }
}
