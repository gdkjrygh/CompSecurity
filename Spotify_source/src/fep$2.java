// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.List;

final class ang.Object
    implements com.spotify.mobile.android.cosmos.player.v2..PlayCallback
{

    private feq a;

    public final void onPlayForbidden(List list)
    {
        if (a != null)
        {
            if (list.size() == 1 && "already_playing".equals(list.get(0)))
            {
                a.a();
            } else
            {
                a.b();
            }
        }
        TextUtils.join(",", list);
    }

    public final void onPlaySuccess()
    {
        if (a != null)
        {
            a.a();
        }
    }

    (feq feq1)
    {
        a = feq1;
        super();
    }
}
