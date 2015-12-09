// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem;
import com.spotify.mobile.android.spotlets.browse.model.Playable;
import com.spotify.mobile.android.spotlets.browse.model.Playlist;

public final class ebm extends ebk
{

    public ebm(eay eay1, Context context, String s, fyx fyx)
    {
        super(eay1, fyx, context, s);
    }

    protected final MediaBrowserItem a(Object obj)
    {
        obj = (Playlist)obj;
        ebh ebh1 = new ebh(eay.b(((Playable) (obj)).c));
        ebh1.b = ((Playlist) (obj)).b;
        ebh1.d = d.a(dto.a(((Playlist) (obj)).a()));
        ebh1.a = com.spotify.mobile.android.service.media.browser.MediaBrowserItem.ActionType.a;
        return ebh1.a();
    }

    public final elg a(elb elb, String s)
    {
        return new elf(b, elb, e, s, s, c);
    }

    public final boolean a(String s)
    {
        if (String.valueOf(a.a("*")).equals(s))
        {
            return false;
        } else
        {
            return s.startsWith(String.valueOf(a.a("")));
        }
    }
}
