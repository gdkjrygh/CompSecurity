// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.eventshub.model;

import android.text.TextUtils;
import ctv;

// Referenced classes of package com.spotify.mobile.android.spotlets.eventshub.model:
//            Concert, Artist

final class 
    implements ctv
{

    public final Object a(Object obj)
    {
        obj = (Artist)obj;
        if (obj == null)
        {
            return "";
        }
        if (TextUtils.isEmpty(((Artist) (obj)).getName()))
        {
            return "";
        } else
        {
            return ((Artist) (obj)).getName();
        }
    }

    ()
    {
    }
}
