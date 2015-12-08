// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.findfriends.model;

import android.text.TextUtils;
import cua;

// Referenced classes of package com.spotify.mobile.android.spotlets.findfriends.model:
//            FindFriendsModel, ResultModel

final class 
    implements cua
{

    public final boolean a(Object obj)
    {
        obj = (ResultModel)obj;
        return obj == null || TextUtils.isEmpty(((ResultModel) (obj)).getUri());
    }

    ()
    {
    }
}
