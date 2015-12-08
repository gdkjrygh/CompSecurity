// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import java.util.ArrayList;

public final class ebw
    implements ebi
{

    private final Context a;
    private final eay b;

    public ebw(Context context)
    {
        a = context;
        b = new eay(a);
    }

    public final void a()
    {
    }

    public final void a(String s, ebg ebg1, Flags flags)
    {
        if (!a(s))
        {
            return;
        } else
        {
            s = new ArrayList();
            s.add(ebx.a(a, b));
            flags = a;
            ebh ebh1 = new ebh(b.f());
            ebh1.a = com.spotify.mobile.android.service.media.browser.MediaBrowserItem.ActionType.b;
            ebh1.b = flags.getString(0x7f080438);
            ebh1.d = eck.a(flags, 0x7f02022e);
            s.add(ebh1.a());
            flags = a;
            ebh1 = new ebh(b.g());
            ebh1.a = com.spotify.mobile.android.service.media.browser.MediaBrowserItem.ActionType.b;
            ebh1.d = eck.a(flags, 0x7f02022e);
            ebh1.b = flags.getString(0x7f080437);
            s.add(ebh1.a());
            ebg1.a(s);
            return;
        }
    }

    public final boolean a(String s)
    {
        return b.d().toString().equals(s);
    }
}
