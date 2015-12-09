// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem;
import com.spotify.mobile.android.spotlets.browse.model.Genre;
import java.util.ArrayList;

public final class ebn extends ebk
{

    public ebn(eay eay1, Context context, String s, fyx fyx)
    {
        super(eay1, fyx, context, s);
    }

    public static MediaBrowserItem a(Context context, eay eay1)
    {
        eay1 = new ebh(eay1.h());
        eay1.b = context.getString(0x7f080159);
        eay1.d = eck.a(context, 0x7f020229);
        eay1.a = com.spotify.mobile.android.service.media.browser.MediaBrowserItem.ActionType.b;
        return eay1.a();
    }

    protected final MediaBrowserItem a(Object obj)
    {
        obj = (Genre)obj;
        if (!((Genre) (obj)).b())
        {
            return null;
        } else
        {
            android.net.Uri uri = d.a(dto.a(((Genre) (obj)).c));
            ebh ebh1 = new ebh(a.a(((Genre) (obj)).a));
            ebh1.b = ((Genre) (obj)).a();
            ebh1.d = uri;
            ebh1.a = com.spotify.mobile.android.service.media.browser.MediaBrowserItem.ActionType.b;
            return ebh1.a();
        }
    }

    protected final elg a(elb elb, String s)
    {
        return new eld(b, elb, e, b.getResources(), c);
    }

    protected final void a(ArrayList arraylist)
    {
        Context context = b;
        ebh ebh1 = new ebh(a.i());
        ebh1.b = context.getString(0x7f08011d);
        ebh1.d = eck.a(context, 0x7f02022a);
        ebh1.a = com.spotify.mobile.android.service.media.browser.MediaBrowserItem.ActionType.b;
        arraylist.add(0, ebh1.a());
    }

    public final boolean a(String s)
    {
        return String.valueOf(a.h()).equals(s);
    }
}
