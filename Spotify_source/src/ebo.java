// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem;
import com.spotify.mobile.android.spotlets.browse.model.NewRelease;
import com.spotify.mobile.android.spotlets.browse.model.Playable;

public final class ebo extends ebk
{

    public ebo(eay eay1, Context context, String s, fyx fyx)
    {
        super(eay1, fyx, context, s);
    }

    protected final MediaBrowserItem a(Object obj)
    {
        obj = (NewRelease)obj;
        ebh ebh1 = new ebh(eay.c(((Playable) (obj)).c));
        ebh1.b = ((NewRelease) (obj)).a;
        ebh1.c = ((NewRelease) (obj)).b;
        ebh1.d = d.a(dto.a(((NewRelease) (obj)).a()));
        ebh1.a = com.spotify.mobile.android.service.media.browser.MediaBrowserItem.ActionType.a;
        return ebh1.a();
    }

    protected final elg a(elb elb, String s)
    {
        return new ele(b, elb, e, c);
    }

    public final boolean a(String s)
    {
        return String.valueOf(a.i()).equals(s);
    }
}
