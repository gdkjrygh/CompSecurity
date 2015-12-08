// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.eventshub.model;

import cua;

// Referenced classes of package com.spotify.mobile.android.spotlets.eventshub.model:
//            Concert, Artist

final class 
    implements cua
{

    public final boolean a(Object obj)
    {
        obj = (Artist)obj;
        return obj != null && ((Artist) (obj)).hasAffinity();
    }

    ()
    {
    }
}
