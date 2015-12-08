// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.List;

final class 
    implements com.spotify.mobile.android.cosmos.player.v2..PlayCallback
{

    public final void onPlayForbidden(List list)
    {
        TextUtils.join(",", list);
    }

    public final void onPlaySuccess()
    {
    }

    ()
    {
    }
}
